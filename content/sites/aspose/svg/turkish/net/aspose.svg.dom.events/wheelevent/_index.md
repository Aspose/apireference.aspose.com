---
title: WheelEvent
second_title: Aspose.SVG for .NET API Referansı
description: WheelEvent arabirimi tekerlek olaylarıyla ilişkili belirli bağlamsal bilgiler sağlar. WheelEvent arabiriminin bir örneğini oluşturmak için isteğe bağlı bir WheelEventInit sözlüğünü ileterek WheelEvent oluşturucusunu kullanın.
type: docs
weight: 1010
url: /tr/net/aspose.svg.dom.events/wheelevent/
---
## WheelEvent class

WheelEvent arabirimi, tekerlek olaylarıyla ilişkili belirli bağlamsal bilgiler sağlar. WheelEvent arabiriminin bir örneğini oluşturmak için, isteğe bağlı bir WheelEventInit sözlüğünü ileterek WheelEvent oluşturucusunu kullanın.

```csharp
public class WheelEvent : MouseEvent
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [WheelEvent](wheelevent#constructor)(string) | Yeni bir örneğini başlatır[`WheelEvent`](../wheelevent) sınıf. |
| [WheelEvent](wheelevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | Yeni bir örneğini başlatır[`WheelEvent`](../wheelevent) sınıf. |

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
| [DeltaMode](../../aspose.svg.dom.events/wheelevent/deltamode) { get; } | deltaMode özelliği, delta değerleri için ölçü birimlerinin bir göstergesini içerir. Varsayılan değer DOM_DELTA_PIXEL'dir (piksel). |
| [DeltaX](../../aspose.svg.dom.events/wheelevent/deltax) { get; } | Tekerlek olayının varsayılan eyleminin kaydırmak olduğu kullanıcı aracılarında, değer, olayın iptal edilmediği durumda kaydırılacak x ekseni boyunca (piksel, satır veya sayfa olarak) ölçüm OLMALIDIR. Aksi takdirde, bu, bir tekerlek cihazının x ekseni etrafındaki hareketinin uygulamaya özel bir ölçümüdür (piksel, çizgi veya sayfa olarak). |
| [DeltaY](../../aspose.svg.dom.events/wheelevent/deltay) { get; } | Tekerlek olayının varsayılan eyleminin kaydırmak olduğu kullanıcı aracılarında, değer, olayın iptal edilmediği durumda kaydırılacak y ekseni boyunca (piksel, satır veya sayfa olarak) ölçüm OLMALIDIR. Aksi takdirde, bu, bir tekerlek cihazının y ekseni etrafındaki hareketinin uygulamaya özel bir ölçümüdür (piksel, çizgi veya sayfa olarak). |
| [DeltaZ](../../aspose.svg.dom.events/wheelevent/deltaz) { get; } | Tekerlek olayının varsayılan eyleminin kaydırmak olduğu kullanıcı aracılarında, değer, olayın iptal edilmediği durumda kaydırılacak z ekseni boyunca (piksel, satır veya sayfa olarak) ölçüm OLMALIDIR. Aksi takdirde, bu, bir tekerlek cihazının z ekseni etrafındaki hareketinin uygulamaya özel bir ölçümüdür (piksel, çizgi veya sayfa olarak). |
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

## Alanlar

| İsim | Tanım |
| --- | --- |
| const [DOM_DELTA_LINE](../../aspose.svg.dom.events/wheelevent/dom_delta_line) | Delta için ölçü birimleri, ayrı metin satırları OLMALIDIR. Bu, birçok form denetimi için geçerlidir. |
| const [DOM_DELTA_PAGE](../../aspose.svg.dom.events/wheelevent/dom_delta_page) | Delta için ölçü birimleri, tek bir ekran veya sınırlandırılmış bir sayfa olarak tanımlanan sayfalar OLMALIDIR. |
| const [DOM_DELTA_PIXEL](../../aspose.svg.dom.events/wheelevent/dom_delta_pixel) | Delta için ölçü birimleri MUTLAKA piksel olmalıdır. Bu, çoğu işletim sistemi ve uygulama yapılandırmasındaki en tipik durumdur. |

### Ayrıca bakınız

* class [MouseEvent](../mouseevent)
* ad alanı [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
