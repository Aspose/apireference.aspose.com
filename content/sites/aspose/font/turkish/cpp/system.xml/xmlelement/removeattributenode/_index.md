---
title: "System::Xml::XmlElement::RemoveAttributeNode metodu"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlElement::RemoveAttributeNode metodu. Belirtilen XmlAttribute'ı C++'ta kaldırır."
type: docs
weight: 2100
url: /tr/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


Belirtilen [XmlAttribute](../../xmlattribute/)'ı kaldırır.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | Kaldırılacak [XmlAttribute](../../xmlattribute/) düğümü. Kaldırılan özelliğin varsayılan bir değeri varsa, hemen yerine konur. |

### ReturnValue

Kaldırılan [XmlAttribute](../../xmlattribute/) veya **nullptr**, **oldAttr** bir [XmlElement](../) öznitelik düğümü değilse.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


Yerel ad ve ad alanı URI'si ile belirtilen [XmlAttribute](../../xmlattribute/) kaldırır. (Kaldırılan özelliğin varsayılan bir değeri varsa, hemen yerine konur).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Özelliğin yerel adı. |
| namespaceURI | Dize | Özelliğin ad alanı URI'si. |

### ReturnValue

Kaldırılan [XmlAttribute](../../xmlattribute/) veya **nullptr**, [XmlElement](../) eşleşen bir öznitelik düğümüne sahip değilse.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
