---
title: "System::Xml::Schema::XmlSchemaDatatype::ChangeType メソッド"
linktitle: "ChangeType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaDatatype::ChangeType メソッド。指定された値（その型は XmlSchemaDatatype が表す XML スキーマ型の有効な表現のいずれか）を、C++ で指定された実行時型に変換します。"
type: docs
weight: 100
url: /ja/cpp/system.xml.schema/xmlschemadatatype/changetype/
---
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&) method


[XmlSchemaDatatype](../) が表す XML スキーマ型の有効な表現のいずれかである指定された値を、指定された実行時型に変換します。

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | SharedPtr\<Object\> | 指定された型に変換する入力値。 |
| targetType | const TypeInfo\& | 入力値を変換する対象の型。 |

### ReturnValue

変換された入力値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaDatatype::ChangeType(SharedPtr\<Object\>, const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


[XmlSchemaDatatype](../) が **xs:QName** 型またはその派生型を表す場合、[IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) を使用して、指定された値（その型は XML スキーマ型の有効な表現のいずれか）を実行時型に変換します。

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ChangeType(SharedPtr<Object> value, const TypeInfo &targetType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | SharedPtr\<Object\> | 指定された型に変換する入力値。 |
| targetType | const TypeInfo\& | 入力値を変換する対象の型。 |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 名前空間プレフィックスの解決に使用される [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)。これは、[XmlSchemaDatatype](../) が **xs:QName** 型またはその派生型を表す場合にのみ有用です。 |

### ReturnValue

変換された入力値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
