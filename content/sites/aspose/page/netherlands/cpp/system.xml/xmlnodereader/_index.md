---
title: "System::Xml::XmlNodeReader class"
linktitle: "XmlNodeReader"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNodeReader class. Vertegenwoordigt een lezer die snelle, niet-gebufferde, alleen-voorwaartse toegang tot XML-gegevens in een XmlNode biedt in C++."
type: docs
weight: 2800
url: /nl/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


Vertegenwoordigt een lezer die snelle, niet-gebufferde, alleen-voorwaartse toegang tot XML-gegevens in een [XmlNode](../xmlnode/) biedt.

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Close](./close/)() override | Wijzigt de [XmlNodeReader::get_ReadState](./get_readstate/) naar [ReadState::Closed](../readstate/). |
| [get_AttributeCount](./get_attributecount/)() override | Retourneert het aantal attributen op het huidige knooppunt. |
| [get_BaseURI](./get_baseuri/)() override | Retourneert de basis-URI van het huidige knooppunt. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Retourneert een waarde die aangeeft of de [XmlNodeReader](./) de methoden voor het lezen van binaire inhoud implementeert. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Retourneert een waarde die aangeeft of deze lezer entiteiten kan parseren en oplossen. |
| [get_Depth](./get_depth/)() override | Geeft de diepte van het huidige knooppunt in het XML-document terug. |
| [get_EOF](./get_eof/)() override | Geeft een waarde terug die aangeeft of de lezer zich aan het einde van de stroom bevindt. |
| [get_HasAttributes](./get_hasattributes/)() override | Geeft een waarde terug die aangeeft of het huidige knooppunt attributen heeft. |
| [get_HasValue](./get_hasvalue/)() override | Geeft een waarde terug die aangeeft of het huidige knooppunt een [XmlNodeReader::get_Value](./get_value/) waarde kan hebben. |
| [get_IsDefault](./get_isdefault/)() override | Geeft een waarde terug die aangeeft of het huidige knooppunt een attribuut is dat is gegenereerd vanuit de standaardwaarde gedefinieerd in de documenttype-definitie (DTD) of het schema. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Geeft een waarde terug die aangeeft of het huidige knooppunt een leeg element is (bijvoorbeeld **<MyElement/>**). |
| [get_LocalName](./get_localname/)() override | Retourneert de lokale naam van het huidige knooppunt. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het huidige knooppunt terug. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Geeft de namespace-URI (zoals gedefinieerd in de W3C Namespace-specificatie) van het knooppunt waarop de lezer zich bevindt terug. |
| [get_NameTable](./get_nametable/)() override | Geeft de [XmlNameTable](../xmlnametable/) die aan deze implementatie is gekoppeld terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_Prefix](./get_prefix/)() override | Geeft het namespace-voorvoegsel dat aan het huidige knooppunt is gekoppeld terug. |
| [get_ReadState](./get_readstate/)() override | Geeft de status van de lezer terug. |
| [get_SchemaInfo](./get_schemainfo/)() override | Geeft de schema-informatie terug die aan het huidige knooppunt is toegewezen. |
| [get_Value](./get_value/)() override | Geeft de tekstwaarde van het huidige knooppunt terug. |
| [get_XmlLang](./get_xmllang/)() override | Retourneert de huidige **xml:lang**‑scope. |
| [get_XmlSpace](./get_xmlspace/)() override | Geeft het huidige **xml:space**-bereik terug. |
| [GetAttribute](./getattribute/)(String) override | Geeft de waarde van het attribuut met de opgegeven naam terug. |
| [GetAttribute](./getattribute/)(String, String) override | Geeft de waarde van het attribuut met de opgegeven lokale naam en namespace-URI terug. |
| [GetAttribute](./getattribute/)(int32_t) override | Geeft de waarde van het attribuut met de opgegeven index terug. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Lost een namespace-voorvoegsel op in het bereik van het huidige element. |
| [MoveToAttribute](./movetoattribute/)(String) override | Verplaatst zich naar het attribuut met de opgegeven naam. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Verplaatst zich naar het attribuut met de opgegeven lokale naam en namespace-URI. |
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
| [ResolveEntity](./resolveentity/)() override | Lost de entiteitsreferentie op voor **EntityReference** knooppunten. |
| [Skip](./skip/)() override | Slaat de kinderen van het huidige knooppunt over. |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | Maakt een instantie van de [XmlNodeReader](./) klasse aan met de opgegeven [XmlNode](../xmlnode/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
