package com.se.idome;

import java.util.*;

class LanguageStudent {
	private String languages = null;
	public List<String> listOflanguages = new ArrayList<>();

	public void addLanguage(String language) {
		listOflanguages.add(language);
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public List<String> getListOflanguages() {
		return listOflanguages;
	}

	public void setListOflanguages(List<String> listOflanguages) {
		this.listOflanguages = listOflanguages;
	}

}

class LanguageTeacher extends LanguageStudent {

	public static void main(String[] args) {
		LanguageTeacher teacher = new LanguageTeacher();
		teacher.addLanguage("English");

		LanguageStudent student = new LanguageStudent();
		teacher.teach(student, "English");
		teacher.teach(student, "Spanish");

		LanguageStudent student2 = new LanguageStudent();
		teacher.teach(student2, "Spanish");

		for (String language : student.getListOflanguages())
			System.out.println(language);
	}

	public boolean teach(LanguageStudent student, String language) {
		if (listOflanguages.contains(language)) {
			return true;
		} else {
			return false;
		}
	}

}