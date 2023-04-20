---
title: Interface IEventListener
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Dom.Events.IEventListener interfaccia. IlIEventListenerlinterfaccia è il metodo principale per la gestione degli eventi. Gli utenti implementano ilIEventListener interfaccia e registrare il loro ascoltatore su unEventTarget usando ilAddEventListener method. Gli utenti dovrebbero anche rimuovere il loroIEventListener dal suoEventTarget dopo aver completato lutilizzo dellascoltatore.
type: docs
weight: 950
url: /it/net/aspose.svg.dom.events/ieventlistener/
---
## IEventListener interface

Il`IEventListener`l'interfaccia è il metodo principale per la gestione degli eventi. Gli utenti implementano il`IEventListener` interfaccia e registrare il loro ascoltatore su un[`EventTarget`](../../aspose.svg.dom/eventtarget/) usando il[`AddEventListener`](../../aspose.svg.dom/eventtarget/addeventlistener/) method. Gli utenti dovrebbero anche rimuovere il loro`IEventListener` dal suo[`EventTarget`](../../aspose.svg.dom/eventtarget/) dopo aver completato l'utilizzo dell'ascoltatore.

```csharp
public interface IEventListener
```

## Metodi

| Nome | Descrizione |
| --- | --- |
| [HandleEvent](../../aspose.svg.dom.events/ieventlistener/handleevent/)(Event) | Questo metodo viene chiamato ogni volta che si verifica un evento del tipo per il quale il`IEventListener` l'interfaccia è stata registrata. |

### Osservazioni

Quando un Nodo viene copiato utilizzando il metodo cloneNode, gli Event Listener collegati al Nodo sorgente non sono collegati al Nodo copiato. Se l'utente desidera che gli stessi Event Listener vengano aggiunti alla copia appena creata, l'utente deve aggiungerli manualmente.

### Guarda anche

* spazio dei nomi [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* assemblea [Aspose.SVG](../../)


