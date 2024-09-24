package com;

import java.util.Objects;

public class Producto implements Comparable <Producto> {  
    private int codigo;
    private String descripcion;
    private Double precio;
    private int stock;
    private String rubro; // comestible limpieza perfumeria 

    public Producto(int codigo, String descripcion, Double precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getRubro() {
        return rubro;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
    

    @Override
    public int compareTo(Producto o) {
        return Integer.valueOf(codigo).compareTo(o.codigo);
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", rubro=" + rubro + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }
}

