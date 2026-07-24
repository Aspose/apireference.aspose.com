---
title: "System::Xml::XmlElement::SetAttributeNode メソッド"
linktitle: "SetAttributeNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlElement::SetAttributeNode メソッド。C++ で指定された XmlAttribute を追加します。"
type: docs
weight: 2700
url: /ja/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


指定された [XmlAttribute](../../xmlattribute/) を追加します。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | この要素の属性コレクションに追加するための [XmlAttribute](../../xmlattribute/) ノードです。 |

### ReturnValue

属性が同名の既存属性を置き換える場合、古い [XmlAttribute](../../xmlattribute/) が返されます。置き換えない場合は **nullptr** が返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


指定された [XmlAttribute](../../xmlattribute/) を追加します。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

追加する [XmlAttribute](../../xmlattribute/) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
