---
title: "System::Xml::XmlElement::GetAttributeNode Methode"
linktitle: "GetAttributeNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlElement::GetAttributeNode Methode. Gibt das XmlAttribute mit dem angegebenen lokalen Namen und Namespace‑URI in C++ zurück."
type: docs
weight: 1400
url: /de/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Gibt das [XmlAttribute](../../xmlattribute/) mit dem angegebenen lokalen Namen und Namespace‑URI zurück.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des Attributs. |
| namespaceURI | String | Der Namespace-URI des Attributs. |

### ReturnValue

Das angegebene [XmlAttribute](../../xmlattribute/) oder **nullptr**, falls kein passendes Attribut gefunden wurde.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Gibt das [XmlAttribute](../../xmlattribute/) mit dem angegebenen Namen zurück.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der Name des abzurufenden Attributs. Dies ist ein qualifizierter Name. Er wird mit dem **get_Name**-Wert des passenden Knotens abgeglichen. |

### ReturnValue

Das angegebene [XmlAttribute](../../xmlattribute/) oder **nullptr**, falls kein passendes Attribut gefunden wurde.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
