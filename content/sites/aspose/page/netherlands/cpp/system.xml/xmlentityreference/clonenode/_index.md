---
title: "System::Xml::XmlEntityReference::CloneNode methode"
linktitle: "CloneNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlEntityReference::CloneNode methode. Maakt een duplicaat van dit knooppunt in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


Maakt een duplicaat van dit knooppunt.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| deep | bool | **true** om de onderliggende subboom van het opgegeven knooppunt recursief te klonen; **false** om alleen het knooppunt zelf te klonen. Voor [XmlEntityReference](../) knooppunten retourneert deze methode altijd een entiteitsreferentieknooppunt zonder kinderen. De vervangende tekst wordt ingesteld wanneer het knooppunt in een ouder wordt ingevoegd. |

### ReturnValue

Het gekloonde knooppunt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
