---
title: LinearGradientBrush
second_title: Referencia de Aspose.Drawing para .NET API
description: Encapsula unBrush con un gradiente lineal. Esta clase no se puede heredar.
type: docs
weight: 340
url: /es/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

Encapsula unBrush con un gradiente lineal. Esta clase no se puede heredar.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush#constructor)(Point, Point, Color, Color) | Inicializa una nueva instancia del[`LinearGradientBrush`](../lineargradientbrush) clase con los puntos y colores especificados. |
| [LinearGradientBrush](lineargradientbrush#constructor_1)(PointF, PointF, Color, Color) | Inicializa una nueva instancia del[`LinearGradientBrush`](../lineargradientbrush) clase con los puntos y colores especificados. |
| [LinearGradientBrush](lineargradientbrush#constructor_2)(Rectangle, Color, Color, float) | Inicializa una nueva instancia del[`LinearGradientBrush`](../lineargradientbrush)clase basada en un rectángulo, colores inicial y final, y un ángulo de orientación. |
| [LinearGradientBrush](lineargradientbrush#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Inicializa una nueva instancia del[`LinearGradientBrush`](../lineargradientbrush) clase basada en un rectángulo, colores inicial y final, y orientación. |
| [LinearGradientBrush](lineargradientbrush#constructor_5)(RectangleF, Color, Color, float) | Inicializa una nueva instancia del[`LinearGradientBrush`](../lineargradientbrush)clase basada en un rectángulo, colores inicial y final, y un ángulo de orientación. |
| [LinearGradientBrush](lineargradientbrush#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Inicializa una nueva instancia del[`LinearGradientBrush`](../lineargradientbrush) clase basada en un rectángulo, colores inicial y final, y un modo de orientación. |
| [LinearGradientBrush](lineargradientbrush#constructor_3)(Rectangle, Color, Color, float, bool) | Inicializa una nueva instancia del[`LinearGradientBrush`](../lineargradientbrush)clase basada en un rectángulo, colores inicial y final, y un ángulo de orientación. |
| [LinearGradientBrush](lineargradientbrush#constructor_6)(RectangleF, Color, Color, float, bool) | Inicializa una nueva instancia del[`LinearGradientBrush`](../lineargradientbrush)clase basada en un rectángulo, colores inicial y final, y un ángulo de orientación. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend) { get; set; } | Obtiene o establece unBlend que especifica posiciones y factores que definen una disminución personalizada para el gradiente. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection) { get; set; } | Obtiene o establece un valor que indica si la corrección gamma está habilitada para esteLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors) { get; set; } | Obtiene o establece unColorBlendque define un degradado lineal multicolor. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors) { get; set; } | Obtiene o establece los colores inicial y final del degradado. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle) { get; } | Obtiene una región rectangular que define los puntos inicial y final del degradado. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform) { get; set; } | Obtiene o establece una copiaMatrix que define una transformación geométrica local para esteLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode) { get; set; } | Obtiene o establece unWrapMode enumeración que indica el ajuste mode para esteLinearGradientBrush . |

## Métodos

| Nombre | Descripción |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone)() | Crea una copia exacta de esteLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Libera todos los recursos utilizados por este objeto Brush. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform)(Matrix) | Multiplica elMatrix que representa la transformada geométrica local de esteLinearGradientBrush por el especificadoMatrix anteponiendo el especificadoMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multiplica elMatrix que representa la transformada geométrica local de esteLinearGradientBrush por el especificadoMatrix en el orden especificado. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform)() | Restablece elTransform propiedad a identidad. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform)(float) | Gira la transformación geométrica local en la cantidad especificada. Este método antepone la rotación a la transformación. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Gira la transformación geométrica local en la cantidad especificada en el orden especificado. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform)(float, float) | Escala la transformación geométrica local en las cantidades especificadas. Este método antepone la matriz de escala a la transformación. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Escala la transformación geométrica local en las cantidades especificadas en el orden especificado. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Crea un degradado lineal con un color central y una caída lineal a un solo color en ambos extremos. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Crea un degradado lineal con un color central y una caída lineal a un solo color en ambos extremos. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape)(float) | Crea una caída de degradado basada en una curva en forma de campana. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Crea una caída de degradado basada en una curva en forma de campana. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform)(float, float) | Traduce la transformación geométrica local según las dimensiones especificadas. Este método antepone la traducción a la transformación. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Traduce la transformación geométrica local por las dimensiones especificadas en el orden especificado. |

### Ver también

* class [Brush](../../system.drawing/brush)
* espacio de nombres [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
