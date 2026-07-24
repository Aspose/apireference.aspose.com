---
title: "System::Xml::XmlNodeType enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeType enum. Geeft het type knooppunt aan in C++."
type: docs
weight: 6200
url: /nl/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


Specificeert het type knooppunt.

```cpp
enum class XmlNodeType
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | 0 | Dit wordt geretourneerd door de [XmlReader](../xmlreader/) als de **Read**-methode niet is aangeroepen. |
| Element | 1 | Een element (bijvoorbeeld **<item>**). |
| Attribute | 2 | Een attribuut (bijvoorbeeld **id='123'**). |
| Text | 3 | De tekstinhoud van een knooppunt. Een [XmlNodeType::Text](./) knooppunt kan geen onderliggende knooppunten hebben. Het kan verschijnen als onderliggend knooppunt van de [XmlNodeType::Attribute](./), [XmlNodeType::DocumentFragment](./), [XmlNodeType::Element](./) en [XmlNodeType::EntityReference](./) knooppunten. |
| CDATA | 4 | Een CDATA‑sectie (bijvoorbeeld **my escaped text**). |
| EntityReference | 5 | Een verwijzing naar een entiteit (bijvoorbeeld **&num;**). |
| Entity | 6 | Een entiteitsdeclaratie (bijvoorbeeld **<!ENTITY...>**). |
| ProcessingInstruction | 7 | Een verwerkingsinstructie (bijvoorbeeld **<?pi test?>**). |
| Comment | 8 | Een commentaar (bijvoorbeeld ****). |
| Document | 9 | Een documentobject dat, als de wortel van de documentboom, toegang biedt tot het volledige XML‑document. |
| DocumentType | 10 | De documenttypeverklaring, aangegeven door de volgende tag (bijvoorbeeld, **<!DOCTYPE...>**). |
| DocumentFragment | 11 | Een documentfragment. |
| Notatie | 12 | Een notatie in de documenttypeverklaring (bijvoorbeeld, **<!NOTATION...>**). |
| Witruimte | 13 | Witruimte tussen markup. |
| SignificantWhitespace | 14 | Witruimte tussen markup in een gemengd inhoudsmodel of witruimte binnen de **xml:space=\"preserve\"** scope. |
| EndElement | 15 | Een eind‑element‑tag (bijvoorbeeld, ****). |
| EndEntity | 16 | Geretourneerd wanneer [XmlReader](../xmlreader/) het einde van de entiteitvervanging bereikt als gevolg van een aanroep van [XmlReader::ResolveEntity](../xmlreader/resolveentity/). |
| XmlDeclaration | 17 | De XML‑verklaring (bijvoorbeeld, **<?xml version='1.0'?>**). Het [XmlNodeType::XmlDeclaration](./)‑knooppunt moet het eerste knooppunt in het document zijn. Het kan geen kinderen hebben. Het is een kind van het [XmlNodeType::Document](./)‑knooppunt. Het kan attributen hebben die versie‑ en codering‑informatie verschaffen. |

## Zie ook

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
