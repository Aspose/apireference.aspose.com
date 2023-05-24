---
title: convert method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 20
url: /aspose.cad/icolorconverter/convert/
is_root: false
---

## convert {#aspose.cad.PixelDataFormat-bytes-int-int-int-int-aspose.cad.PixelDataFormat-bytes-int}

Converts the passed data to the output format.


### Returns 


The converted bytes count.


```python
def convert(self, source_format, data, offset, bit_start, samples_count, lines_count, dest_format, output_data, output_offset):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| source_format | [`PixelDataFormat`](/cad/python-net/aspose.cad/pixeldataformat) | The source format. |
| data | bytes | The source data. |
| offset | int | The offset in bytes where data copying should begin. |
| bit_start | int | The bit start. Note this value is not byte aligned value instead this is actual bit where copying should begin. |
| samples_count | int | The samples count. |
| lines_count | int | The lines count. |
| dest_format | [`PixelDataFormat`](/cad/python-net/aspose.cad/pixeldataformat) | The destination format. |
| output_data | bytes | The output data. |
| output_offset | int | The output offset where data copying should start. |



### See Also
* module [`aspose.cad`](../../)
* class [`IColorConverter`](/cad/python-net/aspose.cad/icolorconverter)
