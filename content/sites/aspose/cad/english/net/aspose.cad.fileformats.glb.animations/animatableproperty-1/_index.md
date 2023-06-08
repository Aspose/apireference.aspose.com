---
title: Class AnimatablePropertyT
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Animations.AnimatableProperty1T class. Represents a property value that can be animated using ICurveSampler
type: docs
weight: 9690
url: /net/aspose.cad.fileformats.glb.animations/animatableproperty-1/
---
## AnimatableProperty&lt;T&gt; class

Represents a property value that can be animated using [`ICurveSampler`](../icurvesampler-1/).

```csharp
public class AnimatableProperty<T>
    where T : struct
```

| Parameter | Description |
| --- | --- |
| T | The type of the value. |

## Properties

| Name | Description |
| --- | --- |
| [IsAnimated](../../aspose.cad.fileformats.glb.animations/animatableproperty-1/isanimated/) { get; } |  |
| [Tracks](../../aspose.cad.fileformats.glb.animations/animatableproperty-1/tracks/) { get; } |  |
| [Value](../../aspose.cad.fileformats.glb.animations/animatableproperty-1/value/) { get; set; } | Gets or sets the default value of this instance. When animations are disabled, or there's no animation track available, this will be the returned value. |

## Methods

| Name | Description |
| --- | --- |
| [Clone](../../aspose.cad.fileformats.glb.animations/animatableproperty-1/clone/)() |  |
| [GetValueAt](../../aspose.cad.fileformats.glb.animations/animatableproperty-1/getvalueat/)(string, float) | Evaluates the value of this `AnimatableProperty` at a given *offset* for a given *track*. |
| [RemoveTrack](../../aspose.cad.fileformats.glb.animations/animatableproperty-1/removetrack/)(string) | Removes the animation *track*. |
| [SetTrack](../../aspose.cad.fileformats.glb.animations/animatableproperty-1/settrack/)(string, ICurveSampler&lt;T&gt;) | Assigns an animation curve to a given track. |
| [SetValue](../../aspose.cad.fileformats.glb.animations/animatableproperty-1/setvalue/)(params float[]) |  |
| [UseTrackBuilder](../../aspose.cad.fileformats.glb.animations/animatableproperty-1/usetrackbuilder/)(string) |  |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Animations](../../aspose.cad.fileformats.glb.animations/)
* assembly [Aspose.CAD](../../)


