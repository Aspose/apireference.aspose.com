---
title: DocumentLoadErrorEvent
second_title: Aspose.SVG for .NET API Referansı
description: DocumentLoadErrorEvent./documentloaderrorevent istenen kaynak mevcut olmadığında oluşur.
type: docs
weight: 900
url: /tr/net/aspose.svg.dom.events/documentloaderrorevent/
---
## DocumentLoadErrorEvent class

[`DocumentLoadErrorEvent`](../documentloaderrorevent) istenen kaynak mevcut olmadığında oluşur.

```csharp
public class DocumentLoadErrorEvent : ErrorEvent
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Bir olayın köpüren bir olay olup olmadığını belirtmek için kullanılır. Olay balonlanabiliyorsa değer doğrudur, yoksa değer yanlıştır. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Bir olayın varsayılan eyleminin engellenip engellenemeyeceğini belirtmek için kullanılır. Varsayılan eylem önlenebilirse, değer doğrudur, aksi takdirde değer yanlıştır. |
| [ColNo](../../aspose.svg.dom.events/errorevent/colno) { get; } | colno özniteliği, başlatıldığı değeri döndürmelidir. Nesne oluşturulduğunda, bu öznitelik sıfıra sıfırlanmalıdır. Komut dosyasında hatanın oluştuğu sütun numarasını temsil eder. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | belirtmek için kullanılır[`IEventTarget`](../ieventtarget) kimin[`IEventListener`](../ieventlistener) s şu anda işleniyor. Bu, özellikle yakalama ve köpürme sırasında kullanışlıdır. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | İptal edilebilir öznitelik değeri true iken önlemeDefault() çağrıldıysa true, aksi takdirde false döndürür. |
| [Error](../../aspose.svg.dom.events/errorevent/error) { get; } | error özelliği, başlatıldığı değeri döndürmelidir. Nesne oluşturulduğunda, bu öznitelik null olarak başlatılmalıdır. Uygun olduğunda, hatayı temsil eden nesneye ayarlanır (örneğin, yakalanmamış bir DOM istisnası durumunda istisna nesnesi). |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Şu anda olay akışının hangi aşamasının değerlendirildiğini belirtmek için kullanılır. |
| [FileName](../../aspose.svg.dom.events/errorevent/filename) { get; } | Dosya adı özniteliği, başlatıldığı değeri döndürmelidir. Nesne oluşturulduğunda, bu öznitelik boş dizeye başlatılmalıdır. Hatanın orijinal olarak oluştuğu komut dosyasının mutlak URL'sini temsil eder. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | isTrusted özniteliği, başlatıldığı değeri döndürmelidir. Bir olay oluşturulduğunda, öznitelik false olarak başlatılmalıdır. |
| [LineNo](../../aspose.svg.dom.events/errorevent/lineno) { get; } | lineno özniteliği, başlatıldığı değeri döndürmelidir. Nesne oluşturulduğunda, bu öznitelik sıfıra sıfırlanmalıdır. Komut dosyasında hatanın oluştuğu satır numarasını temsil eder. |
| [Message](../../aspose.svg.dom.events/errorevent/message) { get; } | İleti özniteliği, başlatıldığı değeri döndürmelidir. Nesne oluşturulduğunda, bu öznitelik boş dizeye başlatılmalıdır. Hata mesajını temsil eder. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | belirtmek için kullanılır[`IEventTarget`](../ieventtarget) olayın ilk gönderildiği yer. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Olayın oluşturulduğu zamanı (çağa göre milisaniye cinsinden) belirtmek için kullanılır. Bazı sistemlerin bu bilgiyi sağlayamaması nedeniyle zaman Damgası değeri tüm olaylar için kullanılamayabilir. Mevcut olmadığında , 0 değeri döndürülür. Dönem zamanına örnek olarak sistemin başlama zamanı veya 0:0:0 UTC 1 Ocak 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Olayın adı (büyük/küçük harfe duyarlı değildir). Ad bir XML adı olmalıdır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Bu yöntem, ECMAScript nesnesini almak için kullanılırType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | [`InitEvent`](../event/initevent) yöntemi, bir değerin değerini başlatmak için kullanılır.[`Event`](../event) the aracılığıyla oluşturuldu[`IDocumentEvent`](../idocumentevent) arayüz. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Bir olay iptal edilebilirse,[`PreventDefault`](../event/preventdefault) yöntemi, olayın iptal edileceğini belirtmek için kullanılır, , olayın sonucu olarak uygulama tarafından normalde gerçekleştirilen herhangi bir varsayılan eylemin gerçekleşmeyeceği anlamına gelir. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Bu yöntemi çağırmak, olayın mevcut olandan sonra kaydedilen herhangi bir olay dinleyicisine ulaşmasını engeller ve bir ağaçta gönderildiğinde olayın başka nesnelere ulaşmasını da engeller. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | [`StopPropagation`](../event/stoppropagation) olay akışı sırasında bir olayın daha fazla yayılmasını önlemek için yöntem kullanılır. |

### Ayrıca bakınız

* class [ErrorEvent](../errorevent)
* ad alanı [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
