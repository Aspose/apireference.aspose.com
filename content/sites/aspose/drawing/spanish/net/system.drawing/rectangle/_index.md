---
title: Rectangle
second_title: Referencia de Aspose.Drawing para .NET API
description: Almacena un conjunto de cuatro enteros que representan la ubicación y el tamaño de un rectángulo.
type: docs
weight: 1040
url: /es/net/system.drawing/rectangle/
---
## Rectangle structure

Almacena un conjunto de cuatro enteros que representan la ubicación y el tamaño de un rectángulo.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Rectangle](rectangle#constructor_1)(Point, Size) | Inicializa una nueva instancia del[`Rectangle`](../rectangle) estructura con la ubicación y el tamaño especificados. |
| [Rectangle](rectangle#constructor)(int, int, int, int) | Inicializa una nueva instancia de la estructura Rectangle con la ubicación y el tamaño especificados. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom) { get; } | Obtiene la coordenada y que es la suma de los valores de propiedad Y y Altura de esta estructura Rectangle. |
| [Height](../../system.drawing/rectangle/height) { get; set; } | Obtiene o establece la altura de esta estructura Rectangle. |
| [IsEmpty](../../system.drawing/rectangle/isempty) { get; } | Obtiene un valor que indica si todas las propiedades numéricas de este[`Rectangle`](../rectangle) tener valores de cero. |
| [Left](../../system.drawing/rectangle/left) { get; } | Obtiene la coordenada x del borde izquierdo de esta estructura Rectangle. |
| [Location](../../system.drawing/rectangle/location) { get; set; } | Obtiene o establece las coordenadas de la esquina superior izquierda de esteRectangle estructura. |
| [Right](../../system.drawing/rectangle/right) { get; } | Obtiene la coordenada x que es la suma de los valores de propiedad X y Width de esta estructura Rectangle. |
| [Size](../../system.drawing/rectangle/size) { get; set; } | Obtiene o establece el tamaño de esteRectangle . |
| [Top](../../system.drawing/rectangle/top) { get; } | Obtiene la coordenada y del borde superior de esta estructura Rectangle. |
| [Width](../../system.drawing/rectangle/width) { get; set; } | Obtiene o establece el ancho de esta estructura Rectangle. |
| [X](../../system.drawing/rectangle/x) { get; set; } | Obtiene o establece la coordenada x de la esquina superior izquierda de esta estructura Rectangle. |
| [Y](../../system.drawing/rectangle/y) { get; set; } | Obtiene o establece la coordenada y de la esquina superior izquierda de esta estructura Rectangle. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling)(RectangleF) | Convierte el especificadoRectangleF estructura a unRectangle estructura redondeando elRectangleF valores a los siguientes valores enteros más altos. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb)(int, int, int, int) | Crea unRectangle estructura con las ubicaciones de borde especificadas. |
| static [Inflate](../../system.drawing/rectangle/inflate)(Rectangle, int, int) | Crea un[`Rectangle`](../rectangle) que está inflado por la cantidad especificada. |
| static [Intersect](../../system.drawing/rectangle/intersect)(Rectangle, Rectangle) | Devuelve un tercioRectangle estructura que representa la intersección de otros dosRectangle estructuras Si no hay intersección, un vacíoRectangle se devuelve. |
| static [Round](../../system.drawing/rectangle/round)(RectangleF) | Convierte el especificadoRectangleF a unRectangle redondeando elRectangleFvalores a los valores enteros más cercanos. |
| static [Truncate](../../system.drawing/rectangle/truncate)(RectangleF) | Convierte el especificadoRectangleF a unRectangle al truncar elRectangleF valores. |
| static [Union](../../system.drawing/rectangle/union)(Rectangle, Rectangle) | Obtiene unRectangle estructura que contiene la unión de dosRectangle estructuras. |
| [Contains](../../system.drawing/rectangle/contains#contains_1)(Point) | Determina si el punto especificado está contenido dentro de esteRectangle estructura. |
| [Contains](../../system.drawing/rectangle/contains#contains_2)(Rectangle) | Determina si la región rectangular representada por*rect* está completamente contenido dentro de la región rectangular representada por este[`Rectangle`](../rectangle) . |
| [Contains](../../system.drawing/rectangle/contains#contains)(int, int) | Determina si el punto especificado está contenido dentro de esteRectangle estructura. |
| override [Equals](../../system.drawing/rectangle/equals#equals_1)(object) | Comprueba si obj es unRectangle estructura con la misma ubicación y tamaño de estaRectangle estructura. |
| [Equals](../../system.drawing/rectangle/equals#equals)(Rectangle) | Comprueba si otros[`Rectangle`](../rectangle) estructura tiene la misma ubicación y tamaño de esta[`Rectangle`](../rectangle) estructura. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode)() | Devuelve el código hash para esteRectangle estructura. Para obtener información sobre el uso de códigos hash, consulte GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate#inflate_1)(Size) | Amplía estoRectangle por la cantidad especificada. |
| [Inflate](../../system.drawing/rectangle/inflate#inflate)(int, int) | Amplía estoRectangle por la cantidad especificada. |
| [Intersect](../../system.drawing/rectangle/intersect)(Rectangle) | Reemplaza estoRectanglecon la intersección de sí mismo y el especificadoRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith)(Rectangle) | Determina si este rectángulo se cruza con*rect* . |
| [Offset](../../system.drawing/rectangle/offset#offset_1)(Point) | Ajusta la ubicación de este rectángulo en la cantidad especificada. |
| [Offset](../../system.drawing/rectangle/offset#offset)(int, int) | Ajusta la ubicación de este rectángulo en la cantidad especificada. |
| override [ToString](../../system.drawing/rectangle/tostring)() | Convierte los atributos de este[`Rectangle`](../rectangle) a una cadena legible por humanos. |
| [operator ==](../../system.drawing/rectangle/op_equality) | Comprueba si dosRectangle las estructuras tienen la misma ubicación y tamaño. |
| [operator !=](../../system.drawing/rectangle/op_inequality) | Comprueba si dosRectangle las estructuras difieren en ubicación o tamaño. |

## Campos

| Nombre | Descripción |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty) | Representa unRectangle estructura con sus propiedades sin inicializar. |

### Ver también

* espacio de nombres [System.Drawing](../../system.drawing)
* asamblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
