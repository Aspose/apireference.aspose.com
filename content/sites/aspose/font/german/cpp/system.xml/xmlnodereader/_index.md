---
title: "Klasse System::Xml::XmlNodeReader"
linktitle: "XmlNodeReader"
second_title: "Aspose.Font für C++"
description: "Klasse System::Xml::XmlNodeReader. Stellt einen Reader dar, der schnellen, nicht zwischengespeicherten, nur vorwärts gerichteten Zugriff auf XML-Daten in einem XmlNode in C++ bietet."
type: docs
weight: 2800
url: /de/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


Stellt einen Reader dar, der schnellen, nicht zwischengespeicherten, nur vorwärts gerichteten Zugriff auf XML-Daten in einem [XmlNode](../xmlnode/) bietet.

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Ändert den [XmlNodeReader::get_ReadState](./get_readstate/) zu [ReadState::Closed](../readstate/). |
| [get_AttributeCount](./get_attributecount/)() override | Gibt die Anzahl der Attribute des aktuellen Knotens zurück. |
| [get_BaseURI](./get_baseuri/)() override | Gibt die Basis-URI des aktuellen Knotens zurück. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | Gibt einen Wert zurück, der angibt, ob der [XmlNodeReader](./) die Methoden zum Lesen binärer Inhalte implementiert. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | Gibt einen Wert zurück, der angibt, ob dieser Reader Entitäten analysieren und auflösen kann. |
| [get_Depth](./get_depth/)() override | Gibt die Tiefe des aktuellen Knotens im XML-Dokument zurück. |
| [get_EOF](./get_eof/)() override | Gibt einen Wert zurück, der angibt, ob der Reader am Ende des Streams positioniert ist. |
| [get_HasAttributes](./get_hasattributes/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten Attribute hat. |
| [get_HasValue](./get_hasvalue/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten einen [XmlNodeReader::get_Value](./get_value/)-Wert haben kann. |
| [get_IsDefault](./get_isdefault/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein Attribut ist, das aus dem in der Dokumenttypdefinition (DTD) oder im Schema definierten Standardwert erzeugt wurde. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten ein leeres Element ist (zum Beispiel **<MyElement/>**). |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des aktuellen Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des aktuellen Knotens zurück. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Gibt die Namespace-URI (wie in der W3C-Namespacespezifikation definiert) des Knotens zurück, auf dem der Reader positioniert ist. |
| [get_NameTable](./get_nametable/)() override | Gibt die mit dieser Implementierung verknüpfte [XmlNameTable](../xmlnametable/) zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_Prefix](./get_prefix/)() override | Gibt das Namespace-Präfix zurück, das dem aktuellen Knoten zugeordnet ist. |
| [get_ReadState](./get_readstate/)() override | Gibt den Zustand des Readers zurück. |
| [get_SchemaInfo](./get_schemainfo/)() override | Gibt die Schema-Informationen zurück, die dem aktuellen Knoten zugewiesen wurden. |
| [get_Value](./get_value/)() override | Gibt den Textwert des aktuellen Knotens zurück. |
| [get_XmlLang](./get_xmllang/)() override | Gibt den aktuellen **xml:lang**-Bereich zurück. |
| [get_XmlSpace](./get_xmlspace/)() override | Gibt den aktuellen **xml:space**-Geltungsbereich zurück. |
| [GetAttribute](./getattribute/)(String) override | Gibt den Wert des Attributs mit dem angegebenen Namen zurück. |
| [GetAttribute](./getattribute/)(String, String) override | Gibt den Wert des Attributs mit dem angegebenen lokalen Namen und Namespace-URI zurück. |
| [GetAttribute](./getattribute/)(int32_t) override | Gibt den Wert des Attributs mit dem angegebenen Index zurück. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Löst ein Namespace-Präfix im Geltungsbereich des aktuellen Elements auf. |
| [MoveToAttribute](./movetoattribute/)(String) override | Wechselt zum Attribut mit dem angegebenen Namen. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | Wechselt zum Attribut mit dem angegebenen lokalen Namen und Namespace-URI. |
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
| [ResolveEntity](./resolveentity/)() override | Löst die Entity-Referenz für **EntityReference**-Knoten auf. |
| [Skip](./skip/)() override | Überspringt die Kindknoten des aktuellen Knotens. |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | Erstellt eine Instanz der Klasse [XmlNodeReader](./) mit dem angegebenen [XmlNode](../xmlnode/). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
