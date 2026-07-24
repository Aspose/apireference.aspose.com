---
title: "System::Xml::XmlTextWriter::XmlTextWriter konstruktor"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlTextWriter::XmlTextWriter konstruktor. Skapar en instans av XmlTextWriter‑klassen med den angivna strömmen och kodningen i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


Skapar en instans av [XmlTextWriter](../)-klassen med den angivna strömmen och kodningen.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | Strömmen som du vill skriva till. |
| kodning | const SharedPtr\<Text::Encoding\>\& | Kodningen att generera. Om kodning är **nullptr** skrivs strömmen ut som UTF-8 och kodningsattributet utelämnas från **ProcessingInstruction**. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


Skapar en instans av [XmlTextWriter](../)-klassen med den angivna TextWriter.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | TextWriter som ska skrivas till. Det antas att TextWriter redan är inställd på rätt kodning. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


Skapar en instans av [XmlTextWriter](../)-klassen med den angivna filen.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| filnamn | const String\& | Filnamnet att skriva till. Om filen finns trunceras den och skrivs över med det nya innehållet. |
| kodning | const SharedPtr\<Text::Encoding\>\& | Kodningen att generera. Om kodning är **nullptr** skrivs filen ut som UTF-8 och kodningsattributet utelämnas från **ProcessingInstruction**. |

## Se även

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
