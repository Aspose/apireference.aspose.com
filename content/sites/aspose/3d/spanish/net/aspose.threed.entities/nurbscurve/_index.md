---
title: NurbsCurve
second_title: Referencia de API de Aspose.3D para .NET
description: Curva NURBShttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline es una curva representada por NURBS spline de base racional no uniforme Una curva NURBS se define por suOrder./nurbscurve/order  un conjunto de pesosControlPoints./geometry/controlpoints y unKnotVectors./nurbscurve/knotvectors El componente w en el punto de control se usa como peso del punto de control cualquiera que sea unTwoDimensional oThreeDimensional
type: docs
weight: 460
url: /es/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[Curva NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) es una curva representada por NURBS (spline de base racional no uniforme), Una curva NURBS se define por su[`Order`](./order) , un conjunto de pesos[`ControlPoints`](../geometry/controlpoints) y un[`KnotVectors`](./knotvectors) El componente w en el punto de control se usa como peso del punto de control, cualquiera que sea unTwoDimensional oThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [NurbsCurve](nurbscurve#constructor)() | Inicializa una nueva instancia del[`NurbsCurve`](../nurbscurve) clase. |
| [NurbsCurve](nurbscurve#constructor_1)(string) | Inicializa una nueva instancia del[`NurbsCurve`](../nurbscurve) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color) { get; set; } | Obtiene o establece el color de la línea, el valor predeterminado es blanco (1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints) { get; } | Obtiene todos los puntos de control |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype) { get; set; } | Obtiene o establece el tipo de curva. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension) { get; set; } | Obtiene o establece la dimensión de la curva. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtiene o establece si se excluye esta entidad durante la exportación. |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors) { get; } | Obtiene el vector nudo, es una secuencia de valores de parámetros que determina dónde y cómo afectan los puntos de control a la curva NURBS. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity) { get; } | Obtiene la multiplicidad. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [Order](../../aspose.threed.entities/nurbscurve/order) { get; set; } | Obtiene o establece el orden de una curva NURBS, define el número de puntos de control cercanos que influyen en cualquier punto de la curva. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtiene o establece el primer nodo principal; si se establece el primer nodo principal, esta entidad se separará de otros nodos principales. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtiene todos los nodos principales, una entidad se puede adjuntar a varios nodos principales para crear instancias de geometría |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [Rational](../../aspose.threed.entities/nurbscurve/rational) { get; set; } | Obtiene o establece si es racional, este valor indica si este[`NurbsCurve`](../nurbscurve) es spline racional o spline no racional. B-spline no racional es un caso especial de B-splines racionales. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtiene la escena a la que pertenece este objeto |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate)(int) | Evaluar la curva NURBS |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat)(double) | Evaluar el punto de la curva en la posición especificada |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtiene el cuadro delimitador de la entidad actual en su sistema de coordenadas de espacio de objetos. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey)() | Obtiene la clave del renderizador de entidades registrado en el renderizador |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtener el valor de la propiedad especificada |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Elimina una propiedad dinámica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Eliminar la propiedad especificada identificada por nombre |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Establece el valor de la propiedad especificada |

### Ver también

* class [Curve](../curve)
* espacio de nombres [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
