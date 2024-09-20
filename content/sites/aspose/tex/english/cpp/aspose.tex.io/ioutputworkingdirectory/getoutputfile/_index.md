---
title: Aspose::TeX::IO::IOutputWorkingDirectory::GetOutputFile method
linktitle: GetOutputFile
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::IOutputWorkingDirectory::GetOutputFile method. Returns the stream to write to. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a NamedStream object with a null Stream property value instead in C++.'
type: docs
weight: 100
url: /cpp/aspose.tex.io/ioutputworkingdirectory/getoutputfile/
---
## IOutputWorkingDirectory::GetOutputFile method


Returns the stream to write to. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a [NamedStream](../../namedstream/) object with a null Stream property value instead.

```cpp
virtual System::SharedPtr<NamedStream> Aspose::TeX::IO::IOutputWorkingDirectory::GetOutputFile(System::String fileName)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| fileName | System::String | The file name. |

### ReturnValue

The named stream.

## See Also

* Class [NamedStream](../../namedstream/)
* Class [IOutputWorkingDirectory](../)
* Namespace [Aspose::TeX::IO](../../)
* Library [Aspose.TeX for C++](../../../)
