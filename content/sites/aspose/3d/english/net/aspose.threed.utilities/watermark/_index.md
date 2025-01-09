---
title: Class Watermark
second_title: Aspose.3D for .NET API Reference
description: Aspose.ThreeD.Utilities.Watermark class. Utility to encode/decode blind watermark to/from a mesh
type: docs
weight: 2850
url: /net/aspose.threed.utilities/watermark/
---
## Watermark class

Utility to encode/decode blind watermark to/from a mesh.

```csharp
public class Watermark
```

## Methods

| Name | Description |
| --- | --- |
| static [DecodeWatermark](../../aspose.threed.utilities/watermark/decodewatermark/#decodewatermark)(Mesh) | Decode the watermark from a mesh |
| static [DecodeWatermark](../../aspose.threed.utilities/watermark/decodewatermark/#decodewatermark_1)(Mesh, string) | Decode the watermark from a mesh |
| static [EncodeWatermark](../../aspose.threed.utilities/watermark/encodewatermark/#encodewatermark)(Mesh, string) | Encode a text into mesh' blind watermark. |
| static [EncodeWatermark](../../aspose.threed.utilities/watermark/encodewatermark/#encodewatermark_1)(Mesh, string, string) | Encode a text into mesh' blind watermark. |
| static [EncodeWatermark](../../aspose.threed.utilities/watermark/encodewatermark/#encodewatermark_2)(Mesh, string, string, bool) | Encode a text into mesh' blind watermark. |

### Remarks

Both [`EncodeWatermark`](./encodewatermark/) and [`DecodeWatermark`](./decodewatermark/) will perform license check Trial usage will throw exception, you can use [`SuppressTrialException`](../../aspose.threed/trialexception/suppresstrialexception/) to suppress the exception, but it will not lift the restriction here. A valid license is required to use these features without any restrictions.

### Examples

The following code shows how to encode a blind watermark into a mesh and decode it.

```csharp
Mesh mesh = (new Cylinder()).ToMesh();
var encodedMesh = Watermark.EncodeWatermark(mesh, "Hello", null);
var watermark = Watermark.DecodeWatermark(encodedMesh, null);
```

### See Also

* namespace [Aspose.ThreeD.Utilities](../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../)


