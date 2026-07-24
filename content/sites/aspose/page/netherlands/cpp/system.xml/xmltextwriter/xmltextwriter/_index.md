---
title: "System::Xml::XmlTextWriter::XmlTextWriter constructor"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextWriter::XmlTextWriter constructor. Maakt een instantie van de XmlTextWriter‑klasse met de opgegeven stream en codering in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


Maakt een instantie van de [XmlTextWriter](../)‑klasse met de opgegeven stream en codering.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | De stream waarin u wilt schrijven. |
| encoding | const SharedPtr\<Text::Encoding\>\& | De te genereren codering. Als de codering **nullptr** is, wordt de stream weggeschreven als UTF-8 en wordt het codering‑attribuut van de **ProcessingInstruction** weggelaten. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


Maakt een instantie van de [XmlTextWriter](../)‑klasse met de opgegeven TextWriter.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | De TextWriter om naar te schrijven. Er wordt aangenomen dat de TextWriter al op de juiste codering is ingesteld. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


Maakt een instantie van de [XmlTextWriter](../)‑klasse met het opgegeven bestand.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| filename | const String\& | De bestandsnaam om naar te schrijven. Als het bestand bestaat, wordt het ingekort en wordt de nieuwe inhoud overschreven. |
| encoding | const SharedPtr\<Text::Encoding\>\& | De te genereren codering. Als de codering **nullptr** is, wordt het bestand weggeschreven als UTF-8 en wordt het codering‑attribuut van de **ProcessingInstruction** weggelaten. |

## Zie ook

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
