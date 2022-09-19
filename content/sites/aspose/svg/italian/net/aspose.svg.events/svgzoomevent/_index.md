---
title: SVGZoomEvent
second_title: Riferimento API Aspose.SVG per .NET
description: Levento zoom si verifica quando lutente avvia unazione che provoca il ridimensionamento della vista corrente del frammento di documento SVG. I gestori di eventi vengono riconosciuti solo su elementi svg.
type: docs
weight: 1620
url: /it/net/aspose.svg.events/svgzoomevent/
---
## SVGZoomEvent class

L'evento zoom si verifica quando l'utente avvia un'azione che provoca il ridimensionamento della vista corrente del frammento di documento SVG. I gestori di eventi vengono riconosciuti solo su elementi 'svg'.

```csharp
public class SVGZoomEvent : Event
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Utilizzato per indicare se un evento è o meno un evento bubbling. Se l'evento può presentare bolle, il valore è true, altrimenti il valore è false. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Utilizzato per indicare se a un evento può essere impedita o meno l'azione predefinita. Se è possibile impedire l'azione predefinita, il valore è true, altrimenti il valore è false. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Usato per indicare il[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget) il cui, di chi[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) I messaggi di posta elettronica sono attualmente in fase di elaborazione. Ciò è particolarmente utile durante l'acquisizione e la formazione di bolle. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Restituisce vero se è stato invocato preventDefault() mentre il valore dell'attributo cancellabile è vero e falso in caso contrario. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Utilizzato per indicare quale fase del flusso di eventi è attualmente in fase di valutazione. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | L'attributo isTrusted deve restituire il valore su cui è stato inizializzato. Quando viene creato un evento, l'attributo deve essere inizializzato su false. |
| [NewScale](../../aspose.svg.events/svgzoomevent/newscale) { get; } | Il fattore di scala che sarà attivo dopo l'elaborazione dell'operazione di zoom. |
| [NewTranslate](../../aspose.svg.events/svgzoomevent/newtranslate) { get; } | I valori di traslazione che saranno presenti dopo l'elaborazione dell'operazione di zoom. L'oggetto SVGPoint è di sola lettura. |
| [PreviousScale](../../aspose.svg.events/svgzoomevent/previousscale) { get; } | Il fattore di scala delle precedenti operazioni di zoom in atto prima che si verificasse l'operazione di zoom. |
| [PreviousTranslate](../../aspose.svg.events/svgzoomevent/previoustranslate) { get; } | I valori di traslazione dalle precedenti operazioni di zoom in atto prima che si verificasse l'operazione di zoom. L'oggetto SVGPoint è di sola lettura. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Usato per indicare il[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget) a cui l'evento è stato originariamente inviato. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Utilizzato per specificare l'ora (in millisecondi rispetto all'epoca) in cui è stato creato l'evento. A causa del fatto che alcuni sistemi potrebbero non fornire queste informazioni, il valore di timeStamp potrebbe non essere disponibile per tutti gli eventi. Quando non disponibile , verrà restituito un valore di 0. Esempi di epoch time sono l'ora di inizio del sistema o 0:0:0 UTC 1 gennaio 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Il nome dell'evento (senza distinzione tra maiuscole e minuscole). Il nome deve essere un nome XML. |
| [ZoomRectScreen](../../aspose.svg.events/svgzoomevent/zoomrectscreen) { get; } | Il rettangolo di zoom specificato in unità di schermo. L'oggetto SVGRect è di sola lettura. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Questo metodo viene utilizzato per recuperare l'oggetto ECMAScriptType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | Il[`InitEvent`](../../aspose.svg.dom.events/event/initevent) viene utilizzato per inizializzare il valore di an[`Event`](../../aspose.svg.dom.events/event) creato tramite il [`IDocumentEvent`](../../aspose.svg.dom.events/idocumentevent) interfaccia. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Se un evento è annullabile, il[`PreventDefault`](../../aspose.svg.dom.events/event/preventdefault) viene utilizzato per indicare che l'evento deve essere annullato, significa che qualsiasi azione predefinita normalmente intrapresa dall'implementazione a seguito dell'evento non si verificherà. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Invocare questo metodo impedisce all'evento di raggiungere qualsiasi listener di eventi registrato dopo quello corrente e quando inviato in un albero impedisce anche all'evento di raggiungere qualsiasi altro oggetto. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | Il[`StopPropagation`](../../aspose.svg.dom.events/event/stoppropagation) viene utilizzato per impedire l'ulteriore propagazione di un evento durante il flusso di eventi. |

### Guarda anche

* class [Event](../../aspose.svg.dom.events/event)
* spazio dei nomi [Aspose.Svg.Events](../../aspose.svg.events)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
