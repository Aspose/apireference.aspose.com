---
title: Class StrokeSettings
second_title: Aspose.PSD for .NET API Reference
description: Aspose.PSD.FileFormats.Psd.Layers.LayerResources.StrokeResources.StrokeSettings class. Stroke settings of Shapes
type: docs
weight: 3370
url: /net/aspose.psd.fileformats.psd.layers.layerresources.strokeresources/strokesettings/
---
{{< psd/tize >}}
## StrokeSettings class

Stroke settings of Shapes.

```csharp
public class StrokeSettings : IStrokeSettings
```

## Constructors

| Name | Description |
| --- | --- |
| [StrokeSettings](strokesettings/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Enabled](../../aspose.psd.fileformats.psd.layers.layerresources.strokeresources/strokesettings/enabled/) { get; set; } | Gets or sets Stroke is enabled. |
| [Fill](../../aspose.psd.fileformats.psd.layers.layerresources.strokeresources/strokesettings/fill/) { get; set; } | Gets or sets Fill settings of the Stroke. |
| [LineAlignment](../../aspose.psd.fileformats.psd.layers.layerresources.strokeresources/strokesettings/linealignment/) { get; set; } | Gets or sets Stroke style line alignment. |
| [LineCap](../../aspose.psd.fileformats.psd.layers.layerresources.strokeresources/strokesettings/linecap/) { get; set; } | Gets or sets Stroke line cap type. |
| [LineDashSet](../../aspose.psd.fileformats.psd.layers.layerresources.strokeresources/strokesettings/linedashset/) { get; set; } | Gets or sets array of line dashes. |
| [LineJoin](../../aspose.psd.fileformats.psd.layers.layerresources.strokeresources/strokesettings/linejoin/) { get; set; } | Gets or sets Stroke line join type. |
| [Size](../../aspose.psd.fileformats.psd.layers.layerresources.strokeresources/strokesettings/size/) { get; set; } | Gets or sets Stroke line width. |

## Examples

The following code demonstrates support rendering of Shape Stroke.

```csharp
[C#]

string sourceFile = "StrokeShapeTest.psd";
string outputFilePsd = "StrokeShapeTest.out.psd";
string outputFilePng = "StrokeShapeTest.out.png";

using (PsdImage image = (PsdImage)Image.Load(sourceFile))
{
    Layer layer = image.Layers[1];
    ShapeLayer shapeLayer = (ShapeLayer)image.Layers[1];
    ColorFillSettings fillSettings = (ColorFillSettings)shapeLayer.Fill;
    fillSettings.Color = Color.GreenYellow;
    shapeLayer.Update();

    ShapeLayer shapeLayer2 = (ShapeLayer)image.Layers[3];
    GradientFillSettings gradientSettings = (GradientFillSettings)shapeLayer2.Fill;
    gradientSettings.Dither = true;
    gradientSettings.Reverse = true;
    gradientSettings.AlignWithLayer = false;
    gradientSettings.Angle = 20;
    gradientSettings.Scale = 50;
    gradientSettings.ColorPoints[0].Location = 100;
    gradientSettings.ColorPoints[1].Location = 4000;
    gradientSettings.TransparencyPoints[0].Location = 200;
    gradientSettings.TransparencyPoints[1].Location = 3800;
    gradientSettings.TransparencyPoints[0].Opacity = 90;
    gradientSettings.TransparencyPoints[1].Opacity = 10;
    shapeLayer2.Update();

    ShapeLayer shapeLayer3 = (ShapeLayer)image.Layers[5];
    StrokeSettings strokeSettings = (StrokeSettings)shapeLayer3.Stroke;
    strokeSettings.Size = 15;
    ColorFillSettings strokeFillSettings = (ColorFillSettings)strokeSettings.Fill;
    strokeFillSettings.Color = Color.GreenYellow;
    shapeLayer3.Update();

    image.Save(outputFilePsd);
    image.Save(outputFilePng, new PngOptions());
}

// Check changed data.
using (PsdImage image = (PsdImage)Image.Load(outputFilePsd))
{
    ShapeLayer shapeLayer = (ShapeLayer)image.Layers[1];
    ColorFillSettings fillSettings = (ColorFillSettings)shapeLayer.Fill;
    AssertAreEqual(Color.GreenYellow, fillSettings.Color);

    ShapeLayer shapeLayer2 = (ShapeLayer)image.Layers[3];
    GradientFillSettings gradientSettings = (GradientFillSettings)shapeLayer2.Fill;
    AssertAreEqual(true, gradientSettings.Dither);
    AssertAreEqual(true, gradientSettings.Reverse);
    AssertAreEqual(false, gradientSettings.AlignWithLayer);
    AssertAreEqual(20.0, gradientSettings.Angle);
    AssertAreEqual(50, gradientSettings.Scale);
    AssertAreEqual(100, gradientSettings.ColorPoints[0].Location);
    AssertAreEqual(4000, gradientSettings.ColorPoints[1].Location);
    AssertAreEqual(200, gradientSettings.TransparencyPoints[0].Location);
    AssertAreEqual(3800, gradientSettings.TransparencyPoints[1].Location);
    AssertAreEqual(90.0, gradientSettings.TransparencyPoints[0].Opacity);
    AssertAreEqual(10.0, gradientSettings.TransparencyPoints[1].Opacity);

    ShapeLayer shapeLayer3 = (ShapeLayer)image.Layers[5];
    StrokeSettings strokeSettings = (StrokeSettings)shapeLayer3.Stroke;
    ColorFillSettings strokeFillSettings = (ColorFillSettings)strokeSettings.Fill;
    AssertAreEqual(15.0, strokeSettings.Size);
    AssertAreEqual(Color.GreenYellow, strokeFillSettings.Color);
}

void AssertAreEqual(object expected, object actual, string message = null)
{
    if (!object.Equals(expected, actual))
    {
        throw new Exception(message ?? "Objects are not equal.");
    }
}
```

### See Also

* interface [IStrokeSettings](../istrokesettings/)
* namespace [Aspose.PSD.FileFormats.Psd.Layers.LayerResources.StrokeResources](../../aspose.psd.fileformats.psd.layers.layerresources.strokeresources/)
* assembly [Aspose.PSD](../../)


