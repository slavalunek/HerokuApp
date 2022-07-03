package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTestSecond {
    @Test
    public void TestFileUpload() {
        fileUpload.open();
        fileUpload.fileDownload();
        Assert.assertEquals(fileUpload.getUploadedFile(), "TestFile", "wrong file");
    }
}
