---
title: Interface IEventTarget
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.Events.IEventTarget arayüz. EventTarget arayüz DOM Olay Modelini destekleyen bir uygulamadaki tüm Düğümler tarafından uygulanır. Bu nedenle bu arayüz Düğüm arayüzünün bir örneğinde bağlamaya özgü döküm yöntemleri kullanılarak elde edilebilir. Arayüz Olay Dinleyicilerin kaydedilmesine ve kaldırılmasına izin verir. BİREventTarget ve olayların buna gönderilmesiIEventTarget .
type: docs
weight: 960
url: /tr/net/aspose.svg.dom.events/ieventtarget/
---
## IEventTarget interface

[`EventTarget`](../../aspose.svg.dom/eventtarget/) arayüz, DOM Olay Modelini destekleyen bir uygulamadaki tüm Düğümler tarafından uygulanır. Bu nedenle, bu arayüz, Düğüm arayüzünün bir örneğinde bağlamaya özgü döküm yöntemleri kullanılarak elde edilebilir. Arayüz, Olay Dinleyicilerin kaydedilmesine ve kaldırılmasına izin verir. BİR[`EventTarget`](../../aspose.svg.dom/eventtarget/) ve olayların buna gönderilmesi`IEventTarget` .

```csharp
public interface IEventTarget
```

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefine kaydedilmesine izin verir. |
| [DispatchEvent](../../aspose.svg.dom.events/ieventtarget/dispatchevent/)(Event) | Bu yöntem, olayların uygulama olay modeline gönderilmesine izin verir. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener)(string, IEventListener) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../ieventlistener/) bir yerden kaldırılır[`EventTarget`](../../aspose.svg.dom/eventtarget/) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener, bool) | Bu yöntem, olay dinleyicilerinin olay hedefinden kaldırılmasına izin verir. Eğer bir[`IEventListener`](../ieventlistener/) bir yerden kaldırılır[`EventTarget`](../../aspose.svg.dom/eventtarget/) bir olayı işlerken, mevcut eylemler tarafından tetiklenmeyecektir. Olay Dinleyiciler, kaldırıldıktan sonra asla çağrılamaz. |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* toplantı [Aspose.SVG](../../)


