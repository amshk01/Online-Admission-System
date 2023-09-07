package com.onlineadmission.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentDocumentsTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link StudentDocuments}
     *   <li>{@link StudentDocuments#setDocument(String)}
     *   <li>{@link StudentDocuments#setId(int)}
     *   <li>{@link StudentDocuments#setIsApproved(String)}
     *   <li>{@link StudentDocuments#setIsDocumentUploaded(String)}
     *   <li>{@link StudentDocuments#setPercentage(long)}
     *   <li>{@link StudentDocuments#setStandard(String)}
     *   <li>{@link StudentDocuments#setStudentId(int)}
     *   <li>{@link StudentDocuments#setUploadedDate(String)}
     *   <li>{@link StudentDocuments#setYearOfPassing(int)}
     *   <li>{@link StudentDocuments#getDocument()}
     *   <li>{@link StudentDocuments#getId()}
     *   <li>{@link StudentDocuments#getIsApproved()}
     *   <li>{@link StudentDocuments#getIsDocumentUploaded()}
     *   <li>{@link StudentDocuments#getPercentage()}
     *   <li>{@link StudentDocuments#getStandard()}
     *   <li>{@link StudentDocuments#getStudentId()}
     *   <li>{@link StudentDocuments#getUploadedDate()}
     *   <li>{@link StudentDocuments#getYearOfPassing()}
     * </ul>
     */
    @Test
    void testConstructor() {
        StudentDocuments actualStudentDocuments = new StudentDocuments();
        actualStudentDocuments.setDocument("Document");
        actualStudentDocuments.setId(1);
        actualStudentDocuments.setIsApproved("Is Approved");
        actualStudentDocuments.setIsDocumentUploaded("Is Document Uploaded");
        actualStudentDocuments.setPercentage(1L);
        actualStudentDocuments.setStandard("Standard");
        actualStudentDocuments.setStudentId(1);
        actualStudentDocuments.setUploadedDate("2020-03-01");
        actualStudentDocuments.setYearOfPassing(1);
        assertEquals("Document", actualStudentDocuments.getDocument());
        assertEquals(1, actualStudentDocuments.getId());
        assertEquals("Is Approved", actualStudentDocuments.getIsApproved());
        assertEquals("Is Document Uploaded", actualStudentDocuments.getIsDocumentUploaded());
        assertEquals(1L, actualStudentDocuments.getPercentage());
        assertEquals("Standard", actualStudentDocuments.getStandard());
        assertEquals(1, actualStudentDocuments.getStudentId());
        assertEquals("2020-03-01", actualStudentDocuments.getUploadedDate());
        assertEquals(1, actualStudentDocuments.getYearOfPassing());
    }
}

