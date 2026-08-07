---
title: AgreementMetaData
second_title: Aspose.Sildes for Java API Reference
description: Represents the collection of worksheets of chart data workbook.
type: docs
weight: 11
url: /java/com.microsoft.samples.agreements/agreementmetadata/
---
**Inheritance:**
java.lang.Object
```
public class AgreementMetaData
```

Represents the collection of worksheets of chart data workbook. **Bold**

--------------------

> ```
> Example:
>  
>  Presentation pres = new Presentation();
>  try {
>      IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.Pie, 50, 50, 400, 500);
>      IChartDataWorkbook workbook =  chart.getChartData().getChartDataWorkbook();
>      for (IChartDataWorksheet worksheet : workbook.getWorksheets())
>      {
>          String worksheetName = worksheet.getName();
>      }
>  } finally {
>      if (pres != null) pres.dispose();
>  }
> ```
## Constructors

| Constructor | Description |
| --- | --- |
| [AgreementMetaData()](#AgreementMetaData--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getTemplateId()](#getTemplateId--) |  |
| [setTemplateId(String value)](#setTemplateId-java.lang.String-) |  |
| [getAgreementLink()](#getAgreementLink--) |  |
| [setAgreementLink(String value)](#setAgreementLink-java.lang.String-) |  |
| [getVersionRank()](#getVersionRank--) |  |
| [setVersionRank(int value)](#setVersionRank-int-) |  |
### AgreementMetaData() {#AgreementMetaData--}
```
public AgreementMetaData()
```


### getTemplateId() {#getTemplateId--}
```
public String getTemplateId()
```




**Returns:**
java.lang.String
### setTemplateId(String value) {#setTemplateId-java.lang.String-}
```
public void setTemplateId(String value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String |  |

### getAgreementLink() {#getAgreementLink--}
```
public String getAgreementLink()
```




**Returns:**
java.lang.String
### setAgreementLink(String value) {#setAgreementLink-java.lang.String-}
```
public void setAgreementLink(String value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String |  |

### getVersionRank() {#getVersionRank--}
```
public int getVersionRank()
```




**Returns:**
int
### setVersionRank(int value) {#setVersionRank-int-}
```
public void setVersionRank(int value)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int |  |

