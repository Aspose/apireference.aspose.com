---
title: TriMeshT
second_title: Referencia de API de Aspose.3D para .NET
description: Versión genérica deTriMesh./trimesh para el vértice definido estático del usuario type
type: docs
weight: 740
url: /es/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

Versión genérica de[`TriMesh`](../trimesh) para el vértice definido estático del usuario type

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| Parámetro | Descripción |
| --- | --- |
| T |  |

## Constructores

| Nombre | Descripción |
| --- | --- |
| [TriMesh](trimesh)(string) | Inicializar una instancia de[`TriMesh`](../trimesh) |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | La capacidad de los vértices preasignados. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Obtiene o establece si se excluye esta entidad durante la exportación. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | El conteo de índices en este[`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Obtiene o establece el primer nodo principal; si se establece el primer nodo principal, esta entidad se separará de otros nodos principales. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Obtiene todos los nodos principales, una entidad se puede adjuntar a varios nodos principales para crear instancias de geometría |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtiene la escena a la que pertenece este objeto |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | El conteo de vértices no combinados que pasaron por[`BeginVertex`](../trimesh/beginvertex) y[`EndVertex`](../trimesh/endvertex) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | El diseño de vértice del[`TriMesh`](../trimesh) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | El conteo de vértices en este[`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | El tamaño total de todos los vértices en bytes |

## Métodos

| Nombre | Descripción |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh`1/frommesh)(Mesh) | Cree un TriMesh a partir de un objeto de malla dado con un diseño de vértice generado automáticamente. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | Empezar a agregar vertex |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | Fin de agregar vertex |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Obtiene el cuadro delimitador de la entidad actual en su sistema de coordenadas de espacio de objetos. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Obtiene la clave del renderizador de entidades registrado en el renderizador |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | Obtener el enumerador para enumerar[`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtener el valor de la propiedad especificada |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | Cargar vértices desde bytes, la longitud de los bytes debe ser un múltiplo entero del tamaño del vértice. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | Leer el doble campo |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | Leer el campo flotante |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | Lee el campo vector2 |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | Lee el campo vector3 |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | Lee el campo vector4 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | Lee el campo vector2 |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | Lee el campo vector3 |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | Lee el campo vector4 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Elimina una propiedad dinámica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Eliminar la propiedad especificada identificada por nombre |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Establece el valor de la propiedad especificada |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | Obtiene la representación de cadena de[`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | Convierte los datos de los vértices a matriz de bytes |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh`1/verticestotypedarray)() | Convierte los datos de los vértices en array tipado |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | Escribe los datos de los índices como un entero de 16 bits en el stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | Escribe los datos de los índices como un entero de 32 bits en el stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | Escribir datos de vértices en el flujo especificado |

### Ver también

* class [TriMesh](../trimesh)
* espacio de nombres [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
