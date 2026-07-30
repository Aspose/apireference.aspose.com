---
title: "System::Xml::XmlValidatingReader::GetAttribute Methode"
linktitle: "GetAttribute"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlValidatingReader::GetAttribute Methode. Gibt den Wert des Attributs mit dem angegebenen Index in C++ zurück."
type: docs
weight: 3200
url: /de/cpp/system.xml/xmlvalidatingreader/getattribute/
---
## XmlValidatingReader::GetAttribute(int32_t) method


Gibt den Wert des Attributs mit dem angegebenen Index zurück.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(int32_t i) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| i | int32_t | Der Index des Attributs. Der Index ist nullbasiert. (Das erste Attribut hat den Index 0.) |

### ReturnValue

Der Wert des angegebenen Attributs.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::GetAttribute(String, String) method


Gibt den Wert des Attributs mit dem angegebenen lokalen Namen und dem Namespace Uniform Resource Identifier (URI) zurück.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String localName, String namespaceURI) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des Attributs. |
| namespaceURI | String | Der Namespace-URI des Attributs. |

### ReturnValue

Der Wert des angegebenen Attributs. Wenn das Attribut nicht gefunden wird, wird **nullptr** zurückgegeben. Diese Methode bewegt den Reader nicht.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::GetAttribute(String) method


Gibt den Wert des Attributs mit dem angegebenen Namen zurück.

```cpp
String System::Xml::XmlValidatingReader::GetAttribute(String name) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der qualifizierte Name des Attributs. |

### ReturnValue

Der Wert des angegebenen Attributs. Wenn das Attribut nicht gefunden wird, wird **nullptr** zurückgegeben.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
