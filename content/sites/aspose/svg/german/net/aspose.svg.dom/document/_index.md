---
title: Document
second_title: Aspose.SVG für .NET-API-Referenz
description: Das Dokument repräsentiert das gesamte HTML XML oder SVGDokument. Konzeptionell ist es die Wurzel des Dokumentbaums und bietet den primären Zugriff auf die Daten des Dokuments.
type: docs
weight: 810
url: /de/net/aspose.svg.dom/document/
---
## Document class

Das Dokument repräsentiert das gesamte HTML-, XML- oder SVG-Dokument. Konzeptionell ist es die Wurzel des Dokumentbaums und bietet den primären Zugriff auf die Daten des Dokuments.

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | Eine NamedNodeMap, die die Attribute dieses Knotens enthält (wenn es sich um ein Element handelt) oder null andernfalls. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri) { get; } | Der absolute Basis-URI dieses Knotens oder null, wenn die Implementierung keinen absoluten URI erhalten konnte. |
| [CharacterSet](../../aspose.svg.dom/document/characterset) { get; } | Ruft die Kodierung des Dokuments ab. |
| [Charset](../../aspose.svg.dom/document/charset) { get; } | Ruft die Kodierung des Dokuments ab. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount) { get; } | Gibt die aktuelle Anzahl der Elementknoten zurück, die Kinder dieses Elements sind. 0, wenn dieses Element keine untergeordneten Knoten hat, die vom nodeType 1. sind |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | Eine NodeList, die alle Kinder dieses Knotens enthält. Wenn es keine Kinder gibt, ist dies eine NodeList, die keine Knoten enthält.. |
| [Children](../../aspose.svg.dom/document/children) { get; } | Gibt die untergeordneten Elemente zurück. |
| [ContentType](../../aspose.svg.dom/document/contenttype) { get; } | Ruft den Inhaltstyp des Dokuments ab. |
| [Context](../../aspose.svg.dom/document/context) { get; } | Ruft den aktuellen Browserkontext ab. |
| [DefaultView](../../aspose.svg.dom/document/defaultview) { get; } | Das IDL-Attribut defaultView der Document-Schnittstelle muss beim Abrufen von das WindowProxy-Objekt des Browsing-Kontexts dieses Dokuments zurückgeben, , wenn dieses Dokument einen zugehörigen Browsing-Kontext hat, oder andernfalls null. |
| [Doctype](../../aspose.svg.dom/document/doctype) { get; } | Die diesem Dokument zugeordnete Dokumenttypdeklaration. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement) { get; } | Dies ist ein praktisches Attribut, das direkten Zugriff auf den untergeordneten Knoten ermöglicht, der das Dokumentelement des Dokuments ist. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi) { get; } | Der Speicherort des Dokuments oder null, wenn nicht definiert oder wenn das Dokument mit DOMImplementation.createDocument erstellt wurde. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | Das erste untergeordnete Element dieses Knotens. Wenn es keinen solchen Knoten gibt, wird null zurückgegeben. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild) { get; } | Gibt den ersten untergeordneten Elementknoten dieses Elements zurück. null, wenn dieses Element keine untergeordneten Elemente hat. |
| [Implementation](../../aspose.svg.dom/document/implementation) { get; } | Das DOMImplementation-Objekt, das dieses Dokument verarbeitet. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding) { get; } | Ruft die Kodierung des Dokuments ab. |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | Das letzte untergeordnete Element dieses Knotens. Wenn es keinen solchen Knoten gibt, wird null zurückgegeben. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild) { get; } | Gibt den letzten untergeordneten Elementknoten dieses Elements zurück. null, wenn dieses Element keine untergeordneten Elemente hat. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | Gibt den lokalen Teil des qualifizierten Namens dieses Knotens zurück. Für Knoten eines anderen Typs als ELEMENT_NODE und ATTRIBUTE_NODE und Knoten, die mit einer DOM-Level-1-Methode wie Document.createElement() erstellt wurden, ist dies immer null. |
| [Location](../../aspose.svg.dom/document/location) { get; } | Der Speicherort des Dokuments. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | Der Namespace-URI dieses Knotens oder null, wenn er nicht angegeben ist. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling) { get; } | Gibt den nächsten gleichgeordneten Elementknoten dieses Elements zurück. null, wenn dieses Element keine untergeordneten Elementknoten hat, die im Dokumentbaum nach diesem Knoten kommen. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | Der Knoten unmittelbar nach diesem Knoten. Wenn es keinen solchen Knoten gibt, wird null zurückgegeben. |
| override [NodeName](../../aspose.svg.dom/document/nodename) { get; } | Der Name dieses Knotens, abhängig von seinem Typ. |
| override [NodeType](../../aspose.svg.dom/document/nodetype) { get; } | Ein Code, der den Typ des zugrunde liegenden Objekts darstellt. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | Der Wert dieses Knotens, abhängig von seinem Typ. |
| [Origin](../../aspose.svg.dom/document/origin) { get; } | Ruft den Dokumentursprung ab. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument) { get; } | Ruft das Besitzerdokument ab. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | Ruft das übergeordnete Element ab[`Element`](../element) dieses Knotens. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | Das übergeordnete Element dieses Knotens. Alle Knoten außer Attr, Document, DocumentFragment, Entity und Notation können einen Elternknoten haben. Wenn jedoch ein Knoten gerade erstellt und noch nicht zum Baum hinzugefügt oder aus dem Baum entfernt wurde, ist dies null. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | Das Namespace-Präfix dieses Knotens oder null, wenn es nicht angegeben ist. Wenn es als null definiert ist, hat das Setzen keine Auswirkung |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling) { get; } | Gibt den vorherigen gleichgeordneten Elementknoten dieses Elements zurück. null, wenn dieses Element keine Element-Geschwisterknoten hat, die vor diesem im Dokumentbaum stehen. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | Der Knoten unmittelbar vor diesem Knoten. Wenn es keinen solchen Knoten gibt, wird null zurückgegeben. |
| [ReadyState](../../aspose.svg.dom/document/readystate) { get; } | Gibt die Dokumentenbereitschaft zurück. Das "Laden", während das Dokument geladen wird, "interaktiv", wenn es mit dem Parsen fertig ist, aber immer noch Unterressourcen lädt, und "abschließen", sobald es geladen ist. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking) { get; set; } | Ein Attribut, das angibt, ob eine Fehlerprüfung erzwungen wird oder nicht. Wenn auf „false“ gesetzt, steht es der Implementierung frei, nicht jeden möglichen Fehlerfall zu testen, der normalerweise für DOM-Operationen definiert ist, und keine DOMException für DOM-Operationen auszulösen oder Fehler zu melden, während Document.normalizeDocument() verwendet wird. Im Fehlerfall ist das Verhalten undefiniert. Dieses Attribut ist standardmäßig wahr. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets) { get; } | Eine Liste mit allen Stylesheets, die explizit mit einem Dokument verknüpft oder darin eingebettet sind. Bei HTML-Dokumenten umfasst dies externe Stylesheets, die über das HTML-LINK-Element eingebunden werden, und Inline-STYLE-Elemente. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent) { get; set; } | Dieses Attribut gibt den Textinhalt dieses Knotens und seiner Nachkommen zurück. Wenn es als null definiert ist, hat das Festlegen keine Auswirkung. Beim Setzen werden alle möglichen Kinder dieses Knotens entfernt und, falls die neue Zeichenfolge nicht leer oder null ist, durch einen einzelnen Textknoten ersetzt, der die Zeichenfolge enthält, auf die dieses Attribut gesetzt ist. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone) { get; set; } | Ein Attribut, das als Teil der XML-Deklaration angibt, ob dieses Dokument eigenständig ist. Dies ist falsch, wenn nicht angegeben. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion) { get; set; } | Ein Attribut, das als Teil der XML-Deklaration die Versionsnummer dieses Dokuments angibt. Wenn keine Deklaration vorhanden ist und dieses Dokument die Funktion „XML“ unterstützt, ist der Wert „1.0“. Wenn dieses Dokument die Funktion "XML" nicht unterstützt, ist der Wert immer null. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | Diese Methode ermöglicht die Registrierung von Ereignis-Listenern auf dem Ereignisziel. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | Diese Methode ermöglicht die Registrierung von Ereignis-Listenern auf dem Ereignisziel. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | Diese Methode ermöglicht die Registrierung von Ereignis-Listenern auf dem Ereignisziel. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | Fügt den Knoten newChild am Ende der Liste der Kinder dieses Knotens hinzu. Wenn das newChild bereits im Baum vorhanden ist, wird es zuerst entfernt. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | Gibt ein Duplikat dieses Knotens zurück, dh dient als generischer Kopierkonstruktor für Knoten. Der doppelte Knoten hat keinen übergeordneten Knoten (parentNode ist null) und keine Benutzerdaten. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | Gibt ein Duplikat dieses Knotens zurück, dh dient als generischer Kopierkonstruktor für Knoten. Der doppelte Knoten hat keinen übergeordneten Knoten (parentNode ist null) und keine Benutzerdaten. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute)(string) | Erstellt ein Attr des angegebenen Namens. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens)(string, string) | Erstellt ein Attribut des angegebenen qualifizierten Namens und Namespace-URI. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection)(string) | Erstellt einen CDATASection-Knoten, dessen Wert die angegebene Zeichenfolge ist. |
| [CreateComment](../../aspose.svg.dom/document/createcomment)(string) | Erstellt einen Kommentarknoten mit der angegebenen Zeichenfolge. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment)() | Erstellt ein leeres DocumentFragment-Objekt. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype)(string, string, string, string) | Erstellt einen DocumentType-Knoten. |
| [CreateElement](../../aspose.svg.dom/document/createelement)(string) | Erstellt ein Element des angegebenen Typs. Beachten Sie, dass die zurückgegebene Instanz die Element-Schnittstelle implementiert, sodass Attribute direkt für das zurückgegebene Objekt angegeben werden können. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns)(string, string) | Erstellt ein Element des angegebenen qualifizierten Namens und Namespace-URI. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference)(string) | Erstellt ein EntityReference-Objekt. Wenn die referenzierte Entität bekannt ist, wird außerdem die untergeordnete Liste des EntityReference-Knotens mit der des entsprechenden Entitätsknotens identisch gemacht. |
| [CreateEvent](../../aspose.svg.dom/document/createevent)(string) | Erstellt eine[`Event`](../../aspose.svg.dom.events/event) eines Typs, der von der Implementierung unterstützt wird. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression)(string, IXPathNSResolver) | Erstellt einen geparsten XPath-Ausdruck mit aufgelösten Namespaces. Dies ist nützlich, wenn ein Ausdruck in einer Anwendung wiederverwendet wird, da es ermöglicht, die Ausdruckszeichenfolge in eine effizientere interne Form zu kompilieren und alle Namensraumpräfixe vorab aufzulösen, die innerhalb des Ausdrucks vorkommen. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator)(Node) | Erstellen Sie einen neuen NodeIterator über dem Teilbaum, der an dem angegebenen Knoten verwurzelt ist. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator_1)(Node, long) | Erstellen Sie einen neuen NodeIterator über dem Teilbaum, der an dem angegebenen Knoten verwurzelt ist. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator_2)(Node, long, INodeFilter) | Erstellen Sie einen neuen NodeIterator über dem Teilbaum, der an dem angegebenen Knoten verwurzelt ist. |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver)(Node) | Passt jeden DOM-Knoten an, um Namespaces aufzulösen, so dass ein XPath-Ausdruck leicht ausgewertet werden kann relativ zum Kontext des Knotens, in dem er im Dokument vorkam. Dieser Adapter funktioniert wie die DOM-Level-3-Methode`lookupNamespace-URI` auf Knoten beim Auflösen des Namensraum-URI aus einem gegebenen Präfix unter Verwendung der aktuellen Informationen, die in der Knotenhierarchie zu dem Zeitpunkt verfügbar sind, an dem lookupNamespaceURI aufgerufen wird, wobei auch das implizite XML-Präfix korrekt aufgelöst wird. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction)(string, string) | Erstellt einen ProcessingInstruction-Knoten mit dem angegebenen Namen und den angegebenen Datenstrings. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode)(string) | Erstellt einen Textknoten mit der angegebenen Zeichenfolge. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker)(Node) | Erstellen Sie einen neuen TreeWalker über dem Teilbaum, der an dem angegebenen Knoten verwurzelt ist. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker_1)(Node, long) | Erstellen Sie einen neuen TreeWalker über dem Teilbaum, der an dem angegebenen Knoten verwurzelt ist. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker_2)(Node, long, INodeFilter) | Erstellen Sie einen neuen TreeWalker über dem Teilbaum, der an dem angegebenen Knoten verwurzelt ist. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | Diese Methode ermöglicht die Weiterleitung von Ereignissen in das Ereignismodell der Implementierung. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | Führt anwendungsdefinierte Aufgaben aus, die mit dem Freigeben, Freigeben oder Zurücksetzen nicht verwalteter Ressourcen verbunden sind. |
| [Evaluate](../../aspose.svg.dom/document/evaluate)(string, Node, IXPathNSResolver, XPathResultType, object) | Wertet eine XPath-Ausdruckszeichenfolge aus und gibt, wenn möglich, ein Ergebnis des angegebenen Typs zurück. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid)(string) | Gibt das Element zurück, das ein ID-Attribut mit dem angegebenen Wert hat. Wenn kein solches Element vorhanden ist, gibt dies null zurück. Wenn mehr als ein Element ein ID-Attribut mit diesem Wert hat, ist das, was zurückgegeben wird, undefiniert. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname)(string) | Gibt ein aktives NodeList-Objekt zurück, das alle Elemente im Dokument enthält, die alle im Argument angegebenen Klassen haben. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname)(string) | Gibt eine NodeList aller Elemente in Dokumentreihenfolge mit einem bestimmten Tag-Namen zurück und sind im Dokument enthalten. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens)(string, string) | Gibt eine NodeList aller Elemente mit einem gegebenen lokalen Namen und Namespace-URI in Dokumentenreihenfolge zurück. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Diese Methode wird zum Abrufen des ECMAScript-Objekts verwendetType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | Gibt zurück, ob dieser Knoten (wenn es sich um ein Element handelt) irgendwelche Attribute hat |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | Gibt zurück, ob dieser Knoten Kinder hat. |
| [ImportNode](../../aspose.svg.dom/document/importnode)(Node, bool) | Importiert einen Knoten aus einem anderen Dokument in dieses Dokument, ohne den Quellknoten aus dem Originaldokument zu ändern oder zu entfernen; Diese Methode erstellt eine neue Kopie des Quellknotens. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | Fügt den Knoten vor dem vorhandenen untergeordneten Knoten child ein. Wenn child null ist, fügen Sie einen Knoten am Ende der Liste der untergeordneten Elemente ein. Wenn child ein DocumentFragment-Objekt ist, werden alle seine untergeordneten Elemente in derselben Reihenfolge vor dem untergeordneten Element eingefügt. Wenn das Kind bereits im Stammbaum ist, wird es zuerst entfernt. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | Diese Methode prüft, ob der angegebene NamespaceURI der Standard-Namespace ist oder nicht. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | Testet, ob zwei Knoten gleich sind. Diese Methode testet auf Gleichheit von Knoten, nicht auf Gleichheit (dh ob die beiden Knoten Verweise auf dasselbe Objekt sind), was mit Node.isSameNode() getestet werden kann. Alle Knoten, die gleich sind, sind auch gleich, obwohl das Gegenteil möglicherweise nicht der Fall ist. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | Gibt zurück, ob dieser Knoten derselbe Knoten wie der gegebene ist. Mit dieser Methode kann festgestellt werden, ob zwei von der Implementierung zurückgegebene Node-Referenzen auf dasselbe Objekt verweisen. Wenn zwei Node-Referenzen Referenzen auf dasselbe Objekt sind, selbst wenn über einen Proxy, können die Referenzen vollständig austauschbar verwendet werden, sodass alle Attribute dieselben Werte haben und das Aufrufen derselben DOM-Methode für beide Referenzen immer genau denselben Effekt hat. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | Suchen Sie den Namespace-URI, der dem angegebenen Präfix zugeordnet ist, beginnend mit diesem Knoten. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | Suchen Sie das Präfix, das dem angegebenen Namespace-URI zugeordnet ist, beginnend mit diesem Knoten. Die Standard-Namespace-Deklarationen werden von dieser Methode ignoriert. Siehe Namespace Prefix Lookup für Details zum Algorithmus, der von dieser Methode verwendet wird. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate)(RequestMessage) | Lädt das Dokument basierend auf dem angegebenen Anforderungsobjekt und ersetzt den vorherigen Inhalt. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_4)(string) | Lädt das Dokument unter der angegebenen URL (Uniform Resource Locator) in die aktuelle Instanz und ersetzt den vorherigen Inhalt. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_1)(Url) | Lädt das Dokument unter der angegebenen URL (Uniform Resource Locator) in die aktuelle Instanz und ersetzt den vorherigen Inhalt. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_3)(Stream, string) | Lädt das Dokument aus dem angegebenen Inhalt und verwendet baseUri, um relative Ressourcen aufzulösen, wodurch der vorherige Inhalt ersetzt wird. Das Laden des Dokuments beginnt an der aktuellen Position im Stream. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_2)(Stream, Url) | Lädt das Dokument aus dem angegebenen Inhalt und verwendet baseUri, um relative Ressourcen aufzulösen, wodurch der vorherige Inhalt ersetzt wird. Das Laden des Dokuments beginnt an der aktuellen Position im Stream. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_6)(string, string) | Lädt das Dokument aus dem angegebenen Inhalt und verwendet baseUri, um relative Ressourcen aufzulösen, wobei der vorherige Inhalt ersetzt wird. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_5)(string, Url) | Lädt das Dokument aus dem angegebenen Inhalt und verwendet baseUri, um relative Ressourcen aufzulösen, wobei der vorherige Inhalt ersetzt wird. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | Bringt alle Textknoten in der vollen Tiefe des Unterbaums unterhalb dieses Knotens, einschließlich Attributknoten, in eine "normale" Form, wo nur Struktur (z. B. Elemente, Kommentare, Verarbeitungsanweisungen, CDATA-Abschnitte und Entitätsreferenzen) Text trennt Knoten, dh es gibt weder benachbarte Textknoten noch leere Textknoten. Dies kann verwendet werden, um sicherzustellen, dass die DOM-Ansicht eines Dokuments dieselbe ist, als ob es gespeichert und neu geladen worden wäre, und ist nützlich, wenn Operationen (wie XPointer [XPointer]-Lookups), die von einer bestimmten Dokumentbaumstruktur abhängen, ausgeführt werden sollen verwendet werden. Wenn der Parameter „normalize-characters“ des an Node.ownerDocument angehängten DOMConfiguration-Objekts wahr ist, normalisiert diese Methode auch die Zeichen der Text-Nodes vollständig. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector)(string) | Gibt das erste Element im Dokument zurück, das mit selector übereinstimmt |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall)(string) | Gibt eine NodeList aller Elemente im Dokument zurück, die mit selector übereinstimmen. |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | Entfernt den durch oldChild angegebenen untergeordneten Knoten aus der Liste der untergeordneten Elemente und gibt ihn zurück. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | Diese Methode ermöglicht das Entfernen von Ereignis-Listenern aus dem Ereignisziel. Wenn an[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) wird aus einem entfernt[`EventTarget`](../eventtarget) während es ein Ereignis verarbeitet, wird es nicht durch die aktuellen Aktionen ausgelöst. Ereignis-Listener können nie aufgerufen werden, nachdem sie entfernt wurden. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | Diese Methode ermöglicht das Entfernen von Ereignis-Listenern aus dem Ereignisziel. Wenn an[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) wird aus einem entfernt[`EventTarget`](../eventtarget) während es ein Ereignis verarbeitet, wird es nicht durch die aktuellen Aktionen ausgelöst. Ereignis-Listener können nie aufgerufen werden, nachdem sie entfernt wurden. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | Diese Methode ermöglicht das Entfernen von Ereignis-Listenern aus dem Ereignisziel. Wenn an[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) wird aus einem entfernt[`EventTarget`](../eventtarget) während es ein Ereignis verarbeitet, wird es nicht durch die aktuellen Aktionen ausgelöst. Ereignis-Listener können nie aufgerufen werden, nachdem sie entfernt wurden. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto)(IDevice) | Diese Methode wird verwendet, um den Inhalt des aktuellen Dokuments auf einem bestimmten Grafikgerät darzustellen. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | Ersetzt den untergeordneten Knoten oldChild durch newChild in der Liste der untergeordneten Elemente und gibt den oldChild-Knoten zurück. Wenn newChild ein DocumentFragment-Objekt ist, wird oldChild durch alle DocumentFragment-Kinder ersetzt, die in derselben Reihenfolge eingefügt werden. Wenn das newChild bereits im Baum vorhanden ist, wird es zuerst entfernt. |
| override [ToString](../../aspose.svg.dom/node/tostring)() | Gibt a zurückString die diese Instanz darstellt. |
| [Write](../../aspose.svg.dom/document/write)(params string[]) | Schreibt eine Textzeichenfolge in einen Dokumentenstrom, der von open() geöffnet wurde. Beachten Sie, dass die Funktion ein Dokument erzeugt, das nicht unbedingt von einer DTD gesteuert wird und daher möglicherweise ein ungültiges Ergebnis im Kontext des Dokuments erzeugt. |
| [WriteLn](../../aspose.svg.dom/document/writeln)(params string[]) | Schreibt eine Textzeichenfolge gefolgt von einem Zeilenumbruchzeichen in einen document -Stream, der durch open() geöffnet wurde. Beachten Sie, dass die Funktion ein Dokument erzeugt, das nicht unbedingt von einer DTD gesteuert wird, und daher möglicherweise ein ungültiges Ergebnis im Kontext des -Dokuments erzeugt. |

### Siehe auch

* class [Node](../node)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal)
* interface [IGlobalEventHandlers](../iglobaleventhandlers)
* interface [INonElementParentNode](../inonelementparentnode)
* interface [IParentNode](../iparentnode)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator)
* namensraum [Aspose.Svg.Dom](../../aspose.svg.dom)
* Montage [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
