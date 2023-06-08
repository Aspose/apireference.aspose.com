---
title: PunctualLight.SetColor
second_title: Aspose.CAD for .NET API Reference
description: PunctualLight method. Defines the light color intensity and range for the current PunctualLight
type: docs
weight: 70
url: /net/aspose.cad.fileformats.glb/punctuallight/setcolor/
---
## PunctualLight.SetColor method

Defines the light color, intensity and range for the current [`PunctualLight`](../).

```csharp
public void SetColor(Vector3 color, float intensity = 1, float range = Infinity)
```

| Parameter | Type | Description |
| --- | --- | --- |
| color | Vector3 | RGB value for light's color in linear space. |
| intensity | Single | Brightness of light in. The units that this is defined in depend on the type of light. point and spot lights use luminous intensity in candela (lm/sr) while directional lights use illuminance in lux (lm/m2) |
| range | Single | Hint defining a distance cutoff at which the light's intensity may be considered to have reached zero. Supported only for point and spot lights. Must be &gt; 0. When undefined, range is assumed to be infinite. |

### See Also

* class [PunctualLight](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../punctuallight/)
* assembly [Aspose.CAD](../../../)


