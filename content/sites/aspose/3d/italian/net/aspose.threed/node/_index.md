---
title: Node
second_title: Riferimento API Aspose.3D per .NET
description: Rappresenta un elemento nel grafico della scena. Un grafico della scena è un albero di oggetti Node. I servizi di gestione dellalbero sono contenuti in questa classe. Si noti che lSDK Aspose.3D non verifica la validità del grafico della scena costruito. È responsabilità del chiamante assicurarsi che non generi grafici ciclici in una gerarchia di nodi. Oltre alla gestione dellalbero questa classe definisce tutte le proprietà necessarie per descrivere la posizione delloggetto nella scena. Queste informazioni includono le proprietà di traslazione rotazione e ridimensionamento di base e le opzioni più avanzate per i perni i limiti e gli attributi dei giunti IK come la rigidità e lo smorzamento. Quando viene creato per la prima volta loggetto Nodo è vuoto cioè è un oggetto senza alcuna rappresentazione grafica che contiene solo le informazioni sulla posizione. In questo stato può essere utilizzato per rappresentare i genitori nella struttura ad albero dei nodi ma non molto di più. Luso normale di questo tipo di oggetti è quello di aggiungere loro unentità che specializzerà il nodo vedi Entità. Lentità è un oggetto in sé ed è collegata al Nodo. Ciò significa anche che la stessa entità può essere condivisa tra più nodi. Camera Light Mesh ecc... sono tutte entità e derivano tutte dalla classe base Entity.
type: docs
weight: 1470
url: /it/net/aspose.threed/node/
---
## Node class

Rappresenta un elemento nel grafico della scena. Un grafico della scena è un albero di oggetti Node. I servizi di gestione dell'albero sono contenuti in questa classe. Si noti che l'SDK Aspose.3D non verifica la validità del grafico della scena costruito. È responsabilità del chiamante assicurarsi che non generi grafici ciclici in una gerarchia di nodi. Oltre alla gestione dell'albero, questa classe definisce tutte le proprietà necessarie per descrivere la posizione dell'oggetto nella scena. Queste informazioni includono le proprietà di traslazione, rotazione e ridimensionamento di base e le opzioni più avanzate per i perni, i limiti e gli attributi dei giunti IK come la rigidità e lo smorzamento. Quando viene creato per la prima volta, l'oggetto Nodo è "vuoto" (cioè: è un oggetto senza alcuna rappresentazione grafica che contiene solo le informazioni sulla posizione). In questo stato, può essere utilizzato per rappresentare i genitori nella struttura ad albero dei nodi, ma non molto di più. L'uso normale di questo tipo di oggetti è quello di aggiungere loro un'entità che specializzerà il nodo (vedi "Entità"). L'entità è un oggetto in sé ed è collegata al Nodo. Ciò significa anche che la stessa entità può essere condivisa tra più nodi. Camera, Light, Mesh, ecc... sono tutte entità e derivano tutte dalla classe base Entity.

```csharp
public class Node : SceneObject
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Node](node#constructor)() | Inizializza una nuova istanza di[`Node`](../node) classe. |
| [Node](node#constructor_1)(string) | Inizializza una nuova istanza di[`Node`](../node) classe. |
| [Node](node#constructor_2)(string, Entity) | Inizializza una nuova istanza di[`Node`](../node) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo) { get; set; } | Info asset per nodo |
| [ChildNodes](../../aspose.threed/node/childnodes) { get; } | Ottiene i nodi figli. |
| [Entities](../../aspose.threed/node/entities) { get; } | Ottiene tutte le entità del nodo. |
| [Entity](../../aspose.threed/node/entity) { get; set; } | Ottiene o imposta la prima entità collegata a questo nodo, se impostata, cancellerà altre entità. |
| [Excluded](../../aspose.threed/node/excluded) { get; set; } | Ottiene o imposta se escludere questo nodo e tutti i nodi/entità figlio durante l'esportazione. |
| [GlobalTransform](../../aspose.threed/node/globaltransform) { get; } | Ottiene la trasformazione globale. |
| [Material](../../aspose.threed/node/material) { get; set; } | Ottiene o imposta il primo materiale associato a questo nodo, se impostato, cancellerà altri materiali |
| [Materials](../../aspose.threed/node/materials) { get; } | Ottiene i materiali associati a questo nodo. |
| [MetaDatas](../../aspose.threed/node/metadatas) { get; } | Ottiene i metadati definiti in questo nodo. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [ParentNode](../../aspose.threed/node/parentnode) { get; set; } | Ottiene o imposta il nodo padre. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ottiene la scena a cui appartiene questo oggetto |
| [Transform](../../aspose.threed/node/transform) { get; } | Ottiene la trasformazione locale. |
| [Visible](../../aspose.threed/node/visible) { get; set; } | Ottiene o imposta per mostrare il nodo |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Accept](../../aspose.threed/node/accept)(NodeVisitor) | Passa attraverso tutti i nodi discendenti (incluso il nodo corrente) e chiama il visitatore con il nodo. Il visitatore può interrompere il passaggio restituendo false |
| [AddChildNode](../../aspose.threed/node/addchildnode)(Node) | Aggiungi un nodo figlio a questo nodo |
| [AddEntity](../../aspose.threed/node/addentity)(Entity) | Aggiungi un'entità al nodo. |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode)() | Crea un nodo figlio |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_1)(Entity) | Crea un nuovo nodo figlio con una determinata entità allegata |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_2)(string) | Crea un nuovo nodo figlio con il nome del nodo specificato |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_3)(string, Entity) | Crea un nuovo nodo figlio con il nome del nodo specificato |
| [CreateChildNode](../../aspose.threed/node/createchildnode#createchildnode_4)(string, Entity, Material) | Crea un nuovo nodo figlio con il nome del nodo specificato e allega l'entità specificata e un materiale |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform)(bool) | Valuta la trasformazione globale, includi o meno la trasformazione geometrica. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox)() | Calcola il riquadro di delimitazione del nodo |
| [GetChild](../../aspose.threed/node/getchild#getchild)(int) | Ottiene il nodo figlio all'indice specificato. |
| [GetChild](../../aspose.threed/node/getchild#getchild_1)(string) | Ottiene il nodo figlio con il nome specificato |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [Merge](../../aspose.threed/node/merge)(Node) | Stacca tutto sotto il nodo e collegalo al nodo corrente. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [SelectObjects](../../aspose.threed/node/selectobjects)(string) | Seleziona più oggetti nel nodo corrente utilizzando la sintassi della query simile a XPath. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject)(string) | Seleziona un singolo oggetto nel nodo corrente utilizzando la sintassi della query simile a XPath. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |
| override [ToString](../../aspose.threed/node/tostring)() | Ottiene la rappresentazione di stringa di questo nodo. |

### Guarda anche

* class [SceneObject](../sceneobject)
* spazio dei nomi [Aspose.ThreeD](../../aspose.threed)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
