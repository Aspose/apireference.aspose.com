---
title: RectangleF
second_title: Referencia de Aspose.Drawing para .NET API
description: Almacena un conjunto de cuatro números de coma flotante que representan la ubicación y el tamaño de un rectángulo. Para funciones de región más avanzadas utilice un objeto Region.
type: docs
weight: 1050
url: /es/net/system.drawing/rectanglef/
---
## RectangleF structure

Almacena un conjunto de cuatro números de coma flotante que representan la ubicación y el tamaño de un rectángulo. Para funciones de región más avanzadas, utilice un objeto Region.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [RectangleF](rectanglef#constructor_1)(PointF, SizeF) | Inicializa una nueva instancia de la estructura RectangleF con la ubicación y el tamaño especificados. |
| [RectangleF](rectanglef#constructor)(float, float, float, float) | Inicializa una nueva instancia de la estructura RectangleF con la ubicación y el tamaño especificados. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom) { get; } | Obtiene la coordenada y que es la suma de Y y Height de esta estructura RectangleF. |
| [Height](../../system.drawing/rectanglef/height) { get; set; } | Obtiene o establece la altura de esta estructura RectangleF. |
| [IsEmpty](../../system.drawing/rectanglef/isempty) { get; } | Obtiene un valor que indica si elWidth oHeight property de esteRectangleFtiene un valor de cero. |
| [Left](../../system.drawing/rectanglef/left) { get; } | Obtiene la coordenada x del borde izquierdo de esta estructura RectangleF. |
| [Location](../../system.drawing/rectanglef/location) { get; set; } | Obtiene o establece las coordenadas de la esquina superior izquierda de esteRectangleF estructura. |
| [Right](../../system.drawing/rectanglef/right) { get; } | Obtiene la coordenada x que es la suma de X y Ancho de esta estructura RectangleF. |
| [Size](../../system.drawing/rectanglef/size) { get; set; } | Obtiene o establece el tamaño de esteRectangleF . |
| [Top](../../system.drawing/rectanglef/top) { get; } | Obtiene la coordenada y del borde superior de esta estructura RectangleF. |
| [Width](../../system.drawing/rectanglef/width) { get; set; } | Obtiene o establece el ancho de esta estructura RectangleF. |
| [X](../../system.drawing/rectanglef/x) { get; set; } | Obtiene o establece la coordenada x de la esquina superior izquierda de esta estructura RectangleF. |
| [Y](../../system.drawing/rectanglef/y) { get; set; } | Obtiene o establece la coordenada x de la esquina superior izquierda de esta estructura RectangleF. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb)(float, float, float, float) | Crea una estructura RectangleF con la esquina superior izquierda y la esquina inferior derecha en las ubicaciones especificadas. |
| static [Inflate](../../system.drawing/rectanglef/inflate)(RectangleF, float, float) | Crea y devuelve una copia inflada del especificadoRectangleF estructura. La copia se infla en la cantidad especificada. El rectángulo original permanece sin modificar. |
| static [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF, RectangleF) | Devuelve unRectangleF estructura que representa la intersección de dos rectángulos. Si no hay intersección, y vacíoRectangleF se devuelve. |
| static [Union](../../system.drawing/rectanglef/union)(RectangleF, RectangleF) | Crea el tercer rectángulo más pequeño posible que puede contener dos rectángulos que forman una unión. |
| [Contains](../../system.drawing/rectanglef/contains#contains_1)(PointF) | Determina si el punto especificado está contenido dentro de esteRectangleF estructura. |
| [Contains](../../system.drawing/rectanglef/contains#contains_2)(RectangleF) | Determina si la región rectangular representada por*rect* está completamente contenido dentro de esteRectangleF estructura. |
| [Contains](../../system.drawing/rectanglef/contains#contains)(float, float) | Determina si el punto especificado está contenido dentro de esteRectangleF estructura. |
| override [Equals](../../system.drawing/rectanglef/equals#equals_1)(object) | Determina si el especificadoObject , es igual a esta instancia. |
| [Equals](../../system.drawing/rectanglef/equals#equals)(RectangleF) | Comprueba si otros[`RectangleF`](../rectanglef) estructura tiene la misma ubicación y tamaño de esta[`RectangleF`](../rectanglef) estructura. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode)() | Devuelve un código hash para esta instancia. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate_1)(SizeF) | infla estoRectangleF por la cantidad especificada. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate)(float, float) | infla estoRectangleF estructura por la cantidad especificada. |
| [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF) | Reemplaza estoRectangleF estructura con la intersección de sí mismo y el especificado RectangleF estructura. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith)(RectangleF) | Determina si este rectángulo se cruza con*rect* . |
| [Offset](../../system.drawing/rectanglef/offset#offset_1)(PointF) | Ajusta la ubicación de este rectángulo en la cantidad especificada. |
| [Offset](../../system.drawing/rectanglef/offset#offset)(float, float) | Ajusta la ubicación de este rectángulo en la cantidad especificada. |
| override [ToString](../../system.drawing/rectanglef/tostring)() | Convierte los atributos de este[`Rectangle`](../rectangle) a una cadena legible por humanos. |
| [operator ==](../../system.drawing/rectanglef/op_equality) | Comprueba si dosRectangleF las estructuras tienen la misma ubicación y tamaño. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit) | Convierte la estructura Rectangle especificada en una estructura RectangleF. |
| [operator !=](../../system.drawing/rectanglef/op_inequality) | Comprueba si dosRectangleF las estructuras difieren en ubicación o tamaño. |

## Campos

| Nombre | Descripción |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty) | Representa una instancia delRectangleF clase con sus miembros sin inicializar. |

### Ver también

* espacio de nombres [System.Drawing](../../system.drawing)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
