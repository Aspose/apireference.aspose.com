---
title: Class XpsPathGeometry
second_title: Referencia de la API de Aspose.Page para .NET
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry clase. Clase que encapsula características del elemento de propiedad PathGeometry. Este elemento contiene un conjunto de figuras de ruta especificadas con el atributo Figures o con un elemento secundario PathFigure.
type: docs
weight: 3280
url: /es/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

Clase que encapsula características del elemento de propiedad PathGeometry. Este elemento contiene un conjunto de figuras de ruta especificadas con el atributo Figures o con un elemento secundario PathFigure.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | Devuelve/establece el valor que especifica cómo se combinan las áreas de intersección de formas geométricas para formar una región. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | Devuelve una lista de cifras de rutas secundarias. |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | Devuelve/establece la matriz de transformación afín que establece la transformación de matriz local que se aplica a todos los elementos secundarios y descendientes de la geometría de ruta antes de que se use para rellenar, recortar o trazar. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | Agrega un segmento de ruta a la lista de segmentos secundarios de la última figura pah. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | Clona esta geometría de ruta. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | Inserta un segmento de ruta en la lista de segmentos secundarios de la última figura de ruta en*index* posición. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | Elimina un segmento de ruta de la lista de segmentos secundarios de la última figura de ruta. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | Elimina un segmento de ruta de la lista de segmentos secundarios de la última figura de ruta en*index* posición. |

### Ver también

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* espacio de nombres [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* asamblea [Aspose.Page](../../)


