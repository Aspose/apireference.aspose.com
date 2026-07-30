---
title: "System::Xml::XmlTextWriter::XmlTextWriter-Konstruktor"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlTextWriter::XmlTextWriter-Konstruktor. Erstellt eine Instanz der XmlTextWriter-Klasse mit dem angegebenen Stream und der angegebenen Kodierung in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmltextwriter/xmltextwriter/
---
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) constructor


Erstellt eine Instanz der [XmlTextWriter](../)-Klasse mit dem angegebenen Stream und der angegebenen Kodierung.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::Stream> &w, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| w | const SharedPtr\<IO::Stream\>\& | Der Stream, in den Sie schreiben möchten. |
| encoding | const SharedPtr\<Text::Encoding\>\& | Die zu erzeugende Kodierung. Wenn die Kodierung **nullptr** ist, schreibt es den Stream als UTF-8 und lässt das Kodierungsattribut der **ProcessingInstruction** weg. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const SharedPtr\<IO::TextWriter\>\&) constructor


Erstellt eine Instanz der [XmlTextWriter](../)-Klasse mit dem angegebenen TextWriter.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const SharedPtr<IO::TextWriter> &w)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| w | const SharedPtr\<IO::TextWriter\>\& | Der TextWriter, in den geschrieben werden soll. Es wird angenommen, dass der TextWriter bereits auf die korrekte Kodierung eingestellt ist. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlTextWriter::XmlTextWriter(const String\&, const SharedPtr\<Text::Encoding\>\&) constructor


Erstellt eine Instanz der [XmlTextWriter](../)-Klasse mit der angegebenen Datei.

```cpp
System::Xml::XmlTextWriter::XmlTextWriter(const String &filename, const SharedPtr<Text::Encoding> &encoding)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| filename | const String\& | Der Dateiname, in den geschrieben werden soll. Wenn die Datei existiert, wird sie gekürzt und mit dem neuen Inhalt überschrieben. |
| encoding | const SharedPtr\<Text::Encoding\>\& | Die zu erzeugende Kodierung. Wenn die Kodierung **nullptr** ist, schreibt es die Datei als UTF-8 und lässt das Kodierungsattribut der **ProcessingInstruction** weg. |

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
