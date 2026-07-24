---
title: "System::Xml::XmlImplementation::HasFeature methode"
linktitle: "HasFeature"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlImplementation::HasFeature methode. Test of de Document Object Model (DOM)-implementatie een specifieke functie implementeert in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml/xmlimplementation/hasfeature/
---
## XmlImplementation::HasFeature method


Test of de Document [Object](../../../system/object/) Model (DOM)-implementatie een specifieke functie implementeert.

```cpp
bool System::Xml::XmlImplementation::HasFeature(const String &strFeature, const String &strVersion)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| strFeature | const String\& | De pakketnaam van de te testen functie. Deze naam is niet hoofdlettergevoelig. |
| strVersion | const String\& | Dit is het versienummer van de pakketnaam om te testen. Als de versie niet is gespecificeerd (**nullptr**), ondersteunt elke versie van de functie ervoor dat de methode **true** retourneert. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Opmerkingen



De volgende tabel toont de combinaties die ervoor zorgen dat **HasFeature** **true** retourneert. |||
|-|-|
| strFeature | strVersion |
| XML | 1.0 |
| XML | 2.0 |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlImplementation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
