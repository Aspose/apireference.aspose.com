---
title: Aspose::TeX::IO::IInputWorkingDirectory class
linktitle: IInputWorkingDirectory
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::IO::IInputWorkingDirectory class. Interface of generalized input working directory in C++.'
type: docs
weight: 300
url: /cpp/aspose.tex.io/iinputworkingdirectory/
---
## IInputWorkingDirectory class


Interface of generalized input working directory.

```cpp
class IInputWorkingDirectory : public System::IDisposable
```

## Methods

| Method | Description |
| --- | --- |
| virtual [GetFile](./getfile/)(System::String, bool) | Returns the stream to read from. MUST NOT return a null object. In case a stream cannot be returned, it MUST return a [NamedStream](../namedstream/) object with a null Stream property value instead. |
## See Also

* Namespace [Aspose::TeX::IO](../)
* Library [Aspose.TeX for C++](../../)
