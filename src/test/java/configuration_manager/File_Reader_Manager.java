package configuration_manager;

public class File_Reader_Manager {

	public File_Reader_Manager() {
	}

	public static File_Reader_Manager get_Instance() {
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;
	}

	public Configuration_Reader get_InstanceCR() throws Throwable {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;

	}

}
