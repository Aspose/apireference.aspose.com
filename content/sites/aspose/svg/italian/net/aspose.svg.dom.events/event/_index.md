---
title: Event
second_title: Riferimento API Aspose.SVG per .NET
description: IlEvent./event viene utilizzato per fornire informazioni contestuali su un evento al gestore che elabora levento.
type: docs
weight: 920
url: /it/net/aspose.svg.dom.events/event/
---
## Event class

Il[`Event`](../event) viene utilizzato per fornire informazioni contestuali su un evento al gestore che elabora l'evento.

```csharp
public class Event : DOMObject
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Event](event#constructor)(string) | Inizializza una nuova istanza di[`Event`](../event) classe. |
| [Event](event#constructor_1)(string, IDictionary&lt;string, object&gt;) | Inizializza una nuova istanza di[`Event`](../event) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Utilizzato per indicare se un evento è o meno un evento bubbling. Se l'evento può presentare bolle, il valore è true, altrimenti il valore è false. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Utilizzato per indicare se a un evento può essere impedita o meno l'azione predefinita. Se è possibile impedire l'azione predefinita, il valore è true, altrimenti il valore è false. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Usato per indicare il[`IEventTarget`](../ieventtarget) il cui, di chi[`IEventListener`](../ieventlistener) I messaggi di posta elettronica sono attualmente in fase di elaborazione. Ciò è particolarmente utile durante l'acquisizione e la formazione di bolle. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Restituisce vero se è stato invocato preventDefault() mentre il valore dell'attributo cancellabile è vero e falso in caso contrario. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Utilizzato per indicare quale fase del flusso di eventi è attualmente in fase di valutazione. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | L'attributo isTrusted deve restituire il valore su cui è stato inizializzato. Quando viene creato un evento, l'attributo deve essere inizializzato su false. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Usato per indicare il[`IEventTarget`](../ieventtarget) a cui l'evento è stato originariamente inviato. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Utilizzato per specificare l'ora (in millisecondi rispetto all'epoca) in cui è stato creato l'evento. A causa del fatto che alcuni sistemi potrebbero non fornire queste informazioni, il valore di timeStamp potrebbe non essere disponibile per tutti gli eventi. Quando non disponibile , verrà restituito un valore di 0. Esempi di epoch time sono l'ora di inizio del sistema o 0:0:0 UTC 1 gennaio 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Il nome dell'evento (senza distinzione tra maiuscole e minuscole). Il nome deve essere un nome XML. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | Il[`InitEvent`](./initevent) viene utilizzato per inizializzare il valore di an[`Event`](../event) creato tramite il [`IDocumentEvent`](../idocumentevent) interfaccia. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Se un evento è annullabile, il[`PreventDefault`](./preventdefault) viene utilizzato per indicare che l'evento deve essere annullato, significa che qualsiasi azione predefinita normalmente intrapresa dall'implementazione a seguito dell'evento non si verificherà. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Invocare questo metodo impedisce all'evento di raggiungere qualsiasi listener di eventi registrato dopo quello corrente e quando inviato in un albero impedisce anche all'evento di raggiungere qualsiasi altro oggetto. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | Il[`StopPropagation`](./stoppropagation) viene utilizzato per impedire l'ulteriore propagazione di un evento durante il flusso di eventi. |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [AtTargetPhase](../../aspose.svg.dom.events/event/attargetphase) | La fase dell'evento corrente è la fase di acquisizione. |
| const [BubblingPhase](../../aspose.svg.dom.events/event/bubblingphase) | La fase dell'evento corrente è la fase di ribollimento. |
| const [CapturingPhase](../../aspose.svg.dom.events/event/capturingphase) | L'evento è attualmente in corso di valutazione sulla destinazione[`IEventTarget`](../ieventtarget) . |
| const [NonePhase](../../aspose.svg.dom.events/event/nonephase) | Gli eventi attualmente non inviati sono in questa fase. |

### Osservazioni

Un oggetto che implementa il[`Event`](../event) viene generalmente passato come primo parametro a un gestore di eventi. Informazioni di contesto più specifiche vengono passate ai gestori di eventi derivando interfacce aggiuntive da[`Event`](../event) che contengono informazioni direttamente relative al tipo di evento che accompagnano. Queste interfacce derivate sono implementate anche dall'oggetto passato all'event listener.

### Guarda anche

* class [DOMObject](../../aspose.svg.dom/domobject)
* spazio dei nomi [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
