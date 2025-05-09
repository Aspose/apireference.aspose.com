---
title: HtmlSaveOptions.HiddenRowDisplayType
second_title: Aspose.Cells for .NET API Reference
description: HtmlSaveOptions property. Hidden rowthe height of this row is 0 in excelbefore save this into html format if HtmlHiddenRowDisplayType is Removethe hidden row would not been output if the value is Hidden the row would been outputbut was hiddenthe default value is Hidden
type: docs
url: /net/aspose.cells/htmlsaveoptions/hiddenrowdisplaytype/
---
## HtmlSaveOptions.HiddenRowDisplayType property

Hidden row(the height of this row is 0) in excel,before save this into html format, if HtmlHiddenRowDisplayType is "Remove",the hidden row would not been output, if the value is "Hidden", the row would been output,but was hidden,the default value is "Hidden"

```csharp
public HtmlHiddenRowDisplayType HiddenRowDisplayType { get; set; }
```

### Examples

```csharp
// Called: HiddenRowDisplayType = HtmlHiddenRowDisplayType.Hidden,
[Test]
        public void Property_HiddenRowDisplayType()
        {
            string filePath = Constants.JohnTest_PATH_SOURCE + @"NET47480/";
            string savePath = CreateFolder(filePath);

            var workbook = new Workbook(filePath + @"test.xlsx");
            workbook.CalculateFormula();
            var htmlSaveOptions = new HtmlSaveOptions
            {
                ExportHiddenWorksheet = false,
                HiddenColDisplayType = HtmlHiddenColDisplayType.Remove,
                HiddenRowDisplayType = HtmlHiddenRowDisplayType.Remove,
                ExportActiveWorksheetOnly = true
            };

            workbook.Save(savePath + @"out.html", htmlSaveOptions);

            var htmlSaveOptions2 = new HtmlSaveOptions
            {
                ExportHiddenWorksheet = false,
                HiddenColDisplayType = HtmlHiddenColDisplayType.Hidden,
                HiddenRowDisplayType = HtmlHiddenRowDisplayType.Hidden,
                ExportActiveWorksheetOnly = true
            };

            workbook.Save(savePath + @"out2.html", htmlSaveOptions2);
        }
```

### See Also

* enum [HtmlHiddenRowDisplayType](../../htmlhiddenrowdisplaytype/)
* class [HtmlSaveOptions](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


