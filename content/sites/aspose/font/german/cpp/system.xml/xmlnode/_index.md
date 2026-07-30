---
title: "System::Xml::XmlNode Klasse"
linktitle: "XmlNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNode Klasse. Stellt einen einzelnen Knoten im XML-Dokument in C++ dar."
type: docs
weight: 2500
url: /de/cpp/system.xml/xmlnode/
---
## XmlNode class


Stellt einen einzelnen Knoten im XML-Dokument dar.

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | Fügt den angegebenen Knoten am Ende der Liste von Kindknoten dieses Knotens hinzu. |
| virtual [Clone](./clone/)() | Erstellt ein Duplikat dieses Knotens. |
| virtual [CloneNode](./clonenode/)(bool) | Erstellt ein Duplikat des Knotens, wenn in einer abgeleiteten Klasse überschrieben. |
| [CreateNavigator](./createnavigator/)() override | Erstellt einen XPathNavigator zum Navigieren dieses Objekts. |
| virtual [get_Attributes](./get_attributes/)() | Gibt eine [XmlAttributeCollection](../xmlattributecollection/) zurück, die die Attribute dieses Knotens enthält. |
| virtual [get_BaseURI](./get_baseuri/)() | Gibt die Basis-URI des aktuellen Knotens zurück. |
| virtual [get_ChildNodes](./get_childnodes/)() | Gibt alle Kindknoten des Knotens zurück. |
| virtual [get_FirstChild](./get_firstchild/)() | Gibt das erste Kind des Knotens zurück. |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | Gibt einen Wert zurück, der angibt, ob dieser Knoten Kindknoten hat. |
| virtual [get_InnerText](./get_innertext/)() | Gibt die verketteten Werte des Knotens und aller seiner Kindknoten zurück. |
| virtual [get_InnerXml](./get_innerxml/)() | Gibt das Markup zurück, das nur die Kindknoten dieses Knotens darstellt. |
| virtual [get_IsReadOnly](./get_isreadonly/)() | Gibt einen Wert zurück, der angibt, ob der Knoten schreibgeschützt ist. |
| virtual [get_LastChild](./get_lastchild/)() | Gibt das letzte Kind des Knotens zurück. |
| virtual [get_LocalName](./get_localname/)() | Gibt den lokalen Namen des Knotens zurück, wenn in einer abgeleiteten Klasse überschrieben. |
| virtual [get_Name](./get_name/)() | Gibt den qualifizierten Namen des Knotens zurück, wenn in einer abgeleiteten Klasse überschrieben. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Gibt die Namespace-URI dieses Knotens zurück. |
| virtual [get_NextSibling](./get_nextsibling/)() | Gibt den Knoten zurück, der unmittelbar auf diesen Knoten folgt. |
| virtual [get_NodeType](./get_nodetype/)() | Gibt den Typ des aktuellen Knotens zurück, wenn in einer abgeleiteten Klasse überschrieben. |
| virtual [get_OuterXml](./get_outerxml/)() | Gibt das Markup zurück, das diesen Knoten und alle seine Kindknoten enthält. |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | Gibt das [XmlDocument](../xmldocument/) zurück, zu dem dieser Knoten gehört. |
| virtual [get_ParentNode](./get_parentnode/)() | Gibt den übergeordneten Knoten dieses Knotens zurück (für Knoten, die übergeordnete Knoten haben können). |
| virtual [get_Prefix](./get_prefix/)() | Gibt das Namespace-Präfix dieses Knotens zurück. |
| virtual [get_PreviousSibling](./get_previoussibling/)() | Gibt den Knoten zurück, der diesem Knoten unmittelbar vorausgeht. |
| virtual [get_PreviousText](./get_previoustext/)() | Gibt den Textknoten zurück, der diesem Knoten unmittelbar vorausgeht. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Gibt das nach der Schema-Validierung zugewiesene Infoset zurück, das diesem Knoten als Ergebnis der Schema-Validierung zugewiesen wurde. |
| virtual [get_Value](./get_value/)() | Gibt den Wert des Knotens zurück. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Enumerator zurück, der die Kindknoten im aktuellen Knoten durchläuft. |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | Sucht die nächstgelegene **xmlns**-Deklaration für das angegebene Präfix, das im Geltungsbereich des aktuellen Knotens liegt, und gibt die Namespace-URI aus der Deklaration zurück. |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | Sucht die nächstgelegene **xmlns**-Deklaration für die angegebene Namespace-URI, die im Geltungsbereich des aktuellen Knotens liegt, und gibt das in dieser Deklaration definierte Präfix zurück. |
| virtual [idx_get](./idx_get/)(String) | Gibt das erste Kind-Element mit dem angegebenen [XmlNode::get_Name](./get_name/) zurück. |
| virtual [idx_get](./idx_get/)(String, String) | Gibt das erste Kind-Element mit den angegebenen [XmlNode::get_LocalName](./get_localname/) und [XmlNode::get_NamespaceURI](./get_namespaceuri/)-Werten zurück. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Fügt den angegebenen Knoten unmittelbar nach dem angegebenen Referenzknoten ein. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Fügt den angegebenen Knoten unmittelbar vor dem angegebenen Referenzknoten ein. |
| virtual [Normalize](./normalize/)() | Setzt alle [XmlText](../xmltext/)-Knoten in der vollen Tiefe des Unterbaums unterhalb dieses [XmlNode](./) in eine „normale“ Form, bei der nur Markup (also Tags, Kommentare, Verarbeitungsanweisungen, CDATA‑Abschnitte und Entity‑Referenzen) [XmlText](../xmltext/)-Knoten trennt, d.h. es gibt keine benachbarten [XmlText](../xmltext/)-Knoten. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | Fügt den angegebenen Knoten am Anfang der Liste von Kindknoten dieses Knotens hinzu. |
| virtual [RemoveAll](./removeall/)() | Entfernt alle Kindknoten und/oder Attribute des aktuellen Knotens. |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | Entfernt den angegebenen Kindknoten. |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Ersetzt den Kindknoten **oldChild** durch den Knoten **newChild**. |
| [SelectNodes](./selectnodes/)(const String\&) | Wählt eine Liste von Knoten aus, die dem [XPath](../../system.xml.xpath/)-Ausdruck entsprechen. |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Wählt eine Liste von Knoten aus, die dem [XPath](../../system.xml.xpath/)-Ausdruck entsprechen. Alle im [XPath](../../system.xml.xpath/)-Ausdruck gefundenen Präfixe werden mithilfe des bereitgestellten [XmlNamespaceManager](../xmlnamespacemanager/) aufgelöst. |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | Wählt den ersten [XmlNode](./) aus, der dem [XPath](../../system.xml.xpath/)-Ausdruck entspricht. |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Wählt den ersten [XmlNode](./) aus, der dem [XPath](../../system.xml.xpath/)-Ausdruck entspricht. Alle im [XPath](../../system.xml.xpath/)-Ausdruck gefundenen Präfixe werden mithilfe des bereitgestellten [XmlNamespaceManager](../xmlnamespacemanager/) aufgelöst. |
| virtual [set_InnerText](./set_innertext/)(String) | Setzt die verketteten Werte des Knotens und aller seiner Kindknoten. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Setzt das Markup, das nur die Kindknoten dieses Knotens darstellt. |
| virtual [set_Prefix](./set_prefix/)(String) | Setzt das Namespace-Präfix dieses Knotens. |
| virtual [set_Value](./set_value/)(String) | Setzt den Wert des Knotens. |
| virtual [Supports](./supports/)(String, String) | Prüft, ob die DOM-Implementierung ein bestimmtes Feature implementiert. |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | Speichert alle Kindknoten des Knotens in den angegebenen [XmlWriter](../xmlwriter/), wenn in einer abgeleiteten Klasse überschrieben. |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | Speichert den aktuellen Knoten in den angegebenen [XmlWriter](../xmlwriter/), wenn in einer abgeleiteten Klasse überschrieben. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
