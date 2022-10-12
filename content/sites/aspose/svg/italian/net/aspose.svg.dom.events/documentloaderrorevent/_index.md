---
title: DocumentLoadErrorEvent
second_title: Riferimento API Aspose.SVG per .NET
description: IlDocumentLoadErrorEvent./documentloaderrorevent si verifica quando la risorsa richiesta non è disponibile.
type: docs
weight: 900
url: /it/net/aspose.svg.dom.events/documentloaderrorevent/
---
## DocumentLoadErrorEvent class

Il[`DocumentLoadErrorEvent`](../documentloaderrorevent) si verifica quando la risorsa richiesta non è disponibile.

```csharp
public class DocumentLoadErrorEvent : ErrorEvent
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Utilizzato per indicare se un evento è o meno un evento bubbling. Se l'evento può presentare bolle, il valore è true, altrimenti il valore è false. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Utilizzato per indicare se a un evento può essere impedita o meno l'azione predefinita. Se è possibile impedire l'azione predefinita, il valore è true, altrimenti il valore è false. |
| [ColNo](../../aspose.svg.dom.events/errorevent/colno) { get; } | L'attributo colno deve restituire il valore a cui è stato inizializzato. Quando l'oggetto viene creato, questo attributo deve essere inizializzato a zero. Rappresenta il numero di colonna in cui si è verificato l'errore nello script. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Usato per indicare il[`IEventTarget`](../ieventtarget) il cui, di chi[`IEventListener`](../ieventlistener) I messaggi di posta elettronica sono attualmente in fase di elaborazione. Ciò è particolarmente utile durante l'acquisizione e la formazione di bolle. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Restituisce vero se è stato invocato preventDefault() mentre il valore dell'attributo cancellabile è vero e falso in caso contrario. |
| [Error](../../aspose.svg.dom.events/errorevent/error) { get; } | L'attributo di errore deve restituire il valore su cui è stato inizializzato. Quando l'oggetto viene creato, questo attributo deve essere inizializzato su null. Ove appropriato, viene impostato sull'oggetto che rappresenta l'errore (ad es. l'oggetto eccezione nel caso di un'eccezione DOM non rilevata). |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Utilizzato per indicare quale fase del flusso di eventi è attualmente in fase di valutazione. |
| [FileName](../../aspose.svg.dom.events/errorevent/filename) { get; } | L'attributo filename deve restituire il valore su cui è stato inizializzato. Quando l'oggetto viene creato, questo attributo deve essere inizializzato sulla stringa vuota. Rappresenta l'URL assoluto dello script in cui si è verificato originariamente l'errore. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | L'attributo isTrusted deve restituire il valore su cui è stato inizializzato. Quando viene creato un evento, l'attributo deve essere inizializzato su false. |
| [LineNo](../../aspose.svg.dom.events/errorevent/lineno) { get; } | L'attributo lineno deve restituire il valore a cui è stato inizializzato. Quando l'oggetto viene creato, questo attributo deve essere inizializzato a zero. Rappresenta il numero di riga in cui si è verificato l'errore nello script. |
| [Message](../../aspose.svg.dom.events/errorevent/message) { get; } | L'attributo del messaggio deve restituire il valore a cui è stato inizializzato. Quando l'oggetto viene creato, questo attributo deve essere inizializzato sulla stringa vuota. Rappresenta il messaggio di errore. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Usato per indicare il[`IEventTarget`](../ieventtarget) a cui l'evento è stato originariamente inviato. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Utilizzato per specificare l'ora (in millisecondi rispetto all'epoca) in cui è stato creato l'evento. A causa del fatto che alcuni sistemi potrebbero non fornire queste informazioni, il valore di timeStamp potrebbe non essere disponibile per tutti gli eventi. Quando non disponibile , verrà restituito un valore di 0. Esempi di epoch time sono l'ora di inizio del sistema o 0:0:0 UTC 1 gennaio 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Il nome dell'evento (senza distinzione tra maiuscole e minuscole). Il nome deve essere un nome XML. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | Il[`InitEvent`](../event/initevent) viene utilizzato per inizializzare il valore di an[`Event`](../event) creato tramite il [`IDocumentEvent`](../idocumentevent) interfaccia. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Se un evento è annullabile, il[`PreventDefault`](../event/preventdefault) viene utilizzato per indicare che l'evento deve essere annullato, significa che qualsiasi azione predefinita normalmente intrapresa dall'implementazione a seguito dell'evento non si verificherà. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Invocare questo metodo impedisce all'evento di raggiungere qualsiasi listener di eventi registrato dopo quello corrente e quando inviato in un albero impedisce anche all'evento di raggiungere qualsiasi altro oggetto. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | Il[`StopPropagation`](../event/stoppropagation) viene utilizzato per impedire l'ulteriore propagazione di un evento durante il flusso di eventi. |

### Guarda anche

* class [ErrorEvent](../errorevent)
* spazio dei nomi [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
