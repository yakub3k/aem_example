package com.yakub.core.servlets;

import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.apache.sling.testing.mock.sling.servlet.MockSlingHttpServletRequest;
import org.apache.sling.testing.mock.sling.servlet.MockSlingHttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(AemContextExtension.class)
class PathServletTest {

    @Test
    void doGet(AemContext context) throws Exception {
        MockSlingHttpServletRequest request = context.request();
        MockSlingHttpServletResponse response = context.response();
        PathServlet servlet = new PathServlet();

        servlet.doGet(request, response);

        assertEquals("doGet()", response.getOutputAsString());
    }
}