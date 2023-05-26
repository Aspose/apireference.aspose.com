---
title: read method
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 50
url: /aspose.cad/filestreamcontainer/read/
is_root: false
---

## read {#bytes}

Reads bytes to fill the specified bytes buffer.


### Returns 


The number of bytes read. This value can be less than the number of bytes in the buffer if there is not enough bytes in the stream.


```python
def read(self, bytes):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| bytes | bytes | The bytes to fill. |


## read {#bytes-int-int}

Reads a sequence of bytes from the current stream and advances the position within the stream by the number of bytes read.


### Returns 


The total number of bytes read into the buffer. This can be less than the number of bytes requested if that many bytes are not currently available, or zero (0) if the end of the stream has been reached.


```python
def read(self, buffer, offset, count):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| buffer | bytes | An array of bytes. When this method returns, the buffer contains the specified byte array with the values between `offset` and (`offset` + `count` - 1) replaced by the bytes read from the current source. |
| offset | int | The zero-based byte offset in `buffer` at which to begin storing the data read from the current stream. |
| count | int | The maximum number of bytes to be read from the current stream. |



### See Also
* module [`aspose.cad`](../../)
* class [`FileStreamContainer`](/cad/python-net/aspose.cad/filestreamcontainer)
