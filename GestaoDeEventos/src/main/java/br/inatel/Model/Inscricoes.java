package br.inatel.Model;

public class Inscricoes {
    int id_insricao;
    int Eventos_id_eventos;
    int Participantes_id_participante;
    date data_inscricao;
    int status;

    public Inscricoes(int id_insricao, int eventos_id_eventos, int participantes_id_participante, date data_inscricao, int status) {
        this.id_insricao = id_insricao;
        Eventos_id_eventos = eventos_id_eventos;
        Participantes_id_participante = participantes_id_participante;
        this.data_inscricao = data_inscricao;
        this.status = status;
    }

    public int getId_insricao() {
        return id_insricao;
    }

    public void setId_insricao(int id_insricao) {
        this.id_insricao = id_insricao;
    }

    public int getEventos_id_eventos() {
        return Eventos_id_eventos;
    }

    public void setEventos_id_eventos(int eventos_id_eventos) {
        Eventos_id_eventos = eventos_id_eventos;
    }

    public int getParticipantes_id_participante() {
        return Participantes_id_participante;
    }

    public void setParticipantes_id_participante(int participantes_id_participante) {
        Participantes_id_participante = participantes_id_participante;
    }

    public date getData_inscricao() {
        return data_inscricao;
    }

    public void setData_inscricao(date data_inscricao) {
        this.data_inscricao = data_inscricao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}