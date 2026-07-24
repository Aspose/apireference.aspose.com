---
title: "System::Xml::XmlDeclaration::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDeclaration::CloneNode-methode. Maakt een duplicaat van dit knooppunt in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmldeclaration/clonenode/
---
## XmlDeclaration::CloneNode method


Maakt een duplicaat van dit knooppunt.

```cpp
SharedPtr<XmlNode> System::Xml::XmlDeclaration::CloneNode(bool deep) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| deep | bool | **true** om de subboom onder het opgegeven knooppunt recursief te klonen; **false** om alleen het knooppunt zelf te klonen. Omdat [XmlDeclaration](../)-knooppunten geen kinderen hebben, bevat het gekloonde knooppunt altijd de gegevenswaarde, ongeacht de parameterinstelling. |

### ReturnValue

Het gekloonde knooppunt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
