package com.jieyi.chapter20;

/**
 * Member
 *
 * @author wei.feng
 * @date 2020-1-1
 */
@DBTable(name = "MEMBER")
public class Member {

    /**
     * 如果程序的注解中定义了value的元素，可以用括号直接给出其值即可
     */
    @SQLString(30)
    String firstName;

    @SQLString(50)
    String lastName;

    @SQLInteger
    Integer age;

    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;

    static int memberCount;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getHandle() {
        return handle;
    }

    public String toString() {
        return handle;
    }
}
