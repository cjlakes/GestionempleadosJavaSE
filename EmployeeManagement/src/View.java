import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author JuanLagos
 * @since 1.0
 */
public class View {

    /**
     * Metodo para realizar la presentacion de la aplicación por consola
     */
    public void display(){


        int opcion = 0;

        int id;

        int salary;

        System.out.println("========================================================");
        System.out.println("==================Gestion de empleados==================");
        System.out.println("========================================================");

        Employees employee= new Employees();

        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("====Ingresa la información del empleado:=================");
            System.out.println("====1: Desea ingresar un empleado  2: eliminar empleado existente 3: Buscar empleado 4: Mostrar salarios 5: Actualizar salario 6: Listar empleados 0: Salir");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("====Número de identificación:=================");

                    while(!sc.hasNextInt()){

                        System.out.print("Por favor, ingresa un valor numérico válido: ");
                        sc.next();
                    }

                    id = sc.nextInt();

                    System.out.println("====Nombre empleado:=================");

                    String name = sc.next();

                    System.out.println("====Ingresa el salario:=================");

                    while(!sc.hasNextInt()){
                        System.out.print("Por favor, ingresa un valor numérico válido: ");
                        sc.next();
                    }

                    salary = sc.nextInt();

                    employee.setId(id);

                    employee.setName(name);

                    employee.setSalary(salary);

                    employee.addEmployeed(new Employees(id, name, salary));

                    employee.viewEmployeed();

                    break;
                case 2:

                    ArrayList<Employees> listEmployees = new ArrayList<>();

                    System.out.println("====Cúal empleado deseas eliminar:=================");

                    id = sc.nextInt();

                    employee.deleteEmployee(id);

                    break;

                case 3:
                    System.out.println("====Cúal empleado deseas busar:=================");

                    id = sc.nextInt();

                    System.out.println(employee.searchEmployeed(id));

                    break;

                case 4:

                    System.out.println(employee.caculateSalary());

                    break;

                case 5:
                    System.out.println("Actualizar salario ingresa en id: ");

                    id = sc.nextInt();

                    System.out.println("Ingresa nuevo salario : ");

                    salary = sc.nextInt();

                    employee.updateSalary(id,salary);

                    break;

                case 6:

                    System.out.println("====Listar Los empleados=================");

                    employee.listEmployees();

                    /*
            if(opcion == 1) {

                System.out.println("====Número de identificación:=================");

                id = sc.nextInt();

                System.out.println("====Nombre empleado:=================");

                String name = sc.next();

                System.out.println("====Ingresa el salario:=================");

                salary = sc.nextInt();

                employee.setId(id);

                employee.setName(name);

                employee.setSalary(salary);

                employee.addEmployeed(new Employees(id, name, salary));

                employee.viewEmployeed();

            }

            System.out.println("====Deseas ingresar otro usuaro 1: Si 0: No 2: eliminar empleado existente 3: Buscar empleado 4: Mostrar salarios 5: Actualizar salario 6: Listar empleados=================");

            opcion = sc.nextInt();

            if(opcion == 2 ){

                ArrayList<Employees> listEmployees = new ArrayList<>();

                System.out.println("====Cúal empleado deseas eliminar:=================");

                id = sc.nextInt();

                employee.deleteEmployee(id);

            }


            if (opcion == 3){

                System.out.println("====Cúal empleado deseas busar:=================");

                id = sc.nextInt();

                System.out.println(employee.searchEmployeed(id));

            }

            if(opcion == 4){

                System.out.println(employee.caculateSalary());

            }

            if(opcion == 5){

                System.out.println("Actualizar salario ingresa en id: ");

                id = sc.nextInt();

                System.out.println("Ingresa nuevo salario : ");

                salary = sc.nextInt();

                employee.updateSalary(id,salary);


            }

            if(opcion == 6){

                System.out.println("====Listar Los empleados=================");

                employee.listEmployees();

            }*/



            }
        }while(opcion !=0);


    }
}
