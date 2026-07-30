---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace 方法"
linktitle: "ValidateWhitespace"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace 方法。验证指定字符串中的空白是否在当前元素上下文中被允许；如果当前元素具有简单内容，则在 C++ 中累积空白以进行验证。"
type: docs
weight: 2100
url: /zh/cpp/system.xml.schema/xmlschemavalidator/validatewhitespace/
---
## XmlSchemaValidator::ValidateWhitespace(const String\&) method


验证在当前元素上下文中指定的 **string** 中的空白是否被允许，如果当前元素具有简单内容，则累计该空白以供验证。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace(const String &elementValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| elementValue | const String\& | 用于在当前元素上下文中验证的空白 **string**。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateWhitespace(XmlValueGetter) method


验证由指定的 [XmlValueGetter](../../xmlvaluegetter/) 对象返回的空白是否在当前元素上下文中被允许；如果当前元素具有简单内容，则累积空白以进行验证。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace(XmlValueGetter elementValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| elementValue | XmlValueGetter | 一个 [XmlValueGetter](../../xmlvaluegetter/) 回调，用于将空白值以兼容属性的 XML [Schema](../../) 定义语言 (XSD) 类型的形式传递。 |

## 另见

* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
