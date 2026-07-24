---
title: "System::Xml::XmlElement::RemoveAttributeNode メソッド"
linktitle: "RemoveAttributeNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlElement::RemoveAttributeNode メソッド。C++ で指定された XmlAttribute を削除します。"
type: docs
weight: 2100
url: /ja/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


指定された [XmlAttribute](../../xmlattribute/) を削除します。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | 削除する [XmlAttribute](../../xmlattribute/) ノード。削除された属性にデフォルト値がある場合、直ちに置き換えられます。 |

### ReturnValue

削除された [XmlAttribute](../../xmlattribute/)、または **oldAttr** が [XmlElement](../) の属性ノードでない場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


ローカル名と名前空間 URI で指定された [XmlAttribute](../../xmlattribute/) を削除します。（削除された属性にデフォルト値がある場合、直ちに置き換えられます）。

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 属性のローカル名。 |
| namespaceURI | String | 属性の名前空間 URI。 |

### ReturnValue

削除された [XmlAttribute](../../xmlattribute/)、または [XmlElement](../) に一致する属性ノードがない場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
