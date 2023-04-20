---
title: Class SplinePathBuilder
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.ImageVectorization.SplinePathBuilder clase. ElSplinePathBuilder la clase es responsable de construir segmentos de rutaSVGPathSeg de la lista de puntos de seguimiento. Este generador de ruta se basa en la aplicación de una spline CatmullRoma a un conjunto de puntos de ruta suavizados y reducidos..
type: docs
weight: 2160
url: /es/net/aspose.svg.imagevectorization/splinepathbuilder/
---
## SplinePathBuilder class

El`SplinePathBuilder` la clase es responsable de construir segmentos de ruta[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) de la lista de puntos de seguimiento. Este generador de ruta se basa en la aplicación de una spline Catmull-Roma a un conjunto de puntos de ruta suavizados y reducidos..

```csharp
public class SplinePathBuilder : IPathBuilder
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [SplinePathBuilder](splinepathbuilder/#constructor)() | Inicializa una nueva instancia del`SplinePathBuilder` clase. |
| [SplinePathBuilder](splinepathbuilder/#constructor_2)(float) | Inicializa una nueva instancia del`SplinePathBuilder` clase. |
| [SplinePathBuilder](splinepathbuilder/#constructor_1)(IImageTraceSmoother, IImageTraceSimplifier, float) | Inicializa una nueva instancia del`SplinePathBuilder` clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Tension](../../aspose.svg.imagevectorization/splinepathbuilder/tension/) { get; set; } | El valor de las tensiones afecta la forma en que la curva se dobla en los puntos de control (interpolados). Debe estar en el rango de 0 a 1. Cualquier valor mayor o menor se alineará con los valores mínimo y máximo de este rango, en consecuencia. |
| [TraceSimplifier](../../aspose.svg.imagevectorization/splinepathbuilder/tracesimplifier/) { get; set; } | Obtiene o establece el simplificador de seguimiento. |
| [TraceSmoother](../../aspose.svg.imagevectorization/splinepathbuilder/tracesmoother/) { get; set; } | Obtiene o establece la traza más suave. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/splinepathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Construye segmentos de ruta a partir de la lista de puntos de seguimiento. |

### Ver también

* interface [IPathBuilder](../ipathbuilder/)
* espacio de nombres [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* asamblea [Aspose.SVG](../../)


