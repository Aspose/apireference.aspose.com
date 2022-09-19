---
title: InputEvent
second_title: Aspose.SVG for .NET API Referansı
description: Giriş olayları DOM her güncellendiğinde bildirim olarak gönderilir.
type: docs
weight: 970
url: /tr/net/aspose.svg.dom.events/inputevent/
---
## InputEvent class

Giriş olayları, DOM her güncellendiğinde bildirim olarak gönderilir.

```csharp
public class InputEvent : UIEvent
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [InputEvent](inputevent#constructor)(string) | Yeni bir örneğini başlatır[`InputEvent`](../inputevent) sınıf. |
| [InputEvent](inputevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | Yeni bir örneğini başlatır[`InputEvent`](../inputevent) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Bir olayın köpüren bir olay olup olmadığını belirtmek için kullanılır. Olay balonlanabiliyorsa değer doğrudur, yoksa değer yanlıştır. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Bir olayın varsayılan eyleminin engellenip engellenemeyeceğini belirtmek için kullanılır. Varsayılan eylem önlenebilirse, değer doğrudur, aksi takdirde değer yanlıştır. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | belirtmek için kullanılır[`IEventTarget`](../ieventtarget) kimin[`IEventListener`](../ieventlistener) s şu anda işleniyor. Bu, özellikle yakalama ve köpürme sırasında kullanışlıdır. |
| [Data](../../aspose.svg.dom.events/inputevent/data) { get; } | Veri, bir giriş yöntemi tarafından oluşturulan karakterlerin değerini tutar. Bu, tek bir Unicode karakteri veya boş olmayan bir Unicode karakter dizisi [Unicode] olabilir. Karakterler, [UAX15]'te tanımlanan Unicode normalleştirme formu NFC tarafından tanımlandığı gibi normalleştirilmelidir. Bu öznitelik boş dizeyi içerebilir. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | İptal edilebilir öznitelik değeri true iken önlemeDefault() çağrıldıysa true, aksi takdirde false döndürür. |
| [Detail](../../aspose.svg.dom.events/uievent/detail) { get; } | Olay türüne bağlı olarak, Olay hakkında bazı ayrıntılı bilgileri belirtir. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Şu anda olay akışının hangi aşamasının değerlendirildiğini belirtmek için kullanılır. |
| [IsComposing](../../aspose.svg.dom.events/inputevent/iscomposing) { get; } | giriş olayı bir kompozisyon oturumunun parçası olarak meydana gelirse, yani bir kompozisyon başlatma olayından sonra ve karşılık gelen kompozisyon son olayından önce meydana gelirse. Bu özelliğin başlatılmamış değeri false olmalıdır. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | isTrusted özniteliği, başlatıldığı değeri döndürmelidir. Bir olay oluşturulduğunda, öznitelik false olarak başlatılmalıdır. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | belirtmek için kullanılır[`IEventTarget`](../ieventtarget) olayın ilk gönderildiği yer. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Olayın oluşturulduğu zamanı (çağa göre milisaniye cinsinden) belirtmek için kullanılır. Bazı sistemlerin bu bilgiyi sağlayamaması nedeniyle zaman Damgası değeri tüm olaylar için kullanılamayabilir. Mevcut olmadığında , 0 değeri döndürülür. Dönem zamanına örnek olarak sistemin başlama zamanı veya 0:0:0 UTC 1 Ocak 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Olayın adı (büyük/küçük harfe duyarlı değildir). Ad bir XML adı olmalıdır. |
| [View](../../aspose.svg.dom.events/uievent/view) { get; } | view özelliği, olayın oluşturulduğu Pencereyi tanımlar. Bu özelliğin başlatılmamış değeri null OLMALIDIR. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Bu yöntem, ECMAScript nesnesini almak için kullanılırType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | [`InitEvent`](../event/initevent) yöntemi, bir değerin değerini başlatmak için kullanılır.[`Event`](../event) the aracılığıyla oluşturuldu[`IDocumentEvent`](../idocumentevent) arayüz. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Bir olay iptal edilebilirse,[`PreventDefault`](../event/preventdefault) yöntemi, olayın iptal edileceğini belirtmek için kullanılır, , olayın sonucu olarak uygulama tarafından normalde gerçekleştirilen herhangi bir varsayılan eylemin gerçekleşmeyeceği anlamına gelir. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Bu yöntemi çağırmak, olayın mevcut olandan sonra kaydedilen herhangi bir olay dinleyicisine ulaşmasını engeller ve bir ağaçta gönderildiğinde olayın başka nesnelere ulaşmasını da engeller. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | [`StopPropagation`](../event/stoppropagation) olay akışı sırasında bir olayın daha fazla yayılmasını önlemek için yöntem kullanılır. |

### Ayrıca bakınız

* class [UIEvent](../uievent)
* ad alanı [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
