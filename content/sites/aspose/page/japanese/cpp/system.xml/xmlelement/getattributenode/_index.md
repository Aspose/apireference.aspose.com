---
title: "System::Xml::XmlElement::GetAttributeNode メソッド"
linktitle: "GetAttributeNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlElement::GetAttributeNode メソッド。C++ で、指定されたローカル名と名前空間 URI を持つ XmlAttribute を返します。"
type: docs
weight: 1400
url: /ja/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


指定されたローカル名と名前空間 URI を持つ [XmlAttribute](../../xmlattribute/) を返します。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

該当する属性が見つからなかった場合は **nullptr**、それ以外は指定された [XmlAttribute](../../xmlattribute/) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


指定された名前を持つ [XmlAttribute](../../xmlattribute/) を返します。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 取得する属性の名前。これは修飾名です。マッチするノードの **get_Name** 値と照合されます。 |

### ReturnValue

該当する属性が見つからなかった場合は **nullptr**、それ以外は指定された [XmlAttribute](../../xmlattribute/) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
