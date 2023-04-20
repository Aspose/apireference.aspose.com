---
title: Interface IEventTarget
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.Dom.Events.IEventTarget gränssnitt. DenEventTarget gränssnitt implementeras av alla noder i en implementering som stöder DOMhändelsemodellen. Därför kan detta gränssnitt erhållas genom att använda bindningsspecifika castingmetoder på en instans av nodgränssnittet. Gränssnittet tillåter registrering och borttagning av händelseavlyssnare på enEventTarget och sändning av händelser till detIEventTarget .
type: docs
weight: 960
url: /sv/net/aspose.svg.dom.events/ieventtarget/
---
## IEventTarget interface

Den[`EventTarget`](../../aspose.svg.dom/eventtarget/) gränssnitt implementeras av alla noder i en implementering som stöder DOM-händelsemodellen. Därför kan detta gränssnitt erhållas genom att använda bindningsspecifika castingmetoder på en instans av nodgränssnittet. Gränssnittet tillåter registrering och borttagning av händelseavlyssnare på en[`EventTarget`](../../aspose.svg.dom/eventtarget/) och sändning av händelser till det`IEventTarget` .

```csharp
public interface IEventTarget
```

## Metoder

| namn | Beskrivning |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener)(string, IEventListener) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [AddEventListener](../../aspose.svg.dom.events/ieventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener, bool) | Denna metod tillåter registrering av händelseavlyssnare på händelsemålet. |
| [DispatchEvent](../../aspose.svg.dom.events/ieventtarget/dispatchevent/)(Event) | Denna metod tillåter sändning av händelser till implementeringshändelsemodellen. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener)(string, IEventListener) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../ieventlistener/) tas bort från en[`EventTarget`](../../aspose.svg.dom/eventtarget/) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |
| [RemoveEventListener](../../aspose.svg.dom.events/ieventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener, bool) | Denna metod tillåter att händelseavlyssnare tas bort från händelsemålet. Om en[`IEventListener`](../ieventlistener/) tas bort från en[`EventTarget`](../../aspose.svg.dom/eventtarget/) medan den bearbetar en händelse kommer den inte att utlösas av de aktuella åtgärderna. Händelselyssnare kan aldrig anropas efter att de tagits bort. |

### Se även

* namnutrymme [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* hopsättning [Aspose.SVG](../../)


