---
title: "System::Xml::XmlReader::ReadContentAs メソッド"
linktitle: "ReadContentAs"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadContentAs メソッド。C++ で指定された型のオブジェクトとしてコンテンツを読み取ります。"
type: docs
weight: 3900
url: /ja/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


指定された型のオブジェクトとしてコンテンツを読み取ります。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 返される値の型です。 |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 型変換に関連する名前空間プレフィックスを解決するために使用される [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) オブジェクトです。たとえば、[XmlQualifiedName](../../xmlqualifiedname/) オブジェクトを **xs:string** に変換する際に使用できます。この値は **nullptr** にすることができます。 |

### ReturnValue

要求された型に変換された結合されたテキストコンテンツまたは属性値です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
