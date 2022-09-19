---
title: AddEventListener
second_title: Riferimento API Aspose.SVG per .NET
description: Questo metodo consente la registrazione di listener di eventi sulla destinazione dellevento.
type: docs
weight: 10
url: /it/net/aspose.svg.dom/eventtarget/addeventlistener/
---
## AddEventListener(string, DOMEventHandler, bool) {#addeventlistener}

Questo metodo consente la registrazione di listener di eventi sulla destinazione dell'evento.

```csharp
public void AddEventListener(string type, DOMEventHandler handler, bool useCapture)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | String | Il tipo di evento per il quale l'utente si sta registrando |
| handler | DOMEventHandler | Prende un[`DOMEventHandler`](../../../aspose.svg.dom.events/domeventhandler) essere chiamato quando si verifica l'evento. |
| useCapture | Boolean | Se true, useCapture indica che l'utente desidera avviare l'acquisizione. Dopo aver avviato l'acquisizione, tutti gli eventi del tipo specificato verranno inviati all'oggetto register [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) prima di essere inviati a qualsiasi Bersaglio evento sotto di loro nell'albero. Gli eventi che stanno ribollendo verso l'alto attraverso l'albero non attiveranno un[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) designato per utilizzare l'acquisizione. |

### Osservazioni

Se un[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) viene aggiunto ad un[`EventTarget`](../../eventtarget) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti ma potrebbe essere attivato durante una fase successiva del flusso di eventi, come la fase di gorgogliamento.

Se sono registrati più listener di eventi identici sullo stesso[`EventTarget`](../../eventtarget)con gli stessi parametri le istanze duplicate vengono scartate. Non causano il[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) da chiamare due volte e poiché vengono scartati non è necessario rimuoverli con il [`RemoveEventListener`](../removeeventlistener) metodo .

### Guarda anche

* delegate [DOMEventHandler](../../../aspose.svg.dom.events/domeventhandler)
* class [EventTarget](../../eventtarget)
* spazio dei nomi [Aspose.Svg.Dom](../../eventtarget)
* assemblea [Aspose.SVG](../../../)

---

## AddEventListener(string, IEventListener) {#addeventlistener_1}

Questo metodo consente la registrazione di listener di eventi sulla destinazione dell'evento.

```csharp
public void AddEventListener(string type, IEventListener listener)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | String | Il tipo di evento per il quale l'utente si sta registrando |
| listener | IEventListener | Accetta un'interfaccia implementata dall'utente che contiene i metodi da chiamare quando si verifica l'evento. |

### Osservazioni

Se un[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) viene aggiunto ad un[`EventTarget`](../../eventtarget) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti ma potrebbe essere attivato durante una fase successiva del flusso di eventi, come la fase di gorgogliamento.

Se sono registrati più listener di eventi identici sullo stesso[`EventTarget`](../../eventtarget)con gli stessi parametri le istanze duplicate vengono scartate. Non causano il[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) da chiamare due volte e poiché vengono scartati non è necessario rimuoverli con il [`RemoveEventListener`](../removeeventlistener) metodo .

### Guarda anche

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener)
* class [EventTarget](../../eventtarget)
* spazio dei nomi [Aspose.Svg.Dom](../../eventtarget)
* assemblea [Aspose.SVG](../../../)

---

## AddEventListener(string, IEventListener, bool) {#addeventlistener_2}

Questo metodo consente la registrazione di listener di eventi sulla destinazione dell'evento.

```csharp
public void AddEventListener(string type, IEventListener listener, bool useCapture)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| type | String | Il tipo di evento per il quale l'utente si sta registrando |
| listener | IEventListener | Accetta un'interfaccia implementata dall'utente che contiene i metodi da chiamare quando si verifica l'evento. |
| useCapture | Boolean | Se true, useCapture indica che l'utente desidera avviare l'acquisizione. Dopo aver avviato l'acquisizione, tutti gli eventi del tipo specificato verranno inviati all'oggetto register [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) prima di essere inviati a qualsiasi Bersaglio evento sotto di loro nell'albero. Gli eventi che stanno ribollendo verso l'alto attraverso l'albero non attiveranno un[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) designato per utilizzare l'acquisizione. |

### Osservazioni

Se un[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) viene aggiunto ad un[`EventTarget`](../../eventtarget) mentre sta elaborando un evento, non verrà attivato dalle azioni correnti ma potrebbe essere attivato durante una fase successiva del flusso di eventi, come la fase di gorgogliamento.

Se sono registrati più listener di eventi identici sullo stesso[`EventTarget`](../../eventtarget)con gli stessi parametri le istanze duplicate vengono scartate. Non causano il[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) da chiamare due volte e poiché vengono scartati non è necessario rimuoverli con il [`RemoveEventListener`](../removeeventlistener) metodo .

### Guarda anche

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener)
* class [EventTarget](../../eventtarget)
* spazio dei nomi [Aspose.Svg.Dom](../../eventtarget)
* assemblea [Aspose.SVG](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
