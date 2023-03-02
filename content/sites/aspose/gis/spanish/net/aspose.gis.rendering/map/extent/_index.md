---
title: Map.Extent
second_title: Referencia de API de Aspose.GIS para .NET
description: Map propiedad. Especifica los límites del mapa para renderizar. Si se establece ennull  la extensión se calcula durante el renderizado para incluir todas las geometrías en todas las capas.
type: docs
weight: 40
url: /es/net/aspose.gis.rendering/map/extent/
---
## Map.Extent property

Especifica los límites del mapa para renderizar. Si se establece en`null` , la extensión se calcula durante el renderizado para incluir todas las geometrías en todas las capas.

```csharp
public Extent Extent { get; set; }
```

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentException | [`IsValid`](../../../aspose.gis/extent/isvalid/) es`false`.[`Width`](../../../aspose.gis/extent/width/) es menor o igual a cero.[`Height`](../../../aspose.gis/extent/height/) es menor o igual a cero.[`SpatialReferenceSystem`](../../../aspose.gis/extent/spatialreferencesystem/) es`null`. |

### Observaciones

Si el sistema de referencia espacial de la extensión no es igual al sistema de referencia espacial del mapa, la extensión se transforma al sistema de referencia espacial de destino durante la representación.

### Ver también

* class [Extent](../../../aspose.gis/extent/)
* class [Map](../)
* espacio de nombres [Aspose.Gis.Rendering](../../map/)
* asamblea [Aspose.GIS](../../../)


