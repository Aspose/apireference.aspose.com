---
title: Class EventTarget
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.Dom.EventTarget klas. DeEventTarget interface wordt geïmplementeerd door alle Nodes in een implementatie die het DOM Event Model ondersteunt. Daarom kan deze interface worden verkregen door bindingspecifieke castingmethoden te gebruiken op een instantie van de Nodeinterface. De interface maakt registratie en verwijdering van Event Listeners op eenEventTarget en verzending van gebeurtenissen daarnaartoeIEventTarget .
type: docs
weight: 870
url: /nl/net/aspose.svg.dom/eventtarget/
---
## EventTarget class

De`EventTarget` interface wordt geïmplementeerd door alle Nodes in een implementatie die het DOM Event Model ondersteunt. Daarom kan deze interface worden verkregen door bindingspecifieke castingmethoden te gebruiken op een instantie van de Node-interface. De interface maakt registratie en verwijdering van Event Listeners op een`EventTarget` en verzending van gebeurtenissen daarnaartoe[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) .

```csharp
public class EventTarget : DOMObject, IDisposable, IEventTarget
```

## methoden

| Naam | Beschrijving |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener) | Met deze methode kunnen gebeurtenislisteners worden geregistreerd op het gebeurtenisdoel. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener)(string, DOMEventHandler, bool) | Met deze methode kunnen gebeurtenislisteners worden geregistreerd op het gebeurtenisdoel. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_2)(string, IEventListener, bool) | Met deze methode kunnen gebeurtenislisteners worden geregistreerd op het gebeurtenisdoel. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Met deze methode kunnen gebeurtenissen worden verzonden naar het gebeurtenismodel van de implementatie. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Voert door de toepassing gedefinieerde taken uit die verband houden met het vrijmaken, vrijgeven of resetten van onbeheerde bronnen. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Deze methode wordt gebruikt om het ECMAScript-object op te halenType . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener) | Met deze methode kunnen gebeurtenislisteners uit het gebeurtenisdoel worden verwijderd. Als een[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) wordt verwijderd uit een`EventTarget` terwijl het een gebeurtenis verwerkt, wordt het niet geactiveerd door de huidige acties. Gebeurtenislisteners kunnen nooit worden aangeroepen nadat ze zijn verwijderd. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener)(string, DOMEventHandler, bool) | Met deze methode kunnen gebeurtenislisteners uit het gebeurtenisdoel worden verwijderd. Als een[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) wordt verwijderd uit een`EventTarget` terwijl het een gebeurtenis verwerkt, wordt het niet geactiveerd door de huidige acties. Gebeurtenislisteners kunnen nooit worden aangeroepen nadat ze zijn verwijderd. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_2)(string, IEventListener, bool) | Met deze methode kunnen gebeurtenislisteners uit het gebeurtenisdoel worden verwijderd. Als een[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) wordt verwijderd uit een`EventTarget` terwijl het een gebeurtenis verwerkt, wordt het niet geactiveerd door de huidige acties. Gebeurtenislisteners kunnen nooit worden aangeroepen nadat ze zijn verwijderd. |

### Zie ook

* class [DOMObject](../domobject/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* naamruimte [Aspose.Svg.Dom](../../aspose.svg.dom/)
* montage [Aspose.SVG](../../)


