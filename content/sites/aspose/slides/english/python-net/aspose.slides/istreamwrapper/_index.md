---
title: IStreamWrapper
second_title: Aspose.Sildes for Python via .NET API Reference
description: 
type: docs
weight: 2610
url: /python-net/aspose.slides/istreamwrapper/
---

## IStreamWrapper class

Aspose.IO.Stream wrapper for COM interface.

The IStreamWrapper type exposes the following members:
## Properties
| Name | Description |
| :- | :- |
|stream|Gets a stream.<br/>            Read-only stream.|
|can_read|Gets a value indicating whether the current stream supports reading.<br/>            Read-only bool.|
|can_seek|Gets a value indicating whether the current stream supports seeking.<br/>            Read-only bool.|
|can_write|Gets a value indicating whether the current stream supports writing.<br/>            Read-only bool.|
|length|Gets the length in bytes of the stream.<br/>            Read-only int.|
|position|Gets the position within the current stream.<br/>            Read-only int.|
|as_i_disposable|Allows to get base IDisposable interface.<br/>            Read-only disposable.|
## Methods
| Name | Description |
| :- | :- |
|close()|Closes the current stream and releases any resources.|
|flush()|Clears all buffers for this stream and causes any buffered data to be written to the underlying device.|
|read(buffer, offset, count)|Reads a sequence of bytes from the current stream and advances the position within the stream by the number of bytes read.|
|read_byte()|Reads a byte from the stream and advances the position within the stream by one byte, or returns -1 if at the end of the stream.|
|seek(offset, origin)|Sets the position within the current stream|
|write(buffer, offset, count)|writes a sequence of bytes to the current stream and advances the current position within this stream by the number of bytes written.|
|write_byte(value)|Writes a byte to the current position in the stream and advances the position within the stream by one byte.|

### See Also

* namespace [aspose.slides](/slides/python-net/aspose.slides/)
* assembly [Aspose.Slides](/slides/python-net/)

