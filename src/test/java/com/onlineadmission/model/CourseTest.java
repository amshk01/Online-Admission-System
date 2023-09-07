package com.onlineadmission.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CourseTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Course}
     *   <li>{@link Course#setId(int)}
     *   <li>{@link Course#setMinimumQualification(String)}
     *   <li>{@link Course#setName(String)}
     *   <li>{@link Course#setSubjectCriteria(String)}
     *   <li>{@link Course#getId()}
     *   <li>{@link Course#getMinimumQualification()}
     *   <li>{@link Course#getName()}
     *   <li>{@link Course#getSubjectCriteria()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Course actualCourse = new Course();
        actualCourse.setId(1);
        actualCourse.setMinimumQualification("Minimum Qualification");
        actualCourse.setName("Name");
        actualCourse.setSubjectCriteria("Hello from the Dreaming Spires");
        assertEquals(1, actualCourse.getId());
        assertEquals("Minimum Qualification", actualCourse.getMinimumQualification());
        assertEquals("Name", actualCourse.getName());
        assertEquals("Hello from the Dreaming Spires", actualCourse.getSubjectCriteria());
    }
}

