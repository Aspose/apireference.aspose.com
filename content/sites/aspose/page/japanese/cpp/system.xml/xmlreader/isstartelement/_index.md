---
title: "System::Xml::XmlReader::IsStartElement メソッド"
linktitle: "IsStartElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::IsStartElement メソッド。XmlReader::MoveToContent を呼び出し、C++ で現在のコンテンツノードが開始タグまたは空要素タグかどうかをテストします。"
type: docs
weight: 3000
url: /ja/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


[XmlReader::MoveToContent](../movetocontent/) を呼び出し、現在のコンテンツノードが開始タグまたは空要素タグかどうかをテストします。

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## 参照

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String, String) method


[XmlReader::MoveToContent](../movetocontent/) を呼び出し、現在のコンテンツノードが開始タグまたは空要素タグであるか、さらに見つかった要素の [XmlReader::get_LocalName](../get_localname/) と [XmlReader::get_NamespaceURI](../get_namespaceuri/) の値が指定された文字列と一致するかをテストします。

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ローカル名 | String | 見つかった要素の **LocalName** 値と照合する文字列です。 |
| ns | String | 見つかった要素の **NamespaceURI** 値と照合する文字列です。 |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String) method


[XmlReader::MoveToContent](../movetocontent/) を呼び出し、現在のコンテンツノードが開始タグまたは空要素タグであるか、さらに見つかった要素の [XmlReader::get_Name](../get_name/) の値が指定された引数と一致するかをテストします。

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 見つかった要素の **Name** 値と照合される文字列です。 |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
