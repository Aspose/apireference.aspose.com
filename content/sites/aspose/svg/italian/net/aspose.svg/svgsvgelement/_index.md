---
title: Class SVGSVGElement
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.SVGSVGElement classe. Una definizione di interfaccia chiave è linterfaccia SVGSVGElement che è linterfaccia che corrisponde allelemento svg. Questa interfaccia contiene vari metodi di utilità di uso comune come le operazioni con le matrici e la possibilità di controllare il tempo di ridisegno sui dispositivi di rendering visivo.
type: docs
weight: 3440
url: /it/net/aspose.svg/svgsvgelement/
---
## SVGSVGElement class

Una definizione di interfaccia chiave è l'interfaccia SVGSVGElement, che è l'interfaccia che corrisponde all'elemento 'svg'. Questa interfaccia contiene vari metodi di utilità di uso comune, come le operazioni con le matrici e la possibilità di controllare il tempo di ridisegno sui dispositivi di rendering visivo.

```csharp
public class SVGSVGElement : SVGGraphicsElement, IDocumentEvent, ISVGFitToViewBox, ISVGZoomAndPan
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| override [Attributes](../../aspose.svg.dom/element/attributes/) { get; } | Una NamedNodeMap contenente gli attributi di questo nodo (se è un elemento) o null in caso contrario. |
| virtual [BaseURI](../../aspose.svg.dom/node/baseuri/) { get; } | L'URI di base assoluto di questo nodo o null se l'implementazione non è stata in grado di ottenere un URI assoluto. |
| [ChildElementCount](../../aspose.svg.dom/element/childelementcount/) { get; } | Restituisce il numero corrente di nodi elemento che sono figli di questo elemento. 0 se questo elemento non ha nodi figli di nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Un NodeList che contiene tutti i figli di questo nodo. Se non ci sono figli, questo è un NodeList che non contiene nodi.. |
| [Children](../../aspose.svg.dom/element/children/) { get; } | Restituisce gli elementi figli dell'elemento corrente. |
| [ClassList](../../aspose.svg.dom/element/classlist/) { get; } | Restituisce un DOMTokenList live che contiene i token ricevuti dall'analisi dell'attributo "class". |
| [ClassName](../../aspose.svg/svgelement/classname/) { get; } | Corrisponde all'attributo 'classe' sull'elemento dato. |
| [ClassName](../../aspose.svg.dom/element/classname/) { get; set; } | L'attributo di classe dell'elemento. Questo attributo è stato rinominato a causa di conflitti con la parola chiave "class" esposta da molti linguaggi. Vedi la definizione dell'attributo di classe in HTML 4.01. |
| [CurrentScale](../../aspose.svg/svgsvgelement/currentscale/) { get; set; } | Su un elemento svg più esterno, questo attributo indica il fattore di scala corrente relativo alla vista iniziale per tenere conto delle operazioni di ingrandimento e panoramica dell'utente, come descritto in Ingrandimento e panoramica. Gli attributi DOM currentScale e currentTranslate sono equivalenti alla matrice 2x3 [abcdef] = [currentScale 0 0 currentScale currentTranslate.x currentTranslate.y]. Se l'"ingrandimento" è abilitato (ovvero zoomAndPan="magnify"), l'effetto è come se una trasformazione extra fosse posizionata al livello più esterno del frammento del documento SVG (ovvero, all'esterno dell'elemento svg più esterno). Quando si accede il un elemento 'svg' che non è un elemento svg più esterno, non è definito quale comportamento abbia questo attributo. |
| [CurrentTranslate](../../aspose.svg/svgsvgelement/currenttranslate/) { get; } | Su un elemento svg più esterno, il fattore di traduzione corrispondente che tiene conto dell'"ingrandimento" dell'utente. Quando si accede a un elemento 'svg' che non è un elemento svg più esterno, non è definito il comportamento di questo attributo. |
| [FarthestViewportElement](../../aspose.svg/svggraphicselement/farthestviewportelement/) { get; } | L'elemento 'svg' dell'antenato più lontano. Null se l'elemento corrente è l'elemento svg più esterno. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | Il primo figlio di questo nodo. Se non esiste tale nodo, questo restituisce null. |
| [FirstElementChild](../../aspose.svg.dom/element/firstelementchild/) { get; } | Restituisce il primo nodo dell'elemento figlio di questo elemento. null se questo elemento non ha elementi figlio. |
| [Height](../../aspose.svg/svgsvgelement/height/) { get; } | Corrisponde all'attributo 'altezza' sull'elemento 'svg' dato. |
| [Id](../../aspose.svg/svgelement/id/) { get; set; } | Il valore dell'attributo 'id' sull'elemento dato, o la stringa vuota se 'id' non è presente. |
| [InnerHTML](../../aspose.svg.dom/element/innerhtml/) { get; set; } | Restituisce un frammento di HTML o XML che rappresenta il contenuto dell'elemento. Può essere impostato per sostituire il contenuto dell'elemento con i nodi analizzati dalla stringa data. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | L'ultimo figlio di questo nodo. Se non esiste tale nodo, questo restituisce null. |
| [LastElementChild](../../aspose.svg.dom/element/lastelementchild/) { get; } | Restituisce l'ultimo nodo dell'elemento figlio di questo elemento. null se questo elemento non ha elementi figlio. |
| override [LocalName](../../aspose.svg.dom/element/localname/) { get; } | Restituisce la parte locale del nome completo di questo nodo. Per i nodi di qualsiasi tipo diverso da ELEMENT_NODE e ATTRIBUTE_NODE e per i nodi creati con un metodo DOM di livello 1, come Document.createElement(), è sempre null. |
| override [NamespaceURI](../../aspose.svg.dom/element/namespaceuri/) { get; } | L'URI dello spazio dei nomi di questo nodo o null se non è specificato. |
| [NearestViewportElement](../../aspose.svg/svggraphicselement/nearestviewportelement/) { get; } | L'elemento che ha stabilito la finestra corrente. Spesso, l'elemento 'svg' dell'antenato più vicino. Null se l'elemento corrente è l'elemento svg più esterno. |
| [NextElementSibling](../../aspose.svg.dom/element/nextelementsibling/) { get; } | Restituisce il successivo nodo dell'elemento di pari livello di questo elemento. null se questo elemento non ha nodi di pari livello che vengono dopo questo nell'albero del documento. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | Il nodo immediatamente successivo a questo nodo. Se non esiste tale nodo, questo restituisce null. |
| override [NodeName](../../aspose.svg.dom/element/nodename/) { get; } | Il nome di questo nodo, a seconda del suo tipo. |
| override [NodeType](../../aspose.svg.dom/element/nodetype/) { get; } | Un codice che rappresenta il tipo dell'oggetto sottostante. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | Il valore di questo nodo, a seconda del suo tipo. |
| [OuterHTML](../../aspose.svg.dom/element/outerhtml/) { get; set; } | Restituisce un frammento di HTML o XML che rappresenta l'elemento e il suo contenuto. Può essere impostato per sostituire l'elemento con i nodi analizzati dalla stringa data. |
| virtual [OwnerDocument](../../aspose.svg.dom/node/ownerdocument/) { get; } | L'oggetto Document associato a questo nodo. Questo è anche l'oggetto Document utilizzato per creare nuovi nodi. Quando questo nodo è un Documento o un DocumentType che non è ancora utilizzato con nessun Documento, questo è null. |
| [OwnerSVGElement](../../aspose.svg/svgelement/ownersvgelement/) { get; } | L'elemento 'svg' dell'antenato più vicino. Null se l'elemento dato è l'elemento svg più esterno. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Ottiene il genitore[`Element`](../../aspose.svg.dom/element/) di questo nodo. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | Il padre di questo nodo. Tutti i nodi, eccetto Attr, Document, DocumentFragment, Entity e Notation possono avere un genitore. Tuttavia, se un nodo è stato appena creato e non ancora aggiunto all'albero, o se è stato rimosso dall'albero, questo è nullo. |
| override [Prefix](../../aspose.svg.dom/element/prefix/) { get; } | Il prefisso dello spazio dei nomi di questo nodo o null se non è specificato. Quando è definito nullo, impostarlo non ha effetto |
| [PreserveAspectRatio](../../aspose.svg/svgsvgelement/preserveaspectratio/) { get; } | Corrisponde all'attributo 'preserveAspectRatio' sull'elemento dato. |
| [PreviousElementSibling](../../aspose.svg.dom/element/previouselementsibling/) { get; } | Restituisce il precedente nodo dell'elemento di pari livello di questo elemento. null se questo elemento non ha nodi di pari livello che precedono questo nell'albero del documento. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | Il nodo immediatamente precedente a questo nodo. Se non esiste tale nodo, questo restituisce null. |
| [RequiredExtensions](../../aspose.svg/svggraphicselement/requiredextensions/) { get; } | Corrisponde all'attributo 'requiredExtensions' sull'elemento dato. |
| [RequiredFeatures](../../aspose.svg/svggraphicselement/requiredfeatures/) { get; } | Corrisponde all'attributo 'requiredFeatures' sull'elemento dato. |
| [SchemaTypeInfo](../../aspose.svg.dom/element/schematypeinfo/) { get; } | Le informazioni sul tipo associate a questo elemento. |
| [ShadowRoot](../../aspose.svg.dom/element/shadowroot/) { get; } | Restituisce shadowRoot memorizzato su questo elemento o null se è chiuso. |
| [Style](../../aspose.svg/svgelement/style/) { get; } | Corrisponde all'attributo 'style' sull'elemento dato. Se l'agente utente non supporta lo stile con i CSS, questo attributo deve sempre avere il valore null. |
| [SystemLanguage](../../aspose.svg/svggraphicselement/systemlanguage/) { get; } | Corrisponde all'attributo 'systemLanguage' sull'elemento dato. |
| [TagName](../../aspose.svg.dom/element/tagname/) { get; } | Il nome dell'elemento. |
| override [TextContent](../../aspose.svg.dom/element/textcontent/) { get; set; } | Questo attributo restituisce il contenuto testuale di questo nodo e dei suoi discendenti. Quando è definito nullo, impostarlo non ha alcun effetto. Al momento dell'impostazione, tutti i possibili figli che questo nodo può avere vengono rimossi e, se la nuova stringa non è vuota o nulla, sostituita da un singolo nodo di testo contenente la stringa su cui è impostato questo attributo. |
| [Transform](../../aspose.svg/svggraphicselement/transform/) { get; } | Corrisponde all'attributo 'transform' sull'elemento dato. |
| [ViewBox](../../aspose.svg/svgsvgelement/viewbox/) { get; } | Corrisponde all'attributo 'viewBox' sull'elemento dato. |
| [ViewportElement](../../aspose.svg/svgelement/viewportelement/) { get; } | L'elemento che ha stabilito la finestra corrente. Spesso, l'elemento 'svg' dell'antenato più vicino. Null se l'elemento dato è l'elemento svg più esterno. |
| [Width](../../aspose.svg/svgsvgelement/width/) { get; } | Corrisponde all'attributo 'width' sull'elemento 'svg' dato. |
| [X](../../aspose.svg/svgsvgelement/x/) { get; } | Corrisponde all'attributo 'x' sull'elemento 'svg' dato. |
| [Y](../../aspose.svg/svgsvgelement/y/) { get; } | Corrisponde all'attributo 'y' sull'elemento 'svg' dato. |
| [ZoomAndPan](../../aspose.svg/svgsvgelement/zoomandpan/) { get; set; } | Corrisponde all'attributo 'zoomAndPan' sull'elemento dato. Il valore deve essere una delle costanti SVG_ZOOMANDPAN_* definite su questa interfaccia. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Questo metodo consente la registrazione dei listener di eventi sul target dell'evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Questo metodo consente la registrazione dei listener di eventi sul target dell'evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Questo metodo consente la registrazione dei listener di eventi sul target dell'evento. |
| [AnimationsPaused](../../aspose.svg/svgsvgelement/animationspaused/)() | Restituisce vero se questo frammento di documento SVG è in uno stato di pausa. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Aggiunge il nodo newChild alla fine dell'elenco dei figli di questo nodo. Se il newChild è già nell'albero, viene prima rimosso. |
| [AttachShadow](../../aspose.svg.dom/element/attachshadow/)(ShadowRootMode) | Crea radice ombra e la collega all'elemento corrente. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Restituisce un duplicato di questo nodo, ovvero funge da costruttore di copie generico per i nodi. Il nodo duplicato non ha un genitore (parentNode è nullo) e nessun dato utente. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Restituisce un duplicato di questo nodo, ovvero funge da costruttore di copie generico per i nodi. Il nodo duplicato non ha un genitore (parentNode è nullo) e nessun dato utente. |
| [CreateEvent](../../aspose.svg/svgsvgelement/createevent/)(string) | Crea un file[`Event`](../../aspose.svg.dom.events/event/) di un tipo supportato dall'implementazione. |
| [CreateSVGAngle](../../aspose.svg/svgsvgelement/createsvgangle/)() | Crea un oggetto SVGAngle al di fuori di qualsiasi albero del documento. L'oggetto è inizializzato al valore 0 gradi (senza unità). |
| [CreateSVGLength](../../aspose.svg/svgsvgelement/createsvglength/)() | Crea un oggetto SVGLength all'esterno di qualsiasi albero del documento. L'oggetto è inizializzato al valore di 0 unità utente. |
| [CreateSVGMatrix](../../aspose.svg/svgsvgelement/createsvgmatrix/)() | Crea un oggetto SVGMatrix all'esterno di qualsiasi albero di documenti. L'oggetto viene inizializzato sulla matrice identità. |
| [CreateSVGNumber](../../aspose.svg/svgsvgelement/createsvgnumber/)() | Crea un oggetto SVGNumber al di fuori di qualsiasi albero del documento. L'oggetto viene inizializzato su un valore pari a zero. |
| [CreateSVGPoint](../../aspose.svg/svgsvgelement/createsvgpoint/)() | Crea un oggetto SVGPoint al di fuori di qualsiasi albero del documento. L'oggetto viene inizializzato nel punto (0,0) nel sistema di coordinate utente. |
| [CreateSVGRect](../../aspose.svg/svgsvgelement/createsvgrect/)() | Crea un oggetto SVGRect al di fuori di qualsiasi albero del documento. L'oggetto viene inizializzato in modo tale che tutti i valori siano impostati su 0 unità utente. |
| [CreateSVGTransform](../../aspose.svg/svgsvgelement/createsvgtransform/)() | Crea un oggetto SVGTransform all'esterno di qualsiasi albero del documento. L'oggetto viene inizializzato su una trasformazione di matrice identità (SVG_TRANSFORM_MATRIX). |
| [CreateSVGTransformFromMatrix](../../aspose.svg/svgsvgelement/createsvgtransformfrommatrix/)(SVGMatrix) | Crea un oggetto SVGTransform all'esterno di qualsiasi albero del documento. L'oggetto viene inizializzato alla data trasformazione di matrice (cioè, SVG_TRANSFORM_MATRIX). I valori dalla matrice del parametro vengono copiati, il parametro della matrice non viene adottato come SVGTransform::matrix. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Questo metodo consente l'invio di eventi nel modello di eventi delle implementazioni. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Esegue attività definite dall'applicazione associate alla liberazione, al rilascio o al ripristino di risorse non gestite. |
| [GetAttribute](../../aspose.svg.dom/element/getattribute/)(string) | Recupera un valore di attributo per nome. |
| [GetAttributeNode](../../aspose.svg.dom/element/getattributenode/)(string) | Recupera un nodo attributo per nome. |
| [GetAttributeNodeNS](../../aspose.svg.dom/element/getattributenodens/)(string, string) | Recupera un nodo Attr in base al nome locale e all'URI dello spazio dei nomi. |
| [GetAttributeNS](../../aspose.svg.dom/element/getattributens/)(string, string) | Recupera un valore di attributo in base al nome locale e all'URI dello spazio dei nomi. |
| [GetBBox](../../aspose.svg/svggraphicselement/getbbox/)() | Restituisce il riquadro di delimitazione stretto nello spazio utente corrente (ovvero, dopo l'applicazione dell'attributo 'transform', se presente) sulla geometria di tutti gli elementi grafici contenuti, esclusi gli effetti di tratto, ritaglio, mascheramento e filtro). Si noti che getBBox deve restituire il riquadro di delimitazione effettivo nel momento in cui è stato chiamato il metodo, anche nel caso in cui l'elemento non sia stato ancora visualizzato. |
| [GetCTM](../../aspose.svg/svggraphicselement/getctm/)() | Restituisce la matrice di trasformazione dalle unità utente correnti (ovvero, dopo l'applicazione dell'eventuale attributo 'transform') al sistema di coordinate del viewport per l'ElementoVista più vicino. |
| [GetCurrentTime](../../aspose.svg/svgsvgelement/getcurrenttime/)() | Restituisce l'ora corrente in secondi relativa all'ora di inizio per il frammento di documento SVG corrente. Se getCurrentTime viene chiamato prima dell'inizio della sequenza temporale del documento (ad esempio, mediante uno script in esecuzione in un elemento 'script' prima che venga inviato l'evento SVGLoad del documento), viene restituito 0. |
| [GetElementById](../../aspose.svg/svgsvgelement/getelementbyid/)(string) | Cerca in questo frammento di documento SVG (ovvero, la ricerca è ristretta a un sottoinsieme dell'albero del documento) per un elemento il cui id è dato da elementId. Se viene trovato un elemento, viene restituito quell'elemento. Se tale elemento non esiste, restituisce null. Il comportamento non è definito se più di un elemento ha questo id. |
| [GetElementsByClassName](../../aspose.svg.dom/element/getelementsbyclassname/)(string) | Restituisce un oggetto NodeList attivo contenente tutti gli elementi nel documento che hanno tutte le classi specificate nell'argomento. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/element/getelementsbytagname/)(string) | Restituisce una NodeList di tutti gli elementi discendenti con un dato nome di tag, nell'ordine del documento. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/element/getelementsbytagnamens/)(string, string) | Restituisce un NodeList di tutti gli elementi discendenti con un dato nome locale e URI dello spazio dei nomi nell'ordine del documento. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [GetScreenCTM](../../aspose.svg/svggraphicselement/getscreenctm/)() | Restituisce la matrice di trasformazione dalle unità dell'utente corrente (cioè, dopo l'applicazione dell'attributo 'transform', se presente) all'avviso dell'agente utente genitore di un "pixel". Per i dispositivi di visualizzazione, idealmente questo rappresenta un pixel dello schermo fisico. Per altri dispositivi o ambienti in cui le dimensioni fisiche dei pixel non sono note, è possibile utilizzare invece un algoritmo simile alla definizione CSS2 di "pixel". Si noti che viene restituito null se questo elemento non è collegato all'albero del documento. Questo metodo sarebbe stato chiamato più appropriatamente come getClientCTM, ma il nome getScreenCTM viene mantenuto per motivi storici. |
| [HasAttribute](../../aspose.svg.dom/element/hasattribute/)(string) | Restituisce true quando un attributo con un determinato nome è specificato su questo elemento o ha un valore predefinito, false in caso contrario. |
| [HasAttributeNS](../../aspose.svg.dom/element/hasattributens/)(string, string) | Restituisce true quando un attributo con un determinato nome locale e URI dello spazio dei nomi è specificato su questo elemento o ha un valore predefinito, false in caso contrario. |
| override [HasAttributes](../../aspose.svg.dom/element/hasattributes/)() | Restituisce se questo nodo (se è un elemento) ha attributi |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Restituisce se questo nodo ha figli. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Inserisce il nodo prima del nodo figlio esistente figlio. Se child è null, inserisci il nodo alla fine dell'elenco dei child. Se child è un oggetto DocumentFragment, tutti i suoi child vengono inseriti, nello stesso ordine, prima di child. Se il figlio è già nell'albero, viene prima rimosso. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Questo metodo verifica se il namespaceURI specificato è lo spazio dei nomi predefinito o meno. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Verifica se due nodi sono uguali. Questo metodo verifica l'uguaglianza dei nodi, non l'uguaglianza (ovvero, se i due nodi sono riferimenti allo stesso oggetto) che possono essere verificati con Node.isSameNode(). Anche tutti i nodi uguali saranno uguali, anche se il contrario potrebbe non essere vero. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Restituisce se questo nodo è lo stesso nodo di quello dato. Questo metodo fornisce un modo per determinare se due riferimenti Node restituiti dall'implementazione fanno riferimento allo stesso oggetto. Quando due riferimenti Node sono riferimenti allo stesso oggetto, anche se tramite un proxy, i riferimenti possono essere utilizzati in modo completamente intercambiabile, in modo tale che tutti gli attributi abbiano gli stessi valori e chiamare lo stesso metodo DOM su entrambi i riferimenti ha sempre esattamente lo stesso effetto. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Cerca l'URI dello spazio dei nomi associato al prefisso dato, a partire da questo nodo. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Cerca il prefisso associato all'URI del namespace dato, a partire da questo nodo. Le dichiarazioni predefinite dello spazio dei nomi vengono ignorate da questo metodo. Vedere Ricerca prefisso nello spazio dei nomi per i dettagli sull'algoritmo utilizzato da questo metodo. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Mette tutti i nodi di testo nell'intera profondità del sottoalbero sotto questo nodo, inclusi i nodi di attributo, in una forma "normale" in cui solo la struttura (ad es. elementi, commenti, istruzioni di elaborazione, sezioni CDATA e riferimenti di entità) separa il testo nodi, cioè non ci sono né nodi di testo adiacenti né nodi di testo vuoti. Questo può essere utilizzato per garantire che la vista DOM di un documento sia la stessa di se fosse stato salvato e ricaricato, ed è utile quando le operazioni (come le ricerche XPointer [XPointer]) che dipendono da una particolare struttura ad albero del documento devono essere usato. Se il parametro "normalize-characters" dell'oggetto DOMConfiguration allegato al Node.ownerDocument è vero, questo metodo normalizzerà completamente anche i caratteri dei nodi Text. |
| [PauseAnimations](../../aspose.svg/svgsvgelement/pauseanimations/)() | Sospende (ovvero mette in pausa) tutte le animazioni attualmente in esecuzione definite all'interno del frammento di documento SVG corrispondente a questo elemento 'svg', facendo in modo che l'orologio dell'animazione corrispondente a questo frammento di documento si fermi finché non viene ripristinato. |
| [QuerySelector](../../aspose.svg.dom/element/queryselector/)(string) | Restituisce il primo elemento nel documento, che corrisponde a selector |
| [QuerySelectorAll](../../aspose.svg.dom/element/queryselectorall/)(string) | Restituisce un NodeList di tutti gli elementi nel documento, che corrispondono a selector |
| [Remove](../../aspose.svg.dom/element/remove/)() | Rimuove questa istanza. |
| [RemoveAttribute](../../aspose.svg.dom/element/removeattribute/)(string) | Rimuove un attributo per nome. |
| [RemoveAttributeNode](../../aspose.svg.dom/element/removeattributenode/)(Attr) | Rimuove il nodo dell'attributo specificato. |
| [RemoveAttributeNS](../../aspose.svg.dom/element/removeattributens/)(string, string) | Rimuove un attributo in base al nome locale e all'URI dello spazio dei nomi. |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Rimuove il nodo figlio indicato da oldChild dalla lista dei figli, e lo restituisce. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Questo metodo consente la rimozione dei listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) viene rimosso da un[`EventTarget`](../../aspose.svg.dom/eventtarget/) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Questo metodo consente la rimozione dei listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) viene rimosso da un[`EventTarget`](../../aspose.svg.dom/eventtarget/) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Questo metodo consente la rimozione dei listener di eventi dalla destinazione dell'evento. Se un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) viene rimosso da un[`EventTarget`](../../aspose.svg.dom/eventtarget/) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti. I listener di eventi non possono mai essere richiamati dopo essere stati rimossi. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Sostituisce il nodo figlio oldChild con newChild nell'elenco dei figli e restituisce il nodo oldChild. Se newChild è un oggetto DocumentFragment, oldChild viene sostituito da tutti i figli DocumentFragment, che vengono inseriti nello stesso ordine. Se il newChild è già nell'albero, viene prima rimosso. |
| [SetAttribute](../../aspose.svg.dom/element/setattribute/)(string, string) | Aggiunge un nuovo attributo. Se un attributo con quel nome è già presente nell'elemento, il suo valore viene modificato in quello del valore parametro |
| [SetAttributeNode](../../aspose.svg.dom/element/setattributenode/)(Attr) | Aggiunge un nuovo nodo attributo. Se un attributo con quel nome (nodeName) è già presente nell'elemento, viene sostituito da quello nuovo. |
| [SetAttributeNodeNS](../../aspose.svg.dom/element/setattributenodens/)(Attr) | Aggiunge un nuovo attributo. Se un attributo con quel nome locale e quell'URI dello spazio dei nomi è già presente nell'elemento, viene sostituito da quello nuovo. |
| [SetAttributeNS](../../aspose.svg.dom/element/setattributens/)(string, string, string) | Aggiunge un nuovo attributo. Se un attributo con lo stesso nome locale e lo stesso URI dello spazio dei nomi è già presente sull'elemento, il suo prefisso viene modificato in modo che sia la parte del prefisso di QualifiedName e il suo valore viene modificato in Value Parameter. |
| [SetCurrentTime](../../aspose.svg/svgsvgelement/setcurrenttime/)(float) | Regola l'orologio per questo frammento di documento SVG, stabilendo una nuova ora corrente. Se setCurrentTime viene chiamato prima dell'inizio della sequenza temporale del documento (ad esempio, mediante uno script eseguito in un elemento 'script' prima che venga inviato l'evento SVGLoad del documento), il valore dei secondi nell'ultima invocazione del metodo fornisce l'ora in cui il documento cercherà di farlo una volta iniziata la sequenza temporale del documento. |
| [SetIdAttribute](../../aspose.svg.dom/element/setidattribute/)(string, bool) | Se il parametro isId è vero, questo metodo dichiara che l'attributo specificato è un attributo ID determinato dall'utente. |
| [SetIdAttributeNode](../../aspose.svg.dom/element/setidattributenode/)(Attr, bool) | Se il parametro isId è vero, questo metodo dichiara che l'attributo specificato è un attributo ID determinato dall'utente. |
| [SetIdAttributeNS](../../aspose.svg.dom/element/setidattributens/)(string, string, bool) | Se il parametro isId è vero, questo metodo dichiara che l'attributo specificato è un attributo ID determinato dall'utente. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Restituisce aString che rappresenta questa istanza. |
| [UnpauseAnimations](../../aspose.svg/svgsvgelement/unpauseanimations/)() | Riattiva (riattiva) le animazioni attualmente in esecuzione definite all'interno del frammento del documento SVG, facendo in modo che l'orologio dell'animazione continui dall'ora in cui è stato sospeso. |

### Guarda anche

* class [SVGGraphicsElement](../svggraphicselement/)
* interface [ISVGFitToViewBox](../isvgfittoviewbox/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IViewCSS](../../aspose.svg.dom.css/iviewcss/)
* interface [IDocumentCSS](../../aspose.svg.dom.css/idocumentcss/)
* interface [ISVGZoomAndPan](../isvgzoomandpan/)
* spazio dei nomi [Aspose.Svg](../../aspose.svg/)
* assemblea [Aspose.SVG](../../)


