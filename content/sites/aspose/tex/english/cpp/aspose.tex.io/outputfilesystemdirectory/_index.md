---
title: Aspose::TeX::IO::OutputFileSystemDirectory class
linktitle: OutputFileSystemDirectory
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::OutputFileSystemDirectory class. Implements the regular file system''s method for getting a file stream to write to in C++.'
type: docs
weight: 1300
url: /cpp/aspose.tex.io/outputfilesystemdirectory/
---
## OutputFileSystemDirectory class


Implements the regular file system's method for getting a file stream to write to.

```cpp
class OutputFileSystemDirectory : public Aspose::TeX::IO::InputFileSystemDirectory,
                                  public Aspose::TeX::IO::IOutputWorkingDirectory
```

## Methods

| Method | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Disposes the instance. |
| [GetFile](../inputfilesystemdirectory/getfile/)(System::String, bool) override | Returns the stream to read from. |
| [GetFileNamesByExtension](../inputfilesystemdirectory/getfilenamesbyextension/)(System::String, System::String) override | Returns the array of file names by an extension. |
| [GetOutputFile](./getoutputfile/)(System::String) override | Returns the stream to write to. |
| [InputFileSystemDirectory](../inputfilesystemdirectory/inputfilesystemdirectory/)(System::String) | Creates new instance. |
| [OutputFileSystemDirectory](./outputfilesystemdirectory/)(System::String) | Creates new instance. |
## See Also

* Class [InputFileSystemDirectory](../inputfilesystemdirectory/)
* Class [IOutputWorkingDirectory](../ioutputworkingdirectory/)
* Namespace [Aspose::TeX::IO](../)
* Library [Aspose.TeX for C++](../../)
