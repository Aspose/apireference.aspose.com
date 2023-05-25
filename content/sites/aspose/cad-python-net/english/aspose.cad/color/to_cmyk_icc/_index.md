---
title: to_cmyk_icc method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 110
url: /aspose.cad/color/to_cmyk_icc/
is_root: false
---

## to_cmyk_icc {#aspose.cad.Color}

The conversion from Color to CMYKColor using icc conversion with default profiles.
This method is deprecated. Please use more effective Aspose.Imaging.CmykColorHelper.ToCmykIcc.


### Returns 


The [`CmykColor`](/cad/python-net/aspose.cad/cmykcolor).


```python
def to_cmyk_icc(self, pixel):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| pixel | [`Color`](/cad/python-net/aspose.cad/color) | The pixel of Color type in RGB format. |


## to_cmyk_icc {#list}

The conversion from Color to CMYKColor using icc conversion with default profiles.
This method is deprecated. Please use more effective Aspose.Imaging.CmykColorHelper.ToCmykIcc.


### Returns 


The Aspose:CAD:CmykColor[].


```python
def to_cmyk_icc(self, pixels):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| pixels | list | The pixels of Color type in RGB format. |


## to_cmyk_icc {#list-io.RawIOBase-io.RawIOBase}

The conversion from Color to CMYKColor using icc conversion.
This method is deprecated. Please use more effective Aspose.Imaging.CmykColorHelper.ToCmykIcc.


### Returns 


The Aspose:Imaging:CmykColor[].


```python
def to_cmyk_icc(self, pixels, rgb_icc_stream, cmyk_icc_stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| pixels | list | The pixels of Color type in RGB format. |
| rgb_icc_stream | io.RawIOBase | The stream containing icc rgb profile. |
| cmyk_icc_stream | io.RawIOBase | The stream containing icc cmyk profile. |


## to_cmyk_icc {#aspose.cad.Color-io.RawIOBase-io.RawIOBase}

The conversion from Color to CMYKColor using icc conversion with default profiles.
This method is deprecated. Please use more effective Aspose.Imaging.CmykColorHelper.ToCmykIcc.


### Returns 


The Aspose:CAD:CmykColor[].


```python
def to_cmyk_icc(self, pixel, rgb_icc_stream, cmyk_icc_stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| pixel | [`Color`](/cad/python-net/aspose.cad/color) | The pixel of Color type in RGB format. |
| rgb_icc_stream | io.RawIOBase | The stream containing icc rgb profile. |
| cmyk_icc_stream | io.RawIOBase | The stream containing icc cmyk profile. |



### See Also
* module [`aspose.cad`](../../)
* class [`CmykColor`](/cad/python-net/aspose.cad/cmykcolor)
* class [`Color`](/cad/python-net/aspose.cad/color)
