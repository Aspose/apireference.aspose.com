---
title: "System::Xml::XmlReader Klasse"
linktitle: "XmlReader"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader Klasse. Stellt einen Leser dar, der schnellen, nicht zwischengespeicherten, vorwärts‑nur Zugriff auf XML‑Daten in C++ bietet."
type: docs
weight: 3300
url: /de/cpp/system.xml/xmlreader/
---
## XmlReader class


Stellt einen Reader dar, der schnellen, nicht zwischengespeicherten, nur vorwärts gerichteten Zugriff auf XML-Daten bietet.

```cpp
class XmlReader : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Close](./close/)() | Wenn in einer abgeleiteten Klasse überschrieben, ändert es den [XmlReader::get_ReadState](./get_readstate/) zu [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | Erstellt eine neue [XmlReader](./) Instanz mit angegebener URI. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung der angegebenen URI und Einstellungen. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung der angegebenen URI, Einstellungen und Kontextinformationen für das Parsen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung des angegebenen Streams mit Standardeinstellungen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Erstellt eine neue [XmlReader](./) Instanz mit dem angegebenen Stream und den Einstellungen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung des angegebenen Streams, der Basis‑URI und der Einstellungen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung des angegebenen Streams, der Einstellungen und Kontextinformationen für das Parsen. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung des angegebenen Text‑Readers. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung des angegebenen Text‑Readers und der Einstellungen. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung des angegebenen Text‑Readers, der Einstellungen und der Basis‑URI. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung des angegebenen Text‑Readers, der Einstellungen und Kontextinformationen für das Parsen. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Erstellt eine neue [XmlReader](./) Instanz unter Verwendung des angegebenen XML‑Readers und der Einstellungen. |
| [Dispose](./dispose/)() override | Gibt alle von der aktuellen Instanz der [XmlReader](./) Klasse verwendeten Ressourcen frei. |
| virtual [get_AttributeCount](./get_attributecount/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt sie die Anzahl der Attribute des aktuellen Knotens zurück. |
| virtual [get_BaseURI](./get_baseuri/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt die Basis‑URI des aktuellen Knotens zurück. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | Gibt einen Wert zurück, der angibt, ob der [XmlReader](./) die Methoden zum Lesen binärer Inhalte implementiert. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | Gibt einen Wert zurück, der angibt, ob der [XmlReader](./) die Methode [XmlReader::ReadValueChunk](./readvaluechunk/) implementiert. |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Gibt einen Wert zurück, der angibt, ob dieser Reader Entitäten analysieren und auflösen kann. |
| virtual [get_Depth](./get_depth/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt die Tiefe des aktuellen Knotens im XML‑Dokument zurück. |
| virtual [get_EOF](./get_eof/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt einen Wert zurück, der angibt, ob der Reader am Ende des Streams positioniert ist. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten Attribute hat. |
| virtual [get_HasValue](./get_hasvalue/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt einen Wert zurück, der angibt, ob der aktuelle Knoten einen [XmlReader::get_Value](./get_value/)‑Wert besitzen kann. |
| virtual [get_IsDefault](./get_isdefault/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein Attribut ist, das aus dem in der DTD oder dem Schema definierten Standardwert generiert wurde. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein leeres Element ist (zum Beispiel **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den lokalen Namen des aktuellen Knotens zurück. |
| virtual [get_Name](./get_name/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den qualifizierten Namen des aktuellen Knotens zurück. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt die Namespace‑URI (wie in der W3C‑Namespace‑Spezifikation definiert) des Knotens zurück, auf dem der Reader positioniert ist. |
| virtual [get_NameTable](./get_nametable/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt die mit dieser Implementierung verbundene [XmlNameTable](../xmlnametable/) zurück. |
| virtual [get_NodeType](./get_nodetype/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Typ des aktuellen Knotens zurück. |
| virtual [get_Prefix](./get_prefix/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt das Namespace‑Präfix zurück, das dem aktuellen Knoten zugeordnet ist. |
| virtual [get_QuoteChar](./get_quotechar/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt das Anführungszeichen‑Zeichen zurück, das verwendet wird, um den Wert eines Attributknotens zu umschließen. |
| virtual [get_ReadState](./get_readstate/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Zustand des Readers zurück. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Gibt die Schemainformation zurück, die dem aktuellen Knoten infolge einer Schema‑Validierung zugewiesen wurde. |
| virtual [get_Settings](./get_settings/)() | Gibt das [XmlReaderSettings](../xmlreadersettings/)-Objekt zurück, das zur Erstellung dieser [XmlReader](./)-Instanz verwendet wurde. |
| virtual [get_Value](./get_value/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Textwert des aktuellen Knotens zurück. |
| virtual [get_ValueType](./get_valuetype/)() | Gibt den Typ für den aktuellen Knoten zurück. |
| virtual [get_XmlLang](./get_xmllang/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den aktuellen **xml:lang**‑Geltungsbereich zurück. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den aktuellen **xml:space**‑Geltungsbereich zurück. |
| virtual [GetAttribute](./getattribute/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit dem angegebenen [XmlReader::get_Name](./get_name/)-Wert zurück. |
| virtual [GetAttribute](./getattribute/)(String, String) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit den angegebenen [XmlReader::get_LocalName](./get_localname/)- und [XmlReader::get_NamespaceURI](./get_namespaceuri/)-Werten zurück. |
| virtual [GetAttribute](./getattribute/)(int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit dem angegebenen Index zurück. |
| virtual [idx_get](./idx_get/)(int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit dem angegebenen Index zurück. |
| virtual [idx_get](./idx_get/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit dem angegebenen [XmlReader::get_Name](./get_name/)-Wert zurück. |
| virtual [idx_get](./idx_get/)(String, String) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit den angegebenen [XmlReader::get_LocalName](./get_localname/)- und [XmlReader::get_NamespaceURI](./get_namespaceuri/)-Werten zurück. |
| static [IsName](./isname/)(const String\&) | Gibt einen Wert zurück, der angibt, ob das Zeichenkettenargument ein gültiger XML-Name ist. |
| static [IsNameToken](./isnametoken/)(const String\&) | Gibt einen Wert zurück, der angibt, ob das Zeichenkettenargument ein gültiges XML-Name‑Token ist. |
| virtual [IsStartElement](./isstartelement/)() | Ruft [XmlReader::MoveToContent](./movetocontent/) auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag ist. |
| virtual [IsStartElement](./isstartelement/)(String) | Ruft [XmlReader::MoveToContent](./movetocontent/) auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag ist und ob der [XmlReader::get_Name](./get_name/)-Wert des gefundenen Elements dem angegebenen Argument entspricht. |
| virtual [IsStartElement](./isstartelement/)(String, String) | Ruft [XmlReader::MoveToContent](./movetocontent/) auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag ist und ob die Werte von [XmlReader::get_LocalName](./get_localname/) und [XmlReader::get_NamespaceURI](./get_namespaceuri/) des gefundenen Elements den angegebenen Zeichenketten entsprechen. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Wird in einer abgeleiteten Klasse überschrieben, löst es ein Namensraum‑Präfix im Geltungsbereich des aktuellen Elements auf. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | Wird in einer abgeleiteten Klasse überschrieben, wechselt es zum Attribut mit dem angegebenen [XmlReader::get_Name](./get_name/)-Wert. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Wird in einer abgeleiteten Klasse überschrieben, wechselt es zum Attribut mit den angegebenen [XmlReader::get_LocalName](./get_localname/)- und [XmlReader::get_NamespaceURI](./get_namespaceuri/)-Werten. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | Wird in einer abgeleiteten Klasse überschrieben, wechselt es zum Attribut mit dem angegebenen Index. |
| virtual [MoveToContent](./movetocontent/)() | Prüft, ob der aktuelle Knoten ein Inhaltsknoten (nicht‑Leerzeichen‑Text, **CDATA**, **Element**, **EndElement**, **EntityReference** oder **EndEntity**) ist. Wenn der Knoten kein Inhaltsknoten ist, springt der Leser zum nächsten Inhaltsknoten oder zum Dateiende. Er überspringt Knoten der folgenden Typen: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** oder **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | Wird in einer abgeleiteten Klasse überschrieben, wechselt es zum Element, das den aktuellen Attributknoten enthält. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Wird in einer abgeleiteten Klasse überschrieben, wechselt es zum ersten Attribut. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Wird in einer abgeleiteten Klasse überschrieben, wechselt es zum nächsten Attribut. |
| virtual [Read](./read/)() | Wird in einer abgeleiteten Klasse überschrieben, liest es den nächsten Knoten aus dem Stream. |
| virtual [ReadAttributeValue](./readattributevalue/)() | Wird in einer abgeleiteten Klasse überschrieben, analysiert es den Attributwert in einen oder mehrere **[Text](../../system.text/)**-, **EntityReference**- oder **EndEntity**‑Knoten. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Liest den Inhalt als ein Objekt des angegebenen Typs. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Liest den Inhalt und gibt die Base64-dekodierten Binärbytes zurück. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Liest den Inhalt und gibt die **BinHex** dekodierten Binärbytes zurück. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Liest den Textinhalt an der aktuellen Position als [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Liest den Textinhalt an der aktuellen Position als [DateTime](../../system/datetime/)-Objekt. |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Liest den Textinhalt an der aktuellen Position als [DateTimeOffset](../../system/datetimeoffset/)-Objekt. |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Liest den Textinhalt an der aktuellen Position als [Decimal](../../system/decimal/)-Objekt. |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Liest den Textinhalt an der aktuellen Position als double‑präzise Gleitkommazahl. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Liest den Textinhalt an der aktuellen Position als single‑präzise Gleitkommazahl. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Liest den Textinhalt an der aktuellen Position als 32‑Bit‑vorzeichenbehaftete Ganzzahl. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Liest den Textinhalt an der aktuellen Position als 64‑Bit‑vorzeichenbehaftete Ganzzahl. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Liest den Textinhalt an der aktuellen Position als [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | Liest den Textinhalt an der aktuellen Position als ein [String](../../system/string/) Objekt. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Liest den Elementinhalt als den angeforderten Typ. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend den Elementinhalt als den angeforderten Typ. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Liest das Element und dekodiert den **Base64**-Inhalt. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Liest das Element und dekodiert den **BinHex** Inhalt. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Liest das aktuelle Element und gibt den Inhalt als ein [Boolean](../../system/boolean/) Objekt zurück. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend das aktuelle Element, um den Inhalt als ein [Boolean](../../system/boolean/) Objekt zurückzugeben. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Liest das aktuelle Element und gibt den Inhalt als ein [DateTime](../../system/datetime/) Objekt zurück. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend das aktuelle Element, um den Inhalt als ein [DateTime](../../system/datetime/) Objekt zurückzugeben. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Liest das aktuelle Element und gibt den Inhalt als ein [Decimal](../../system/decimal/) Objekt zurück. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend das aktuelle Element, um den Inhalt als ein [Decimal](../../system/decimal/) Objekt zurückzugeben. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Liest das aktuelle Element und gibt den Inhalt als eine double-präzise Gleitkommazahl zurück. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend das aktuelle Element, um den Inhalt als eine double-präzise Gleitkommazahl zurückzugeben. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Liest das aktuelle Element und gibt den Inhalt als eine single-präzise Gleitkommazahl zurück. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend das aktuelle Element, um den Inhalt als eine single-präzise Gleitkommazahl zurückzugeben. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Liest das aktuelle Element und gibt den Inhalt als eine 32-Bit vorzeichenbehaftete Ganzzahl zurück. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend das aktuelle Element, um den Inhalt als eine 32-Bit vorzeichenbehaftete Ganzzahl zurückzugeben. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Liest das aktuelle Element und gibt den Inhalt als eine 64-Bit vorzeichenbehaftete Ganzzahl zurück. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend das aktuelle Element, um den Inhalt als eine 64-Bit vorzeichenbehaftete Ganzzahl zurückzugeben. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Liest das aktuelle Element und gibt den Inhalt als ein [Object](../../system/object/) zurück. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend das aktuelle Element, um den Inhalt als ein [Object](../../system/object/) zurückzugeben. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Liest das aktuelle Element und gibt den Inhalt als ein [String](../../system/string/) Objekt zurück. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, und liest anschließend das aktuelle Element, um den Inhalt als ein [String](../../system/string/) Objekt zurückzugeben. |
| virtual [ReadElementString](./readelementstring/)() | Liest ein reines Textelement. Es wird jedoch empfohlen, stattdessen die Methode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) zu verwenden, da sie eine einfachere Möglichkeit bietet, diesen Vorgang zu handhaben. |
| virtual [ReadElementString](./readelementstring/)(String) | Überprüft, ob der Wert [XmlReader::get_Name](./get_name/) des gefundenen Elements mit dem angegebenen String übereinstimmt, bevor ein reines Textelement gelesen wird. Es wird jedoch empfohlen, stattdessen die Methode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) zu verwenden, da sie eine einfachere Möglichkeit bietet, diesen Vorgang zu handhaben. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Überprüft, ob die Werte [XmlReader::get_LocalName](./get_localname/) und [XmlReader::get_NamespaceURI](./get_namespaceuri/) des gefundenen Elements mit den angegebenen Strings übereinstimmen, bevor ein reines Textelement gelesen wird. Es wird jedoch empfohlen, stattdessen die Methode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) zu verwenden, da sie eine einfachere Möglichkeit bietet, diesen Vorgang zu handhaben. |
| virtual [ReadEndElement](./readendelement/)() | Überprüft, ob der aktuelle Inhaltsknoten ein End-Tag ist und bewegt den Reader zum nächsten Knoten. |
| virtual [ReadInnerXml](./readinnerxml/)() | Wenn in einer abgeleiteten Klasse überschrieben, liest es den gesamten Inhalt, einschließlich Markup, als Zeichenkette. |
| virtual [ReadOuterXml](./readouterxml/)() | Wenn in einer abgeleiteten Klasse überschrieben, liest es den Inhalt, einschließlich Markup, der diesen Knoten und alle seine Kinder darstellt. |
| virtual [ReadStartElement](./readstartelement/)() | Überprüft, ob der aktuelle Knoten ein Element ist und bewegt den Reader zum nächsten Knoten. |
| virtual [ReadStartElement](./readstartelement/)(String) | Überprüft, ob der aktuelle Inhaltsknoten ein Element mit dem angegebenen [XmlReader::get_Name](./get_name/)‑Wert ist und bewegt den Reader zum nächsten Knoten. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Überprüft, ob der aktuelle Inhaltsknoten ein Element mit den angegebenen [XmlReader::get_LocalName](./get_localname/)‑ und [XmlReader::get_NamespaceURI](./get_namespaceuri/)‑Werten ist und bewegt den Reader zum nächsten Knoten. |
| virtual [ReadString](./readstring/)() | Wenn in einer abgeleiteten Klasse überschrieben, liest es den Inhalt eines Elements oder Textknotens als Zeichenkette. Es wird jedoch empfohlen, stattdessen die Methode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) zu verwenden, da sie eine einfachere Handhabung dieser Operation bietet. |
| virtual [ReadSubtree](./readsubtree/)() | Gibt eine neue [XmlReader](./)-Instanz zurück, die zum Lesen des aktuellen Knotens und aller seiner Nachkommen verwendet werden kann. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | Bewegt den [XmlReader](./) zum nächsten abgeleiteten Element mit dem angegebenen qualifizierten Namen. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | Bewegt den [XmlReader](./) zum nächsten abgeleiteten Element mit dem angegebenen lokalen Namen und Namespace‑URI. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Liest, bis ein Element mit dem angegebenen qualifizierten Namen gefunden wird. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Liest, bis ein Element mit dem angegebenen lokalen Namen und Namespace‑URI gefunden wird. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | Bewegt den [XmlReader](./) zum nächsten Geschwisterelement mit dem angegebenen qualifizierten Namen. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | Bewegt den [XmlReader](./) zum nächsten Geschwisterelement mit dem angegebenen lokalen Namen und Namespace‑URI. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Liest große Textströme, die in ein XML‑Dokument eingebettet sind. |
| virtual [ResolveEntity](./resolveentity/)() | Wenn in einer abgeleiteten Klasse überschrieben, löst es die Entity‑Referenz für **EntityReference**‑Knoten auf. |
| virtual [Skip](./skip/)() | Überspringt die Kindknoten des aktuellen Knotens. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
