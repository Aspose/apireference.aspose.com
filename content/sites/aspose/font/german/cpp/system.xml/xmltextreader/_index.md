---
title: "System::Xml::XmlTextReader‑Klasse"
linktitle: "XmlTextReader"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlTextReader‑Klasse. Stellt einen Leser dar, der schnellen, nicht zwischengespeicherten, vorwärts‑nur‑Zugriff auf XML‑Daten in C++ bietet."
type: docs
weight: 3900
url: /de/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


Stellt einen Reader dar, der schnellen, nicht zwischengespeicherten, nur vorwärts gerichteten Zugriff auf XML-Daten bietet.

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Ändert den Zustand von [XmlReader::get_ReadState](../xmlreader/get_readstate/) zu **Closed**. |
| [get_AttributeCount](./get_attributecount/)() override | Gibt die Anzahl der Attribute des aktuellen Knotens zurück. |
| [get_BaseURI](./get_baseuri/)() override | Gibt die Basis-URI des aktuellen Knotens zurück. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Gibt einen Wert zurück, der angibt, ob der [XmlTextReader](./) die Methoden zum Lesen binärer Inhalte implementiert. |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | Gibt einen Wert zurück, der angibt, ob der [XmlTextReader](./) die Methode [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/) implementiert. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Gibt einen Wert zurück, der angibt, ob dieser Reader Entitäten analysieren und auflösen kann. |
| [get_Depth](./get_depth/)() override | Gibt die Tiefe des aktuellen Knotens im XML-Dokument zurück. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Gibt die Aufzählung [DtdProcessing](../dtdprocessing/) zurück. |
| [get_Encoding](./get_encoding/)() | Gibt die Kodierung des Dokuments zurück. |
| [get_EntityHandling](./get_entityhandling/)() | Gibt einen Wert zurück, der angibt, wie der Leser Entitäten verarbeitet. |
| [get_EOF](./get_eof/)() override | Gibt einen Wert zurück, der angibt, ob der Reader am Ende des Streams positioniert ist. |
| [get_HasValue](./get_hasvalue/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten einen [XmlTextReader::get_Value](./get_value/) haben kann, der nicht [String::Empty](../../system/string/empty/) ist. |
| [get_IsDefault](./get_isdefault/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein Attribut ist, das aus dem im DTD oder Schema definierten Standardwert generiert wurde. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein leeres Element ist (zum Beispiel **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | Gibt die aktuelle Zeilennummer zurück. |
| [get_LinePosition](./get_lineposition/)() override | Gibt die aktuelle Zeilenposition zurück. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des aktuellen Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des aktuellen Knotens zurück. |
| [get_Namespaces](./get_namespaces/)() | Gibt einen Wert zurück, der angibt, ob Namespace-Unterstützung verwendet werden soll. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Gibt die Namespace-URI (wie in der W3C-Namespacespezifikation definiert) des Knotens zurück, auf dem der Reader positioniert ist. |
| [get_NameTable](./get_nametable/)() override | Gibt die mit dieser Implementierung verknüpfte [XmlNameTable](../xmlnametable/) zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_Normalization](./get_normalization/)() | Gibt einen Wert zurück, der angibt, ob Leerzeichen und Attributwerte normalisiert werden sollen. |
| [get_Prefix](./get_prefix/)() override | Gibt das Namespace-Präfix zurück, das dem aktuellen Knoten zugeordnet ist. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Gibt einen Wert zurück, der angibt, ob die DTD‑Verarbeitung erlaubt werden soll. |
| [get_QuoteChar](./get_quotechar/)() override | Gibt das Anführungszeichen‑Zeichen zurück, das zum Einschließen des Werts eines Attributknotens verwendet wird. |
| [get_ReadState](./get_readstate/)() override | Gibt den Zustand des Readers zurück. |
| [get_Value](./get_value/)() override | Gibt den Textwert des aktuellen Knotens zurück. |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | Gibt einen Wert zurück, der angibt, wie Leerzeichen verarbeitet werden. |
| [get_XmlLang](./get_xmllang/)() override | Gibt den aktuellen **xml:lang**-Bereich zurück. |
| [get_XmlSpace](./get_xmlspace/)() override | Gibt den aktuellen **xml:space**-Geltungsbereich zurück. |
| [GetAttribute](./getattribute/)(String) override | Gibt den Wert des Attributs mit dem angegebenen Namen zurück. |
| [GetAttribute](./getattribute/)(String, String) override | Gibt den Wert des Attributs mit dem angegebenen lokalen Namen und Namespace-URI zurück. |
| [GetAttribute](./getattribute/)(int32_t) override | Gibt den Wert des Attributs mit dem angegebenen Index zurück. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Gibt eine Sammlung zurück, die alle derzeit im Gültigkeitsbereich befindlichen Namespaces enthält. |
| [GetRemainder](./getremainder/)() | Gibt den Rest des gepufferten XML zurück. |
| [HasLineInfo](./haslineinfo/)() override | Gibt einen Wert zurück, der angibt, ob die Klasse Zeileninformationen zurückgeben kann. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Löst ein Namespace-Präfix im Geltungsbereich des aktuellen Elements auf. |
| [MoveToAttribute](./movetoattribute/)(String) override | Wechselt zum Attribut mit dem angegebenen Namen. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Wechselt zum Attribut mit dem angegebenen lokalen Namen und Namespace-URI. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | Wechselt zum Attribut mit dem angegebenen Index. |
| [MoveToElement](./movetoelement/)() override | Wechselt zum Element, das den aktuellen Attributknoten enthält. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | Wechselt zum ersten Attribut. |
| [MoveToNextAttribute](./movetonextattribute/)() override | Wechselt zum nächsten Attribut. |
| [Read](./read/)() override | Liest den nächsten Knoten aus dem Stream. |
| [ReadAttributeValue](./readattributevalue/)() override | Parst den Attributwert in einen oder mehrere **[Text](../../system.text/)**, **EntityReference** oder **EndEntity**-Knoten. |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Dekodiert Base64 und gibt die dekodierten Binärbytes zurück. |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Dekodiert **BinHex** und gibt die dekodierten Binärbytes zurück. |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | Liest den Textinhalt eines Elements in einen Zeichenpuffer. Diese Methode ist dafür ausgelegt, große Streams eingebetteten Textes durch wiederholtes Aufrufen zu lesen. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Liest den Inhalt und gibt die **Base64** dekodierten Binärbytes zurück. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Liest den Inhalt und gibt die **BinHex** dekodierten Binärbytes zurück. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Liest das Element und dekodiert den Base64-Inhalt. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Liest das Element und dekodiert den **BinHex** Inhalt. |
| [ReadString](./readstring/)() override | Liest den Inhalt eines Elements oder eines Textknotens als Zeichenkette. |
| [ResetState](./resetstate/)() | Setzt den Zustand des Readers auf [ReadState::Initial](../readstate/) zurück. |
| [ResolveEntity](./resolveentity/)() override | Löst die Entity-Referenz für **EntityReference**-Knoten auf. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Setzt die Aufzählung [DtdProcessing](../dtdprocessing/). |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | Setzt einen Wert, der festlegt, wie der Reader Entitäten verarbeitet. |
| [set_Namespaces](./set_namespaces/)(bool) | Legt einen Wert fest, der angibt, ob Namespace-Unterstützung verwendet werden soll. |
| [set_Normalization](./set_normalization/)(bool) | Setzt einen Wert, der angibt, ob Leerzeichen und Attributwerte normalisiert werden sollen. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Setzt einen Wert, der angibt, ob DTD-Verarbeitung erlaubt ist. |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | Setzt einen Wert, der festlegt, wie Leerzeichen behandelt werden. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Setzt den [XmlResolver](../xmlresolver/), der zum Auflösen von DTD-Referenzen verwendet wird. |
| [Skip](./skip/)() override | Überspringt die Kindknoten des aktuellen Knotens. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | Initialisiert eine neue Instanz der Klasse [XmlTextReader](./) mit dem angegebenen Stream. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | Initialisiert eine neue Instanz der Klasse [XmlTextReader](./) mit der angegebenen URL und dem Stream. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der Klasse [XmlTextReader](./) mit dem angegebenen Stream und dem [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der Klasse [XmlTextReader](./) mit der angegebenen URL, dem Stream und dem [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | Initialisiert eine neue Instanz der Klasse [XmlTextReader](./) mit dem angegebenen TextReader. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | Initialisiert eine neue Instanz der Klasse [XmlTextReader](./) mit der angegebenen URL und dem TextReader. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der Klasse [XmlTextReader](./) mit dem angegebenen TextReader und dem [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der Klasse [XmlTextReader](./) mit der angegebenen URL, dem TextReader und dem [XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialisiert eine neue Instanz der [XmlTextReader](./)-Klasse mit dem angegebenen Stream, [XmlNodeType](../xmlnodetype/) und [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | Initialisiert eine neue Instanz der [XmlTextReader](./)-Klasse mit dem angegebenen String, [XmlNodeType](../xmlnodetype/) und [XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&) | Initialisiert eine neue Instanz der [XmlTextReader](./)-Klasse mit der angegebenen Datei. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der [XmlTextReader](./)-Klasse mit der angegebenen Datei und [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Es wird empfohlen, stattdessen die [XmlReader](../xmlreader/)-Klasse zu verwenden.

Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
