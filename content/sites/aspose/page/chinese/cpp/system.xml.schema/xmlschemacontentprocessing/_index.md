---
title: "System::Xml::Schema::XmlSchemaContentProcessing enum"
linktitle: "XmlSchemaContentProcessing"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaContentProcessing enum. 提供有关 C++ 中 any 和 anyAttribute 元素替换的验证模式的信息。"
type: docs
weight: 7300
url: /zh/cpp/system.xml.schema/xmlschemacontentprocessing/
---
## XmlSchemaContentProcessing enum


提供有关 **any** 和 **anyAttribute** 元素替代的验证模式的信息。

```cpp
enum class XmlSchemaContentProcessing
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| None | 0 | 文档项未验证。 |
| 跳过 | 1 | 文档项必须是格式良好的 XML，并且不受模式验证。 |
| 宽松 | 2 | 如果找到关联的模式，文档项将被验证。否则不会抛出错误。 |
| 严格 | 3 | 模式处理器必须找到与指定命名空间关联的模式，以验证文档项。 |

## 另见

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
