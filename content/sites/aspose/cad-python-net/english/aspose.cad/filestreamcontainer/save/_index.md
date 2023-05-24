---
title: save method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 70
url: /aspose.cad/filestreamcontainer/save/
is_root: false
---

## save {#io.RawIOBase}

Saves (copies) the stream's data to the specified stream. Uses default buffer size [`StreamContainer.ReadWriteBytesCount`](/cad/python-net/aspose.cad/streamcontainer) and stream [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value.



```python
def save(self, destination_stream):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| destination_stream | io.RawIOBase | The stream to save the data to. |


## save {#str}

Saves (copies) the stream's data to the specified stream. Uses default buffer size [`StreamContainer.ReadWriteBytesCount`](/cad/python-net/aspose.cad/streamcontainer) and stream [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value.



```python
def save(self, file_path):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | The file path to save the stream data to. |


## save {#io.RawIOBase-int}

Saves (copies) all the stream's data to the specified stream. Uses stream [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value.



```python
def save(self, destination_stream, buffer_size):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| destination_stream | io.RawIOBase | The stream to save the data to. |
| buffer_size | int | The buffer. |


## save {#str-int}

Saves (copies) the stream's data to the specified stream. Uses stream [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value.



```python
def save(self, file_path, buffer_size):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | The file path to save the stream data to. |
| buffer_size | int | The buffer size. By default [`StreamContainer.ReadWriteBytesCount`](/cad/python-net/aspose.cad/streamcontainer) value is used. |


## save {#io.RawIOBase-int-int}

Saves (copies) the stream's data to the specified stream.



```python
def save(self, destination_stream, buffer_size, length):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| destination_stream | io.RawIOBase | The stream to save the data to. |
| buffer_size | int | The buffer size. By default [`StreamContainer.ReadWriteBytesCount`](/cad/python-net/aspose.cad/streamcontainer) value is used. |
| length | int | The stream data length to copy. By default the length is set to [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value. |


## save {#str-int-int}

Saves (copies) the stream's data to the specified stream.



```python
def save(self, file_path, buffer_size, length):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| file_path | str | The file path to save the stream data to. |
| buffer_size | int | The buffer size. By default [`StreamContainer.ReadWriteBytesCount`](/cad/python-net/aspose.cad/streamcontainer) value is used. |
| length | int | The stream data length to copy. By default the length is set to [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value. |



### See Also
* module [`aspose.cad`](../../)
* class [`FileStreamContainer`](/cad/python-net/aspose.cad/filestreamcontainer)
