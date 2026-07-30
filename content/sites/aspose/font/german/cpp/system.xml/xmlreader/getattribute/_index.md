---
title: "System::Xml::XmlReader::GetAttribute-Methode"
linktitle: "GetAttribute"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::GetAttribute-Methode. Wenn sie in einer abgeleiteten Klasse überschrieben wird, gibt sie den Wert des Attributs mit dem angegebenen Index in C++ zurück."
type: docs
weight: 2800
url: /de/cpp/system.xml/xmlreader/getattribute/
---
## XmlReader::GetAttribute(int32_t) method


Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit dem angegebenen Index zurück.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(int32_t i)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| i | int32_t | Der Index des Attributs. Der Index ist nullbasiert. (Das erste Attribut hat den Index 0.) |

### ReturnValue

Der Wert des angegebenen Attributs. Diese Methode verschiebt den Reader nicht.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String) method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, gibt sie den Wert des Attributs mit dem angegebenen [XmlReader::get_Name](../get_name/) zurück.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der qualifizierte Name des Attributs. |

### ReturnValue

Der Wert des angegebenen Attributs. Wenn das Attribut nicht gefunden wird oder der Wert [String::Empty](../../../system/string/empty/) ist, wird **nullptr** zurückgegeben.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::GetAttribute(String, String) method


Wenn sie in einer abgeleiteten Klasse überschrieben wird, gibt sie den Wert des Attributs mit den angegebenen [XmlReader::get_LocalName](../get_localname/) und [XmlReader::get_NamespaceURI](../get_namespaceuri/) zurück.

```cpp
virtual String System::Xml::XmlReader::GetAttribute(String name, String namespaceURI)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der lokale Name des Attributs. |
| namespaceURI | String | Der Namespace-URI des Attributs. |

### ReturnValue

Der Wert des angegebenen Attributs. Wenn das Attribut nicht gefunden wird oder der Wert [String::Empty](../../../system/string/empty/) ist, wird **nullptr** zurückgegeben. Diese Methode bewegt den Reader nicht.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
