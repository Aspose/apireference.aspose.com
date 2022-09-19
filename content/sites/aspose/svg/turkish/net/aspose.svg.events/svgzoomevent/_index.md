---
title: SVGZoomEvent
second_title: Aspose.SVG for .NET API Referansı
description: Yakınlaştırma olayı kullanıcı SVG belge parçasının geçerli görünümünün yeniden ölçeklenmesine neden olan bir eylemi başlattığında meydana gelir. Olay işleyiciler yalnızca svg öğelerinde tanınır.
type: docs
weight: 1620
url: /tr/net/aspose.svg.events/svgzoomevent/
---
## SVGZoomEvent class

Yakınlaştırma olayı, kullanıcı, SVG belge parçasının geçerli görünümünün yeniden ölçeklenmesine neden olan bir eylemi başlattığında meydana gelir. Olay işleyiciler yalnızca 'svg' öğelerinde tanınır.

```csharp
public class SVGZoomEvent : Event
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Bir olayın köpüren bir olay olup olmadığını belirtmek için kullanılır. Olay balonlanabiliyorsa değer doğrudur, yoksa değer yanlıştır. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Bir olayın varsayılan eyleminin engellenip engellenemeyeceğini belirtmek için kullanılır. Varsayılan eylem önlenebilirse, değer doğrudur, aksi takdirde değer yanlıştır. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | belirtmek için kullanılır[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget) kimin[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) s şu anda işleniyor. Bu, özellikle yakalama ve köpürme sırasında kullanışlıdır. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | İptal edilebilir öznitelik değeri true iken önlemeDefault() çağrıldıysa true, aksi takdirde false döndürür. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Şu anda olay akışının hangi aşamasının değerlendirildiğini belirtmek için kullanılır. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | isTrusted özniteliği, başlatıldığı değeri döndürmelidir. Bir olay oluşturulduğunda, öznitelik false olarak başlatılmalıdır. |
| [NewScale](../../aspose.svg.events/svgzoomevent/newscale) { get; } | Yakınlaştırma işlemi işlendikten sonra geçerli olacak ölçek faktörü. |
| [NewTranslate](../../aspose.svg.events/svgzoomevent/newtranslate) { get; } | Yakınlaştırma işlemi işlendikten sonra yerinde olacak çeviri değerleri. SVGPoint nesnesi salt okunurdur. |
| [PreviousScale](../../aspose.svg.events/svgzoomevent/previousscale) { get; } | Yakınlaştırma işlemi gerçekleşmeden önce mevcut olan önceki yakınlaştırma işlemlerinden gelen ölçek faktörü. |
| [PreviousTranslate](../../aspose.svg.events/svgzoomevent/previoustranslate) { get; } | Yakınlaştırma işlemi gerçekleşmeden önce mevcut olan önceki yakınlaştırma işlemlerinden çeviri değerleri. SVGPoint nesnesi salt okunurdur. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | belirtmek için kullanılır[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget) olayın ilk gönderildiği yer. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Olayın oluşturulduğu zamanı (çağa göre milisaniye cinsinden) belirtmek için kullanılır. Bazı sistemlerin bu bilgiyi sağlayamaması nedeniyle zaman Damgası değeri tüm olaylar için kullanılamayabilir. Mevcut olmadığında , 0 değeri döndürülür. Dönem zamanına örnek olarak sistemin başlama zamanı veya 0:0:0 UTC 1 Ocak 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Olayın adı (büyük/küçük harfe duyarlı değildir). Ad bir XML adı olmalıdır. |
| [ZoomRectScreen](../../aspose.svg.events/svgzoomevent/zoomrectscreen) { get; } | Ekran birimlerinde belirtilen yakınlaştırma dikdörtgeni. SVGRect nesnesi salt okunur. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Bu yöntem, ECMAScript nesnesini almak için kullanılırType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | [`InitEvent`](../../aspose.svg.dom.events/event/initevent) yöntemi, bir değerin değerini başlatmak için kullanılır.[`Event`](../../aspose.svg.dom.events/event) the aracılığıyla oluşturuldu[`IDocumentEvent`](../../aspose.svg.dom.events/idocumentevent) arayüz. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Bir olay iptal edilebilirse,[`PreventDefault`](../../aspose.svg.dom.events/event/preventdefault) yöntemi, olayın iptal edileceğini belirtmek için kullanılır, , olayın sonucu olarak uygulama tarafından normalde gerçekleştirilen herhangi bir varsayılan eylemin gerçekleşmeyeceği anlamına gelir. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Bu yöntemi çağırmak, olayın mevcut olandan sonra kaydedilen herhangi bir olay dinleyicisine ulaşmasını engeller ve bir ağaçta gönderildiğinde olayın başka nesnelere ulaşmasını da engeller. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | [`StopPropagation`](../../aspose.svg.dom.events/event/stoppropagation) olay akışı sırasında bir olayın daha fazla yayılmasını önlemek için yöntem kullanılır. |

### Ayrıca bakınız

* class [Event](../../aspose.svg.dom.events/event)
* ad alanı [Aspose.Svg.Events](../../aspose.svg.events)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
