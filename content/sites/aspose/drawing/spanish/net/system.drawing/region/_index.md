---
title: Region
second_title: Referencia de Aspose.Drawing para .NET API
description: Describe el interior de una forma gráfica compuesta de rectángulos y caminos. Esta clase no se puede heredar.
type: docs
weight: 1060
url: /es/net/system.drawing/region/
---
## Region class

Describe el interior de una forma gráfica compuesta de rectángulos y caminos. Esta clase no se puede heredar.

```csharp
public sealed class Region : IDisposable
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Region](region#constructor)() | Inicializa una nueva instancia del[`Region`](../region) clase. |
| [Region](region#constructor_1)(GraphicsPath) | Inicializa una nueva instancia del[`Region`](../region) clase con el especificadoGraphicsPath . |
| [Region](region#constructor_3)(Rectangle) | Inicializa una nueva instancia del[`Region`](../region) clase de la especificadaRectangle estructura. |
| [Region](region#constructor_4)(RectangleF) | Inicializa una nueva instancia del[`Region`](../region) clase de la especificadaRectangleF estructura. |
| [Region](region#constructor_2)(RegionData) | Inicializa una nueva instancia del[`Region`](../region) clase de los datos especificados. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../system.drawing/region/clone)() | Crea una copia exacta de esteRegion . |
| [Complement](../../system.drawing/region/complement#complement)(GraphicsPath) | Actualiza estoRegion para contener la porción de lo especificadoGraphicsPath que does no se cruza con estoRegion . |
| [Complement](../../system.drawing/region/complement#complement_1)(Rectangle) | Actualiza estoRegion para contener la porción de lo especificadoRectangle estructura que no se cruza con estaRegion . |
| [Complement](../../system.drawing/region/complement#complement_2)(RectangleF) | Actualiza estoRegion para contener la porción de lo especificadoRectangleF estructura que no se cruza con estaRegion . |
| [Complement](../../system.drawing/region/complement#complement_3)(Region) | Actualiza estoRegion para contener la porción de lo especificadoRegion que no se cruza con estoRegion . |
| [Dispose](../../system.drawing/region/dispose)() | Libera todos los recursos utilizados por esteRegion . |
| [Equals](../../system.drawing/region/equals#equals)(Region, Graphics) | Comprueba si el especificadoRegion es identico a esteRegion en la superficie de dibujo especificada. |
| [Exclude](../../system.drawing/region/exclude#exclude)(GraphicsPath) | Actualiza estoRegion para contener solo la parte de su interior que no se cruza con el especificadoGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude#exclude_1)(Rectangle) | Actualiza estoRegion para contener solo la parte de su interior que no interseca con el especificadoRectangle estructura. |
| [Exclude](../../system.drawing/region/exclude#exclude_2)(RectangleF) | Actualiza estoRegion para contener solo la parte de su interior que no se cruza con el especificadoRectangleF estructura. |
| [Exclude](../../system.drawing/region/exclude#exclude_3)(Region) | Actualiza estoRegion para contener solo la parte de su interior que no interseca con el especificadoRegion . |
| [GetBounds](../../system.drawing/region/getbounds)(Graphics) | Obtiene unRectangleFestructura que representa un rectángulo que delimita esteRegion en la superficie de dibujo de unGraphics objeto. |
| [GetRegionData](../../system.drawing/region/getregiondata)() | Devuelve unRegionData que representa la información que describe esteRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans)(Matrix) | Devuelve una matriz deRectangleF estructuras que se aproximan a esteRegion después de aplicar la transformación matricial especificada. |
| [Intersect](../../system.drawing/region/intersect#intersect)(GraphicsPath) | Actualiza estoRegion a la intersección de sí mismo con el especificadoGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect#intersect_1)(Rectangle) | Actualiza estoRegion a la intersección de sí mismo con el especificadoRectangle estructura. |
| [Intersect](../../system.drawing/region/intersect#intersect_2)(RectangleF) | Actualiza estoRegion a la intersección de sí mismo con el especificado RectangleF estructura. |
| [Intersect](../../system.drawing/region/intersect#intersect_3)(Region) | Actualiza estoRegion a la intersección de sí mismo con el especificadoRegion . |
| [IsEmpty](../../system.drawing/region/isempty)(Graphics) | Comprueba si esteRegion tiene un interior vacío en la superficie de dibujo especificada. |
| [IsInfinite](../../system.drawing/region/isinfinite)(Graphics) | Comprueba si esteRegion tiene un interior infinito en la superficie de dibujo especificada. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_7)(Point) | Comprueba si el especificadoPoint estructura está contenida dentro de esteRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_9)(PointF) | Comprueba si el especificadoPointF estructura está contenida dentro de esteRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_11)(Rectangle) | Comprueba si alguna parte del valor especificadoRectangle la estructura está contenida dentro de this Region . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_13)(RectangleF) | Comprueba si alguna parte del valor especificadoRectangleF la estructura está contenida dentro de esteRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_3)(float, float) | Comprueba si el punto especificado está contenido dentro de esteRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_8)(Point, Graphics) | Comprueba si el especificadoPoint estructura está contenida dentro de esteRegion cuando se dibuja usando el especificadoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_10)(PointF, Graphics) | Comprueba si el especificadoPointF estructura está contenida dentro de esteRegion cuando se dibuja usando el especificadoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_12)(Rectangle, Graphics) | Comprueba si alguna parte del valor especificadoRectangle la estructura está contenida dentro de esteRegion cuando se dibuja usando el especificadoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_14)(RectangleF, Graphics) | Comprueba si alguna parte del valor especificadoRectangleF la estructura está contenida dentro de esteRegion cuando se dibuja usando el especificadoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_6)(float, float, Graphics) | Comprueba si el punto especificado está contenido dentro de esteRegion cuando se dibuja usando el especificadoGraphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_2)(int, int, Graphics) | Comprueba si el punto especificado está contenido dentro de esteRegion objeto cuando se dibuja usando el especificadoGraphics objeto. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_4)(float, float, float, float) | Comprueba si alguna parte del rectángulo especificado está contenida dentro de esteRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible)(int, int, int, int) | Comprueba si alguna parte del rectángulo especificado está contenida dentro de esteRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_5)(float, float, float, float, Graphics) | Comprueba si alguna parte del rectángulo especificado está contenida dentro de esteRegion cuando se dibuja usando el especificadoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_1)(int, int, int, int, Graphics) | Comprueba si alguna parte del rectángulo especificado está contenida dentro de esteRegion cuando se dibuja usando el especificadoGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty)() | Inicializa estoRegion a un interior vacío. |
| [MakeInfinite](../../system.drawing/region/makeinfinite)() | Inicializa estoRegion objeto a un interior infinito. |
| [Transform](../../system.drawing/region/transform)(Matrix) | Transforma estoRegion por el especificadoMatrix . |
| [Translate](../../system.drawing/region/translate#translate_1)(float, float) | Desplaza las coordenadas de esteRegion por la cantidad especificada. |
| [Translate](../../system.drawing/region/translate#translate)(int, int) | Desplaza las coordenadas de esteRegion por la cantidad especificada. |
| [Union](../../system.drawing/region/union#union)(GraphicsPath) | Actualiza estoRegion a la unión de sí mismo y lo especificadoGraphicsPath . |
| [Union](../../system.drawing/region/union#union_1)(Rectangle) | Actualiza estoRegion a la unión de sí mismo y lo especificadoRectangle estructura. |
| [Union](../../system.drawing/region/union#union_2)(RectangleF) | Actualiza estoRegion a la unión de sí mismo y lo especificadoRectangleF estructura. |
| [Union](../../system.drawing/region/union#union_3)(Region) | Actualiza estoRegion a la unión de sí mismo y lo especificadoRegion . |
| [Xor](../../system.drawing/region/xor#xor)(GraphicsPath) | Actualiza estoRegion la unión menos la intersección de sí mismo con el especificadoGraphicsPath . |
| [Xor](../../system.drawing/region/xor#xor_1)(Rectangle) | Actualiza estoRegion la unión menos la intersección de sí mismo con el especificadoRectangle estructura. |
| [Xor](../../system.drawing/region/xor#xor_2)(RectangleF) | Actualiza estoRegion a la unión menos la intersección de sí mismo con el especificadoRectangleF estructura. |
| [Xor](../../system.drawing/region/xor#xor_3)(Region) | Actualiza estoRegion la unión menos la intersección de sí mismo con el especificadoRegion . |

### Ver también

* espacio de nombres [System.Drawing](../../system.drawing)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
