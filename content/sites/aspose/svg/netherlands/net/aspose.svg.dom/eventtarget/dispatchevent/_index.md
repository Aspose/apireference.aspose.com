---
title: EventTarget.DispatchEvent
second_title: Aspose.SVG voor .NET API-referentie
description: EventTarget methode. Met deze methode kunnen gebeurtenissen worden verzonden naar het gebeurtenismodel van de implementatie.
type: docs
weight: 20
url: /nl/net/aspose.svg.dom/eventtarget/dispatchevent/
---
## EventTarget.DispatchEvent method

Met deze methode kunnen gebeurtenissen worden verzonden naar het gebeurtenismodel van de implementatie.

```csharp
public bool DispatchEvent(Event @event)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| event | Event | Specificeert het gebeurtenistype, het gedrag en de contextuele informatie die moet worden gebruikt bij het verwerken van de gebeurtenis. |

### Winstwaarde

De geretourneerde waarde van`DispatchEvent` geeft aan of een van de luisteraars die de gebeurtenis hebben afgehandeld, heeft aangeroepen[`PreventDefault`](../../../aspose.svg.dom.events/event/preventdefault/) . Als[`PreventDefault`](../../../aspose.svg.dom.events/event/preventdefault/) heette de waarde is false, anders is de waarde true.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| [DOMException](../../domexception/) |  |

### Opmerkingen

Gebeurtenissen die op deze manier worden verzonden, hebben hetzelfde vastleggings- en bubbelgedrag als gebeurtenissen die rechtstreeks door de implementatie worden verzonden. Het doel van de gebeurtenis is de[`EventTarget`](../) waarop`DispatchEvent` heet.

### Zie ook

* class [Event](../../../aspose.svg.dom.events/event/)
* class [EventTarget](../)
* naamruimte [Aspose.Svg.Dom](../../eventtarget/)
* montage [Aspose.SVG](../../../)


