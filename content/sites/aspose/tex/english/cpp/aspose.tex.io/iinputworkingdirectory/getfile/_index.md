---
title: Aspose::TeX::IO::IInputWorkingDirectory::GetFile method
linktitle: GetFile
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::IInputWorkingDirectory::GetFile method. Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead in C++.'
type: docs
weight: 100
url: /cpp/aspose.tex.io/iinputworkingdirectory/getfile/
---
## IInputWorkingDirectory::GetFile method


Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a [NamedStream](../../namedstream/) object with a null Stream property value instead.

```cpp
virtual System::SharedPtr<NamedStream> Aspose::TeX::IO::IInputWorkingDirectory::GetFile(System::String fileName, bool searchSubdirectories=false)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| fileName | System::String | The file name. |
| searchSubdirectories | bool | Indicates whether to look for a file in subdirectories. |

### ReturnValue

The named stream.

## See Also

* Class [NamedStream](../../namedstream/)
* Class [IInputWorkingDirectory](../)
* Namespace [Aspose::TeX::IO](../../)
* Library [Aspose.TeX for C++](../../../)
