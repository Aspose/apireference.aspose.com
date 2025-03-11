---
title: Watermark.DecodeWatermark
second_title: Aspose.3D for .NET API Reference
description: Watermark method. Decode the watermark from a mesh
type: docs
weight: 10
url: /net/aspose.threed.utilities/watermark/decodewatermark/
---
## DecodeWatermark(Mesh) {#decodewatermark}

Decode the watermark from a mesh

```csharp
public static string DecodeWatermark(Mesh input)
```

| Parameter | Type | Description |
| --- | --- | --- |
| input | Mesh | The mesh to extract watermark |

### Return Value

Blind watermark or null if no watermark decoded.

### Exceptions

| exception | condition |
| --- | --- |
| UnauthorizedAccessException | The mesh is protected by password, and provided password is incorrect. |

## Remarks

Both [`EncodeWatermark`](../encodewatermark/) and `DecodeWatermark` will perform license check Trial usage will throw exception, you can use [`SuppressTrialException`](../../../aspose.threed/trialexception/suppresstrialexception/) to suppress the exception, but it will not lift the restriction here. A valid license is required to use these features without any restrictions.

## Examples

The following code shows how to decode a blind watermark from a mesh saved in 3D file

```csharp
Mesh mesh = (Mesh)FileFormat.PLY.Decode("test.ply");
String watermark = Watermark.DecodeWatermark(mesh);
```

### See Also

* class [Mesh](../../../aspose.threed.entities/mesh/)
* class [Watermark](../)
* namespace [Aspose.ThreeD.Utilities](../../watermark/)
* assembly [Aspose.3D](../../../)

---

## DecodeWatermark(Mesh, string) {#decodewatermark_1}

Decode the watermark from a mesh

```csharp
public static string DecodeWatermark(Mesh input, string password)
```

| Parameter | Type | Description |
| --- | --- | --- |
| input | Mesh | The mesh to extract watermark |
| password | String | The password to decrypt the watermark |

### Return Value

Blind watermark or null if no watermark decoded.

### Exceptions

| exception | condition |
| --- | --- |
| UnauthorizedAccessException | The mesh is protected by password, and provided password is incorrect. |

## Examples

The following code shows how to decode a blind watermark from a mesh saved in 3D file

```csharp
Mesh mesh = (Mesh)FileFormat.PLY.Decode("test.ply");
String watermark = Watermark.DecodeWatermark(mesh, "password");
```

### See Also

* class [Mesh](../../../aspose.threed.entities/mesh/)
* class [Watermark](../)
* namespace [Aspose.ThreeD.Utilities](../../watermark/)
* assembly [Aspose.3D](../../../)


