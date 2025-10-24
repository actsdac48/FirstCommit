package serialization;

import java.util.Objects;

@Serialization(information = "This is data class serialization")
public class Data {

	private int iPrivate;
	private int iProtected;
	public String iPublic;
	
	@Override
	public int hashCode() {
		return Objects.hash(iPrivate, iProtected, iPublic);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		Data dt = (Data) obj;
		return iPrivate == dt.iPrivate && iProtected == dt.iProtected && Objects.equals(iPublic, dt.iPublic);
	}
	
	public Data() {
		System.out.println("Default constructor of Data");
	}


	@Override
	public String toString() {
		return "Data [iPrivate=" + iPrivate + ", iProtected=" + iProtected + ", iPublic=" + iPublic + "]";
	}


	public void setiPrivate(int iPrivate) {
		this.iPrivate = iPrivate;
	}

	public void setiProtected(int iProtected) {
		this.iProtected = iProtected;
	}

	@Serialization(information = "", version = 1)
	public void setiPublic(String iPublic) {
		this.iPublic = iPublic;
	}
	
	public int getiPrivate() {
		return iPrivate;
	}

	public int getiProtected() {
		return iProtected;
	}

	public String getiPublic() {
		return iPublic;
	}

	
	
	
	
}
