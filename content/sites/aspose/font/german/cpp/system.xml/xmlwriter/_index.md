---
title: "System::Xml::XmlWriter Klasse"
linktitle: "XmlWriter"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlWriter Klasse. Stellt einen Writer dar, der eine schnelle, nicht zwischengespeicherte, vorwärtsgerichtete Methode zum Erzeugen von Streams oder Dateien bietet, die XML-Daten in C++ enthalten."
type: docs
weight: 4400
url: /de/cpp/system.xml/xmlwriter/
---
## XmlWriter class


Stellt einen Writer dar, der eine schnelle, nicht zwischengespeicherte, vorwärtsgerichtete Möglichkeit bietet, Streams oder Dateien zu erzeugen, die XML-Daten enthalten.

```cpp
class XmlWriter : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Close](./close/)() | Wenn in einer abgeleiteten Klasse überschrieben, schließt dieser Stream und der zugrunde liegende Stream. |
| static [Create](./create/)(const String\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen Dateinamen. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem Dateinamen und dem [XmlWriterSettings](../xmlwritersettings/)-Objekt. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen Stream. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem Stream und dem [XmlWriterSettings](../xmlwritersettings/)-Objekt. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen TextWriter. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem TextWriter und den [XmlWriterSettings](../xmlwritersettings/)-Objekten. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen [Text::StringBuilder](../../system.text/stringbuilder/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem [Text::StringBuilder](../../system.text/stringbuilder/) und den [XmlWriterSettings](../xmlwritersettings/)-Objekten. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen [XmlWriter](./)-Objekt. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen [XmlWriter](./)- und den [XmlWriterSettings](../xmlwritersettings/)-Objekten. |
| [Dispose](./dispose/)() override | Gibt alle von der aktuellen Instanz der [XmlWriter](./)-Klasse verwendeten Ressourcen frei. |
| virtual [Flush](./flush/)() | Wenn in einer abgeleiteten Klasse überschrieben, spült alles, was sich im Puffer befindet, in die zugrunde liegenden Streams und spült auch den zugrunde liegenden Stream. |
| virtual [get_Settings](./get_settings/)() | Gibt das [XmlWriterSettings](../xmlwritersettings/)‑Objekt zurück, das verwendet wurde, um diese [XmlWriter](./)‑Instanz zu erstellen. |
| virtual [get_WriteState](./get_writestate/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Zustand des Writers zurück. |
| virtual [get_XmlLang](./get_xmllang/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den aktuellen **xml:lang**‑Geltungsbereich zurück. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Wenn in einer abgeleiteten Klasse überschrieben, liefert ein [XmlSpace](../xmlspace/), das den aktuellen **xml:space**‑Bereich darstellt. |
| virtual [LookupPrefix](./lookupprefix/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, gibt das dem aktuellen Namensraum‑Bereich für die Namensraum‑URI nächstgelegene Präfix zurück. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt alle Attribute, die an der aktuellen Position im [XmlReader](../xmlreader/) gefunden wurden, aus. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt ein Attribut mit dem angegebenen lokalen Namen, der Namespace‑URI und dem Wert. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt das Attribut mit dem angegebenen lokalen Namen und Wert aus. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt das Attribut mit dem angegebenen Präfix, lokalen Namen, Namespace‑URI und Wert aus. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, kodiert die angegebenen Binärbytes als Base64 und schreibt den resultierenden Text aus. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, kodiert die angegebenen Binärbytes als **BinHex** und schreibt den resultierenden Text aus. |
| virtual [WriteCData](./writecdata/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt einen **...**‑Block, der den angegebenen Text enthält, aus. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | Wenn in einer abgeleiteten Klasse überschrieben, erzwingt die Erzeugung einer Zeichenentität für den angegebenen Unicode‑Zeichenwert. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt Text jeweils einen Puffer nach dem anderen. |
| virtual [WriteComment](./writecomment/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt einen Kommentar ****, der den angegebenen Text enthält, aus. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt die DOCTYPE‑Deklaration mit dem angegebenen Namen und optionalen Attributen. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | Schreibt ein Element mit dem angegebenen lokalen Namen und Wert. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | Schreibt ein Element mit dem angegebenen lokalen Namen, der Namespace‑URI und dem Wert. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | Schreibt ein Element mit dem angegebenen Präfix, lokalen Namen, der Namespace‑URI und dem Wert. |
| virtual [WriteEndAttribute](./writeendattribute/)() | Wenn in einer abgeleiteten Klasse überschrieben, schließt den vorherigen Aufruf XmlWriter::WriteStartAttribute(String,String). |
| virtual [WriteEndDocument](./writeenddocument/)() | Wenn in einer abgeleiteten Klasse überschrieben, schließt alle offenen Elemente oder Attribute und versetzt den Writer zurück in den Start‑Zustand. |
| virtual [WriteEndElement](./writeendelement/)() | Wenn in einer abgeleiteten Klasse überschrieben, schließt ein Element und entfernt den entsprechenden Namensraum‑Bereich. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt eine Entity‑Referenz als **&name**; aus. |
| virtual [WriteFullEndElement](./writefullendelement/)() | Wenn in einer abgeleiteten Klasse überschrieben, schließt ein Element und entfernt den entsprechenden Namensraum‑Bereich. |
| virtual [WriteName](./writename/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt den angegebenen Namen aus und stellt sicher, dass er ein gültiger Name gemäß der W3C XML 1.0‑Empfehlung ist ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt den angegebenen Namen aus und stellt sicher, dass er ein gültiger NmToken gemäß der W3C XML 1.0‑Empfehlung ist ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | Wenn in einer abgeleiteten Klasse überschrieben, kopiert alles vom reader zum writer und bewegt den reader zum Beginn des nächsten Geschwisterelements. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | Kopiert alles vom XPathNavigator-Objekt zum writer. Die Position des XPathNavigator bleibt unverändert. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt eine Verarbeitungsanweisung mit einem Leerzeichen zwischen Name und Text wie folgt: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt den namespace-qualifizierten Namen. Diese Methode sucht das im Gültigkeitsbereich für den angegebenen Namespace vorhandene Präfix. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt rohes Markup manuell aus einem Zeichenpuffer. |
| virtual [WriteRaw](./writeraw/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt rohes Markup manuell aus einem String. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | Schreibt den Beginn eines Attributs mit dem angegebenen lokalen Namen und Namespace-URI. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt den Beginn eines Attributs mit dem angegebenen Präfix, lokalen Namen und Namespace-URI. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | Schreibt den Beginn eines Attributs mit dem angegebenen lokalen Namen. |
| virtual [WriteStartDocument](./writestartdocument/)() | Wenn in einer abgeleiteten Klasse überschrieben, schreibt die XML-Deklaration mit der Version "1.0". |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt die XML-Deklaration mit der Version "1.0" und dem standalone-Attribut. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt das angegebene Start-Tag und verknüpft es mit dem angegebenen Namespace. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt das angegebene Start-Tag und verknüpft es mit dem angegebenen Namespace und Präfix. |
| [WriteStartElement](./writestartelement/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt ein Start-Tag mit dem angegebenen lokalen Namen. |
| virtual [WriteString](./writestring/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt den angegebenen Textinhalt. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | Wenn in einer abgeleiteten Klasse überschrieben, erzeugt und schreibt die Surrogat-Zeichenentität für das Surrogat-Zeichenpaar. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | Schreibt den Objektwert. |
| virtual [WriteValue](./writevalue/)(const String\&) | Schreibt einen [String](../../system/string/) Wert. |
| virtual [WriteValue](./writevalue/)(bool) | Schreibt einen [Boolean](../../system/boolean/) Wert. |
| virtual [WriteValue](./writevalue/)(DateTime) | Schreibt einen [DateTime](../../system/datetime/) Wert. |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | Schreibt einen [DateTimeOffset](../../system/datetimeoffset/) Wert. |
| virtual [WriteValue](./writevalue/)(double) | Schreibt einen [Double](../../system/double/) Wert. |
| virtual [WriteValue](./writevalue/)(float) | Schreibt eine Gleitkommazahl mit einfacher Genauigkeit. |
| virtual [WriteValue](./writevalue/)(Decimal) | Schreibt einen [Decimal](../../system/decimal/) Wert. |
| virtual [WriteValue](./writevalue/)(int32_t) | Schreibt einen [Int32](../../system/int32/) Wert. |
| virtual [WriteValue](./writevalue/)(int64_t) | Schreibt einen [Int64](../../system/int64/) Wert. |
| virtual [WriteWhitespace](./writewhitespace/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es das angegebene Leerzeichen aus. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
