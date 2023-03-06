---
title: Class Map
second_title: Referencia de API de Aspose.GIS para .NET
description: Aspose.Gis.Rendering.Map clase. El mapa es una colección de capas que se pueden representar una encima de la otra medianteRenderer .
type: docs
weight: 1720
url: /es/net/aspose.gis.rendering/map/
---
## Map class

El mapa es una colección de capas que se pueden representar una encima de la otra mediante[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | Crea una nueva instancia del`Mapa` clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | Color de fondo del mapa. Predeterminado aTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | Obtiene el número de capas en el mapa. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | Especifica los límites del mapa para renderizar. Si se establece en`null` , la extensión se calcula durante el renderizado para incluir todas las geometrías en todas las capas. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | Altura visual del mapa. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | Obtiene la capa en el índice especificado. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | Especifica el relleno para agregar a la extensión. |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | Resolución que se usará para representar este mapa y para convertir entre[`Measurement`](../measurement/) . El valor predeterminado es 96. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) del mapa |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | Ancho visual del mapa. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | Crea y agrega un[`VectorMapLayer`](../vectormaplayer/) al mapa Las capas se renderizan en orden adicional. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | Agrega una capa al mapa. Las capas se renderizan en orden adicional. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | Crea y agrega un[`VectorMapLayer`](../vectormaplayer/) al mapa Las capas se renderizan en orden adicional. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | Crea un[`VectorMapLayer`](../vectormaplayer/) con el símbolo predeterminado y lo agrega al mapa. Las capas se renderizan en orden adicional. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Crea y agrega un[`VectorMapLayer`](../vectormaplayer/) al mapa Las capas se renderizan en orden adicional. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | Crea un[`RasterMapLayer`](../rastermaplayer/) con el colorizador predeterminado y lo agrega al mapa. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | Crea y agrega un[`VectorMapLayer`](../vectormaplayer/) al mapa Las capas se renderizan en orden adicional. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | Crea y agrega un[`VectorMapLayer`](../vectormaplayer/) al mapa Las capas se renderizan en orden adicional. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | Dispone de recursos. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | Devuelve un enumerador que itera a través de las capas del mapa. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | Representa el mapa en un archivo. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | Representa el mapa en un archivo. |

### Ver también

* class [MapLayer](../maplayer/)
* espacio de nombres [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* asamblea [Aspose.GIS](../../)


