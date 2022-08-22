---
title: Shape
second_title: Riferimento API Aspose.3D per .NET
description: La forma descrive la deformazione su un insieme di punti di controllo che è simile al deformatore a grappolo in Maya. Ad esempio possiamo aggiungere una forma a una geometria creata. E la forma e la geometria hanno le stesse informazioni topologiche ma diversa posizione dei punti di controllo. Con livelli di influenza variabili la geometria esegue un effetto di deformazione.
type: docs
weight: 640
url: /it/net/aspose.threed.entities/shape/
---
## Shape class

La forma descrive la deformazione su un insieme di punti di controllo, che è simile al deformatore a grappolo in Maya. Ad esempio, possiamo aggiungere una forma a una geometria creata. E la forma e la geometria hanno le stesse informazioni topologiche ma diversa posizione dei punti di controllo. Con livelli di influenza variabili, la geometria esegue un effetto di deformazione.

```csharp
public class Shape : Geometry
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Shape](shape#constructor)() | Inizializza una nuova istanza di[`Shape`](../shape) classe. |
| [Shape](shape#constructor_1)(string) | Inizializza una nuova istanza di[`Shape`](../shape) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows) { get; set; } | Ottiene o imposta se questa geometria può proiettare ombra |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints) { get; } | Ottiene tutti i punti di controllo |
| [Deformers](../../aspose.threed.entities/geometry/deformers) { get; } | Ottiene tutti i deformatori associati a questa geometria. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ottiene o imposta se escludere questa entità durante l'esportazione. |
| [Indices](../../aspose.threed.entities/shape/indices) { get; } | Ottiene gli indici. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ottiene o imposta il primo nodo padre, se è impostato il primo nodo padre, questa entità verrà scollegata dagli altri nodi padre. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ottiene tutti i nodi principali, un'entità può essere collegata a più nodi principali per l'istanza geometrica |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows) { get; set; } | Ottiene o imposta se questa geometria può ricevere ombra. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ottiene la scena a cui appartiene questo oggetto |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements) { get; } | Ottiene tutti gli elementi del vertice |
| [Visible](../../aspose.threed.entities/geometry/visible) { get; set; } | Ottiene o imposta se la geometria è visibile |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [FromControlPoints](../../aspose.threed.entities/shape/fromcontrolpoints)(params Vector3[]) | Crea una forma con punti di controllo specificati con indici predefiniti. |
| [AddElement](../../aspose.threed.entities/geometry/addelement)(VertexElement) | Aggiunge un elemento vertice esistente alla geometria corrente |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType) | Crea un elemento vertice con il tipo specificato e lo aggiunge alla geometria. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement)(VertexElementType, MappingMode, ReferenceMode) | Crea un elemento vertice con il tipo specificato e lo aggiunge alla geometria. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping) | Crea a[`VertexElementUV`](../vertexelementuv) con un dato tipo di mappatura delle texture. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv)(TextureMapping, MappingMode, ReferenceMode) | Crea a[`VertexElementUV`](../vertexelementuv) con un dato tipo di mappatura delle texture. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ottiene il riquadro di delimitazione dell'entità corrente nel suo sistema di coordinate dello spazio oggetti. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement)(VertexElementType) | Ottiene un elemento vertice con il tipo specificato |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ottiene la chiave del renderer di entità registrato nel renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv)(TextureMapping) | Ottiene a[`VertexElementUV`](../vertexelementuv) istanza con una data mappatura delle texture type |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |

### Guarda anche

* class [Geometry](../geometry)
* spazio dei nomi [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
