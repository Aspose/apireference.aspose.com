---
title: Pen
second_title: Referencia de Aspose.Drawing para .NET API
description: Define un objeto utilizado para dibujar líneas y curvas.
type: docs
weight: 910
url: /es/net/system.drawing/pen/
---
## Pen class

Define un objeto utilizado para dibujar líneas y curvas.

```csharp
public class Pen : IDisposable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Pen](pen#constructor)(Brush) | Inicializa una nueva instancia del[`Pen`](../pen) clase con el especificadoBrush . |
| [Pen](pen#constructor_2)(Color) | Inicializa una nueva instancia del[`Pen`](../pen) clase con el especificadoColor . |
| [Pen](pen#constructor_1)(Brush, float) | Inicializa una nueva instancia de la clase Pen con el Brush y Width especificados. |
| [Pen](pen#constructor_3)(Color, float) | Inicializa una nueva instancia de la clase Pen con las propiedades Color y Width especificadas. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment) { get; set; } | Obtiene o establece la alineación para estePen . |
| [Brush](../../system.drawing/pen/brush) { get; set; } | Obtiene o establece el Brush que determina los atributos de estePen . |
| [Color](../../system.drawing/pen/color) { get; set; } | Obtiene o establece el color de estePen . |
| [CompoundArray](../../system.drawing/pen/compoundarray) { get; set; } | Obtiene o establece una matriz de valores que especifica una pluma compuesta. Un bolígrafo compuesto dibuja una línea compuesta formada por líneas paralelas y espacios. |
| [CustomEndCap](../../system.drawing/pen/customendcap) { get; set; } | Obtiene o establece un límite personalizado para usar al final de las líneas dibujadas con estePen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap) { get; set; } | Obtiene o establece un límite personalizado para usar al comienzo de las líneas dibujadas con estePen . |
| [DashCap](../../system.drawing/pen/dashcap) { get; set; } | Obtiene o establece el estilo de mayúscula utilizado al final de los guiones que forman las líneas discontinuas dibujadas con this Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset) { get; set; } | Obtiene o establece la distancia desde el inicio de una línea hasta el inicio de un patrón de guiones. |
| [DashPattern](../../system.drawing/pen/dashpattern) { get; set; } | Obtiene o establece una matriz de guiones y espacios personalizados. |
| [DashStyle](../../system.drawing/pen/dashstyle) { get; set; } | Obtiene o establece el estilo utilizado para las líneas discontinuas dibujadas con estePen . |
| [EndCap](../../system.drawing/pen/endcap) { get; set; } | Obtiene o establece el estilo de mayúscula utilizado al final de las líneas dibujadas con este Pen. |
| [LineJoin](../../system.drawing/pen/linejoin) { get; set; } | Obtiene o establece el estilo de unión para los extremos de dos líneas consecutivas dibujadas con este Pen. |
| [MiterLimit](../../system.drawing/pen/miterlimit) { get; set; } | Obtiene o establece el límite del grosor de la unión en una esquina a inglete. |
| [PenType](../../system.drawing/pen/pentype) { get; } | Obtiene el estilo de las líneas dibujadas con este Pen. |
| [StartCap](../../system.drawing/pen/startcap) { get; set; } | Obtiene o establece el estilo de mayúscula utilizado al principio de las líneas dibujadas con este Pen. |
| [Transform](../../system.drawing/pen/transform) { get; set; } | Obtiene o establece una copia de la transformación geométrica para estePen . |
| [Width](../../system.drawing/pen/width) { get; set; } | Obtiene o establece el ancho de este Pen, en unidades del objeto Graphics utilizado para dibujar. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../system.drawing/pen/clone)() | Crea una copia exacta de estePen . |
| [Dispose](../../system.drawing/pen/dispose)() | Libera todos los recursos usados por este Pen. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform)(Matrix) | Multiplica la matriz de transformación para estePen por el especificadoMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Multiplica la matriz de transformación para estePen por el especificadoMatrix en el orden especificado. |
| [ResetTransform](../../system.drawing/pen/resettransform)() | Restablece la matriz de transformación geométrica para estePen a identidad. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform)(float) | Gira la transformación geométrica local en el ángulo especificado. Este método antepone la rotación a la transformación. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Gira la transformación geométrica local el ángulo especificado en el orden especificado. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform)(float, float) | Escala la transformación geométrica local según los factores especificados. Este método antepone la matriz de escala a la transformación. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Escala la transformación geométrica local según los factores especificados en el orden especificado. |
| [SetLineCap](../../system.drawing/pen/setlinecap)(LineCap, LineCap, DashCap) | Establece los valores que determinan el estilo de cap usado para terminar las líneas dibujadas por este[`Pen`](../pen) . |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform)(float, float) | Traduce la transformación geométrica local por las dimensiones especificadas. Este método antepone la traducción a la transformación. |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Traduce la transformación geométrica local por las dimensiones especificadas en el orden especificado. |

### Ver también

* espacio de nombres [System.Drawing](../../system.drawing)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
