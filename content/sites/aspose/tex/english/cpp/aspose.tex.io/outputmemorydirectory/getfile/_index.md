---
title: Aspose::TeX::IO::OutputMemoryDirectory::GetFile method
linktitle: GetFile
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::OutputMemoryDirectory::GetFile method. Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead in C++.'
type: docs
weight: 200
url: /cpp/aspose.tex.io/outputmemorydirectory/getfile/
---
## OutputMemoryDirectory::GetFile method


Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a [NamedStream](../../namedstream/) object with a null Stream property value instead.

```cpp
System::SharedPtr<NamedStream> Aspose::TeX::IO::OutputMemoryDirectory::GetFile(System::String fileName, bool searchSubdirectories=false) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| fileName | System::String | The file name. |
| searchSubdirectories | bool | Indicates whether to look for a file in subdirectories. |

### ReturnValue

The named stream.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NamedStream](../../namedstream/)
* Class [String](../../../system/string/)
* Class [OutputMemoryDirectory](../)
* Namespace [Aspose::TeX::IO](../../)
* Library [Aspose.TeX for C++](../../../)
