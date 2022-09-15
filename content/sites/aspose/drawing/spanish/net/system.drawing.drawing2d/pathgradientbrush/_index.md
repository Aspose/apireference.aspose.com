---
title: PathGradientBrush
second_title: Referencia de Aspose.Drawing para .NET API
description: Encapsula unBrush objeto que llena el interior de unGraphicsPath objeto con degradado. Esta clase no se puede heredar.
type: docs
weight: 400
url: /es/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Encapsula unBrush objeto que llena el interior de unGraphicsPath objeto con degradado. Esta clase no se puede heredar.

```csharp
public sealed class PathGradientBrush : Brush
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PathGradientBrush](pathgradientbrush#constructor)(GraphicsPath) | Inicializa una nueva instancia del[`PathGradientBrush`](../pathgradientbrush) clase con la ruta especificada. |
| [PathGradientBrush](pathgradientbrush#constructor_1)(PointF[]) | Inicializa una nueva instancia del[`PathGradientBrush`](../pathgradientbrush) clase con los puntos especificados. |
| [PathGradientBrush](pathgradientbrush#constructor_3)(Point[]) | Inicializa una nueva instancia del[`PathGradientBrush`](../pathgradientbrush) clase con los puntos especificados. |
| [PathGradientBrush](pathgradientbrush#constructor_2)(PointF[], WrapMode) | Inicializa una nueva instancia del[`PathGradientBrush`](../pathgradientbrush) clase con los puntos especificados y modo de ajuste. |
| [PathGradientBrush](pathgradientbrush#constructor_4)(Point[], WrapMode) | Inicializa una nueva instancia del[`PathGradientBrush`](../pathgradientbrush) clase con los puntos especificados y modo de ajuste. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend) { get; set; } | Obtiene o establece unBlend que especifica posiciones y factores que definen una caída personalizada para el degradado. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor) { get; set; } | Obtiene o establece el color en el centro del degradado de la ruta. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint) { get; set; } | Obtiene o establece el punto central del gradiente de la ruta. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales) { get; set; } | Obtiene o establece el punto de enfoque para la disminución del gradiente. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors) { get; set; } | Obtiene o establece unColorBlendque define un degradado lineal multicolor. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle) { get; } | Obtiene un rectángulo delimitador para estoPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors) { get; set; } | Obtiene o establece una matriz de colores que corresponden a los puntos en la ruta estePathGradientBrush llena. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform) { get; set; } | Obtiene o establece una copia delMatrix que define una transformación geométrica local para estePathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode) { get; set; } | Obtiene o establece unWrapMode que indica el ajuste mode para estePathGradientBrush . |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone)() | Crea una copia exacta de estePathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Libera todos los recursos utilizados por este objeto Brush. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform)(Matrix) | Actualiza la matriz de transformación del pincel con el producto de la matriz de transformación del pincel multiplicado por otra matriz. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Actualiza la matriz de transformación del pincel con el producto de la matriz de transformación del pincel multiplicado por otra matriz. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform)() | Restablece elTransform propiedad a identidad. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform)(float) | Gira la transformación geométrica local en la cantidad especificada. Este método antepone la rotación a la transformación. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Gira la transformación geométrica local en la cantidad especificada en el orden especificado. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform)(float, float) | Escala la transformación geométrica local en las cantidades especificadas. Este método antepone la matriz de escala a la transformación. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Escala la transformación geométrica local en las cantidades especificadas en el orden especificado. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Crea un degradado con un color central y una caída lineal a un color circundante. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Crea un degradado con un color central y una caída lineal para cada color circundante. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape)(float) | Crea un pincel de degradado que cambia de color desde el centro de la ruta hacia afuera hasta el límite de la ruta. La transición de un color a otro se basa en una curva en forma de campana. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Crea un pincel de degradado que cambia de color desde el centro de la ruta hacia afuera hasta el límite de la ruta. La transición de un color a otro se basa en una curva en forma de campana. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform)(float, float) | Aplica la traducción especificada a la transformación geométrica local. Este método antepone la traducción a la transformación. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Aplica la traslación especificada a la transformación geométrica local en el orden especificado. |

### Ver también

* class [Brush](../../system.drawing/brush)
* espacio de nombres [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
