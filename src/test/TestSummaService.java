package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;


import com.company.findMax;
import com.company.getSumma;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;


public class TestSummaService {
    public getSumma summa;

    @Before
    public void Initialazation(){
        summa = new getSumma(765743285);
    }

    @Test
    public void testImpovization(){
        summa.imporovization();
    }

    @Test
    public void testImpovizationBigInt(){
        summa.imporovizationBigInt();
    }


    @Test
    public void testNormal(){
        summa.normal();
    }

    @Test
    public void testNormalBigInt(){
        summa.normalBigInt();
    }
}
