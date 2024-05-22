---
title: create method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.rendering.pdf/ipdfdevicefactory/create/
is_root: false
---

## create {#aspose.svg.rendering.pdf.PdfRenderingOptions-aspose.svg.io.ICreateStreamProvider}

Creates a PDF device with the specified rendering options and stream provider.


### Returns 


The created PDF device.


```python
def create(self, options, stream_provider):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| options | [`PdfRenderingOptions`](/svg/python-net/aspose.svg.rendering.pdf/pdfrenderingoptions) | The rendering options for the PDF device. See [`PdfRenderingOptions`](/svg/python-net/aspose.svg.rendering.pdf/pdfrenderingoptions). |
| stream_provider | aspose.svg.io.ICreateStreamProvider | The stream provider used to create the PDF output stream. See [`ICreateStreamProvider`](/svg/python-net/aspose.svg.io/icreatestreamprovider). |


## create {#aspose.svg.rendering.pdf.PdfRenderingOptions-str}

Creates a PDF device with the specified rendering options and file path.


### Returns 


The created PDF device.


```python
def create(self, options, file):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| options | [`PdfRenderingOptions`](/svg/python-net/aspose.svg.rendering.pdf/pdfrenderingoptions) | The rendering options for the PDF device. See [`PdfRenderingOptions`](/svg/python-net/aspose.svg.rendering.pdf/pdfrenderingoptions). |
| file | str | The file path for the PDF output. |


## create {#aspose.svg.rendering.pdf.PdfRenderingOptions-io.RawIOBase}

Creates a PDF device with the specified rendering options and stream.


### Returns 


The created PDF device.


```python
def create(self, options, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| options | [`PdfRenderingOptions`](/svg/python-net/aspose.svg.rendering.pdf/pdfrenderingoptions) | The rendering options for the PDF device. See [`PdfRenderingOptions`](/svg/python-net/aspose.svg.rendering.pdf/pdfrenderingoptions). |
| stream | io.RawIOBase | The stream for the PDF output. |



### See Also
* module [`aspose.svg.rendering.pdf`](../../)
* class [`ICreateStreamProvider`](/svg/python-net/aspose.svg.io/icreatestreamprovider)
* class [`IPdfDeviceFactory`](/svg/python-net/aspose.svg.rendering.pdf/ipdfdevicefactory)
* class [`PdfRenderingOptions`](/svg/python-net/aspose.svg.rendering.pdf/pdfrenderingoptions)
