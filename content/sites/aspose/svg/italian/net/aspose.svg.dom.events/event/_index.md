---
title: Class Event
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Dom.Events.Event classe. IlEvent viene utilizzato per fornire informazioni contestuali su un evento al gestore che elabora levento.
type: docs
weight: 920
url: /it/net/aspose.svg.dom.events/event/
---
## Event class

Il`Event` viene utilizzato per fornire informazioni contestuali su un evento al gestore che elabora l'evento.

```csharp
public class Event : DOMObject
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Event](event/#constructor)(string) | Inizializza una nuova istanza di`Event` classe. |
| [Event](event/#constructor_1)(string, IDictionary&lt;string, object&gt;) | Inizializza una nuova istanza di`Event` classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles/) { get; } | Utilizzato per indicare se un evento è un evento bubbling. Se l'evento può generare bolle, il valore è vero, altrimenti il valore è falso. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable/) { get; } | Usato per indicare se un evento può avere o meno la sua azione predefinita prevenuta. Se l'azione predefinita può essere impedita, il valore è true, altrimenti il valore è false. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget/) { get; } | Usato per indicare il[`IEventTarget`](../ieventtarget/) di chi[`IEventListener`](../ieventlistener/) s sono attualmente in fase di elaborazione. Questo è particolarmente utile durante l'acquisizione e il bubbling. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented/) { get; } | Restituisce true se preventDefault() è stato richiamato mentre il valore dell'attributo cancelable è true, false in caso contrario. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase/) { get; } | Utilizzato per indicare quale fase del flusso di eventi è attualmente in fase di valutazione. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted/) { get; } | L'attributo isTrusted deve restituire il valore a cui è stato inizializzato. Quando viene creato un evento, l'attributo deve essere inizializzato su false. |
| [Target](../../aspose.svg.dom.events/event/target/) { get; } | Usato per indicare il[`IEventTarget`](../ieventtarget/) a cui l'evento è stato originariamente inviato. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp/) { get; } | Utilizzato per specificare l'ora (in millisecondi rispetto all'epoca) in cui è stato creato l'evento. A causa del fatto che alcuni sistemi potrebbero non fornire queste informazioni, il valore di timeStamp potrebbe non essere disponibile per tutti gli eventi. Quando non disponibile , verrà restituito un valore pari a 0. Esempi di epoch time sono l'ora di avvio del sistema o 0:0:0 UTC 1 gennaio 1970. |
| [Type](../../aspose.svg.dom.events/event/type/) { get; } | Il nome dell'evento (senza distinzione tra maiuscole e minuscole). Il nome deve essere un nome XML. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent/)(string, bool, bool) | Il[`InitEvent`](./initevent/) Il metodo viene utilizzato per inizializzare il valore di an`Event` creato tramite the [`IDocumentEvent`](../idocumentevent/) interfaccia. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault/)() | Se un evento è cancellabile, il[`PreventDefault`](./preventdefault/) Il metodo viene utilizzato per indicare che l'evento deve essere annullato, il che significa che qualsiasi azione predefinita normalmente intrapresa dall'implementazione come risultato dell'evento non si verificherà. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation/)() | L'invocazione di questo metodo impedisce all'evento di raggiungere qualsiasi ascoltatore di eventi registrato dopo quello corrente e quando inviato in un albero impedisce anche all'evento di raggiungere qualsiasi altro oggetto. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation/)() | Il[`StopPropagation`](./stoppropagation/) viene utilizzato il metodo per impedire l'ulteriore propagazione di un evento durante il flusso di eventi. |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [AtTargetPhase](../../aspose.svg.dom.events/event/attargetphase/) | La fase dell'evento corrente è la fase di acquisizione. |
| const [BubblingPhase](../../aspose.svg.dom.events/event/bubblingphase/) | La fase dell'evento corrente è la fase di bubbling. |
| const [CapturingPhase](../../aspose.svg.dom.events/event/capturingphase/) | L'evento è attualmente in fase di valutazione presso la destinazione[`IEventTarget`](../ieventtarget/) . |
| const [NonePhase](../../aspose.svg.dom.events/event/nonephase/) | Gli eventi non attualmente inviati sono in questa fase. |

### Osservazioni

Un oggetto che implementa il`Event` viene generalmente passato come primo parametro a un gestore di eventi. Informazioni di contesto più specifiche vengono passate ai gestori di eventi derivando interfacce aggiuntive da`Event` che contengono informazioni direttamente correlate al tipo di evento che accompagnano. Queste interfacce derivate sono implementate anche dall'oggetto passato al listener di eventi.

### Guarda anche

* class [DOMObject](../../aspose.svg.dom/domobject/)
* spazio dei nomi [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* assemblea [Aspose.SVG](../../)


