---
title: CharacterData
second_title: Riferimento API Aspose.SVG per .NET
description: Il CharacterData estende Node con una serie di attributi e metodi per accedere ai dati dei caratteri nel DOM.
type: docs
weight: 450
url: /it/net/aspose.svg.dom/characterdata/
---
## CharacterData class

Il CharacterData estende Node con una serie di attributi e metodi per accedere ai dati dei caratteri nel DOM.

```csharp
public abstract class CharacterData : Node
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes) { get; } | Una NamedNodeMap contenente gli attributi di questo nodo (se è un elemento) o null in caso contrario. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri) { get; } | L'URI di base assoluto di questo nodo o null se l'implementazione non è stata in grado di ottenere un URI assoluto. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes) { get; } | Un NodeList che contiene tutti i figli di questo nodo. Se non ci sono figli, questa è una NodeList che non contiene nodi.. |
| virtual [Data](../../aspose.svg.dom/characterdata/data) { get; set; } | I dati del carattere del nodo che implementa questa interfaccia. |
| [FirstChild](../../aspose.svg.dom/node/firstchild) { get; } | Il primo figlio di questo nodo. Se non esiste un tale nodo, restituisce null. |
| [LastChild](../../aspose.svg.dom/node/lastchild) { get; } | L'ultimo figlio di questo nodo. Se non esiste un tale nodo, restituisce null. |
| [Length](../../aspose.svg.dom/characterdata/length) { get; } | Il numero di unità a 16 bit disponibili tramite i dati e il metodo substringData di seguito. Questo potrebbe avere il valore zero, ovvero i nodi CharacterData potrebbero essere vuoti. |
| virtual [LocalName](../../aspose.svg.dom/node/localname) { get; } | Restituisce la parte locale del nome qualificato di questo nodo. Per nodi di qualsiasi tipo diverso da ELEMENT_NODE e ATTRIBUTE_NODE e nodi creati con un metodo DOM di livello 1, come Document.createElement(), questo è sempre null. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri) { get; } | L'URI dello spazio dei nomi di questo nodo o null se non è specificato. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling) { get; } | Il nodo immediatamente successivo a questo nodo. Se non esiste un tale nodo, restituisce null. |
| abstract [NodeName](../../aspose.svg.dom/node/nodename) { get; } | Il nome di questo nodo, a seconda del tipo. |
| abstract [NodeType](../../aspose.svg.dom/node/nodetype) { get; } | Un codice che rappresenta il tipo dell'oggetto sottostante. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue) { get; set; } | Il valore di questo nodo, a seconda del tipo. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument) { get; } | L'oggetto Document associato a questo nodo. Questo è anche l'oggetto Document utilizzato per creare nuovi nodi. Quando questo nodo è un Document o un DocumentType che non è ancora utilizzato con alcun Document, questo è null. |
| [ParentElement](../../aspose.svg.dom/node/parentelement) { get; } | Ottiene il genitore[`Element`](../element) di questo nodo. |
| [ParentNode](../../aspose.svg.dom/node/parentnode) { get; } | Il genitore di questo nodo. Tutti i nodi, ad eccezione di Attr, Document, DocumentFragment, Entity e Notation, possono avere un padre. Tuttavia, se un nodo è stato appena creato e non è ancora stato aggiunto all'albero, o se è stato rimosso dall'albero, questo è nullo. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix) { get; set; } | Il prefisso dello spazio dei nomi di questo nodo o null se non è specificato. Quando è definito come null, l'impostazione non ha effetto |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling) { get; } | Il nodo immediatamente precedente a questo nodo. Se non esiste un tale nodo, restituisce null. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent) { get; set; } | Questo attributo restituisce il contenuto di testo di questo nodo e dei suoi discendenti. Quando è definito null, l'impostazione non ha alcun effetto. Al momento dell'impostazione, tutti i possibili figli di questo nodo vengono rimossi e, se la nuova stringa non è vuota o nulla, viene sostituita da un singolo nodo di testo contenente la stringa su cui è impostato questo attributo. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener) | Questo metodo consente la registrazione di listener di eventi sulla destinazione dell'evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, DOMEventHandler, bool) | Questo metodo consente la registrazione di listener di eventi sulla destinazione dell'evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener)(string, IEventListener, bool) | Questo metodo consente la registrazione di listener di eventi sulla destinazione dell'evento. |
| [AppendChild](../../aspose.svg.dom/node/appendchild)(Node) | Aggiunge il nodo newChild alla fine dell'elenco dei figli di questo nodo. Se il nuovoChild è già nell'albero, viene prima rimosso. |
| virtual [AppendData](../../aspose.svg.dom/characterdata/appenddata)(string) | Aggiunge la stringa alla fine dei dati del carattere del nodo. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)() | Restituisce un duplicato di questo nodo, cioè funge da costruttore di copia generico per i nodi. Il nodo duplicato non ha padre (parentNode è null) e nessun dato utente. |
| [CloneNode](../../aspose.svg.dom/node/clonenode)(bool) | Restituisce un duplicato di questo nodo, cioè funge da costruttore di copia generico per i nodi. Il nodo duplicato non ha padre (parentNode è null) e nessun dato utente. |
| virtual [DeleteData](../../aspose.svg.dom/characterdata/deletedata)(int, int) | Rimuove un intervallo di unità a 16 bit dal nodo. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent)(Event) | Questo metodo consente l'invio di eventi nel modello di eventi di implementazione. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose)() | Esegue attività definite dall'applicazione associate alla liberazione, al rilascio o al ripristino di risorse non gestite. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes)() | Restituisce se questo nodo (se è un elemento) ha attributi |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes)() | Restituisce se questo nodo ha figli. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore)(Node, Node) | Inserisce il nodo prima del nodo figlio esistente. Se child è null, inserisci il nodo alla fine dell'elenco dei figli. Se child è un oggetto DocumentFragment, tutti i suoi figli vengono inseriti, nello stesso ordine, prima di child. Se il bambino è già nell'albero, viene prima rimosso. |
| virtual [InsertData](../../aspose.svg.dom/characterdata/insertdata)(int, string) | Inserisce una stringa in corrispondenza dell'offset dell'unità a 16 bit specificato. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace)(string) | Questo metodo controlla se il namespaceURI specificato è lo spazio dei nomi predefinito o meno. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode)(Node) | Verifica se due nodi sono uguali. Questo metodo verifica l'uguaglianza dei nodi, non l'identità (cioè, se i due nodi sono riferimenti allo stesso oggetto) che può essere verificata con Node.isSameNode(). Anche tutti i nodi uguali saranno uguali, anche se potrebbe non essere vero il contrario. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode)(Node) | Restituisce se questo nodo è lo stesso nodo di quello dato. Questo metodo fornisce un modo per determinare se due riferimenti al nodo restituiti dall'implementazione fanno riferimento allo stesso oggetto. Quando due riferimenti Node sono riferimenti allo stesso oggetto, anche se tramite un proxy, i riferimenti possono essere utilizzati in modo completamente intercambiabile, in modo tale che tutti gli attributi abbiano gli stessi valori e chiamare lo stesso metodo DOM su entrambi i riferimenti ha sempre esattamente lo stesso effetto. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri)(string) | Cerca l'URI dello spazio dei nomi associato al prefisso dato, partendo da questo nodo. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix)(string) | Cerca il prefisso associato all'URI dello spazio dei nomi specificato, partendo da questo nodo. Le dichiarazioni dello spazio dei nomi predefinito vengono ignorate da questo metodo. Vedere Ricerca prefisso spazio dei nomi per i dettagli sull'algoritmo utilizzato da questo metodo. |
| [Normalize](../../aspose.svg.dom/node/normalize)() | Inserisce tutti i nodi di testo nell'intera profondità del sottoalbero sotto questo nodo, inclusi i nodi di attributo, in una forma "normale" in cui solo la struttura (ad es. elementi, commenti, istruzioni di elaborazione, sezioni CDATA e riferimenti a entità) separa il testo nodi, cioè non ci sono né nodi di testo adiacenti né nodi di testo vuoti. Questo può essere utilizzato per garantire che la visualizzazione DOM di un documento sia la stessa di se fosse stato salvato e ricaricato ed è utile quando le operazioni (come le ricerche di XPointer [XPointer]) che dipendono da una particolare struttura ad albero del documento devono essere utilizzato. Se il parametro "normalize-characters" dell'oggetto DOMConfiguration allegato a Node.ownerDocument è true, questo metodo normalizzerà completamente anche i caratteri dei nodi Text. |
| [RemoveChild](../../aspose.svg.dom/node/removechild)(Node) | Rimuove il nodo figlio indicato da oldChild dall'elenco dei figli e lo restituisce. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener) | Questo metodo consente la rimozione di listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) viene rimosso da un[`EventTarget`](../eventtarget) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, DOMEventHandler, bool) | Questo metodo consente la rimozione di listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) viene rimosso da un[`EventTarget`](../eventtarget) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener)(string, IEventListener, bool) | Questo metodo consente la rimozione di listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) viene rimosso da un[`EventTarget`](../eventtarget) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild)(Node, Node) | Sostituisce il nodo figlio oldChild con newChild nell'elenco dei figli e restituisce il nodo oldChild. Se newChild è un oggetto DocumentFragment, oldChild viene sostituito da tutti i figli DocumentFragment, che vengono inseriti nello stesso ordine. Se il nuovoChild è già nell'albero, viene prima rimosso. |
| virtual [ReplaceData](../../aspose.svg.dom/characterdata/replacedata)(int, int, string) | Sostituisci i caratteri che iniziano con l'offset dell'unità a 16 bit specificato con la stringa specificata. |
| virtual [SubstringData](../../aspose.svg.dom/characterdata/substringdata)(int, int) | Estrae un intervallo di dati dal nodo. |
| override [ToString](../../aspose.svg.dom/characterdata/tostring)() | Restituisce aString che rappresenta questa istanza. |

### Guarda anche

* class [Node](../node)
* spazio dei nomi [Aspose.Svg.Dom](../../aspose.svg.dom)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
