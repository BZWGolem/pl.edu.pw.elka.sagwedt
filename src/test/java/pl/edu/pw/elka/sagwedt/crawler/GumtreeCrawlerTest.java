package pl.edu.pw.elka.sagwedt.crawler;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class GumtreeCrawlerTest
{
    @Test
    public void testGetOfferListInt_connectionSuccess() throws Exception
    {
        final List<String> offers = new GumtreeCrawler().getOfferList(1);
        assertThat(offers).hasSize(1);
    }
}