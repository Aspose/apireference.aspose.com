---
title: set_transform method
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 390
url: /python-net/aspose.page.eps.device/pdfdevice/set_transform/
is_root: false
---

## set_transform {#aspose.pydrawing.drawing2d.Matrix}

Specifies the current transform. Since most output formats do not
implement this functionality, the inverse transform of the
currentTransform is calculated and multiplied by the
transform to be set.The result is then forwarded by a call
to writeTransform(Transform).



```python
def set_transform(self, transform):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| transform | aspose.pydrawing.drawing2d.Matrix | Transform to be applied. |



### See Also
* module [`aspose.page.eps.device`](../../)
* class [`PdfDevice`](/page/python-net/aspose.page.eps.device/pdfdevice)
