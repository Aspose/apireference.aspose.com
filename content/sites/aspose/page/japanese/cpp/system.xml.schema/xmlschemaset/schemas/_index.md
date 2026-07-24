---
title: "System::Xml::Schema::XmlSchemaSet::Schemas メソッド"
linktitle: "Schemas"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaSet::Schemas メソッド。C++ の XmlSchemaSet に含まれるすべての XML スキーマ定義言語 (XSD) スキーマのコレクションを返します。"
type: docs
weight: 1600
url: /ja/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


[XmlSchemaSet](../) に含まれるすべての XML [Schema](../../) 定義言語 (XSD) スキーマのコレクションを返します。

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

[XmlSchemaSet](../) に追加されたすべてのスキーマを含む IList オブジェクトです。もし [XmlSchemaSet](../) にスキーマが追加されていない場合、空のコレクションが返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


指定された名前空間に属する、[XmlSchemaSet](../) 内のすべての XML [Schema](../../) 定義言語 (XSD) スキーマのコレクションを返します。

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| targetNamespace | String | スキーマの **targetNamespace** プロパティです。 |

### ReturnValue

指定された名前空間に属し、[XmlSchemaSet](../) に追加されたすべてのスキーマを含む IList オブジェクトです。もし [XmlSchemaSet](../) にスキーマが追加されていない場合、空のコレクションが返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
