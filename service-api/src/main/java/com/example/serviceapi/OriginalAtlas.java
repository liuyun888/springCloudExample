package com.example.serviceapi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.JSONArray;

import java.util.Date;

/**
 * @Author liuyunkai
 * @Date 2019/11/14 0014
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OriginalAtlas {
    private String contractCode;

    private String sampleNum;

    private String itemName;

    private String testType;
    private String sampleType;

    private String istd;

    private String rt;

    private String response;

    private String istdResponse;

    private String responsePercent;

    private String lastConcentration;

    private String expectConcentration;

    private String accuracy;
    private Long companyId;
    private Integer deleted;
    private Date ctime;
    private Date ltime;
    private String peakNum;

    private String keepTime;
    private String area;
    private String height;

    private String concentration;
    private String concentrationUnit;

    private String mark;
    private String recovery;
    private String methodLimit;

    private String limit;
    private String measureObject;

    private String abs;
    private String actualConcentration;
    private String dilutionMultiple;
    private String testDate;
    private String testTime;

    private String absorptionValue;

    private String bg;

    private String dilutionFactor;

    private String sampleConcentration;

    private String sampleConcentrationUnit;

    private String fluorescenceValue;
    private String concAndAbs;

    private String r;

    private String unit;

    private String average;

    private String aSampleCount;

    private String bSampleCount;

    private String aConcentration;

    private String bConcentration;

    private String checkFactor;

    private String peakArea;

    private String peakHeight;

    private String halfPeakHeight;

    private String k1;
    private String k0;
    private JSONArray sixData;

    private String blankConcentration;

    public OriginalAtlas(String itemName) {
        this.itemName = itemName;
    }

    public OriginalAtlas(String sampleNum, String itemName) {
        this.sampleNum = sampleNum;
        this.itemName = itemName;
    }
}
