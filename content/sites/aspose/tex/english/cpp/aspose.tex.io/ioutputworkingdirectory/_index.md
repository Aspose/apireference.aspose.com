---
title: Aspose::TeX::IO::IOutputWorkingDirectory class
linktitle: IOutputWorkingDirectory
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::IOutputWorkingDirectory class. Interface of generalized output working directory in C++.'
type: docs
weight: 800
url: /cpp/aspose.tex.io/ioutputworkingdirectory/
---
## IOutputWorkingDirectory class


Interface of generalized output working directory.

```cpp
class IOutputWorkingDirectory : public virtual Aspose::TeX::IO::IInputWorkingDirectory
```

## Methods

| Method | Description |
| --- | --- |
| virtual [GetFile](../iinputworkingdirectory/getfile/)(System::String, bool) | Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a [NamedStream](../namedstream/) object with a null Stream property value instead. |
| virtual [GetOutputFile](./getoutputfile/)(System::String) | Returns the stream to write to. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a [NamedStream](../namedstream/) object with a null Stream property value instead. |
## See Also

* Class [IInputWorkingDirectory](../iinputworkingdirectory/)
* Namespace [Aspose::TeX::IO](../)
* Library [Aspose.TeX for C++](../../)
