---
title: TimeEvent.InitTimeEvent
second_title: Aspose.SVG för .NET API Referens
description: TimeEvent metod. Metoden initTimeEvent används för att initiera värdet på en TimeEvent som skapats via DocumentEventgränssnittet. Denna metod kan endast anropas innan TimeEvent har skickats via dispatchEventmetoden även om den kan anropas flera gånger under den fasen om det behövs. Om den anropas flera gånger har den slutliga anropet företräde.
type: docs
weight: 30
url: /sv/net/aspose.svg.events/timeevent/inittimeevent/
---
## TimeEvent.InitTimeEvent method

Metoden initTimeEvent används för att initiera värdet på en TimeEvent som skapats via DocumentEvent-gränssnittet. Denna metod kan endast anropas innan TimeEvent har skickats via dispatchEvent-metoden, även om den kan anropas flera gånger under den fasen om det behövs. Om den anropas flera gånger har den slutliga anropet företräde.

```csharp
public void InitTimeEvent(string typeArg, IAbstractView viewArg, long detailArg)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| typeArg | String | Anger händelsetypen. |
| viewArg | IAbstractView | Anger händelsens AbstractView. |
| detailArg | Int64 | Specificerar händelsens detalj. |

### Se även

* interface [IAbstractView](../../../aspose.svg.dom.views/iabstractview/)
* class [TimeEvent](../)
* namnutrymme [Aspose.Svg.Events](../../timeevent/)
* hopsättning [Aspose.SVG](../../../)


