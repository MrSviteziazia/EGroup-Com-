class EducationalGroupService {
    // Метод для создания учебной группы
    public EducationalGroup createEducationalGroup(Teacher teacher, List<Student> students) {
        return new EducationalGroup(teacher, students); // Создание новой учебной группы
    }
}