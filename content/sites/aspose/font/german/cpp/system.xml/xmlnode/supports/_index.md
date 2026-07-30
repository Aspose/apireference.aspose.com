---
title: "System::Xml::XmlNode::Supports-Methode"
linktitle: "Supports"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNode::Supports-Methode. Prüft, ob die DOM-Implementierung ein bestimmtes Feature in C++ unterstützt."
type: docs
weight: 4400
url: /de/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


Prüft, ob die DOM-Implementierung ein bestimmtes Feature implementiert.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Funktion | String | Der Paketname des zu testenden Features. Dieser Name ist nicht case‑sensitiv. |
| Version | String | Die Versionsnummer des zu testenden Paketnamens. Wenn die Version nicht angegeben ist (null), führt die Unterstützung einer beliebigen Version des Features dazu, dass die Methode true zurückgibt. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Hinweise



Die folgende Tabelle beschreibt die Kombinationen, die **true** zurückgeben. |||
|-|-|
| Feature | Version |
| XML | 1.0 |
| XML | 2.0 |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
