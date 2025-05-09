---
title: Workbook.GetThemeColor
second_title: Aspose.Cells for .NET API Reference
description: Workbook method. Gets theme color
type: docs
url: /net/aspose.cells/workbook/getthemecolor/
---
## Workbook.GetThemeColor method

Gets theme color.

```csharp
public Color GetThemeColor(ThemeColorType type)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | ThemeColorType | The theme color type. |

### Return Value

The theme color.

### Examples

```csharp
// Called: Color color1 = workbook.GetThemeColor(ThemeColorType.Accent6);
[Test]
        public void Method_ThemeColorType_()
    {
        Workbook workbook = new Workbook(Constants.sourcePath + "CELLSJAVA41100.xls");
        Color color = workbook.GetThemeColor(ThemeColorType.Accent6);
        workbook.Save(Constants.destPath +"CELLSJAVA41100.xls");

        workbook = new Workbook(Constants.destPath + "CELLSJAVA41100.xls");
        Color color1 = workbook.GetThemeColor(ThemeColorType.Accent6);
        Assert.AreEqual(color.ToArgb(), color1.ToArgb());
    }
```

### See Also

* enum [ThemeColorType](../../themecolortype/)
* class [Workbook](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


