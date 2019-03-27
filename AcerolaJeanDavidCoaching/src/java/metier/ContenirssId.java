package metier;
// Generated 27 mars 2019 12:04:47 by Hibernate Tools 4.3.1



/**
 * ContenirssId generated by hbm2java
 */
public class ContenirssId  implements java.io.Serializable {


     private int codeps;
     private int codess;
     private int numero;
     private int semainess;

    public ContenirssId() {
    }

    public ContenirssId(int codeps, int codess, int numero, int semainess) {
       this.codeps = codeps;
       this.codess = codess;
       this.numero = numero;
       this.semainess = semainess;
    }
   
    public int getCodeps() {
        return this.codeps;
    }
    
    public void setCodeps(int codeps) {
        this.codeps = codeps;
    }
    public int getCodess() {
        return this.codess;
    }
    
    public void setCodess(int codess) {
        this.codess = codess;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getSemainess() {
        return this.semainess;
    }
    
    public void setSemainess(int semainess) {
        this.semainess = semainess;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ContenirssId) ) return false;
		 ContenirssId castOther = ( ContenirssId ) other; 
         
		 return (this.getCodeps()==castOther.getCodeps())
 && (this.getCodess()==castOther.getCodess())
 && (this.getNumero()==castOther.getNumero())
 && (this.getSemainess()==castOther.getSemainess());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodeps();
         result = 37 * result + this.getCodess();
         result = 37 * result + this.getNumero();
         result = 37 * result + this.getSemainess();
         return result;
   }   


}


