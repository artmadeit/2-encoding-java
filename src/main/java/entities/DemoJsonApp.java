package entities;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DemoJsonApp {
	public static void main(String[] args) throws IOException {
		Producto producto = new Producto("Zapatilla", "Nike", 20);
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(
				mapper.writeValueAsString(producto)		
		);
		
		
		Producto miProducto = mapper.readValue(new File("unproducto.json"), Producto.class);
		System.out.println(miProducto.getNombre() + "," + miProducto.getCantidad());
	}
}
