---
title: Event
second_title: Aspose.SVG for .NET API Referansı
description: Event./event olayı işleyen işleyiciye bir olay hakkında bağlamsal bilgi sağlamak için kullanılır.
type: docs
weight: 920
url: /tr/net/aspose.svg.dom.events/event/
---
## Event class

[`Event`](../event) olayı işleyen işleyiciye bir olay hakkında bağlamsal bilgi sağlamak için kullanılır.

```csharp
public class Event : DOMObject
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Event](event#constructor)(string) | Yeni bir örneğini başlatır[`Event`](../event) sınıf. |
| [Event](event#constructor_1)(string, IDictionary&lt;string, object&gt;) | Yeni bir örneğini başlatır[`Event`](../event) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Bir olayın köpüren bir olay olup olmadığını belirtmek için kullanılır. Olay balonlanabiliyorsa değer doğrudur, yoksa değer yanlıştır. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Bir olayın varsayılan eyleminin engellenip engellenemeyeceğini belirtmek için kullanılır. Varsayılan eylem önlenebilirse, değer doğrudur, aksi takdirde değer yanlıştır. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | belirtmek için kullanılır[`IEventTarget`](../ieventtarget) kimin[`IEventListener`](../ieventlistener) s şu anda işleniyor. Bu, özellikle yakalama ve köpürme sırasında kullanışlıdır. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | İptal edilebilir öznitelik değeri true iken önlemeDefault() çağrıldıysa true, aksi takdirde false döndürür. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Şu anda olay akışının hangi aşamasının değerlendirildiğini belirtmek için kullanılır. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | isTrusted özniteliği, başlatıldığı değeri döndürmelidir. Bir olay oluşturulduğunda, öznitelik false olarak başlatılmalıdır. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | belirtmek için kullanılır[`IEventTarget`](../ieventtarget) olayın ilk gönderildiği yer. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Olayın oluşturulduğu zamanı (çağa göre milisaniye cinsinden) belirtmek için kullanılır. Bazı sistemlerin bu bilgiyi sağlayamaması nedeniyle zaman Damgası değeri tüm olaylar için kullanılamayabilir. Mevcut olmadığında , 0 değeri döndürülür. Dönem zamanına örnek olarak sistemin başlama zamanı veya 0:0:0 UTC 1 Ocak 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Olayın adı (büyük/küçük harfe duyarlı değildir). Ad bir XML adı olmalıdır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Bu yöntem, ECMAScript nesnesini almak için kullanılırType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | [`InitEvent`](./initevent) yöntemi, bir değerin değerini başlatmak için kullanılır.[`Event`](../event) the aracılığıyla oluşturuldu[`IDocumentEvent`](../idocumentevent) arayüz. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Bir olay iptal edilebilirse,[`PreventDefault`](./preventdefault) yöntemi, olayın iptal edileceğini belirtmek için kullanılır, , olayın sonucu olarak uygulama tarafından normalde gerçekleştirilen herhangi bir varsayılan eylemin gerçekleşmeyeceği anlamına gelir. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Bu yöntemi çağırmak, olayın mevcut olandan sonra kaydedilen herhangi bir olay dinleyicisine ulaşmasını engeller ve bir ağaçta gönderildiğinde olayın başka nesnelere ulaşmasını da engeller. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | [`StopPropagation`](./stoppropagation) olay akışı sırasında bir olayın daha fazla yayılmasını önlemek için yöntem kullanılır. |

## Alanlar

| İsim | Tanım |
| --- | --- |
| const [AtTargetPhase](../../aspose.svg.dom.events/event/attargetphase) | Geçerli olay aşaması, yakalama aşamasıdır. |
| const [BubblingPhase](../../aspose.svg.dom.events/event/bubblingphase) | Geçerli olay aşaması, kabarcıklanma aşamasıdır. |
| const [CapturingPhase](../../aspose.svg.dom.events/event/capturingphase) | Olay şu anda hedefte değerlendiriliyor[`IEventTarget`](../ieventtarget) . |
| const [NonePhase](../../aspose.svg.dom.events/event/nonephase) | Şu anda gönderilmeyen olaylar bu aşamadadır. |

### Notlar

Aşağıdakileri uygulayan bir nesne[`Event`](../event) genellikle bir olay işleyicisine ilk parametre olarak iletilir. [`Event`](../event) , eşlik ettikleri olayın türüyle doğrudan ilgili bilgileri içerir. Bu türetilmiş arabirimler, olay dinleyicisine iletilen nesne tarafından da uygulanır.

### Ayrıca bakınız

* class [DOMObject](../../aspose.svg.dom/domobject)
* ad alanı [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
