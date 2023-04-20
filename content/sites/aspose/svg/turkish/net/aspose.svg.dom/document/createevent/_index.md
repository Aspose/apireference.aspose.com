---
title: Document.CreateEvent
second_title: Aspose.SVG for .NET API Referansı
description: Document yöntem. oluştururEvent uygulama tarafından desteklenen bir tür.
type: docs
weight: 880
url: /tr/net/aspose.svg.dom/document/createevent/
---
## Document.CreateEvent method

oluşturur[`Event`](../../../aspose.svg.dom.events/event/) uygulama tarafından desteklenen bir tür.

```csharp
public Event CreateEvent(string eventType)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| eventType | String | eventType parametresi, türünü belirtir.[`Event`](../../../aspose.svg.dom.events/event/) oluşturulacak arayüz.  Eğer[`Event`](../../../aspose.svg.dom.events/event/) belirtilen arayüz, uygulama tarafından destekleniyor, bu yöntem will yeni bir dönüş yapacak[`Event`](../../../aspose.svg.dom.events/event/) istenen arabirim türünün. [`Event`](../../../aspose.svg.dom.events/event/)aracılığıyla gönderilecektir.[`DispatchEvent`](../../../aspose.svg.dom.events/ieventtarget/dispatchevent/) yöntem uygun[`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) yöntemini başlatmak için oluşturulduktan sonra çağrılmalıdır.[`Event`](../../../aspose.svg.dom.events/event/) s değerleri. |

### Geri dönüş değeri

Yeni oluşturulan[`Event`](../../../aspose.svg.dom.events/event/)

### istisnalar

| istisna | şart |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: Uygulama türünü desteklemiyorsa ortaya çıkar.[`Event`](../../../aspose.svg.dom.events/event/) arayüz istendi |

### Ayrıca bakınız

* class [Event](../../../aspose.svg.dom.events/event/)
* class [Document](../)
* ad alanı [Aspose.Svg.Dom](../../document/)
* toplantı [Aspose.SVG](../../../)


