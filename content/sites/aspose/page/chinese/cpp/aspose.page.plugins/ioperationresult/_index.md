---
title: "Aspose::Page::Plugins::IOperationResult 类"
linktitle: "IOperationResult"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::Plugins::IOperationResult 类。定义具体插件操作结果在 C++ 中应实现的通用方法的操作结果接口。"
type: docs
weight: 700
url: /zh/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


通用操作结果接口，定义具体插件操作结果应实现的通用方法。

```cpp
class IOperationResult : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_Data](./get_data/)() | 获取原始数据。 |
| virtual [get_IsByteArray](./get_isbytearray/)() | 指示结果是否为字节数组。 |
| virtual [get_IsFile](./get_isfile/)() | 指示结果是否为输出文件的路径。 |
| virtual [get_IsStream](./get_isstream/)() | 指示结果是否为输出流。 |
| virtual [get_IsString](./get_isstring/)() | 指示结果是否为文本字符串。 |
| virtual [ToFile](./tofile/)() | 尝试将结果转换为文件。 |
| virtual [ToStream](./tostream/)() | 尝试将结果转换为流对象。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
