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

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Produto generated by hbm2java
 */
public class Produto implements java.io.Serializable {

    private Integer codProd;
    private Recheio recheio;
    private String descricao;
    private BigDecimal preco;
    private String peso;
    private Set items = new HashSet(0);

    public Produto() {
    }

    public Produto(Recheio recheio, String descricao, BigDecimal preco) {
        this.recheio = recheio;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(Recheio recheio, String descricao, BigDecimal preco, String peso, Set items) {
        this.recheio = recheio;
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
        this.items = items;
    }

    public Integer getCodProd() {
        return this.codProd;
    }

    public void setCodProd(Integer codProd) {
        this.codProd = codProd;
    }

    public Recheio getRecheio() {
        return this.recheio;
    }

    public void setRecheio(Recheio recheio) {
        this.recheio = recheio;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return this.preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getPeso() {
        return this.peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Set getItems() {
        return this.items;
    }

    public void setItems(Set items) {
        this.items = items;
    }

}