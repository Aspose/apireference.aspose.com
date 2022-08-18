---
title: Mesh
second_title: Referencia de API de Aspose.3D para .NET
description: Una malla está formada por muchos polígonos de n lados.
type: docs
weight: 450
url: /es/net/aspose.threed.entities/mesh/
---
## Mesh class

Una malla está formada por muchos polígonos de n lados.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Mesh](mesh#constructor)() | Inicializa una nueva instancia del[`Mesh`](../mesh) clase. |
| [Mesh](mesh#constructor_1)(Bitmap) | Construya una malla utilizando el mapa de altura especificado, si el formato de píxel del mapa de altura contiene varios componentes, el primer componente (normalmente el rojo) se utilizará como valor de altura (z) Los componentes x e y del punto de control son coordenadas de píxel normalizadas . |
| [Mesh](mesh#constructor_4)(string) | Inicializa una nueva instancia del[`Mesh`](../mesh) clase. |
| [Mesh](mesh#constructor_2)(Bitmap, Matrix4) | Construya una malla utilizando el mapa de altura especificado, si el formato de píxel del mapa de altura contiene varios componentes, el primer componente (normalmente el rojo) se utilizará como valor de altura (z) Los componentes x e y del punto de control son coordenadas de píxel normalizadas . |
| [Mesh](mesh#constructor_3)(Bitmap, bool, Matrix4) | Construya una malla utilizando el mapa de altura especificado, si el formato de píxel del mapa de altura contiene varios componentes, el primer componente (normalmente el rojo) se utilizará como valor de altura (z) Los componentes x e y del punto de control son coordenadas de píxel normalizadas . |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Obtiene o establece si esta geometría puede proyectar shadow |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Obtiene todos los puntos de control |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Obtiene todos los deformadores asociados con esta geometría. |
| [Edges](../../aspose.threed.entities/mesh/edges) { get; } | Obtiene los bordes de la Malla. El borde es opcional en la malla, por lo que puede estar vacío. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtiene o establece si se excluye esta entidad durante la exportación. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtiene o establece el primer nodo principal; si se establece el primer nodo principal, esta entidad se separará de otros nodos principales. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtiene todos los nodos principales, una entidad se puede adjuntar a varios nodos principales para crear instancias de geometría |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount) { get; } | Obtiene el conteo de polígonos |
| [Polygons](../../aspose.threed.entities/mesh/polygons) { get; } | Obtiene la definición de polígonos de la malla |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Obtiene o establece si esta geometría puede recibir shadow. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtiene la escena a la que pertenece este objeto |
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
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_2)(int[]) | Crea un nuevo polígono con todos los vértices definidos en*indices* . Para crear un polígono vértice por vértice, utilice[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon)(int, int, int) | Crea un polígono de 3 vértices(triángulo) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_3)(int[], int, int) | Crea un nuevo polígono con todos los vértices definidos en*indices* . Para crear un polígono vértice por vértice, utilice[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_1)(int, int, int, int) | Crea un polígono de 4 vértices(quad) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtiene el cuadro delimitador de la entidad actual en su sistema de coordenadas de espacio de objetos. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Obtiene un elemento de vértice con el tipo especificado |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtiene la clave del renderizador de entidades registrado en el renderizador |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator)() | Obtiene el enumerador de cada polígono interior. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize)(int) | Obtiene el número de vértices del polígono especificado. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtener el valor de la propiedad especificada |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Obtiene un[`VertexElementUV`](../vertexelementuv) instancia con mapeo de textura dado type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Elimina una propiedad dinámica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Eliminar la propiedad especificada identificada por nombre |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Establece el valor de la propiedad especificada |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh)() | Obtiene la instancia de Mesh de la entidad actual. |

### Ejemplos

Para agregar un polígono en malla: Recorre todos los polígonos de la malla:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    // tratar con polígono
}
```

### Ver también

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* espacio de nombres [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
