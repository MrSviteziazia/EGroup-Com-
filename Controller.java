class Controller {
    private EducationalGroupService groupService;

    // Конструктор класса Controller
    public Controller(EducationalGroupService groupService) {
        this.groupService = groupService; // Инициализация сервиса групп
    }
    
    // Метод для формирования учебной группы
    public EducationalGroup formEducationalGroup(Teacher teacher, List<Student> students) {
        return groupService.createEducationalGroup(teacher, students); // Вызов метода создания группы в сервисе
    }
}
