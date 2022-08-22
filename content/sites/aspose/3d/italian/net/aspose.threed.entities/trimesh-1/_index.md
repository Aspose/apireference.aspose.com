---
title: TriMeshT
second_title: Riferimento API Aspose.3D per .NET
description: Versione generica diTriMesh./trimesh per il vertice statico definito dallutente type
type: docs
weight: 740
url: /it/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

Versione generica di[`TriMesh`](../trimesh) per il vertice statico definito dall'utente type

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| Parametro | Descrizione |
| --- | --- |
| T |  |

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [TriMesh](trimesh)(string) | Inizializza un'istanza di[`TriMesh`](../trimesh) |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity) { get; } | La capacità dei vertici preallocati. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ottiene o imposta se escludere questa entità durante l'esportazione. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount) { get; } | Il conteggio degli indici in questo[`TriMesh`](../trimesh) |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ottiene o imposta il primo nodo padre, se è impostato il primo nodo padre, questa entità verrà scollegata dagli altri nodi padre. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ottiene tutti i nodi principali, un'entità può essere collegata a più nodi principali per l'istanza geometrica |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ottiene la scena a cui appartiene questo oggetto |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount) { get; } | Il conteggio dei vertici non uniti che sono passati[`BeginVertex`](../trimesh/beginvertex) e[`EndVertex`](../trimesh/endvertex) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration) { get; } | Il layout dei vertici di[`TriMesh`](../trimesh) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount) { get; } | Il conteggio dei vertici in questo[`TriMesh`](../trimesh) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes) { get; } | La dimensione totale di tutti i vertici in byte |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh`1/frommesh)(Mesh) | Crea un TriMesh da un determinato oggetto mesh con il layout dei vertici generato automaticamente. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex)() | Inizia ad aggiungere il vertice |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex)() | Termina aggiungendo vertice |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ottiene il riquadro di delimitazione dell'entità corrente nel suo sistema di coordinate dello spazio oggetti. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ottiene la chiave del renderer di entità registrato nel renderer |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator)() | Ottieni l'enumeratore da enumerare[`Vertex`](../../aspose.threed.utilities/vertex) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes)(byte[]) | Carica vertici dai byte, la lunghezza dei byte deve essere un multiplo intero della dimensione del vertice. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble)(int, VertexField) | Leggi il doppio campo |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat)(int, VertexField) | Leggi il campo float |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2)(int, VertexField) | Leggi il campo vector2 |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3)(int, VertexField) | Leggi il campo vector3 |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4)(int, VertexField) | Leggi il campo vector4 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2)(int, VertexField) | Leggi il campo vector2 |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3)(int, VertexField) | Leggi il campo vector3 |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4)(int, VertexField) | Leggi il campo vector4 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |
| override [ToString](../../aspose.threed.entities/trimesh/tostring)() | Ottiene la rappresentazione di stringa di[`TriMesh`](../trimesh) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray)() | Converti i dati dei vertici in array di byte |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh`1/verticestotypedarray)() | Converti i dati dei vertici in array tipizzato |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto)(Stream) | Scrive i dati degli indici come intero a 16 bit nello stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto)(Stream) | Scrive i dati degli indici come intero a 32 bit nello stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto)(Stream) | Scrive i dati dei vertici nello stream specificato |

### Guarda anche

* class [TriMesh](../trimesh)
* spazio dei nomi [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
