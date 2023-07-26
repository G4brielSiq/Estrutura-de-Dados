package br.edu.ifba.basicas;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String descricao;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private List<Cliente> cliente;

	public Categoria(String descricao) {
		super();
		this.descricao = descricao;
	}

	public Categoria() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public void adiciona(Cliente cliente) {

		if (this.cliente == null) {

			List<Cliente> clientes = new ArrayList<Cliente>();

			this.setCliente(clientes);

			cliente.setCategoria(this);

		} else {

			this.cliente.add(cliente);
			cliente.setCategoria(this);
		}
	}
}