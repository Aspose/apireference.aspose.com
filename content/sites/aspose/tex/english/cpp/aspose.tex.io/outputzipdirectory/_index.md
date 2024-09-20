---
title: Aspose::TeX::IO::OutputZipDirectory class
linktitle: OutputZipDirectory
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::OutputZipDirectory class. Implements the method for getting a file stream to write to when working directory is a ZIP archive in C++.'
type: docs
weight: 1600
url: /cpp/aspose.tex.io/outputzipdirectory/
---
## OutputZipDirectory class


Implements the method for getting a file stream to write to when working directory is a ZIP archive.

```cpp
class OutputZipDirectory : public Aspose::TeX::IO::IOutputWorkingDirectory
```

## Methods

| Method | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Disposes the instance. |
| [Finish](./finish/)() | Finalizes ZIP archive. |
| [GetFile](./getfile/)(System::String, bool) override | Returns the stream to read from. |
| [GetOutputFile](./getoutputfile/)(System::String) override | Returns the stream to write to. |
| [OutputZipDirectory](./outputzipdirectory/)(System::SharedPtr\<System::IO::Stream\>) | Creates new instance. |
## See Also

* Class [IOutputWorkingDirectory](../ioutputworkingdirectory/)
* Namespace [Aspose::TeX::IO](../)
* Library [Aspose.TeX for C++](../../)
