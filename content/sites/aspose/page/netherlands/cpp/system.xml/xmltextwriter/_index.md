---
title: "System::Xml::XmlTextWriter klasse"
linktitle: "XmlTextWriter"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextWriter klasse. Vertegenwoordigt een schrijver die een snelle, niet‑gecachede, alleen‑voorwaarts manier biedt om streams of bestanden te genereren die XML‑gegevens bevatten en voldoen aan de W3C Extensible Markup Language (XML) 1.0 en de Namespaces in XML‑aanbevelingen in C++."
type: docs
weight: 4000
url: /nl/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


Stelt een schrijver voor die een snelle, niet‑gecachede, alleen‑voorwaartse manier biedt om streams of bestanden te genereren die XML-gegevens bevatten en voldoen aan de W3C Extensible Markup Language (XML) 1.0‑specificatie en de Namespaces in XML‑aanbevelingen.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Sluit deze stream en de onderliggende stream. |
| [Flush](./flush/)() override | Leegt alles wat in de buffer zit naar de onderliggende streams en leegt ook de onderliggende stream. |
| [get_BaseStream](./get_basestream/)() | Retourneert het onderliggende stream‑object. |
| [get_Formatting](./get_formatting/)() | Geeft aan hoe de uitvoer wordt opgemaakt. |
| [get_Indentation](./get_indentation/)() | Retourneert hoeveel IndentChars er voor elk niveau in de hiërarchie moeten worden geschreven wanneer [XmlTextWriter::set_Formatting](./set_formatting/) is ingesteld op [Formatting::Indented](../formatting/). |
| [get_IndentChar](./get_indentchar/)() | Retourneert welk teken moet worden gebruikt voor inspringen wanneer [XmlTextWriter::set_Formatting](./set_formatting/) is ingesteld op [Formatting::Indented](../formatting/). |
| [get_Namespaces](./get_namespaces/)() | Retourneert een waarde die aangeeft of namespace‑ondersteuning moet worden toegepast. |
| [get_QuoteChar](./get_quotechar/)() | Retourneert welk teken moet worden gebruikt om attribuutwaarden te citeren. |
| [get_WriteState](./get_writestate/)() override | Retourneert de status van de schrijver. |
| [get_XmlLang](./get_xmllang/)() override | Retourneert de huidige **xml:lang**‑scope. |
| [get_XmlSpace](./get_xmlspace/)() override | Retourneert een [XmlSpace](../xmlspace/) die de huidige **xml:space**‑scope vertegenwoordigt. |
| [LookupPrefix](./lookupprefix/)(String) override | Retourneert het dichtstbijzijnde voorvoegsel dat is gedefinieerd in de huidige namespace‑scope voor de namespace‑URI. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | Geeft aan hoe de uitvoer wordt opgemaakt. |
| [set_Indentation](./set_indentation/)(int32_t) | Stelt in hoeveel IndentChars er voor elk niveau in de hiërarchie moeten worden geschreven wanneer [XmlTextWriter::set_Formatting](./set_formatting/) is ingesteld op [Formatting::Indented](../formatting/). |
| [set_IndentChar](./set_indentchar/)(char16_t) | Stelt in welk teken moet worden gebruikt voor inspringen wanneer [XmlTextWriter::set_Formatting](./set_formatting/) is ingesteld op [Formatting::Indented](../formatting/). |
| [set_Namespaces](./set_namespaces/)(bool) | Stelt een waarde in die aangeeft of namespace-ondersteuning moet worden uitgevoerd. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | Stelt in welk teken moet worden gebruikt om attribuutwaarden te citeren. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Encodeert de opgegeven binaire bytes als base64 en schrijft de resulterende tekst. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Encodeert de opgegeven binaire bytes als binhex en schrijft de resulterende tekst. |
| [WriteCData](./writecdata/)(String) override | Schrijft een **...**-blok dat de opgegeven tekst bevat. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | Forceert de generatie van een tekenentiteit voor de opgegeven Unicode-tekenwaarde. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Schrijft tekst één buffer per keer. |
| [WriteComment](./writecomment/)(String) override | Schrijft een commentaar **** met de opgegeven tekst. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | Schrijft de DOCTYPE-declaratie met de opgegeven naam en optionele attributen. |
| [WriteEndAttribute](./writeendattribute/)() override | Sluit de vorige [XmlTextWriter::WriteStartAttribute](./writestartattribute/) aanroep. |
| [WriteEndDocument](./writeenddocument/)() override | Sluit eventuele open elementen of attributen en zet de schrijver terug in de Start-toestand. |
| [WriteEndElement](./writeendelement/)() override | Sluit één element en verwijdert de bijbehorende namespace-scope. |
| [WriteEntityRef](./writeentityref/)(const String\&) override | Schrijft een entiteitsreferentie als **&name**;. |
| [WriteFullEndElement](./writefullendelement/)() override | Sluit één element en verwijdert de bijbehorende namespace-scope. |
| [WriteName](./writename/)(const String\&) override | Schrijft de opgegeven naam, waarbij wordt gegarandeerd dat deze een geldige naam is volgens de [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteNmToken](./writenmtoken/)(const String\&) override | Schrijft de opgegeven naam, waarbij wordt gegarandeerd dat deze een geldig **NmToken** is volgens de [W3C XML 1.0 recommendation](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | Schrijft een verwerkingsinstructie met een spatie tussen de naam en de tekst als volgt: **<?name text?>**. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | Schrijft de namespace-gekwalificeerde naam. Deze methode zoekt het prefix op dat in scope is voor de opgegeven namespace. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Schrijft ruwe markup handmatig vanuit een tekenbuffer. |
| [WriteRaw](./writeraw/)(const String\&) override | Schrijft ruwe markup handmatig vanuit een string. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | Schrijft het begin van een attribuut. |
| [WriteStartDocument](./writestartdocument/)() override | Schrijft de XML-declaratie met de versie "1.0". |
| [WriteStartDocument](./writestartdocument/)(bool) override | Schrijft de XML-declaratie met de versie "1.0" en het standalone-attribuut. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | Schrijft de opgegeven starttag en koppelt deze aan de opgegeven namespace en prefix. |
| [WriteString](./writestring/)(const String\&) override | Schrijft de opgegeven tekstinhoud. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | Genereert en schrijft de surrogate-tekenentiteit voor het surrogate-tekenpaar. |
| [WriteWhitespace](./writewhitespace/)(String) override | Schrijft de opgegeven witruimte weg. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Maakt een instantie van de [XmlTextWriter](./) klasse aan met de opgegeven stream en codering. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | Maakt een instantie van de [XmlTextWriter](./) klasse aan met het opgegeven bestand. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | Maakt een instantie van de [XmlTextWriter](./) klasse aan met de opgegeven TextWriter. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Het wordt aanbevolen om in plaats daarvan de [XmlWriter](../xmlwriter/) klasse te gebruiken.

Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
