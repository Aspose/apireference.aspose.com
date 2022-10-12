---
title: Document
second_title: Riferimento API Aspose.SVG per .NET
description: Il documento rappresenta lintero documento HTML XML o SVG. Concettualmente è la radice dellalbero del documento e fornisce laccesso principale ai dati del documento.
type: docs
weight: 810
url: /it/net/aspose.svg.dom/document/
---
## Document class

Il documento rappresenta l'intero documento HTML, XML o SVG. Concettualmente, è la radice dell'albero del documento e fornisce l'accesso principale ai dati del documento.

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | Una NamedNodeMap contenente gli attributi di questo nodo (se è un elemento) o null in caso contrario. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri) { get; } | L'URI di base assoluto di questo nodo o null se l'implementazione non è stata in grado di ottenere un URI assoluto. |
| [CharacterSet](../../aspose.svg.dom/document/characterset) { get; } | Ottiene la codifica del documento. |
| [Charset](../../aspose.svg.dom/document/charset) { get; } | Ottiene la codifica del documento. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount) { get; } | Restituisce il numero corrente di nodi elemento che sono figli di questo elemento. 0 se questo elemento non ha nodi figlio di nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | Un NodeList che contiene tutti i figli di questo nodo. Se non ci sono figli, questa è una NodeList che non contiene nodi.. |
| [Children](../../aspose.svg.dom/document/children) { get; } | Restituisce gli elementi figlio. |
| [ContentType](../../aspose.svg.dom/document/contenttype) { get; } | Ottiene il tipo di contenuto del documento. |
| [Context](../../aspose.svg.dom/document/context) { get; } | Ottiene il contesto di navigazione corrente. |
| [DefaultView](../../aspose.svg.dom/document/defaultview) { get; } | L'attributo IDL defaultView dell'interfaccia del documento, al momento della ricezione, deve restituire l'oggetto WindowProxy del contesto di navigazione di questo documento, se questo documento ha un contesto di navigazione associato, o null in caso contrario. |
| [Doctype](../../aspose.svg.dom/document/doctype) { get; } | La dichiarazione del tipo di documento associata a questo documento. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement) { get; } | Questo è un attributo di convenienza che consente l'accesso diretto al nodo figlio che è l'elemento del documento del documento. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi) { get; } | Il percorso del documento o null se non definito o se il documento è stato creato utilizzando DOMImplementation.createDocument. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | Il primo figlio di questo nodo. Se non esiste un tale nodo, restituisce null. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild) { get; } | Restituisce il primo nodo dell'elemento figlio di questo elemento. null se questo elemento non ha elementi figlio. |
| [Implementation](../../aspose.svg.dom/document/implementation) { get; } | L'oggetto DOMImplementation che gestisce questo documento. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding) { get; } | Ottiene la codifica del documento. |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | L'ultimo figlio di questo nodo. Se non esiste un tale nodo, restituisce null. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild) { get; } | Restituisce l'ultimo nodo dell'elemento figlio di questo elemento. null se questo elemento non ha elementi figlio. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | Restituisce la parte locale del nome qualificato di questo nodo. Per nodi di qualsiasi tipo diverso da ELEMENT_NODE e ATTRIBUTE_NODE e nodi creati con un metodo DOM di livello 1, come Document.createElement(), questo è sempre null. |
| [Location](../../aspose.svg.dom/document/location) { get; } | La posizione del documento. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | L'URI dello spazio dei nomi di questo nodo o null se non è specificato. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling) { get; } | Restituisce il nodo dell'elemento di pari livello successivo di questo elemento. null se questo elemento non ha nodi di pari livello che vengono dopo questo nell'albero del documento. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | Il nodo immediatamente successivo a questo nodo. Se non esiste un tale nodo, restituisce null. |
| override [NodeName](../../aspose.svg.dom/document/nodename) { get; } | Il nome di questo nodo, a seconda del tipo. |
| override [NodeType](../../aspose.svg.dom/document/nodetype) { get; } | Un codice che rappresenta il tipo dell'oggetto sottostante. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | Il valore di questo nodo, a seconda del tipo. |
| [Origin](../../aspose.svg.dom/document/origin) { get; } | Ottiene l'origine del documento. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument) { get; } | Ottiene il documento proprietario. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | Ottiene il genitore[`Element`](../element) di questo nodo. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | Il genitore di questo nodo. Tutti i nodi, ad eccezione di Attr, Document, DocumentFragment, Entity e Notation, possono avere un padre. Tuttavia, se un nodo è stato appena creato e non è ancora stato aggiunto all'albero, o se è stato rimosso dall'albero, questo è nullo. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | Il prefisso dello spazio dei nomi di questo nodo o null se non è specificato. Quando è definito come null, l'impostazione non ha effetto |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling) { get; } | Restituisce il nodo dell'elemento di pari livello precedente di questo elemento. null se questo elemento non ha nodi di pari livello che precedono questo nell'albero del documento. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | Il nodo immediatamente precedente a questo nodo. Se non esiste un tale nodo, restituisce null. |
| [ReadyState](../../aspose.svg.dom/document/readystate) { get; } | Restituisce la disponibilità del documento. Il "caricamento" durante il caricamento del documento, "interattivo" una volta terminata l'analisi ma ancora caricando le sottorisorse e "completato" una volta caricato. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking) { get; set; } | Un attributo che specifica se il controllo degli errori è applicato o meno. Se impostata su false, l'implementazione è libera di non testare tutti i possibili casi di errore normalmente definiti nelle operazioni DOM e di non generare alcuna DOMException sulle operazioni DOM o di segnalare errori durante l'utilizzo di Document.normalizeDocument(). In caso di errore, il comportamento è indefinito. Questo attributo è true per impostazione predefinita. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets) { get; } | Un elenco contenente tutti i fogli di stile esplicitamente collegati o incorporati in un documento. Per i documenti HTML, questo include i fogli di stile esterni, inclusi tramite l'elemento HTML LINK, e gli elementi STYLE inline. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent) { get; set; } | Questo attributo restituisce il contenuto di testo di questo nodo e dei suoi discendenti. Quando è definito null, l'impostazione non ha alcun effetto. Al momento dell'impostazione, tutti i possibili figli di questo nodo vengono rimossi e, se la nuova stringa non è vuota o nulla, viene sostituita da un singolo nodo di testo contenente la stringa su cui è impostato questo attributo. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone) { get; set; } | Un attributo che specifica, come parte della dichiarazione XML, se questo documento è autonomo. Questo è falso se non specificato. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion) { get; set; } | Un attributo che specifica, come parte della dichiarazione XML, il numero di versione di questo documento. Se non c'è alcuna dichiarazione e se questo documento supporta la funzione "XML", il valore è "1.0". Se questo documento non supporta la funzione "XML", il valore è sempre null. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | Questo metodo consente la registrazione di listener di eventi sulla destinazione dell'evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | Questo metodo consente la registrazione di listener di eventi sulla destinazione dell'evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | Questo metodo consente la registrazione di listener di eventi sulla destinazione dell'evento. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | Aggiunge il nodo newChild alla fine dell'elenco dei figli di questo nodo. Se il nuovoChild è già nell'albero, viene prima rimosso. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | Restituisce un duplicato di questo nodo, cioè funge da costruttore di copia generico per i nodi. Il nodo duplicato non ha padre (parentNode è null) e nessun dato utente. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | Restituisce un duplicato di questo nodo, cioè funge da costruttore di copia generico per i nodi. Il nodo duplicato non ha padre (parentNode è null) e nessun dato utente. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute)(string) | Crea un Attr con il nome dato. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens)(string, string) | Crea un attributo del nome qualificato e dell'URI dello spazio dei nomi specificato. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection)(string) | Crea un nodo CDATASection il cui valore è la stringa specificata. |
| [CreateComment](../../aspose.svg.dom/document/createcomment)(string) | Crea un nodo Commento data la stringa specificata. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment)() | Crea un oggetto DocumentFragment vuoto. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype)(string, string, string, string) | Crea un nodo DocumentType. |
| [CreateElement](../../aspose.svg.dom/document/createelement)(string) | Crea un elemento del tipo specificato. Si noti che l'istanza restituita implementa l'interfaccia Element, quindi gli attributi possono essere specificati direttamente sull'oggetto restituito. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns)(string, string) | Crea un elemento del nome qualificato e dell'URI dello spazio dei nomi specificato. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference)(string) | Crea un oggetto EntityReference. Inoltre, se l'entità di riferimento è nota, l'elenco figlio del nodo EntityReference è uguale a quello del nodo Entity corrispondente. |
| [CreateEvent](../../aspose.svg.dom/document/createevent)(string) | Crea un[`Event`](../../aspose.svg.dom.events/event) di un tipo supportato dall'implementazione. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression)(string, IXPathNSResolver) | Crea un'espressione XPath analizzata con spazi dei nomi risolti. Ciò è utile quando un'espressione verrà riutilizzata in un'applicazione poiché consente di compilare la stringa dell'espressione in una forma interna più efficiente e prerisolvere tutti i prefissi dello spazio dei nomi che si verificano all'interno dell'espressione. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator)(Node) | Crea un nuovo NodeIterator sulla sottostruttura radicata nel nodo specificato . |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator_1)(Node, long) | Crea un nuovo NodeIterator sulla sottostruttura radicata nel nodo specificato . |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator#createnodeiterator_2)(Node, long, INodeFilter) | Crea un nuovo NodeIterator sulla sottostruttura radicata nel nodo specificato . |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver)(Node) | Adatta qualsiasi nodo DOM per risolvere gli spazi dei nomi in modo che un'espressione XPath possa essere facilmente valutata rispetto al contesto del nodo in cui è apparsa all'interno del documento. Questo adattatore funziona come il metodo DOM Level 3`lookupNamespaceURI` sui nodi nella risoluzione del namespaceURI da un dato prefisso utilizzando le informazioni correnti disponibili nella gerarchia del nodo al momento in cui viene chiamato lookupNamespaceURI , risolvendo correttamente anche il prefisso xml implicito. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction)(string, string) | Crea un nodo ProcessingInstruction in base al nome e alle stringhe di dati specificati. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode)(string) | Crea un nodo di testo data la stringa specificata. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker)(Node) | Crea un nuovo TreeWalker sul sottoalbero radicato nel nodo specificato . |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker_1)(Node, long) | Crea un nuovo TreeWalker sul sottoalbero radicato nel nodo specificato . |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker#createtreewalker_2)(Node, long, INodeFilter) | Crea un nuovo TreeWalker sul sottoalbero radicato nel nodo specificato . |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | Questo metodo consente l'invio di eventi nel modello di eventi di implementazione. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | Esegue attività definite dall'applicazione associate alla liberazione, al rilascio o al ripristino di risorse non gestite. |
| [Evaluate](../../aspose.svg.dom/document/evaluate)(string, Node, IXPathNSResolver, XPathResultType, object) | Valuta una stringa di espressione XPath e, se possibile, restituisce un risultato del tipo specificato. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid)(string) | Restituisce l'elemento che ha un attributo ID con il valore specificato. Se tale elemento non esiste, restituisce null. Se più di un elemento ha un attributo ID con quel valore, ciò che viene restituito non è definito. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname)(string) | Restituisce un oggetto NodeList attivo contenente tutti gli elementi nel documento che hanno tutte le classi specificate in argument. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname)(string) | Restituisce una NodeList di tutti gli elementi nell'ordine del documento con un determinato nome di tag e sono contenuti nel documento. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens)(string, string) | Restituisce una NodeList di tutti gli elementi con un determinato nome locale e URI dello spazio dei nomi nell'ordine del documento. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | Restituisce se questo nodo (se è un elemento) ha attributi |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | Restituisce se questo nodo ha figli. |
| [ImportNode](../../aspose.svg.dom/document/importnode)(Node, bool) | Importa un nodo da un altro documento in questo documento, senza alterare o rimuovere il nodo sorgente dal documento originale; questo metodo crea una nuova copia del nodo di origine. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | Inserisce il nodo prima del nodo figlio esistente. Se child è null, inserisci il nodo alla fine dell'elenco dei figli. Se child è un oggetto DocumentFragment, tutti i suoi figli vengono inseriti, nello stesso ordine, prima di child. Se il bambino è già nell'albero, viene prima rimosso. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | Questo metodo controlla se il namespaceURI specificato è lo spazio dei nomi predefinito o meno. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | Verifica se due nodi sono uguali. Questo metodo verifica l'uguaglianza dei nodi, non l'identità (cioè, se i due nodi sono riferimenti allo stesso oggetto) che può essere verificata con Node.isSameNode(). Anche tutti i nodi uguali saranno uguali, anche se potrebbe non essere vero il contrario. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | Restituisce se questo nodo è lo stesso nodo di quello dato. Questo metodo fornisce un modo per determinare se due riferimenti al nodo restituiti dall'implementazione fanno riferimento allo stesso oggetto. Quando due riferimenti Node sono riferimenti allo stesso oggetto, anche se tramite un proxy, i riferimenti possono essere utilizzati in modo completamente intercambiabile, in modo tale che tutti gli attributi abbiano gli stessi valori e chiamare lo stesso metodo DOM su entrambi i riferimenti ha sempre esattamente lo stesso effetto. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | Cerca l'URI dello spazio dei nomi associato al prefisso dato, partendo da questo nodo. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | Cerca il prefisso associato all'URI dello spazio dei nomi specificato, partendo da questo nodo. Le dichiarazioni dello spazio dei nomi predefinito vengono ignorate da questo metodo. Vedere Ricerca prefisso spazio dei nomi per i dettagli sull'algoritmo utilizzato da questo metodo. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate)(RequestMessage) | Carica il documento in base all'oggetto richiesta specificato, sostituendo il contenuto precedente. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_4)(string) | Carica il documento in corrispondenza dell'URL (Uniform Resource Locator) specificato nell'istanza corrente, sostituendo il contenuto precedente. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_1)(Url) | Carica il documento in corrispondenza dell'URL (Uniform Resource Locator) specificato nell'istanza corrente, sostituendo il contenuto precedente. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_3)(Stream, string) | Carica il documento dal contenuto specificato e utilizzando baseUri per risolvere le risorse relative, sostituendo il contenuto precedente. Il caricamento del documento inizia dalla posizione corrente nello stream. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_2)(Stream, Url) | Carica il documento dal contenuto specificato e utilizzando baseUri per risolvere le risorse relative, sostituendo il contenuto precedente. Il caricamento del documento inizia dalla posizione corrente nello stream. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_6)(string, string) | Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le risorse relative, sostituendo il contenuto precedente. |
| [Navigate](../../aspose.svg.dom/document/navigate#navigate_5)(string, Url) | Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le risorse relative, sostituendo il contenuto precedente. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | Inserisce tutti i nodi di testo nell'intera profondità del sottoalbero sotto questo nodo, inclusi i nodi di attributo, in una forma "normale" in cui solo la struttura (ad es. elementi, commenti, istruzioni di elaborazione, sezioni CDATA e riferimenti a entità) separa il testo nodi, cioè non ci sono né nodi di testo adiacenti né nodi di testo vuoti. Questo può essere utilizzato per garantire che la visualizzazione DOM di un documento sia la stessa di se fosse stato salvato e ricaricato ed è utile quando le operazioni (come le ricerche di XPointer [XPointer]) che dipendono da una particolare struttura ad albero del documento devono essere utilizzato. Se il parametro "normalize-characters" dell'oggetto DOMConfiguration allegato a Node.ownerDocument è true, questo metodo normalizzerà completamente anche i caratteri dei nodi Text. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector)(string) | Restituisce il primo elemento nel documento, che corrisponde al selettore |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall)(string) | Restituisce una NodeList di tutti gli elementi nel documento, che corrispondono a selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | Rimuove il nodo figlio indicato da oldChild dall'elenco dei figli e lo restituisce. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | Questo metodo consente la rimozione di listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) viene rimosso da un[`EventTarget`](../eventtarget) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | Questo metodo consente la rimozione di listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) viene rimosso da un[`EventTarget`](../eventtarget) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | Questo metodo consente la rimozione di listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) viene rimosso da un[`EventTarget`](../eventtarget) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto)(IDevice) | Questo metodo viene utilizzato per eseguire il rendering del contenuto del documento corrente su un dispositivo grafico specificato. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | Sostituisce il nodo figlio oldChild con newChild nell'elenco dei figli e restituisce il nodo oldChild. Se newChild è un oggetto DocumentFragment, oldChild viene sostituito da tutti i figli DocumentFragment, che vengono inseriti nello stesso ordine. Se il nuovoChild è già nell'albero, viene prima rimosso. |
| override [ToString](../../aspose.svg.dom/node/tostring)() | Restituisce aString che rappresenta questa istanza. |
| [Write](../../aspose.svg.dom/document/write)(params string[]) | Scrive una stringa di testo in un flusso di documenti aperto da open(). Nota che la funzione produrrà un documento che non è necessariamente guidato da un DTD e quindi potrebbe essere produrre un risultato non valido nel contesto del documento. |
| [WriteLn](../../aspose.svg.dom/document/writeln)(params string[]) | Scrive una stringa di testo seguita da un carattere di nuova riga in un flusso document aperto da open(). Si noti che la funzione produrrà un documento che non è necessariamente guidato da un DTD e pertanto potrebbe produrre un risultato non valido nel contesto del documento |

### Guarda anche

* class [Node](../node)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal)
* interface [IGlobalEventHandlers](../iglobaleventhandlers)
* interface [INonElementParentNode](../inonelementparentnode)
* interface [IParentNode](../iparentnode)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator)
* spazio dei nomi [Aspose.Svg.Dom](../../aspose.svg.dom)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
