---
title: SVGSVGElement.CreateEvent
second_title: Riferimento API Aspose.SVG per .NET
description: SVGSVGElement metodo. Crea un fileEvent di un tipo supportato dallimplementazione.
type: docs
weight: 110
url: /it/net/aspose.svg/svgsvgelement/createevent/
---
## SVGSVGElement.CreateEvent method

Crea un file[`Event`](../../../aspose.svg.dom.events/event/) di un tipo supportato dall'implementazione.

```csharp
public Event CreateEvent(string eventType)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| eventType | String | Il parametro eventType specifica il tipo di[`Event`](../../../aspose.svg.dom.events/event/) interfaccia da creare.  Se il[`Event`](../../../aspose.svg.dom.events/event/)l'interfaccia specificata è supportata dall'implementazione questo metodo restituirà un new [`Event`](../../../aspose.svg.dom.events/event/) del tipo di interfaccia richiesto. Se il[`Event`](../../../aspose.svg.dom.events/event/)deve essere spedito tramite il[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) metodo appropriato [`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) Il metodo deve essere chiamato dopo la creazione per inizializzare il[`Event`](../../../aspose.svg.dom.events/event/) s valori. |

### Valore di ritorno

Il nuovo creato[`Event`](../../../aspose.svg.dom.events/event/)

### Eccezioni

| eccezione | condizione |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: sollevato se l'implementazione non supporta il tipo di[`Event`](../../../aspose.svg.dom.events/event/) interfaccia richiesta |

### Guarda anche

* class [Event](../../../aspose.svg.dom.events/event/)
* class [SVGSVGElement](../)
* spazio dei nomi [Aspose.Svg](../../svgsvgelement/)
* assemblea [Aspose.SVG](../../../)


