package br.com.agenda.model;

import java.util.Date;

public class ListaTarefas {

	private Long id;
	private String descricao;
	private Date dataCadastro;
	private int statusTarefa;
	private Date dataExecucao;
	private Date dataConclusao;
	private Local local;
	private Usuario usuario;

	public ListaTarefas(Long id, String descricao, Date dataCadastro, int statusTarefa, Date dataExecucao,
			Date dataConclusao, Local local, Usuario usuario) {

		this.id = id;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.statusTarefa = statusTarefa;
		this.dataExecucao = dataExecucao;
		this.dataConclusao = dataConclusao;
		this.local = local;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public int getStatusTarefa() {
		return statusTarefa;
	}

	public void setStatusTarefa(int statusTarefa) {
		this.statusTarefa = statusTarefa;
	}

	public Date getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(Date dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public Date getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "ListaTarefas [id=" + id + ", descricao=" + descricao + ", dataCadastro=" + dataCadastro
				+ ", statusTarefa=" + statusTarefa + ", dataExecucao=" + dataExecucao + ", dataConclusao="
				+ dataConclusao + ", local=" + local + ", usuario=" + usuario + "]";
	}

}
