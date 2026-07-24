---
title: "System::Xml::XmlElement::GetAttributeNode metodu"
linktitle: "GetAttributeNode"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlElement::GetAttributeNode metodu. C++'da belirtilen yerel ad ve ad alanı URI'sine sahip XmlAttribute'ı döndürür."
type: docs
weight: 1400
url: /tr/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Belirtilen yerel ad ve ad alanı URI'sine sahip [XmlAttribute](../../xmlattribute/) döndürür.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Özniteliğin yerel adı. |
| namespaceURI | String | Özniteliğin ad alanı URI'si. |

### ReturnValue

Belirtilen [XmlAttribute](../../xmlattribute/) veya **nullptr**, eşleşen bir öznitelik bulunamazsa.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Belirtilen ada sahip [XmlAttribute](../../xmlattribute/) döndürür.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Alınacak özniteliğin adı. Bu, nitelikli bir addır. Eşleşen düğümün **get_Name** değerine göre eşleştirilir. |

### ReturnValue

Belirtilen [XmlAttribute](../../xmlattribute/) veya **nullptr**, eşleşen bir öznitelik bulunamazsa.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
