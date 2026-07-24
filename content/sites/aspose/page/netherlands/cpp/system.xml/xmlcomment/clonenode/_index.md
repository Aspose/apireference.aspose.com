---
title: "System::Xml::XmlComment::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlComment::CloneNode method. Maakt een duplicaat van dit knooppunt in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlcomment/clonenode/
---
## XmlComment::CloneNode method


Maakt een duplicaat van dit knooppunt.

```cpp
SharedPtr<XmlNode> System::Xml::XmlComment::CloneNode(bool deep) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| diep | bool | **true** om de subboom onder het opgegeven knooppunt recursief te klonen; **false** om alleen het knooppunt zelf te klonen. Omdat commentaarknooppunten geen kinderen hebben, bevat het gekloonde knooppunt altijd de tekstinhoud, ongeacht de parameterinstelling. |

### ReturnValue

Het gekloonde knooppunt.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlComment](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
