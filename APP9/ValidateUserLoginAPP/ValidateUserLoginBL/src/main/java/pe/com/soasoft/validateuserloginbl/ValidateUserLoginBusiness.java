
package pe.com.soasoft.validateuserloginbl;

public class ValidateUserLoginBusiness implements IValidateUserLoginBusiness{
    
    private String resultado = "";
    
    
    @Override
    public String validar(){
        resultado = "30";
        return resultado;
        
    }
    
    
}
