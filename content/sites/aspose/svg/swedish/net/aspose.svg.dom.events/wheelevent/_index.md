---
title: WheelEvent
second_title: Aspose.SVG för .NET API Referens
description: WheelEventgränssnittet tillhandahåller specifik kontextuell information associerad med hjulhändelser. För att skapa en instans av WheelEventgränssnittet använder du WheelEventkonstruktorn och skickar en valfri WheelEventInitordbok.
type: docs
weight: 1010
url: /sv/net/aspose.svg.dom.events/wheelevent/
---
## WheelEvent class

WheelEvent-gränssnittet tillhandahåller specifik kontextuell information associerad med hjulhändelser. För att skapa en instans av WheelEvent-gränssnittet använder du WheelEvent-konstruktorn och skickar en valfri WheelEventInit-ordbok.

```csharp
public class WheelEvent : MouseEvent
```

## Konstruktörer

| namn | Beskrivning |
| --- | --- |
| [WheelEvent](wheelevent#constructor)(string) | Initierar en ny instans av[`WheelEvent`](../wheelevent) class. |
| [WheelEvent](wheelevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | Initierar en ny instans av[`WheelEvent`](../wheelevent) class. |

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [AltKey](../../aspose.svg.dom.events/mouseevent/altkey) { get; } | Se altKey-attributet. |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Används för att indikera om en händelse är en bubblande händelse eller inte. Om händelsen kan bubbla är värdet sant, annars är värdet false. |
| [Button](../../aspose.svg.dom.events/mouseevent/button) { get; } | Under mushändelser orsakade av nedtryckning eller släppning av en musknapp, MÅSTE knappen användas för att indikera vilken pekenhetsknapp som ändrat tillstånd. |
| [Buttons](../../aspose.svg.dom.events/mouseevent/buttons) { get; } | Under alla mushändelser MÅSTE knapparna användas för att indikera vilken kombination av musknappar som för närvarande trycks ned, uttryckt som en bitmask. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Används för att indikera om en händelse kan förhindras eller inte. Om standardåtgärden kan förhindras är värdet sant, annars är värdet false. |
| [ClientX](../../aspose.svg.dom.events/mouseevent/clientx) { get; } | Den horisontella koordinaten vid vilken händelsen inträffade i förhållande till visningsporten som är kopplad till händelsen. |
| [ClientY](../../aspose.svg.dom.events/mouseevent/clienty) { get; } | Den vertikala koordinaten vid vilken händelsen inträffade i förhållande till den visningsport som är kopplad till händelsen. |
| [CtrlKey](../../aspose.svg.dom.events/mouseevent/ctrlkey) { get; } | Se attributet ctrlKey. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Används för att indikera[`IEventTarget`](../ieventtarget) vars[`IEventListener`](../ieventlistener) s bearbetas för närvarande. Detta är särskilt användbart under fångst och bubbling. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Returnerar true om preventDefault() anropades medan det annullerbara attributvärdet är sant, och annars false. |
| [DeltaMode](../../aspose.svg.dom.events/wheelevent/deltamode) { get; } | DeltaMode-attributet innehåller en indikation på måttenheterna för deltavärdena. Standardvärdet är DOM_DELTA_PIXEL (pixlar). |
| [DeltaX](../../aspose.svg.dom.events/wheelevent/deltax) { get; } | I användaragenter där standardåtgärden för hjulhändelsen är att rulla, MÅSTE värdet vara måttet längs x-axeln (i pixlar, linjer eller sidor) som ska rullas i det fall händelsen inte avbryts. Annars är detta en implementeringsspecifik mätning (i pixlar, linjer eller sidor) av rörelsen hos en hjulenhet runt x-axeln. |
| [DeltaY](../../aspose.svg.dom.events/wheelevent/deltay) { get; } | I användaragenter där standardåtgärden för hjulhändelsen är att rulla, MÅSTE värdet vara måttet längs y-axeln (i pixlar, linjer eller sidor) som ska rullas i det fall händelsen inte avbryts. Annars är detta en implementeringsspecifik mätning (i pixlar, linjer eller sidor) av rörelsen hos en hjulenhet runt y-axeln. |
| [DeltaZ](../../aspose.svg.dom.events/wheelevent/deltaz) { get; } | I användaragenter där standardåtgärden för hjulhändelsen är att rulla, MÅSTE värdet vara måttet längs z-axeln (i pixlar, linjer eller sidor) som ska rullas om händelsen inte avbryts. Annars är detta en implementeringsspecifik mätning (i pixlar, linjer eller sidor) av rörelsen hos en hjulenhet runt z-axeln. |
| [Detail](../../aspose.svg.dom.events/uievent/detail) { get; } | Anger viss detaljinformation om händelsen, beroende på typen av händelse. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Används för att indikera vilken fas av händelseflödet som för närvarande utvärderas. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | isTrusted-attributet måste returnera värdet som det initierades till. När en händelse skapas måste attributet initieras till false. |
| [MetaKey](../../aspose.svg.dom.events/mouseevent/metakey) { get; } | Se metaKey-attributet. |
| [RelatedTarget](../../aspose.svg.dom.events/mouseevent/relatedtarget) { get; } | Används för att identifiera ett sekundärt EventTarget relaterat till en UI-händelse, beroende på typen av händelse. |
| [ScreenX](../../aspose.svg.dom.events/mouseevent/screenx) { get; } | Den horisontella koordinat vid vilken händelsen inträffade i förhållande till ursprunget för skärmens koordinatsystem. |
| [ScreenY](../../aspose.svg.dom.events/mouseevent/screeny) { get; } | Den vertikala koordinat vid vilken händelsen inträffade i förhållande till ursprunget för skärmens koordinatsystem. |
| [ShiftKey](../../aspose.svg.dom.events/mouseevent/shiftkey) { get; } | Se shiftKey-attributet. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Används för att indikera[`IEventTarget`](../ieventtarget) som händelsen ursprungligen skickades till. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Används för att ange tidpunkten (i millisekunder i förhållande till epok) då händelsen skapades. På grund av det faktum att vissa system kanske inte tillhandahåller denna information, kanske värdet av timeStamp inte är tillgängligt för alla händelser. När inte tillgängligt , kommer ett värde på 0 att returneras. Exempel på epoktid är tidpunkten för systemets start eller 0:0:0 UTC 1 januari 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Namnet på händelsen (skiftlägeskänsligt). Namnet måste vara ett XML-namn. |
| [View](../../aspose.svg.dom.events/uievent/view) { get; } | View-attributet identifierar fönstret från vilket händelsen genererades. Det oinitierade värdet för detta attribut MÅSTE vara null. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Denna metod används för att hämta ECMAScript-objektType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | Den[`InitEvent`](../event/initevent) metod används för att initiera värdet av en[`Event`](../event) skapad genom [`IDocumentEvent`](../idocumentevent) gränssnitt. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Om en händelse kan avbrytas,[`PreventDefault`](../event/preventdefault) metod används för att indikera att händelsen ska avbrytas, vilket betyder att någon standardåtgärd som normalt vidtas av implementeringen som ett resultat av händelsen inte kommer att inträffa. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Att anropa den här metoden förhindrar händelsen från att nå alla händelseavlyssnare som är registrerade efter den aktuella och när den skickas i ett träd förhindras även händelsen från att nå andra objekt. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | Den[`StopPropagation`](../event/stoppropagation) metod används för att förhindra ytterligare spridning av en händelse under händelseflödet. |

## Fält

| namn | Beskrivning |
| --- | --- |
| const [DOM_DELTA_LINE](../../aspose.svg.dom.events/wheelevent/dom_delta_line) | Måttenheterna för delta MÅSTE vara enskilda textrader. Detta är fallet för många formulärkontroller. |
| const [DOM_DELTA_PAGE](../../aspose.svg.dom.events/wheelevent/dom_delta_page) | Måttenheterna för delta MÅSTE vara sidor, antingen definierade som en enda skärm eller som en avgränsad sida. |
| const [DOM_DELTA_PIXEL](../../aspose.svg.dom.events/wheelevent/dom_delta_pixel) | Måttenheterna för delta MÅSTE vara pixlar. Detta är det mest typiska fallet i de flesta operativsystem och implementeringskonfigurationer. |

### Se även

* class [MouseEvent](../mouseevent)
* namnutrymme [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* hopsättning [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
