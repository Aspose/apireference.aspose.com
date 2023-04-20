---
title: EventTarget.RemoveEventListener
second_title: Aspose.SVG for .NET API Referansı
description: EventTarget yöntem. Bu yöntem olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer birIEventListener bir yerden kaldırılırEventTarget bir olayı işlerken mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler kaldırıldıktan sonra asla çağrılamaz.
type: docs
weight: 40
url: /tr/net/aspose.svg.dom/eventtarget/removeeventlistener/
---
## RemoveEventListener(string, DOMEventHandler, bool) {#removeeventlistener}

Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır[`EventTarget`](../) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz.

```csharp
public void RemoveEventListener(string type, DOMEventHandler handler, bool useCapture)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| type | String | olay tipini belirtir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) kaldırılıyor. |
| handler | DOMEventHandler | bu[`DOMEventHandler`](../../../aspose.svg.dom.events/domeventhandler/) parametre şunu gösterir:[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) kaldırılacak. |
| useCapture | Boolean | Kaldırılan EventListener'ın yakalama dinleyicisi olarak kaydedilip kaydedilmediğini belirtir. Bir dinleyici, biri yakalamalı ve diğeri yakalamasız olmak üzere iki kez kaydedildiyse, her biri ayrı ayrı kaldırılmalıdır. Yakalayan bir dinleyicinin kaldırılması, yakalamayan bir sürümü etkilemez aynı dinleyicinin ve tersi. |

### Ayrıca bakınız

* delegate [DOMEventHandler](../../../aspose.svg.dom.events/domeventhandler/)
* class [EventTarget](../)
* ad alanı [Aspose.Svg.Dom](../../eventtarget/)
* toplantı [Aspose.SVG](../../../)

---

## RemoveEventListener(string, IEventListener) {#removeeventlistener_1}

Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır[`EventTarget`](../) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz.

```csharp
public void RemoveEventListener(string type, IEventListener listener)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| type | String | olay tipini belirtir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) kaldırılıyor. |
| listener | IEventListener | bu[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) parametre şunu gösterir:[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) kaldırılacak. |

### Ayrıca bakınız

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* ad alanı [Aspose.Svg.Dom](../../eventtarget/)
* toplantı [Aspose.SVG](../../../)

---

## RemoveEventListener(string, IEventListener, bool) {#removeeventlistener_2}

Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır[`EventTarget`](../) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz.

```csharp
public void RemoveEventListener(string type, IEventListener listener, bool useCapture)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| type | String | olay tipini belirtir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) kaldırılıyor. |
| listener | IEventListener | bu[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) parametre şunu gösterir:[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) kaldırılacak. |
| useCapture | Boolean | Kaldırılan EventListener'ın yakalama dinleyicisi olarak kaydedilip kaydedilmediğini belirtir. Bir dinleyici, biri yakalamalı ve diğeri yakalamasız olmak üzere iki kez kaydedildiyse, her biri ayrı ayrı kaldırılmalıdır. Yakalayan bir dinleyicinin kaldırılması, yakalamayan bir sürümü etkilemez aynı dinleyicinin ve tersi. |

### Ayrıca bakınız

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* ad alanı [Aspose.Svg.Dom](../../eventtarget/)
* toplantı [Aspose.SVG](../../../)


