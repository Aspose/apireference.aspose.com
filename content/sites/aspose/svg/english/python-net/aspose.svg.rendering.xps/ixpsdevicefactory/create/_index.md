---
title: create method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.rendering.xps/ixpsdevicefactory/create/
is_root: false
---

## create {#aspose.svg.rendering.xps.XpsRenderingOptions-aspose.svg.io.ICreateStreamProvider}

Creates an XPS device with the specified rendering options and stream provider.


### Returns 


The created XPS device.


```python
def create(self, options, stream_provider):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| options | [`XpsRenderingOptions`](/svg/python-net/aspose.svg.rendering.xps/xpsrenderingoptions) | The rendering options for the XPS device. See [`XpsRenderingOptions`](/svg/python-net/aspose.svg.rendering.xps/xpsrenderingoptions). |
| stream_provider | aspose.svg.io.ICreateStreamProvider | The stream provider used to create the XPS output stream. See [`ICreateStreamProvider`](/svg/python-net/aspose.svg.io/icreatestreamprovider). |


## create {#aspose.svg.rendering.xps.XpsRenderingOptions-str}

Creates an XPS device with the specified rendering options and file path.


### Returns 


The created XPS device.


```python
def create(self, options, file):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| options | [`XpsRenderingOptions`](/svg/python-net/aspose.svg.rendering.xps/xpsrenderingoptions) | The rendering options for the XPS device. See [`XpsRenderingOptions`](/svg/python-net/aspose.svg.rendering.xps/xpsrenderingoptions). |
| file | str | The file path for the XPS output. |


## create {#aspose.svg.rendering.xps.XpsRenderingOptions-io.RawIOBase}

Creates an XPS device with the specified rendering options and stream.


### Returns 


The created XPS device.


```python
def create(self, options, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| options | [`XpsRenderingOptions`](/svg/python-net/aspose.svg.rendering.xps/xpsrenderingoptions) | The rendering options for the XPS device. See [`XpsRenderingOptions`](/svg/python-net/aspose.svg.rendering.xps/xpsrenderingoptions). |
| stream | io.RawIOBase | The stream for the XPS output. |



### See Also
* module [`aspose.svg.rendering.xps`](../../)
* class [`ICreateStreamProvider`](/svg/python-net/aspose.svg.io/icreatestreamprovider)
* class [`IXpsDeviceFactory`](/svg/python-net/aspose.svg.rendering.xps/ixpsdevicefactory)
* class [`XpsRenderingOptions`](/svg/python-net/aspose.svg.rendering.xps/xpsrenderingoptions)
