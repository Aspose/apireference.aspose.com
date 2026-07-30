---
title: "System::Xml::Schema::XmlSchemaValidationFlags 枚举"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags 枚举。指定 C++ 中 XmlSchemaValidator 和 XmlReader 类使用的模式验证选项。"
type: docs
weight: 7900
url: /zh/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


指定由 [XmlSchemaValidator](../xmlschemavalidator/) 和 [XmlReader](../../system.xml/xmlreader/) 类使用的模式验证选项。

```cpp
enum class XmlSchemaValidationFlags
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| 无 | 0 | 不要处理标识约束、内联模式、模式位置提示，或报告模式验证警告。 |
| ProcessInlineSchema | 1 | 处理验证期间遇到的内联模式。 |
| ProcessSchemaLocation | 2 | 在验证期间遇到的处理模式位置提示 (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**)。 |
| ReportValidationWarnings | 4 | 在验证期间遇到的报告模式验证警告。 |
| ProcessIdentityConstraints | 8 | 在验证期间遇到的处理身份约束 (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**)。 |
| AllowXmlAttributes | 16 | 即使 xml:* 属性未在模式中定义，也允许它们。属性将根据其数据类型进行验证。 |

## 另见

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
