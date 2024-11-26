package br.inatel.Model;


import br.inatel.DAO.OrganizadoresDAO;

import java.util.ArrayList;
import java.util.List;

public class Eventos {
    private int id_eventos;
    private String nome;
    private String data;
    private String local;
    private int capacidade;
    private int ingressos_disponiveis;
    private int ingressos_vendidos;
    private int Organizadores_id_organizador;

    public Eventos() {

    }
    public Eventos(int id_eventos, String nome, String data, String local, int capacidade, int ingressos_disponiveis, int organizadores_id_organizador) {
        this.id_eventos = id_eventos;
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
        this.ingressos_disponiveis = ingressos_disponiveis;
        this.ingressos_vendidos = capacidade - ingressos_disponiveis;
        Organizadores_id_organizador = organizadores_id_organizador;
    }

    public int getId_evento() {
        return id_eventos;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getIngressos_disponiveis() {
        return ingressos_disponiveis;
    }

    public int getIngressos_vendidos() {
        return ingressos_vendidos;
    }

    public int getOrganizadores_id_organizador() {
        return Organizadores_id_organizador;
    }

    public void setId_eventos(int id_eventos) {
        this.id_eventos = id_eventos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setIngressos_disponiveis(int ingressos_disponiveis) {
        this.ingressos_disponiveis = ingressos_disponiveis;
    }

    public void setIngressos_vendidos(int ingressos_vendidos) {
        this.ingressos_vendidos = ingressos_vendidos;
    }

    public void setOrganizadores_id_organizador(int organizadores_id_organizador) {
        Organizadores_id_organizador = organizadores_id_organizador;
    }
}
