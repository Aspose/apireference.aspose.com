---
title: process method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.cad/ipartialrawdataloader/process/
is_root: false
---

## process {#aspose.cad.Rectangle-bytes-aspose.cad.Point-aspose.cad.Point}

Processes the loaded data.



```python
def process(self, rectangle, data, start, end):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rectangle | [`Rectangle`](/cad/python-net/aspose.cad/rectangle) | The data rectangle. |
| data | bytes | The raw data. |
| start | [`Point`](/cad/python-net/aspose.cad/point) | The start data point. If not equal to (left,top) meaning that it is not full rectangle we have. |
| end | [`Point`](/cad/python-net/aspose.cad/point) | The end data point. If not equal to (right,bottom) meaning that it is not full rectangle we have. |


## process {#aspose.cad.Rectangle-bytes-aspose.cad.Point-aspose.cad.Point-aspose.cad.LoadOptions}

Processes the loaded data.



```python
def process(self, rectangle, data, start, end, load_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| rectangle | [`Rectangle`](/cad/python-net/aspose.cad/rectangle) | The data rectangle. |
| data | bytes | The raw data. |
| start | [`Point`](/cad/python-net/aspose.cad/point) | The start data point. If not equal to (left,top) meaning that it is not full rectangle we have. |
| end | [`Point`](/cad/python-net/aspose.cad/point) | The end data point. If not equal to (right,bottom) meaning that it is not full rectangle we have. |
| load_options | [`LoadOptions`](/cad/python-net/aspose.cad/loadoptions) | The load options. |



### See Also
* module [`aspose.cad`](../../)
* class [`IPartialRawDataLoader`](/cad/python-net/aspose.cad/ipartialrawdataloader)
