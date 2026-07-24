---
title: "System::Xml::XmlCDataSection::CloneNode methode"
linktitle: "CloneNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlCDataSection::CloneNode methode. Maakt een duplicaat van dit knooppunt in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


Maakt een duplicaat van dit knooppunt.

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| diep | bool | **true** om de subboom onder het opgegeven knooppunt recursief te klonen; **false** om alleen het knooppunt zelf te klonen. Omdat CDATA‑knooppunten geen kinderen hebben, zal het gekloonde knooppunt, ongeacht de parameterinstelling, altijd de gegevensinhoud bevatten. |

### ReturnValue

Het gekloonde knooppunt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
