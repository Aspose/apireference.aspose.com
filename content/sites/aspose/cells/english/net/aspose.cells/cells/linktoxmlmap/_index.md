---
title: Cells.LinkToXmlMap
second_title: Aspose.Cells for .NET API Reference
description: Cells method. Link to a xml map
type: docs
url: /net/aspose.cells/cells/linktoxmlmap/
---
## Cells.LinkToXmlMap method

Link to a xml map.

```csharp
public void LinkToXmlMap(string mapName, int row, int column, string path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mapName | String | name of xml map |
| row | Int32 | row of the destination cell |
| column | Int32 | column of the destination cell |
| path | String | path of xml element in xml map |

### Examples

```csharp
// Called: cells.LinkToXmlMap("Transmittals_Map", 16, 3, "/Transmittals/Transmittal_folder/Name");
[Test, ExpectedException(typeof(ArgumentException))]
#endif
        public void Method_String_()
        {
            Workbook wb = new Workbook(SrcPath + "AddXmlMapping.xlsx");
            Worksheet sheet = wb.Worksheets["LinkToExistTable"];
            Cells cells = sheet.Cells;

            cells.LinkToXmlMap("Transmittals_Map", 16, 3, "/Transmittals/Transmittal_folder/Name");
        }
```

### See Also

* class [Cells](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


