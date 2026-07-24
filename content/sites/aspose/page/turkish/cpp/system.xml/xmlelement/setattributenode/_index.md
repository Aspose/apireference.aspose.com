---
title: "System::Xml::XmlElement::SetAttributeNode metodu"
linktitle: "SetAttributeNode"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlElement::SetAttributeNode yöntemi. Belirtilen XmlAttribute'i C++'ta ekler."
type: docs
weight: 2700
url: /tr/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


Belirtilen [XmlAttribute](../../xmlattribute/) ekler.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | Bu öğe için öznitelik koleksiyonuna eklenecek [XmlAttribute](../../xmlattribute/) düğümü. |

### ReturnValue

Öznitelik aynı ada sahip mevcut bir özniteliği değiştirirse, eski [XmlAttribute](../../xmlattribute/) döndürülür; aksi takdirde **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


Belirtilen [XmlAttribute](../../xmlattribute/) ekler.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Özniteliğin yerel adı. |
| namespaceURI | String | Özniteliğin ad alanı URI'si. |

### ReturnValue

Eklenecek [XmlAttribute](../../xmlattribute/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
