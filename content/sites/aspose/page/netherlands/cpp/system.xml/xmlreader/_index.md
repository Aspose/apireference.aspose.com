---
title: "System::Xml::XmlReader class"
linktitle: "XmlReader"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader class. Vertegenwoordigt een lezer die snelle, niet‑gecachede, alleen‑voorwaartse toegang tot XML-gegevens biedt in C++."
type: docs
weight: 3300
url: /nl/cpp/system.xml/xmlreader/
---
## XmlReader class


Stelt een lezer voor die snelle, niet‑gecachede, alleen‑voorwaartse toegang tot XML-gegevens biedt.

```cpp
class XmlReader : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Close](./close/)() | Wanneer overschreven in een afgeleide klasse, wijzigt het de [XmlReader::get_ReadState](./get_readstate/) naar [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | Maakt een nieuw [XmlReader](./) exemplaar met opgegeven URI. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Maakt een nieuw [XmlReader](./) exemplaar door de opgegeven URI en instellingen te gebruiken. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Maakt een nieuw [XmlReader](./) exemplaar door de opgegeven URI, instellingen en contextinformatie voor het parseren te gebruiken. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Maakt een nieuw [XmlReader](./) exemplaar met behulp van de opgegeven stream met standaardinstellingen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Maakt een nieuw [XmlReader](./) exemplaar met de opgegeven stream en instellingen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Maakt een nieuw [XmlReader](./) exemplaar met behulp van de opgegeven stream, basis-URI en instellingen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Maakt een nieuw [XmlReader](./) exemplaar met behulp van de opgegeven stream, instellingen en contextinformatie voor het parseren. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Maakt een nieuw [XmlReader](./) exemplaar door de opgegeven tekstreder te gebruiken. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Maakt een nieuw [XmlReader](./) exemplaar door de opgegeven tekstreder en instellingen te gebruiken. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Maakt een nieuw [XmlReader](./) exemplaar door de opgegeven tekstreder, instellingen en basis-URI te gebruiken. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Maakt een nieuw [XmlReader](./) exemplaar door de opgegeven tekstreder, instellingen en contextinformatie voor het parseren te gebruiken. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Maakt een nieuw [XmlReader](./) exemplaar door de opgegeven XML-lezer en instellingen te gebruiken. |
| [Dispose](./dispose/)() override | Geeft alle bronnen vrij die door de huidige instantie van de [XmlReader](./) klasse worden gebruikt. |
| virtual [get_AttributeCount](./get_attributecount/)() | Wanneer overschreven in een afgeleide klasse, krijgt het aantal attributen van het huidige knooppunt. |
| virtual [get_BaseURI](./get_baseuri/)() | Wanneer overschreven in een afgeleide klasse, krijgt het basis-URI van het huidige knooppunt. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | Retourneert een waarde die aangeeft of de [XmlReader](./) de binaire inhoud leesmethoden implementeert. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | Retourneert een waarde die aangeeft of de [XmlReader](./) de [XmlReader::ReadValueChunk](./readvaluechunk/) methode implementeert. |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Retourneert een waarde die aangeeft of deze lezer entiteiten kan parseren en oplossen. |
| virtual [get_Depth](./get_depth/)() | Wanneer overschreven in een afgeleide klasse, krijgt de diepte van het huidige knooppunt in het XML-document. |
| virtual [get_EOF](./get_eof/)() | Wanneer overschreven in een afgeleide klasse, krijgt een waarde die aangeeft of de lezer zich aan het einde van de stream bevindt. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Geeft een waarde terug die aangeeft of het huidige knooppunt attributen heeft. |
| virtual [get_HasValue](./get_hasvalue/)() | Wanneer overschreven in een afgeleide klasse, krijgt een waarde die aangeeft of het huidige knooppunt een [XmlReader::get_Value](./get_value/) waarde kan hebben. |
| virtual [get_IsDefault](./get_isdefault/)() | Wanneer overschreven in een afgeleide klasse, krijgt een waarde die aangeeft of het huidige knooppunt een attribuut is dat is gegenereerd uit de standaardwaarde gedefinieerd in de DTD of het schema. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Wanneer overschreven in een afgeleide klasse, krijgt een waarde die aangeeft of het huidige knooppunt een leeg element is (bijvoorbeeld **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | Wanneer overschreven in een afgeleide klasse, krijgt de lokale naam van het huidige knooppunt. |
| virtual [get_Name](./get_name/)() | Wanneer overschreven in een afgeleide klasse, krijgt de gekwalificeerde naam van het huidige knooppunt. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Wanneer overschreven in een afgeleide klasse, krijgt de namespace-URI (zoals gedefinieerd in de W3C Namespace-specificatie) van het knooppunt waarop de lezer is gepositioneerd. |
| virtual [get_NameTable](./get_nametable/)() | Wanneer overschreven in een afgeleide klasse, haalt de [XmlNameTable](../xmlnametable/) op die bij deze implementatie hoort. |
| virtual [get_NodeType](./get_nodetype/)() | Wanneer overschreven in een afgeleide klasse, haalt het type van het huidige knooppunt op. |
| virtual [get_Prefix](./get_prefix/)() | Wanneer overschreven in een afgeleide klasse, haalt het namespace‑voorvoegsel op dat bij het huidige knooppunt hoort. |
| virtual [get_QuoteChar](./get_quotechar/)() | Wanneer overschreven in een afgeleide klasse, haalt het aanhalingsteken op dat wordt gebruikt om de waarde van een attribuutknooppunt te omsluiten. |
| virtual [get_ReadState](./get_readstate/)() | Wanneer overschreven in een afgeleide klasse, haalt de status van de lezer op. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Retourneert de schemainformatie die aan het huidige knooppunt is toegewezen als resultaat van schemavalidatie. |
| virtual [get_Settings](./get_settings/)() | Retourneert het [XmlReaderSettings](../xmlreadersettings/) object dat wordt gebruikt om deze [XmlReader](./) instantie te maken. |
| virtual [get_Value](./get_value/)() | Wanneer overschreven in een afgeleide klasse, haalt de tekstwaarde van het huidige knooppunt op. |
| virtual [get_ValueType](./get_valuetype/)() | Retourneert het type voor het huidige knooppunt. |
| virtual [get_XmlLang](./get_xmllang/)() | Wanneer overschreven in een afgeleide klasse, haalt de huidige **xml:lang**‑scope op. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Wanneer overschreven in een afgeleide klasse, haalt de huidige **xml:space**‑scope op. |
| virtual [GetAttribute](./getattribute/)(String) | Wanneer overschreven in een afgeleide klasse, haalt de waarde van het attribuut op met de opgegeven [XmlReader::get_Name](./get_name/) waarde. |
| virtual [GetAttribute](./getattribute/)(String, String) | Wanneer overschreven in een afgeleide klasse, haalt de waarde van het attribuut op met de opgegeven [XmlReader::get_LocalName](./get_localname/) en [XmlReader::get_NamespaceURI](./get_namespaceuri/) waarden. |
| virtual [GetAttribute](./getattribute/)(int32_t) | Wanneer overschreven in een afgeleide klasse, haalt de waarde van het attribuut op met de opgegeven index. |
| virtual [idx_get](./idx_get/)(int32_t) | Wanneer overschreven in een afgeleide klasse, haalt de waarde van het attribuut op met de opgegeven index. |
| virtual [idx_get](./idx_get/)(String) | Wanneer overschreven in een afgeleide klasse, haalt de waarde van het attribuut op met de opgegeven [XmlReader::get_Name](./get_name/) waarde. |
| virtual [idx_get](./idx_get/)(String, String) | Wanneer overschreven in een afgeleide klasse, haalt de waarde van het attribuut op met de opgegeven [XmlReader::get_LocalName](./get_localname/) en [XmlReader::get_NamespaceURI](./get_namespaceuri/) waarden. |
| static [IsName](./isname/)(const String\&) | Retourneert een waarde die aangeeft of het tekenreeksargument een geldige XML‑naam is. |
| static [IsNameToken](./isnametoken/)(const String\&) | Retourneert een waarde die aangeeft of het tekenreeksargument al dan niet een geldig XML‑naam‑token is. |
| virtual [IsStartElement](./isstartelement/)() | Roept [XmlReader::MoveToContent](./movetocontent/) aan en test of het huidige inhoudsknooppunt een start‑tag of een lege element‑tag is. |
| virtual [IsStartElement](./isstartelement/)(String) | Roept [XmlReader::MoveToContent](./movetocontent/) aan en test of het huidige inhoudsknooppunt een start‑tag of een lege element‑tag is en of de [XmlReader::get_Name](./get_name/) waarde van het gevonden element overeenkomt met het opgegeven argument. |
| virtual [IsStartElement](./isstartelement/)(String, String) | Roept [XmlReader::MoveToContent](./movetocontent/) aan en test of het huidige inhoudsknooppunt een start‑tag of een lege element‑tag is en of de [XmlReader::get_LocalName](./get_localname/) en [XmlReader::get_NamespaceURI](./get_namespaceuri/) waarden van het gevonden element overeenkomen met de opgegeven tekenreeksen. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Wanneer overschreven in een afgeleide klasse, lost een namespace‑voorvoegsel op in de scope van het huidige element. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | Wanneer overschreven in een afgeleide klasse, verplaatst zich naar het attribuut met de opgegeven [XmlReader::get_Name](./get_name/) waarde. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Wanneer overschreven in een afgeleide klasse, verplaatst zich naar het attribuut met de opgegeven [XmlReader::get_LocalName](./get_localname/) en [XmlReader::get_NamespaceURI](./get_namespaceuri/) waarden. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | Wanneer overschreven in een afgeleide klasse, verplaatst zich naar het attribuut met de opgegeven index. |
| virtual [MoveToContent](./movetocontent/)() | Controleert of het huidige knooppunt een content‑knooppunt is (tekst die geen witruimte is, **CDATA**, **Element**, **EndElement**, **EntityReference**, of **EndEntity**). Als het knooppunt geen content‑knooppunt is, springt de lezer vooruit naar het volgende content‑knooppunt of het einde van het bestand. Het slaat knooppunten van de volgende types over: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, of **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | Wanneer overschreven in een afgeleide klasse, verplaatst zich naar het element dat het huidige attribuutknooppunt bevat. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Wanneer overschreven in een afgeleide klasse, gaat naar het eerste attribuut. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Wanneer overschreven in een afgeleide klasse, gaat naar het volgende attribuut. |
| virtual [Read](./read/)() | Wanneer overschreven in een afgeleide klasse, leest het volgende knooppunt uit de stroom. |
| virtual [ReadAttributeValue](./readattributevalue/)() | Wanneer overschreven in een afgeleide klasse, parst de attribuutwaarde naar één of meer **[Text](../../system.text/)**, **EntityReference**, of **EndEntity** knooppunten. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Leest de inhoud als een object van het opgegeven type. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Leest de inhoud en retourneert de Base64-gedecodeerde binaire bytes. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Leest de inhoud en retourneert de **BinHex** gedecodeerde binaire bytes. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Leest de tekstinhoud op de huidige positie als een [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Leest de tekstinhoud op de huidige positie als een [DateTime](../../system/datetime/) object. |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Leest de tekstinhoud op de huidige positie als een [DateTimeOffset](../../system/datetimeoffset/) object. |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Leest de tekstinhoud op de huidige positie als een [Decimal](../../system/decimal/) object. |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Leest de tekstinhoud op de huidige positie als een dubbelprecisie floating-point getal. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Leest de tekstinhoud op de huidige positie als een enkelprecisie floating-point getal. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Leest de tekstinhoud op de huidige positie als een 32-bit ondertekend geheel getal. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Leest de tekstinhoud op de huidige positie als een 64-bit ondertekend geheel getal. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Leest de tekstinhoud op de huidige positie als een [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | Leest de tekstinhoud op de huidige positie als een [String](../../system/string/) object. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Leest de elementinhoud als het gevraagde type. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, en leest vervolgens de elementinhoud als het gevraagde type. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Leest het element en decodeert de **Base64** inhoud. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Leest het element en decodeert de **BinHex** inhoud. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Leest het huidige element en retourneert de inhoud als een [Boolean](../../system/boolean/) object. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, en leest vervolgens het huidige element en retourneert de inhoud als een [Boolean](../../system/boolean/) object. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Leest het huidige element en retourneert de inhoud als een [DateTime](../../system/datetime/) object. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, en leest vervolgens het huidige element en retourneert de inhoud als een [DateTime](../../system/datetime/) object. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Leest het huidige element en retourneert de inhoud als een [Decimal](../../system/decimal/) object. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, en leest vervolgens het huidige element en retourneert de inhoud als een [Decimal](../../system/decimal/) object. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Leest het huidige element en retourneert de inhoud als een dubbelprecisie floating-point getal. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, leest vervolgens het huidige element en retourneert de inhoud als een dubbele-precisie zwevend-kommagetal. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Leest het huidige element en retourneert de inhoud als een enkele-precisie zwevend-kommagetal. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, leest vervolgens het huidige element en retourneert de inhoud als een enkele-precisie zwevend-kommagetal. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Leest het huidige element en retourneert de inhoud als een 32-bits ondertekend geheel getal. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, leest vervolgens het huidige element en retourneert de inhoud als een 32-bits ondertekend geheel getal. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Leest het huidige element en retourneert de inhoud als een 64-bits ondertekend geheel getal. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, leest vervolgens het huidige element en retourneert de inhoud als een 64-bits ondertekend geheel getal. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Leest het huidige element en retourneert de inhoud als een [Object](../../system/object/). |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, leest vervolgens het huidige element en retourneert de inhoud als een [Object](../../system/object/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Leest het huidige element en retourneert de inhoud als een [String](../../system/string/) object. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Controleert of de opgegeven lokale naam en namespace-URI overeenkomen met die van het huidige element, leest vervolgens het huidige element en retourneert de inhoud als een [String](../../system/string/) object. |
| virtual [ReadElementString](./readelementstring/)() | Leest een uitsluitend-tekst element. Het wordt echter aanbevolen om in plaats daarvan de [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) methode te gebruiken, omdat deze een eenvoudigere manier biedt om deze bewerking af te handelen. |
| virtual [ReadElementString](./readelementstring/)(String) | Controleert of de [XmlReader::get_Name](./get_name/) waarde van het gevonden element overeenkomt met de opgegeven tekenreeks voordat een uitsluitend-tekst element wordt gelezen. Het wordt echter aanbevolen om in plaats daarvan de [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) methode te gebruiken, omdat deze een eenvoudigere manier biedt om deze bewerking af te handelen. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Controleert of de [XmlReader::get_LocalName](./get_localname/) en [XmlReader::get_NamespaceURI](./get_namespaceuri/) waarden van het gevonden element overeenkomen met de opgegeven tekenreeksen voordat een uitsluitend-tekst element wordt gelezen. Het wordt echter aanbevolen om in plaats daarvan de [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) methode te gebruiken, omdat deze een eenvoudigere manier biedt om deze bewerking af te handelen. |
| virtual [ReadEndElement](./readendelement/)() | Controleert of het huidige inhoudsknooppunt een eind‑tag is en verplaatst de lezer naar het volgende knooppunt. |
| virtual [ReadInnerXml](./readinnerxml/)() | Wanneer overschreven in een afgeleide klasse, leest het alle inhoud, inclusief markup, als een tekenreeks. |
| virtual [ReadOuterXml](./readouterxml/)() | Wanneer overschreven in een afgeleide klasse, leest het de inhoud, inclusief markup, die dit knooppunt en al zijn kinderen vertegenwoordigt. |
| virtual [ReadStartElement](./readstartelement/)() | Controleert of het huidige knooppunt een element is en verplaatst de lezer naar het volgende knooppunt. |
| virtual [ReadStartElement](./readstartelement/)(String) | Controleert of het huidige inhoudsknooppunt een element is met de opgegeven [XmlReader::get_Name](./get_name/) waarde en verplaatst de lezer naar het volgende knooppunt. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Controleert of het huidige inhoudsknooppunt een element is met de opgegeven [XmlReader::get_LocalName](./get_localname/) en [XmlReader::get_NamespaceURI](./get_namespaceuri/) waarden en verplaatst de lezer naar het volgende knooppunt. |
| virtual [ReadString](./readstring/)() | Wanneer overschreven in een afgeleide klasse, leest het de inhoud van een element of tekstknooppunt als een tekenreeks. Het wordt echter aanbevolen om in plaats daarvan de [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) methode te gebruiken, omdat deze een eenvoudigere manier biedt om deze bewerking af te handelen. |
| virtual [ReadSubtree](./readsubtree/)() | Retourneert een nieuwe [XmlReader](./) instantie die kan worden gebruikt om het huidige knooppunt en al zijn afstammelingen te lezen. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | Verplaatst de [XmlReader](./) naar het volgende afstammings-element met de opgegeven gekwalificeerde naam. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | Verplaatst de [XmlReader](./) naar het volgende afstammings-element met de opgegeven lokale naam en namespace-URI. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Leest tot een element met de opgegeven gekwalificeerde naam wordt gevonden. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Leest tot een element met de opgegeven lokale naam en namespace-URI wordt gevonden. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | Verplaatst de [XmlReader](./) naar het volgende broerelement met de opgegeven gekwalificeerde naam. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | Verplaatst de [XmlReader](./) naar het volgende broerelement met de opgegeven lokale naam en namespace-URI. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Leest grote tekststromen die in een XML-document zijn ingebed. |
| virtual [ResolveEntity](./resolveentity/)() | Wanneer overschreven in een afgeleide klasse, lost het de entiteitsreferentie op voor **EntityReference**-knooppunten. |
| virtual [Skip](./skip/)() | Slaat de kinderen van het huidige knooppunt over. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
