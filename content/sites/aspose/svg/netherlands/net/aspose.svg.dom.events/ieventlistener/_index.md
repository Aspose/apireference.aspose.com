---
title: Interface IEventListener
second_title: Aspose.SVG voor .NET API-referentie
description: Aspose.Svg.Dom.Events.IEventListener koppel. DeIEventListenerinterface is de primaire methode voor het afhandelen van gebeurtenissen. Gebruikers implementeren deIEventListener interface en registreer hun luisteraar op eenEventTarget de ... gebruikenAddEventListener method. De gebruikers moeten ook hunIEventListener van zijnEventTarget nadat ze klaar zijn met het gebruik van de luisteraar.
type: docs
weight: 950
url: /nl/net/aspose.svg.dom.events/ieventlistener/
---
## IEventListener interface

De`IEventListener`interface is de primaire methode voor het afhandelen van gebeurtenissen. Gebruikers implementeren de`IEventListener` interface en registreer hun luisteraar op een[`EventTarget`](../../aspose.svg.dom/eventtarget/) de ... gebruiken[`AddEventListener`](../../aspose.svg.dom/eventtarget/addeventlistener/) method. De gebruikers moeten ook hun`IEventListener` van zijn[`EventTarget`](../../aspose.svg.dom/eventtarget/) nadat ze klaar zijn met het gebruik van de luisteraar.

```csharp
public interface IEventListener
```

## methoden

| Naam | Beschrijving |
| --- | --- |
| [HandleEvent](../../aspose.svg.dom.events/ieventlistener/handleevent/)(Event) | Deze methode wordt aangeroepen wanneer er een gebeurtenis plaatsvindt van het type waarvoor de`IEventListener` interface is geregistreerd. |

### Opmerkingen

Wanneer een Node wordt gekopieerd met behulp van de cloneNode-methode, zijn de gebeurtenislisteners die zijn gekoppeld aan de bronnode niet gekoppeld aan de gekopieerde node. Als de gebruiker wil dat dezelfde gebeurtenislisteners worden toegevoegd aan de nieuw gemaakte kopie, moet de gebruiker deze handmatig toevoegen.

### Zie ook

* naamruimte [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* montage [Aspose.SVG](../../)


