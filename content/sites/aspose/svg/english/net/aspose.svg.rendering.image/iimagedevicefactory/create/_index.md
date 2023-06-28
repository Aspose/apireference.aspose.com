---
title: IImageDeviceFactory.Create
second_title: Aspose.SVG for .NET API Reference
description: IImageDeviceFactory method. Creates an image device with the specified rendering options and stream provider
type: docs
weight: 10
url: /net/aspose.svg.rendering.image/iimagedevicefactory/create/
---
## Create(ImageRenderingOptions, ICreateStreamProvider) {#create}

Creates an image device with the specified rendering options and stream provider.

```csharp
public IDevice Create(ImageRenderingOptions options, ICreateStreamProvider streamProvider)
```

| Parameter | Type | Description |
| --- | --- | --- |
| options | ImageRenderingOptions | The rendering options for the image device. See [`ImageRenderingOptions`](../../imagerenderingoptions/). |
| streamProvider | ICreateStreamProvider | The stream provider used to create the image stream. See [`ICreateStreamProvider`](../../../aspose.svg.io/icreatestreamprovider/). |

### Return Value

The created image device.

### See Also

* interface [IDevice](../../../aspose.svg.rendering/idevice/)
* class [ImageRenderingOptions](../../imagerenderingoptions/)
* interface [ICreateStreamProvider](../../../aspose.svg.io/icreatestreamprovider/)
* interface [IImageDeviceFactory](../)
* namespace [Aspose.Svg.Rendering.Image](../../../aspose.svg.rendering.image/)
* assembly [Aspose.SVG](../../../)

---

## Create(ImageRenderingOptions, string) {#create_2}

Creates an image device with the specified rendering options and file path.

```csharp
public IDevice Create(ImageRenderingOptions options, string file)
```

| Parameter | Type | Description |
| --- | --- | --- |
| options | ImageRenderingOptions | The rendering options for the image device. See [`ImageRenderingOptions`](../../imagerenderingoptions/). |
| file | String | The file path where the image will be saved. |

### Return Value

The created image device.

### See Also

* interface [IDevice](../../../aspose.svg.rendering/idevice/)
* class [ImageRenderingOptions](../../imagerenderingoptions/)
* interface [IImageDeviceFactory](../)
* namespace [Aspose.Svg.Rendering.Image](../../../aspose.svg.rendering.image/)
* assembly [Aspose.SVG](../../../)

---

## Create(ImageRenderingOptions, Stream) {#create_1}

Creates an image device with the specified rendering options and stream.

```csharp
public IDevice Create(ImageRenderingOptions options, Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| options | ImageRenderingOptions | The rendering options for the image device. See [`ImageRenderingOptions`](../../imagerenderingoptions/). |
| stream | Stream | The stream used to save the image. |

### Return Value

The created image device.

### See Also

* interface [IDevice](../../../aspose.svg.rendering/idevice/)
* class [ImageRenderingOptions](../../imagerenderingoptions/)
* interface [IImageDeviceFactory](../)
* namespace [Aspose.Svg.Rendering.Image](../../../aspose.svg.rendering.image/)
* assembly [Aspose.SVG](../../../)
