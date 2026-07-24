---
title: "System::Xml::XmlElement::RemoveAttributeNode method"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlElement::RemoveAttributeNode yöntemi. Belirtilen XmlAttribute'ı C++'ta kaldırır."
type: docs
weight: 2100
url: /tr/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


Belirtilen [XmlAttribute](../../xmlattribute/) öğesini kaldırır.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | Kaldırılacak [XmlAttribute](../../xmlattribute/) düğümü. Kaldırılan öznitelik varsayılan bir değere sahipse, hemen yerine konur. |

### ReturnValue

Kaldırılan [XmlAttribute](../../xmlattribute/) veya **oldAttr** bir [XmlElement](../) öznitelik düğümü değilse **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


Yerel ad ve ad alanı URI'si ile belirtilen [XmlAttribute](../../xmlattribute/) öğesini kaldırır. (Kaldırılan öznitelik varsayılan bir değere sahipse, hemen yerine konur).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Özniteliğin yerel adı. |
| namespaceURI | String | Özniteliğin ad alanı URI'si. |

### ReturnValue

Kaldırılan [XmlAttribute](../../xmlattribute/) veya [XmlElement](../) eşleşen bir öznitelik düğümüne sahip değilse **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
