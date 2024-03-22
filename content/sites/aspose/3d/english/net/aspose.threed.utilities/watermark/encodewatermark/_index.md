---
title: Watermark.EncodeWatermark
second_title: Aspose.3D for .NET API Reference
description: Watermark method. Encode a text into mesh blind watermark
type: docs
weight: 20
url: /net/aspose.threed.utilities/watermark/encodewatermark/
---
## EncodeWatermark(Mesh, string) {#encodewatermark}

Encode a text into mesh' blind watermark.

```csharp
public static Mesh EncodeWatermark(Mesh input, string text)
```

| Parameter | Type | Description |
| --- | --- | --- |
| input | Mesh | Mesh to encode a blind watermark |
| text | String | Text to encode to the mesh |

### Return Value

A new mesh instance with blind watermark encoded

### Examples

The following code shows how to encode a blind watermark into a mesh and save to ply file

```csharp
Mesh mesh = (new Cylinder()).ToMesh();
var encodedMesh = Watermark.EncodeWatermark(mesh, "Hello");
new Scene(encodedMesh).Save("test.ply");
```

### See Also

* class [Mesh](../../../aspose.threed.entities/mesh/)
* class [Watermark](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)

---

## EncodeWatermark(Mesh, string, string) {#encodewatermark_1}

Encode a text into mesh' blind watermark.

```csharp
public static Mesh EncodeWatermark(Mesh input, string text, string password)
```

| Parameter | Type | Description |
| --- | --- | --- |
| input | Mesh | Mesh to encode a blind watermark |
| text | String | Text to encode to the mesh |
| password | String | Password to protect the watermark, it's optional |

### Return Value

A new mesh instance with blind watermark encoded

### Examples

The following code shows how to encode a blind watermark into a mesh and save to ply file

```csharp
Mesh mesh = (new Cylinder()).ToMesh();
var encodedMesh = Watermark.EncodeWatermark(mesh, "Hello", "password");
new Scene(encodedMesh).Save("test.ply");
```

### See Also

* class [Mesh](../../../aspose.threed.entities/mesh/)
* class [Watermark](../)
* namespace [Aspose.ThreeD.Utilities](../../../aspose.threed.utilities/)
* assembly [Aspose.3D](../../../)


