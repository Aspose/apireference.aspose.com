---
title: "System::Xml::XmlDocument‑Klasse"
linktitle: "XmlDocument"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDocument‑Klasse. Stellt ein XML‑Dokument dar. Sie können diese Klasse verwenden, um XML in einem Dokument in C++ zu laden, zu validieren, zu bearbeiten, hinzuzufügen und zu positionieren."
type: docs
weight: 1400
url: /de/cpp/system.xml/xmldocument/
---
## XmlDocument class


Stellt ein XML-Dokument dar. Sie können diese Klasse verwenden, um XML in einem Dokument zu laden, zu validieren, zu bearbeiten, hinzuzufügen und zu positionieren.

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Erstellt ein Duplikat dieses Knotens. |
| [CreateAttribute](./createattribute/)(const String\&) | Erstellt ein [XmlAttribute](../xmlattribute/) mit dem angegebenen Namen. |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | Erstellt ein [XmlAttribute](../xmlattribute/) mit dem angegebenen qualifizierten Namen und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | Erstellt ein [XmlAttribute](../xmlattribute/) mit dem angegebenen [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/) und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | Erstellt einen [XmlCDataSection](../xmlcdatasection/), der die angegebenen Daten enthält. |
| virtual [CreateComment](./createcomment/)(const String\&) | Erstellt einen [XmlComment](../xmlcomment/), der die angegebenen Daten enthält. |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | Erstellt ein [XmlDocumentFragment](../xmldocumentfragment/). |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | Gibt ein neues [XmlDocumentType](../xmldocumenttype/) Objekt zurück. |
| [CreateElement](./createelement/)(const String\&) | Erstellt ein Element mit dem angegebenen Namen. |
| [CreateElement](./createelement/)(const String\&, const String\&) | Erstellt ein [XmlElement](../xmlelement/) mit dem qualifizierten Namen und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | Erstellt ein Element mit dem angegebenen [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/) und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | Erstellt ein [XmlEntityReference](../xmlentityreference/) mit dem angegebenen Namen. |
| [CreateNavigator](./createnavigator/)() override | Erstellt ein neues XPathNavigator-Objekt zum Navigieren in diesem Dokument. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | Erstellt ein [XmlNode](../xmlnode/) mit dem angegebenen [XmlNodeType](../xmlnodetype/), [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_Name](./get_name/) und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | Erstellt ein [XmlNode](../xmlnode/) mit dem angegebenen Knotentyp, [XmlDocument::get_Name](./get_name/) und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | Erstellt ein [XmlNode](../xmlnode/) mit dem angegebenen [XmlNodeType](../xmlnodetype/), [XmlDocument::get_Name](./get_name/) und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | Erstellt eine [XmlProcessingInstruction](../xmlprocessinginstruction/) mit dem angegebenen Namen und den Daten. |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | Erstellt einen [XmlSignificantWhitespace](../xmlsignificantwhitespace/) Knoten. |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | Erstellt ein [XmlText](../xmltext/) mit dem angegebenen Text. |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | Erstellt einen [XmlWhitespace](../xmlwhitespace/) Knoten. |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | Erstellt einen [XmlDeclaration](../xmldeclaration/) Knoten mit den angegebenen Werten. |
| [get_BaseURI](./get_baseuri/)() override | Gibt die Basis-URI des aktuellen Knotens zurück. |
| [get_DocumentElement](./get_documentelement/)() | Gibt das Wurzel-[XmlElement](../xmlelement/) für das Dokument zurück. |
| virtual [get_DocumentType](./get_documenttype/)() | Gibt den Knoten zurück, der die DOCTYPE-Deklaration enthält. |
| [get_Implementation](./get_implementation/)() | Gibt das [XmlImplementation](../xmlimplementation/) Objekt für das aktuelle Dokument zurück. |
| [get_InnerXml](./get_innerxml/)() override | Gibt das Markup zurück, das die Kinder des aktuellen Knotens darstellt. |
| [get_IsReadOnly](./get_isreadonly/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten schreibgeschützt ist. |
| [get_LocalName](./get_localname/)() override | Gibt den lokalen Namen des Knotens zurück. |
| [get_Name](./get_name/)() override | Gibt den qualifizierten Namen des Knotens zurück. |
| [get_NameTable](./get_nametable/)() | Gibt die mit dieser Implementierung verknüpfte [XmlNameTable](../xmlnametable/) zurück. |
| [get_NodeType](./get_nodetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Gibt das [XmlDocument](./) zurück, zu dem der aktuelle Knoten gehört. |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | Gibt einen Wert zurück, der angibt, ob Leerzeichen im Elementinhalt erhalten bleiben sollen. |
| [get_SchemaInfo](./get_schemainfo/)() override | Gibt das Post-Schema-Validation-Infoset (PSVI) des Knotens zurück. |
| [get_Schemas](./get_schemas/)() | Gibt das XmlSchemaSet-Objekt zurück, das mit diesem [XmlDocument](./) verknüpft ist. |
| virtual [GetElementById](./getelementbyid/)(String) | Gibt das [XmlElement](../xmlelement/) mit der angegebenen ID zurück. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Gibt eine [XmlNodeList](../xmlnodelist/) zurück, die eine Liste aller Nachfahren-Elemente enthält, die dem angegebenen Namen entsprechen. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Gibt eine [XmlNodeList](../xmlnodelist/) zurück, die eine Liste aller Nachfahren-Elemente enthält, die dem angegebenen [XmlDocument::get_LocalName](./get_localname/) und [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) entsprechen. |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | Importiert einen Knoten aus einem anderen Dokument in das aktuelle Dokument. |
| virtual [Load](./load/)(String) | Lädt das XML-Dokument von der angegebenen URL. |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | Lädt das XML-Dokument aus dem angegebenen Stream. |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | Lädt das XML-Dokument aus dem angegebenen TextReader. |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | Lädt das XML-Dokument aus dem angegebenen [XmlReader](../xmlreader/). |
| virtual [LoadXml](./loadxml/)(String) | Lädt das XML-Dokument aus der angegebenen Zeichenkette. |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | Erstellt ein [XmlNode](../xmlnode/)-Objekt basierend auf den Informationen im [XmlReader](../xmlreader/). Der Reader muss auf einem Knoten oder Attribut positioniert sein. |
| virtual [Save](./save/)(String) | Speichert das XML-Dokument in die angegebene Datei. Wenn die angegebene Datei existiert, überschreibt diese Methode sie. |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | Speichert das XML-Dokument in den angegebenen Stream. |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | Speichert das XML-Dokument in den angegebenen TextWriter. |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | Speichert das XML-Dokument in den angegebenen [XmlWriter](../xmlwriter/). |
| [set_InnerText](./set_innertext/)(String) override | Wirft in allen Fällen eine InvalidOperationException. |
| [set_InnerXml](./set_innerxml/)(String) override | Legt das Markup fest, das die Kinder des aktuellen Knotens darstellt. |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | Legt einen Wert fest, der angibt, ob Leerzeichen im Elementinhalt erhalten bleiben sollen. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Legt das XmlSchemaSet-Objekt fest, das mit diesem [XmlDocument](./) verknüpft ist. |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | Legt den [XmlResolver](../xmlresolver/) fest, der zum Auflösen externer Ressourcen verwendet wird. |
| [Validate](./validate/)(Schema::ValidationEventHandler) | Validiert das [XmlDocument](./) gegen die im XML [Schema](../../system.xml.schema/) Definition Language (XSD) enthaltenen Schemata, die in der [XmlDocument::get_Schemas](./get_schemas/)‑Liste enthalten sind. |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | Validiert das angegebene [XmlNode](../xmlnode/)-Objekt gegen die im XML [Schema](../../system.xml.schema/) Definition Language (XSD) enthaltenen Schemata in der [XmlDocument::get_Schemas](./get_schemas/)‑Liste. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert alle Kinder des [XmlDocument](./)-Knotens in den angegebenen [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Speichert den [XmlDocument](./)-Knoten in den angegebenen [XmlWriter](../xmlwriter/). |
| [XmlDocument](./xmldocument/)() | Initialisiert eine neue Instanz der [XmlDocument](./)-Klasse. |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | Initialisiert eine neue Instanz der [XmlDocument](./)-Klasse mit der angegebenen [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Hinweise



Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals Instanzen dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Pointer und verwenden Sie diesen Pointer, um ihn als Argument an Funktionen zu übergeben.

## Siehe auch

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
