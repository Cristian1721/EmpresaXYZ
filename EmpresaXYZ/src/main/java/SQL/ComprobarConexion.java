package SQL;

public class ComprobarConexion {

    public static void main(String[] args) {
        
        ConexionBDD con = new ConexionBDD();
        
        if (con.getConnection()!=null) {
            System.out.print("Conexion Correcta");            
        } else {
            System.out.print("Conexion Incorrecta");            
        }
        
    }
    
}
