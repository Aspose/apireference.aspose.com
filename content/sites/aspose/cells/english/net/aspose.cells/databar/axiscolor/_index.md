---
title: DataBar.AxisColor
second_title: Aspose.Cells for .NET API Reference
description: DataBar property. Gets the color of the axis for cells with conditional formatting as data bars
type: docs
url: /net/aspose.cells/databar/axiscolor/
---
## DataBar.AxisColor property

Gets the color of the axis for cells with conditional formatting as data bars.

```csharp
public Color AxisColor { get; set; }
```

### Examples

```csharp
// Called: Color axisColor = fc.DataBar.AxisColor;
[Test]
        public void Property_AxisColor()
        {
            String sfilePath = Constants.sourcePath + "ConditionalFormattings\\TestDataBarCopy.xlsx";
            String dfilePath = Constants.destPath + "TestDataBarCopy2.xlsx";

            Workbook book = new Workbook(sfilePath);
            ConditionalFormattingCollection cfs = book.Worksheets[0].ConditionalFormattings;
            book.Worksheets[1].ConditionalFormattings.Copy(cfs);
            book.Save(dfilePath);
            Workbook newbook = new Workbook(dfilePath);
            ConditionalFormattingCollection newcfs = newbook.Worksheets[1].ConditionalFormattings;
            FormatConditionCollection fcs = newcfs[0];
            FormatCondition fc = fcs[0];

            FormatConditionValueType minType = fc.DataBar.MinCfvo.Type;
            FormatConditionValueType maxType = fc.DataBar.MaxCfvo.Type;
            Color databarColor = fc.DataBar.Color;
            bool showValue = fc.DataBar.ShowValue;

            DataBarBorderType barborder = fc.DataBar.BarBorder.Type;
            Color borderColor = fc.DataBar.BarBorder.Color;

            DataBarFillType barFilltype = fc.DataBar.BarFillType;

            Color axisColor = fc.DataBar.AxisColor;
            DataBarAxisPosition axisPosition = fc.DataBar.AxisPosition;

            DataBarNegativeColorType negColorType = fc.DataBar.NegativeBarFormat.ColorType;
            Color negColor = fc.DataBar.NegativeBarFormat.Color;

            DataBarNegativeColorType negBorderColorType = fc.DataBar.NegativeBarFormat.BorderColorType;
            Color negBorderColor = fc.DataBar.NegativeBarFormat.BorderColor;

            string sqref = GetCellAreaName(fcs.GetCellArea(0));

            Assert.AreEqual(minType, FormatConditionValueType.AutomaticMin);
            Assert.AreEqual(maxType, FormatConditionValueType.AutomaticMax);

           AssertHelper.AreEqual(databarColor, Color.FromArgb(255, 0, 0));//Color.Orange);

            Assert.AreEqual(showValue, true);

            Assert.AreEqual(barborder, DataBarBorderType.Solid);

           AssertHelper.AreEqual(borderColor, Color.FromArgb(0, 0, 0));

            Assert.AreEqual(barFilltype, DataBarFillType.Gradient);

           AssertHelper.AreEqual(axisColor, Color.FromArgb(0, 0, 0));

            Assert.AreEqual(axisPosition, DataBarAxisPosition.Midpoint);
            Assert.AreEqual(negColorType, DataBarNegativeColorType.SameAsPositive);

           AssertHelper.AreEqual(negColor, Color.FromArgb(255, 0, 0));

            Assert.AreEqual(negBorderColorType, DataBarNegativeColorType.Color);

           AssertHelper.AreEqual(negBorderColor, Color.FromArgb(228, 108, 10));

            Assert.AreEqual(sqref, "A1:C1");
        }
```

### See Also

* class [DataBar](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


