---
title: "System::Xml::XmlReader class"
linktitle: "XmlReader"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlReader class. Representerar en läsare som ger snabb, icke‑cachad, framåtriktad åtkomst till XML‑data i C++."
type: docs
weight: 3300
url: /sv/cpp/system.xml/xmlreader/
---
## XmlReader class


Representerar en läsare som ger snabb, icke-cachad, framåtriktad åtkomst till XML-data.

```cpp
class XmlReader : public System::IDisposable
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [Close](./close/)() | När den åsidosätts i en avledd klass ändras [XmlReader::get_ReadState](./get_readstate/) till [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | Skapar en ny [XmlReader](./) instans med angiven URI. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Skapar en ny [XmlReader](./) instans genom att använda den angivna URI:n och inställningarna. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Skapar en ny [XmlReader](./) instans genom att använda den angivna URI:n, inställningarna och kontextinformationen för parsning. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Skapar en ny [XmlReader](./) instans genom att använda den angivna strömmen med standardinställningar. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Skapar en ny [XmlReader](./) instans med den angivna strömmen och inställningarna. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Skapar en ny [XmlReader](./) instans genom att använda den angivna strömmen, bas-URI:n och inställningarna. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Skapar en ny [XmlReader](./) instans genom att använda den angivna strömmen, inställningarna och kontextinformationen för parsning. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Skapar en ny [XmlReader](./) instans genom att använda den angivna textläsaren. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Skapar en ny [XmlReader](./) instans genom att använda den angivna textläsaren och inställningarna. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Skapar en ny [XmlReader](./) instans genom att använda den angivna textläsaren, inställningarna och bas-URI:n. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Skapar en ny [XmlReader](./) instans genom att använda den angivna textläsaren, inställningarna och kontextinformationen för parsning. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Skapar en ny [XmlReader](./) instans genom att använda den angivna XML-läsaren och inställningarna. |
| [Dispose](./dispose/)() override | Frigör alla resurser som används av den aktuella instansen av klassen [XmlReader](./). |
| virtual [get_AttributeCount](./get_attributecount/)() | När den åsidosätts i en avledd klass, hämtar antalet attribut på den aktuella noden. |
| virtual [get_BaseURI](./get_baseuri/)() | När den åsidosätts i en avledd klass, hämtar bas-URI:n för den aktuella noden. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | Returnerar ett värde som indikerar om [XmlReader](./) implementerar metoderna för binär innehållsläsning. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | Returnerar ett värde som indikerar om [XmlReader](./) implementerar metoden [XmlReader::ReadValueChunk](./readvaluechunk/). |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Returnerar ett värde som indikerar om denna läsare kan analysera och lösa upp entiteter. |
| virtual [get_Depth](./get_depth/)() | När den åsidosätts i en avledd klass, hämtar djupet för den aktuella noden i XML-dokumentet. |
| virtual [get_EOF](./get_eof/)() | När den åsidosätts i en avledd klass, hämtar ett värde som indikerar om läsaren är placerad i slutet av strömmen. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Returnerar ett värde som indikerar om den aktuella noden har några attribut. |
| virtual [get_HasValue](./get_hasvalue/)() | När den åsidosätts i en avledd klass, hämtar ett värde som indikerar om den aktuella noden kan ha ett [XmlReader::get_Value](./get_value/)‑värde. |
| virtual [get_IsDefault](./get_isdefault/)() | När den åsidosätts i en avledd klass, hämtar ett värde som indikerar om den aktuella noden är ett attribut som genererades från standardvärdet som definierats i DTD:n eller schemat. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | När den åsidosätts i en avledd klass, hämtar ett värde som indikerar om den aktuella noden är ett tomt element (till exempel **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | När den åsidosätts i en avledd klass, hämtar det lokala namnet på den aktuella noden. |
| virtual [get_Name](./get_name/)() | När den åsidosätts i en avledd klass, hämtar det kvalificerade namnet på den aktuella noden. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | När den åsidosätts i en avledd klass, hämtar namnrymdens URI (som definierat i W3C:s namnrymdsspecifikation) för den nod som läsaren är placerad på. |
| virtual [get_NameTable](./get_nametable/)() | När den åsidosätts i en avledd klass, hämtar den [XmlNameTable](../xmlnametable/) som är associerad med denna implementation. |
| virtual [get_NodeType](./get_nodetype/)() | När den åsidosätts i en avledd klass, hämtar den typen av den aktuella noden. |
| virtual [get_Prefix](./get_prefix/)() | När den åsidosätts i en avledd klass, hämtar den namnrymdspräfixet som är associerat med den aktuella noden. |
| virtual [get_QuoteChar](./get_quotechar/)() | När den åsidosätts i en avledd klass, hämtar den tecknet för citattecken som används för att omge värdet av en attributnod. |
| virtual [get_ReadState](./get_readstate/)() | När den åsidosätts i en avledd klass, hämtar den läsarens tillstånd. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Returnerar schemainformationen som har tilldelats den aktuella noden som ett resultat av schemavalidering. |
| virtual [get_Settings](./get_settings/)() | Returnerar objektet [XmlReaderSettings](../xmlreadersettings/) som används för att skapa denna [XmlReader](./)-instans. |
| virtual [get_Value](./get_value/)() | När den åsidosätts i en avledd klass, hämtar den textvärdet för den aktuella noden. |
| virtual [get_ValueType](./get_valuetype/)() | Returnerar typen för den aktuella noden. |
| virtual [get_XmlLang](./get_xmllang/)() | När den åsidosätts i en avledd klass, hämtar den aktuella **xml:lang**-omfånget. |
| virtual [get_XmlSpace](./get_xmlspace/)() | När den åsidosätts i en avledd klass, hämtar den aktuella **xml:space**-omfånget. |
| virtual [GetAttribute](./getattribute/)(String) | När den åsidosätts i en avledd klass, hämtar den värdet på attributet med det angivna [XmlReader::get_Name](./get_name/)-värdet. |
| virtual [GetAttribute](./getattribute/)(String, String) | När den åsidosätts i en avledd klass, hämtar den värdet på attributet med de angivna [XmlReader::get_LocalName](./get_localname/)- och [XmlReader::get_NamespaceURI](./get_namespaceuri/)-värdena. |
| virtual [GetAttribute](./getattribute/)(int32_t) | När den åsidosätts i en avledd klass, hämtar den värdet på attributet med det angivna indexet. |
| virtual [idx_get](./idx_get/)(int32_t) | När den åsidosätts i en avledd klass, hämtar den värdet på attributet med det angivna indexet. |
| virtual [idx_get](./idx_get/)(String) | När den åsidosätts i en avledd klass, hämtar den värdet på attributet med det angivna [XmlReader::get_Name](./get_name/)-värdet. |
| virtual [idx_get](./idx_get/)(String, String) | När den åsidosätts i en avledd klass, hämtar den värdet på attributet med de angivna [XmlReader::get_LocalName](./get_localname/)- och [XmlReader::get_NamespaceURI](./get_namespaceuri/)-värdena. |
| static [IsName](./isname/)(const String\&) | Returnerar ett värde som indikerar om strängargumentet är ett giltigt XML-namn. |
| static [IsNameToken](./isnametoken/)(const String\&) | Returnerar ett värde som indikerar om strängargumentet är ett giltigt XML-namntoken eller inte. |
| virtual [IsStartElement](./isstartelement/)() | Anropar [XmlReader::MoveToContent](./movetocontent/) och testar om den aktuella innehållsnoden är en starttagg eller en tom elementtagg. |
| virtual [IsStartElement](./isstartelement/)(String) | Anropar [XmlReader::MoveToContent](./movetocontent/) och testar om den aktuella innehållsnoden är en starttagg eller en tom elementtagg samt om [XmlReader::get_Name](./get_name/)-värdet för det funna elementet matchar det givna argumentet. |
| virtual [IsStartElement](./isstartelement/)(String, String) | Anropar [XmlReader::MoveToContent](./movetocontent/) och testar om den aktuella innehållsnoden är en starttagg eller en tom elementtagg samt om [XmlReader::get_LocalName](./get_localname/)- och [XmlReader::get_NamespaceURI](./get_namespaceuri/)-värdena för det funna elementet matchar de angivna strängarna. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | När den åsidosätts i en avledd klass, löser den ett namnrymdspräfix i det aktuella elementets omfång. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | När den åsidosätts i en avledd klass, flyttar den till attributet med det angivna [XmlReader::get_Name](./get_name/)-värdet. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | När den åsidosätts i en avledd klass, flyttar den till attributet med de angivna [XmlReader::get_LocalName](./get_localname/)- och [XmlReader::get_NamespaceURI](./get_namespaceuri/)-värdena. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | När den åsidosätts i en avledd klass, flyttar den till attributet med det angivna indexet. |
| virtual [MoveToContent](./movetocontent/)() | Kontrollerar om den aktuella noden är en innehållsnod (icke‑blankstegstext, **CDATA**, **Element**, **EndElement**, **EntityReference** eller **EndEntity**). Om noden inte är en innehållsnod hoppar läsaren fram till nästa innehållsnod eller filslut. Den hoppar över noder av följande typ: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** eller **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | När den åsidosätts i en avledd klass, flyttar den till elementet som innehåller den aktuella attributnoden. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | När den åsidosätts i en avledd klass, flyttas till det första attributet. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | När den åsidosätts i en avledd klass, flyttas till nästa attribut. |
| virtual [Read](./read/)() | När den åsidosätts i en avledd klass, läser nästa nod från strömmen. |
| virtual [ReadAttributeValue](./readattributevalue/)() | När den åsidosätts i en avledd klass, parsar attributvärdet till en eller flera **[Text](../../system.text/)**, **EntityReference** eller **EndEntity**-noder. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Läser innehållet som ett objekt av den angivna typen. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Läser innehållet och returnerar de Base64-dekodade binära byten. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Läser innehållet och returnerar de **BinHex**‑avkodade binära bytena. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Läser textinnehållet på den aktuella positionen som en [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Läser textinnehållet på den aktuella positionen som ett [DateTime](../../system/datetime/)-objekt. |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Läser textinnehållet på den aktuella positionen som ett [DateTimeOffset](../../system/datetimeoffset/)-objekt. |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Läser textinnehållet på den aktuella positionen som ett [Decimal](../../system/decimal/)-objekt. |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Läser textinnehållet på den aktuella positionen som ett dubbelprecision flyttal. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Läser textinnehållet på den aktuella positionen som ett enkelprecision flyttal. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Läser textinnehållet på den aktuella positionen som ett 32‑bitars signerat heltal. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Läser textinnehållet på den aktuella positionen som ett 64‑bitars signerat heltal. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Läser textinnehållet på den aktuella positionen som ett [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | Läser textinnehållet på den aktuella positionen som ett [String](../../system/string/)-objekt. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Läser elementets innehåll som den begärda typen. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Kontrollerar att det angivna lokala namnet och namnrymds‑URI:et matchar den aktuella elementet, och läser sedan elementets innehåll som den begärda typen. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Läser elementet och avkodar **Base64**‑innehållet. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Läser elementet och avkodar **BinHex**‑innehållet. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Läser det aktuella elementet och returnerar innehållet som ett [Boolean](../../system/boolean/)-objekt. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Kontrollerar att det angivna lokala namnet och namnrymds‑URI:et matchar det aktuella elementet, och läser sedan det aktuella elementet och returnerar innehållet som ett [Boolean](../../system/boolean/)-objekt. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Läser det aktuella elementet och returnerar innehållet som ett [DateTime](../../system/datetime/)-objekt. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Kontrollerar att det angivna lokala namnet och namnrymds‑URI:et matchar det aktuella elementet, och läser sedan det aktuella elementet och returnerar innehållet som ett [DateTime](../../system/datetime/)-objekt. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Läser det aktuella elementet och returnerar innehållet som ett [Decimal](../../system/decimal/)-objekt. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Kontrollerar att det angivna lokala namnet och namnrymds‑URI:et matchar det aktuella elementet, och läser sedan det aktuella elementet och returnerar innehållet som ett [Decimal](../../system/decimal/)-objekt. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Läser det aktuella elementet och returnerar innehållet som ett dubbelprecision flyttal. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Kontrollerar att det angivna lokala namnet och namnrymds-URI:n matchar den för det aktuella elementet, läser sedan det aktuella elementet och returnerar innehållet som ett dubbelprecision flyttal. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Läser det aktuella elementet och returnerar innehållet som ett enkelprecision flyttal. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Kontrollerar att det angivna lokala namnet och namnrymds-URI:n matchar den för det aktuella elementet, läser sedan det aktuella elementet och returnerar innehållet som ett enkelprecision flyttal. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Läser det aktuella elementet och returnerar innehållet som ett 32‑bitars signerat heltal. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Kontrollerar att det angivna lokala namnet och namnrymds-URI:n matchar den för det aktuella elementet, läser sedan det aktuella elementet och returnerar innehållet som ett 32‑bitars signerat heltal. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Läser det aktuella elementet och returnerar innehållet som ett 64‑bitars signerat heltal. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Kontrollerar att det angivna lokala namnet och namnrymds-URI:n matchar den för det aktuella elementet, läser sedan det aktuella elementet och returnerar innehållet som ett 64‑bitars signerat heltal. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Läser det aktuella elementet och returnerar innehållet som ett [Object](../../system/object/). |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Kontrollerar att det angivna lokala namnet och namnrymds-URI:n matchar den för det aktuella elementet, läser sedan det aktuella elementet och returnerar innehållet som ett [Object](../../system/object/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Läser det aktuella elementet och returnerar innehållet som ett [String](../../system/string/)‑objekt. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Kontrollerar att det angivna lokala namnet och namnrymds-URI:n matchar den för det aktuella elementet, läser sedan det aktuella elementet och returnerar innehållet som ett [String](../../system/string/)‑objekt. |
| virtual [ReadElementString](./readelementstring/)() | Läser ett enbart text‑element. Det rekommenderas dock att använda metoden [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) istället, eftersom den ger ett mer direkt sätt att hantera denna operation. |
| virtual [ReadElementString](./readelementstring/)(String) | Kontrollerar att värdet [XmlReader::get_Name](./get_name/) för det hittade elementet matchar den angivna strängen innan ett enbart text‑element läses. Det rekommenderas dock att använda metoden [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) istället, eftersom den ger ett mer direkt sätt att hantera denna operation. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Kontrollerar att värdena [XmlReader::get_LocalName](./get_localname/) och [XmlReader::get_NamespaceURI](./get_namespaceuri/) för det hittade elementet matchar de angivna strängarna innan ett enbart text‑element läses. Det rekommenderas dock att använda metoden [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) istället, eftersom den ger ett mer direkt sätt att hantera denna operation. |
| virtual [ReadEndElement](./readendelement/)() | Kontrollerar att den aktuella innehållsnoden är en sluttagg och flyttar läsaren till nästa nod. |
| virtual [ReadInnerXml](./readinnerxml/)() | När den åsidosätts i en avledd klass läses allt innehåll, inklusive markup, som en sträng. |
| virtual [ReadOuterXml](./readouterxml/)() | När den åsidosätts i en avledd klass läses innehållet, inklusive markup, som representerar denna nod och alla dess barn. |
| virtual [ReadStartElement](./readstartelement/)() | Kontrollerar att den aktuella noden är ett element och flyttar läsaren till nästa nod. |
| virtual [ReadStartElement](./readstartelement/)(String) | Kontrollerar att den aktuella innehållsnoden är ett element med det angivna värdet [XmlReader::get_Name](./get_name/) och flyttar läsaren till nästa nod. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Kontrollerar att den aktuella innehållsnoden är ett element med de angivna värdena [XmlReader::get_LocalName](./get_localname/) och [XmlReader::get_NamespaceURI](./get_namespaceuri/) och flyttar läsaren till nästa nod. |
| virtual [ReadString](./readstring/)() | När den åsidosätts i en avledd klass läses innehållet i ett element eller en textnod som en sträng. Det rekommenderas dock att använda metoden [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) istället, eftersom den ger ett mer direkt sätt att hantera denna operation. |
| virtual [ReadSubtree](./readsubtree/)() | Returnerar en ny [XmlReader](./)-instans som kan användas för att läsa den aktuella noden och alla dess undernoder. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | Flyttar [XmlReader](./) till nästa underordnade element med det angivna kvalificerade namnet. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | Flyttar [XmlReader](./) till nästa underordnade element med det angivna lokala namnet och namnrymds‑URI:n. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Läser tills ett element med det angivna kvalificerade namnet hittas. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Läser tills ett element med det angivna lokala namnet och namnrymds‑URI hittas. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | Flyttar fram [XmlReader](./) till nästa syskon‑element med det angivna kvalificerade namnet. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | Flyttar fram [XmlReader](./) till nästa syskon‑element med det angivna lokala namnet och namnrymds‑URI. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Läser stora textströmmar som är inbäddade i ett XML‑dokument. |
| virtual [ResolveEntity](./resolveentity/)() | När den åsidosätts i en avledd klass, löser upp enhetsreferensen för **EntityReference**‑noder. |
| virtual [Skip](./skip/)() | Hoppar över barnen till den aktuella noden. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [Ptr](./ptr/) | Ett alias för delad pekare till en instans av denna klass. |
## Se även

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
