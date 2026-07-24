---
title: "System::Xml::XmlNode::idx_get メソッド"
linktitle: "idx_get"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNode::idx_get メソッド。C++ で、指定された XmlNode::get_LocalName と XmlNode::get_NamespaceURI の値を持つ最初の子要素を返します。"
type: docs
weight: 3000
url: /ja/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


指定された [XmlNode::get_LocalName](../get_localname/) と [XmlNode::get_NamespaceURI](../get_namespaceuri/) の値を持つ最初の子要素を返します。

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ローカル名 | String | 要素のローカル名です。 |
| ns | String | 要素の名前空間 URI。 |

### ReturnValue

一致する **localname** と **ns** を持つ最初の [XmlElement](../../xmlelement/) 。一致がない場合は **nullptr** を返します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


指定された [XmlNode::get_Name](../get_name/) を持つ最初の子要素を返します。

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 取得する要素の修飾名。 |

### ReturnValue

指定された名前と一致する最初の [XmlElement](../../xmlelement/) 。一致がない場合は **nullptr** を返します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
