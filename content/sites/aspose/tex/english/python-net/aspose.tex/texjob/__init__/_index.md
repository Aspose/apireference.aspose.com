---
title: TeXJob constructor
second_title: Aspose.TeX for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.tex/texjob/__init__/
is_root: false
---

## __init__ {#aspose.tex.presentation.Device-aspose.tex.TeXOptions}

Creates a TeX job for running the engine in production mode to typeset a TeX document.
The engine will prompt the file name as soon as it starts.
Thus this run is supposed to be interactive.



```python
def __init__(self, device, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| device | aspose.tex.presentation.Device | The device defining output representation. |
| options | [`TeXOptions`](/tex/python-net/aspose.tex/texoptions) | TeX engine run options. |


## __init__ {#io.RawIOBase-aspose.tex.presentation.Device-aspose.tex.TeXOptions}

Creates a TeX job for running the engine in production mode to typeset a TeX file.



```python
def __init__(self, stream, device, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The stream containing the TeX file. |
| device | aspose.tex.presentation.Device | The device defining output representation. |
| options | [`TeXOptions`](/tex/python-net/aspose.tex/texoptions) | TeX engine run options. |


## __init__ {#str-aspose.tex.presentation.Device-aspose.tex.TeXOptions}

Creates a TeX job for running the engine in production mode to typeset a TeX file.



```python
def __init__(self, path, device, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| path | str | The path to the TeX file. |
| device | aspose.tex.presentation.Device | The device defining output representation. |
| options | [`TeXOptions`](/tex/python-net/aspose.tex/texoptions) | TeX engine run options. |



### See Also
* module [`aspose.tex`](../../)
* class [`TeXJob`](/tex/python-net/aspose.tex/texjob)
