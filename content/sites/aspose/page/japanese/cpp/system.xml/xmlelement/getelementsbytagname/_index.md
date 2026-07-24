---
title: "System::Xml::XmlElement::GetElementsByTagName メソッド"
linktitle: "GetElementsByTagName"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlElement::GetElementsByTagName メソッド。C++ で、指定された XmlElement::get_LocalName および XmlElement::get_NamespaceURI の値に一致するすべての子孫要素のリストを含む XmlNodeList を返します。"
type: docs
weight: 1500
url: /ja/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


指定された [XmlElement::get_LocalName](../get_localname/) と [XmlElement::get_NamespaceURI](../get_namespaceuri/) の値に一致するすべての子孫要素のリストを含む [XmlNodeList](../../xmlnodelist/) を返します。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 一致させるローカル名。アスタリスク (*) はすべてのタグに一致する特別な値です。 |
| namespaceURI | String | 一致させる名前空間 URI。 |

### ReturnValue

一致するすべてのノードのリストを含む[XmlNodeList](../../xmlnodelist/)。一致するノードがない場合、リストは空です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


指定された[XmlElement::get_Name](../get_name/)に一致するすべての子孫要素のリストを含む[XmlNodeList](../../xmlnodelist/)を返します。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 一致させる名前タグです。これは修飾名です。一致するノードの**get_Name**値と照合されます。アスタリスク (*) はすべてのタグに一致する特別な値です。 |

### ReturnValue

一致するすべてのノードのリストを含む[XmlNodeList](../../xmlnodelist/)。一致するノードがない場合、リストは空です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
