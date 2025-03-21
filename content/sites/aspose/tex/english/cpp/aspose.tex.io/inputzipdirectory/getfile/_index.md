---
title: Aspose::TeX::IO::InputZipDirectory::GetFile method
linktitle: GetFile
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::InputZipDirectory::GetFile method. Returns the stream to read from in C++.'
type: docs
weight: 300
url: /cpp/aspose.tex.io/inputzipdirectory/getfile/
---
## InputZipDirectory::GetFile method


Returns the stream to read from.

```cpp
System::SharedPtr<NamedStream> Aspose::TeX::IO::InputZipDirectory::GetFile(System::String fileName, bool searchSubdirectories=false) override
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
* Class [InputZipDirectory](../)
* Namespace [Aspose::TeX::IO](../../)
* Library [Aspose.TeX for C++](../../../)
