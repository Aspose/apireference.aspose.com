---
title: "System::Xml::XmlDocument::CreateXmlDeclaration-methode"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocument::CreateXmlDeclaration-methode. Maakt een XmlDeclaration-knooppunt met de opgegeven waarden aan in C++."
type: docs
weight: 1600
url: /nl/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


Maakt een [XmlDeclaration](../../xmldeclaration/) knooppunt met de opgegeven waarden.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| versie | const String\& | De versie moet "1.0" zijn. |
| encoding | const String\& | De waarde van het coderingattribuut. Dit is de codering die wordt gebruikt wanneer u het [XmlDocument](../) opslaat naar een bestand of een stream; daarom moet het worden ingesteld op een tekenreeks die wordt ondersteund door de [Text::Encoding](../../../system.text/encoding/) klasse, anders faalt "XmlDocument::Save(String)". Als dit **nullptr** of [String::Empty](../../../system/string/empty/) is, schrijft de [XmlDocument::Save](../save/) methode geen coderingattribuut in de XML-declaratie en wordt daarom de standaardcodering, UTF-8, gebruikt. |
| standalone | const String\& | De waarde moet "yes" of "no" zijn. Als dit **nullptr** of [String::Empty](../../../system/string/empty/) is, schrijft de [XmlDocument::Save](../save/) methode geen standalone-attribuut in de XML-declaratie. |

### ReturnValue

Het nieuwe [XmlDeclaration](../../xmldeclaration/) knooppunt.
## Opmerkingen



Opmerking: Als het [XmlDocument](../) wordt opgeslagen naar een TextWriter of een [XmlTextWriter](../../xmltextwriter/), wordt deze coderingswaarde genegeerd. In plaats daarvan wordt de codering van de TextWriter of de [XmlTextWriter](../../xmltextwriter/) gebruikt. Dit zorgt ervoor dat de geschreven XML correct kan worden gelezen met de juiste codering.
## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
