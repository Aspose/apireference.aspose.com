---
title: WorkbookSettings.FirstVisibleTab
second_title: Aspose.Cells for .NET API Reference
description: WorkbookSettings property. Gets or sets the first visible worksheet tab
type: docs
url: /net/aspose.cells/workbooksettings/firstvisibletab/
---
## WorkbookSettings.FirstVisibleTab property

Gets or sets the first visible worksheet tab.

```csharp
public int FirstVisibleTab { get; set; }
```

### Examples

```csharp
// Called: combinedWb.Settings.FirstVisibleTab = 0;
[Test]
        public void Property_FirstVisibleTab()
        {
            string coverPageFullPath = Path.Combine(Constants.sourcePath, "CELLSNETCORE395Cover Page.xlsx");
            string reportTemplateFullPath = Path.Combine(Constants.sourcePath, "RCELLSNETCORE395eport Template.xlsm");
            Workbook coverPageWb = new Workbook(coverPageFullPath);
            Workbook reportTemplateWb = new Workbook(reportTemplateFullPath);

            // Delete Very Hidden Worksheets
            // Note: skipping move step
            // Copy only sheet in cover page workbook and rename, then remove original
            string coverPageName = "Cover>>";
            Worksheet sheetToCopy = coverPageWb.Worksheets["a"];
            int newSheetIndex = coverPageWb.Worksheets.AddCopy(sheetToCopy.Name);
            coverPageWb.Worksheets[newSheetIndex].Name = coverPageName;
            coverPageWb.CalculateFormula(new CalculationOptions { IgnoreError = true });
            coverPageWb.Worksheets.RemoveAt("a");

            // Copy sheets in report template workbook (simulate building this part of report package)

            // NOTE about # of Copies: 
            //  Make this < 6 and the combined Excel file WILL NOT crash Excel when selecting tabs
            //  Make this >= 6 and the combined Excel file WILL crash Excel when selecting tabs
            //  Styles (regular and/or cond. format) may ultimately be corrupted in either case
            int numberOfCopies = 8;
            List<string> newReportTemplateSheetNames = new List<string>(numberOfCopies);
            sheetToCopy = reportTemplateWb.Worksheets["a"];
            newReportTemplateSheetNames.Add(sheetToCopy.Name);
            for (int i = 0; i < numberOfCopies; i++)
            {
                newSheetIndex = reportTemplateWb.Worksheets.AddCopy(sheetToCopy.Name);
                sheetToCopy = reportTemplateWb.Worksheets[newSheetIndex];
                newReportTemplateSheetNames.Add(sheetToCopy.Name);
            }
            reportTemplateWb.CalculateFormula(new CalculationOptions { IgnoreError = true });

            // The combined workbook is now created starting with cover page workbook
            Workbook combinedWb = coverPageWb;
            foreach (string templateSheetName in newReportTemplateSheetNames)
            {
                Worksheet newSheet = combinedWb.Worksheets.Add(templateSheetName);
                newSheet.Copy(reportTemplateWb.Worksheets[templateSheetName]);
            }

            // Select 1st worksheet
            combinedWb.Worksheets.ActiveSheetIndex = 0;
            //combinedWb.Worksheets[0].SelectSingleSheet();
            combinedWb.Settings.FirstVisibleTab = 0;

            //Rename all shapes after copy to avoid Aspose auto-generating name beyond 32 character limit for shape names.
            foreach (Worksheet sheet in combinedWb.Worksheets)
            {
                foreach (Shape shape in sheet.Shapes)
                {
                    //Converts a GUID to Base64 string with a max of 22 characters.
                    string newShapeName = Regex.Replace(Convert.ToBase64String(Guid.NewGuid().ToByteArray()), "[/+=]", "");
                    shape.Name = newShapeName;
                }
            }
            Util.ReSave(combinedWb, SaveFormat.Xlsx);
            //combinedWb.Save(Constants.destPath + "CELLSNETCORE395.xlsx", SaveFormat.Xlsx);
        }
```

### See Also

* class [WorkbookSettings](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


