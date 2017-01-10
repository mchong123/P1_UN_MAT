/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.soasoft.validateuserloginbl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author marco
 */
public class TestSpringMain {

    public static void main(String[] args) {

       BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        IValidateUserLoginBusiness iValidateUserLoginBusiness = (IValidateUserLoginBusiness) beanFactory.getBean("validarUserLogin");
        
        String resultado = iValidateUserLoginBusiness.validar();
        System.out.println("El resultado sera: " + resultado);
  /*ValidateUserLoginBusiness validateBl= new ValidateUserLoginBusiness();
        System.out.println(validateBl.validar());*/
  
    }
}
