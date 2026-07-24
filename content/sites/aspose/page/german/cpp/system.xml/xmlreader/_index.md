---
title: "System::Xml::XmlReader class"
linktitle: "XmlReader"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlReader class. Stellt einen Reader dar, der schnellen, nicht zwischengespeicherten, nur vorwärts gerichteten Zugriff auf XML‑Daten in C++ bietet."
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
| static [Create](./create/)(const String\&) | Erstellt eine neue [XmlReader](./)-Instanz mit der angegebenen URI. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | Erstellt eine neue [XmlReader](./)-Instanz unter Verwendung der angegebenen URI und Einstellungen. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Erstellt eine neue [XmlReader](./)-Instanz unter Verwendung der angegebenen URI, Einstellungen und Kontextinformationen zum Parsen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Erstellt eine neue [XmlReader](./)-Instanz mit dem angegebenen Stream und den Standardeinstellungen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Erstellt eine neue [XmlReader](./)-Instanz mit dem angegebenen Stream und den Einstellungen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Erstellt eine neue [XmlReader](./)-Instanz mit dem angegebenen Stream, der Basis-URI und den Einstellungen. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Erstellt eine neue [XmlReader](./)-Instanz mit dem angegebenen Stream, den Einstellungen und Kontextinformationen zum Parsen. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | Erstellt eine neue [XmlReader](./)-Instanz unter Verwendung des angegebenen Textreaders. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | Erstellt eine neue [XmlReader](./)-Instanz unter Verwendung des angegebenen Textreaders und der Einstellungen. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | Erstellt eine neue [XmlReader](./)-Instanz unter Verwendung des angegebenen Textreaders, der Einstellungen und der Basis-URI. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | Erstellt eine neue [XmlReader](./)-Instanz unter Verwendung des angegebenen Textreaders, der Einstellungen und Kontextinformationen zum Parsen. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | Erstellt eine neue [XmlReader](./)-Instanz unter Verwendung des angegebenen XML-Readers und der Einstellungen. |
| [Dispose](./dispose/)() override | Gibt alle von der aktuellen Instanz der [XmlReader](./)-Klasse verwendeten Ressourcen frei. |
| virtual [get_AttributeCount](./get_attributecount/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt die Anzahl der Attribute des aktuellen Knotens zurück. |
| virtual [get_BaseURI](./get_baseuri/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt die Basis-URI des aktuellen Knotens zurück. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | Gibt einen Wert zurück, der angibt, ob die [XmlReader](./) die Methoden zum Lesen binärer Inhalte implementiert. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | Gibt einen Wert zurück, der angibt, ob die [XmlReader](./) die Methode [XmlReader::ReadValueChunk](./readvaluechunk/) implementiert. |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | Gibt einen Wert zurück, der angibt, ob dieser Leser Entitäten analysieren und auflösen kann. |
| virtual [get_Depth](./get_depth/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt die Tiefe des aktuellen Knotens im XML-Dokument zurück. |
| virtual [get_EOF](./get_eof/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt einen Wert zurück, der angibt, ob der Reader am Ende des Streams positioniert ist. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten Attribute hat. |
| virtual [get_HasValue](./get_hasvalue/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt einen Wert zurück, der angibt, ob der aktuelle Knoten einen [XmlReader::get_Value](./get_value/)-Wert haben kann. |
| virtual [get_IsDefault](./get_isdefault/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein Attribut ist, das aus dem in der DTD oder dem Schema definierten Standardwert erzeugt wurde. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein leeres Element ist (zum Beispiel **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den lokalen Namen des aktuellen Knotens zurück. |
| virtual [get_Name](./get_name/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt den qualifizierten Namen des aktuellen Knotens zurück. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Wird in einer abgeleiteten Klasse überschrieben, gibt die Namespace-URI (wie in der W3C-Namespace-Spezifikation definiert) des Knotens zurück, auf dem der Reader positioniert ist. |
| virtual [get_NameTable](./get_nametable/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt die mit dieser Implementierung verbundene [XmlNameTable](../xmlnametable/) zurück. |
| virtual [get_NodeType](./get_nodetype/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Typ des aktuellen Knotens zurück. |
| virtual [get_Prefix](./get_prefix/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt das mit dem aktuellen Knoten verbundene Namespace-Präfix zurück. |
| virtual [get_QuoteChar](./get_quotechar/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt das Anführungszeichen‑Zeichen zurück, das zum Einschließen des Werts eines Attributknotens verwendet wird. |
| virtual [get_ReadState](./get_readstate/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Zustand des Readers zurück. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Gibt die Schemainformation zurück, die dem aktuellen Knoten als Ergebnis der Schema‑Validierung zugewiesen wurde. |
| virtual [get_Settings](./get_settings/)() | Gibt das [XmlReaderSettings](../xmlreadersettings/)‑Objekt zurück, das verwendet wurde, um diese [XmlReader](./)-Instanz zu erstellen. |
| virtual [get_Value](./get_value/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Textwert des aktuellen Knotens zurück. |
| virtual [get_ValueType](./get_valuetype/)() | Gibt den Typ des aktuellen Knotens zurück. |
| virtual [get_XmlLang](./get_xmllang/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den aktuellen **xml:lang**‑Bereich zurück. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den aktuellen **xml:space**‑Bereich zurück. |
| virtual [GetAttribute](./getattribute/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit dem angegebenen [XmlReader::get_Name](./get_name/)-Wert zurück. |
| virtual [GetAttribute](./getattribute/)(String, String) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit den angegebenen [XmlReader::get_LocalName](./get_localname/)- und [XmlReader::get_NamespaceURI](./get_namespaceuri/)-Werten zurück. |
| virtual [GetAttribute](./getattribute/)(int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit dem angegebenen Index zurück. |
| virtual [idx_get](./idx_get/)(int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit dem angegebenen Index zurück. |
| virtual [idx_get](./idx_get/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit dem angegebenen [XmlReader::get_Name](./get_name/)-Wert zurück. |
| virtual [idx_get](./idx_get/)(String, String) | Wenn in einer abgeleiteten Klasse überschrieben, gibt den Wert des Attributs mit den angegebenen [XmlReader::get_LocalName](./get_localname/)- und [XmlReader::get_NamespaceURI](./get_namespaceuri/)-Werten zurück. |
| static [IsName](./isname/)(const String\&) | Gibt einen Wert zurück, der angibt, ob das Zeichenkettenargument ein gültiger XML‑Name ist. |
| static [IsNameToken](./isnametoken/)(const String\&) | Gibt einen Wert zurück, der angibt, ob das Zeichenkettenargument ein gültiges XML‑Namens‑Token ist. |
| virtual [IsStartElement](./isstartelement/)() | Ruft [XmlReader::MoveToContent](./movetocontent/) auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag ist. |
| virtual [IsStartElement](./isstartelement/)(String) | Ruft [XmlReader::MoveToContent](./movetocontent/) auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag ist und ob der [XmlReader::get_Name](./get_name/)-Wert des gefundenen Elements dem angegebenen Argument entspricht. |
| virtual [IsStartElement](./isstartelement/)(String, String) | Ruft [XmlReader::MoveToContent](./movetocontent/) auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag ist und ob die [XmlReader::get_LocalName](./get_localname/)- und [XmlReader::get_NamespaceURI](./get_namespaceuri/)-Werte des gefundenen Elements den angegebenen Zeichenketten entsprechen. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | Wenn in einer abgeleiteten Klasse überschrieben, löst ein Namespace‑Präfix im Geltungsbereich des aktuellen Elements auf. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | Wenn in einer abgeleiteten Klasse überschrieben, wechselt zum Attribut mit dem angegebenen [XmlReader::get_Name](./get_name/)-Wert. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Wenn in einer abgeleiteten Klasse überschrieben, wechselt zum Attribut mit den angegebenen [XmlReader::get_LocalName](./get_localname/)- und [XmlReader::get_NamespaceURI](./get_namespaceuri/)-Werten. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | Wenn in einer abgeleiteten Klasse überschrieben, wechselt zum Attribut mit dem angegebenen Index. |
| virtual [MoveToContent](./movetocontent/)() | Prüft, ob der aktuelle Knoten ein Inhaltsknoten (nicht‑Leerzeichen‑Text, **CDATA**, **Element**, **EndElement**, **EntityReference** oder **EndEntity**) ist. Ist der Knoten kein Inhaltsknoten, springt der Reader zum nächsten Inhaltsknoten oder zum Dateiende. Er überspringt Knoten der folgenden Typen: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace** oder **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | Wenn in einer abgeleiteten Klasse überschrieben, wechselt zum Element, das den aktuellen Attributknoten enthält. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Wenn in einer abgeleiteten Klasse überschrieben, springt zum ersten Attribut. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Wenn in einer abgeleiteten Klasse überschrieben, springt zum nächsten Attribut. |
| virtual [Read](./read/)() | Wenn in einer abgeleiteten Klasse überschrieben, liest den nächsten Knoten aus dem Stream. |
| virtual [ReadAttributeValue](./readattributevalue/)() | Wenn in einer abgeleiteten Klasse überschrieben, analysiert den Attributwert in einen oder mehrere **[Text](../../system.text/)**, **EntityReference** oder **EndEntity**-Knoten. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Liest den Inhalt als ein Objekt des angegebenen Typs. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Liest den Inhalt und gibt die Base64-dekodierten Binärbytes zurück. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Liest den Inhalt und gibt die **BinHex**-dekodierten Binärbytes zurück. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | Liest den Textinhalt an der aktuellen Position als ein [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | Liest den Textinhalt an der aktuellen Position als ein [DateTime](../../system/datetime/)-Objekt. |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | Liest den Textinhalt an der aktuellen Position als ein [DateTimeOffset](../../system/datetimeoffset/)-Objekt. |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | Liest den Textinhalt an der aktuellen Position als ein [Decimal](../../system/decimal/)-Objekt. |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | Liest den Textinhalt an der aktuellen Position als eine Gleitkommazahl mit doppelter Genauigkeit. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | Liest den Textinhalt an der aktuellen Position als eine Gleitkommazahl mit einfacher Genauigkeit. |
| virtual [ReadContentAsInt](./readcontentasint/)() | Liest den Textinhalt an der aktuellen Position als eine 32‑Bit vorzeichenbehaftete Ganzzahl. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | Liest den Textinhalt an der aktuellen Position als eine 64‑Bit vorzeichenbehaftete Ganzzahl. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | Liest den Textinhalt an der aktuellen Position als ein [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | Liest den Textinhalt an der aktuellen Position als ein [String](../../system/string/)-Objekt. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | Liest den Elementinhalt als den angeforderten Typ. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | Überprüft, ob der angegebene lokale Name und die Namespace‑URI mit denen des aktuellen Elements übereinstimmen, und liest dann den Elementinhalt als den angeforderten Typ. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Liest das Element und dekodiert den **Base64**‑Inhalt. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Liest das Element und dekodiert den **BinHex**-Inhalt. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | Liest das aktuelle Element und gibt den Inhalt als ein [Boolean](../../system/boolean/)-Objekt zurück. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace‑URI mit denen des aktuellen Elements übereinstimmen, und liest dann das aktuelle Element und gibt den Inhalt als ein [Boolean](../../system/boolean/)-Objekt zurück. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | Liest das aktuelle Element und gibt den Inhalt als ein [DateTime](../../system/datetime/)-Objekt zurück. |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace‑URI mit denen des aktuellen Elements übereinstimmen, und liest dann das aktuelle Element und gibt den Inhalt als ein [DateTime](../../system/datetime/)-Objekt zurück. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | Liest das aktuelle Element und gibt den Inhalt als ein [Decimal](../../system/decimal/)-Objekt zurück. |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace‑URI mit denen des aktuellen Elements übereinstimmen, und liest dann das aktuelle Element und gibt den Inhalt als ein [Decimal](../../system/decimal/)-Objekt zurück. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | Liest das aktuelle Element und gibt den Inhalt als eine Gleitkommazahl mit doppelter Genauigkeit zurück. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, liest dann das aktuelle Element und gibt den Inhalt als double‑Präzisions‑Gleitkommazahl zurück. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | Liest das aktuelle Element und gibt den Inhalt als single‑Präzisions‑Gleitkommazahl zurück. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, liest dann das aktuelle Element und gibt den Inhalt als single‑Präzisions‑Gleitkommazahl zurück. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | Liest das aktuelle Element und gibt den Inhalt als 32‑Bit‑vorzeichenbehaftete Ganzzahl zurück. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, liest dann das aktuelle Element und gibt den Inhalt als 32‑Bit‑vorzeichenbehaftete Ganzzahl zurück. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | Liest das aktuelle Element und gibt den Inhalt als 64‑Bit‑vorzeichenbehaftete Ganzzahl zurück. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, liest dann das aktuelle Element und gibt den Inhalt als 64‑Bit‑vorzeichenbehaftete Ganzzahl zurück. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | Liest das aktuelle Element und gibt den Inhalt als ein [Object](../../system/object/) zurück. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, liest dann das aktuelle Element und gibt den Inhalt als ein [Object](../../system/object/) zurück. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | Liest das aktuelle Element und gibt den Inhalt als ein [String](../../system/string/)-Objekt zurück. |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | Überprüft, ob der angegebene lokale Name und die Namespace-URI mit denen des aktuellen Elements übereinstimmen, liest dann das aktuelle Element und gibt den Inhalt als ein [String](../../system/string/)-Objekt zurück. |
| virtual [ReadElementString](./readelementstring/)() | Liest ein reines Textelement. Es wird jedoch empfohlen, stattdessen die Methode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) zu verwenden, da sie eine einfachere Möglichkeit bietet, diesen Vorgang zu handhaben. |
| virtual [ReadElementString](./readelementstring/)(String) | Überprüft, ob der Wert [XmlReader::get_Name](./get_name/) des gefundenen Elements mit dem angegebenen String übereinstimmt, bevor ein reines Textelement gelesen wird. Es wird jedoch empfohlen, stattdessen die Methode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) zu verwenden, da sie eine einfachere Möglichkeit bietet, diesen Vorgang zu handhaben. |
| virtual [ReadElementString](./readelementstring/)(String, String) | Überprüft, ob die Werte [XmlReader::get_LocalName](./get_localname/) und [XmlReader::get_NamespaceURI](./get_namespaceuri/) des gefundenen Elements mit den angegebenen Strings übereinstimmen, bevor ein reines Textelement gelesen wird. Es wird jedoch empfohlen, stattdessen die Methode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) zu verwenden, da sie eine einfachere Möglichkeit bietet, diesen Vorgang zu handhaben. |
| virtual [ReadEndElement](./readendelement/)() | Überprüft, ob der aktuelle Inhaltsknoten ein End-Tag ist, und bewegt den Reader zum nächsten Knoten weiter. |
| virtual [ReadInnerXml](./readinnerxml/)() | Wird in einer abgeleiteten Klasse überschrieben, liest es den gesamten Inhalt, einschließlich Markup, als Zeichenkette. |
| virtual [ReadOuterXml](./readouterxml/)() | Wird in einer abgeleiteten Klasse überschrieben, liest es den Inhalt, einschließlich Markup, der diesen Knoten und alle seine Kinder darstellt. |
| virtual [ReadStartElement](./readstartelement/)() | Überprüft, ob der aktuelle Knoten ein Element ist, und bewegt den Reader zum nächsten Knoten weiter. |
| virtual [ReadStartElement](./readstartelement/)(String) | Überprüft, ob der aktuelle Inhaltsknoten ein Element mit dem angegebenen [XmlReader::get_Name](./get_name/)-Wert ist, und bewegt den Reader zum nächsten Knoten weiter. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | Überprüft, ob der aktuelle Inhaltsknoten ein Element mit den angegebenen [XmlReader::get_LocalName](./get_localname/)- und [XmlReader::get_NamespaceURI](./get_namespaceuri/)-Werten ist, und bewegt den Reader zum nächsten Knoten weiter. |
| virtual [ReadString](./readstring/)() | Wird in einer abgeleiteten Klasse überschrieben, liest es den Inhalt eines Elements oder Textknotens als Zeichenkette. Es wird jedoch empfohlen, stattdessen die Methode [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) zu verwenden, da sie eine einfachere Möglichkeit bietet, diesen Vorgang zu handhaben. |
| virtual [ReadSubtree](./readsubtree/)() | Gibt eine neue [XmlReader](./)-Instanz zurück, die zum Lesen des aktuellen Knotens und aller seiner Nachkommen verwendet werden kann. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | Bewegt den [XmlReader](./) zum nächsten Nachkommen-Element mit dem angegebenen qualifizierten Namen weiter. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | Bewegt den [XmlReader](./) zum nächsten Nachkommen-Element mit dem angegebenen lokalen Namen und der Namespace-URI weiter. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | Liest, bis ein Element mit dem angegebenen qualifizierten Namen gefunden wird. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | Liest, bis ein Element mit dem angegebenen lokalen Namen und Namespace-URI gefunden wird. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | Verschiebt den [XmlReader](./) zum nächsten Geschwisterelement mit dem angegebenen qualifizierten Namen. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | Verschiebt den [XmlReader](./) zum nächsten Geschwisterelement mit dem angegebenen lokalen Namen und Namespace-URI. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Liest große Textströme, die in einem XML-Dokument eingebettet sind. |
| virtual [ResolveEntity](./resolveentity/)() | Wird in einer abgeleiteten Klasse überschrieben, löst die Entity-Referenz für **EntityReference**-Knoten auf. |
| virtual [Skip](./skip/)() | Überspringt die Kindknoten des aktuellen Knotens. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared-Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
