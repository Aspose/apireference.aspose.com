---
title: "System::Xml::XmlDocument::CreateElement method"
linktitle: "CreateElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::CreateElement メソッド。C++ で指定された名前の要素を作成します。"
type: docs
weight: 800
url: /ja/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


指定された名前の要素を作成します。

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | 要素の修飾名です。名前にコロンが含まれる場合、[XmlNode::get_Prefix](../../xmlnode/get_prefix/) の値はコロン前の部分を、[XmlDocument::get_LocalName](../get_localname/) の値はコロン後の部分を表します。修飾名には **xmlns** のプレフィックスを含めることはできません。 |

### ReturnValue

新しい[XmlElement](../../xmlelement/)です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


指定された[XmlNode::get_Prefix](../../xmlnode/get_prefix/)、[XmlDocument::get_LocalName](../get_localname/) および [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) を使用して要素を作成します。

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | const String\& | 新しい要素のプレフィックス（存在する場合）。[String::Empty](../../../system/string/empty/) と **nullptr** は同等です。 |
| localName | const String\& | 新しい要素のローカル名です。 |
| namespaceURI | const String\& | 新しい要素の名前空間 URI（該当する場合）。[String::Empty](../../../system/string/empty/) と **nullptr** は同等です。 |

### ReturnValue

新しい[XmlElement](../../xmlelement/)です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


修飾名と [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) を使用して、[XmlElement](../../xmlelement/) を作成します。

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| qualifiedName | const String\& | 要素の修飾名です。名前にコロンが含まれる場合、[XmlNode::get_Prefix](../../xmlnode/get_prefix/) の値はコロンの前の部分を示し、[XmlDocument::get_LocalName](../get_localname/) の値はコロンの後の部分を示します。修飾名には **xmlns** プレフィックスを含めることはできません。 |
| namespaceURI | const String\& | 要素の名前空間 URI。 |

### ReturnValue

新しい[XmlElement](../../xmlelement/)です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
