---
title: SVGSVGElement.CreateEvent
second_title: Aspose.SVG för .NET API Referens
description: SVGSVGElement metod. Skapar enEvent av en typ som stöds av implementeringen.
type: docs
weight: 110
url: /sv/net/aspose.svg/svgsvgelement/createevent/
---
## SVGSVGElement.CreateEvent method

Skapar en[`Event`](../../../aspose.svg.dom.events/event/) av en typ som stöds av implementeringen.

```csharp
public Event CreateEvent(string eventType)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| eventType | String | EventType-parametern anger typen av[`Event`](../../../aspose.svg.dom.events/event/) gränssnitt som ska skapas.  Om[`Event`](../../../aspose.svg.dom.events/event/)det angivna gränssnittet stöds av implementeringen denna metod kommer att returnera en new [`Event`](../../../aspose.svg.dom.events/event/) av den begärda gränssnittstypen. Om[`Event`](../../../aspose.svg.dom.events/event/)ska skickas via[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) metod lämplig [`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) metoden måste anropas efter skapandet för att initiera[`Event`](../../../aspose.svg.dom.events/event/) s värden. |

### Returvärde

Den nyskapade[`Event`](../../../aspose.svg.dom.events/event/)

### Undantag

| undantag | skick |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: Ökas om implementeringen inte stöder typen av[`Event`](../../../aspose.svg.dom.events/event/) gränssnitt begärt |

### Se även

* class [Event](../../../aspose.svg.dom.events/event/)
* class [SVGSVGElement](../)
* namnutrymme [Aspose.Svg](../../svgsvgelement/)
* hopsättning [Aspose.SVG](../../../)


