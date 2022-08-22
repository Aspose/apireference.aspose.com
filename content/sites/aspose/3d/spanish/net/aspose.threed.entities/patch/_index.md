---
title: Patch
second_title: Referencia de API de Aspose.3D para .NET
description: APatch./patch es una superficie de modelado paramétrico similar aNurbsSurface./nurbssurface  también está definido por dos PatchDirection./patchdirection  laU./patch/u yV./patch/v . Pero diferencia entrePatch./patch yNurbsSurface./nurbssurface es que elPatchDirection./patchdirection la curva puede ser una deBezier QuadraticBezier BasisSpline CardinalSpline yLinear
type: docs
weight: 500
url: /es/net/aspose.threed.entities/patch/
---
## Patch class

A[`Patch`](../patch) es una superficie de modelado paramétrico, similar a[`NurbsSurface`](../nurbssurface) , también está definido por dos [`PatchDirection`](../patchdirection) , la[`U`](./u) y[`V`](./v) . Pero diferencia entre[`Patch`](../patch) y[`NurbsSurface`](../nurbssurface) es que el[`PatchDirection`](../patchdirection) la curva puede ser una deBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline yLinear

```csharp
public class Patch : Geometry
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Patch](patch#constructor)() | Inicializa una nueva instancia del[`Patch`](../patch) clase. |
| [Patch](patch#constructor_1)(string) | Inicializa una nueva instancia del[`Patch`](../patch) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Obtiene o establece si esta geometría puede proyectar shadow |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Obtiene todos los puntos de control |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Obtiene todos los deformadores asociados con esta geometría. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtiene o establece si se excluye esta entidad durante la exportación. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtiene o establece el primer nodo principal; si se establece el primer nodo principal, esta entidad se separará de otros nodos principales. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtiene todos los nodos principales, una entidad se puede adjuntar a varios nodos principales para crear instancias de geometría |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Obtiene o establece si esta geometría puede recibir shadow. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtiene la escena a la que pertenece este objeto |
| [U](../../aspose.threed.entities/patch/u) { get; } | Obtiene la dirección u. |
| [V](../../aspose.threed.entities/patch/v) { get; } | Obtiene la dirección v. |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Obtiene todos los elementos de vértice |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Obtiene o establece si la geometría es visible |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Agrega un elemento de vértice existente a la geometría actual |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Crea un elemento de vértice con el tipo especificado y lo agrega a la geometría. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Crea un elemento de vértice con el tipo especificado y lo agrega a la geometría. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Crea un[`VertexElementUV`](../vertexelementuv) con el tipo de mapeo de textura dado. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Crea un[`VertexElementUV`](../vertexelementuv) con el tipo de mapeo de textura dado. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtiene el cuadro delimitador de la entidad actual en su sistema de coordenadas de espacio de objetos. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Obtiene un elemento de vértice con el tipo especificado |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtiene la clave del renderizador de entidades registrado en el renderizador |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtener el valor de la propiedad especificada |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Obtiene un[`VertexElementUV`](../vertexelementuv) instancia con mapeo de textura dado type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Elimina una propiedad dinámica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Eliminar la propiedad especificada identificada por nombre |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Establece el valor de la propiedad especificada |

### Ver también

* class [Geometry](../geometry)
* espacio de nombres [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
