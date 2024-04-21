class EducationalGroup {
    private Teacher teacher;
    private List<Student> students;
    
    // Конструктор класса EducationalGroup для инициализации преподавателя и списка студентов
    public EducationalGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }
    
}