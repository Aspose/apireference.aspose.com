---
title: MouseEvent
second_title: Aspose.SVG for .NET API Referansı
description: MouseEvent arabirimi Fare olaylarıyla ilişkili belirli bağlamsal bilgiler sağlar.
type: docs
weight: 990
url: /tr/net/aspose.svg.dom.events/mouseevent/
---
## MouseEvent class

MouseEvent arabirimi, Fare olaylarıyla ilişkili belirli bağlamsal bilgiler sağlar.

```csharp
public class MouseEvent : UIEvent
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [MouseEvent](mouseevent#constructor)(string) | Yeni bir örneğini başlatır[`MouseEvent`](../mouseevent) sınıf. |
| [MouseEvent](mouseevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | Yeni bir örneğini başlatır[`MouseEvent`](../mouseevent) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AltKey](../../aspose.svg.dom.events/mouseevent/altkey) { get; } | altKey özelliğine bakın. |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Bir olayın köpüren bir olay olup olmadığını belirtmek için kullanılır. Olay balonlanabiliyorsa değer doğrudur, yoksa değer yanlıştır. |
| [Button](../../aspose.svg.dom.events/mouseevent/button) { get; } | Bir fare düğmesinin basılması veya bırakılmasının neden olduğu fare olayları sırasında, hangi işaretçi aygıtı düğmesinin durumunu değiştirdiğini belirtmek için düğme KULLANILMALIDIR. |
| [Buttons](../../aspose.svg.dom.events/mouseevent/buttons) { get; } | Herhangi bir fare olayı sırasında, bit maskesi olarak ifade edilen, o anda hangi fare düğmeleri kombinasyonuna basıldığını belirtmek için düğmeler KULLANILMALIDIR. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Bir olayın varsayılan eyleminin engellenip engellenemeyeceğini belirtmek için kullanılır. Varsayılan eylem önlenebilirse, değer doğrudur, aksi takdirde değer yanlıştır. |
| [ClientX](../../aspose.svg.dom.events/mouseevent/clientx) { get; } | Olayla ilişkili görünüm alanına göre olayın gerçekleştiği yatay koordinat. |
| [ClientY](../../aspose.svg.dom.events/mouseevent/clienty) { get; } | Olayla ilişkili görünüm alanına göre olayın gerçekleştiği dikey koordinat. |
| [CtrlKey](../../aspose.svg.dom.events/mouseevent/ctrlkey) { get; } | ctrlKey özelliğine bakın. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | belirtmek için kullanılır[`IEventTarget`](../ieventtarget) kimin[`IEventListener`](../ieventlistener) s şu anda işleniyor. Bu, özellikle yakalama ve köpürme sırasında kullanışlıdır. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | İptal edilebilir öznitelik değeri true iken önlemeDefault() çağrıldıysa true, aksi takdirde false döndürür. |
| [Detail](../../aspose.svg.dom.events/uievent/detail) { get; } | Olay türüne bağlı olarak, Olay hakkında bazı ayrıntılı bilgileri belirtir. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Şu anda olay akışının hangi aşamasının değerlendirildiğini belirtmek için kullanılır. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | isTrusted özniteliği, başlatıldığı değeri döndürmelidir. Bir olay oluşturulduğunda, öznitelik false olarak başlatılmalıdır. |
| [MetaKey](../../aspose.svg.dom.events/mouseevent/metakey) { get; } | MetaKey özelliğine bakın. |
| [RelatedTarget](../../aspose.svg.dom.events/mouseevent/relatedtarget) { get; } | Olayın türüne bağlı olarak, bir UI olayıyla ilgili ikincil EventTarget'ı tanımlamak için kullanılır. |
| [ScreenX](../../aspose.svg.dom.events/mouseevent/screenx) { get; } | Ekran koordinat sisteminin orijinine göre olayın meydana geldiği yatay koordinat. |
| [ScreenY](../../aspose.svg.dom.events/mouseevent/screeny) { get; } | Ekran koordinat sisteminin orijinine göre olayın meydana geldiği dikey koordinat. |
| [ShiftKey](../../aspose.svg.dom.events/mouseevent/shiftkey) { get; } | shiftKey özelliğine bakın. |
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
