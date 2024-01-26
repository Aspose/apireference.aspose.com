---
title: PsDocument constructor
second_title: Aspose.Page for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.page.eps/psdocument/__init__/
is_root: false
---

## __init__ {#io.RawIOBase}

Initializes [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) with a stream of PS/EPS file.



```python
def __init__(self, in_ps_stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| in_ps_stream | io.RawIOBase | Input stream of PS/EPS file. |


## __init__ {#io.RawIOBase-aspose.page.eps.device.PsSaveOptions}

Initializes empty [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) with initialized page.



```python
def __init__(self, out_ps_stream, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| out_ps_stream | io.RawIOBase | Stream where to save PS/EPS file. |
| options | aspose.page.eps.device.PsSaveOptions | A set of parameters controlling saving of PostScript file. |


## __init__ {#io.RawIOBase-aspose.page.eps.device.PsSaveOptions-bool}

Initializes empty [`PsDocument`](/page/python-net/aspose.page.eps/psdocument).



```python
def __init__(self, out_ps_stream, options, multipaged):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| out_ps_stream | io.RawIOBase | Stream where to save PS/EPS file. |
| options | aspose.page.eps.device.PsSaveOptions | A set of parameters controlling saving of PostScript file. |
| multipaged | bool | If false page will not be initialized. In this case page initialization should be performed via explicit "openPage(width, height) call. |


## __init__ {#io.RawIOBase-aspose.page.eps.device.PsSaveOptions-int}

Initializes empty [`PsDocument`](/page/python-net/aspose.page.eps/psdocument) when the number of Postscript document pages is known in advance.



```python
def __init__(self, out_ps_stream, options, number_of_pages):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| out_ps_stream | io.RawIOBase | Stream where to save PS/EPS file. |
| options | aspose.page.eps.device.PsSaveOptions | A set of parameters controlling saving of PostScript file. |
| number_of_pages | int | The number of pages in the PostScript document. |



### See Also
* module [`aspose.page.eps`](../../)
* class [`PsDocument`](/page/python-net/aspose.page.eps/psdocument)
