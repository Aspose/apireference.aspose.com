---
title: SVGSVGElement.CreateEvent
second_title: Aspose.SVG für .NET-API-Referenz
description: SVGSVGElement methode. Erstellt eineEvent eines Typs der von der Implementierung unterstützt wird.
type: docs
weight: 110
url: /de/net/aspose.svg/svgsvgelement/createevent/
---
## SVGSVGElement.CreateEvent method

Erstellt eine[`Event`](../../../aspose.svg.dom.events/event/) eines Typs, der von der Implementierung unterstützt wird.

```csharp
public Event CreateEvent(string eventType)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| eventType | String | Der eventType-Parameter gibt den Typ von an[`Event`](../../../aspose.svg.dom.events/event/) zu erstellende Schnittstelle.  Wenn die[`Event`](../../../aspose.svg.dom.events/event/)Die angegebene Schnittstelle wird von der Implementierung unterstützt. Diese Methode gibt ein new zurück.[`Event`](../../../aspose.svg.dom.events/event/) des angeforderten Schnittstellentyps. Wenn die[`Event`](../../../aspose.svg.dom.events/event/)soll per versendet werden[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) Methode die entsprechende [`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) -Methode muss nach der Erstellung aufgerufen werden, um die zu initialisieren[`Event`](../../../aspose.svg.dom.events/event/) s-Werte. |

### Rückgabewert

Die neu erstellte[`Event`](../../../aspose.svg.dom.events/event/)

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: Wird ausgelöst, wenn die Implementierung den Typ von nicht unterstützt[`Event`](../../../aspose.svg.dom.events/event/) Schnittstelle angefordert |

### Siehe auch

* class [Event](../../../aspose.svg.dom.events/event/)
* class [SVGSVGElement](../)
* namensraum [Aspose.Svg](../../svgsvgelement/)
* Montage [Aspose.SVG](../../../)


