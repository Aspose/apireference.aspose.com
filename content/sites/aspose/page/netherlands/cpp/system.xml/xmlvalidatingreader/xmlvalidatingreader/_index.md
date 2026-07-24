---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader constructor"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader constructor. Initialiseert een nieuw exemplaar van de XmlValidatingReader‑klasse met de opgegeven waarden in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlValidatingReader](../)‑klasse met de opgegeven waarden.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | De stream die het XML-fragment bevat dat moet worden geparseerd. |
| fragType | XmlNodeType | Het [XmlNodeType](../../xmlnodetype/) van het XML‑fragment. Dit bepaalt wat het fragment kan bevatten (zie tabel hieronder). |
| context | const SharedPtr\<XmlParserContext\>\& | De [XmlParserContext](../../xmlparsercontext/) waarin het XML‑fragment moet worden geparseerd. Dit omvat de te gebruiken [XmlNameTable](../../xmlnametable/), codering, namespace‑bereik, huidige **xml:lang**, en **xml:space**‑bereik. |
## Opmerkingen



De volgende tabel geeft geldige waarden voor **fragType** weer en hoe de lezer elk van de verschillende knooppunt‑typen verwerkt. |||
|-|-|
| XmlNodeType | Fragment mag bevatten |
| Element | Elke geldige elementinhoud (bijvoorbeeld een combinatie van elementen, opmerkingen, verwerkingsinstructies, cdata, tekst en entiteitsreferenties). |
| Attribute | De waarde van een attribuut (het deel binnen de aanhalingstekens). |
| Document | De inhoud van een volledig XML‑document; dit handhaaft regels op documentniveau. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlValidatingReader](../)‑klasse die de inhoud valideert die wordt geretourneerd door de opgegeven [XmlReader](../../xmlreader/).

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | De [XmlReader](../../xmlreader/) om vanuit te lezen tijdens het valideren. De huidige implementatie ondersteunt alleen [XmlTextReader](../../xmltextreader/). |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlValidatingReader](../)‑klasse met de opgegeven waarden.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| xmlFragment | const String\& | De string die het XML-fragment bevat om te parseren. |
| fragType | XmlNodeType | Het [XmlNodeType](../../xmlnodetype/) van het XML-fragment. Dit bepaalt ook wat de fragmenttekenreeks kan bevatten (zie tabel hieronder). |
| context | const SharedPtr\<XmlParserContext\>\& | De [XmlParserContext](../../xmlparsercontext/) waarin het XML-fragment moet worden geparseerd. Dit omvat de te gebruiken [NameTable](../../nametable/), codering, namespace‑bereik, de huidige **xml:lang**, en **xml:space**‑bereik. |
## Opmerkingen



De volgende tabel geeft geldige waarden voor **fragType** weer en hoe de lezer elk van de verschillende knooppunt‑typen verwerkt. |||
|-|-|
| XmlNodeType | Fragment mag bevatten |
| Element | Elke geldige elementinhoud (bijvoorbeeld een combinatie van elementen, opmerkingen, verwerkingsinstructies, cdata, tekst en entiteitsreferenties). |
| Attribute | De waarde van een attribuut (het deel binnen de aanhalingstekens). |
| Document | De inhoud van een volledig XML‑document; dit handhaaft regels op documentniveau. |

## Zie ook

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
