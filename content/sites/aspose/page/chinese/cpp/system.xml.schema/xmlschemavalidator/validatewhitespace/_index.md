---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace 方法"
linktitle: "ValidateWhitespace"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace 方法。验证在指定字符串中的空白是否在当前元素上下文中被允许，并在当前元素具有简单内容时累计空白以进行验证（C++）。"
type: docs
weight: 2100
url: /zh/cpp/system.xml.schema/xmlschemavalidator/validatewhitespace/
---
## XmlSchemaValidator::ValidateWhitespace(const String\&) method


验证指定的 **string** 中的空白是否在当前元素上下文中被允许；如果当前元素具有简单内容，则累计该空白以供验证。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace(const String &elementValue)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| elementValue | const String\& | 在当前元素上下文中验证的空白 **string**。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateWhitespace(XmlValueGetter) method


验证由指定的 [XmlValueGetter](../../xmlvaluegetter/) 对象返回的空白是否在当前元素上下文中被允许，并在当前元素具有简单内容时累计空白以进行验证。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace(XmlValueGetter elementValue)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| elementValue | XmlValueGetter | 一个用于将空白值作为与属性的 XML [Schema](../../) 定义语言 (XSD) 类型兼容的类型传递的 [XmlValueGetter](../../xmlvaluegetter/) 回调。 |

## 另见

* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
