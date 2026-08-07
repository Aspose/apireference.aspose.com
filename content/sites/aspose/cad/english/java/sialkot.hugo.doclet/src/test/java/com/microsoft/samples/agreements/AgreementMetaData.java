package com.microsoft.samples.agreements;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * Represents the collection of worksheets of chart data workbook. <b>Bold</b>
 * </p><p><hr><blockquote><pre> Example:
 * <pre>
 * Presentation pres = new Presentation();
 * try {
 *     IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 400, 500);
 *     IChartDataWorkbook workbook =  chart.getChartData().getChartDataWorkbook();
 *     for (IChartDataWorksheet worksheet : workbook.getWorksheets())
 *     {
 *         String worksheetName = worksheet.getName();
 *     }
 * } finally {
 *     if (pres != null) pres.dispose();
 * }
 * </pre>
 * </pre></blockquote></hr></p>
 */
public class AgreementMetaData
{
    /**
     * Gets or sets the unique identifier of an agreement template.
     */
    @JsonProperty( "templateId" )
    private String templateId;

    public String getTemplateId()
    {
        return templateId;
    }

    public void setTemplateId( String value )
    {
        templateId = value;
    }

    /**
     * Gets or sets agreement type.
     */


    /**
     * Gets or sets URL to the agreement template.
     */
    @JsonProperty( "agreementLink" )
    private String agreementLink;

    public String getAgreementLink()
    {
        return agreementLink;
    }

    public void setAgreementLink( String value )
    {
        agreementLink = value;
    }

    /**
     * Gets or sets the version rank of an agreement template.
     */
    @JsonProperty( "versionRank" )
    private int versionRank;

    public int getVersionRank()
    {
        return versionRank;
    }

    public void setVersionRank( int value )
    {
        versionRank = value;
    }
}