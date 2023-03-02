---
title: Map.Extent
second_title: Aspose.GIS für .NET-API-Referenz
description: Map eigendom. Gibt die Grenzen der zu rendernden Karte an. Wenn eingestellt aufnull  wird die Ausdehnung während des Renderns berechnet um alle Geometrien in allen Layern einzuschließen.
type: docs
weight: 40
url: /de/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

Gibt die Grenzen der zu rendernden Karte an. Wenn eingestellt auf`null` , wird die Ausdehnung während des Renderns berechnet, um alle Geometrien in allen Layern einzuschließen.

```csharp
public Extent Extent { get; set; }
```

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) Ist`false`.[`Width`](../../../aspose.gis/extent/width/) kleiner oder gleich Null ist.[`Height`](../../../aspose.gis/extent/height/) kleiner oder gleich Null ist.[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) Ist`null`. |

### Bemerkungen

Wenn das räumliche Bezugssystem der Ausdehnung nicht gleich dem räumlichen Bezugssystem der Karte ist, wird die Ausdehnung während des Renderns in das räumliche Bezugssystem des Ziels transformiert.

### Siehe auch

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* namensraum [Aspose.Gis.Rendering](../../map/)
* Montage [Aspose.GIS](../../../)


