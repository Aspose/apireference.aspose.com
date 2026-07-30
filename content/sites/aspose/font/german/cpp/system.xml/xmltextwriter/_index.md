---
title: "System::Xml::XmlTextWriter Klasse"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlTextWriter Klasse. Stellt einen Writer dar, der eine schnelle, nicht zwischengespeicherte, vorwärtsgerichtete Methode zum Erzeugen von Streams oder Dateien bietet, die XML‑Daten enthalten und den W3C Extensible Markup Language (XML) 1.0‑ und den Namespaces in XML‑Empfehlungen in C++ entsprechen."
type: docs
weight: 4000
url: /de/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


Stellt einen Writer dar, der eine schnelle, nicht zwischengespeicherte, nur vorwärts gerichtete Methode zum Erzeugen von Streams oder Dateien bietet, die XML-Daten enthalten und den W3C Extensible Markup Language (XML) 1.0- und den Namespaces in XML-Empfehlungen entsprechen.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Schließt diesen Stream und den zugrunde liegenden Stream. |
| [Flush](./flush/)() override | Spült alles, was im Puffer ist, in die zugrunde liegenden Streams und spült ebenfalls den zugrunde liegenden Stream. |
| [get_BaseStream](./get_basestream/)() | Gibt das zugrunde liegende Stream‑Objekt zurück. |
| [get_Formatting](./get_formatting/)() | Gibt an, wie die Ausgabe formatiert ist. |
| [get_Indentation](./get_indentation/)() | Gibt zurück, wie viele IndentChars für jede Ebene in der Hierarchie geschrieben werden, wenn [XmlTextWriter::set_Formatting](./set_formatting/) auf [Formatting::Indented](../formatting/) gesetzt ist. |
| [get_IndentChar](./get_indentchar/)() | Gibt zurück, welches Zeichen für die Einrückung verwendet werden soll, wenn [XmlTextWriter::set_Formatting](./set_formatting/) auf [Formatting::Indented](../formatting/) gesetzt ist. |
| [get_Namespaces](./get_namespaces/)() | Gibt einen Wert zurück, der angibt, ob Namespace-Unterstützung verwendet werden soll. |
| [get_QuoteChar](./get_quotechar/)() | Gibt zurück, welches Zeichen zum Zitieren von Attributwerten verwendet werden soll. |
| [get_WriteState](./get_writestate/)() override | Gibt den Zustand des Writers zurück. |
| [get_XmlLang](./get_xmllang/)() override | Gibt den aktuellen **xml:lang**-Bereich zurück. |
| [get_XmlSpace](./get_xmlspace/)() override | Gibt ein [XmlSpace](../xmlspace/) zurück, das den aktuellen **xml:space**-Bereich darstellt. |
| [LookupPrefix](./lookupprefix/)(String) override | Gibt das nächstgelegene Präfix zurück, das im aktuellen Namespace-Bereich für die Namespace-URI definiert ist. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | Gibt an, wie die Ausgabe formatiert ist. |
| [set_Indentation](./set_indentation/)(int32_t) | Legt fest, wie viele IndentChars für jede Ebene in der Hierarchie geschrieben werden, wenn [XmlTextWriter::set_Formatting](./set_formatting/) auf [Formatting::Indented](../formatting/) gesetzt ist. |
| [set_IndentChar](./set_indentchar/)(char16_t) | Legt fest, welches Zeichen für die Einrückung verwendet werden soll, wenn [XmlTextWriter::set_Formatting](./set_formatting/) auf [Formatting::Indented](../formatting/) gesetzt ist. |
| [set_Namespaces](./set_namespaces/)(bool) | Legt einen Wert fest, der angibt, ob Namespace-Unterstützung verwendet werden soll. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | Legt fest, welches Zeichen zum Zitieren von Attributwerten verwendet werden soll. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Kodiert die angegebenen Binärbytes als Base64 und schreibt den resultierenden Text. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Kodiert die angegebenen Binärbytes als BinHex und schreibt den resultierenden Text. |
| [WriteCData](./writecdata/)(String) override | Schreibt einen **...**-Block, der den angegebenen Text enthält. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | Erzwingt die Erzeugung einer Zeichenentität für den angegebenen Unicode-Zeichenwert. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Schreibt Text jeweils einen Puffer nach dem anderen. |
| [WriteComment](./writecomment/)(String) override | Schreibt einen Kommentar ****, der den angegebenen Text enthält. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | Schreibt die DOCTYPE-Deklaration mit dem angegebenen Namen und optionalen Attributen. |
| [WriteEndAttribute](./writeendattribute/)() override | Schließt den vorherigen Aufruf von [XmlTextWriter::WriteStartAttribute](./writestartattribute/). |
| [WriteEndDocument](./writeenddocument/)() override | Schließt alle offenen Elemente oder Attribute und versetzt den Writer zurück in den Startzustand. |
| [WriteEndElement](./writeendelement/)() override | Schließt ein Element und entfernt den entsprechenden Namespace-Bereich. |
| [WriteEntityRef](./writeentityref/)(const String\&) override | Schreibt eine Entity-Referenz als **&name**;. |
| [WriteFullEndElement](./writefullendelement/)() override | Schließt ein Element und entfernt den entsprechenden Namespace-Bereich. |
| [WriteName](./writename/)(const String\&) override | Schreibt den angegebenen Namen und stellt sicher, dass er ein gültiger Name gemäß der [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) ist. |
| [WriteNmToken](./writenmtoken/)(const String\&) override | Schreibt den angegebenen Namen und stellt sicher, dass er ein gültiges **NmToken** gemäß der [W3C XML 1.0-Empfehlung](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name) ist. |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | Schreibt eine Verarbeitungsanweisung mit einem Leerzeichen zwischen Name und Text wie folgt: **<?name text?>**. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | Schreibt den namespace-qualifizierten Namen. Diese Methode sucht das im Geltungsbereich des angegebenen Namespace befindliche Präfix. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Schreibt rohes Markup manuell aus einem Zeichenpuffer. |
| [WriteRaw](./writeraw/)(const String\&) override | Schreibt rohes Markup manuell aus einem String. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | Schreibt den Beginn eines Attributs. |
| [WriteStartDocument](./writestartdocument/)() override | Schreibt die XML-Deklaration mit der Version "1.0". |
| [WriteStartDocument](./writestartdocument/)(bool) override | Schreibt die XML-Deklaration mit der Version "1.0" und dem Standalone-Attribut. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | Schreibt das angegebene Start-Tag und verknüpft es mit dem angegebenen Namespace und Präfix. |
| [WriteString](./writestring/)(const String\&) override | Schreibt den angegebenen Textinhalt. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | Erzeugt und schreibt die Surrogat-Zeichenentität für das Surrogat-Zeichenpaar. |
| [WriteWhitespace](./writewhitespace/)(String) override | Schreibt das angegebene Leerzeichen. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Erstellt eine Instanz der Klasse [XmlTextWriter](./) mit dem angegebenen Stream und der angegebenen Kodierung. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | Erstellt eine Instanz der Klasse [XmlTextWriter](./) mit der angegebenen Datei. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | Erstellt eine Instanz der Klasse [XmlTextWriter](./) mit dem angegebenen TextWriter. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Es wird empfohlen, stattdessen die Klasse [XmlWriter](../xmlwriter/) zu verwenden.

Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
