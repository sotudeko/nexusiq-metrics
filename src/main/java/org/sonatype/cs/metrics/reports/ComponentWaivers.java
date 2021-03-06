package org.sonatype.cs.metrics.reports;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.cs.metrics.service.MapToCsv;

import java.util.HashMap;

public class ComponentWaivers implements MapToCsv {
    private static final Logger log = LoggerFactory.getLogger(ComponentWaivers.class);

    @Override
    public String[] getLine(HashMap<String, Object> map) {

        String publicId = (String) map.get("publicId");

        String[] line = {publicId};

        log.info("pv-> " + publicId);

        return line;
    }
}
