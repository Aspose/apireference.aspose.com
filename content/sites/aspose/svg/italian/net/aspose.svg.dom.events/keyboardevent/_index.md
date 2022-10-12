---
title: KeyboardEvent
second_title: Riferimento API Aspose.SVG per .NET
description: Linterfaccia KeyboardEvent fornisce informazioni contestuali specifiche associate ai dispositivi della tastiera. Ogni evento della tastiera fa riferimento a una chiave utilizzando un valore. Gli eventi della tastiera sono comunemente diretti allelemento che ha il focus.
type: docs
weight: 980
url: /it/net/aspose.svg.dom.events/keyboardevent/
---
## KeyboardEvent class

L'interfaccia KeyboardEvent fornisce informazioni contestuali specifiche associate ai dispositivi della tastiera. Ogni evento della tastiera fa riferimento a una chiave utilizzando un valore. Gli eventi della tastiera sono comunemente diretti all'elemento che ha il focus.

```csharp
public class KeyboardEvent : UIEvent
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [KeyboardEvent](keyboardevent#constructor)(string) | Inizializza una nuova istanza di[`KeyboardEvent`](../keyboardevent) classe. |
| [KeyboardEvent](keyboardevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | Inizializza una nuova istanza di[`KeyboardEvent`](../keyboardevent) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AltKey](../../aspose.svg.dom.events/keyboardevent/altkey) { get; } | true se il modificatore del tasto Alt (alternativo) (o "Opzione") era attivo. Il valore non inizializzato di questo attributo DEVE essere false. |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Utilizzato per indicare se un evento è o meno un evento bubbling. Se l'evento può presentare bolle, il valore è true, altrimenti il valore è false. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Utilizzato per indicare se a un evento può essere impedita o meno l'azione predefinita. Se è possibile impedire l'azione predefinita, il valore è true, altrimenti il valore è false. |
| [Code](../../aspose.svg.dom.events/keyboardevent/code) { get; } | Il codice contiene una stringa che identifica il tasto fisico premuto. Il valore non è influenzato dal layout corrente della tastiera o dallo stato del modificatore, quindi un determinato tasto restituirà sempre lo stesso valore. |
| [CtrlKey](../../aspose.svg.dom.events/keyboardevent/ctrlkey) { get; } | true se il modificatore della chiave di controllo (controllo) era attivo. Il valore non inizializzato di questo attributo DEVE essere falso. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Usato per indicare il[`IEventTarget`](../ieventtarget) il cui, di chi[`IEventListener`](../ieventlistener) I messaggi di posta elettronica sono attualmente in fase di elaborazione. Ciò è particolarmente utile durante l'acquisizione e la formazione di bolle. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Restituisce vero se è stato invocato preventDefault() mentre il valore dell'attributo cancellabile è vero e falso in caso contrario. |
| [Detail](../../aspose.svg.dom.events/uievent/detail) { get; } | Specifica alcune informazioni dettagliate sull'evento, a seconda del tipo di evento. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Utilizzato per indicare quale fase del flusso di eventi è attualmente in fase di valutazione. |
| [IsComposing](../../aspose.svg.dom.events/keyboardevent/iscomposing) { get; } | true se l'evento chiave si verifica come parte di una sessione di composizione, ovvero dopo un evento compositionstart e prima del corrispondente evento compositionend. Il valore non inizializzato di questo attributo DEVE essere false. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | L'attributo isTrusted deve restituire il valore su cui è stato inizializzato. Quando viene creato un evento, l'attributo deve essere inizializzato su false. |
| [Key](../../aspose.svg.dom.events/keyboardevent/key) { get; } | La chiave mantiene il valore chiave del tasto premuto. Se il valore ha una rappresentazione stampata, DEVE essere una stringa di caratteri Unicode non vuota, conforme all'algoritmo per determinare il valore chiave definito in questa specifica. Se il valore è una chiave di controllo che non ha una rappresentazione stampata, DEVE essere uno dei valori chiave definiti nel set di valori chiave, come determinato dall'algoritmo per determinare il valore della chiave. Le implementazioni che non sono in grado di identificare una chiave DEVONO utilizzare il valore della chiave Unidentified. |
| [Location](../../aspose.svg.dom.events/keyboardevent/location) { get; } | L'attributo location contiene un'indicazione della posizione logica della chiave sul dispositivo. |
| [MetaKey](../../aspose.svg.dom.events/keyboardevent/metakey) { get; } | true se il modificatore della chiave meta (Meta) era attivo. |
| [Repeat](../../aspose.svg.dom.events/keyboardevent/repeat) { get; } | true se il tasto è stato premuto in modo prolungato. Tenere premuto un tasto DEVE comportare la ripetizione degli eventi keydown, prima dell'input, input in questo ordine, ad una velocità determinata dalla configurazione del sistema. Per i dispositivi mobili che hanno un comportamento di pressione prolungata dei tasti, il primo evento chiave con un valore di attributo di ripetizione di true DEVE servire come indicazione di una pressione prolungata di un tasto. La durata del tempo in cui il tasto DEVE essere premuto per iniziare a ripetere dipende dalla configurazione. |
| [ShiftKey](../../aspose.svg.dom.events/keyboardevent/shiftkey) { get; } | true se il modificatore del tasto Maiusc (Shift) era attivo. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Usato per indicare il[`IEventTarget`](../ieventtarget) a cui l'evento è stato originariamente inviato. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Utilizzato per specificare l'ora (in millisecondi rispetto all'epoca) in cui è stato creato l'evento. A causa del fatto che alcuni sistemi potrebbero non fornire queste informazioni, il valore di timeStamp potrebbe non essere disponibile per tutti gli eventi. Quando non disponibile , verrà restituito un valore di 0. Esempi di epoch time sono l'ora di inizio del sistema o 0:0:0 UTC 1 gennaio 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Il nome dell'evento (senza distinzione tra maiuscole e minuscole). Il nome deve essere un nome XML. |
| [View](../../aspose.svg.dom.events/uievent/view) { get; } | L'attributo view identifica la finestra da cui è stato generato l'evento. Il valore non inizializzato di questo attributo DEVE essere null. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | Il[`InitEvent`](../event/initevent) viene utilizzato per inizializzare il valore di an[`Event`](../event) creato tramite il [`IDocumentEvent`](../idocumentevent) interfaccia. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Se un evento è annullabile, il[`PreventDefault`](../event/preventdefault) viene utilizzato per indicare che l'evento deve essere annullato, significa che qualsiasi azione predefinita normalmente intrapresa dall'implementazione a seguito dell'evento non si verificherà. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Invocare questo metodo impedisce all'evento di raggiungere qualsiasi listener di eventi registrato dopo quello corrente e quando inviato in un albero impedisce anche all'evento di raggiungere qualsiasi altro oggetto. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | Il[`StopPropagation`](../event/stoppropagation) viene utilizzato per impedire l'ulteriore propagazione di un evento durante il flusso di eventi. |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [DOM_KEY_LOCATION_LEFT](../../aspose.svg.dom.events/keyboardevent/dom_key_location_left) | La chiave attivata ha avuto origine dalla posizione della chiave a sinistra (quando esiste più di una posizione possibile per questa chiave). |
| const [DOM_KEY_LOCATION_NUMPAD](../../aspose.svg.dom.events/keyboardevent/dom_key_location_numpad) | L'attivazione della chiave è avvenuta sul tastierino numerico o con una chiave virtuale corrispondente al tastierino numerico (quando esiste più di una posizione possibile per questa chiave). Nota che la chiave NumLock deve sempre essere codificata con una posizione di DOM_KEY_LOCATION_STANDARD. |
| const [DOM_KEY_LOCATION_RIGHT](../../aspose.svg.dom.events/keyboardevent/dom_key_location_right) | L'attivazione della chiave ha avuto origine dalla posizione della chiave corretta (quando esiste più di una posizione possibile per questa chiave). |
| const [DOM_KEY_LOCATION_STANDARD](../../aspose.svg.dom.events/keyboardevent/dom_key_location_standard) | L'attivazione della chiave NON DEVE essere distinta come la versione sinistra o destra della chiave e (diversa dalla chiave NumLock) non ha avuto origine dal tastierino numerico (o non ha avuto origine con una chiave virtuale corrispondente al tastierino numerico). |

### Guarda anche

* class [UIEvent](../uievent)
* spazio dei nomi [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
