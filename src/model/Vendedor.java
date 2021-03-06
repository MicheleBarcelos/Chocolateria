/*The MIT License (MIT)

 Copyright (c) 2016 MicheleBarcelos

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in all
 copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 SOFTWARE.*/
package model;
// Generated 05/12/2015 18:26:36 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Vendedor generated by hbm2java
 */
public class Vendedor implements java.io.Serializable {

    private Integer codVen;
    private Usuario usuario;
    private String nome;
    private String endereco;
    private String telefone;
    private Set vendas = new HashSet(0);

    public Vendedor() {
    }

    public Vendedor(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Vendedor(Usuario usuario, String nome, String endereco, String telefone, Set vendas) {
        this.usuario = usuario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.vendas = vendas;
    }

    public Integer getCodVen() {
        return this.codVen;
    }

    public void setCodVen(Integer codVen) {
        this.codVen = codVen;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Set getVendas() {
        return this.vendas;
    }

    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }

}
