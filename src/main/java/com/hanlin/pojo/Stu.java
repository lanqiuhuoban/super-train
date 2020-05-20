package com.hanlin.pojo;

public class Stu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sid
     *
     * @mbg.generated
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sname
     *
     * @mbg.generated
     */
    private String sname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.sex
     *
     * @mbg.generated
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.hobby
     *
     * @mbg.generated
     */
    private String hobby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.gid
     *
     * @mbg.generated
     */
    private Integer gid;
    
    private Integer status;
    
    
    public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	private Grade grade;
    

    public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sid
     *
     * @return the value of student.sid
     *
     * @mbg.generated
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sid
     *
     * @param sid the value for student.sid
     *
     * @mbg.generated
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sname
     *
     * @return the value of student.sname
     *
     * @mbg.generated
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sname
     *
     * @param sname the value for student.sname
     *
     * @mbg.generated
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.sex
     *
     * @return the value of student.sex
     *
     * @mbg.generated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.sex
     *
     * @param sex the value for student.sex
     *
     * @mbg.generated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.hobby
     *
     * @return the value of student.hobby
     *
     * @mbg.generated
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.hobby
     *
     * @param hobby the value for student.hobby
     *
     * @mbg.generated
     */
    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.gid
     *
     * @return the value of student.gid
     *
     * @mbg.generated
     */
    public Integer getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.gid
     *
     * @param gid the value for student.gid
     *
     * @mbg.generated
     */
    public void setGid(Integer gid) {
        this.gid = gid;
    }
}