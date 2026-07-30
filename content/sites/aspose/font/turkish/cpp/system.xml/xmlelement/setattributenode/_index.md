---
title: "System::Xml::XmlElement::SetAttributeNode yöntemi"
linktitle: "SetAttributeNode"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlElement::SetAttributeNode yöntemi. C++'da belirtilen XmlAttribute'ı ekler."
type: docs
weight: 2700
url: /tr/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


Belirtilen [XmlAttribute](../../xmlattribute/) ekler.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | Bu öğe için öznitelik koleksiyonuna eklenecek [XmlAttribute](../../xmlattribute/) düğümü. |

### ReturnValue

Öznitelik aynı ada sahip mevcut bir özniteliği değiştirirse, eski [XmlAttribute](../../xmlattribute/) döndürülür; aksi takdirde **nullptr** döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


Belirtilen [XmlAttribute](../../xmlattribute/) ekler.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Özelliğin yerel adı. |
| namespaceURI | Dize | Özelliğin ad alanı URI'si. |

### ReturnValue

Eklenecek [XmlAttribute](../../xmlattribute/).

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
