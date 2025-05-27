package com.faremco.app.Entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cliente")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcli;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String documento;
    private boolean activo;
    private LocalDateTime creado_en;

    public Client() {}

    public Client(String nombre, String apellido, String email, String telefono, String documento, boolean activo, LocalDateTime creado_en) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.documento = documento;
        this.activo = activo;
        this.creado_en = creado_en;
    }

    public long getId() { return idcli; }
    public void setId(long idcli) { this.idcli = idcli; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public LocalDateTime getCreado_en() { return creado_en; }
    public void setCreado_en(LocalDateTime creado_en) { this.creado_en = creado_en; }
}
