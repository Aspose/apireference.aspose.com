---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute 方法"
linktitle: "ValidateAttribute"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateAttribute 方法。验证 C++ 中当前元素上下文的属性名称、命名空间 URI 和属性值。"
type: docs
weight: 1600
url: /zh/cpp/system.xml.schema/xmlschemavalidator/validateattribute/
---
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) method


在当前元素的上下文中验证属性名称、命名空间 URI 和属性值。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, const String &attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | const String\& | 要验证的属性的本地名称。 |
| namespaceUri | const String\& | 要验证的属性的命名空间 URI。 |
| attributeValue | const String\& | 要验证的属性的值。 |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 一个 [XmlSchemaInfo](../../xmlschemainfo/) 对象，其属性在成功验证属性后被设置。此参数可以为 **nullptr**。 |

### ReturnValue

已验证属性的值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateAttribute(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) method


在当前元素的上下文中验证属性名称、命名空间 URI 和属性值。

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateAttribute(const String &localName, const String &namespaceUri, XmlValueGetter attributeValue, const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | const String\& | 要验证的属性的本地名称。 |
| namespaceUri | const String\& | 要验证的属性的命名空间 URI。 |
| attributeValue | XmlValueGetter | 一个 [XmlValueGetter](../../xmlvaluegetter/) 回调，用于将属性的值以兼容属性的 XML [Schema](../../) 定义语言 (XSD) 类型的形式传递。 |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | 一个 [XmlSchemaInfo](../../xmlschemainfo/) 对象，其属性在成功验证属性后被设置。此参数可以为 **nullptr**。 |

### ReturnValue

已验证属性的值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
