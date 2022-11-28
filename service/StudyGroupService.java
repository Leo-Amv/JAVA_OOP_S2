package service;

import data.Student;
import data.StudyGroup;
import data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    private final List<StudyGroup> studyGroupList;

    public StudyGroupService() {
        this.studyGroupList = new ArrayList<>();
    }

    public void createStudyGroup(List<Teacher> teacher, List<Student> studentList) {
        this.studyGroupList.add(new StudyGroup(teacher, studentList));
    }

    public List<StudyGroup> getStudyGroups() {
        return this.studyGroupList;
    }
}