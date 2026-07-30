---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader Konstruktor"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Font für C++"
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
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Der Stream, der das zu parsende XML-Fragment enthält. |
| fragType | XmlNodeType | Der [XmlNodeType](../../xmlnodetype/) des XML-Fragments. Dies bestimmt, was das Fragment enthalten kann (siehe Tabelle unten). |
| context | const SharedPtr\<XmlParserContext\>\& | Der [XmlParserContext](../../xmlparsercontext/), in dem das XML-Fragment geparst werden soll. Dieser beinhaltet die zu verwendende [XmlNameTable](../../xmlnametable/), das Encoding, den Namensraumumfang, das aktuelle **xml:lang** und den **xml:space**-Umfang. |
## Hinweise



Die folgende Tabelle listet gültige Werte für **fragType** auf und zeigt, wie der Reader jeden der verschiedenen Knotentypen verarbeitet. |||
|-|-|
| XmlNodeType | Fragment kann enthalten |
| Element | Beliebiger gültiger Elementinhalt (zum Beispiel jede Kombination von Elementen, Kommentaren, Verarbeitungsanweisungen, cdata, Text und Entity-Referenzen). |
| Attribute | Der Wert eines Attributs (der Teil innerhalb der Anführungszeichen). |
| Document | Der Inhalt eines gesamten XML-Dokuments; dies erzwingt Dokumentebenenregeln. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlValidatingReader](../), die den von dem angegebenen [XmlReader](../../xmlreader/) zurückgegebenen Inhalt validiert.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | Der [XmlReader](../../xmlreader/), von dem während der Validierung gelesen wird. Die aktuelle Implementierung unterstützt nur [XmlTextReader](../../xmltextreader/). |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialisiert eine neue Instanz der [XmlValidatingReader](../)-Klasse mit den angegebenen Werten.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| xmlFragment | const String\& | Der String, der das zu parsende XML-Fragment enthält. |
| fragType | XmlNodeType | Der [XmlNodeType](../../xmlnodetype/) des XML-Fragments. Dieser bestimmt auch, was die Fragmentzeichenfolge enthalten kann (siehe Tabelle unten). |
| context | const SharedPtr\<XmlParserContext\>\& | Der [XmlParserContext](../../xmlparsercontext/) in dem das XML-Fragment geparst werden soll. Dieser beinhaltet die zu verwendende [NameTable](../../nametable/), die Kodierung, den Namensraum‑Bereich, das aktuelle **xml:lang** und den **xml:space**‑Bereich. |
## Hinweise



Die folgende Tabelle listet gültige Werte für **fragType** auf und zeigt, wie der Reader jeden der verschiedenen Knotentypen verarbeitet. |||
|-|-|
| XmlNodeType | Fragment kann enthalten |
| Element | Beliebiger gültiger Elementinhalt (zum Beispiel jede Kombination von Elementen, Kommentaren, Verarbeitungsanweisungen, cdata, Text und Entity-Referenzen). |
| Attribute | Der Wert eines Attributs (der Teil innerhalb der Anführungszeichen). |
| Document | Der Inhalt eines gesamten XML-Dokuments; dies erzwingt Dokumentebenenregeln. |

## Siehe auch

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
