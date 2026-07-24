---
title: "System::Xml::XmlNode::Supports methode"
linktitle: "Supports"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNode::Supports methode. Test of de DOM‑implementatie een specifieke functie ondersteunt in C++."
type: docs
weight: 4400
url: /nl/cpp/system.xml/xmlnode/supports/
---
## XmlNode::Supports method


Test of de DOM-implementatie een specifieke functie implementeert.

```cpp
virtual bool System::Xml::XmlNode::Supports(String feature, String version)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| functie | String | De pakketnaam van de te testen functie. Deze naam is niet hoofdlettergevoelig. |
| versie | String | Het versienummer van de te testen pakketnaam. Als de versie niet is opgegeven (null), zorgt het ondersteunen van elke versie van de functie ervoor dat de methode true retourneert. |

### ReturnValue

**true** if the feature is implemented in the specified version; otherwise, **false**.
## Opmerkingen



De volgende tabel beschrijft de combinaties die **true** retourneren. |||
|-|-|
| Functie | Versie |
| XML | 1.0 |
| XML | 2.0 |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
