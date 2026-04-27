package application.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDaoImpl implements ClienteDao{
	private Connection conexion;
	
	public ClientDaoImpl(Connection conexion) {
		this.conexion = conexion;
	}
	
	@Override
	public void guardarCliente(Client cliente) {
		// Preparamos la consultt para la base de datos
		String sql = "INSERT INTO clientes(name, age, idUser, CP, email, phone, password) VALUES(?,?,?,?,?,?,?)";
		
		try {
			//Cremaos la conexion y asignamos la consulta
			PreparedStatement ps = conexion.prepareStatement(sql);
			
			//Rellenamos con los datos del cliente
			ps.setString(1, cliente.getName());
			ps.setInt(2, cliente.getAge());
			ps.setInt(3, cliente.getIdUser());
			ps.setInt(4, cliente.getCP());
			ps.setString(5, cliente.getEmail());
			ps.setString(6, cliente.getPhone());
			ps.setString(7, cliente.getPassword());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error al guardar: " + e);
		}
	}
	
	
	@Override
	public void actualizarCliente(Client cliente) {
	    String sql = "UPDATE clientes SET name = ?, age = ?, CP = ?, email = ?, phone = ?, password = ? WHERE idUser = ?";
	    
	    try (PreparedStatement ps = conexion.prepareStatement(sql)) {
	        // Aquí es donde pasamos los datos del objeto 'cliente' al SQL
	        ps.setString(1, cliente.getName());
	        ps.setInt(2, cliente.getAge());
	        ps.setInt(3, cliente.getCP());
	        ps.setString(4,  cliente.getEmail());
	        ps.setString(5, cliente.getPhone());
	        ps.setString(6, cliente.getPassword());
	        ps.setInt(7, cliente.getIdUser());
	        
	        ps.executeUpdate();
	        
	    } catch (SQLException e) {
	        System.out.println("Error al actualizar: " + e);
	    }
	}
	
	@Override
	public void eliminarCliente(int idUSer) {
		String sql = "Delete FROM clientes WHERE idUser = ?";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(sql);
			
			ps.setInt(1,idUSer);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Ha ocurrido un error "+ e);
		}
	}
	
	@Override
	public Client buscarPorId(int idUSer) {
		String sql = "SELECT * FROM clientes WHERE idUser = ?";
		Client cliente = null;
		
		try {
			PreparedStatement ps = conexion.prepareStatement(sql);
			
			ps.setInt(1,idUSer);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				cliente = new Client();
				
				cliente.setidUser(rs.getInt("idUser"));
				cliente.setName(rs.getString("name"));
				cliente.setAge(rs.getInt("age"));
				cliente.setCP(rs.getInt("CP"));
				cliente.setEmail(rs.getString("email"));
				cliente.setPhone(rs.getString("phone"));
				cliente.setPassword(rs.getString("password"));
				
			}
			
		} catch (SQLException e) {
			System.out.println("Error al acceder a la base de datos " + e);
		}
		return cliente;
	}
}
