/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.epicontrol.Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Andre Bessa
 */
@Entity
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByCodigo", query = "SELECT f FROM Funcionario f WHERE f.codigo = :codigo"),
    @NamedQuery(name = "Funcionario.findByNome", query = "SELECT f FROM Funcionario f WHERE f.nome = :nome"),
    @NamedQuery(name = "Funcionario.findByCpf", query = "SELECT f FROM Funcionario f WHERE f.cpf = :cpf"),
    @NamedQuery(name = "Funcionario.findByMatricula", query = "SELECT f FROM Funcionario f WHERE f.matricula = :matricula"),
    @NamedQuery(name = "Funcionario.findByCrea", query = "SELECT f FROM Funcionario f WHERE f.crea = :crea"),
    @NamedQuery(name = "Funcionario.findByLoginAndPassword", query = "SELECT f FROM Funcionario f WHERE f.senha = :senha and f.login = :login"), 
    @NamedQuery(name = "Funcionario.findByLogin", query = "SELECT f FROM Funcionario f WHERE f.login = :login"),
    @NamedQuery(name = "Funcionario.findBySenha", query = "SELECT f FROM Funcionario f WHERE f.senha = :senha"),
    @NamedQuery(name = "Funcionario.findByTipoFuncionario", query = "SELECT f FROM Funcionario f WHERE f.tipoFuncionario = :tipoFuncionario")})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "CODIGO")
    private Integer codigo;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "MATRICULA")
    private Integer matricula;
    @Basic(optional = false)
    @Column(name = "CREA")
    private String crea;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "SENHA")
    private String senha;
    @Basic(optional = false)
    @Column(name = "TIPO_FUNCIONARIO")
    private int tipoFuncionario;

    public Funcionario() {
    }

    public Funcionario(Integer codigo) {
        this.codigo = codigo;
    }

    public Funcionario(Integer codigo, String nome, String cpf, String crea, int tipoFuncionario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.crea = crea;
        this.tipoFuncionario = tipoFuncionario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.epicontrol.Model.Funcionario[ codigo=" + codigo + " ]";
    }
    
}
