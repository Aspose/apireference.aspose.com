---
title: save method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 90
url: /aspose.cad.fileformats.stp/stpimage/save/
is_root: false
---

## save {#}

Saves the image data to the underlying stream.



```python
def save(self):
    ...
```




## save {#io.RawIOBase}

Saves the object's data to the specified stream.



```python
def save(self, stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The stream to save the object's data to. |


## save {#str}

Saves the object's data to the specified file location.



```python
def save(self, file_path):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | The file path to save the object's data to. |


## save {#str-aspose.cad.ImageOptionsBase}

Saves the object's data to the specified file location in the specified file format according to save options.



```python
def save(self, file_path, options):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | The file path. |
| options | [`ImageOptionsBase`](/cad/python-net/aspose.cad/imageoptionsbase) | The options. |


## save {#io.RawIOBase-aspose.cad.ImageOptionsBase}

Saves the image's data to the specified stream in the specified file format according to save options.



```python
def save(self, stream, options_base):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| stream | io.RawIOBase | The stream to save the image's data to. |
| options_base | [`ImageOptionsBase`](/cad/python-net/aspose.cad/imageoptionsbase) | The save options. |
### Exceptions
| Exception | Description |
| :- | :- |
| ArgumentNullException | optionsBase |
| ArgumentException | Cannot save to the specified format as it is not supported at the moment.;optionsBase |
| [`ImageSaveException`](/cad/python-net/aspose.cad.cadexceptions/imagesaveexception) | Image export failed. |




## save {#str-bool}

Saves the object's data to the specified file location.



```python
def save(self, file_path, over_write):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | The file path to save the object's data to. |
| over_write | bool | if set to `true` over write the file contents, otherwise append will occur. |



### See Also
* module [`aspose.cad.fileformats.stp`](../../)
* class [`ImageSaveException`](/cad/python-net/aspose.cad.cadexceptions/imagesaveexception)
* class [`StpImage`](/cad/python-net/aspose.cad.fileformats.stp/stpimage)
