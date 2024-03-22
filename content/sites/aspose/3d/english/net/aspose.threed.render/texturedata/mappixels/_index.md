---
title: TextureData.MapPixels
second_title: Aspose.3D for .NET API Reference
description: TextureData method. Map all pixels for read/write
type: docs
weight: 100
url: /net/aspose.threed.render/texturedata/mappixels/
---
## MapPixels(PixelMapMode) {#mappixels}

Map all pixels for read/write

```csharp
public PixelMapping MapPixels(PixelMapMode mapMode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mapMode | PixelMapMode | Map mode |

### See Also

* class [PixelMapping](../../pixelmapping/)
* enum [PixelMapMode](../../pixelmapmode/)
* class [TextureData](../)
* namespace [Aspose.ThreeD.Render](../../../aspose.threed.render/)
* assembly [Aspose.3D](../../../)

---

## MapPixels(PixelMapMode, PixelFormat) {#mappixels_1}

Map all pixels for read/write in given pixel format

```csharp
public PixelMapping MapPixels(PixelMapMode mapMode, PixelFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| mapMode | PixelMapMode | Map mode |
| format | PixelFormat | Pixel format |

### See Also

* class [PixelMapping](../../pixelmapping/)
* enum [PixelMapMode](../../pixelmapmode/)
* enum [PixelFormat](../../pixelformat/)
* class [TextureData](../)
* namespace [Aspose.ThreeD.Render](../../../aspose.threed.render/)
* assembly [Aspose.3D](../../../)

---

## MapPixels(Rect, PixelMapMode, PixelFormat) {#mappixels_2}

Map pixels addressed by rect for reading/writing in given pixel format

```csharp
public PixelMapping MapPixels(Rect rect, PixelMapMode mapMode, PixelFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| rect | Rect | The area of pixels to be accessed |
| mapMode | PixelMapMode | Map mode |
| format | PixelFormat | Pixel format |

### Return Value

Returns a mapping object, it should be disposed when no longer needed.

### Exceptions

| exception | condition |
| --- | --- |
| NotSupportedException |  |

### See Also

* class [PixelMapping](../../pixelmapping/)
* struct [Rect](../../../aspose.threed.utilities/rect/)
* enum [PixelMapMode](../../pixelmapmode/)
* enum [PixelFormat](../../pixelformat/)
* class [TextureData](../)
* namespace [Aspose.ThreeD.Render](../../../aspose.threed.render/)
* assembly [Aspose.3D](../../../)


