/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioweb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carlo
 */
@WebService(serviceName = "miservicio")
public class miservicio {

    double resultado, hipotenusas, cateto,volumen,area,perimetro;
    
    @WebMethod(operationName = "Hipotenusa")
    public String Hipotenusa(@WebParam(name = "catetoA") double catetoA, @WebParam(name = "catetoB") double catetoB) {

        if (catetoA == catetoB) {
            return "El cateto B no puede medir  igual a el cateto A";
        } else {
            hipotenusas = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
            resultado = Math.sqrt(hipotenusas);
            return "La hipotenusa del triangulo mide: " + resultado;
        }

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CatetoA")
    public String CatetoA(@WebParam(name = "hipotenusa") double hipotenusa, @WebParam(name = "catetoB") double catetoB) {
        if (hipotenusa <= catetoB) {
            return "El cateto B no puede ser mayor o igual que la hipotenusa";
        } else {

            cateto = Math.pow(hipotenusa, 2) - Math.pow(catetoB, 2);
            resultado = Math.sqrt(cateto);
            return "La medida del cateto A es: " + resultado;
        }

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CatetoB")
    public String CatetoB(@WebParam(name = "hipotenusa") double hipotenusa, @WebParam(name = "catetoA") double catetoA) {

        if (hipotenusa <= catetoA) {
            return "El cateto A no puede ser mayor o igual que la hipotenusa";
        } else {
            cateto = Math.pow(hipotenusa, 2) - Math.pow(catetoA, 2);
            resultado = Math.sqrt(cateto);
            return "El cateto B mide: " + resultado;
        }

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "VolumenRectangulo")
    public String VolumenRectangulo(@WebParam(name = "largo") double largo, @WebParam(name = "ancho") double ancho, @WebParam(name = "alto") double alto) {
        area=ancho*largo;
        volumen=area*alto;
        return "El volumen del Prisma rectangular es: "+ volumen+" cm3";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "VolumenTriangulo")
    public String VolumenTriangulo(@WebParam(name = "base") double base, @WebParam(name = "altura") double altura, @WebParam(name = "alturacuerpo") double alturacuerpo) {
        area=base*altura/2;
        volumen=area*alturacuerpo;
        return "El volumen del Prisma triangular es: "+ volumen+" cm3";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "VolumenPentagono")
    public String VolumenPentagono(@WebParam(name = "lado") double lado, @WebParam(name = "apotema") double apotema, @WebParam(name = "altura") double altura) {
        perimetro=Math.pow(lado, 2);
        area=perimetro*apotema/2;
        volumen=area*altura;
       return "El volumen del Prisma Pentagonal es: "+ volumen+" cm3";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "VolumenCubo")
    public String VolumenCubo(@WebParam(name = "lado1") double lado1, @WebParam(name = "lado2") double lado2, @WebParam(name = "altura") double altura) {
        area=lado1*lado2;
        volumen=area*altura;
        
        return "El volumen del cubo es: "+ volumen+" cm3";
    }

}
