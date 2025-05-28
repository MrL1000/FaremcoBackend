package com.faremco.app.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idres;

    @ManyToOne
    @JoinColumn(name = "idcli")
    private Client idcli;

    @ManyToOne
    @JoinColumn(name = "idusuario", nullable = false)
    private Usuario idusuario;

    private String estado;
    private LocalDateTime creadoEn;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;

    public Reserva() {}

    public Reserva(Client idcli, Usuario idusuario, String estado, LocalDateTime creadoEn, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        this.idcli = idcli;
        this.idusuario = idusuario;
        this.estado = estado;
        this.creadoEn = creadoEn;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Long getId() { return idres; }
    public void setId(Long idres) { this.idres = idres; }

    public Client getCliente() { return idcli; }
    public void setCliente(Client cliente) { this.idcli = cliente; }

    public Usuario getCreadoPor() { return idusuario; }
    public void setCreadoPor(Usuario idusuario) { this.idusuario = idusuario; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public LocalDateTime getCreadoEn() { return creadoEn; }
    public void setCreadoEn(LocalDateTime creadoEn) { this.creadoEn = creadoEn; }

    public LocalDateTime getFechaEntrada() { return fechaEntrada; }
    public void setFechaEntrada(LocalDateTime fechaEntrada) { this.fechaEntrada = fechaEntrada; }

    public LocalDateTime getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(LocalDateTime fechaSalida) { this.fechaSalida = fechaSalida; }

}