/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaconstrucao;

/**
 *
 * @author alchemist
 */
public class InvalidPessoaException extends Exception {
    public InvalidPessoaException() {
        super("Cadastro inválido para Pessoa");
    }
}
