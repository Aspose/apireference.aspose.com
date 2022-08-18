---
title: Node
second_title: Referencia de API de Aspose.3D para .NET
description: Representa un elemento en el escenario gráfico. Un escenario gráfico es un árbol de objetos Nodo. Los servicios de administración de árboles están incluidos en esta clase. Tenga en cuenta que el SDK de Aspose.3D no prueba la validez del escenario gráfico construido. Es responsabilidad de quien llama asegurarse de que no genera gráficos cíclicos en una jerarquía de nodos. Además de la gestión del árbol esta clase define todas las propiedades necesarias para describir la posición del objeto en la escena. Esta información incluye las propiedades básicas de traslación rotación y escala y las opciones más avanzadas para pivotes límites y atributos de juntas IK como la rigidez y la amortiguación. Cuando se crea por primera vez el objeto Nodo está vacío es decir está un objeto sin ninguna representación gráfica que solo contiene la información de posición. En este estado se puede usar para representar a los padres en la estructura de árbol de nodos pero no mucho más. El uso normal de este tipo de objetos es agregarles una entidad que especializará el nodo ver la Entidad. La entidad es un objeto en sí mismo y está conectado al Nodo. Esto también significa que la misma entidad se puede compartir entre varios nodos. Camera Light Mesh etc... son todas entidades y todas derivan de la clase base Entity.
type: docs
weight: 1470
url: /es/net/aspose.threed/node/
---
## Node class

Representa un elemento en el escenario gráfico. Un escenario gráfico es un árbol de objetos Nodo. Los servicios de administración de árboles están incluidos en esta clase. Tenga en cuenta que el SDK de Aspose.3D no prueba la validez del escenario gráfico construido. Es responsabilidad de quien llama asegurarse de que no genera gráficos cíclicos en una jerarquía de nodos. Además de la gestión del árbol, esta clase define todas las propiedades necesarias para describir la posición del objeto en la escena. Esta información incluye las propiedades básicas de traslación, rotación y escala y las opciones más avanzadas para pivotes, límites y atributos de juntas IK, como la rigidez y la amortiguación. Cuando se crea por primera vez, el objeto Nodo está "vacío" (es decir, está un objeto sin ninguna representación gráfica que solo contiene la información de posición). En este estado, se puede usar para representar a los padres en la estructura de árbol de nodos, pero no mucho más. El uso normal de este tipo de objetos es agregarles una entidad que especializará el nodo (ver la "Entidad"). La entidad es un objeto en sí mismo y está conectado al Nodo. Esto también significa que la misma entidad se puede compartir entre varios nodos. Camera, Light, Mesh, etc... son todas entidades y todas derivan de la clase base Entity.

```csharp
public class Node : SceneObject
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [Node](node#constructor)() | Inicializa una nueva instancia del[`Node`](../node) clase. |
| [Node](node#constructor_1)(string) | Inicializa una nueva instancia del[`Node`](../node) clase. |
| [Node](node#constructor_2)(string, Entity) | Inicializa una nueva instancia del[`Node`](../node) clase. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo) { get; set; } | Información de activos por nodo |
| [ChildNodes](../../aspose.threed/node/childnodes) { get; } | Obtiene los nodos hijos. |
| [Entities](../../aspose.threed/node/entities) { get; } | Obtiene todas las entidades del nodo. |
| [Entity](../../aspose.threed/node/entity) { get; set; } | Obtiene o establece la primera entidad adjunta a este nodo, si se establece, borrará otras entidades. |
| [Excluded](../../aspose.threed/node/excluded) { get; set; } | Obtiene o establece si se excluye este nodo y todos los nodos/entidades secundarios durante la exportación. |
| [GlobalTransform](../../aspose.threed/node/globaltransform) { get; } | Obtiene la transformación global. |
| [Material](../../aspose.threed/node/material) { get; set; } | Obtiene o establece el primer material asociado con este nodo, si se establece, borrará otros materiales |
| [Materials](../../aspose.threed/node/materials) { get; } | Obtiene los materiales asociados a este nodo. |
| [MetaDatas](../../aspose.threed/node/metadatas) { get; } | Obtiene los metadatos definidos en este nodo. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Obtiene o establece el nombre. |
| [ParentNode](../../aspose.threed/node/parentnode) { get; set; } | Obtiene o establece el nodo padre. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Obtiene la colección de todas las propiedades. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Obtiene la escena a la que pertenece este objeto |
| [Transform](../../aspose.threed/node/transform) { get; } | Obtiene la transformación local. |
| [Visible](../../aspose.threed/node/visible) { get; set; } | Obtiene o establece para mostrar el nodo |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Accept](../../aspose.threed/node/accept)(NodeVisitor) | Recorre todos los nodos descendientes (incluido el nodo actual) y llama al visitante con el nodo. El visitante puede interrumpir el recorrido devolviendo false |
| [AddChildNode](../../aspose.threed/node/addchildnode)(Node) | Agregar un nodo secundario a este nodo |
| [AddEntity](../../aspose.threed/node/addentity)(Entity) | Agregar una entidad al nodo. |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode)() | Crea un nodo hijo |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_1)(Entity) | Crear un nuevo nodo secundario con la entidad dada adjunta |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_2)(string) | Crear un nuevo nodo secundario con el nombre de nodo dado |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_3)(string, Entity) | Crear un nuevo nodo secundario con el nombre de nodo dado |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_4)(string, Entity, Material) | Crear un nuevo nodo secundario con el nombre de nodo dado y adjuntar la entidad especificada y un material |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform)(bool) | Evaluar la transformada global, incluir o no la transformada geométrica. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Encuentra la propiedad. Puede ser una propiedad dinámica (Creada por CreateDynamicProperty/SetProperty) o una propiedad nativa (Identificada por su nombre) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox)() | Calcular el cuadro delimitador del nodo |
| [GetChild](../../aspose.threed/node/getchild#getchild)(int) | Obtiene el nodo secundario en el índice especificado. |
| [GetChild](../../aspose.threed/node/getchild#getchild_1)(string) | Obtiene el nodo secundario con el nombre especificado |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Obtener el valor de la propiedad especificada |
| [Merge](../../aspose.threed/node/merge)(Node) | Separe todo debajo del nodo y adjúntelo al nodo actual. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Elimina una propiedad dinámica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Eliminar la propiedad especificada identificada por nombre |
| [SelectObjects](../../aspose.threed/node/selectobjects)(string) | Seleccione varios objetos en el nodo actual utilizando una sintaxis de consulta similar a XPath. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject)(string) | Seleccione un solo objeto en el nodo actual usando una sintaxis de consulta similar a XPath. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Establece el valor de la propiedad especificada |
| override [ToString](../../aspose.threed/node/tostring)() | Obtiene la representación de cadena de este nodo. |

### Ver también

* class [SceneObject](../sceneobject)
* espacio de nombres [Aspose.ThreeD](../../aspose.threed)
* asamblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
