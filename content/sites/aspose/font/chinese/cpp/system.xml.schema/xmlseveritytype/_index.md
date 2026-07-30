---
title: "System::Xml::Schema::XmlSeverityType 枚举"
linktitle: "XmlSeverityType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSeverityType 枚举。表示在 C++ 中验证事件的严重程度。"
type: docs
weight: 8100
url: /zh/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


表示验证事件的严重性。

```cpp
enum class XmlSeverityType
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| Error | 0 | 指示在验证实例文档时发生了验证错误。这适用于文档类型定义（DTDs）和 XML [Schema](../) 定义语言（XSD）模式。万维网 [Web](../../system.web/) 联盟（W3C）的有效性约束被视为错误。如果未创建验证事件处理程序，错误将抛出异常。 |
| Warning | 1 | 指示发生了非错误的验证事件。当没有 DTD，或没有 XML [Schema](../) 可用于验证特定元素或属性时，通常会发出警告。与错误不同，如果没有验证事件处理程序，警告不会抛出异常。 |

## 另见

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
