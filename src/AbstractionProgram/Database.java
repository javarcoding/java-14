package AbstractionProgram;

public class Database {

	public static void main(String[] args) {
		MyDatabase d = new MySql();

		d.commit();
		d.rollback();
		
		MyDatabase d1 = new Oracle();

		d1.commit();
		d1.rollback();

	}
}
