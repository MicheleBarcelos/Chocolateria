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
 * Recheio generated by hbm2java
 */
public class Recheio implements java.io.Serializable {

    private Integer codRecheio;
    private String descricao;
    private Set produtos = new HashSet(0);

    public Recheio() {
    }

    public Recheio(String descricao, Set produtos) {
        this.descricao = descricao;
        this.produtos = produtos;
    }

    public Integer getCodRecheio() {
        return this.codRecheio;
    }

    public void setCodRecheio(Integer codRecheio) {
        this.codRecheio = codRecheio;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set getProdutos() {
        return this.produtos;
    }

    public void setProdutos(Set produtos) {
        this.produtos = produtos;
    }

}