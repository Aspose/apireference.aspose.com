---
title: "System::Xml::Schema::XmlSchemaDatatype::ParseValue メソッド"
linktitle: "ParseValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Schema::XmlSchemaDatatype::ParseValue メソッド。派生クラスでオーバーライドされた場合、C++ において指定された文字列を組み込みまたはユーザー定義の単純型に対して検証します。"
type: docs
weight: 700
url: /ja/cpp/system.xml.schema/xmlschemadatatype/parsevalue/
---
## XmlSchemaDatatype::ParseValue method


派生クラスでオーバーライドされた場合、指定された **string** を組み込みまたはユーザー定義の単純型に対して検証します。

```cpp
virtual SharedPtr<Object> System::Xml::Schema::XmlSchemaDatatype::ParseValue(String s, SharedPtr<XmlNameTable> nameTable, SharedPtr<IXmlNamespaceResolver> nsmgr)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | String | 単純型に対して検証する **string**。 |
| nameTable | SharedPtr\<XmlNameTable\> | この [XmlSchemaDatatype](../) オブジェクトが **xs:NCName** 型を表す場合、**string** を解析中のアトム化に使用する [XmlNameTable](../../../system.xml/xmlnametable/)。 |
| nsmgr | SharedPtr\<IXmlNamespaceResolver\> | この [XmlSchemaDatatype](../) オブジェクトが **xs:QName** 型を表す場合、**string** を解析中に使用する [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクト。 |

### ReturnValue

[XmlSchemaDatatype::get_ValueType](../get_valuetype/) 呼び出しが返す型に安全にキャストできる [Object](../../../system/object/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XmlNameTable](../../../system.xml/xmlnametable/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlSchemaDatatype](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
