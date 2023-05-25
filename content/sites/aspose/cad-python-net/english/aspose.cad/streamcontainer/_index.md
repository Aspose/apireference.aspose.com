---
title: StreamContainer class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 540
url: /aspose.cad/streamcontainer/
is_root: false
---

## StreamContainer class

Represents stream container which contains the stream and provides stream processing routines.



**Inheritance:** [`StreamContainer`](/cad/python-net/aspose.cad/streamcontainer) → 
[`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)



The StreamContainer type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad/streamcontainer/__init__/#io.RawIOBase) | Initializes a new instance of the [`StreamContainer`](/cad/python-net/aspose.cad/streamcontainer) class. |
| [__init__](/cad/python-net/aspose.cad/streamcontainer/__init__/#io.RawIOBase-bool) | Initializes a new instance of the [`StreamContainer`](/cad/python-net/aspose.cad/streamcontainer) class. |


### Properties
| Property | Description |
| :- | :- |
| [disposed](/cad/python-net/aspose.cad/streamcontainer/disposed) | Gets a value indicating whether this instance is disposed. |
| [sync_root](/cad/python-net/aspose.cad/streamcontainer/sync_root) | Gets an object that can be used to synchronize access to the synchronized resource. |
| [position](/cad/python-net/aspose.cad/streamcontainer/position) | Gets or sets the current position within the stream. This value represents offset from the starting stream position passed in the StreamContainer constructor. |
| [stream](/cad/python-net/aspose.cad/streamcontainer/stream) | Gets the data stream. |
| [is_stream_disposed_on_close](/cad/python-net/aspose.cad/streamcontainer/is_stream_disposed_on_close) | Gets a value indicating whether this stream is disposed on close. |
| [length](/cad/python-net/aspose.cad/streamcontainer/length) | Gets or sets the stream length in bytes. This value is less than the Length by the starting stream position passed in the StreamContainer constructor. |
| [can_read](/cad/python-net/aspose.cad/streamcontainer/can_read) | Gets a value indicating whether stream supports reading. |
| [can_seek](/cad/python-net/aspose.cad/streamcontainer/can_seek) | Gets a value indicating whether stream supports seeking. |
| [can_write](/cad/python-net/aspose.cad/streamcontainer/can_write) | Gets a value indicating whether stream supports writing. |
| [READ_WRITE_BYTES_COUNT](/cad/python-net/aspose.cad/streamcontainer/read_write_bytes_count) | Specifies read and write bytes count when reading sequentially. |


### Methods
| Method | Description |
| :- | :- |
| [write](/cad/python-net/aspose.cad/streamcontainer/write/#bytes) | Writes all of the specified bytes to the stream. |
| [write](/cad/python-net/aspose.cad/streamcontainer/write/#bytes-int-int) | Writes a sequence of bytes to the current stream and advances the current position within this stream by the number of bytes written. |
| [read](/cad/python-net/aspose.cad/streamcontainer/read/#bytes) | Reads bytes to fill the specified bytes buffer. |
| [read](/cad/python-net/aspose.cad/streamcontainer/read/#bytes-int-int) | Reads a sequence of bytes from the current stream and advances the position within the stream by the number of bytes read. |
| [to_bytes](/cad/python-net/aspose.cad/streamcontainer/to_bytes/#) | Converts the stream data to the Byte array. |
| [to_bytes](/cad/python-net/aspose.cad/streamcontainer/to_bytes/#int-int) | Converts the stream data to the Byte array. |
| [save](/cad/python-net/aspose.cad/streamcontainer/save/#io.RawIOBase) | Saves (copies) the stream's data to the specified stream. Uses default buffer size [`StreamContainer.ReadWriteBytesCount`](/cad/python-net/aspose.cad/streamcontainer) and stream [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value. |
| [save](/cad/python-net/aspose.cad/streamcontainer/save/#io.RawIOBase-int) | Saves (copies) all the stream's data to the specified stream. Uses stream [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value. |
| [save](/cad/python-net/aspose.cad/streamcontainer/save/#io.RawIOBase-int-int) | Saves (copies) the stream's data to the specified stream. |
| [save](/cad/python-net/aspose.cad/streamcontainer/save/#str) | Saves (copies) the stream's data to the specified stream. Uses default buffer size [`StreamContainer.ReadWriteBytesCount`](/cad/python-net/aspose.cad/streamcontainer) and stream [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value. |
| [save](/cad/python-net/aspose.cad/streamcontainer/save/#str-int) | Saves (copies) the stream's data to the specified stream. Uses stream [`StreamContainer.length`](/cad/python-net/aspose.cad/streamcontainer#length) value. |
| [save](/cad/python-net/aspose.cad/streamcontainer/save/#str-int-int) | Saves (copies) the stream's data to the specified stream. |
| [write_to](/cad/python-net/aspose.cad/streamcontainer/write_to/#aspose.cad.StreamContainer) | Copies the contained data to another [`StreamContainer`](/cad/python-net/aspose.cad/streamcontainer). |
| [write_to](/cad/python-net/aspose.cad/streamcontainer/write_to/#aspose.cad.StreamContainer-int) | Copies the contained data to another [`StreamContainer`](/cad/python-net/aspose.cad/streamcontainer). |
| [flush](/cad/python-net/aspose.cad/streamcontainer/flush/#) | Clears all buffers for this stream and causes any buffered data to be written to the underlying device. |
| [write_byte](/cad/python-net/aspose.cad/streamcontainer/write_byte/#byte) | Writes a byte to the current position in the stream and advances the position within the stream by one byte. |
| [read_byte](/cad/python-net/aspose.cad/streamcontainer/read_byte/#) | Reads a byte from the stream and advances the position within the stream by one byte, or returns -1 if at the end of the stream. |
| [seek](/cad/python-net/aspose.cad/streamcontainer/seek/#int-aspose.cad.SeekOrigin) | Sets the position within the current stream. |
| [seek_begin](/cad/python-net/aspose.cad/streamcontainer/seek_begin/#) | Sets the stream position to the beginning of the stream. This value represents offset from the starting stream position passed in the StreamContainer constructor. |



### See Also
* module [`aspose.cad`](..)
* class [`DisposableObject`](/cad/python-net/aspose.cad/disposableobject)
* class [`StreamContainer`](/cad/python-net/aspose.cad/streamcontainer)
