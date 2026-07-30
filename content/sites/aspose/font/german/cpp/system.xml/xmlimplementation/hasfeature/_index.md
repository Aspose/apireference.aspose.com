---
title: "System::Xml::XmlImplementation::HasFeature Methode"
linktitle: "HasFeature"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlImplementation::HasFeature-Methode. Prüft, ob die Document Object Model (DOM)-Implementierung ein bestimmtes Feature in C++ implementiert."
type: docs
weight: 300
url: /de/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Prüft, ob die Document [Object](../../../system/object/) Model (DOM)-Implementierung ein bestimmtes Feature implementiert.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| strFeature | const String\& | Der Paketname des zu testenden Features. Dieser Name ist nicht case‑sensitiv. |
| strVersion | const String\& | Dies ist die Versionsnummer des zu testenden Paketnamens. Wenn die Version nicht angegeben ist (**nullptr**), führt die Unterstützung jeder Version des Features dazu, dass die Methode **true** zurückgibt. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Hinweise



Die folgende Tabelle zeigt die Kombinationen, die dazu führen, dass **HasFeature** **true** zurückgibt. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
