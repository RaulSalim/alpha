package br.com.rti.alpha.controle;

import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listgroup;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.ListitemRenderer;

import br.com.rti.alpha.modelo.ativo.Compartimento;

public class CompartimentoAtivoListGroupRenderer implements ListitemRenderer<Compartimento>
{
	private boolean ativo;
	
	public CompartimentoAtivoListGroupRenderer(boolean ativo)
	{
		this.ativo = ativo;
	}
	
	@Override
	public void render(Listitem listitem, Compartimento compartimento, int index)
			throws Exception {
		// TODO Auto-generated method stub
		listitem.setDisabled(this.ativo);
		if ( listitem instanceof Listgroup)
		{
			listitem.setLabel(compartimento.getTipoCompartimento().getDescricao());
		}
		else
		{
			listitem.appendChild(new Listcell(compartimento.getTag()));
		}
	}

}
