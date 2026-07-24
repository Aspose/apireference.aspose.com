---
title: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes 方法"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes 方法。验证默认属性的标识约束，并在元素上下文中使用 XmlSchemaValidator::ValidateAttribute 方法先前未验证的具有默认值的属性，填充指定的 List，包含 XmlSchemaAttribute 对象，适用于 C++。"
type: docs
weight: 900
url: /zh/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


验证默认属性的标识约束，并在元素上下文中使用 [XmlSchemaValidator::ValidateAttribute](../validateattribute/) 方法先前未验证的具有默认值的属性，填充指定的 List，包含 [XmlSchemaAttribute](../../xmlschemaattribute/) 对象。

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | 用于在元素上下文的验证期间填充尚未遇到的属性的 [XmlSchemaAttribute](../../xmlschemaattribute/) 对象的 List。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
