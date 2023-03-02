---
title: Class LayeredSymbolizer
second_title: Aspose.GIS für .NET-API-Referenz
description: Aspose.Gis.Rendering.Symbolizers.LayeredSymbolizer klas. Ein Symbolisierer der mehrere andere Symbolisierer rendert.
type: docs
weight: 1830
url: /de/net/aspose.gis.rendering.symbolizers/layeredsymbolizer/
---
## LayeredSymbolizer class

Ein Symbolisierer, der mehrere andere Symbolisierer rendert.

```csharp
public class LayeredSymbolizer : VectorSymbolizer, IReadOnlyList<VectorSymbolizer>
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [LayeredSymbolizer](layeredsymbolizer/#constructor)() | Erstellt eine neue Instanz. |
| [LayeredSymbolizer](layeredsymbolizer/#constructor_1)(RenderingOrder) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/count/) { get; } | Ruft die Anzahl der Symbolisierer ab. |
| [Item](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/item/) { get; } | Ruft den Symbolisierer am angegebenen index ab. |
| [RenderingOrder](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/renderingorder/) { get; set; } | Bestimmt die Renderreihenfolge. ByFeatures - rendert alle Symbolisierer für das Feature und fährt dann mit dem nächsten Feature fort.ByLayers - Rendern Sie alle Features mit dem Symbolisierer und fahren Sie dann mit dem nächsten Symbolisierer fort. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/add/)(VectorSymbolizer) | Fügt den angegebenen Symbolisierer hinzu. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/getenumerator/)() | Gibt einen Enumerator zurück, der die Auflistung durchläuft. |

### Siehe auch

* class [VectorSymbolizer](../vectorsymbolizer/)
* namensraum [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* Montage [Aspose.GIS](../../)


