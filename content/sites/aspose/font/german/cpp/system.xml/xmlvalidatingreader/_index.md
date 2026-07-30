---
title: "System::Xml::XmlValidatingReader‑Klasse"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlValidatingReader‑Klasse. Stellt einen Reader bereit, der in C++ die Validierung von Document Type Definition (DTD), XML-Data Reduced (XDR)-Schema und XML Schema Definition Language (XSD) ermöglicht."
type: docs
weight: 4200
url: /de/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


Stellt einen Reader bereit, der die Validierung von Document Type Definition (DTD), XML-Data Reduced (XDR)-Schema und XML [Schema](../../system.xml.schema/)-Definitionssprache (XSD) ermöglicht.

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Ändert den [XmlReader::get_ReadState](../xmlreader/get_readstate/) zu Closed. |
| [get_AttributeCount](./get_attributecount/)() override | Gibt die Anzahl der Attribute des aktuellen Knotens zurück. |
| [get_BaseURI](./get_baseuri/)() override | Gibt die Basis-URI des aktuellen Knotens zurück. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Gibt einen Wert zurück, der angibt, ob der [XmlValidatingReader](./) die Methoden zum Lesen binärer Inhalte implementiert. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Gibt einen Wert zurück, der angibt, ob dieser Reader Entitäten analysieren und auflösen kann. |
| [get_Depth](./get_depth/)() override | Gibt die Tiefe des aktuellen Knotens im XML-Dokument zurück. |
| [get_Encoding](./get_encoding/)() | Gibt das Encoding-Attribut für das Dokument zurück. |
| [get_EntityHandling](./get_entityhandling/)() | Gibt einen Wert zurück, der angibt, wie der Leser Entitäten verarbeitet. |
| [get_EOF](./get_eof/)() override | Gibt einen Wert zurück, der angibt, ob der Reader am Ende des Streams positioniert ist. |
| [get_HasValue](./get_hasvalue/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten einen [XmlValidatingReader::get_Value](./get_value/) haben kann, der nicht [String::Empty](../../system/string/empty/) ist. |
| [get_IsDefault](./get_isdefault/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein Attribut ist, das aus dem in der Dokumenttypdefinition (DTD) oder im Schema definierten Standardwert erzeugt wurde. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein leeres Element ist (zum Beispiel **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Gibt die aktuelle Zeilennummer zurück. |
| [get_LinePosition](./get_lineposition/)() override | Gibt die aktuelle Zeilenposition zurück. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des aktuellen Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des aktuellen Knotens zurück. |
| [get_Namespaces](./get_namespaces/)() | Gibt einen Wert zurück, der angibt, ob Namespace-Unterstützung verwendet werden soll. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Gibt den Namespace Uniform Resource Identifier (URI) (wie in der World Wide [Web](../../system.web/) Consortium (W3C) Namespace-Spezifikation definiert) des Knotens zurück, auf dem sich der Reader befindet. |
| [get_NameTable](./get_nametable/)() override | Gibt die mit dieser Implementierung verknüpfte [XmlNameTable](../xmlnametable/) zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_Prefix](./get_prefix/)() override | Gibt das Namespace-Präfix zurück, das dem aktuellen Knoten zugeordnet ist. |
| [get_QuoteChar](./get_quotechar/)() override | Gibt das Anführungszeichen‑Zeichen zurück, das zum Einschließen des Werts eines Attributknotens verwendet wird. |
| [get_Reader](./get_reader/)() | Gibt den [XmlReader](../xmlreader/) zurück, der zum Erzeugen dieses [XmlValidatingReader](./) verwendet wurde. |
| [get_ReadState](./get_readstate/)() override | Gibt den Zustand des Readers zurück. |
| [get_Schemas](./get_schemas/)() | Gibt eine XmlSchemaCollection zurück, die für die Validierung verwendet werden kann. |
| [get_SchemaType](./get_schematype/)() | Gibt ein Schema-Typ-Objekt zurück. |
| [get_ValidationType](./get_validationtype/)() | Gibt einen Wert zurück, der den Typ der durchzuführenden Validierung angibt. |
| [get_Value](./get_value/)() override | Gibt den Textwert des aktuellen Knotens zurück. |
| [get_XmlLang](./get_xmllang/)() override | Gibt den aktuellen **xml:lang**-Bereich zurück. |
| [get_XmlSpace](./get_xmlspace/)() override | Gibt den aktuellen **xml:space**-Geltungsbereich zurück. |
| [GetAttribute](./getattribute/)(String) override | Gibt den Wert des Attributs mit dem angegebenen Namen zurück. |
| [GetAttribute](./getattribute/)(String, String) override | Gibt den Wert des Attributs mit dem angegebenen lokalen Namen und dem Namespace Uniform Resource Identifier (URI) zurück. |
| [GetAttribute](./getattribute/)(int32_t) override | Gibt den Wert des Attributs mit dem angegebenen Index zurück. |
| [HasLineInfo](./haslineinfo/)() override | Gibt einen Wert zurück, der angibt, ob die Klasse Zeileninformationen zurückgeben kann. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Löst ein Namespace-Präfix im Geltungsbereich des aktuellen Elements auf. |
| [MoveToAttribute](./movetoattribute/)(String) override | Wechselt zum Attribut mit dem angegebenen Namen. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Wechselt zum Attribut mit dem angegebenen lokalen Namen und dem Namespace Uniform Resource Identifier (URI). |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Wechselt zum Attribut mit dem angegebenen Index. |
| [MoveToElement](./movetoelement/)() override | Wechselt zum Element, das den aktuellen Attributknoten enthält. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Wechselt zum ersten Attribut. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Wechselt zum nächsten Attribut. |
| [Read](./read/)() override | Liest den nächsten Knoten aus dem Stream. |
| [ReadAttributeValue](./readattributevalue/)() override | Parst den Attributwert in einen oder mehrere **[Text](../../system.text/)**, **EntityReference** oder **EndEntity**-Knoten. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Liest den Inhalt und gibt die Base64-dekodierten Binärbytes zurück. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Liest den Inhalt und gibt die BinHex-dekodierten Binärbytes zurück. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Liest das Element und dekodiert den Base64-Inhalt. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Liest das Element und dekodiert den BinHex-Inhalt. |
| [ReadString](./readstring/)() override | Liest den Inhalt eines Elements oder Textknotens als Zeichenkette. |
| [ReadTypedValue](./readtypedvalue/)() | Gibt den Laufzeittyp für den angegebenen XML [Schema](../../system.xml.schema/) Definition Language (XSD)-Typ zurück. |
| [ResolveEntity](./resolveentity/)() override | Löst die Entity-Referenz für **EntityReference**-Knoten auf. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Setzt einen Wert, der festlegt, wie der Reader Entitäten verarbeitet. |
| [set_Namespaces](./set_namespaces/)(bool) | Legt einen Wert fest, der angibt, ob Namespace-Unterstützung verwendet werden soll. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Setzt einen Wert, der den Typ der durchzuführenden Validierung angibt. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Setzt den [XmlResolver](../xmlresolver/), der zum Auflösen externer Document Type Definition (DTD)- und Schema-Standortreferenzen verwendet wird. Der [XmlResolver](../xmlresolver/) wird außerdem verwendet, um importierte oder inkludierte Elemente in XML [Schema](../../system.xml.schema/) Definition Language (XSD)-Schemata zu verarbeiten. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Fügt einen Ereignishandler hinzu, um Informationen über Document Type Definition (DTD), XML-Data Reduced (XDR)-Schema und XML [Schema](../../system.xml.schema/) Definition Language (XSD)-Schema-Validierungsfehler zu erhalten. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Entfernt einen Ereignishandler, der Informationen über Document Type Definition (DTD), XML-Data Reduced (XDR)-Schema und XML [Schema](../../system.xml.schema/) Definition Language (XSD)-Schema-Validierungsfehler bereitstellt. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | Initialisiert eine neue Instanz der Klasse [XmlValidatingReader](./), die den von dem angegebenen [XmlReader](../xmlreader/) zurückgegebenen Inhalt validiert. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialisiert eine neue Instanz der Klasse [XmlValidatingReader](./) mit den angegebenen Werten. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialisiert eine neue Instanz der Klasse [XmlValidatingReader](./) mit den angegebenen Werten. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise


## Deprecated
Diese Klasse ist veraltet. Es wird empfohlen, die Klasse XmlReaderSettings und die Methode XmlReader::Create zu verwenden, um einen validierenden XML-Reader zu erstellen.

Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
