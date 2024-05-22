---
title: IBlob class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 20
url: /python-net/aspose.svg.io/iblob/
is_root: false
---

## IBlob class

A Blob object refers to a byte sequence, and has a size attribute which is the total number of bytes in the byte sequence, and a type attribute, which is an ASCII-encoded string in lower case representing the media type of the byte sequence.



The IBlob type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [size](/svg/python-net/aspose.svg.io/iblob/size) | Returns the size of the byte sequence in number of bytes.<br/>On getting, conforming user agents must return the total number of bytes that can be read by a FileReader <br/>or FileReaderSync object, or 0 if the Blob has no bytes to be read. |
| [type](/svg/python-net/aspose.svg.io/iblob/type) | The ASCII-encoded string in lower case representing the media type of the Blob.<br/>On getting, user agents must return the type of a Blob as an ASCII-encoded string in lower case, <br/>such that when it is converted to a byte sequence, it is a parsable MIME type, <br/>or the empty string – 0 bytes – if the type cannot be determined. |


### Methods
| Method | Description |
| :- | :- |
| [slice](/svg/python-net/aspose.svg.io/iblob/slice/#int-int-str) | Returns a new Blob object with bytes ranging from the optional start parameter up to but not including the optional end parameter, <br/>and with a type attribute that is the value of the optional contentType parameter. |



### See Also
* module [`aspose.svg.io`](..)
