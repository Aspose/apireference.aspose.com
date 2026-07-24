---
title: "System::Xml::XmlWriter Klasse"
linktitle: "XmlWriter"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlWriter Klasse. Stellt einen Writer dar, der eine schnelle, nicht zwischengespeicherte, nur vorwärts gerichtete Möglichkeit bietet, Streams oder Dateien zu erzeugen, die XML‑Daten in C++ enthalten."
type: docs
weight: 4400
url: /de/cpp/system.xml/xmlwriter/
---
## XmlWriter class


Stellt einen Writer dar, der eine schnelle, nicht zwischengespeicherte, nur vorwärts gerichtete Methode zum Erzeugen von Streams oder Dateien bietet, die XML-Daten enthalten.

```cpp
class XmlWriter : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Close](./close/)() | Wird in einer abgeleiteten Klasse überschrieben, schließt diesen Stream und den zugrunde liegenden Stream. |
| static [Create](./create/)(const String\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen Dateinamen. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem Dateinamen und dem [XmlWriterSettings](../xmlwritersettings/)-Objekt. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen Stream. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem Stream und dem [XmlWriterSettings](../xmlwritersettings/)-Objekt. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen TextWriter. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem TextWriter und den [XmlWriterSettings](../xmlwritersettings/)-Objekten. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen [Text::StringBuilder](../../system.text/stringbuilder/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem [Text::StringBuilder](../../system.text/stringbuilder/) und den [XmlWriterSettings](../xmlwritersettings/)-Objekten. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen [XmlWriter](./)-Objekt. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Erstellt eine neue [XmlWriter](./)-Instanz mit dem angegebenen [XmlWriter](./) und den [XmlWriterSettings](../xmlwritersettings/)-Objekten. |
| [Dispose](./dispose/)() override | Gibt alle Ressourcen frei, die von der aktuellen Instanz der [XmlWriter](./)-Klasse verwendet werden. |
| virtual [Flush](./flush/)() | Wird in einer abgeleiteten Klasse überschrieben, spült alles, was im Puffer ist, zu den zugrunde liegenden Streams und spült ebenfalls den zugrunde liegenden Stream. |
| virtual [get_Settings](./get_settings/)() | Gibt das [XmlWriterSettings](../xmlwritersettings/)-Objekt zurück, das zur Erstellung dieser [XmlWriter](./)-Instanz verwendet wurde. |
| virtual [get_WriteState](./get_writestate/)() | Wird in einer abgeleiteten Klasse überschrieben, liefert den Zustand des Writers. |
| virtual [get_XmlLang](./get_xmllang/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den aktuellen **xml:lang**‑Bereich zurück. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Wird in einer abgeleiteten Klasse überschrieben, liefert ein [XmlSpace](../xmlspace/), das den aktuellen **xml:space**‑Bereich darstellt. |
| virtual [LookupPrefix](./lookupprefix/)(String) | Wird in einer abgeleiteten Klasse überschrieben, gibt das nächstgelegene Präfix zurück, das im aktuellen Namensraum‑Bereich für die Namespace‑URI definiert ist. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | Wird in einer abgeleiteten Klasse überschrieben, schreibt alle Attribute, die an der aktuellen Position im [XmlReader](../xmlreader/) gefunden werden, aus. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | Wird in einer abgeleiteten Klasse überschrieben, schreibt ein Attribut mit dem angegebenen lokalen Namen, der Namespace‑URI und dem Wert. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | Wird in einer abgeleiteten Klasse überschrieben, schreibt das Attribut mit dem angegebenen lokalen Namen und Wert aus. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | Wird in einer abgeleiteten Klasse überschrieben, schreibt das Attribut mit dem angegebenen Präfix, lokalen Namen, Namespace‑URI und Wert aus. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Wird in einer abgeleiteten Klasse überschrieben, kodiert die angegebenen Binärbytes als Base64 und schreibt den resultierenden Text aus. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Wird in einer abgeleiteten Klasse überschrieben, kodiert die angegebenen Binärbytes als **BinHex** und schreibt den resultierenden Text aus. |
| virtual [WriteCData](./writecdata/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es einen **...**-Block, der den angegebenen Text enthält. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | Wenn in einer abgeleiteten Klasse überschrieben, erzwingt es die Erzeugung einer Zeichenentität für den angegebenen Unicode‑Zeichenwert. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es Text jeweils ein Puffer nach dem anderen. |
| virtual [WriteComment](./writecomment/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es einen Kommentar ****, der den angegebenen Text enthält. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es die DOCTYPE‑Deklaration mit dem angegebenen Namen und optionalen Attributen. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | Schreibt ein Element mit dem angegebenen lokalen Namen und Wert. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | Schreibt ein Element mit dem angegebenen lokalen Namen, Namespace‑URI und Wert. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | Schreibt ein Element mit dem angegebenen Präfix, lokalen Namen, Namespace‑URI und Wert. |
| virtual [WriteEndAttribute](./writeendattribute/)() | Wenn in einer abgeleiteten Klasse überschrieben, schließt es den vorherigen Aufruf XmlWriter::WriteStartAttribute(String,String). |
| virtual [WriteEndDocument](./writeenddocument/)() | Wenn in einer abgeleiteten Klasse überschrieben, schließt es alle offenen Elemente oder Attribute und versetzt den Writer zurück in den Start‑Zustand. |
| virtual [WriteEndElement](./writeendelement/)() | Wenn in einer abgeleiteten Klasse überschrieben, schließt es ein Element und entfernt den entsprechenden Namespace‑Bereich. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es eine Entity‑Referenz als **&name**;. |
| virtual [WriteFullEndElement](./writefullendelement/)() | Wenn in einer abgeleiteten Klasse überschrieben, schließt es ein Element und entfernt den entsprechenden Namespace‑Bereich. |
| virtual [WriteName](./writename/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es den angegebenen Namen und stellt sicher, dass er gemäß der W3C XML 1.0‑Empfehlung ein gültiger Name ist ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es den angegebenen Namen und stellt sicher, dass er gemäß der W3C XML 1.0‑Empfehlung ein gültiger NmToken ist ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | Wenn in einer abgeleiteten Klasse überschrieben, kopiert es alles vom Reader zum Writer und bewegt den Reader zum Anfang des nächsten Geschwisters. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | Kopiert alles vom XPathNavigator‑Objekt zum Writer. Die Position des XPathNavigator bleibt unverändert. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es eine Verarbeitungsanweisung mit einem Leerzeichen zwischen Name und Text wie folgt: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es den namespace‑qualifizierten Namen. Diese Methode ermittelt das im Geltungsbereich des angegebenen Namespace vorhandene Präfix. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es rohes Markup manuell aus einem Zeichenpuffer. |
| virtual [WriteRaw](./writeraw/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es rohes Markup manuell aus einem String. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | Schreibt den Beginn eines Attributs mit dem angegebenen lokalen Namen und Namespace‑URI. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es den Beginn eines Attributs mit dem angegebenen Präfix, lokalen Namen und Namespace‑URI. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | Schreibt den Beginn eines Attributs mit dem angegebenen lokalen Namen. |
| virtual [WriteStartDocument](./writestartdocument/)() | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es die XML‑Deklaration mit der Version "1.0". |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es die XML‑Deklaration mit der Version "1.0" und dem Standalone‑Attribut. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es das angegebene Start-Tag und verknüpft es mit dem angegebenen Namensraum. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es das angegebene Start-Tag und verknüpft es mit dem angegebenen Namensraum und Präfix. |
| [WriteStartElement](./writestartelement/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es ein Start-Tag mit dem angegebenen lokalen Namen. |
| virtual [WriteString](./writestring/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es den angegebenen Textinhalt. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | Wenn in einer abgeleiteten Klasse überschrieben, erzeugt und schreibt es die Surrogat-Zeichen-Entität für das Surrogat-Zeichenpaar. |
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
| virtual [WriteWhitespace](./writewhitespace/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, schreibt es das angegebene Leerzeichen. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
