---
title: Class SaveOptions
second_title: Aspose.Cells for .NET API Reference
description: Aspose.Cells.SaveOptions class. Represents all save options
type: docs
url: /net/aspose.cells/saveoptions/
---
## SaveOptions class

Represents all save options

```csharp
public class SaveOptions
```

## Properties

| Name | Description |
| --- | --- |
| [CachedFileFolder](../../aspose.cells/saveoptions/cachedfilefolder/) { get; set; } | The cached file folder is used to store some large data. |
| [CheckExcelRestriction](../../aspose.cells/saveoptions/checkexcelrestriction/) { get; set; } | Whether check restriction of excel file when user modify cells related objects. For example, excel does not allow inputting string value longer than 32K. When you input a value longer than 32K, it will be truncated. |
| [ClearData](../../aspose.cells/saveoptions/cleardata/) { get; set; } | Make the workbook empty after saving the file. |
| [CreateDirectory](../../aspose.cells/saveoptions/createdirectory/) { get; set; } | If true and the directory does not exist, the directory will be automatically created before saving the file. |
| [EncryptDocumentProperties](../../aspose.cells/saveoptions/encryptdocumentproperties/) { get; set; } | Indicates whether encrypt document properties when saving as .xls file. The default value is true. |
| [MergeAreas](../../aspose.cells/saveoptions/mergeareas/) { get; set; } | Indicates whether merge the areas of conditional formatting and validation before saving the file. |
| [RefreshChartCache](../../aspose.cells/saveoptions/refreshchartcache/) { get; set; } | Indicates whether refreshing chart cache data |
| [SaveFormat](../../aspose.cells/saveoptions/saveformat/) { get; } | Gets the save file format. |
| [SortExternalNames](../../aspose.cells/saveoptions/sortexternalnames/) { get; set; } | Indicates whether sorting external defined names before saving file. |
| [SortNames](../../aspose.cells/saveoptions/sortnames/) { get; set; } | Indicates whether sorting defined names before saving file. |
| [UpdateSmartArt](../../aspose.cells/saveoptions/updatesmartart/) { get; set; } | Indicates whether updating smart art setting. The default value is false. |
| [ValidateMergedAreas](../../aspose.cells/saveoptions/validatemergedareas/) { get; set; } | Indicates whether validate merged cells before saving the file. |
| [WarningCallback](../../aspose.cells/saveoptions/warningcallback/) { get; set; } | Gets or sets warning callback. |

### Examples

```csharp
// Called: Aspose.Cells.SaveOptions so = hso;
[Test]
        public void Type_SaveOptions()
        {
            string filePath = Constants.JohnTest_PATH_SOURCE + @"wangtaoTest/";
            string filename = "myDocument.xlsx";
            MemoryStream ms = new MemoryStream();
            Aspose.Cells.LoadOptions loadOptions = new Aspose.Cells.LoadOptions(Aspose.Cells.LoadFormat.Xlsx);
            Aspose.Cells.Workbook wb = new Aspose.Cells.Workbook(filePath + filename, loadOptions);
            //wb.Save(ms, new Aspose.Cells.TxtSaveOptions());
            wb.FileName = filename;//this line will cause exception
            Aspose.Cells.HtmlSaveOptions hso = new Aspose.Cells.HtmlSaveOptions();
            hso.ExportImagesAsBase64 = true;
            Aspose.Cells.SaveOptions so = hso;
            wb.Save(ms, so);
            Console.WriteLine("OK");
        }
```

### See Also

* namespace [Aspose.Cells](../../aspose.cells/)
* assembly [Aspose.Cells](../../)


