﻿---
title: Aspose::Cells::DocxSaveOptions class
linktitle: DocxSaveOptions
second_title: Aspose.Cells for C++ API Reference
description: 'Aspose::Cells::DocxSaveOptions class. Represents options of saving .docx file in C++.'
type: docs
weight: 5100
url: /cpp/aspose.cells/docxsaveoptions/
---
## DocxSaveOptions class


Represents options of saving .docx file.

```cpp
class DocxSaveOptions : public Aspose::Cells::PaginatedSaveOptions
```

## Methods

| Method | Description |
| --- | --- |
| [DocxSaveOptions()](./docxsaveoptions/) | Represents options of saving .docx file. |
| explicit [DocxSaveOptions(bool saveAsImage)](./docxsaveoptions/) | Represents options of saving .docx file. |
| [DocxSaveOptions(DocxSaveOptions_Impl* impl)](./docxsaveoptions/) | Constructs from an implementation object. |
| [DocxSaveOptions(const DocxSaveOptions\& src)](./docxsaveoptions/) | Copy constructor. |
| [DocxSaveOptions(const PaginatedSaveOptions\& src)](./docxsaveoptions/) | Constructs from a parent object. |
| [GetAllColumnsInOnePagePerSheet()](../paginatedsaveoptions/getallcolumnsinonepagepersheet/) | If AllColumnsInOnePagePerSheet is true , all column content of one sheet will output to only one page in result. The width of paper size of pagesetup will be ignored, and the other settings of pagesetup will still take effect. |
| [GetAsNormalView()](./getasnormalview/) | Exporting Excel file to docx fiel as normal view. If this property is true , one Area will be output, and no scale will take effect. The default value is false. |
| [GetCachedFileFolder()](../saveoptions/getcachedfilefolder/) | The folder for temporary files that may be used as data cache. |
| [GetCheckExcelRestriction()](../saveoptions/getcheckexcelrestriction/) | Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, it will be truncated. |
| [GetCheckFontCompatibility()](../paginatedsaveoptions/getcheckfontcompatibility/) | Indicates whether to check font compatibility for every character in text. |
| [GetCheckWorkbookDefaultFont()](../paginatedsaveoptions/getcheckworkbookdefaultfont/) | When characters in the Excel are Unicode and not be set with correct font in cell style, They may appear as block in pdf,image. Set this to true to try to use workbook's default font to show these characters first. |
| [GetClearData()](../saveoptions/getcleardata/) | Make the workbook empty after saving the file. |
| [GetCreateDirectory()](../saveoptions/getcreatedirectory/) | If true and the directory does not exist, the directory will be automatically created before saving the file. |
| [GetCustomRenderSettings()](../paginatedsaveoptions/getcustomrendersettings/) | Gets or sets custom settings during rendering. |
| [GetDefaultEditLanguage()](../paginatedsaveoptions/getdefaulteditlanguage/) | Gets or sets default edit language. |
| [GetDefaultFont()](../paginatedsaveoptions/getdefaultfont/) | When characters in the Excel are Unicode and not be set with correct font in cell style, They may appear as block in pdf,image. Set the DefaultFont such as MingLiu or MS Gothic to show these characters. If this property is not set, [Aspose.Cells](../) will use system default font to show these unicode characters. |
| [GetDrawObjectEventHandler()](../paginatedsaveoptions/getdrawobjecteventhandler/) | Implements this interface to get DrawObject and Bound when rendering. |
| [GetEmfRenderSetting()](../paginatedsaveoptions/getemfrendersetting/) | Setting for rendering Emf metafile. |
| [GetEncryptDocumentProperties()](../saveoptions/getencryptdocumentproperties/) | Indicates whether encrypt document properties when saving as .xls file. The default value is true. |
| [GetGridlineColor()](../paginatedsaveoptions/getgridlinecolor/) | Gets or sets gridline color. |
| [GetGridlineType()](../paginatedsaveoptions/getgridlinetype/) | Gets or sets gridline type. |
| [GetIgnoreError()](../paginatedsaveoptions/getignoreerror/) | Indicates if you need to hide the error while rendering. The error can be error in shape, image, chart rendering, etc. |
| [GetMergeAreas()](../saveoptions/getmergeareas/) | Indicates whether merge the areas of conditional formatting and validation before saving the file. |
| [GetOnePagePerSheet()](../paginatedsaveoptions/getonepagepersheet/) | If OnePagePerSheet is true , all content of one sheet will output to only one page in result. The paper size of pagesetup will be invalid, and the other settings of pagesetup will still take effect. |
| [GetOutputBlankPageWhenNothingToPrint()](../paginatedsaveoptions/getoutputblankpagewhennothingtoprint/) | Indicates whether to output a blank page when there is nothing to print. |
| [GetPageCount()](../paginatedsaveoptions/getpagecount/) | Gets or sets the number of pages to save. |
| [GetPageIndex()](../paginatedsaveoptions/getpageindex/) | Gets or sets the 0-based index of the first page to save. |
| [GetPageSavingCallback()](../paginatedsaveoptions/getpagesavingcallback/) | Control/Indicate progress of page saving process. |
| [GetPrintingPageType()](../paginatedsaveoptions/getprintingpagetype/) | Indicates which pages will not be printed. |
| [GetRefreshChartCache()](../saveoptions/getrefreshchartcache/) | Indicates whether refreshing chart cache data. |
| [GetSaveAsEditableShapes()](./getsaveaseditableshapes/) | Save all drawing objects as editable shapes in the word file, so you can edit them in Word. |
| [GetSaveAsEditableShaps()](./getsaveaseditableshaps/) |  **(Deprecated)** Save all drawing objecgts as editable shapes in word file.So you can edit them in Word. |
| [GetSaveFormat()](../saveoptions/getsaveformat/) | Gets the save file format. |
| [GetSheetSet()](../paginatedsaveoptions/getsheetset/) | Gets or sets the sheets to render. Default is all visible sheets in the workbook: Aspose.Cells.Rendering.SheetSet.Visible. |
| [GetSortExternalNames()](../saveoptions/getsortexternalnames/) | Indicates whether sorting external defined names before saving file. |
| [GetSortNames()](../saveoptions/getsortnames/) | Indicates whether sorting defined names before saving file. |
| [GetTextCrossType()](../paginatedsaveoptions/gettextcrosstype/) | Gets or sets displaying text type when the text width is larger than cell width. |
| [GetUpdateSmartArt()](../saveoptions/getupdatesmartart/) | Indicates whether updating smart art setting. The default value is false. |
| [GetValidateMergedAreas()](../saveoptions/getvalidatemergedareas/) | Indicates whether validate merged cells before saving the file. |
| [GetWarningCallback()](../saveoptions/getwarningcallback/) | Gets or sets warning callback. |
| [IsFontSubstitutionCharGranularity()](../paginatedsaveoptions/isfontsubstitutionchargranularity/) | Indicates whether to only substitute the font of character when the cell font is not compatibility for it. |
| [IsNull()](./isnull/) const | Checks whether the implementation object is nullptr. |
| explicit [operator bool()](./operator_bool/) const | operator bool() |
| [operator=(const DocxSaveOptions\& src)](./operator_asm/) | operator= |
| [operator=(const PaginatedSaveOptions\& src)](../paginatedsaveoptions/operator_asm/) | operator= |
| [operator=(const SaveOptions\& src)](../saveoptions/operator_asm/) | operator= |
| [PaginatedSaveOptions(PaginatedSaveOptions_Impl* impl)](../paginatedsaveoptions/paginatedsaveoptions/) | Constructs from an implementation object. |
| [PaginatedSaveOptions(const PaginatedSaveOptions\& src)](../paginatedsaveoptions/paginatedsaveoptions/) | Copy constructor. |
| [PaginatedSaveOptions(const SaveOptions\& src)](../paginatedsaveoptions/paginatedsaveoptions/) | Constructs from a parent object. |
| [SaveOptions(SaveOptions_Impl* impl)](../saveoptions/saveoptions/) | Constructs from an implementation object. |
| [SaveOptions(const SaveOptions\& src)](../saveoptions/saveoptions/) | Copy constructor. |
| [SetAllColumnsInOnePagePerSheet(bool value)](../paginatedsaveoptions/setallcolumnsinonepagepersheet/) | If AllColumnsInOnePagePerSheet is true , all column content of one sheet will output to only one page in result. The width of paper size of pagesetup will be ignored, and the other settings of pagesetup will still take effect. |
| [SetAsNormalView(bool value)](./setasnormalview/) | Exporting Excel file to docx fiel as normal view. If this property is true , one Area will be output, and no scale will take effect. The default value is false. |
| [SetCachedFileFolder(const U16String\& value)](../saveoptions/setcachedfilefolder/) | The folder for temporary files that may be used as data cache. |
| [SetCachedFileFolder(const char16_t* value)](../saveoptions/setcachedfilefolder/) | The folder for temporary files that may be used as data cache. |
| [SetCheckExcelRestriction(bool value)](../saveoptions/setcheckexcelrestriction/) | Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, it will be truncated. |
| [SetCheckFontCompatibility(bool value)](../paginatedsaveoptions/setcheckfontcompatibility/) | Indicates whether to check font compatibility for every character in text. |
| [SetCheckWorkbookDefaultFont(bool value)](../paginatedsaveoptions/setcheckworkbookdefaultfont/) | When characters in the Excel are Unicode and not be set with correct font in cell style, They may appear as block in pdf,image. Set this to true to try to use workbook's default font to show these characters first. |
| [SetClearData(bool value)](../saveoptions/setcleardata/) | Make the workbook empty after saving the file. |
| [SetCreateDirectory(bool value)](../saveoptions/setcreatedirectory/) | If true and the directory does not exist, the directory will be automatically created before saving the file. |
| [SetCustomRenderSettings(const CustomRenderSettings\& value)](../paginatedsaveoptions/setcustomrendersettings/) | Gets or sets custom settings during rendering. |
| [SetDefaultEditLanguage(DefaultEditLanguage value)](../paginatedsaveoptions/setdefaulteditlanguage/) | Gets or sets default edit language. |
| [SetDefaultFont(const U16String\& value)](../paginatedsaveoptions/setdefaultfont/) | When characters in the Excel are Unicode and not be set with correct font in cell style, They may appear as block in pdf,image. Set the DefaultFont such as MingLiu or MS Gothic to show these characters. If this property is not set, [Aspose.Cells](../) will use system default font to show these unicode characters. |
| [SetDefaultFont(const char16_t* value)](../paginatedsaveoptions/setdefaultfont/) | When characters in the Excel are Unicode and not be set with correct font in cell style, They may appear as block in pdf,image. Set the DefaultFont such as MingLiu or MS Gothic to show these characters. If this property is not set, [Aspose.Cells](../) will use system default font to show these unicode characters. |
| [SetDrawObjectEventHandler(DrawObjectEventHandler* value)](../paginatedsaveoptions/setdrawobjecteventhandler/) | Implements this interface to get DrawObject and Bound when rendering. |
| [SetEmfRenderSetting(EmfRenderSetting value)](../paginatedsaveoptions/setemfrendersetting/) | Setting for rendering Emf metafile. |
| [SetEncryptDocumentProperties(bool value)](../saveoptions/setencryptdocumentproperties/) | Indicates whether encrypt document properties when saving as .xls file. The default value is true. |
| [SetGridlineColor(const Aspose::Cells::Color\& value)](../paginatedsaveoptions/setgridlinecolor/) | Gets or sets gridline color. |
| [SetGridlineType(GridlineType value)](../paginatedsaveoptions/setgridlinetype/) | Gets or sets gridline type. |
| [SetIgnoreError(bool value)](../paginatedsaveoptions/setignoreerror/) | Indicates if you need to hide the error while rendering. The error can be error in shape, image, chart rendering, etc. |
| [SetIsFontSubstitutionCharGranularity(bool value)](../paginatedsaveoptions/setisfontsubstitutionchargranularity/) | Indicates whether to only substitute the font of character when the cell font is not compatibility for it. |
| [SetMergeAreas(bool value)](../saveoptions/setmergeareas/) | Indicates whether merge the areas of conditional formatting and validation before saving the file. |
| [SetOnePagePerSheet(bool value)](../paginatedsaveoptions/setonepagepersheet/) | If OnePagePerSheet is true , all content of one sheet will output to only one page in result. The paper size of pagesetup will be invalid, and the other settings of pagesetup will still take effect. |
| [SetOutputBlankPageWhenNothingToPrint(bool value)](../paginatedsaveoptions/setoutputblankpagewhennothingtoprint/) | Indicates whether to output a blank page when there is nothing to print. |
| [SetPageCount(int32_t value)](../paginatedsaveoptions/setpagecount/) | Gets or sets the number of pages to save. |
| [SetPageIndex(int32_t value)](../paginatedsaveoptions/setpageindex/) | Gets or sets the 0-based index of the first page to save. |
| [SetPageSavingCallback(IPageSavingCallback* value)](../paginatedsaveoptions/setpagesavingcallback/) | Control/Indicate progress of page saving process. |
| [SetPrintingPageType(PrintingPageType value)](../paginatedsaveoptions/setprintingpagetype/) | Indicates which pages will not be printed. |
| [SetRefreshChartCache(bool value)](../saveoptions/setrefreshchartcache/) | Indicates whether refreshing chart cache data. |
| [SetSaveAsEditableShapes(bool value)](./setsaveaseditableshapes/) | Save all drawing objects as editable shapes in the word file, so you can edit them in Word. |
| [SetSaveAsEditableShaps(bool value)](./setsaveaseditableshaps/) |  **(Deprecated)** Save all drawing objecgts as editable shapes in word file.So you can edit them in Word. |
| [SetSheetSet(const SheetSet\& value)](../paginatedsaveoptions/setsheetset/) | Gets or sets the sheets to render. Default is all visible sheets in the workbook: Aspose.Cells.Rendering.SheetSet.Visible. |
| [SetSortExternalNames(bool value)](../saveoptions/setsortexternalnames/) | Indicates whether sorting external defined names before saving file. |
| [SetSortNames(bool value)](../saveoptions/setsortnames/) | Indicates whether sorting defined names before saving file. |
| [SetTextCrossType(TextCrossType value)](../paginatedsaveoptions/settextcrosstype/) | Gets or sets displaying text type when the text width is larger than cell width. |
| [SetUpdateSmartArt(bool value)](../saveoptions/setupdatesmartart/) | Indicates whether updating smart art setting. The default value is false. |
| [SetValidateMergedAreas(bool value)](../saveoptions/setvalidatemergedareas/) | Indicates whether validate merged cells before saving the file. |
| [SetWarningCallback(IWarningCallback* value)](../saveoptions/setwarningcallback/) | Gets or sets warning callback. |
| [~DocxSaveOptions()](./~docxsaveoptions/) | Destructor. |
| [~PaginatedSaveOptions()](../paginatedsaveoptions/~paginatedsaveoptions/) | Destructor. |
| [~SaveOptions()](../saveoptions/~saveoptions/) | Destructor. |
## Fields

| Field | Description |
| --- | --- |
| [_impl](./_impl/) | The implementation object. |
## See Also

* Class [PaginatedSaveOptions](../paginatedsaveoptions/)
* Namespace [Aspose::Cells](../)
* Library [Aspose.Cells for C++](../../)
