---
title: "System::Xml::XmlTextReader‑klasse"
linktitle: "XmlTextReader"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextReader‑klasse. Stelt een lezer voor die snelle, niet‑gecachede, alleen‑voorwaartse toegang tot XML‑gegevens in C++ biedt."
type: docs
weight: 3900
url: /nl/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


Stelt een lezer voor die snelle, niet‑gecachede, alleen‑voorwaartse toegang tot XML-gegevens biedt.

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Wijzigt de [XmlReader::get_ReadState](../xmlreader/get_readstate/) naar **Closed**. |
| [get_AttributeCount](./get_attributecount/)() override | Retourneert het aantal attributen op het huidige knooppunt. |
| [get_BaseURI](./get_baseuri/)() override | Retourneert de basis-URI van het huidige knooppunt. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Retourneert een waarde die aangeeft of de [XmlTextReader](./) de methoden voor het lezen van binaire inhoud implementeert. |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | Retourneert een waarde die aangeeft of de [XmlTextReader](./) de [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/) methode implementeert. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Retourneert een waarde die aangeeft of deze lezer entiteiten kan parseren en oplossen. |
| [get_Depth](./get_depth/)() override | Geeft de diepte van het huidige knooppunt in het XML-document terug. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Retourneert de [DtdProcessing](../dtdprocessing/) enumeratie. |
| [get_Encoding](./get_encoding/)() | Retourneert de codering van het document. |
| [get_EntityHandling](./get_entityhandling/)() | Retourneert een waarde die aangeeft hoe de lezer entiteiten verwerkt. |
| [get_EOF](./get_eof/)() override | Geeft een waarde terug die aangeeft of de lezer zich aan het einde van de stroom bevindt. |
| [get_HasValue](./get_hasvalue/)() override | Retourneert een waarde die aangeeft of het huidige knooppunt een [XmlTextReader::get_Value](./get_value/) kan hebben dat anders is dan [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Retourneert een waarde die aangeeft of het huidige knooppunt een attribuut is dat is gegenereerd vanuit de standaardwaarde gedefinieerd in de DTD of het schema. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Geeft een waarde terug die aangeeft of het huidige knooppunt een leeg element is (bijvoorbeeld **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Retourneert het huidige regelnummer. |
| [get_LinePosition](./get_lineposition/)() override | Retourneert de huidige regelpositie. |
| [get_LocalName](./get_localname/)() override | Retourneert de lokale naam van het huidige knooppunt. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het huidige knooppunt terug. |
| [get_Namespaces](./get_namespaces/)() | Retourneert een waarde die aangeeft of namespace‑ondersteuning moet worden toegepast. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Geeft de namespace-URI (zoals gedefinieerd in de W3C Namespace-specificatie) van het knooppunt waarop de lezer zich bevindt terug. |
| [get_NameTable](./get_nametable/)() override | Geeft de [XmlNameTable](../xmlnametable/) die aan deze implementatie is gekoppeld terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_Normalization](./get_normalization/)() | Retourneert een waarde die aangeeft of witruimte en attribuutwaarden genormaliseerd moeten worden. |
| [get_Prefix](./get_prefix/)() override | Geeft het namespace-voorvoegsel dat aan het huidige knooppunt is gekoppeld terug. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Retourneert een waarde die aangeeft of DTD-verwerking is toegestaan. |
| [get_QuoteChar](./get_quotechar/)() override | Retourneert het aanhalingsteken dat wordt gebruikt om de waarde van een attribuutknooppunt te omgeven. |
| [get_ReadState](./get_readstate/)() override | Geeft de status van de lezer terug. |
| [get_Value](./get_value/)() override | Geeft de tekstwaarde van het huidige knooppunt terug. |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | Retourneert een waarde die aangeeft hoe witruimte wordt verwerkt. |
| [get_XmlLang](./get_xmllang/)() override | Retourneert de huidige **xml:lang**‑scope. |
| [get_XmlSpace](./get_xmlspace/)() override | Geeft het huidige **xml:space**-bereik terug. |
| [GetAttribute](./getattribute/)(String) override | Geeft de waarde van het attribuut met de opgegeven naam terug. |
| [GetAttribute](./getattribute/)(String, String) override | Geeft de waarde van het attribuut met de opgegeven lokale naam en namespace-URI terug. |
| [GetAttribute](./getattribute/)(int32_t) override | Geeft de waarde van het attribuut met de opgegeven index terug. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Retourneert een collectie die alle momenteel in scope zijnde namespaces bevat. |
| [GetRemainder](./getremainder/)() | Retourneert de rest van de gebufferde XML. |
| [HasLineInfo](./haslineinfo/)() override | Retourneert een waarde die aangeeft of de klasse regelinformatie kan retourneren. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Lost een namespace-voorvoegsel op in het bereik van het huidige element. |
| [MoveToAttribute](./movetoattribute/)(String) override | Verplaatst zich naar het attribuut met de opgegeven naam. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Verplaatst zich naar het attribuut met de opgegeven lokale naam en namespace-URI. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Verplaatst zich naar het attribuut met de opgegeven index. |
| [MoveToElement](./movetoelement/)() override | Verplaatst zich naar het element dat het huidige attribuutknooppunt bevat. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Verplaatst zich naar het eerste attribuut. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Verplaatst zich naar het volgende attribuut. |
| [Read](./read/)() override | Leest het volgende knooppunt uit de stroom. |
| [ReadAttributeValue](./readattributevalue/)() override | Parseert de attribuutwaarde naar één of meer **[Text](../../system.text/)**, **EntityReference**, of **EndEntity** knooppunten. |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Decodeert Base64 en retourneert de gedecodeerde binaire bytes. |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Decodeert **BinHex** en retourneert de gedecodeerde binaire bytes. |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | Leest de tekstinhoud van een element in een tekenbuffer. Deze methode is ontworpen om grote stromen van ingesloten tekst achtereenvolgens te lezen. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Leest de inhoud en retourneert de **Base64** gedecodeerde binaire bytes. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Leest de inhoud en retourneert de **BinHex** gedecodeerde binaire bytes. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Leest het element en decodeert de Base64-inhoud. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Leest het element en decodeert de **BinHex** inhoud. |
| [ReadString](./readstring/)() override | Leest de inhoud van een element of een tekstknooppunt als een string. |
| [ResetState](./resetstate/)() | Reset de status van de lezer naar [ReadState::Initial](../readstate/). |
| [ResolveEntity](./resolveentity/)() override | Lost de entiteitsreferentie op voor **EntityReference** knooppunten. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Stelt de [DtdProcessing](../dtdprocessing/) enumeratie in. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Stelt een waarde in die aangeeft hoe de lezer entiteiten verwerkt. |
| [set_Namespaces](./set_namespaces/)(bool) | Stelt een waarde in die aangeeft of namespace-ondersteuning moet worden uitgevoerd. |
| [set_Normalization](./set_normalization/)(bool) | Stelt een waarde in die aangeeft of witruimte en attribuutwaarden genormaliseerd moeten worden. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Stelt een waarde in die aangeeft of DTD-verwerking is toegestaan. |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | Stelt een waarde in die aangeeft hoe witruimte wordt behandeld. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Stelt de [XmlResolver](../xmlresolver/) in die wordt gebruikt voor het oplossen van DTD-referenties. |
| [Skip](./skip/)() override | Slaat de kinderen van het huidige knooppunt over. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven stream. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven URL en stream. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven stream en [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven URL, stream en [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven TextReader. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven URL en TextReader. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven TextReader en [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven URL, TextReader en [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven stream, [XmlNodeType](../xmlnodetype/), en [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met de opgegeven string, [XmlNodeType](../xmlnodetype/), en [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met het opgegeven bestand. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuwe instantie van de [XmlTextReader](./) klasse met het opgegeven bestand en [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Het wordt aanbevolen om in plaats daarvan de [XmlReader](../xmlreader/) klasse te gebruiken.

Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
