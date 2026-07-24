---
title: "System::Xml::XmlReader::ReadElementContentAs メソッド"
linktitle: "ReadElementContentAs"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadElementContentAs メソッド。C++ で要素の内容を要求された型として読み取ります。"
type: docs
weight: 5200
url: /ja/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


要素のコンテンツを要求された型として読み取ります。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 返される値の型です。 |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 型変換に関連する名前空間プレフィックスを解決するために使用される [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) オブジェクトです。 |

### ReturnValue

要求された型のオブジェクトに変換された要素の内容です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


指定されたローカル名と名前空間 URI が現在の要素と一致することを確認し、次に要素のコンテンツを要求された型として読み取ります。

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| returnType | const TypeInfo\& | 返される値の型です。 |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | 型変換に関連する名前空間プレフィックスを解決するために使用される [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) オブジェクトです。 |
| localName | String | 要素のローカル名です。 |
| namespaceURI | String | 要素の名前空間 URI。 |

### ReturnValue

要求された型のオブジェクトに変換された要素の内容です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
