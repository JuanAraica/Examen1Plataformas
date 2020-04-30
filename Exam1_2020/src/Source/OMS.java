package Source;
import java.util.List;// para el List


public abstract class OMS {
	
	
	private  List<PruebaCovid19> resultadoList; 
    public OMS(List<PruebaCovid19> resultadoList) {
        this.setResultadoList(resultadoList);
    }
	
	public OMS() {
	
	}
	
	protected abstract  boolean  isGamHospital();
	
	
	 public abstract   Hospital  getNombreHospital();
	 
	 
	private   void  diagnosticar(){

		}
	 public final  void imprimirReporte(){

		}

	public List<PruebaCovid19> getResultadoList() {
		return resultadoList;
	}

	public void setResultadoList(List<PruebaCovid19> resultadoList) {
		this.resultadoList = resultadoList;
	}

}
