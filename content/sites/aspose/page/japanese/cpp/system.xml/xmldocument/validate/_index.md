---
title: "System::Xml::XmlDocument::Validate メソッド"
linktitle: "検証"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::Validate メソッド。C++ で XmlDocument::get_Schemas リストに含まれる XML スキーマ定義言語 (XSD) スキーマに対して XmlDocument を検証します。"
type: docs
weight: 4300
url: /ja/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


[XmlDocument](../) を、XML [Schema](../../../system.xml.schema/) 定義言語 (XSD) スキーマが含まれる [XmlDocument::get_Schemas](../get_schemas/) リストに対して検証します。

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | スキーマ検証の警告やエラーに関する情報を受け取る [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) オブジェクトです。 |

## 参照

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


指定された [XmlNode](../../xmlnode/) オブジェクトを、[XmlDocument::get_Schemas](../get_schemas/) リストにある XML [Schema](../../../system.xml.schema/) 定義言語 (XSD) スキーマに対して検証します。

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | スキーマ検証の警告やエラーに関する情報を受け取る [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) オブジェクトです。 |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | 検証のために [XmlDocument](../) から作成された [XmlNode](../../xmlnode/) オブジェクトです。 |

## 参照

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
