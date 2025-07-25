---
title: PaginatedSaveOptions Class 
linktitle: PaginatedSaveOptions
second_title: Aspose.Cells for Go via C++ API Reference
description: 'PaginatedSaveOptions class. Encapsulates the object that represents paginatedsaveoptions in Go.'
type: docs
weight: 200
url: /go-cpp/paginatedsaveoptions/
---

## PaginatedSaveOptions class

Represents the options for pagination.

```go

type PaginatedSaveOptions struct  {
	ptr unsafe.Pointer
}

```
## Constructors

| Method | Description |
| --- | --- |
|[NewPaginatedSaveOptions](./newpaginatedsaveoptions/) | Constructs from a parent object. | 

## Methods

| Method | Description |
| --- | --- |
|[IsNull](./isnull/) | Checks whether the implementation object is nullptr. | 
|[GetDefaultFont](./getdefaultfont/) | When characters in the Excel are Unicode and not be set with correct font in cell style,They may appear as block in pdf,image.Set the DefaultFont such as MingLiu or MS Gothic to show these characters.If this property is not set, Aspose.Cells will use system default font to show these unicode characters. | 
|[SetDefaultFont](./setdefaultfont/) | When characters in the Excel are Unicode and not be set with correct font in cell style,They may appear as block in pdf,image.Set the DefaultFont such as MingLiu or MS Gothic to show these characters.If this property is not set, Aspose.Cells will use system default font to show these unicode characters. | 
|[GetCheckWorkbookDefaultFont](./getcheckworkbookdefaultfont/) | When characters in the Excel are Unicode and not be set with correct font in cell style,They may appear as block in pdf,image.Set this to true to try to use workbook's default font to show these characters first. | 
|[SetCheckWorkbookDefaultFont](./setcheckworkbookdefaultfont/) | When characters in the Excel are Unicode and not be set with correct font in cell style,They may appear as block in pdf,image.Set this to true to try to use workbook's default font to show these characters first. | 
|[SetCheckFontCompatibility](./setcheckfontcompatibility/) | Indicates whether to check font compatibility for every character in text. | 
|[GetCheckFontCompatibility](./getcheckfontcompatibility/) | Indicates whether to check font compatibility for every character in text. | 
|[SetIsFontSubstitutionCharGranularity](./setisfontsubstitutionchargranularity/) | Indicates whether to only substitute the font of character when the cell font is not compatibility for it. | 
|[IsFontSubstitutionCharGranularity](./isfontsubstitutionchargranularity/) | Indicates whether to only substitute the font of character when the cell font is not compatibility for it. | 
|[GetOnePagePerSheet](./getonepagepersheet/) | If OnePagePerSheet is true , all content of one sheet will output to only one page in result.The paper size of pagesetup will be invalid, and the other settings of pagesetupwill still take effect. | 
|[SetOnePagePerSheet](./setonepagepersheet/) | If OnePagePerSheet is true , all content of one sheet will output to only one page in result.The paper size of pagesetup will be invalid, and the other settings of pagesetupwill still take effect. | 
|[GetAllColumnsInOnePagePerSheet](./getallcolumnsinonepagepersheet/) | If AllColumnsInOnePagePerSheet is true , all column content of one sheet will output to only one page in result.The width of paper size of pagesetup will be ignored, and the other settings of pagesetupwill still take effect. | 
|[SetAllColumnsInOnePagePerSheet](./setallcolumnsinonepagepersheet/) | If AllColumnsInOnePagePerSheet is true , all column content of one sheet will output to only one page in result.The width of paper size of pagesetup will be ignored, and the other settings of pagesetupwill still take effect. | 
|[GetIgnoreError](./getignoreerror/) | Indicates if you need to hide the error while rendering.The error can be error in shape, image, chart rendering, etc. | 
|[SetIgnoreError](./setignoreerror/) | Indicates if you need to hide the error while rendering.The error can be error in shape, image, chart rendering, etc. | 
|[GetOutputBlankPageWhenNothingToPrint](./getoutputblankpagewhennothingtoprint/) | Indicates whether to output a blank page when there is nothing to print. | 
|[SetOutputBlankPageWhenNothingToPrint](./setoutputblankpagewhennothingtoprint/) | Indicates whether to output a blank page when there is nothing to print. | 
|[SetPageIndex](./setpageindex/) | Gets or sets the 0-based index of the first page to save. | 
|[GetPageIndex](./getpageindex/) | Gets or sets the 0-based index of the first page to save. | 
|[SetPageCount](./setpagecount/) | Gets or sets the number of pages to save. | 
|[GetPageCount](./getpagecount/) | Gets or sets the number of pages to save. | 
|[GetPrintingPageType](./getprintingpagetype/) | Indicates which pages will not be printed. | 
|[SetPrintingPageType](./setprintingpagetype/) | Indicates which pages will not be printed. | 
|[GetGridlineType](./getgridlinetype/) | Gets or sets gridline type. | 
|[SetGridlineType](./setgridlinetype/) | Gets or sets gridline type. | 
|[GetGridlineColor](./getgridlinecolor/) | Gets or sets gridline color. | 
|[SetGridlineColor](./setgridlinecolor/) | Gets or sets gridline color. | 
|[GetTextCrossType](./gettextcrosstype/) | Gets or sets displaying text type when the text width is larger than cell width. | 
|[SetTextCrossType](./settextcrosstype/) | Gets or sets displaying text type when the text width is larger than cell width. | 
|[GetDefaultEditLanguage](./getdefaulteditlanguage/) | Gets or sets default edit language. | 
|[SetDefaultEditLanguage](./setdefaulteditlanguage/) | Gets or sets default edit language. | 
|[GetSheetSet](./getsheetset/) | Gets or sets the sheets to render. Default is all visible sheets in the workbook: Aspose.Cells.Rendering.SheetSet.Visible. | 
|[SetSheetSet](./setsheetset/) | Gets or sets the sheets to render. Default is all visible sheets in the workbook: Aspose.Cells.Rendering.SheetSet.Visible. | 
|[GetDrawObjectEventHandler](./getdrawobjecteventhandler/) | Implements this interface to get DrawObject and Bound when rendering. | 
|[SetDrawObjectEventHandler](./setdrawobjecteventhandler/) | Implements this interface to get DrawObject and Bound when rendering. | 
|[GetEmfRenderSetting](./getemfrendersetting/) | Setting for rendering Emf metafile. | 
|[SetEmfRenderSetting](./setemfrendersetting/) | Setting for rendering Emf metafile. | 
|[GetCustomRenderSettings](./getcustomrendersettings/) | Gets or sets custom settings during rendering. | 
|[SetCustomRenderSettings](./setcustomrendersettings/) | Gets or sets custom settings during rendering. | 
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
