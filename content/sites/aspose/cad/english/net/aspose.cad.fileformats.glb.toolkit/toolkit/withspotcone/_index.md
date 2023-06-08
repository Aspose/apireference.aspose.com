---
title: Toolkit.WithSpotCone
second_title: Aspose.CAD for .NET API Reference
description: Toolkit method. Sets the cone angles for the Spot light
type: docs
weight: 570
url: /net/aspose.cad.fileformats.glb.toolkit/toolkit/withspotcone/
---
## Toolkit.WithSpotCone method

Sets the cone angles for the Spot light.

```csharp
public static PunctualLight WithSpotCone(this PunctualLight light, float innerConeAngle, 
    float outerConeAngle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| light | PunctualLight | This [`PunctualLight`](../../../aspose.cad.fileformats.glb/punctuallight/) instance. |
| innerConeAngle | Single | Gets the Angle, in radians, from centre of spotlight where falloff begins. Must be greater than or equal to 0 and less than outerConeAngle. |
| outerConeAngle | Single | Gets Angle, in radians, from centre of spotlight where falloff ends. Must be greater than innerConeAngle and less than or equal to PI / 2.0. |

### Return Value

This [`PunctualLight`](../../../aspose.cad.fileformats.glb/punctuallight/) instance.

### See Also

* class [PunctualLight](../../../aspose.cad.fileformats.glb/punctuallight/)
* class [Toolkit](../)
* namespace [Aspose.CAD.FileFormats.GLB.ToolKit](../../toolkit/)
* assembly [Aspose.CAD](../../../)


