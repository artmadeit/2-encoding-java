package entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {
	private String nombre;
	private String marca;
	private Integer cantidad;
	
	public Producto() {
	}
}
