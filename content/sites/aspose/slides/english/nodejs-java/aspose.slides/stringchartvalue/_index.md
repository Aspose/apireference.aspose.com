---
title: StringChartValue
second_title: Aspose.Sildes for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.slides/stringchartvalue/
---

## StringChartValue class

 Represent string value which can be stored in pptx presentation document in two ways:
 1) in cell/cells of workbook related to chart;
 2) as literal value.
 

## Functions

| Name | Description |
| --- | --- |
| [getAsCells](getascells)() | Null value assigning is not allowed. Returning value always is not null. Read/write IChartCellCollection. |
| [getAsLiteralString](getasliteralstring)() | Returns or sets value as literal string. Read/write String. |
| [getCellsAddressInWorkbook](getcellsaddressinworkbook)() | If DataSourceType property is DataSourceType.Worksheet then this function returns address of the cells in workbook which represent the string data. Otherwise return empty string. |
| [getData](getdata)() | Returns or sets Data object. Read/write Object. |
| [setAsCells](setascells)([ChartCellCollection](../chartcellcollection)) | Null value assigning is not allowed. Returning value always is not null. Read/write IChartCellCollection. |
| [setAsLiteralString](setasliteralstring)(String) | Returns or sets value as literal string. Read/write String. |
| [setData](setdata)(Object) | Returns or sets Data object. Read/write Object. |
| [setFromOneCell](setfromonecell)([ChartDataCell](../chartdatacell)) | Sets value from specified cell. |
| [toString](tostring)() | Returns string value data. Return null if DataSourceType is false and no string value was assigned. |
