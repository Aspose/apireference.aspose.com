---
title: Class PageLegend
second_title: Aspose.Tasks for .NET API Reference
description: Aspose.Tasks.Visualization.PageLegend class. Represents a page legend which is used for project printing
type: docs
weight: 3120
url: /net/aspose.tasks.visualization/pagelegend/
---
## PageLegend class

Represents a page legend which is used for project printing.

```csharp
public class PageLegend
```

## Constructors

| Name | Description |
| --- | --- |
| [PageLegend](pagelegend/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [CenteredImage](../../aspose.tasks.visualization/pagelegend/centeredimage/) { get; set; } | Gets or sets the centered image to be displayed in the page legend. |
| [CenteredText](../../aspose.tasks.visualization/pagelegend/centeredtext/) { get; set; } | Gets or sets the centered text to display in the page legend. |
| [LeftImage](../../aspose.tasks.visualization/pagelegend/leftimage/) { get; set; } | Gets or sets the left aligned image to be displayed in the page legend. |
| [LeftText](../../aspose.tasks.visualization/pagelegend/lefttext/) { get; set; } | Gets or sets the left aligned text to display in the page legend. |
| [LegendOn](../../aspose.tasks.visualization/pagelegend/legendon/) { get; set; } | Gets or sets the pages on which the legend appears. Can be one of the values of the [`Legend`](../legend/) enumeration. |
| [RightImage](../../aspose.tasks.visualization/pagelegend/rightimage/) { get; set; } | Gets or sets the right aligned image to be displayed in the page legend. |
| [RightText](../../aspose.tasks.visualization/pagelegend/righttext/) { get; set; } | Gets or sets the right aligned text to display in the page legend. |
| [Width](../../aspose.tasks.visualization/pagelegend/width/) { get; set; } | Gets or sets the width of the legend. |

## Examples

Shows how to work with page legend information.

```csharp
var project = new Project(DataDir + "Blank2010.mpp");

// lets read page legend information
var legend = project.DefaultView.PageInfo.Legend;

Console.WriteLine("Legend left text: {0} ", legend.LeftText);
Console.WriteLine("Legend left image: {0} ", legend.LeftImage);
Console.WriteLine("Legend center text: {0} ", legend.CenteredText);
Console.WriteLine("Legend center image: {0} ", legend.CenteredImage);
Console.WriteLine("Legend right text: {0} ", legend.RightText);
Console.WriteLine("Legend right image: {0} ", legend.RightImage);
Console.WriteLine("Legend On: {0} ", legend.LegendOn);
Console.WriteLine("Legend Width: {0} ", legend.Width);

// also modification of a legend is supported
legend.LeftText = "New Left Text";

project.Save(OutDir + "WorkWithPageLegend_out.mpp", SaveFileFormat.Mpp);
```

### See Also

* namespace [Aspose.Tasks.Visualization](../../aspose.tasks.visualization/)
* assembly [Aspose.Tasks](../../)


