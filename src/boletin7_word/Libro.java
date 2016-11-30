
package boletin7_word;

public class Libro {
    private String titulo,autor;
    private int numLibro,numPrestados;
    
    public Libro(){ //contructor por defecto 
    }
    public Libro(String titulo,String autor,int numLibro,int numPrestados){  //contructor con parametros
        this.titulo=titulo;
        this.autor=autor;
        this.numLibro=numLibro;
        this.numPrestados=numPrestados;
    }
    //metodos setter
    public void setLibro(String titulo, String autor, int numLibro, int numPrestados){
        this.titulo=titulo;
        this.autor=autor;
        this.numPrestados=numPrestados;
        this.numLibro=numLibro;
    }
    //metodos getters
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumLibro(){
        return numLibro;
    }
    public int getNumPrestados(){
        return numPrestados;
    }
    
    
    public boolean prestamo(){// prestamos con el metodo boolean que permite saber si podemos dar en prestamo un libro en concreto
        if(numLibro==numPrestados){ // si el numero de libros ya prestados es igual al numero de libros que tenemos, entonces no podemos prestar mas libros
            System.out.println("ERROR, estamos aesperando una devolución.");
            return false;
        }else{
            numPrestados +=1; //si es menor podremos prestar mas libros.
            return true;
        } 
    }
    public boolean devolucion(){
        if(numPrestados<1){ //comprobamos que no haya libros que tengan prestamos
            System.out.println("ERROR, no se puede devolver tiene un prestamo.");
            return false;
        }else{
            numPrestados -=1;
            return true;
        }
            
    }
     public String toString(){//esto sirve para que te salga en el mensaje los datos de cuantos libros tenemos y cuantos podemos prestar
        String message = "Tenemos "+numLibro+" ejemplares de "+titulo+" del autor "+autor+" y podemos prestar "+numPrestados;
        return message;
    }
    }


    

