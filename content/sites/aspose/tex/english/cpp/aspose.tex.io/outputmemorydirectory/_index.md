---
title: Aspose::TeX::IO::OutputMemoryDirectory class
linktitle: OutputMemoryDirectory
second_title: Aspose.TeX for C++
description: 'How to use Aspose::TeX::IO::OutputMemoryDirectory class in C++.'
type: docs
weight: 1500
url: /cpp/aspose.tex.io/outputmemorydirectory/
---
## OutputMemoryDirectory class




```cpp
class OutputMemoryDirectory : public Aspose::TeX::IO::IOutputWorkingDirectory
```

## Methods

| Method | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Does nothing. |
| [GetFile](./getfile/)(System::String, bool) override | Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a [NamedStream](../namedstream/) object with a null Stream property value instead. |
| [GetOutputFile](./getoutputfile/)(System::String) override | Returns the stream to write to. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a [NamedStream](../namedstream/) object with a null Stream property value instead. |
| [OutputMemoryDirectory](./outputmemorydirectory/)() |  |
## See Also

* Class [IOutputWorkingDirectory](../ioutputworkingdirectory/)
* Namespace [Aspose::TeX::IO](../)
* Library [Aspose.TeX for C++](../../)
