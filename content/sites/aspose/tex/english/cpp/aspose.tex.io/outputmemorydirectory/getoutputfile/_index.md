---
title: Aspose::TeX::IO::OutputMemoryDirectory::GetOutputFile method
linktitle: GetOutputFile
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::OutputMemoryDirectory::GetOutputFile method. Returns the stream to write to. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead in C++.'
type: docs
weight: 300
url: /cpp/aspose.tex.io/outputmemorydirectory/getoutputfile/
---
## OutputMemoryDirectory::GetOutputFile method


Returns the stream to write to. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a [NamedStream](../../namedstream/) object with a null Stream property value instead.

```cpp
System::SharedPtr<NamedStream> Aspose::TeX::IO::OutputMemoryDirectory::GetOutputFile(System::String fileName) override
```


| Parameter | Type | Description |
| --- | --- | --- |
| fileName | System::String | The file name. |

### ReturnValue

The named stream.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NamedStream](../../namedstream/)
* Class [String](../../../system/string/)
* Class [OutputMemoryDirectory](../)
* Namespace [Aspose::TeX::IO](../../)
* Library [Aspose.TeX for C++](../../../)
