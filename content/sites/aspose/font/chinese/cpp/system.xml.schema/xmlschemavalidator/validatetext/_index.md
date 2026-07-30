---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateText 方法"
linktitle: "ValidateText"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateText 方法。验证指定的文本字符串是否在当前元素上下文中被允许，并在当前元素具有简单内容时累计文本以供验证（C++）。"
type: docs
weight: 2000
url: /zh/cpp/system.xml.schema/xmlschemavalidator/validatetext/
---
## XmlSchemaValidator::ValidateText(const String\&) method


验证在当前元素上下文中指定的文本 **string** 是否被允许，如果当前元素具有简单内容，则累计该文本以供验证。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateText(const String &elementValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| elementValue | const String\& | 在当前元素上下文中需要验证的文本 **string**。 |

## 另见

* Class [String](../../../system/string/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateText(XmlValueGetter) method


验证由指定的 [XmlValueGetter](../../xmlvaluegetter/) 对象返回的文本是否在当前元素上下文中被允许，并在当前元素具有简单内容时累计文本以供验证。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateText(XmlValueGetter elementValue)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| elementValue | XmlValueGetter | 一个 [XmlValueGetter](../../xmlvaluegetter/) 回调，用于将文本值以兼容属性的 XML [Schema](../../) 定义语言（XSD）类型的形式传递。 |

## 另见

* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
