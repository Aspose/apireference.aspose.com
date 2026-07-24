---
title: "System::Xml::XmlEntity::CloneNode methode"
linktitle: "CloneNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlEntity::CloneNode methode. Maakt een duplicaat van dit knooppunt. Entiteitknooppunten kunnen niet worden gekloond. Het aanroepen van deze methode op een XmlEntity-object veroorzaakt een uitzondering in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


Maakt een duplicaat van dit knooppunt. Entiteitknooppunten kunnen niet worden gekloond. Het aanroepen van deze methode op een [XmlEntity](../)-object veroorzaakt een uitzondering.

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| diep | bool | **true** om de subboom onder het opgegeven knooppunt recursief te klonen; **false** om alleen het knooppunt zelf te klonen. |

### ReturnValue

Een kopie van de [XmlNode](../../xmlnode/) vanwaar de methode wordt aangeroepen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
