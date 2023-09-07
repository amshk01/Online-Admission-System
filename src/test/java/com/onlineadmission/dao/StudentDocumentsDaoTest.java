package com.onlineadmission.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.onlineadmission.model.StudentDocuments;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {StudentDocumentsDao.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.onlineadmission.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class StudentDocumentsDaoTest {
    @Autowired
    private StudentDocumentsDao studentDocumentsDao;

    /**
     * Method under test: {@link StudentDocumentsDao#findByStudentId(int)}
     */
    @Test
    void testFindByStudentId() {
        StudentDocuments studentDocuments = new StudentDocuments();
        studentDocuments.setDocument("Document");
        studentDocuments.setIsApproved("Is Approved");
        studentDocuments.setIsDocumentUploaded("Is Document Uploaded");
        studentDocuments.setPercentage(1L);
        studentDocuments.setStandard("Standard");
        studentDocuments.setStudentId(1);
        studentDocuments.setUploadedDate("2020-03-01");
        studentDocuments.setYearOfPassing(1);

        StudentDocuments studentDocuments2 = new StudentDocuments();
        studentDocuments2.setDocument("42");
        studentDocuments2.setIsApproved("42");
        studentDocuments2.setIsDocumentUploaded("42");
        studentDocuments2.setPercentage(-1L);
        studentDocuments2.setStandard("42");
        studentDocuments2.setStudentId(2);
        studentDocuments2.setUploadedDate("2020/03/01");
        studentDocuments2.setYearOfPassing(-1);
        studentDocumentsDao.save(studentDocuments);
        studentDocumentsDao.save(studentDocuments2);
        assertEquals(1, studentDocumentsDao.findByStudentId(1).size());
    }

    /**
     * Method under test: {@link StudentDocumentsDao#findByStandardAndStudentId(String, int)}
     */
    @Test
    void testFindByStandardAndStudentId() {
        StudentDocuments studentDocuments = new StudentDocuments();
        studentDocuments.setDocument("Document");
        studentDocuments.setIsApproved("Is Approved");
        studentDocuments.setIsDocumentUploaded("Is Document Uploaded");
        studentDocuments.setPercentage(1L);
        studentDocuments.setStandard("Standard");
        studentDocuments.setStudentId(1);
        studentDocuments.setUploadedDate("2020-03-01");
        studentDocuments.setYearOfPassing(1);

        StudentDocuments studentDocuments2 = new StudentDocuments();
        studentDocuments2.setDocument("42");
        studentDocuments2.setIsApproved("42");
        studentDocuments2.setIsDocumentUploaded("42");
        studentDocuments2.setPercentage(-1L);
        studentDocuments2.setStandard("42");
        studentDocuments2.setStudentId(2);
        studentDocuments2.setUploadedDate("2020/03/01");
        studentDocuments2.setYearOfPassing(-1);
        studentDocumentsDao.save(studentDocuments);
        studentDocumentsDao.save(studentDocuments2);
        assertSame(studentDocuments, studentDocumentsDao.findByStandardAndStudentId("Standard", 1));
    }
}

