---
title: InputEvent
second_title: Riferimento API Aspose.SVG per .NET
description: Gli eventi di input vengono inviati come notifiche ogni volta che il DOM viene aggiornato.
type: docs
weight: 970
url: /it/net/aspose.svg.dom.events/inputevent/
---
## InputEvent class

Gli eventi di input vengono inviati come notifiche ogni volta che il DOM viene aggiornato.

```csharp
public class InputEvent : UIEvent
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [InputEvent](inputevent#constructor)(string) | Inizializza una nuova istanza di[`InputEvent`](../inputevent) classe. |
| [InputEvent](inputevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | Inizializza una nuova istanza di[`InputEvent`](../inputevent) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Utilizzato per indicare se un evento è o meno un evento bubbling. Se l'evento può presentare bolle, il valore è true, altrimenti il valore è false. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Utilizzato per indicare se a un evento può essere impedita o meno l'azione predefinita. Se è possibile impedire l'azione predefinita, il valore è true, altrimenti il valore è false. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Usato per indicare il[`IEventTarget`](../ieventtarget) il cui, di chi[`IEventListener`](../ieventlistener) I messaggi di posta elettronica sono attualmente in fase di elaborazione. Ciò è particolarmente utile durante l'acquisizione e la formazione di bolle. |
| [Data](../../aspose.svg.dom.events/inputevent/data) { get; } | I dati contengono il valore dei caratteri generati da un metodo di input. Questo PUÒ essere un singolo carattere Unicode o una sequenza non vuota di caratteri Unicode [Unicode]. I caratteri DOVREBBE essere normalizzati come definito dalla normalizzazione Unicode form NFC, definito in [UAX15]. Questo attributo PUÒ contenere la stringa vuota. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Restituisce vero se è stato invocato preventDefault() mentre il valore dell'attributo cancellabile è vero e falso in caso contrario. |
| [Detail](../../aspose.svg.dom.events/uievent/detail) { get; } | Specifica alcune informazioni dettagliate sull'evento, a seconda del tipo di evento. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Utilizzato per indicare quale fase del flusso di eventi è attualmente in fase di valutazione. |
| [IsComposing](../../aspose.svg.dom.events/inputevent/iscomposing) { get; } | true se l'evento di input si verifica come parte di una sessione di composizione, ovvero dopo un evento compositionstart e prima del corrispondente evento compositionend. Il valore non inizializzato di questo attributo DEVE essere false. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | L'attributo isTrusted deve restituire il valore su cui è stato inizializzato. Quando viene creato un evento, l'attributo deve essere inizializzato su false. |
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

### Guarda anche

* class [UIEvent](../uievent)
* spazio dei nomi [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
