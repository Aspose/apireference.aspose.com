---
title: Enum Legend
second_title: Aspose.Tasks for .NET API Reference
description: Aspose.Tasks.Visualization.Legend enum. Specifies the possible options used when rendering views legend
type: docs
weight: 3090
url: /net/aspose.tasks.visualization/legend/
---
## Legend enumeration

Specifies the possible options used when rendering view's legend.

```csharp
public enum Legend
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| NoLegend | `0` | No legend is rendered. |
| AfterLastPage | `1` | The legend is rendered on a separate page after the last page of the project's pages. |
| OnEveryPage | `2` | The legend is rendered on every page. |

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


