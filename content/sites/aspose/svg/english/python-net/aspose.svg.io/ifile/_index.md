---
title: IFile class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.svg.io/ifile/
is_root: false
---

## IFile class

A File object is a Blob object with a name attribute, which is a string; it can be created within the web application via a constructor, or is a reference to a byte sequence from a file from the underlying (OS) file system.



The IFile type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [name](/svg/python-net/aspose.svg.io/ifile/name) | The name of the file.<br/>On getting, this must return the name of the file as a string. |
| [last_modified](/svg/python-net/aspose.svg.io/ifile/last_modified) | The last modified date of the file. On getting, if user agents can make this information available, <br/>this must return a long long set to the time the file was last modified as the number of milliseconds since the Unix Epoch. |
| [size](/svg/python-net/aspose.svg.io/ifile/size) | Returns the size of the byte sequence in number of bytes.<br/>On getting, conforming user agents must return the total number of bytes that can be read by a FileReader <br/>or FileReaderSync object, or 0 if the Blob has no bytes to be read. |
| [type](/svg/python-net/aspose.svg.io/ifile/type) | The ASCII-encoded string in lower case representing the media type of the Blob.<br/>On getting, user agents must return the type of a Blob as an ASCII-encoded string in lower case, <br/>such that when it is converted to a byte sequence, it is a parsable MIME type, <br/>or the empty string – 0 bytes – if the type cannot be determined. |


### Methods
| Method | Description |
| :- | :- |
| [slice](/svg/python-net/aspose.svg.io/ifile/slice/#int-int-str) | Returns a new Blob object with bytes ranging from the optional start parameter up to but not including the optional end parameter, <br/>and with a type attribute that is the value of the optional contentType parameter. |



### See Also
* module [`aspose.svg.io`](..)
* class [`IBlob`](/svg/python-net/aspose.svg.io/iblob)
