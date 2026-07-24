---
title: "System::Xml::XmlWriter class"
linktitle: "XmlWriter"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlWriter klasse. Vertegenwoordigt een schrijver die een snelle, niet-gecachede, alleen-voorwaartse manier biedt om streams of bestanden te genereren die XML-gegevens bevatten in C++."
type: docs
weight: 4400
url: /nl/cpp/system.xml/xmlwriter/
---
## XmlWriter class


Stelt een schrijver voor die een snelle, niet‑gecachede, alleen‑voorwaartse manier biedt om streams of bestanden te genereren die XML-gegevens bevatten.

```cpp
class XmlWriter : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Close](./close/)() | Wanneer overschreven in een afgeleide klasse, sluit deze stream en de onderliggende stream. |
| static [Create](./create/)(const String\&) | Maakt een nieuw [XmlWriter](./) exemplaar aan met de opgegeven bestandsnaam. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | Maakt een nieuw [XmlWriter](./) exemplaar aan met de bestandsnaam en het [XmlWriterSettings](../xmlwritersettings/) object. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Maakt een nieuw [XmlWriter](./) exemplaar aan met de opgegeven stream. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | Maakt een nieuw [XmlWriter](./) exemplaar aan met de stream en het [XmlWriterSettings](../xmlwritersettings/) object. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | Maakt een nieuw [XmlWriter](./) exemplaar aan met de opgegeven TextWriter. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Maakt een nieuw [XmlWriter](./) exemplaar aan met de TextWriter en de [XmlWriterSettings](../xmlwritersettings/) objecten. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | Maakt een nieuw [XmlWriter](./) exemplaar aan met de opgegeven [Text::StringBuilder](../../system.text/stringbuilder/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | Maakt een nieuw [XmlWriter](./) exemplaar aan met de [Text::StringBuilder](../../system.text/stringbuilder/) en de [XmlWriterSettings](../xmlwritersettings/) objecten. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | Maakt een nieuw [XmlWriter](./) exemplaar aan met het opgegeven [XmlWriter](./) object. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Maakt een nieuw [XmlWriter](./) exemplaar aan met het opgegeven [XmlWriter](./) en de [XmlWriterSettings](../xmlwritersettings/) objecten. |
| [Dispose](./dispose/)() override | Vrijgeeft alle bronnen die worden gebruikt door de huidige instantie van de [XmlWriter](./) klasse. |
| virtual [Flush](./flush/)() | Wanneer overschreven in een afgeleide klasse, leegt het alles wat in de buffer zit naar de onderliggende streams en leegt ook de onderliggende stream. |
| virtual [get_Settings](./get_settings/)() | Retourneert het [XmlWriterSettings](../xmlwritersettings/) object dat is gebruikt om dit [XmlWriter](./) exemplaar te maken. |
| virtual [get_WriteState](./get_writestate/)() | Wanneer overschreven in een afgeleide klasse, haalt de status van de schrijver op. |
| virtual [get_XmlLang](./get_xmllang/)() | Wanneer overschreven in een afgeleide klasse, haalt de huidige **xml:lang**‑scope op. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Wanneer overschreven in een afgeleide klasse, haalt een [XmlSpace](../xmlspace/) op die de huidige **xml:space** scope vertegenwoordigt. |
| virtual [LookupPrefix](./lookupprefix/)(String) | Wanneer overschreven in een afgeleide klasse, retourneert het dichtstbijzijnde voorvoegsel dat is gedefinieerd in de huidige namespace-scope voor de namespace-URI. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | Wanneer overschreven in een afgeleide klasse, schrijft het alle attributen die zich op de huidige positie bevinden in de [XmlReader](../xmlreader/) weg. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft het een attribuut met de opgegeven lokale naam, namespace-URI en waarde. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft het het attribuut met de opgegeven lokale naam en waarde weg. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft het het attribuut met het opgegeven voorvoegsel, lokale naam, namespace-URI en waarde weg. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Wanneer overschreven in een afgeleide klasse, codeert het de opgegeven binaire bytes als Base64 en schrijft de resulterende tekst weg. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Wanneer overschreven in een afgeleide klasse, codeert het de opgegeven binaire bytes als **BinHex** en schrijft de resulterende tekst weg. |
| virtual [WriteCData](./writecdata/)(String) | Wanneer overschreven in een afgeleide klasse, schrijft een **...**‑blok dat de opgegeven tekst bevat. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | Wanneer overschreven in een afgeleide klasse, dwingt de generatie van een tekenentiteit voor de opgegeven Unicode‑tekenwaarde af. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Wanneer overschreven in een afgeleide klasse, schrijft tekst één buffer per keer. |
| virtual [WriteComment](./writecomment/)(String) | Wanneer overschreven in een afgeleide klasse, schrijft een commentaar **** dat de opgegeven tekst bevat. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft de DOCTYPE‑declaratie met de opgegeven naam en optionele attributen. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | Schrijft een element met de opgegeven lokale naam en waarde. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | Schrijft een element met de opgegeven lokale naam, namespace‑URI en waarde. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | Schrijft een element met het opgegeven voorvoegsel, lokale naam, namespace‑URI en waarde. |
| virtual [WriteEndAttribute](./writeendattribute/)() | Wanneer overschreven in een afgeleide klasse, sluit de vorige XmlWriter::WriteStartAttribute(String,String)-aanroep. |
| virtual [WriteEndDocument](./writeenddocument/)() | Wanneer overschreven in een afgeleide klasse, sluit alle geopende elementen of attributen en zet de schrijver terug in de Start‑status. |
| virtual [WriteEndElement](./writeendelement/)() | Wanneer overschreven in een afgeleide klasse, sluit één element en verwijdert de bijbehorende namespace‑scope. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft een entiteitsreferentie als **&name**;. |
| virtual [WriteFullEndElement](./writefullendelement/)() | Wanneer overschreven in een afgeleide klasse, sluit één element en verwijdert de bijbehorende namespace‑scope. |
| virtual [WriteName](./writename/)(const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft de opgegeven naam uit, waarbij wordt gegarandeerd dat deze een geldige naam is volgens de W3C XML 1.0‑aanbeveling ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft de opgegeven naam uit, waarbij wordt gegarandeerd dat deze een geldig NmToken is volgens de W3C XML 1.0‑aanbeveling ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | Wanneer overschreven in een afgeleide klasse, kopieert alles van de lezer naar de schrijver en verplaatst de lezer naar het begin van de volgende sibling. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | Kopieert alles van het XPathNavigator‑object naar de schrijver. De positie van de XPathNavigator blijft ongewijzigd. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | Wanneer overschreven in een afgeleide klasse, schrijft een verwerkingsinstructie met een spatie tussen de naam en tekst als volgt: **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft de namespace‑gekwalificeerde naam uit. Deze methode zoekt het voorvoegsel op dat binnen de scope van de opgegeven namespace valt. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Wanneer overschreven in een afgeleide klasse, schrijft ruwe markup handmatig vanuit een tekenbuffer. |
| virtual [WriteRaw](./writeraw/)(const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft ruwe markup handmatig vanuit een string. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | Schrijft het begin van een attribuut met de opgegeven lokale naam en namespace‑URI. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft het begin van een attribuut met het opgegeven voorvoegsel, lokale naam en namespace‑URI. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | Schrijft het begin van een attribuut met de opgegeven lokale naam. |
| virtual [WriteStartDocument](./writestartdocument/)() | Wanneer overschreven in een afgeleide klasse, schrijft de XML‑declaratie met versie "1.0". |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | Wanneer overschreven in een afgeleide klasse, schrijft de XML‑declaratie met versie "1.0" en het standalone‑attribuut. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft het opgegeven starttag en koppelt het aan de opgegeven namespace. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft het opgegeven starttag en koppelt het aan de opgegeven namespace en prefix. |
| [WriteStartElement](./writestartelement/)(const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft het een starttag met de opgegeven lokale naam. |
| virtual [WriteString](./writestring/)(const String\&) | Wanneer overschreven in een afgeleide klasse, schrijft de opgegeven tekstinhoud. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | Wanneer overschreven in een afgeleide klasse, genereert en schrijft het surrogate‑karakter‑entity voor het surrogate‑karakterpaar. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | Schrijft de objectwaarde. |
| virtual [WriteValue](./writevalue/)(const String\&) | Schrijft een [String](../../system/string/) waarde. |
| virtual [WriteValue](./writevalue/)(bool) | Schrijft een [Boolean](../../system/boolean/) waarde. |
| virtual [WriteValue](./writevalue/)(DateTime) | Schrijft een [DateTime](../../system/datetime/) waarde. |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | Schrijft een [DateTimeOffset](../../system/datetimeoffset/) waarde. |
| virtual [WriteValue](./writevalue/)(double) | Schrijft een [Double](../../system/double/) waarde. |
| virtual [WriteValue](./writevalue/)(float) | Schrijft een enkelprecisie floating‑point‑getal. |
| virtual [WriteValue](./writevalue/)(Decimal) | Schrijft een [Decimal](../../system/decimal/) waarde. |
| virtual [WriteValue](./writevalue/)(int32_t) | Schrijft een [Int32](../../system/int32/) waarde. |
| virtual [WriteValue](./writevalue/)(int64_t) | Schrijft een [Int64](../../system/int64/) waarde. |
| virtual [WriteWhitespace](./writewhitespace/)(String) | Wanneer overschreven in een afgeleide klasse, schrijft het de opgegeven witruimte. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
