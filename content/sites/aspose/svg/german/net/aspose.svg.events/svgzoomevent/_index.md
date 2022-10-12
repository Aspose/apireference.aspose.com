---
title: SVGZoomEvent
second_title: Aspose.SVG für .NET-API-Referenz
description: Das ZoomEreignis tritt auf wenn der Benutzer eine Aktion einleitet die bewirkt dass die aktuelle Ansicht des SVGDokumentfragments neu skaliert wird. Ereignishandler werden nur für svgElemente erkannt.
type: docs
weight: 1620
url: /de/net/aspose.svg.events/svgzoomevent/
---
## SVGZoomEvent class

Das Zoom-Ereignis tritt auf, wenn der Benutzer eine Aktion einleitet, die bewirkt, dass die aktuelle Ansicht des SVG-Dokumentfragments neu skaliert wird. Ereignishandler werden nur für 'svg'-Elemente erkannt.

```csharp
public class SVGZoomEvent : Event
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Wird verwendet, um anzugeben, ob ein Ereignis ein Blasenereignis ist oder nicht. Wenn das Ereignis sprudeln kann, ist der Wert wahr, andernfalls ist der Wert falsch. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Wird verwendet, um anzugeben, ob die Standardaktion eines Ereignisses verhindert werden kann oder nicht. Wenn die Standardaktion verhindert werden kann, ist der Wert wahr, andernfalls ist der Wert falsch. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Wird verwendet, um die anzuzeigen[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget) Deren[`IEventListener`](../../aspose.svg.dom.events/ieventlistener) s werden gerade verarbeitet. Dies ist besonders nützlich beim Erfassen und Bubbling. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Gibt „true“ zurück, wenn preventDefault() aufgerufen wurde, während der Wert des abbrechbaren Attributs „true“ ist, andernfalls „false“. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Wird verwendet, um anzugeben, welche Phase des Ereignisflusses derzeit ausgewertet wird. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | Das isTrusted-Attribut muss den Wert zurückgeben, mit dem es initialisiert wurde. Wenn ein Ereignis erstellt wird, muss das Attribut auf „false“ initialisiert werden. |
| [NewScale](../../aspose.svg.events/svgzoomevent/newscale) { get; } | Der Skalierungsfaktor, der vorhanden sein wird, nachdem der Zoomvorgang verarbeitet wurde. |
| [NewTranslate](../../aspose.svg.events/svgzoomevent/newtranslate) { get; } | Die Übersetzungswerte, die vorhanden sind, nachdem der Zoomvorgang verarbeitet wurde. Das SVGPoint-Objekt ist schreibgeschützt. |
| [PreviousScale](../../aspose.svg.events/svgzoomevent/previousscale) { get; } | Der Skalierungsfaktor aus vorherigen Zoomvorgängen, der vorhanden war, bevor der Zoomvorgang stattfand. |
| [PreviousTranslate](../../aspose.svg.events/svgzoomevent/previoustranslate) { get; } | Die Übersetzungswerte aus vorherigen Zoomvorgängen, die vorhanden waren, bevor der Zoomvorgang stattfand. Das SVGPoint-Objekt ist schreibgeschützt. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Wird verwendet, um die anzuzeigen[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget) an die das Ereignis ursprünglich gesendet wurde. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Wird verwendet, um die Zeit (in Millisekunden relativ zur Epoche) anzugeben, zu der das Ereignis erstellt wurde. Da einige Systeme diese Informationen möglicherweise nicht bereitstellen, ist der Wert von timeStamp möglicherweise nicht für alle Ereignisse verfügbar. Wenn nicht verfügbar , wird ein Wert von 0 zurückgegeben. Beispiele für Epochenzeit sind die Zeit des Systemstarts oder 0:0:0 UTC 1. Januar 1970. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Der Name des Ereignisses (Groß-/Kleinschreibung wird nicht beachtet). Der Name muss ein XML-Name sein. |
| [ZoomRectScreen](../../aspose.svg.events/svgzoomevent/zoomrectscreen) { get; } | Das angegebene Zoomrechteck in Bildschirmeinheiten. Das SVGRect-Objekt ist schreibgeschützt. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Diese Methode wird zum Abrufen des ECMAScript-Objekts verwendetType . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | Die[`InitEvent`](../../aspose.svg.dom.events/event/initevent) -Methode wird verwendet, um den Wert von an zu initialisieren[`Event`](../../aspose.svg.dom.events/event) erstellt durch the [`IDocumentEvent`](../../aspose.svg.dom.events/idocumentevent) Schnittstelle. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Wenn eine Veranstaltung stornierbar ist, wird die[`PreventDefault`](../../aspose.svg.dom.events/event/preventdefault) -Methode wird verwendet, um anzugeben, dass das Ereignis abgebrochen werden soll, , was bedeutet, dass eine Standardaktion, die normalerweise von der Implementierung als Ergebnis des Ereignisses ausgeführt wird, nicht ausgeführt wird. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Das Aufrufen dieser Methode verhindert, dass das Ereignis alle Ereignis-Listener erreicht, die nach dem aktuellen registriert sind, und wenn es in einem Baum gesendet wird, verhindert es auch, dass das Ereignis andere Objekte erreicht. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | Die[`StopPropagation`](../../aspose.svg.dom.events/event/stoppropagation) -Methode verwendet wird, verhindert die weitere Ausbreitung eines Ereignisses während des Ereignisflusses. |

### Siehe auch

* class [Event](../../aspose.svg.dom.events/event)
* namensraum [Aspose.Svg.Events](../../aspose.svg.events)
* Montage [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
