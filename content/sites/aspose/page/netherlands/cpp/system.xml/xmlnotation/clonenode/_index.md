---
title: "System::Xml::XmlNotation::CloneNode methode"
linktitle: "CloneNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNotation::CloneNode methode. Maakt een duplicaat van dit knooppunt. Notation-knooppunten kunnen niet worden gekloond. Het aanroepen van deze methode op een XmlNotation-object veroorzaakt een uitzondering in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


Maakt een duplicaat van dit knooppunt. Notation-knooppunten kunnen niet worden gekloond. Het aanroepen van deze methode op een [XmlNotation](../) object veroorzaakt een uitzondering.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| diep | bool | **true** om de subboom onder het opgegeven knooppunt recursief te klonen; **false** om alleen het knooppunt zelf te klonen. |

### ReturnValue

Een [XmlNode](../../xmlnode/) kopie van het knooppunt waarvan de methode wordt aangeroepen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
