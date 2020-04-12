package test;

import com.company.findMax;
import org.junit.Before;
import org.junit.Test;

public class TestSearchService {
    public findMax search;

    @Before
    public void Initialazation(){
        //int [] data = {1,2,5,6,4,324,6,456,45,7,45,4,6745,345,6564,4343,64,34,5,654,233,6,4,3,2,6,4,77867,456,865439,87,6,8799};
        search = new findMax(100);
    }

    @Test
    public void testPiramidAlgorithm(){
        int [] res  = search.search(3);
    }

    @Test
    public void testBruteAlgorithm(){
        int [] res  = search.bruteForce(3);
    }

}
