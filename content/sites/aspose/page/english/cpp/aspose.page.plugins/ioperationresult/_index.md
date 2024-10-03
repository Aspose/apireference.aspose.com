---
title: Aspose::Page::Plugins::IOperationResult class
linktitle: IOperationResult
second_title: Aspose.Page for C++
description: 'Aspose::Page::Plugins::IOperationResult class. General operation result interface that defines common methods that concrete plugin operation result should implement in C++.'
type: docs
weight: 700
url: /cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


General operation result interface that defines common methods that concrete plugin operation result should implement.

```cpp
class IOperationResult : public virtual System::Object
```

## Methods

| Method | Description |
| --- | --- |
| virtual [get_Data](./get_data/)() | Gets raw data. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Indicates whether the result is a byte array. |
| virtual [get_IsFile](./get_isfile/)() | Indicates whether the result is a path to an output file. |
| virtual [get_IsStream](./get_isstream/)() | Indicates whether the result is an output stream. |
| virtual [get_IsString](./get_isstring/)() | Indicates whether the result is a text string. |
| virtual [ToFile](./tofile/)() | Tries to convert the result to the file. |
| virtual [ToStream](./tostream/)() | Tries to convert the result to the stream object. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
