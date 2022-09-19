---
title: KeyboardEvent
second_title: Aspose.SVG for .NET API Referansı
description: KeyboardEvent arabirimi klavye aygıtlarıyla ilişkili belirli bağlamsal bilgiler sağlar. Her klavye olayı bir değer kullanarak bir tuşa başvurur. Klavye olayları genellikle odağın bulunduğu öğeye yönlendirilir.
type: docs
weight: 980
url: /tr/net/aspose.svg.dom.events/keyboardevent/
---
## KeyboardEvent class

KeyboardEvent arabirimi, klavye aygıtlarıyla ilişkili belirli bağlamsal bilgiler sağlar. Her klavye olayı, bir değer kullanarak bir tuşa başvurur. Klavye olayları genellikle odağın bulunduğu öğeye yönlendirilir.

```csharp
public class KeyboardEvent : UIEvent
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [KeyboardEvent](keyboardevent#constructor)(string) | Yeni bir örneğini başlatır[`KeyboardEvent`](../keyboardevent) sınıf. |
| [KeyboardEvent](keyboardevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | Yeni bir örneğini başlatır[`KeyboardEvent`](../keyboardevent) sınıf. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [AltKey](../../aspose.svg.dom.events/keyboardevent/altkey) { get; } | Alt (alternatif) (veya "Seçenek") tuş değiştiricisi etkinse true. Bu özelliğin başlatılmamış değeri false olmalıdır. |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Bir olayın köpüren bir olay olup olmadığını belirtmek için kullanılır. Olay balonlanabiliyorsa değer doğrudur, yoksa değer yanlıştır. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Bir olayın varsayılan eyleminin engellenip engellenemeyeceğini belirtmek için kullanılır. Varsayılan eylem önlenebilirse, değer doğrudur, aksi takdirde değer yanlıştır. |
| [Code](../../aspose.svg.dom.events/keyboardevent/code) { get; } | Kod, basılan fiziksel anahtarı tanımlayan bir dize tutar. Değer, geçerli klavye düzeninden veya değiştirici durumundan etkilenmez, bu nedenle belirli bir tuş her zaman aynı değeri döndürür. |
| [CtrlKey](../../aspose.svg.dom.events/keyboardevent/ctrlkey) { get; } | Kontrol (kontrol) tuşu değiştiricisi etkinse true. Bu özniteliğin başlatılmamış değeri false OLMALIDIR. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | belirtmek için kullanılır[`IEventTarget`](../ieventtarget) kimin[`IEventListener`](../ieventlistener) s şu anda işleniyor. Bu, özellikle yakalama ve köpürme sırasında kullanışlıdır. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | İptal edilebilir öznitelik değeri true iken önlemeDefault() çağrıldıysa true, aksi takdirde false döndürür. |
| [Detail](../../aspose.svg.dom.events/uievent/detail) { get; } | Olay türüne bağlı olarak, Olay hakkında bazı ayrıntılı bilgileri belirtir. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Şu anda olay akışının hangi aşamasının değerlendirildiğini belirtmek için kullanılır. |
| [IsComposing](../../aspose.svg.dom.events/keyboardevent/iscomposing) { get; } | anahtar olay, bir kompozisyon oturumunun parçası olarak meydana gelirse, yani, bir kompozisyon başlatma olayından sonra ve karşılık gelen kompozisyon son olayından önce meydana gelirse. Bu özelliğin başlatılmamış değeri false olmalıdır. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | isTrusted özniteliği, başlatıldığı değeri döndürmelidir. Bir olay oluşturulduğunda, öznitelik false olarak başlatılmalıdır. |
| [Key](../../aspose.svg.dom.events/keyboardevent/key) { get; } | Anahtar, basılan anahtarın anahtar değerini tutar. Değerin basılı bir gösterimi varsa, bu belirtimde tanımlanan anahtar değerini belirleme algoritmasına uygun, boş olmayan bir Unicode karakter dizisi OLMALIDIR. Değer, basılı gösterimi olmayan bir kontrol anahtarıysa, anahtar değerini belirleme algoritması tarafından belirlendiği gibi, anahtar değerler kümesinde tanımlanan anahtar değerlerden biri OLMALIDIR. Bir anahtarı tanımlayamayan uygulamalar, Unidentified. anahtar değerini KULLANMALIDIR. |
| [Location](../../aspose.svg.dom.events/keyboardevent/location) { get; } | Konum özelliği, anahtarın aygıttaki mantıksal konumunun bir göstergesini içerir. |
| [MetaKey](../../aspose.svg.dom.events/keyboardevent/metakey) { get; } | meta (Meta) anahtar değiştiricisi etkinse true. |
| [Repeat](../../aspose.svg.dom.events/keyboardevent/repeat) { get; } | tuşa sürekli olarak basılmışsa true . Bir tuşun basılı tutulması, sistem konfigürasyonu tarafından belirlenen bir oranda, girişten önce, bu sırayla girişten önce olayların tuşa basılmasıyla sonuçlanması ZORUNLUDUR. Uzun tuşa basma davranışına sahip mobil cihazlar için, tekrar öznitelik değeri true olan ilk tuş olayı, uzun tuşa basmanın bir göstergesi olarak hizmet ETMELİDİR. Tekrarlamaya başlamak için tuşa basılması ZORUNLU olan süre yapılandırmaya bağlıdır. |
| [ShiftKey](../../aspose.svg.dom.events/keyboardevent/shiftkey) { get; } | shift (Shift) tuşu değiştiricisi etkinse true . |
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
| const [DOM_KEY_LOCATION_LEFT](../../aspose.svg.dom.events/keyboardevent/dom_key_location_left) | Etkinleştirilen anahtar, sol anahtar konumundan kaynaklanır (bu anahtar için birden fazla olası konum olduğunda). |
| const [DOM_KEY_LOCATION_NUMPAD](../../aspose.svg.dom.events/keyboardevent/dom_key_location_numpad) | Tuş aktivasyonu, sayısal tuş takımından veya sayısal tuş takımına karşılık gelen bir sanal tuşla (bu tuş için birden fazla olası konum olduğunda) yapılmıştır. NumLock anahtarının her zaman DOM_KEY_LOCATION_STANDARD. konumuyla kodlanması gerektiğini unutmayın. |
| const [DOM_KEY_LOCATION_RIGHT](../../aspose.svg.dom.events/keyboardevent/dom_key_location_right) | Anahtar etkinleştirme, doğru anahtar konumundan kaynaklanır (bu anahtar için birden fazla olası konum olduğunda). |
| const [DOM_KEY_LOCATION_STANDARD](../../aspose.svg.dom.events/keyboardevent/dom_key_location_standard) | Anahtar etkinleştirme, anahtarın sol veya sağ versiyonu olarak AYRILMAMALIDIR ve (NumLock anahtarı dışında) sayısal tuş takımından kaynaklanmamıştır (veya sayısal tuş takımına karşılık gelen sanal bir anahtardan kaynaklanmamıştır). |

### Ayrıca bakınız

* class [UIEvent](../uievent)
* ad alanı [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* toplantı [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
