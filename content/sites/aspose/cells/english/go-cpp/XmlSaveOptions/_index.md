---
title: XmlSaveOptions Class 
linktitle: XmlSaveOptions
second_title: Aspose.Cells for Go via C++ API Reference
description: 'XmlSaveOptions class. Encapsulates the object that represents xmlsaveoptions in Go.'
type: docs
weight: 200
url: /go-cpp/xmlsaveoptions/
---

## XmlSaveOptions class

Represents the options of saving the workbook as an xml file.

```go

type XmlSaveOptions struct  {
	ptr unsafe.Pointer
}

```
## Constructors

| Method | Description |
| --- | --- |
|[NewXmlSaveOptions](./newxmlsaveoptions/) | Creates options for saving xml file. | 
|[NewXmlSaveOptions_SaveOptions](./newxmlsaveoptions_saveoptions/) | Constructs from a parent object. | 

## Methods

| Method | Description |
| --- | --- |
|[IsNull](./isnull/) | Checks whether the implementation object is nullptr. | 
|[GetSheetIndexes](./getsheetindexes/) | Represents the indexes of exported sheets. | 
|[SetSheetIndexes](./setsheetindexes/) | Represents the indexes of exported sheets. | 
|[GetExportArea](./getexportarea/) | Gets or sets the exporting range. | 
|[SetExportArea](./setexportarea/) | Gets or sets the exporting range. | 
|[GetHasHeaderRow](./gethasheaderrow/) | Indicates whether the range contains header row. | 
|[SetHasHeaderRow](./sethasheaderrow/) | Indicates whether the range contains header row. | 
|[GetXmlMapName](./getxmlmapname/) | Indicates whether exporting xml map in the file. | 
|[SetXmlMapName](./setxmlmapname/) | Indicates whether exporting xml map in the file. | 
|[GetSheetNameAsElementName](./getsheetnameaselementname/) | Indicates whether exporting sheet's name as the name of the element. | 
|[SetSheetNameAsElementName](./setsheetnameaselementname/) | Indicates whether exporting sheet's name as the name of the element. | 
|[GetDataAsAttribute](./getdataasattribute/) | Indicates whether exporting data as attributes of element. | 
|[SetDataAsAttribute](./setdataasattribute/) | Indicates whether exporting data as attributes of element. | 
|[GetSaveFormat](./getsaveformat/) | Gets the save file format. | 
|[GetClearData](./getcleardata/) | Make the workbook empty after saving the file. | 
|[SetClearData](./setcleardata/) | Make the workbook empty after saving the file. | 
|[GetCachedFileFolder](./getcachedfilefolder/) | The folder for temporary files that may be used as data cache. | 
|[SetCachedFileFolder](./setcachedfilefolder/) | The folder for temporary files that may be used as data cache. | 
|[GetValidateMergedAreas](./getvalidatemergedareas/) | Indicates whether validate merged cells before saving the file. | 
|[SetValidateMergedAreas](./setvalidatemergedareas/) | Indicates whether validate merged cells before saving the file. | 
|[GetMergeAreas](./getmergeareas/) | Indicates whether merge the areas of conditional formatting and validation before saving the file. | 
|[SetMergeAreas](./setmergeareas/) | Indicates whether merge the areas of conditional formatting and validation before saving the file. | 
|[GetCreateDirectory](./getcreatedirectory/) | If true and the directory does not exist, the directory will be automatically created before saving the file. | 
|[SetCreateDirectory](./setcreatedirectory/) | If true and the directory does not exist, the directory will be automatically created before saving the file. | 
|[GetSortNames](./getsortnames/) | Indicates whether sorting defined names before saving file. | 
|[SetSortNames](./setsortnames/) | Indicates whether sorting defined names before saving file. | 
|[GetSortExternalNames](./getsortexternalnames/) | Indicates whether sorting external defined names before saving file. | 
|[SetSortExternalNames](./setsortexternalnames/) | Indicates whether sorting external defined names before saving file. | 
|[GetRefreshChartCache](./getrefreshchartcache/) | Indicates whether refreshing chart cache data | 
|[SetRefreshChartCache](./setrefreshchartcache/) | Indicates whether refreshing chart cache data | 
|[GetCheckExcelRestriction](./getcheckexcelrestriction/) | Whether check restriction of excel file when user modify cells related objects.For example, excel does not allow inputting string value longer than 32K.When you input a value longer than 32K, it will be truncated. | 
|[SetCheckExcelRestriction](./setcheckexcelrestriction/) | Whether check restriction of excel file when user modify cells related objects.For example, excel does not allow inputting string value longer than 32K.When you input a value longer than 32K, it will be truncated. | 
|[GetUpdateSmartArt](./getupdatesmartart/) | Indicates whether updating smart art setting.The default value is false. | 
|[SetUpdateSmartArt](./setupdatesmartart/) | Indicates whether updating smart art setting.The default value is false. | 
|[GetEncryptDocumentProperties](./getencryptdocumentproperties/) | Indicates whether encrypt document properties when saving as .xls file.The default value is true. | 
|[SetEncryptDocumentProperties](./setencryptdocumentproperties/) | Indicates whether encrypt document properties when saving as .xls file.The default value is true. | 
