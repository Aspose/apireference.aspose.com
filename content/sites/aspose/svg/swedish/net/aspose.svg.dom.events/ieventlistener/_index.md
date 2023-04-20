---
title: Interface IEventListener
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.Dom.Events.IEventListener gränssnitt. DenIEventListenergränssnittet är den primära metoden för att hantera händelser. Användare implementerarIEventListener gränssnitt och registrera sin lyssnare på enEventTarget användaAddEventListener method. Användarna bör också ta bort sinaIEventListener från dessEventTarget efter att de har slutfört använda lyssnaren.
type: docs
weight: 950
url: /sv/net/aspose.svg.dom.events/ieventlistener/
---
## IEventListener interface

Den`IEventListener`gränssnittet är den primära metoden för att hantera händelser. Användare implementerar`IEventListener` gränssnitt och registrera sin lyssnare på en[`EventTarget`](../../aspose.svg.dom/eventtarget/) använda[`AddEventListener`](../../aspose.svg.dom/eventtarget/addeventlistener/) method. Användarna bör också ta bort sina`IEventListener` från dess[`EventTarget`](../../aspose.svg.dom/eventtarget/) efter att de har slutfört använda lyssnaren.

```csharp
public interface IEventListener
```

## Metoder

| namn | Beskrivning |
| --- | --- |
| [HandleEvent](../../aspose.svg.dom.events/ieventlistener/handleevent/)(Event) | Denna metod anropas närhelst en händelse inträffar av den typ för vilken`IEventListener` gränssnittet registrerades. |

### Anmärkningar

När en Nod kopieras med metoden cloneNode kopplas inte händelseavlyssnare som är kopplade till källnoden till den kopierade noden. Om användaren vill att samma händelseavlyssnare ska läggas till i den nyskapade kopian måste användaren lägga till dem manuellt.

### Se även

* namnutrymme [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* hopsättning [Aspose.SVG](../../)


