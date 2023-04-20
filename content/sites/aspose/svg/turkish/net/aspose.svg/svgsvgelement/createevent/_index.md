---
title: SVGSVGElement.CreateEvent
second_title: Aspose.SVG for .NET API Referansı
description: SVGSVGElement yöntem. oluştururEvent uygulama tarafından desteklenen bir tür.
type: docs
weight: 110
url: /tr/net/aspose.svg/svgsvgelement/createevent/
---
## SVGSVGElement.CreateEvent method

oluşturur[`Event`](../../../aspose.svg.dom.events/event/) uygulama tarafından desteklenen bir tür.

```csharp
public Event CreateEvent(string eventType)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| eventType | String | eventType parametresi, türünü belirtir.[`Event`](../../../aspose.svg.dom.events/event/) oluşturulacak arayüz.  Eğer[`Event`](../../../aspose.svg.dom.events/event/)belirtilen arabirim, uygulama tarafından destekleniyor, bu yöntem bir new döndürecek[`Event`](../../../aspose.svg.dom.events/event/) istenen arabirim türünün. [`Event`](../../../aspose.svg.dom.events/event/)aracılığıyla gönderilecektir.[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) uygun yöntemi[`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) başlatmak için yöntem oluşturulduktan sonra çağrılmalıdır.[`Event`](../../../aspose.svg.dom.events/event/) s değerleri. |

### Geri dönüş değeri

Yeni oluşturulan[`Event`](../../../aspose.svg.dom.events/event/)

### istisnalar

| istisna | şart |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: Uygulama türünü desteklemiyorsa ortaya çıkar.[`Event`](../../../aspose.svg.dom.events/event/) arayüz talep edildi |

### Ayrıca bakınız

* class [Event](../../../aspose.svg.dom.events/event/)
* class [SVGSVGElement](../)
* ad alanı [Aspose.Svg](../../svgsvgelement/)
* toplantı [Aspose.SVG](../../../)


