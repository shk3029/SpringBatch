package me.js.springbatch.job;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@TestPropertySource(properties = "job.name=customerCopyJob")
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleJobConfigurationTest {

    @Autowired
    JobLauncherTestUtils jobLauncherTestUtils;
    @Test
    public void simpleJob() throws Exception {
        JobParametersBuilder builder = new JobParametersBuilder();
        builder.addString("mailHost", "gmail.com");
        JobExecution jobExecution = jobLauncherTestUtils.launchJob(builder.toJobParameters());
        System.out.println(jobExecution.getId());
        assertNotNull(jobExecution.getId());

    }

}
