---
title: Aspose::TeX::IO::InputFileSystemDirectory class
linktitle: InputFileSystemDirectory
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::InputFileSystemDirectory class. Implements the regular file system''s method for getting a file stream to read from in C++.'
type: docs
weight: 500
url: /cpp/aspose.tex.io/inputfilesystemdirectory/
---
## InputFileSystemDirectory class


Implements the regular file system's method for getting a file stream to read from.

```cpp
class InputFileSystemDirectory : public virtual Aspose::TeX::IO::IInputWorkingDirectory,
                                 public Aspose::TeX::IO::IFileCollector
```

## Methods

| Method | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Disposes the instance. |
| [GetFile](./getfile/)(System::String, bool) override | Returns the stream to read from. |
| [GetFileNamesByExtension](./getfilenamesbyextension/)(System::String, System::String) override | Returns the array of file names by an extension. |
| [InputFileSystemDirectory](./inputfilesystemdirectory/)(System::String) | Creates new instance. |
## See Also

* Class [IInputWorkingDirectory](../iinputworkingdirectory/)
* Class [IFileCollector](../ifilecollector/)
* Namespace [Aspose::TeX::IO](../)
* Library [Aspose.TeX for C++](../../)
