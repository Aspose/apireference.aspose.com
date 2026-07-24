---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader Konstruktor"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader Konstruktor. Initialisiert eine neue Instanz der XmlValidatingReader-Klasse mit den angegebenen Werten in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialisiert eine neue Instanz der [XmlValidatingReader](../)-Klasse mit den angegebenen Werten.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Der Stream, der das zu parsende XML‑Fragment enthält. |
| fragType | XmlNodeType | Der [XmlNodeType](../../xmlnodetype/) des XML-Fragments. Dies bestimmt, was das Fragment enthalten kann (siehe Tabelle unten). |
| context | const SharedPtr\<XmlParserContext\>\& | Der [XmlParserContext](../../xmlparsercontext/), in dem das XML-Fragment geparst werden soll. Dieser beinhaltet die zu verwendende [XmlNameTable](../../xmlnametable/), Kodierung, Namensraumbereich, das aktuelle **xml:lang** und den **xml:space**-Bereich. |
## Hinweise



Die folgende Tabelle listet gültige Werte für **fragType** auf und zeigt, wie der Reader jeden der verschiedenen Knotentypen verarbeitet. |||
|-|-|
| XmlNodeType | Fragment kann enthalten |
| Element | Beliebiger gültiger Elementinhalt (z. B. jede Kombination aus Elementen, Kommentaren, Verarbeitungsanweisungen, CDATA, Text und Entity-Referenzen). |
| Attribute | Der Wert eines Attributs (der Teil innerhalb der Anführungszeichen). |
| Document | Der Inhalt eines gesamten XML-Dokuments; dies erzwingt Dokumentebene-Regeln. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


Initialisiert eine neue Instanz der [XmlValidatingReader](../)-Klasse, die den von dem angegebenen [XmlReader](../../xmlreader/) zurückgegebenen Inhalt validiert.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | Der [XmlReader](../../xmlreader/) zum Lesen während der Validierung. Die aktuelle Implementierung unterstützt nur [XmlTextReader](../../xmltextreader/). |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialisiert eine neue Instanz der [XmlValidatingReader](../)-Klasse mit den angegebenen Werten.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xmlFragment | const String\& | Der String, der das zu parsende XML-Fragment enthält. |
| fragType | XmlNodeType | Der [XmlNodeType](../../xmlnodetype/) des XML‑Fragments. Dieser bestimmt auch, was die Fragmentzeichenfolge enthalten kann (siehe Tabelle unten). |
| context | const SharedPtr\<XmlParserContext\>\& | Der [XmlParserContext](../../xmlparsercontext/), in dem das XML‑Fragment geparst werden soll. Dieser beinhaltet die zu verwendende [NameTable](../../nametable/), die Kodierung, den Namensraum‑Geltungsbereich, das aktuelle **xml:lang** und den **xml:space**‑Geltungsbereich. |
## Hinweise



Die folgende Tabelle listet gültige Werte für **fragType** auf und zeigt, wie der Reader jeden der verschiedenen Knotentypen verarbeitet. |||
|-|-|
| XmlNodeType | Fragment kann enthalten |
| Element | Beliebiger gültiger Elementinhalt (z. B. jede Kombination aus Elementen, Kommentaren, Verarbeitungsanweisungen, CDATA, Text und Entity-Referenzen). |
| Attribute | Der Wert eines Attributs (der Teil innerhalb der Anführungszeichen). |
| Document | Der Inhalt eines gesamten XML-Dokuments; dies erzwingt Dokumentebene-Regeln. |

## Siehe auch

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
