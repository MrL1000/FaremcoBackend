package com.faremco.app.Entity;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idusuario;
    @ManyToOne
    @JoinColumn(name = "idrol")
    private Rol idrol;

    private String usuario;
    private String password;
    private String nombre_completo;
    private boolean activo;
    private LocalDateTime creado_en;

    public Usuario() {}
    public Usuario(Rol idrol, String usuario, String password, String nombre_completo, boolean activo, LocalDateTime creado_en) {
        this.idrol = idrol;
        this.usuario = usuario;
        this.password = password;
        this.nombre_completo = nombre_completo;
        this.activo = activo;
        this.creado_en = creado_en;
    }
    public long getId() { return idusuario; }
    public void setId(long idusuario) { this.idusuario = idusuario; }

    public Rol getIdrol() { return idrol; }
    public void setIdrol(Rol idrol) { this.idrol = idrol; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getPasword() { return password; }
    public void setPasword(String password) { this.password = password; }

    public String getNombre_completo() { return nombre_completo; }
    public void setNombre_completo(String nombre_completo) { this.nombre_completo = nombre_completo; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
    
    public LocalDateTime getCreado_en() { return creado_en; }
    public void setCreado_en(LocalDateTime creado_en) { this.creado_en = creado_en;}
    
    
}
