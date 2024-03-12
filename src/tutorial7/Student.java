package tutorial7;

public class Student {
    private String name;
    private String ID;
    private Module[] modules;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
        modules = new Module[6];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void addModule(Module module) {
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                modules[i] = module;
                return; // Exit after adding the first available slot
            }
        }
        System.out.println("Maximum module capacity for student exceeding!");
    }

    public void showPass() {
        if (modules != null) { // Check for null before iterating
            for (Module module : modules) {
                if (module != null) { // Check for null module within the array
                    if (module.pass()) {
                        System.out.println(getName() + " will pass the module " + module.getModuleCode());
                    } else {
                        System.out.println(getName() + " will fail the module " + module.getModuleCode());
                    }
                }
            }
        }
    }
}
