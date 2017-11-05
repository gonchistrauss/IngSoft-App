package dominio;

import java.util.Date;

public class Incidencia {

    private String mensaje;
    private Date fechaDeCreacion;
    private Consulta consulta;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public Incidencia(String mensaje, Date fecha, Consulta unaConsulta) {
        this.setConsulta(unaConsulta);
        this.setMensaje(mensaje);
        this.setFechaDeCreacion(fecha);
    }
}
