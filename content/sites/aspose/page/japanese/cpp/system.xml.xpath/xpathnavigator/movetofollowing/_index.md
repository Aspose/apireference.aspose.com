---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing method"
linktitle: "MoveToFollowing"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing メソッド。C++ で文書順に指定されたローカル名と名前空間 URI を持つ要素へ XPathNavigator を移動します。"
type: docs
weight: 5700
url: /ja/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


文書順に指定されたローカル名と名前空間 URI を持つ要素へ [XPathNavigator](../) を移動します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 要素のローカル名です。 |
| namespaceURI | String | 要素の名前空間 URI。 |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


文書順で指定されたローカル名と名前空間 URI を持つ要素へ、指定された境界まで [XPathNavigator](../) を移動します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 要素のローカル名です。 |
| namespaceURI | String | 要素の名前空間 URI。 |
| end | SharedPtr\<XPathNavigator\> | 次の要素を検索する際に現在の [XPathNavigator](../) が越えないように、要素の境界上に位置する [XPathNavigator](../) オブジェクト。 |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


文書順で指定された [XPathNodeType](../../xpathnodetype/) の次の要素へ [XPathNavigator](../) を移動します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | XPathNodeType | The 要素の [XPathNodeType](../../xpathnodetype/)。[XPathNodeType](../../xpathnodetype/) は [XPathNodeType::Attribute](../../xpathnodetype/) または [XPathNodeType::Namespace](../../xpathnodetype/) にすることはできません。 |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 参照

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


指定された [XPathNodeType](../../xpathnodetype/) の次の要素へ、指定された境界まで、文書順で [XPathNavigator](../) を移動します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type | XPathNodeType | The 要素の [XPathNodeType](../../xpathnodetype/)。[XPathNodeType](../../xpathnodetype/) は [XPathNodeType::Attribute](../../xpathnodetype/) または [XPathNodeType::Namespace](../../xpathnodetype/) にすることはできません。 |
| end | SharedPtr\<XPathNavigator\> | 次の要素を検索する際に現在の [XPathNavigator](../) が越えないように、要素の境界上に位置する [XPathNavigator](../) オブジェクト。 |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 参照

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
