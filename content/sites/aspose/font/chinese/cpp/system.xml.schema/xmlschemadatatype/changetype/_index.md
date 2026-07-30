---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType 方法"
linktitle: "ChangeType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType 方法。将指定的值（其类型是由 XmlSchemaDatatype 表示的 XML 架构类型的有效表示之一）转换为在 C++ 中指定的运行时类型。"
type: docs
weight: 100
url: /zh/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


将指定的值（其类型是由 [XmlSchemaDatatype](../) 表示的 XML 架构类型的有效表示之一）转换为指定的运行时类型。

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | SharedPtr\<Object\> | 要转换为指定类型的输入值。 |
| targetType | const TypeInfo\& | 要将输入值转换为的目标类型。 |

### ReturnValue

已转换的输入值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


将指定的值（其类型是由 [XmlSchemaDatatype](../) 表示的 XML 架构类型的有效表示之一）转换为使用 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 指定的运行时类型（如果 [XmlSchemaDatatype](../) 表示 **xs:QName** 类型或其派生类型）。

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 值 | SharedPtr\<Object\> | 要转换为指定类型的输入值。 |
| targetType | const TypeInfo\& | 要将输入值转换为的目标类型。 |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 用于解析命名空间前缀的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)。仅当 [XmlSchemaDatatype](../) 表示 **xs:QName** 类型或其派生类型时才有用。 |

### ReturnValue

已转换的输入值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
