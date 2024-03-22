---
title: Scene.Render
second_title: Aspose.3D for .NET API Reference
description: Scene method. Render the scene into external file from given cameras perspective. The default output size is 1024x768 and output format is png
type: docs
weight: 150
url: /net/aspose.threed/scene/render/
---
## Render(Camera, string) {#render_2}

Render the scene into external file from given camera's perspective. The default output size is 1024x768 and output format is png

```csharp
public void Render(Camera camera, string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| fileName | String | The file name of output file |

### See Also

* class [Camera](../../../aspose.threed.entities/camera/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Render(Camera, string, Vector2, string) {#render_3}

Render the scene into external file from given camera's perspective.

```csharp
public void Render(Camera camera, string fileName, Vector2 size, string format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| fileName | String | The file name of output file |
| size | Vector2 | The size of final rendered image |
| format | String | The image format of the output file |

### See Also

* class [Camera](../../../aspose.threed.entities/camera/)
* struct [Vector2](../../../aspose.threed.utilities/vector2/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Render(Camera, string, Vector2, string, ImageRenderOptions) {#render_4}

Render the scene into external file from given camera's perspective.

```csharp
public void Render(Camera camera, string fileName, Vector2 size, string format, 
    ImageRenderOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| fileName | String | The file name of output file |
| size | Vector2 | The size of final rendered image |
| format | String | The image format of the output file |
| options | ImageRenderOptions | The option to customize some internal settings. |

### See Also

* class [Camera](../../../aspose.threed.entities/camera/)
* struct [Vector2](../../../aspose.threed.utilities/vector2/)
* class [ImageRenderOptions](../../imagerenderoptions/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Render(Camera, TextureData) {#render}

Render the scene into bitmap from given camera's perspective.

```csharp
public void Render(Camera camera, TextureData bitmap)
```

| Parameter | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| bitmap | TextureData | Target of the rendered result |

### See Also

* class [Camera](../../../aspose.threed.entities/camera/)
* class [TextureData](../../../aspose.threed.render/texturedata/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Render(Camera, TextureData, ImageRenderOptions) {#render_1}

Render the scene into bitmap from given camera's perspective.

```csharp
public void Render(Camera camera, TextureData bitmap, ImageRenderOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| camera | Camera | From which camera's perspective to render the scene |
| bitmap | TextureData | Target of the rendered result |
| options | ImageRenderOptions | The option to customize some internal settings. |

### See Also

* class [Camera](../../../aspose.threed.entities/camera/)
* class [TextureData](../../../aspose.threed.render/texturedata/)
* class [ImageRenderOptions](../../imagerenderoptions/)
* class [Scene](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)


