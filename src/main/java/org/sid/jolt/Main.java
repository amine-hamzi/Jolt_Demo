package org.sid.jolt;

import java.util.List;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;

    public class Main {
        public static void main(String[] args) {
            List specJSON = JsonUtils.classpathToList(
                    "/spec.json");
            Chainr chainr = Chainr.fromSpec(specJSON);

            Object inputJSON = JsonUtils.classpathToObject(
                    "/input.json");

            Object transformedOutput = chainr.transform(inputJSON);
            System.out.println(
                    JsonUtils.toPrettyJsonString(transformedOutput));
        }

    }
