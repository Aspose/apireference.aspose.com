---
title: load method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 70
url: /python-net/aspose.cad.fileformats.bitmap/bitmapimage/load/
is_root: false
---

## load {#str}

Loads a new image from the specified file.


### Returns 


The loaded drawing.


```python
def load(self, file_path):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | The file path to load image from. |

### Example 


Loads a drawing to process


## load {#io.RawIOBase}

Loads a new image from the specified stream.


### Returns 


The loaded drawing.


```python
def load(self, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The stream to load image from. |

### Example 


Loads a drawing to process from corresponding stream


## load {#str-aspose.cad.LoadOptions}

Loads a new image from the specified file.


### Returns 


The loaded drawing.


```python
def load(self, file_path, load_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | The file path to load image from. |
| load_options | [`LoadOptions`](/cad/python-net/aspose.cad/loadoptions) | The load options. |

### Example 


Loads a drawing to process and unloads all related resources when dispose is called


## load {#io.RawIOBase-aspose.cad.LoadOptions}

Loads a new image from the specified stream.


### Returns 


The loaded drawing.


```python
def load(self, stream, load_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The stream to load image from. |
| load_options | [`LoadOptions`](/cad/python-net/aspose.cad/loadoptions) | The load options. |

### Example 


Loads a drawing to process from corresponding stream and unloads all related resources when dispose is called


## load {#io.RawIOBase-str-aspose.cad.LoadOptions}

Loads a new image from the specified stream.


### Returns 


The loaded drawing.


```python
def load(self, stream, file_name, load_options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The stream to load image from. |
| file_name | str | The file name. |
| load_options | [`LoadOptions`](/cad/python-net/aspose.cad/loadoptions) | The load options. |

### Example 


Loads a drawing to process from corresponding stream



### See Also
* module [`aspose.cad.fileformats.bitmap`](../../)
* class [`BitmapImage`](/cad/python-net/aspose.cad.fileformats.bitmap/bitmapimage)
