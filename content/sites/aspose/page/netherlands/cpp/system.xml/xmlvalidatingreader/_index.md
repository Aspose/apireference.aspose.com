---
title: "System::Xml::XmlValidatingReader‑klasse"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlValidatingReader‑klasse. Vertegenwoordigt een lezer die documenttype-definitie (DTD), XML-Data Reduced (XDR) schema en XML Schema-definitietaal (XSD) validatie biedt in C++."
type: docs
weight: 4200
url: /nl/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


Vertegenwoordigt een lezer die documenttype-definitie (DTD), XML-Data Reduced (XDR) schema en XML [Schema](../../system.xml.schema/) definitietaal (XSD) validatie biedt.

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Wijzigt de [XmlReader::get_ReadState](../xmlreader/get_readstate/) naar Gesloten. |
| [get_AttributeCount](./get_attributecount/)() override | Retourneert het aantal attributen op het huidige knooppunt. |
| [get_BaseURI](./get_baseuri/)() override | Retourneert de basis-URI van het huidige knooppunt. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Retourneert een waarde die aangeeft of de [XmlValidatingReader](./) de binaire inhoud leesmethoden implementeert. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Retourneert een waarde die aangeeft of deze lezer entiteiten kan parseren en oplossen. |
| [get_Depth](./get_depth/)() override | Geeft de diepte van het huidige knooppunt in het XML-document terug. |
| [get_Encoding](./get_encoding/)() | Retourneert het codering‑attribuut voor het document. |
| [get_EntityHandling](./get_entityhandling/)() | Retourneert een waarde die aangeeft hoe de lezer entiteiten verwerkt. |
| [get_EOF](./get_eof/)() override | Geeft een waarde terug die aangeeft of de lezer zich aan het einde van de stroom bevindt. |
| [get_HasValue](./get_hasvalue/)() override | Retourneert een waarde die aangeeft of het huidige knooppunt een [XmlValidatingReader::get_Value](./get_value/) kan hebben die anders is dan [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | Geeft een waarde terug die aangeeft of het huidige knooppunt een attribuut is dat is gegenereerd vanuit de standaardwaarde gedefinieerd in de documenttype-definitie (DTD) of het schema. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Geeft een waarde terug die aangeeft of het huidige knooppunt een leeg element is (bijvoorbeeld **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Retourneert het huidige regelnummer. |
| [get_LinePosition](./get_lineposition/)() override | Retourneert de huidige regelpositie. |
| [get_LocalName](./get_localname/)() override | Retourneert de lokale naam van het huidige knooppunt. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het huidige knooppunt terug. |
| [get_Namespaces](./get_namespaces/)() | Retourneert een waarde die aangeeft of namespace‑ondersteuning moet worden toegepast. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Retourneert de namespace Uniform Resource Identifier (URI) (zoals gedefinieerd in de World Wide [Web](../../system.web/) Consortium (W3C) Namespace-specificatie) van het knooppunt waarop de lezer is gepositioneerd. |
| [get_NameTable](./get_nametable/)() override | Geeft de [XmlNameTable](../xmlnametable/) die aan deze implementatie is gekoppeld terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_Prefix](./get_prefix/)() override | Geeft het namespace-voorvoegsel dat aan het huidige knooppunt is gekoppeld terug. |
| [get_QuoteChar](./get_quotechar/)() override | Retourneert het aanhalingsteken dat wordt gebruikt om de waarde van een attribuutknooppunt te omgeven. |
| [get_Reader](./get_reader/)() | Retourneert de [XmlReader](../xmlreader/) die is gebruikt om deze [XmlValidatingReader](./) te construeren. |
| [get_ReadState](./get_readstate/)() override | Geeft de status van de lezer terug. |
| [get_Schemas](./get_schemas/)() | Retourneert een XmlSchemaCollection om te gebruiken voor validatie. |
| [get_SchemaType](./get_schematype/)() | Retourneert een schema‑type‑object. |
| [get_ValidationType](./get_validationtype/)() | Retourneert een waarde die het type validatie aangeeft dat moet worden uitgevoerd. |
| [get_Value](./get_value/)() override | Geeft de tekstwaarde van het huidige knooppunt terug. |
| [get_XmlLang](./get_xmllang/)() override | Retourneert de huidige **xml:lang**‑scope. |
| [get_XmlSpace](./get_xmlspace/)() override | Geeft het huidige **xml:space**-bereik terug. |
| [GetAttribute](./getattribute/)(String) override | Geeft de waarde van het attribuut met de opgegeven naam terug. |
| [GetAttribute](./getattribute/)(String, String) override | Retourneert de waarde van het attribuut met de opgegeven lokale naam en namespace Uniform Resource Identifier (URI). |
| [GetAttribute](./getattribute/)(int32_t) override | Geeft de waarde van het attribuut met de opgegeven index terug. |
| [HasLineInfo](./haslineinfo/)() override | Retourneert een waarde die aangeeft of de klasse regelinformatie kan retourneren. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Lost een namespace-voorvoegsel op in het bereik van het huidige element. |
| [MoveToAttribute](./movetoattribute/)(String) override | Verplaatst zich naar het attribuut met de opgegeven naam. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Verplaatst zich naar het attribuut met de opgegeven lokale naam en namespace Uniform Resource Identifier (URI). |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Verplaatst zich naar het attribuut met de opgegeven index. |
| [MoveToElement](./movetoelement/)() override | Verplaatst zich naar het element dat het huidige attribuutknooppunt bevat. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Verplaatst zich naar het eerste attribuut. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Verplaatst zich naar het volgende attribuut. |
| [Read](./read/)() override | Leest het volgende knooppunt uit de stroom. |
| [ReadAttributeValue](./readattributevalue/)() override | Parseert de attribuutwaarde naar één of meer **[Text](../../system.text/)**, **EntityReference**, of **EndEntity** knooppunten. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Leest de inhoud en retourneert de Base64-gedecodeerde binaire bytes. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Leest de inhoud en retourneert de BinHex-gedecodeerde binaire bytes. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Leest het element en decodeert de Base64-inhoud. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Leest het element en decodeert de BinHex-inhoud. |
| [ReadString](./readstring/)() override | Leest de inhoud van een element of tekstknooppunt als een string. |
| [ReadTypedValue](./readtypedvalue/)() | Retourneert het runt-ime type voor het opgegeven XML [Schema](../../system.xml.schema/) definitietaal (XSD) type. |
| [ResolveEntity](./resolveentity/)() override | Lost de entiteitsreferentie op voor **EntityReference** knooppunten. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Stelt een waarde in die aangeeft hoe de lezer entiteiten verwerkt. |
| [set_Namespaces](./set_namespaces/)(bool) | Stelt een waarde in die aangeeft of namespace-ondersteuning moet worden uitgevoerd. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Stelt een waarde in die het type validatie aangeeft dat moet worden uitgevoerd. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Stelt de [XmlResolver](../xmlresolver/) in die wordt gebruikt voor het oplossen van externe documenttype-definitie (DTD) en schema-locatiereferenties. De [XmlResolver](../xmlresolver/) wordt ook gebruikt om eventuele import- of include‑elementen die in XML [Schema](../../system.xml.schema/) definitietaal (XSD) schema's worden gevonden, af te handelen. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Voegt een gebeurtenishandler toe voor het ontvangen van informatie over documenttype-definitie (DTD), XML-Data Reduced (XDR) schema, en XML [Schema](../../system.xml.schema/) definitietaal (XSD) schema‑validatiefouten. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Verwijdert een gebeurtenishandler voor het ontvangen van informatie over documenttype-definitie (DTD), XML-Data Reduced (XDR) schema, en XML [Schema](../../system.xml.schema/) definitietaal (XSD) schema‑validatiefouten. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | Initialiseert een nieuw exemplaar van de [XmlValidatingReader](./) klasse die de inhoud valideert die wordt geretourneerd door de opgegeven [XmlReader](../xmlreader/). |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialiseert een nieuw exemplaar van de [XmlValidatingReader](./) klasse met de opgegeven waarden. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialiseert een nieuw exemplaar van de [XmlValidatingReader](./) klasse met de opgegeven waarden. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen


## Deprecated
Deze klasse is verouderd. Het wordt aanbevolen om de XmlReaderSettings‑klasse en de XmlReader::Create‑methode te gebruiken om een validerende XML-lezer te maken.

Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
