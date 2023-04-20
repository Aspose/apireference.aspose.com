---
title: Class EventTarget
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.EventTarget sınıf. EventTarget arayüz DOM Olay Modelini destekleyen bir uygulamadaki tüm Düğümler tarafından uygulanır. Bu nedenle bu arayüz Düğüm arayüzünün bir örneğinde bağlamaya özgü döküm yöntemleri kullanılarak elde edilebilir. Arayüz Olay Dinleyicilerin kaydedilmesine ve kaldırılmasına izin verir. BİREventTarget ve olayların buna gönderilmesiIEventTarget .
type: docs
weight: 870
url: /tr/net/aspose.svg.dom/eventtarget/
---
## EventTarget class

`EventTarget` arayüz, DOM Olay Modelini destekleyen bir uygulamadaki tüm Düğümler tarafından uygulanır. Bu nedenle, bu arayüz, Düğüm arayüzünün bir örneğinde bağlamaya özgü döküm yöntemleri kullanılarak elde edilebilir. Arayüz, Olay Dinleyicilerin kaydedilmesine ve kaldırılmasına izin verir. BİR`EventTarget` ve olayların buna gönderilmesi[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) .

```csharp
public class EventTarget : DOMObject, IDisposable, IEventTarget
```

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_2)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Bu yöntem, olayların uygulama olay modeline gönderilmesine izin verir. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Yönetilmeyen kaynakları serbest bırakma, serbest bırakma veya sıfırlama ile ilişkili uygulama tanımlı görevleri gerçekleştirir. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Bu yöntem ECMAScript nesnesini almak için kullanılır.Type . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır`EventTarget` bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener)(string, DOMEventHandler, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır`EventTarget` bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_2)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) bir yerden kaldırılır`EventTarget` bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |

### Ayrıca bakınız

* class [DOMObject](../domobject/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* ad alanı [Aspose.Svg.Dom](../../aspose.svg.dom/)
* toplantı [Aspose.SVG](../../)


