---
title: "System::Xml::XmlElement::HasAttribute メソッド"
linktitle: "HasAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlElement::HasAttribute メソッド。C++ で、現在のノードが指定されたローカル名と名前空間 URI を持つ属性を持つかどうかを判定します。"
type: docs
weight: 1600
url: /ja/cpp/system.xml/xmlelement/hasattribute/
---
## XmlElement::HasAttribute(String, String) method


現在のノードが指定されたローカル名と名前空間 URI の属性を持つかどうかを判定します。

```cpp
virtual bool System::Xml::XmlElement::HasAttribute(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 検索する属性のローカル名。 |
| namespaceURI | String | 検索する属性の名前空間 URI。 |

### ReturnValue

**true** if the current node has the specified attribute; otherwise, **false**.

## 参照

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::HasAttribute(String) method


現在のノードが指定された名前の属性を持つかどうかを判定します。

```cpp
virtual bool System::Xml::XmlElement::HasAttribute(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 検索する属性の名前。これは修飾名です。マッチするノードの **get_Name** 値と照合されます。 |

### ReturnValue

**true** if the current node has the specified attribute; otherwise, **false**.

## 参照

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
