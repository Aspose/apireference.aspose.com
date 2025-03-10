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

## Remarks

Both `EncodeWatermark` and [`DecodeWatermark`](../decodewatermark/) will perform license check Trial usage will throw exception, you can use [`SuppressTrialException`](../../../aspose.threed/trialexception/suppresstrialexception/) to suppress the exception, but it will not lift the restriction here. A valid license is required to use these features without any restrictions.

## Examples

The following code shows how to encode a blind watermark into a mesh and save to ply file

```csharp
Mesh mesh = (new Cylinder()).ToMesh();
var encodedMesh = Watermark.EncodeWatermark(mesh, "Hello");
new Scene(encodedMesh).Save("test.ply");
```

### See Also

* class [Mesh](../../../aspose.threed.entities/mesh/)
* class [Watermark](../)
* namespace [Aspose.ThreeD.Utilities](../../watermark/)
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

## Remarks

Both `EncodeWatermark` and [`DecodeWatermark`](../decodewatermark/) will perform license check Trial usage will throw exception, you can use [`SuppressTrialException`](../../../aspose.threed/trialexception/suppresstrialexception/) to suppress the exception, but it will not lift the restriction here. A valid license is required to use these features without any restrictions.

## Examples

The following code shows how to encode a blind watermark into a mesh and save to ply file

```csharp
Mesh mesh = (new Cylinder()).ToMesh();
var encodedMesh = Watermark.EncodeWatermark(mesh, "Hello", "password");
new Scene(encodedMesh).Save("test.ply");
```

### See Also

* class [Mesh](../../../aspose.threed.entities/mesh/)
* class [Watermark](../)
* namespace [Aspose.ThreeD.Utilities](../../watermark/)
* assembly [Aspose.3D](../../../)

---

## EncodeWatermark(Mesh, string, string, bool) {#encodewatermark_2}

Encode a text into mesh' blind watermark.

```csharp
public static Mesh EncodeWatermark(Mesh input, string text, string password, bool permanent)
```

| Parameter | Type | Description |
| --- | --- | --- |
| input | Mesh | Mesh to encode a blind watermark |
| text | String | Text to encode to the mesh |
| password | String | Password to protect the watermark, it's optional |
| permanent | Boolean | The permanent watermark will not be overwritten or removed. |

### Return Value

A new mesh instance with blind watermark encoded

## Remarks

Both `EncodeWatermark` and [`DecodeWatermark`](../decodewatermark/) will perform license check Trial usage will throw exception, you can use [`SuppressTrialException`](../../../aspose.threed/trialexception/suppresstrialexception/) to suppress the exception, but it will not lift the restriction here. A valid license is required to use these features without any restrictions.

## Examples

The following code shows how to encode a blind watermark into a mesh and save to ply file

```csharp
Mesh mesh = (new Cylinder()).ToMesh();
var encodedMesh = Watermark.EncodeWatermark(mesh, "Hello", "password");
new Scene(encodedMesh).Save("test.ply");
```

### See Also

* class [Mesh](../../../aspose.threed.entities/mesh/)
* class [Watermark](../)
* namespace [Aspose.ThreeD.Utilities](../../watermark/)
* assembly [Aspose.3D](../../../)


