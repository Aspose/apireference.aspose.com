---
title: PointCloud
second_title: Referencia de API de Aspose.3D para .NET
description: La nube de puntos no contiene información de topología solo los puntos de control y los elementos de vértice.
type: docs
weight: 540
url: /es/net/aspose.threed.entities/pointcloud/
---
## PointCloud class

La nube de puntos no contiene información de topología, solo los puntos de control y los elementos de vértice.

```csharp
public class PointCloud : Geometry
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [PointCloud](pointcloud#constructor)() | Constructor de[`PointCloud`](../pointcloud) |
| [PointCloud](pointcloud#constructor_1)(string) | Constructor de[`PointCloud`](../pointcloud) |

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
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Obtiene todos los elementos de vértice |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Obtiene o establece si la geometría es visible |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [FromGeometry](../../aspose.threed.entities/pointcloud/fromgeometry#fromgeometry)(Geometry) | Crear una nueva instancia de PointCloud a partir de un objeto de geometría |
| static [FromGeometry](../../aspose.threed.entities/pointcloud/fromgeometry#fromgeometry_1)(Geometry, int) | Crear una nueva instancia de nube de puntos a partir de un objeto de geometría. La densidad es el número de puntos por unidad de triángulo (Unidad de triángulo es el triángulo con el área de superficie máxima de la malla) |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Agrega un elemento de vértice existente a la geometría actual |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Crea un elemento de vértice con el tipo especificado y lo agrega a la geometría. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Crea un elemento de vértice con el tipo especificado y lo agrega a la geometría. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Crea un[`VertexElementUV`](../vertexelementuv) con el tipo de mapeo de textura dado. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Crea un[`VertexElementUV`](../vertexelementuv) con el tipo de mapeo de textura dado. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtiene el cuadro delimitador de la entidad actual en su sistema de coordenadas de espacio de objetos. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Obtiene un elemento de vértice con el tipo especificado |
| override [GetEntityRendererKey](../../aspose.threed.entities/pointcloud/getentityrendererkey)() | Obtiene la clave del renderizador de entidades registrado en el renderizador |
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
