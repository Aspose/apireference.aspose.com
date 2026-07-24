---
title: "System::Xml::XmlElement::GetElementsByTagName method"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlElement::GetElementsByTagName yöntemi. Belirtilen XmlElement::get_LocalName ve XmlElement::get_NamespaceURI değerleriyle eşleşen tüm alt öğeleri içeren bir XmlNodeList döndürür C++'ta."
type: docs
weight: 1500
url: /tr/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Belirtilen [XmlElement::get_LocalName](../get_localname/) ve [XmlElement::get_NamespaceURI](../get_namespaceuri/) değerleriyle eşleşen tüm alt öğeleri içeren bir [XmlNodeList](../../xmlnodelist/) döndürür.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Eşleşecek yerel ad. Yıldız işareti (*) tüm etiketlerle eşleşen özel bir değerdir. |
| namespaceURI | String | Eşleşecek ad alanı URI'si. |

### ReturnValue

Tüm eşleşen düğümlerin bir listesini içeren bir [XmlNodeList](../../xmlnodelist/). Eşleşen düğüm yoksa liste boştur.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Belirtilen [XmlElement::get_Name](../get_name/) ile eşleşen tüm alt öğelerin bir listesini içeren bir [XmlNodeList](../../xmlnodelist/) döndürür.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Eşleşecek ad etiketi. Bu, nitelikli bir addır. Eşleşen düğümün **get_Name** değeriyle karşılaştırılır. Yıldız işareti (*) tüm etiketlerle eşleşen özel bir değerdir. |

### ReturnValue

Tüm eşleşen düğümlerin bir listesini içeren bir [XmlNodeList](../../xmlnodelist/). Eşleşen düğüm yoksa liste boştur.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
