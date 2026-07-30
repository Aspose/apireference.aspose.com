---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateElement 方法"
linktitle: "ValidateElement"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateElement 方法。验证 C++ 中当前上下文中的元素。"
type: docs
weight: 1700
url: /zh/cpp/system.xml.schema/xmlschemavalidator/validateelement/
---
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


在当前上下文中验证该元素。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | const String\& | 要验证的元素的本地名称。 |
| namespaceUri | const String\& | 要验证的元素的命名空间 URI。 |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 一个 [XmlSchemaInfo](../../xmlschemainfo/) 对象，其属性在成功验证元素名称后被设置。此参数可以为 **nullptr**。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateElement(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) method


在当前上下文中验证该元素，并使用已指定的 **xsi:Type**、**xsi:Nil**、**xsi:SchemaLocation** 和 **xsi:NoNamespaceSchemaLocation** 属性值。

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateElement(const String &localName, const String &namespaceUri, const SharedPtr<XmlSchemaInfo> &schemaInfo, const String &xsiType, const String &xsiNil, const String &xsiSchemaLocation, const String &xsiNoNamespaceSchemaLocation)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | const String\& | 要验证的元素的本地名称。 |
| namespaceUri | const String\& | 要验证的元素的命名空间 URI。 |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 一个 [XmlSchemaInfo](../../xmlschemainfo/) 对象，其属性在成功验证元素名称后被设置。此参数可以为 **nullptr**。 |
| xsiType | const String\& | 元素的 **xsi:Type** 属性值。此参数可以为 **nullptr**。 |
| xsiNil | const String\& | 元素的 **xsi:Nil** 属性值。此参数可以为 **nullptr**。 |
| xsiSchemaLocation | const String\& | 元素的 **xsi:SchemaLocation** 属性值。此参数可以为 **nullptr**。 |
| xsiNoNamespaceSchemaLocation | const String\& | 元素的 **xsi:NoNamespaceSchemaLocation** 属性值。此参数可以为 **nullptr**。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
