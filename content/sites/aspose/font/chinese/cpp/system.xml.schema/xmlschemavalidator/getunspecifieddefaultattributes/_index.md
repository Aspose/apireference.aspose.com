---
title: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes 方法"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes 方法。验证默认属性上的标识约束，并在元素上下文中使用 XmlSchemaValidator::ValidateAttribute 方法先前未验证的具有默认值的属性时，将指定的 List 填充为 XmlSchemaAttribute 对象，在 C++ 中。"
type: docs
weight: 900
url: /zh/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


验证默认属性上的标识约束，并在元素上下文中使用 [XmlSchemaValidator::ValidateAttribute](../validateattribute/) 方法先前未验证的具有默认值的属性时，将指定的 List 填充为 [XmlSchemaAttribute](../../xmlschemaattribute/) 对象。

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | 用于在元素上下文中填充 List 的 [XmlSchemaAttribute](../../xmlschemaattribute/) 对象，以包含任何尚未在验证期间遇到的属性。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
