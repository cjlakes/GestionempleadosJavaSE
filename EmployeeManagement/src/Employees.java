
import java.util.ArrayList;

/**
 * @author JuanLagos
 * @since 1.0
 */
public class Employees {

    private int id;
    private String name;
    private int salary;

    ArrayList<Employees> listEmployees= new ArrayList<>();

    public Employees(){

    }

    /**
     * Constructor para crear un nuevo empleado
     * @param id
     * @param name
     * @param salary
     */
    public Employees(int id, String name, int salary){

        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Metodo para imprimir la información del empleado
     * @return Una cadena con la informacion del empleado
     */
   public String viewEmployeed(){

       String mensaje = "El numero de identificación del empleado es: " + id + " Su nombre es: " + name + " Su salario es: " + salary;

       return mensaje;


   }

    /**
     * Metodo para adicionar un empleado
     * @param employee
     */
   public void addEmployeed(Employees employee){

        listEmployees.add(employee);

   }

    /**
     * Metodo que raliza la presentación del listado de los empleados
     */
   public void listEmployees(){

        for(Employees listEmployees: listEmployees){

            System.out.println(listEmployees.viewEmployeed());

        }

   }


    /**
     * Metodo que permite la eliminacion del empleado con el id
     * @param id
     */
   public void deleteEmployee(int id){

        for(int i = 0; i < listEmployees.size(); i++){
            if(listEmployees.get(i).getId() == id){

                listEmployees.remove(i);

                System.out.println("Se realizo la eliminación " + id);
            }
        }
   }

    /**
     * Metodo que realiza la busqueda del empleado por el id
     * @param id
     * @return retorna la información del empleado
     */
   public String searchEmployeed(int id ){
       for (Employees employee: listEmployees) {
           if(employee.getId() == id)

               return employee.viewEmployeed();
           
       }

       return null;
   }

    /**
     * Metodo que realiza el calculo de los salarios de todos los empleados registrados
     * @return retorna la sumatoria de los empleados registrados del salario total
     */
   public int caculateSalary(){

        int sumaSalary = 0;

        for(Employees employee : listEmployees){

            sumaSalary += employee.getSalary();

        }

       return sumaSalary;
   }

    /**
     * Metodo que establece la actualizacion del salario de un empleado registrado
     * @param id
     * @param salary
     */
   public void updateSalary(int id, int salary){
        for(Employees employee : listEmployees){
         if(employee.getId() == id){

             employee.setSalary(salary);
         }
        }
   }

}
