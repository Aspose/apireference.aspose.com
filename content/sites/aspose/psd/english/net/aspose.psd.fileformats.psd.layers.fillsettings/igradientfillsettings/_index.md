---
title: Interface IGradientFillSettings
second_title: Aspose.PSD for .NET API Reference
description: Aspose.PSD.FileFormats.Psd.Layers.FillSettings.IGradientFillSettings interface. Base interface for Gradient fill settings
type: docs
weight: 2120
url: /net/aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/
---
{{< psd/tize >}}
## IGradientFillSettings interface

Base interface for Gradient fill settings.

```csharp
public interface IGradientFillSettings : IFillSettings
```

## Properties

| Name | Description |
| --- | --- |
| [AlignWithLayer](../../aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/alignwithlayer/) { get; set; } | Gets or sets a value indicating whether [align with layer]. |
| [Angle](../../aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/angle/) { get; set; } | Gets or sets the angle. |
| [Dither](../../aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/dither/) { get; set; } | Gets or sets a value indicating whether this `IGradientFillSettings` is dither. |
| [Gradient](../../aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/gradient/) { get; set; } | Gets or sets specific gradient definition instance (Solid/Noise). |
| [GradientType](../../aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/gradienttype/) { get; set; } | Gets or sets the type of the gradient. |
| [HorizontalOffset](../../aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/horizontaloffset/) { get; set; } | Gets or sets the horizontal offset. |
| [Reverse](../../aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/reverse/) { get; set; } | Gets or sets a value indicating whether this `IGradientFillSettings` is reverse. |
| [Scale](../../aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/scale/) { get; set; } | Gets or sets the scale. |
| [VerticalOffset](../../aspose.psd.fileformats.psd.layers.fillsettings/igradientfillsettings/verticaloffset/) { get; set; } | Gets or sets the vertical offset. |

## Examples

The following example demonstrates Gradient FillLayer support and IGradientFillSettings editing options..

```csharp
[C#]

string sourceFileName = "ComplexGradientFillLayer.psd";
string outputFile = "ComplexGradientFillLayer_output.psd";
var im = (PsdImage)Image.Load(sourceFileName);
using (im)
{
    foreach (var layer in im.Layers)
    {
        if (layer is FillLayer)
        {
            var fillLayer = (FillLayer)layer;
            if (fillLayer.FillSettings.FillType != FillType.Gradient)
            {
                throw new Exception("Wrong Fill Layer");
            }
            var settings = (GradientFillSettings)fillLayer.FillSettings;
            if (
             Math.Abs(settings.Angle - 45) > 0.25 ||
             settings.Dither != true ||
             settings.AlignWithLayer != false ||
             settings.Reverse != false ||
             Math.Abs(settings.HorizontalOffset - (-39)) > 0.25 ||
             Math.Abs(settings.VerticalOffset - (-5)) > 0.25 ||
             settings.TransparencyPoints.Length != 3 ||
             settings.ColorPoints.Length != 2 ||
             Math.Abs(100.0 - settings.TransparencyPoints[0].Opacity) > 0.25 ||
             settings.TransparencyPoints[0].Location != 0 ||
             settings.TransparencyPoints[0].MedianPointLocation != 50 ||
             settings.ColorPoints[0].Color != Color.FromArgb(203, 64, 140) ||
             settings.ColorPoints[0].Location != 0 ||
             settings.ColorPoints[0].MedianPointLocation != 50)
            {
                throw new Exception("Gradient Fill was not read correctly");
            }
            settings.Angle = 0.0;
            settings.Dither = false;
            settings.AlignWithLayer = true;
            settings.Reverse = true;
            settings.HorizontalOffset = 25;
            settings.VerticalOffset = -15;
            var colorPoints = new List<IGradientColorPoint>(settings.ColorPoints);
            var transparencyPoints = new List<IGradientTransparencyPoint>(settings.TransparencyPoints);
            colorPoints.Add(new GradientColorPoint()
            {
                Color = Color.Violet,
                Location = 4096,
                MedianPointLocation = 75
            });
            colorPoints[1].Location = 3000;
            transparencyPoints.Add(new GradientTransparencyPoint()
            {
                Opacity = 80.0,
                Location = 4096,
                MedianPointLocation = 25
            });
            transparencyPoints[2].Location = 3000;
            settings.ColorPoints = colorPoints.ToArray();
            settings.TransparencyPoints = transparencyPoints.ToArray();
            fillLayer.Update();
            im.Save(outputFile, new PsdOptions(im));
            break;
        }
    }
}
```

### See Also

* interface [IFillSettings](../ifillsettings/)
* namespace [Aspose.PSD.FileFormats.Psd.Layers.FillSettings](../../aspose.psd.fileformats.psd.layers.fillsettings/)
* assembly [Aspose.PSD](../../)


