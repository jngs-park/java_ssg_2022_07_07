package com.ll.exam;

public class Rq {
    String url;

    public Rq(String url) {
        this.url = url;
    }

    public int getIntParam(String paraName, int defaultValue) {
        String[] urlBits = url.split("\\?", 2);
        urlBits = urlBits[1].split("&");

        for(String urlBit : urlBits) {
            String[] paraNameAndValue = urlBit.split("=", 2);
            String paramName_ = paramNameAndValue[0];
            String paramValue = paramNameAndValue[1];

            if (paramName.equals(paramName_)) {
                return Integer.parseInt(paramValue);
            }
        }

        return defaultValue;
    }
}
        }
    }
}
