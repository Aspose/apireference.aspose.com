---
title: Event.PreventDefault
second_title: Riferimento API Aspose.SVG per .NET
description: Event metodo. Se un evento è cancellabile ilPreventDefault Il metodo viene utilizzato per indicare che levento deve essere annullato il che significa che qualsiasi azione predefinita normalmente intrapresa dallimplementazione come risultato dellevento non si verificherà.
type: docs
weight: 120
url: /it/net/aspose.svg.dom.events/event/preventdefault/
---
## Event.PreventDefault method

Se un evento è cancellabile, il`PreventDefault` Il metodo viene utilizzato per indicare che l'evento deve essere annullato, il che significa che qualsiasi azione predefinita normalmente intrapresa dall'implementazione come risultato dell'evento non si verificherà.

```csharp
public void PreventDefault()
```

### Osservazioni

Se, durante qualsiasi fase del flusso di eventi, il file`PreventDefault`viene chiamato il metodo, l'evento viene annullato. Qualsiasi azione predefinita associata all'evento non si verificherà. La chiamata a questo metodo per un evento non annullabile non ha alcun effetto. Una volta`PreventDefault` è stato chiamato rimarrà attivo per tutto il resto della propagazione dell'evento. Questo metodo può essere utilizzato durante qualsiasi fase del flusso dell'evento.

### Guarda anche

* class [Event](../)
* spazio dei nomi [Aspose.Svg.Dom.Events](../../event/)
* assemblea [Aspose.SVG](../../../)


