---
title: "System::Xml::ValidationType 枚举"
linktitle: "ValidationType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::ValidationType 枚举。指定在 C++ 中执行的验证类型。"
type: docs
weight: 5500
url: /zh/cpp/system.xml/validationtype/
---
## ValidationType enum


指定要执行的验证类型。

```cpp
enum class ValidationType
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 | 不执行验证，也不会抛出验证错误。此设置创建符合 XML 1.0 的非验证解析器。 |
| Auto | 1 | 如果找到 DTD 或模式信息，则进行验证。 |
| DTD | 2 | 根据 DTD 进行验证。 |
| XDR | 3 | 根据 XML-Data Reduced (XDR) 架构进行验证，包括内联 XDR 架构。XDR 架构通过 **x-schema** 命名空间前缀或 [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/) 值进行识别。 |
| Schema | 4 | 根据 XML [Schema](../../system.xml.schema/) 定义语言 (XSD) 架构进行验证，包括内联 XML 架构。XML 架构通过使用 **schemaLocation** 属性或提供的 **Schemas** 与命名空间 URI 关联。 |

## 另见

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
