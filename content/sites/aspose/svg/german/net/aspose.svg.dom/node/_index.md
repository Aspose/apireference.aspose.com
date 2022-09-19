---
title: Node
second_title: Aspose.SVG für .NET-API-Referenz
description: Die NodeSchnittstelle ist der primäre Datentyp für das gesamte Dokumentobjektmodell. Es stellt einen einzelnen Knoten im Dokumentbaum dar.
type: docs
weight: 1150
url: /de/net/aspose.svg.dom/node/
---
## Node class

Die Node-Schnittstelle ist der primäre Datentyp für das gesamte Dokumentobjektmodell. Es stellt einen einzelnen Knoten im Dokumentbaum dar.

```csharp
public abstract class Node : EventTarget, IXPathNSResolver
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | Eine NamedNodeMap, die die Attribute dieses Knotens enthält (wenn es sich um ein Element handelt) oder null andernfalls. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri) { get; } | Der absolute Basis-URI dieses Knotens oder null, wenn die Implementierung keinen absoluten URI erhalten konnte. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | Eine NodeList, die alle Kinder dieses Knotens enthält. Wenn es keine Kinder gibt, ist dies eine NodeList, die keine Knoten enthält.. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | Das erste untergeordnete Element dieses Knotens. Wenn es keinen solchen Knoten gibt, wird null zurückgegeben. |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | Das letzte untergeordnete Element dieses Knotens. Wenn es keinen solchen Knoten gibt, wird null zurückgegeben. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | Gibt den lokalen Teil des qualifizierten Namens dieses Knotens zurück. Für Knoten eines anderen Typs als ELEMENT_NODE und ATTRIBUTE_NODE und Knoten, die mit einer DOM-Level-1-Methode wie Document.createElement() erstellt wurden, ist dies immer null. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | Der Namespace-URI dieses Knotens oder null, wenn er nicht angegeben ist. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | Der Knoten unmittelbar nach diesem Knoten. Wenn es keinen solchen Knoten gibt, wird null zurückgegeben. |
| abstract [NodeName](../../aspose.svg.dom/node/nodename) { get; } | Der Name dieses Knotens, abhängig von seinem Typ. |
| abstract [NodeType](../../aspose.svg.dom/node/nodetype) { get; } | Ein Code, der den Typ des zugrunde liegenden Objekts darstellt. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | Der Wert dieses Knotens, abhängig von seinem Typ. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument) { get; } | Das diesem Knoten zugeordnete Document-Objekt. Dies ist auch das Document-Objekt, das zum Erstellen neuer Knoten verwendet wird. Wenn dieser Knoten ein Dokument oder ein Dokumenttyp ist, der noch mit keinem Dokument verwendet wird, ist dies null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | Ruft das übergeordnete Element ab[`Element`](../element) dieses Knotens. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | Das übergeordnete Element dieses Knotens. Alle Knoten außer Attr, Document, DocumentFragment, Entity und Notation können einen Elternknoten haben. Wenn jedoch ein Knoten gerade erstellt und noch nicht zum Baum hinzugefügt oder aus dem Baum entfernt wurde, ist dies null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | Das Namespace-Präfix dieses Knotens oder null, wenn es nicht angegeben ist. Wenn es als null definiert ist, hat das Setzen keine Auswirkung |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | Der Knoten unmittelbar vor diesem Knoten. Wenn es keinen solchen Knoten gibt, wird null zurückgegeben. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent) { get; set; } | Dieses Attribut gibt den Textinhalt dieses Knotens und seiner Nachkommen zurück. Wenn es als null definiert ist, hat das Festlegen keine Auswirkung. Beim Setzen werden alle möglichen Kinder dieses Knotens entfernt und, falls die neue Zeichenfolge nicht leer oder null ist, durch einen einzelnen Textknoten ersetzt, der die Zeichenfolge enthält, auf die dieses Attribut gesetzt ist. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | Diese Methode ermöglicht die Registrierung von Ereignis-Listenern auf dem Ereignisziel. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | Diese Methode ermöglicht die Registrierung von Ereignis-Listenern auf dem Ereignisziel. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | Diese Methode ermöglicht die Registrierung von Ereignis-Listenern auf dem Ereignisziel. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | Fügt den Knoten newChild am Ende der Liste der Kinder dieses Knotens hinzu. Wenn das newChild bereits im Baum vorhanden ist, wird es zuerst entfernt. |
| [CloneNode](../../aspose.svg.dom/node/clonenode#clonenode)() | Gibt ein Duplikat dieses Knotens zurück, dh dient als generischer Kopierkonstruktor für Knoten. Der doppelte Knoten hat keinen übergeordneten Knoten (parentNode ist null) und keine Benutzerdaten. |
| [CloneNode](../../aspose.svg.dom/node/clonenode#clonenode_1)(bool) | Gibt ein Duplikat dieses Knotens zurück, dh dient als generischer Kopierkonstruktor für Knoten. Der doppelte Knoten hat keinen übergeordneten Knoten (parentNode ist null) und keine Benutzerdaten. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | Diese Methode ermöglicht die Weiterleitung von Ereignissen in das Ereignismodell der Implementierung. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | Führt anwendungsdefinierte Aufgaben aus, die mit dem Freigeben, Freigeben oder Zurücksetzen nicht verwalteter Ressourcen verbunden sind. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Diese Methode wird zum Abrufen des ECMAScript-Objekts verwendetType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | Gibt zurück, ob dieser Knoten (wenn es sich um ein Element handelt) irgendwelche Attribute hat |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | Gibt zurück, ob dieser Knoten Kinder hat. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | Fügt den Knoten vor dem vorhandenen untergeordneten Knoten child ein. Wenn child null ist, fügen Sie einen Knoten am Ende der Liste der untergeordneten Elemente ein. Wenn child ein DocumentFragment-Objekt ist, werden alle seine untergeordneten Elemente in derselben Reihenfolge vor dem untergeordneten Element eingefügt. Wenn das Kind bereits im Stammbaum ist, wird es zuerst entfernt. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | Diese Methode prüft, ob der angegebene NamespaceURI der Standard-Namespace ist oder nicht. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | Testet, ob zwei Knoten gleich sind. Diese Methode testet auf Gleichheit von Knoten, nicht auf Gleichheit (dh ob die beiden Knoten Verweise auf dasselbe Objekt sind), was mit Node.isSameNode() getestet werden kann. Alle Knoten, die gleich sind, sind auch gleich, obwohl das Gegenteil möglicherweise nicht der Fall ist. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | Gibt zurück, ob dieser Knoten derselbe Knoten wie der gegebene ist. Mit dieser Methode kann festgestellt werden, ob zwei von der Implementierung zurückgegebene Node-Referenzen auf dasselbe Objekt verweisen. Wenn zwei Node-Referenzen Referenzen auf dasselbe Objekt sind, selbst wenn über einen Proxy, können die Referenzen vollständig austauschbar verwendet werden, sodass alle Attribute dieselben Werte haben und das Aufrufen derselben DOM-Methode für beide Referenzen immer genau denselben Effekt hat. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | Suchen Sie den Namespace-URI, der dem angegebenen Präfix zugeordnet ist, beginnend mit diesem Knoten. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | Suchen Sie das Präfix, das dem angegebenen Namespace-URI zugeordnet ist, beginnend mit diesem Knoten. Die Standard-Namespace-Deklarationen werden von dieser Methode ignoriert. Siehe Namespace Prefix Lookup für Details zum Algorithmus, der von dieser Methode verwendet wird. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | Bringt alle Textknoten in der vollen Tiefe des Unterbaums unterhalb dieses Knotens, einschließlich Attributknoten, in eine "normale" Form, wo nur Struktur (z. B. Elemente, Kommentare, Verarbeitungsanweisungen, CDATA-Abschnitte und Entitätsreferenzen) Text trennt Knoten, dh es gibt weder benachbarte Textknoten noch leere Textknoten. Dies kann verwendet werden, um sicherzustellen, dass die DOM-Ansicht eines Dokuments dieselbe ist, als ob es gespeichert und neu geladen worden wäre, und ist nützlich, wenn Operationen (wie XPointer [XPointer]-Lookups), die von einer bestimmten Dokumentbaumstruktur abhängen, ausgeführt werden sollen verwendet werden. Wenn der Parameter „normalize-characters“ des an Node.ownerDocument angehängten DOMConfiguration-Objekts wahr ist, normalisiert diese Methode auch die Zeichen der Text-Nodes vollständig. |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | Entfernt den durch oldChild angegebenen untergeordneten Knoten aus der Liste der untergeordneten Elemente und gibt ihn zurück. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | Diese Methode ermöglicht das Entfernen von Ereignis-Listenern aus dem Ereignisziel. Wenn an[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) wird aus einem entfernt[`EventTarget`](../eventtarget) während es ein Ereignis verarbeitet, wird es nicht durch die aktuellen Aktionen ausgelöst. Ereignis-Listener können nie aufgerufen werden, nachdem sie entfernt wurden. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | Diese Methode ermöglicht das Entfernen von Ereignis-Listenern aus dem Ereignisziel. Wenn an[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) wird aus einem entfernt[`EventTarget`](../eventtarget) während es ein Ereignis verarbeitet, wird es nicht durch die aktuellen Aktionen ausgelöst. Ereignis-Listener können nie aufgerufen werden, nachdem sie entfernt wurden. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | Diese Methode ermöglicht das Entfernen von Ereignis-Listenern aus dem Ereignisziel. Wenn an[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) wird aus einem entfernt[`EventTarget`](../eventtarget) während es ein Ereignis verarbeitet, wird es nicht durch die aktuellen Aktionen ausgelöst. Ereignis-Listener können nie aufgerufen werden, nachdem sie entfernt wurden. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | Ersetzt den untergeordneten Knoten oldChild durch newChild in der Liste der untergeordneten Elemente und gibt den oldChild-Knoten zurück. Wenn newChild ein DocumentFragment-Objekt ist, wird oldChild durch alle DocumentFragment-Kinder ersetzt, die in derselben Reihenfolge eingefügt werden. Wenn das newChild bereits im Baum vorhanden ist, wird es zuerst entfernt. |
| override [ToString](../../aspose.svg.dom/node/tostring)() | Gibt a zurückString die diese Instanz darstellt. |

## Felder

| Name | Beschreibung |
| --- | --- |
| const [ATTRIBUTE_NODE](../../aspose.svg.dom/node/attribute_node) | Ein Attributknoten |
| const [CDATA_SECTION_NODE](../../aspose.svg.dom/node/cdata_section_node) | Ein cdata-Abschnitt node |
| const [COMMENT_NODE](../../aspose.svg.dom/node/comment_node) | Ein Kommentar node |
| const [DOCUMENT_FRAGMENT_NODE](../../aspose.svg.dom/node/document_fragment_node) | Ein Dokumentfragment node |
| const [DOCUMENT_NODE](../../aspose.svg.dom/node/document_node) | Ein Dokumentknoten |
| const [DOCUMENT_TYPE_NODE](../../aspose.svg.dom/node/document_type_node) | Ein Dokumenttyp node |
| const [ELEMENT_NODE](../../aspose.svg.dom/node/element_node) | Ein Elementknoten |
| const [ENTITY_NODE](../../aspose.svg.dom/node/entity_node) | Ein Entitätsknoten |
| const [ENTITY_REFERENCE_NODE](../../aspose.svg.dom/node/entity_reference_node) | Ein Entitätsreferenzknoten |
| const [NOTATION_NODE](../../aspose.svg.dom/node/notation_node) | Eine Notation node |
| const [PROCESSING_INSTRUCTION_NODE](../../aspose.svg.dom/node/processing_instruction_node) | Ein Verarbeitungsanweisungsknoten |
| const [TEXT_NODE](../../aspose.svg.dom/node/text_node) | Ein Textknoten |

### Siehe auch

* class [EventTarget](../eventtarget)
* interface [IXPathNSResolver](../../aspose.svg.dom.xpath/ixpathnsresolver)
* namensraum [Aspose.Svg.Dom](../../aspose.svg.dom)
* Montage [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
