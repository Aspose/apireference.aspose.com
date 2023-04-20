---
title: IEventTarget.DispatchEvent
second_title: Aspose.SVG voor .NET API-referentie
description: IEventTarget methode. Met deze methode kunnen gebeurtenissen worden verzonden naar het gebeurtenismodel van de implementatie.
type: docs
weight: 20
url: /nl/net/aspose.svg.dom.events/ieventtarget/dispatchevent/
---
## IEventTarget.DispatchEvent method

Met deze methode kunnen gebeurtenissen worden verzonden naar het gebeurtenismodel van de implementatie.

```csharp
public bool DispatchEvent(Event @event)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| event | Event | Specificeert het gebeurtenistype, het gedrag en de contextuele informatie die moet worden gebruikt bij het verwerken van de gebeurtenis. |

### Winstwaarde

De geretourneerde waarde van[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) geeft aan of een van de luisteraars die de gebeurtenis hebben afgehandeld, heeft aangeroepen[`PreventDefault`](../../event/preventdefault/) . Als[`PreventDefault`](../../event/preventdefault/) heette de waarde is false, anders is de waarde true.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) |  |

### Opmerkingen

Gebeurtenissen die op deze manier worden verzonden, hebben hetzelfde vastleggings- en bubbelgedrag als gebeurtenissen die rechtstreeks door de implementatie worden verzonden. Het doel van de gebeurtenis is de[`EventTarget`](../../../aspose.svg.dom/eventtarget/) waarop[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) heet.

### Zie ook

* class [Event](../../event/)
* interface [IEventTarget](../)
* naamruimte [Aspose.Svg.Dom.Events](../../ieventtarget/)
* montage [Aspose.SVG](../../../)


