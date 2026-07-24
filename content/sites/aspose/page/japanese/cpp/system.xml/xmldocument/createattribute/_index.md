---
title: "System::Xml::XmlDocument::CreateAttribute メソッド"
linktitle: "CreateAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::CreateAttribute メソッド。指定された名前の XmlAttribute を C++ で作成します。"
type: docs
weight: 300
url: /ja/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


指定された名前の [XmlAttribute](../../xmlattribute/) を作成します。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | 属性の修飾名です。名前にコロンが含まれる場合、[XmlNode::get_Prefix](../../xmlnode/get_prefix/) の値は最初のコロンの前の部分を、[XmlDocument::get_LocalName](../get_localname/) の値は最初のコロンの後の部分を表します。[XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) は、プレフィックスが **xmlns** のような認識された組み込みプレフィックスでない限り空のままです。この場合、get_NamespaceURI の値は [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) になります。 |

### ReturnValue

新しい [XmlAttribute](../../xmlattribute/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


指定された [XmlNode::get_Prefix](../../xmlnode/get_prefix/)、[XmlDocument::get_LocalName](../get_localname/) および [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) を使用して [XmlAttribute](../../xmlattribute/) を作成します。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | const String\& | 属性のプレフィックス（存在する場合）。[String::Empty](../../../system/string/empty/) と **nullptr** は同等です。 |
| localName | const String\& | 属性のローカル名。 |
| namespaceURI | const String\& | 属性の名前空間 URI（存在する場合）。[String::Empty](../../../system/string/empty/) と **nullptr** は同等です。**prefix** が **xmlns** の場合、このパラメーターは [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) でなければならず、そうでない場合は例外がスローされます。 |

### ReturnValue

新しい [XmlAttribute](../../xmlattribute/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


指定された修飾名と [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) を使用して [XmlAttribute](../../xmlattribute/) を作成します。

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| qualifiedName | const String\& | 属性の修飾名です。名前にコロンが含まれる場合、[XmlNode::get_Prefix](../../xmlnode/get_prefix/) の値はコロンの前の部分を、[XmlDocument::get_LocalName](../get_localname/) の値はコロンの後の部分を表します。 |
| namespaceURI | const String\& | 属性の namespaceURI です。修飾名に **xmlns** のプレフィックスが含まれる場合、このパラメーターは [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/) でなければなりません。 |

### ReturnValue

新しい [XmlAttribute](../../xmlattribute/)。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
