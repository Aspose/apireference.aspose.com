---
title: Mesh
second_title: Riferimento API Aspose.3D per .NET
description: Una mesh è composta da molti poligoni a n lati.
type: docs
weight: 450
url: /it/net/aspose.threed.entities/mesh/
---
## Mesh class

Una mesh è composta da molti poligoni a n lati.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Mesh](mesh#constructor)() | Inizializza una nuova istanza di[`Mesh`](../mesh) classe. |
| [Mesh](mesh#constructor_1)(Bitmap) | Costruisci una mesh utilizzando la mappa dell'altezza specificata, se il formato pixel della mappa dell'altezza contiene più componenti, il primo componente (di solito il rosso) verrà utilizzato come valore dell'altezza (z) I componenti x e y del punto di controllo sono coordinate pixel normalizzate . |
| [Mesh](mesh#constructor_4)(string) | Inizializza una nuova istanza di[`Mesh`](../mesh) classe. |
| [Mesh](mesh#constructor_2)(Bitmap, Matrix4) | Costruisci una mesh utilizzando la mappa dell'altezza specificata, se il formato pixel della mappa dell'altezza contiene più componenti, il primo componente (di solito il rosso) verrà utilizzato come valore dell'altezza (z) I componenti x e y del punto di controllo sono coordinate pixel normalizzate . |
| [Mesh](mesh#constructor_3)(Bitmap, bool, Matrix4) | Costruisci una mesh utilizzando la mappa dell'altezza specificata, se il formato pixel della mappa dell'altezza contiene più componenti, il primo componente (di solito il rosso) verrà utilizzato come valore dell'altezza (z) I componenti x e y del punto di controllo sono coordinate pixel normalizzate . |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Ottiene o imposta se questa geometria può proiettare ombra |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Ottiene tutti i punti di controllo |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Ottiene tutti i deformatori associati a questa geometria. |
| [Edges](../../aspose.threed.entities/mesh/edges) { get; } | Ottiene i bordi della mesh. Il bordo è opzionale in mesh, quindi può essere vuoto. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ottiene o imposta se escludere questa entità durante l'esportazione. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ottiene o imposta il primo nodo padre, se è impostato il primo nodo padre, questa entità verrà scollegata dagli altri nodi padre. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ottiene tutti i nodi principali, un'entità può essere collegata a più nodi principali per l'istanza geometrica |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount) { get; } | Ottiene il conteggio dei poligoni |
| [Polygons](../../aspose.threed.entities/mesh/polygons) { get; } | Ottiene la definizione dei poligoni della mesh |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Ottiene o imposta se questa geometria può ricevere ombra. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ottiene la scena a cui appartiene questo oggetto |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Ottiene tutti gli elementi del vertice |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Ottiene o imposta se la geometria è visibile |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Aggiunge un elemento vertice esistente alla geometria corrente |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Crea un elemento vertice con il tipo specificato e lo aggiunge alla geometria. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Crea un elemento vertice con il tipo specificato e lo aggiunge alla geometria. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Crea a[`VertexElementUV`](../vertexelementuv) con un dato tipo di mappatura delle texture. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Crea a[`VertexElementUV`](../vertexelementuv) con un dato tipo di mappatura delle texture. |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_2)(int[]) | Crea un nuovo poligono con tutti i vertici definiti in*indices* . Per creare un poligono vertice per vertice, utilizzare[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon)(int, int, int) | Crea un poligono con 3 vertici(triangolo) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_3)(int[], int, int) | Crea un nuovo poligono con tutti i vertici definiti in*indices* . Per creare un poligono vertice per vertice, utilizzare[`PolygonBuilder`](../polygonbuilder) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon#createpolygon_1)(int, int, int, int) | Crea un poligono con 4 vertici(quad) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ottiene il riquadro di delimitazione dell'entità corrente nel suo sistema di coordinate dello spazio oggetti. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Ottiene un elemento vertice con il tipo specificato |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ottiene la chiave del renderer di entità registrato nel renderer |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator)() | Ottiene l'enumeratore per ogni poligono interno. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize)(int) | Ottiene il conteggio dei vertici del poligono specificato. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Ottiene a[`VertexElementUV`](../vertexelementuv) istanza con una data mappatura delle texture type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh)() | Ottiene l'istanza Mesh dall'entità corrente. |

### Esempi

Per aggiungere un poligono nella mesh: Viaggia attraverso tutti i poligoni nella mesh:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    //si occupa del poligono
}
```

### Guarda anche

* class [Geometry](../geometry)
* interface [IMeshConvertible](../imeshconvertible)
* spazio dei nomi [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
