package com.fontouradev.trabalho_pratico.model;

import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable{

  private String enrollment;
  private String name;
  private String course;

  public String getCourse() {
    return course;
  }
  public void setCourse(String course) {
    this.course = course;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEnrollment() {
    return enrollment;
  }
  public void setEnrollment(String enrollment) {
    this.enrollment = enrollment;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Aluno that = (Aluno) obj;
    return this.enrollment.equals(that.enrollment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.enrollment);
  }
}
