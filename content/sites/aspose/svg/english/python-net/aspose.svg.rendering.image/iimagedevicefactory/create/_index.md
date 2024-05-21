---
title: create method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.rendering.image/iimagedevicefactory/create/
is_root: false
---

## create {#aspose.svg.rendering.image.ImageRenderingOptions-aspose.svg.io.ICreateStreamProvider}

Creates an image device with the specified rendering options and stream provider.


### Returns 


The created image device.


```python
def create(self, options, stream_provider):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| options | [`ImageRenderingOptions`](/svg/python-net/aspose.svg.rendering.image/imagerenderingoptions) | The rendering options for the image device. See [`ImageRenderingOptions`](/svg/python-net/aspose.svg.rendering.image/imagerenderingoptions). |
| stream_provider | aspose.svg.io.ICreateStreamProvider | The stream provider used to create the image stream. See [`ICreateStreamProvider`](/svg/python-net/aspose.svg.io/icreatestreamprovider). |


## create {#aspose.svg.rendering.image.ImageRenderingOptions-str}

Creates an image device with the specified rendering options and file path.


### Returns 


The created image device.


```python
def create(self, options, file):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| options | [`ImageRenderingOptions`](/svg/python-net/aspose.svg.rendering.image/imagerenderingoptions) | The rendering options for the image device. See [`ImageRenderingOptions`](/svg/python-net/aspose.svg.rendering.image/imagerenderingoptions). |
| file | str | The file path where the image will be saved. |


## create {#aspose.svg.rendering.image.ImageRenderingOptions-io.RawIOBase}

Creates an image device with the specified rendering options and stream.


### Returns 


The created image device.


```python
def create(self, options, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| options | [`ImageRenderingOptions`](/svg/python-net/aspose.svg.rendering.image/imagerenderingoptions) | The rendering options for the image device. See [`ImageRenderingOptions`](/svg/python-net/aspose.svg.rendering.image/imagerenderingoptions). |
| stream | io.RawIOBase | The stream used to save the image. |



### See Also
* module [`aspose.svg.rendering.image`](../../)
* class [`ICreateStreamProvider`](/svg/python-net/aspose.svg.io/icreatestreamprovider)
* class [`IImageDeviceFactory`](/svg/python-net/aspose.svg.rendering.image/iimagedevicefactory)
* class [`ImageRenderingOptions`](/svg/python-net/aspose.svg.rendering.image/imagerenderingoptions)
