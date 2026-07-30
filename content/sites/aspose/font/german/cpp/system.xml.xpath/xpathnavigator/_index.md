---
title: "System::Xml::XPath::XPathNavigator Klasse"
linktitle: "XPathNavigator"
second_title: "Aspose.Font für C++"
description: "System::Xml::XPath::XPathNavigator Klasse. Stellt ein Cursor‑Modell zum Navigieren und Bearbeiten von XML‑Daten in C++ bereit."
type: docs
weight: 500
url: /de/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


Bietet ein Cursor-Modell zum Navigieren und Bearbeiten von XML-Daten.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | Gibt ein [XmlWriter](../../system.xml/xmlwriter/)-Objekt zurück, das verwendet wird, um ein oder mehrere neue Kindknoten am Ende der Kindknotenliste des aktuellen Knotens zu erstellen. |
| virtual [AppendChild](./appendchild/)(String) | Erstellt einen neuen Kindknoten am Ende der Kindknotenliste des aktuellen Knotens unter Verwendung der angegebenen XML‑Datenzeichenfolge. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | Erstellt einen neuen Kindknoten am Ende der Kindknotenliste des aktuellen Knotens unter Verwendung des XML‑Inhalts des angegebenen [XmlReader](../../system.xml/xmlreader/)-Objekts. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | Erstellt einen neuen Kindknoten am Ende der Kindknotenliste des aktuellen Knotens unter Verwendung der im angegebenen [XPathNavigator](./) enthaltenen Knoten. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | Erstellt einen neuen Kind-Elementknoten am Ende der Kindknotenliste des aktuellen Knotens unter Verwendung des angegebenen Namensraumpräfixes, des lokalen Namens und der angegebenen Namensraum‑URI mit dem angegebenen Wert. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | Überprüft, ob die XML‑Daten im [XPathNavigator](./) dem bereitgestellten XML‑[Schema](../../system.xml.schema/) (XSD)-Definitionsschema entsprechen. |
| virtual [Clone](./clone/)() | Wenn in einer abgeleiteten Klasse überschrieben, erstellt ein neues [XPathNavigator](./), das am selben Knoten wie dieses [XPathNavigator](./) positioniert ist. |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | Vergleicht die Position des aktuellen [XPathNavigator](./) mit der Position des angegebenen [XPathNavigator](./). |
| virtual [Compile](./compile/)(String) | Kompiliert einen String, der einen [XPath](../)-Ausdruck darstellt, und gibt ein [XPathExpression](../xpathexpression/)-Objekt zurück. |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | Erstellt einen Attributknoten im aktuellen Elementknoten unter Verwendung des angegebenen Namespace-Präfixes, des lokalen Namens und des angegebenen Namespace-URI mit dem angegebenen Wert. |
| virtual [CreateAttributes](./createattributes/)() | Gibt ein [XmlWriter](../../system.xml/xmlwriter/)-Objekt zurück, das zum Erstellen neuer Attribute im aktuellen Element verwendet wird. |
| [CreateNavigator](./createnavigator/)() override | Gibt eine Kopie des [XPathNavigator](./) zurück. |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | Löscht einen Bereich von Geschwisterknoten vom aktuellen Knoten bis zum angegebenen Knoten. |
| virtual [DeleteSelf](./deleteself/)() | Löscht den aktuellen Knoten und seine Kindknoten. |
| virtual [Evaluate](./evaluate/)(String) | Wertet den angegebenen [XPath](../)-Ausdruck aus und gibt das typisierte Ergebnis zurück. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Wertet den angegebenen [XPath](../)-Ausdruck aus und gibt das typisierte Ergebnis zurück, wobei das angegebene [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)-Objekt zur Auflösung von Namespace-Präfixen im [XPath](../)-Ausdruck verwendet wird. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | Wertet die [XPathExpression](../xpathexpression/) aus und gibt das typisierte Ergebnis zurück. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | Verwendet den bereitgestellten Kontext, um die [XPathExpression](../xpathexpression/) auszuwerten, und gibt das typisierte Ergebnis zurück. |
| virtual [get_BaseURI](./get_baseuri/)() | Wird in einer abgeleiteten Klasse überschrieben, liefert die Basis-URI für den aktuellen Knoten. |
| virtual [get_CanEdit](./get_canedit/)() | Gibt einen Wert zurück, der angibt, ob der [XPathNavigator](./) die zugrunde liegenden XML-Daten bearbeiten kann. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten Attribute besitzt. |
| virtual [get_HasChildren](./get_haschildren/)() | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten Kindknoten hat. |
| virtual [get_InnerXml](./get_innerxml/)() | Gibt das Markup zurück, das die Kindknoten des aktuellen Knotens darstellt. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Wird in einer abgeleiteten Klasse überschrieben, liefert einen Wert, der angibt, ob der aktuelle Knoten ein leeres Element ohne End-Tag ist. |
| [get_IsNode](./get_isnode/)() override | Gibt einen Wert zurück, der angibt, ob der aktuelle Knoten einen [XPath](../)-Knoten darstellt. |
| virtual [get_LocalName](./get_localname/)() | Wird in einer abgeleiteten Klasse überschrieben, liefert den [XPathNavigator::get_Name](./get_name/) des aktuellen Knotens ohne Namespace-Präfix. |
| virtual [get_Name](./get_name/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt den qualifizierten Namen des aktuellen Knotens zurück. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Wird in einer abgeleiteten Klasse überschrieben, liefert den Namespace-URI des aktuellen Knotens. |
| virtual [get_NameTable](./get_nametable/)() | Wird in einer abgeleiteten Klasse überschrieben, liefert die [XmlNameTable](../../system.xml/xmlnametable/) des [XPathNavigator](./). |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | Gibt einen [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) zurück, der zum Vergleich von [XPathNavigator](./)-Objekten auf Gleichheit verwendet wird. |
| virtual [get_NodeType](./get_nodetype/)() | Wird in einer abgeleiteten Klasse überschrieben, liefert den [XPathNodeType](../xpathnodetype/) des aktuellen Knotens. |
| virtual [get_OuterXml](./get_outerxml/)() | Gibt das Markup zurück, das die öffnenden und schließenden Tags des aktuellen Knotens und seiner Kindknoten darstellt. |
| virtual [get_Prefix](./get_prefix/)() | Wenn in einer abgeleiteten Klasse überschrieben, gibt das Namespace‑Präfix zurück, das dem aktuellen Knoten zugeordnet ist. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Gibt die Schemainformation zurück, die dem aktuellen Knoten infolge einer Schema‑Validierung zugewiesen wurde. |
| [get_TypedValue](./get_typedvalue/)() override | Gibt den aktuellen Knoten als ein verpacktes Objekt des am besten geeigneten Typs zurück. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | Wird von [XPathNavigator](./)-Implementierungen verwendet, die eine "virtualisierte" XML-Ansicht über einem Speicher bereitstellen, um Zugriff auf zugrunde liegende Objekte zu ermöglichen. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Gibt den Wert des aktuellen Knotens als [Boolean](../../system/boolean/) zurück. |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Gibt den Wert des aktuellen Knotens als [DateTime](../../system/datetime/) zurück. |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Gibt den Wert des aktuellen Knotens als [Double](../../system/double/) zurück. |
| [get_ValueAsInt](./get_valueasint/)() override | Gibt den Wert des aktuellen Knotens als [Int32](../../system/int32/) zurück. |
| [get_ValueAsLong](./get_valueaslong/)() override | Gibt den Wert des aktuellen Knotens als [Int64](../../system/int64/) zurück. |
| [get_ValueType](./get_valuetype/)() override | Gibt den Typ des aktuellen Knotens zurück. |
| virtual [get_XmlLang](./get_xmllang/)() | Gibt den **xml:lang**-Bereich für den aktuellen Knoten zurück. |
| [get_XmlType](./get_xmltype/)() override | Gibt die XmlSchemaType-Informationen für den aktuellen Knoten zurück. |
| virtual [GetAttribute](./getattribute/)(String, String) | Gibt den Wert des Attributs mit dem angegebenen lokalen Namen und Namespace-URI zurück. |
| virtual [GetNamespace](./getnamespace/)(String) | Gibt den Wert des Namensraumknotens zurück, der dem angegebenen lokalen Namen entspricht. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Gibt die im Geltungsbereich liegenden Namensräume des aktuellen Knotens zurück. |
| virtual [InsertAfter](./insertafter/)() | Gibt ein [XmlWriter](../../system.xml/xmlwriter/)-Objekt zurück, das verwendet wird, um einen neuen Geschwisterknoten nach dem aktuell ausgewählten Knoten zu erstellen. |
| virtual [InsertAfter](./insertafter/)(String) | Erstellt einen neuen Geschwisterknoten nach dem aktuell ausgewählten Knoten mithilfe der angegebenen XML-Zeichenkette. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | Erstellt einen neuen Geschwisterknoten nach dem aktuell ausgewählten Knoten mithilfe des XML-Inhalts des angegebenen [XmlReader](../../system.xml/xmlreader/)-Objekts. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | Erstellt einen neuen Geschwisterknoten nach dem aktuell ausgewählten Knoten mithilfe der Knoten im angegebenen [XPathNavigator](./)-Objekt. |
| virtual [InsertBefore](./insertbefore/)() | Gibt ein [XmlWriter](../../system.xml/xmlwriter/)-Objekt zurück, das verwendet wird, um einen neuen Geschwisterknoten vor dem aktuell ausgewählten Knoten zu erstellen. |
| virtual [InsertBefore](./insertbefore/)(String) | Erstellt einen neuen Geschwisterknoten vor dem aktuell ausgewählten Knoten mithilfe der angegebenen XML-Zeichenkette. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | Erstellt einen neuen Geschwisterknoten vor dem aktuell ausgewählten Knoten mithilfe des XML-Inhalts des angegebenen [XmlReader](../../system.xml/xmlreader/)-Objekts. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | Erstellt einen neuen Geschwisterknoten vor dem aktuell ausgewählten Knoten mithilfe der Knoten im angegebenen [XPathNavigator](./). |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | Erstellt ein neues Geschwisterelement nach dem aktuellen Knoten mithilfe des angegebenen Namensraumpräfixes, des lokalen Namens und der angegebenen Namensraum-URI, mit dem angegebenen Wert. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | Erstellt ein neues Geschwisterelement vor dem aktuellen Knoten mithilfe des angegebenen Namensraumpräfixes, des lokalen Namens und der angegebenen Namensraum-URI, mit dem angegebenen Wert. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | Bestimmt, ob der angegebene [XPathNavigator](./) ein Nachkomme des aktuellen [XPathNavigator](./) ist. |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | Wenn in einer abgeleiteten Klasse überschrieben, bestimmt, ob sich der aktuelle [XPathNavigator](./) an derselben Position wie der angegebene [XPathNavigator](./) befindet. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Gibt die Namespace‑URI für das angegebene Präfix zurück. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Gibt das für die angegebene Namensraum-URI deklarierte Präfix zurück. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | Bestimmt, ob der aktuelle Knoten mit dem angegebenen [XPathExpression](../xpathexpression/) übereinstimmt. |
| virtual [Matches](./matches/)(String) | Bestimmt, ob der aktuelle Knoten mit dem angegebenen [XPath](../)-Ausdruck übereinstimmt. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | Wenn in einer abgeleiteten Klasse überschrieben, bewegt den [XPathNavigator](./) an dieselbe Position wie den angegebenen [XPathNavigator](./). |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Verschiebt den [XPathNavigator](./) zum Attribut mit dem passenden lokalen Namen und Namespace-URI. |
| virtual [MoveToChild](./movetochild/)(String, String) | Verschiebt den [XPathNavigator](./) zum Kindknoten mit dem angegebenen lokalen Namen und Namespace-URI. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | Verschiebt den [XPathNavigator](./) zum Kindknoten des angegebenen [XPathNodeType](../xpathnodetype/). |
| virtual [MoveToFirst](./movetofirst/)() | Verschiebt den [XPathNavigator](./) zum ersten Geschwisterknoten des aktuellen Knotens. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Wird in einer abgeleiteten Klasse überschrieben, verschiebt es den [XPathNavigator](./) zum ersten Attribut des aktuellen Knotens. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | Wird in einer abgeleiteten Klasse überschrieben, verschiebt es den [XPathNavigator](./) zum ersten Kindknoten des aktuellen Knotens. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | Wird in einer abgeleiteten Klasse überschrieben, verschiebt es den [XPathNavigator](./) zum ersten Namespace-Knoten, der dem angegebenen [XPathNamespaceScope](../xpathnamespacescope/) entspricht. |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | Verschiebt den [XPathNavigator](./) zum ersten Namespace-Knoten des aktuellen Knotens. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | Verschiebt den [XPathNavigator](./) zum Element mit dem angegebenen lokalen Namen und Namespace-URI in Dokumentreihenfolge. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | Verschiebt den [XPathNavigator](./) zum Element mit dem angegebenen lokalen Namen und Namespace-URI, zum angegebenen Grenzwert, in Dokumentreihenfolge. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | Verschiebt den [XPathNavigator](./) zum folgenden Element des angegebenen [XPathNodeType](../xpathnodetype/) in Dokumentreihenfolge. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | Verschiebt den [XPathNavigator](./) zum folgenden Element des angegebenen [XPathNodeType](../xpathnodetype/), zum angegebenen Grenzwert, in Dokumentreihenfolge. |
| virtual [MoveToId](./movetoid/)(String) | Wird in einer abgeleiteten Klasse überschrieben, verschiebt es zum Knoten, der ein Attribut vom Typ **ID** hat, dessen Wert dem angegebenen [String](../../system/string/) entspricht. |
| virtual [MoveToNamespace](./movetonamespace/)(String) | Verschiebt den [XPathNavigator](./) zum Namespace-Knoten mit dem angegebenen Namespace-Präfix. |
| virtual [MoveToNext](./movetonext/)() | Wird in einer abgeleiteten Klasse überschrieben, verschiebt es den [XPathNavigator](./) zum nächsten Geschwisterknoten des aktuellen Knotens. |
| virtual [MoveToNext](./movetonext/)(String, String) | Verschiebt den [XPathNavigator](./) zum nächsten Geschwisterknoten mit dem angegebenen lokalen Namen und Namespace-URI. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | Verschiebt den [XPathNavigator](./) zum nächsten Geschwisterknoten des aktuellen Knotens, der dem angegebenen [XPathNodeType](../xpathnodetype/) entspricht. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Wird in einer abgeleiteten Klasse überschrieben, verschiebt es den [XPathNavigator](./) zum nächsten Attribut. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | Wird in einer abgeleiteten Klasse überschrieben, verschiebt es den [XPathNavigator](./) zum nächsten Namespace-Knoten, der dem angegebenen [XPathNamespaceScope](../xpathnamespacescope/) entspricht. |
| [MoveToNextNamespace](./movetonextnamespace/)() | Verschiebt den [XPathNavigator](./) zum nächsten Namespace-Knoten. |
| virtual [MoveToParent](./movetoparent/)() | Wird in einer abgeleiteten Klasse überschrieben, verschiebt es den [XPathNavigator](./) zum Elternknoten des aktuellen Knotens. |
| virtual [MoveToPrevious](./movetoprevious/)() | Wird in einer abgeleiteten Klasse überschrieben, verschiebt es den [XPathNavigator](./) zum vorherigen Geschwisterknoten des aktuellen Knotens. |
| virtual [MoveToRoot](./movetoroot/)() | Verschiebt den [XPathNavigator](./) zum Wurzelknoten, zu dem der aktuelle Knoten gehört. |
| virtual [PrependChild](./prependchild/)() | Gibt ein [XmlWriter](../../system.xml/xmlwriter/)‑Objekt zurück, das verwendet wird, um einen neuen Kindknoten am Anfang der Liste der Kindknoten des aktuellen Knotens zu erstellen. |
| virtual [PrependChild](./prependchild/)(String) | Erstellt einen neuen Kindknoten am Anfang der Liste der Kindknoten des aktuellen Knotens mithilfe des angegebenen XML‑Strings. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | Erstellt einen neuen untergeordneten Knoten am Anfang der Liste der untergeordneten Knoten des aktuellen Knotens mithilfe des XML-Inhalts des angegebenen [XmlReader](../../system.xml/xmlreader/) -Objekts. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | Erstellt einen neuen untergeordneten Knoten am Anfang der Liste der untergeordneten Knoten des aktuellen Knotens mithilfe der Knoten im angegebenen [XPathNavigator](./) -Objekt. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | Erstellt ein neues untergeordnetes Element am Anfang der Liste der untergeordneten Knoten des aktuellen Knotens unter Verwendung des angegebenen Namespace-Prefixes, des lokalen Namens und der angegebenen Namespace-URI. |
| virtual [ReadSubtree](./readsubtree/)() | Gibt ein [XmlReader](../../system.xml/xmlreader/) -Objekt zurück, das den aktuellen Knoten und seine untergeordneten Knoten enthält. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | Ersetzt einen Bereich von Geschwisterknoten vom aktuellen Knoten bis zum angegebenen Knoten. |
| virtual [ReplaceSelf](./replaceself/)(String) | Ersetzt den aktuellen Knoten durch den Inhalt der angegebenen Zeichenkette. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | Ersetzt den aktuellen Knoten durch den Inhalt des angegebenen [XmlReader](../../system.xml/xmlreader/) -Objekts. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | Ersetzt den aktuellen Knoten durch den Inhalt des angegebenen [XPathNavigator](./) -Objekts. |
| virtual [Select](./select/)(String) | Wählt ein Knotenset aus, wobei der angegebene [XPath](../) -Ausdruck verwendet wird. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Wählt ein Knotenset aus, wobei der angegebene [XPath](../) -Ausdruck zusammen mit dem angegebenen [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) -Objekt zur Auflösung von Namespace-Prefixen verwendet wird. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | Wählt ein Knotenset aus, wobei der angegebene [XPathExpression](../xpathexpression/) -Ausdruck verwendet wird. |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | Wählt alle Vorfahrenknoten des aktuellen Knotens aus, die einen passenden [XPathNodeType](../xpathnodetype/) besitzen. |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | Wählt alle Vorfahrenknoten des aktuellen Knotens aus, die den angegebenen lokalen Namen und die angegebene Namespace-URI besitzen. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | Wählt alle untergeordneten Knoten des aktuellen Knotens aus, die den passenden [XPathNodeType](../xpathnodetype/) besitzen. |
| virtual [SelectChildren](./selectchildren/)(String, String) | Wählt alle untergeordneten Knoten des aktuellen Knotens aus, die den angegebenen lokalen Namen und die angegebene Namespace-URI besitzen. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | Wählt alle Nachfahrenknoten des aktuellen Knotens aus, die einen passenden [XPathNodeType](../xpathnodetype/) besitzen. |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | Wählt alle Nachfahrenknoten des aktuellen Knotens aus, die den angegebenen lokalen Namen und die angegebene Namespace-URI besitzen. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | Wählt einen einzelnen Knoten im [XPathNavigator](./) aus, wobei die angegebene [XPath](../) -Abfrage verwendet wird. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Wählt einen einzelnen Knoten im [XPathNavigator](./) -Objekt aus, wobei die angegebene [XPath](../) -Abfrage zusammen mit dem angegebenen [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) -Objekt zur Auflösung von Namespace-Prefixen verwendet wird. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | Wählt einen einzelnen Knoten im [XPathNavigator](./) aus, wobei das angegebene [XPathExpression](../xpathexpression/) -Objekt verwendet wird. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Legt das Markup fest, das die untergeordneten Knoten des aktuellen Knotens darstellt. |
| virtual [set_OuterXml](./set_outerxml/)(String) | Legt das Markup fest, das die öffnenden und schließenden Tags des aktuellen Knotens und seiner untergeordneten Knoten darstellt. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | Legt den typisierten Wert des aktuellen Knotens fest. |
| virtual [SetValue](./setvalue/)(String) | Legt den Wert des aktuellen Knotens fest. |
| [ToString](./tostring/)() const override | Gibt den Textwert des aktuellen Knotens zurück. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Gibt den Wert des aktuellen Knotens als den angegebenen Typ zurück, wobei das angegebene [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) -Objekt zur Auflösung von Namespace-Prefixen verwendet wird. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | Überträgt den aktuellen Knoten und seine untergeordneten Knoten an das angegebene [XmlWriter](../../system.xml/xmlwriter/)‑Objekt. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |
## Siehe auch

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
