---
title: AddEventListener
second_title: Aspose.SVG for .NET API Referansı
description: Bu yöntem olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır.
type: docs
weight: 10
url: /tr/net/aspose.svg.dom/eventtarget/addeventlistener/
---
## AddEventListener(string, DOMEventHandler, bool) {#addeventlistener}

Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır.

```csharp
public void AddEventListener(string type, DOMEventHandler handler, bool useCapture)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| type | String | Kullanıcının kaydolduğu olay türü |
| handler | DOMEventHandler | alır[`DOMEventHandler`](../../../aspose.svg.dom.events/domeventhandler) olay meydana geldiğinde çağrılacak. |
| useCapture | Boolean | Doğruysa useCapture, kullanıcının yakalamayı başlatmak istediğini belirtir. Yakalamayı başlattıktan sonra, belirtilen türdeki tüm olaylar kayıtlı öğesine gönderilir.[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) ağaçta altlarında bulunan herhangi bir Olay Hedefine gönderilmeden önce. Ağaçta yukarı doğru köpüren olaylar, bir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) yakalamayı kullanmak için tasarlanmıştır. |

### Notlar

Eğer bir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) bir eklenir[`EventTarget`](../../eventtarget) bir olayı işlerken, mevcut eylemler tarafından tetiklenmez ancak köpürme aşaması gibi olay akışının sonraki bir aşamasında tetiklenebilir.

Birden çok özdeş Olay Dinleyicisi aynı[`EventTarget`](../../eventtarget)aynı parametrelerle yinelenen örnekler atılır. [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) iki kez çağrılırlar ve atıldıkları için the ile kaldırılmaları gerekmez.[`RemoveEventListener`](../removeeventlistener) yöntemi.

### Ayrıca bakınız

* delegate [DOMEventHandler](../../../aspose.svg.dom.events/domeventhandler)
* class [EventTarget](../../eventtarget)
* ad alanı [Aspose.Svg.Dom](../../eventtarget)
* toplantı [Aspose.SVG](../../../)

---

## AddEventListener(string, IEventListener) {#addeventlistener_1}

Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır.

```csharp
public void AddEventListener(string type, IEventListener listener)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| type | String | Kullanıcının kaydolduğu olay türü |
| listener | IEventListener | Olay gerçekleştiğinde çağrılacak yöntemleri içeren kullanıcı tarafından uygulanan bir arabirimi alır. |

### Notlar

Eğer bir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) bir eklenir[`EventTarget`](../../eventtarget) bir olayı işlerken, mevcut eylemler tarafından tetiklenmez ancak köpürme aşaması gibi olay akışının sonraki bir aşamasında tetiklenebilir.

Birden çok özdeş Olay Dinleyicisi aynı[`EventTarget`](../../eventtarget)aynı parametrelerle yinelenen örnekler atılır. [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) iki kez çağrılırlar ve atıldıkları için the ile kaldırılmaları gerekmez.[`RemoveEventListener`](../removeeventlistener) yöntemi.

### Ayrıca bakınız

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener)
* class [EventTarget](../../eventtarget)
* ad alanı [Aspose.Svg.Dom](../../eventtarget)
* toplantı [Aspose.SVG](../../../)

---

## AddEventListener(string, IEventListener, bool) {#addeventlistener_2}

Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine olanak tanır.

```csharp
public void AddEventListener(string type, IEventListener listener, bool useCapture)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| type | String | Kullanıcının kaydolduğu olay türü |
| listener | IEventListener | Olay gerçekleştiğinde çağrılacak yöntemleri içeren kullanıcı tarafından uygulanan bir arabirimi alır. |
| useCapture | Boolean | Doğruysa useCapture, kullanıcının yakalamayı başlatmak istediğini belirtir. Yakalamayı başlattıktan sonra, belirtilen türdeki tüm olaylar kayıtlı öğesine gönderilir.[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) ağaçta altlarında bulunan herhangi bir Olay Hedefine gönderilmeden önce. Ağaçta yukarı doğru köpüren olaylar, bir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) yakalamayı kullanmak için tasarlanmıştır. |

### Notlar

Eğer bir[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) bir eklenir[`EventTarget`](../../eventtarget) bir olayı işlerken, mevcut eylemler tarafından tetiklenmez ancak köpürme aşaması gibi olay akışının sonraki bir aşamasında tetiklenebilir.

Birden çok özdeş Olay Dinleyicisi aynı[`EventTarget`](../../eventtarget)aynı parametrelerle yinelenen örnekler atılır. [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) iki kez çağrılırlar ve atıldıkları için the ile kaldırılmaları gerekmez.[`RemoveEventListener`](../removeeventlistener) yöntemi.

### Ayrıca bakınız

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener)
* class [EventTarget](../../eventtarget)
* ad alanı [Aspose.Svg.Dom](../../eventtarget)
* toplantı [Aspose.SVG](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
