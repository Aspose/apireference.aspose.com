---
title: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator コンストラクター"
linktitle: "XmlSchemaValidator"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator コンストラクター。C++ で XmlSchemaValidator クラスの新しいインスタンスを初期化します。"
type: docs
weight: 100
url: /ja/cpp/system.xml.schema/xmlschemavalidator/xmlschemavalidator/
---
## XmlSchemaValidator::XmlSchemaValidator constructor


新しい [XmlSchemaValidator](../) クラスのインスタンスを初期化します。

```cpp
System::Xml::Schema::XmlSchemaValidator::XmlSchemaValidator(const SharedPtr<XmlNameTable> &nameTable, const SharedPtr<XmlSchemaSet> &schemas, const SharedPtr<IXmlNamespaceResolver> &namespaceResolver, XmlSchemaValidationFlags validationFlags)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| nameTable | const SharedPtr\<XmlNameTable\>\& | 要素と属性名がアトム化された文字列として格納された [XmlNameTable](../../../system.xml/xmlnametable/) オブジェクトです。 |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | 検証に使用される XML [Schema](../../) 定義言語 (XSD) スキーマを含む [XmlSchemaSet](../../xmlschemaset/) オブジェクトです。 |
| namespaceResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | 検証中に遭遇した名前空間を解決するために使用される [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトです。 |
| validationFlags | XmlSchemaValidationFlags | [XmlSchemaValidationFlags](../../xmlschemavalidationflags/) 値で、スキーマ検証オプションを指定します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [XmlSchemaSet](../../xmlschemaset/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Enum [XmlSchemaValidationFlags](../../xmlschemavalidationflags/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
