---
title: Interface IEventListener
second_title: Aspose.HTML für .NET-API-Referenz
description: Aspose.Html.Dom.Events.IEventListener koppel. DieIEventListenerSchnittstelle ist die primäre Methode zur Behandlung von Ereignissen. Benutzer implementieren dieIEventListener Schnittstelle und registrieren Sie ihren Listener auf einerEventTarget Verwendung derAddEventListener method. Die Benutzer sollten auch ihre entfernenIEventListener von seinemEventTarget nachdem sie die Verwendung des Listeners abgeschlossen haben.
type: docs
weight: 800
url: /de/net/aspose.html.dom.events/ieventlistener/
---
## IEventListener interface

Die`IEventListener`Schnittstelle ist die primäre Methode zur Behandlung von Ereignissen. Benutzer implementieren die`IEventListener` Schnittstelle und registrieren Sie ihren Listener auf einer[`EventTarget`](../../aspose.html.dom/eventtarget/) Verwendung der[`AddEventListener`](../../aspose.html.dom/eventtarget/addeventlistener/) method. Die Benutzer sollten auch ihre entfernen`IEventListener` von seinem[`EventTarget`](../../aspose.html.dom/eventtarget/) nachdem sie die Verwendung des Listeners abgeschlossen haben.

```csharp
public interface IEventListener
```

## Methoden

| Name | Beschreibung |
| --- | --- |
| [HandleEvent](../../aspose.html.dom.events/ieventlistener/handleevent/)(Event) | Diese Methode wird immer dann aufgerufen, wenn ein Ereignis des Typs auftritt, für den die`IEventListener` Schnittstelle wurde registriert. |

### Bemerkungen

Wenn ein Knoten mit der cloneNode-Methode kopiert wird, werden die an den Quellknoten angehängten Ereignis-Listener nicht an den kopierten Knoten angehängt. Wenn der Benutzer möchte, dass dieselben Ereignis-Listener zu der neu erstellten Kopie hinzugefügt werden, muss der Benutzer sie manuell hinzufügen.

### Siehe auch

* namensraum [Aspose.Html.Dom.Events](../../aspose.html.dom.events/)
* Montage [Aspose.HTML](../../)


