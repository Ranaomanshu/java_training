public class MainClass {
    public static void main(String[] args) {
        GeneralMem gm = new GeneralMem();

        VviMem vm = new VviMem();

        gm.OnlyView();

        vm.OrganizeAndView();
        vm.OnlyView();
    }
}
