---
title: Class Document
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Dom.Document classe. Il documento rappresenta lintero documento HTML XML o SVG. Concettualmente è la radice dellalbero del documento e fornisce laccesso principale ai dati del documento.
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
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | Una NamedNodeMap contenente gli attributi di questo nodo (se è un elemento) o null in caso contrario. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri/) { get; } | L'URI di base assoluto di questo nodo o null se l'implementazione non è stata in grado di ottenere un URI assoluto. |
| [CharacterSet](../../aspose.svg.dom/document/characterset/) { get; } | Ottiene la codifica del documento. |
| [Charset](../../aspose.svg.dom/document/charset/) { get; } | Ottiene la codifica del documento. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount/) { get; } | Restituisce il numero corrente di nodi elemento che sono figli di questo elemento. 0 se questo elemento non ha nodi figli di nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Un NodeList che contiene tutti i figli di questo nodo. Se non ci sono figli, questo è un NodeList che non contiene nodi.. |
| [Children](../../aspose.svg.dom/document/children/) { get; } | Restituisce gli elementi figli. |
| [ContentType](../../aspose.svg.dom/document/contenttype/) { get; } | Ottiene il tipo di contenuto del documento. |
| [Context](../../aspose.svg.dom/document/context/) { get; } | Ottiene il contesto di navigazione corrente. |
| [DefaultView](../../aspose.svg.dom/document/defaultview/) { get; } | L'attributo defaultView IDL dell'interfaccia del documento, quando viene ottenuto, deve restituire l'oggetto WindowProxy del contesto di esplorazione di questo documento, se questo documento ha un contesto di esplorazione associato o null in caso contrario. |
| [Doctype](../../aspose.svg.dom/document/doctype/) { get; } | La dichiarazione del tipo di documento associata a questo documento. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement/) { get; } | Questo è un attributo di convenienza che consente l'accesso diretto al nodo figlio che è l'elemento documento del documento. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi/) { get; } | La posizione del documento o null se non definito o se il documento è stato creato utilizzando DOMImplementation.createDocument. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Il primo figlio di questo nodo. Se non esiste tale nodo, questo restituisce null. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild/) { get; } | Restituisce il primo nodo dell'elemento figlio di questo elemento. null se questo elemento non ha elementi figlio. |
| [Implementation](../../aspose.svg.dom/document/implementation/) { get; } | L'oggetto DOMImplementation che gestisce questo documento. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding/) { get; } | Ottiene la codifica del documento. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | L'ultimo figlio di questo nodo. Se non esiste tale nodo, questo restituisce null. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild/) { get; } | Restituisce l'ultimo nodo dell'elemento figlio di questo elemento. null se questo elemento non ha elementi figlio. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Restituisce la parte locale del nome completo di questo nodo. Per i nodi di qualsiasi tipo diverso da ELEMENT_NODE e ATTRIBUTE_NODE e per i nodi creati con un metodo DOM di livello 1, come Document.createElement(), è sempre null. |
| [Location](../../aspose.svg.dom/document/location/) { get; } | La posizione del documento. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | L'URI dello spazio dei nomi di questo nodo o null se non è specificato. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling/) { get; } | Restituisce il successivo nodo dell'elemento di pari livello di questo elemento. null se questo elemento non ha nodi di pari livello che vengono dopo questo nell'albero del documento. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Il nodo immediatamente successivo a questo nodo. Se non esiste tale nodo, questo restituisce null. |
| override [NodeName](../../aspose.svg.dom/document/nodename/) { get; } | Il nome di questo nodo, a seconda del suo tipo. |
| override [NodeType](../../aspose.svg.dom/document/nodetype/) { get; } | Un codice che rappresenta il tipo dell'oggetto sottostante. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Il valore di questo nodo, a seconda del suo tipo. |
| [Origin](../../aspose.svg.dom/document/origin/) { get; } | Ottiene l'origine del documento. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument/) { get; } | Ottiene il documento proprietario. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Ottiene il genitore[`Element`](../element/) di questo nodo. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Il padre di questo nodo. Tutti i nodi, eccetto Attr, Document, DocumentFragment, Entity e Notation possono avere un genitore. Tuttavia, se un nodo è stato appena creato e non ancora aggiunto all'albero, o se è stato rimosso dall'albero, questo è nullo. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | Il prefisso dello spazio dei nomi di questo nodo o null se non è specificato. Quando è definito nullo, impostarlo non ha effetto |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling/) { get; } | Restituisce il precedente nodo dell'elemento di pari livello di questo elemento. null se questo elemento non ha nodi di pari livello che precedono questo nell'albero del documento. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Il nodo immediatamente precedente a questo nodo. Se non esiste tale nodo, questo restituisce null. |
| [ReadyState](../../aspose.svg.dom/document/readystate/) { get; } | Restituisce la disponibilità del documento. Il "caricamento" durante il caricamento del documento, "interattivo" una volta terminata l'analisi ma ancora il caricamento delle risorse secondarie e "completo" una volta caricato. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking/) { get; set; } | Un attributo che specifica se il controllo degli errori è applicato o meno. Quando è impostata su false, l'implementazione è libera di non testare ogni possibile caso di errore normalmente definito sulle operazioni DOM e di non generare alcuna DOMException sulle operazioni DOM o di segnalare errori durante l'utilizzo di Document.normalizeDocument(). In caso di errore, il comportamento è indefinito. Questo attributo è true per impostazione predefinita. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets/) { get; } | Un elenco contenente tutti i fogli di stile esplicitamente collegati o incorporati in un documento. Per i documenti HTML, questo include i fogli di stile esterni, inclusi tramite l'elemento HTML LINK, e gli elementi STYLE incorporati. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | Questo attributo restituisce il contenuto testuale di questo nodo e dei suoi discendenti. Quando è definito nullo, impostarlo non ha alcun effetto. Al momento dell'impostazione, tutti i possibili figli che questo nodo può avere vengono rimossi e, se la nuova stringa non è vuota o nulla, sostituita da un singolo nodo di testo contenente la stringa su cui è impostato questo attributo. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone/) { get; set; } | Un attributo che specifica, come parte della dichiarazione XML, se questo documento è autonomo. Questo è falso quando non specificato. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion/) { get; set; } | Un attributo che specifica, come parte della dichiarazione XML, il numero di versione di questo documento. Se non c'è alcuna dichiarazione e se questo documento supporta la funzione "XML", il valore è "1.0". Se questo documento non supporta la funzionalità "XML", il valore è sempre null. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Questo metodo consente la registrazione dei listener di eventi sul target dell'evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Questo metodo consente la registrazione dei listener di eventi sul target dell'evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Questo metodo consente la registrazione dei listener di eventi sul target dell'evento. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Aggiunge il nodo newChild alla fine dell'elenco dei figli di questo nodo. Se il newChild è già nell'albero, viene prima rimosso. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Restituisce un duplicato di questo nodo, ovvero funge da costruttore di copie generico per i nodi. Il nodo duplicato non ha un genitore (parentNode è nullo) e nessun dato utente. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Restituisce un duplicato di questo nodo, ovvero funge da costruttore di copie generico per i nodi. Il nodo duplicato non ha un genitore (parentNode è nullo) e nessun dato utente. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute/)(string) | Crea un Attr con il nome dato. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens/)(string, string) | Crea un attributo del nome completo e dell'URI dello spazio dei nomi forniti. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection/)(string) | Crea un nodo CDATASection il cui valore è la stringa specificata. |
| [CreateComment](../../aspose.svg.dom/document/createcomment/)(string) | Crea un nodo Comment data la stringa specificata. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment/)() | Crea un oggetto DocumentFragment vuoto. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype/)(string, string, string, string) | Crea un nodo DocumentType. |
| [CreateElement](../../aspose.svg.dom/document/createelement/)(string) | Crea un elemento del tipo specificato. Si noti che l'istanza restituita implementa l'interfaccia Element, quindi gli attributi possono essere specificati direttamente sull'oggetto restituito. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns/)(string, string) | Crea un elemento del nome completo e dell'URI dello spazio dei nomi forniti. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference/)(string) | Crea un oggetto EntityReference. Inoltre, se l'entità referenziata è nota, l'elenco figlio del nodo EntityReference viene reso uguale a quello del nodo Entity corrispondente. |
| [CreateEvent](../../aspose.svg.dom/document/createevent/)(string) | Crea un file[`Event`](../../aspose.svg.dom.events/event/) di un tipo supportato dall'implementazione. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression/)(string, IXPathNSResolver) | Crea un'espressione XPath analizzata con spazi dei nomi risolti. Questo è utile quando un'espressione verrà riutilizzata in un'applicazione poiché rende possibile compilare la stringa dell'espressione in un formato interno più efficiente e pre-risolvere tutti i prefissi dello spazio dei nomi che ricorrono all'interno dell'espressione. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator)(Node) | Crea un nuovo NodeIterator sulla sottostruttura radicata nel nodo specificato. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_1)(Node, long) | Crea un nuovo NodeIterator sulla sottostruttura radicata nel nodo specificato. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_2)(Node, long, INodeFilter) | Crea un nuovo NodeIterator sulla sottostruttura radicata nel nodo specificato. |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver/)(Node) | Adatta qualsiasi nodo DOM per risolvere gli spazi dei nomi in modo che un'espressione XPath possa essere facilmente valutata rispetto al contesto del nodo in cui è apparsa all'interno del documento. Questo adattatore funziona come il metodo DOM Level 3`lookupNamespaceURI` sui nodi nel risolvere il namespaceURI da un dato prefisso utilizzando le informazioni correnti disponibili nella gerarchia del nodo al momento viene chiamato lookupNamespaceURI, risolvendo anche correttamente il prefisso xml implicito. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction/)(string, string) | Crea un nodo ProcessingInstruction con il nome e le stringhe di dati specificati. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode/)(string) | Crea un nodo di testo data la stringa specificata. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker)(Node) | Crea un nuovo TreeWalker sul sottoalbero radicato nel nodo specificato. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_1)(Node, long) | Crea un nuovo TreeWalker sul sottoalbero radicato nel nodo specificato. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_2)(Node, long, INodeFilter) | Crea un nuovo TreeWalker sul sottoalbero radicato nel nodo specificato. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Questo metodo consente l'invio di eventi nel modello di eventi delle implementazioni. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Esegue attività definite dall'applicazione associate alla liberazione, al rilascio o al ripristino di risorse non gestite. |
| [Evaluate](../../aspose.svg.dom/document/evaluate/)(string, Node, IXPathNSResolver, XPathResultType, object) | Valuta una stringa di espressione XPath e, se possibile, restituisce un risultato del tipo specificato. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid/)(string) | Restituisce l'elemento che ha un attributo ID con il valore specificato. Se tale elemento non esiste, questo restituisce null. Se più di un elemento ha un attributo ID con quel valore, ciò che viene restituito è indefinito. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname/)(string) | Restituisce un oggetto NodeList attivo contenente tutti gli elementi nel documento che hanno tutte le classi specificate nell'argomento. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname/)(string) | Restituisce una NodeList di tutti gli elementi in ordine di documento con un dato nome di tag e sono contenuti nel documento. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens/)(string, string) | Restituisce un NodeList di tutti gli elementi con un dato nome locale e URI dello spazio dei nomi nell'ordine del documento. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | Restituisce se questo nodo (se è un elemento) ha attributi |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Restituisce se questo nodo ha figli. |
| [ImportNode](../../aspose.svg.dom/document/importnode/)(Node, bool) | Importa un nodo da un altro documento in questo documento, senza alterare o rimuovere il nodo sorgente dal documento originale; questo metodo crea una nuova copia del nodo sorgente. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Inserisce il nodo prima del nodo figlio esistente figlio. Se child è null, inserisci il nodo alla fine dell'elenco dei child. Se child è un oggetto DocumentFragment, tutti i suoi child vengono inseriti, nello stesso ordine, prima di child. Se il figlio è già nell'albero, viene prima rimosso. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Questo metodo verifica se il namespaceURI specificato è lo spazio dei nomi predefinito o meno. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Verifica se due nodi sono uguali. Questo metodo verifica l'uguaglianza dei nodi, non l'uguaglianza (ovvero, se i due nodi sono riferimenti allo stesso oggetto) che possono essere verificati con Node.isSameNode(). Anche tutti i nodi uguali saranno uguali, anche se il contrario potrebbe non essere vero. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Restituisce se questo nodo è lo stesso nodo di quello dato. Questo metodo fornisce un modo per determinare se due riferimenti Node restituiti dall'implementazione fanno riferimento allo stesso oggetto. Quando due riferimenti Node sono riferimenti allo stesso oggetto, anche se tramite un proxy, i riferimenti possono essere utilizzati in modo completamente intercambiabile, in modo tale che tutti gli attributi abbiano gli stessi valori e chiamare lo stesso metodo DOM su entrambi i riferimenti ha sempre esattamente lo stesso effetto. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Cerca l'URI dello spazio dei nomi associato al prefisso dato, a partire da questo nodo. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Cerca il prefisso associato all'URI del namespace dato, a partire da questo nodo. Le dichiarazioni predefinite dello spazio dei nomi vengono ignorate da questo metodo. Vedere Ricerca prefisso nello spazio dei nomi per i dettagli sull'algoritmo utilizzato da questo metodo. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate)(RequestMessage) | Carica il documento in base all'oggetto di richiesta specificato, sostituendo il contenuto precedente. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_4)(string) | Carica il documento all'URL (Uniform Resource Locator) specificato nell'istanza corrente, sostituendo il contenuto precedente. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_1)(Url) | Carica il documento all'URL (Uniform Resource Locator) specificato nell'istanza corrente, sostituendo il contenuto precedente. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_3)(Stream, string) | Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le risorse relative, sostituendo il contenuto precedente. Il caricamento del documento inizia dalla posizione corrente nello stream. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_2)(Stream, Url) | Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le risorse relative, sostituendo il contenuto precedente. Il caricamento del documento inizia dalla posizione corrente nello stream. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_6)(string, string) | Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le relative risorse, sostituendo il contenuto precedente. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_5)(string, Url) | Carica il documento dal contenuto specificato e utilizza baseUri per risolvere le relative risorse, sostituendo il contenuto precedente. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Mette tutti i nodi di testo nell'intera profondità del sottoalbero sotto questo nodo, inclusi i nodi di attributo, in una forma "normale" in cui solo la struttura (ad es. elementi, commenti, istruzioni di elaborazione, sezioni CDATA e riferimenti di entità) separa il testo nodi, cioè non ci sono né nodi di testo adiacenti né nodi di testo vuoti. Questo può essere utilizzato per garantire che la vista DOM di un documento sia la stessa di se fosse stato salvato e ricaricato, ed è utile quando le operazioni (come le ricerche XPointer [XPointer]) che dipendono da una particolare struttura ad albero del documento devono essere usato. Se il parametro "normalize-characters" dell'oggetto DOMConfiguration allegato al Node.ownerDocument è vero, questo metodo normalizzerà completamente anche i caratteri dei nodi Text. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector/)(string) | Restituisce il primo elemento nel documento, che corrisponde a selector |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall/)(string) | Restituisce un NodeList di tutti gli elementi nel documento, che corrispondono a selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Rimuove il nodo figlio indicato da oldChild dalla lista dei figli, e lo restituisce. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Questo metodo consente la rimozione dei listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) viene rimosso da un[`EventTarget`](../eventtarget/) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Questo metodo consente la rimozione dei listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) viene rimosso da un[`EventTarget`](../eventtarget/) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Questo metodo consente la rimozione dei listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) viene rimosso da un[`EventTarget`](../eventtarget/) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto/)(IDevice) | Questo metodo viene utilizzato per eseguire il rendering del contenuto del documento corrente su un dispositivo grafico specificato. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Sostituisce il nodo figlio oldChild con newChild nell'elenco dei figli e restituisce il nodo oldChild. Se newChild è un oggetto DocumentFragment, oldChild viene sostituito da tutti i figli DocumentFragment, che vengono inseriti nello stesso ordine. Se il newChild è già nell'albero, viene prima rimosso. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Restituisce aString che rappresenta questa istanza. |
| [Write](../../aspose.svg.dom/document/write/)(params string[]) | Scrive una stringa di testo in un flusso di documenti aperto da open(). Si noti che la funzione produrrà un documento che non è necessariamente guidato da un DTD e pertanto potrebbe produrre un risultato non valido nel contesto del documento. |
| [WriteLn](../../aspose.svg.dom/document/writeln/)(params string[]) | Scrive una stringa di testo seguita da un carattere di nuova riga in un flusso document aperto da open(). Si noti che la funzione produrrà un documento che non è necessariamente guidato da un DTD e pertanto potrebbe produrre un risultato non valido nel contesto del document |

## Eventi

| Nome | Descrizione |
| --- | --- |
| event [OnAbort](../../aspose.svg.dom/document/onabort/) | Ottiene o imposta il gestore eventi per l'evento OnAbort. |
| event [OnBlur](../../aspose.svg.dom/document/onblur/) | Ottiene o imposta il gestore eventi per l'evento OnBlur. |
| event [OnCancel](../../aspose.svg.dom/document/oncancel/) | Ottiene o imposta il gestore eventi per l'evento OnCancel. |
| event [OnCanplay](../../aspose.svg.dom/document/oncanplay/) | Ottiene o imposta il gestore eventi per l'evento OnCanplay. |
| event [OnCanPlayThrough](../../aspose.svg.dom/document/oncanplaythrough/) | Ottiene o imposta il gestore eventi per l'evento OnCanPlayThrough. |
| event [OnChange](../../aspose.svg.dom/document/onchange/) | Ottiene o imposta il gestore eventi per l'evento OnChange. |
| event [OnClick](../../aspose.svg.dom/document/onclick/) | Ottiene o imposta il gestore eventi per l'evento OnClick. |
| event [OnCueChange](../../aspose.svg.dom/document/oncuechange/) | Ottiene o imposta il gestore eventi per l'evento OnCueChange. |
| event [OnDblClick](../../aspose.svg.dom/document/ondblclick/) | Ottiene o imposta il gestore eventi per l'evento OnDblClick. |
| event [OnDurationChange](../../aspose.svg.dom/document/ondurationchange/) | Ottiene o imposta il gestore eventi per l'evento OnDurationChange. |
| event [OnEmptied](../../aspose.svg.dom/document/onemptied/) | Ottiene o imposta il gestore eventi per l'evento OnEmptied. |
| event [OnEnded](../../aspose.svg.dom/document/onended/) | Ottiene o imposta il gestore eventi per l'evento OnEnded. |
| event [OnError](../../aspose.svg.dom/document/onerror/) | Ottiene o imposta il gestore eventi per l'evento OnError. |
| event [OnFocus](../../aspose.svg.dom/document/onfocus/) | Ottiene o imposta il gestore eventi per l'evento OnFocus. |
| event [OnInput](../../aspose.svg.dom/document/oninput/) | Ottiene o imposta il gestore eventi per l'evento OnInput. |
| event [OnInvalid](../../aspose.svg.dom/document/oninvalid/) | Ottiene o imposta il gestore eventi per l'evento OnInvalid. |
| event [OnKeyDown](../../aspose.svg.dom/document/onkeydown/) | Ottiene o imposta il gestore eventi per l'evento OnKeyDown. |
| event [OnKeyPress](../../aspose.svg.dom/document/onkeypress/) | Ottiene o imposta il gestore eventi per l'evento OnKeyPress. |
| event [OnKeyUp](../../aspose.svg.dom/document/onkeyup/) | Ottiene o imposta il gestore eventi per l'evento OnKeyUp. |
| event [OnLoad](../../aspose.svg.dom/document/onload/) | Ottiene o imposta il gestore eventi per l'evento OnLoad. |
| event [OnLoadedData](../../aspose.svg.dom/document/onloadeddata/) | Ottiene o imposta il gestore eventi per l'evento OnLoadedData. |
| event [OnLoadedMetadata](../../aspose.svg.dom/document/onloadedmetadata/) | Ottiene o imposta il gestore eventi per l'evento OnLoadedMetadata. |
| event [OnLoadStart](../../aspose.svg.dom/document/onloadstart/) | Ottiene o imposta il gestore eventi per l'evento OnLoadStart. |
| event [OnMouseDown](../../aspose.svg.dom/document/onmousedown/) | Ottiene o imposta il gestore eventi per l'evento OnMouseDown. |
| event [OnMouseEnter](../../aspose.svg.dom/document/onmouseenter/) | Ottiene o imposta il gestore eventi per l'evento OnMouseEnter. |
| event [OnMouseLeave](../../aspose.svg.dom/document/onmouseleave/) | Ottiene o imposta il gestore eventi per l'evento OnMouseLeave. |
| event [OnMouseMove](../../aspose.svg.dom/document/onmousemove/) | Ottiene o imposta il gestore eventi per l'evento OnMouseMove. |
| event [OnMouseOut](../../aspose.svg.dom/document/onmouseout/) | Ottiene o imposta il gestore eventi per l'evento OnMouseOut. |
| event [OnMouseOver](../../aspose.svg.dom/document/onmouseover/) | Ottiene o imposta il gestore eventi per l'evento OnMouseOver. |
| event [OnMouseUp](../../aspose.svg.dom/document/onmouseup/) | Ottiene o imposta il gestore eventi per l'evento OnMouseUp. |
| event [OnMouseWheel](../../aspose.svg.dom/document/onmousewheel/) | Ottiene o imposta il gestore eventi per l'evento OnMouseWheel. |
| event [OnPause](../../aspose.svg.dom/document/onpause/) | Ottiene o imposta il gestore eventi per l'evento OnPause. |
| event [OnPlay](../../aspose.svg.dom/document/onplay/) | Ottiene o imposta il gestore eventi per l'evento OnPlay. |
| event [OnPlaying](../../aspose.svg.dom/document/onplaying/) | Ottiene o imposta il gestore eventi per l'evento OnPlaying. |
| event [OnProgress](../../aspose.svg.dom/document/onprogress/) | Ottiene o imposta il gestore eventi per l'evento OnProgress. |
| event [OnRateChange](../../aspose.svg.dom/document/onratechange/) | Ottiene o imposta il gestore eventi per l'evento OnRateChange. |
| event [OnReadyStateChange](../../aspose.svg.dom/document/onreadystatechange/) | Ottiene o imposta il gestore eventi per l'evento OnReadyStateChange. |
| event [OnReset](../../aspose.svg.dom/document/onreset/) | Ottiene o imposta il gestore eventi per l'evento OnReset. |
| event [OnResize](../../aspose.svg.dom/document/onresize/) | Ottiene o imposta il gestore eventi per l'evento OnResize. |
| event [OnScroll](../../aspose.svg.dom/document/onscroll/) | Ottiene o imposta il gestore eventi per l'evento OnScroll. |
| event [OnSeeked](../../aspose.svg.dom/document/onseeked/) | Ottiene o imposta il gestore eventi per l'evento OnSeeked. |
| event [OnSeeking](../../aspose.svg.dom/document/onseeking/) | Ottiene o imposta il gestore eventi per l'evento OnSeeking. |
| event [OnSelect](../../aspose.svg.dom/document/onselect/) | Ottiene o imposta il gestore eventi per l'evento OnSelect. |
| event [OnShow](../../aspose.svg.dom/document/onshow/) | Ottiene o imposta il gestore eventi per l'evento OnShow. |
| event [OnStalled](../../aspose.svg.dom/document/onstalled/) | Ottiene o imposta il gestore eventi per l'evento OnStalled. |
| event [OnSubmit](../../aspose.svg.dom/document/onsubmit/) | Ottiene o imposta il gestore eventi per l'evento OnSubmit. |
| event [OnSuspend](../../aspose.svg.dom/document/onsuspend/) | Ottiene o imposta il gestore eventi per l'evento OnSuspend. |
| event [OnTimeUpdate](../../aspose.svg.dom/document/ontimeupdate/) | Ottiene o imposta il gestore eventi per l'evento OnTimeUpdate. |
| event [OnToggle](../../aspose.svg.dom/document/ontoggle/) | Ottiene o imposta il gestore eventi per l'evento OnToggle. |
| event [OnVolumeChange](../../aspose.svg.dom/document/onvolumechange/) | Ottiene o imposta il gestore eventi per l'evento OnVolumeChange. |
| event [OnWaiting](../../aspose.svg.dom/document/onwaiting/) | Ottiene o imposta il gestore eventi per l'evento OnWaiting. |

### Guarda anche

* class [Node](../node/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle/)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal/)
* interface [IGlobalEventHandlers](../iglobaleventhandlers/)
* interface [INonElementParentNode](../inonelementparentnode/)
* interface [IParentNode](../iparentnode/)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator/)
* spazio dei nomi [Aspose.Svg.Dom](../../aspose.svg.dom/)
* assemblea [Aspose.SVG](../../)


