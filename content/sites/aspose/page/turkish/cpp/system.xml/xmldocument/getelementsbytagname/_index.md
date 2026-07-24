---
title: "System::Xml::XmlDocument::GetElementsByTagName yöntemi"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlDocument::GetElementsByTagName yöntemi. Belirtilen XmlDocument::get_LocalName ve XmlNode::get_NamespaceURI ile eşleşen tüm alt öğelerin bir listesini içeren bir XmlNodeList'i C++'da döndürür."
type: docs
weight: 3200
url: /tr/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


Belirtilen [XmlDocument::get_LocalName](../get_localname/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) ile eşleşen tüm alt öğelerin bir listesini içeren bir [XmlNodeList](../../xmlnodelist/) döndürür.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Eşleşecek LocalName. Özel değer **"*"** tüm etiketleri eşleştirir. |
| namespaceURI | String | Eşleşecek NamespaceURI. |

### ReturnValue

Tüm eşleşen düğümlerin bir listesini içeren bir [XmlNodeList](../../xmlnodelist/). Belirtilen **localName** ve **namespaceURI** ile eşleşen düğüm yoksa, döndürülen koleksiyon boş olur.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


Belirtilen isimle eşleşen tüm alt öğelerin bir listesini içeren bir [XmlNodeList](../../xmlnodelist/) döndürür.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Eşleşecek nitelikli ad. Eşleşen düğümün **get_Name** değeriyle karşılaştırılır. Özel değer **"*"** tüm etiketleri eşleştirir. |

### ReturnValue

Tüm eşleşen düğümlerin bir listesini içeren bir [XmlNodeList](../../xmlnodelist/). **name** ile eşleşen düğüm yoksa, döndürülen koleksiyon boş olur.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
