---
title: Class BezierPathBuilder
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.ImageVectorization.BezierPathBuilder clase. ElSplinePathBuilder la clase es responsable de construir segmentos de rutaSVGPathSeg de la lista de puntos de seguimiento. Este generador de ruta se basa en el uso del método de mínimos cuadrados para encontrar puntos de control Bezier para el seguimiento de puntos.
type: docs
weight: 2080
url: /es/net/aspose.svg.imagevectorization/bezierpathbuilder/
---
## BezierPathBuilder class

El[`SplinePathBuilder`](../splinepathbuilder/) la clase es responsable de construir segmentos de ruta[`SVGPathSeg`](../../aspose.svg.paths/svgpathseg/) de la lista de puntos de seguimiento. Este generador de ruta se basa en el uso del método de mínimos cuadrados para encontrar puntos de control Bezier para el seguimiento de puntos.

```csharp
public class BezierPathBuilder : IPathBuilder
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [BezierPathBuilder](bezierpathbuilder/)() | Inicializa una nueva instancia del`BezierPathBuilder` clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [ErrorThreshold](../../aspose.svg.imagevectorization/bezierpathbuilder/errorthreshold/) { get; set; } | Obtiene o establece el umbral de error. Este parámetro define la desviación máxima de los puntos a la curva ajustada. Por defecto es 30. |
| [MaxIterations](../../aspose.svg.imagevectorization/bezierpathbuilder/maxiterations/) { get; set; } | Obtiene o establece el umbral de error. Este parámetro define el número de iteraciones para el método de aproximación de mínimos cuadrados. Por defecto es 30. |
| [TraceSmoother](../../aspose.svg.imagevectorization/bezierpathbuilder/tracesmoother/) { get; set; } | Obtiene o establece la traza más suave. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Build](../../aspose.svg.imagevectorization/bezierpathbuilder/build/)(IEnumerable&lt;PointF&gt;, SVGPathElement) | Construye segmentos de ruta a partir de la lista de puntos de seguimiento. |

### Ver también

* interface [IPathBuilder](../ipathbuilder/)
* espacio de nombres [Aspose.Svg.ImageVectorization](../../aspose.svg.imagevectorization/)
* asamblea [Aspose.SVG](../../)


