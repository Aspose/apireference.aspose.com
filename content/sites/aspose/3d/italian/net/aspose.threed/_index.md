---
title: Aspose.ThreeD
second_title: Riferimento API Aspose.3D per .NET
description: Lo spazio dei nomi di base di Aspose.3D
type: docs
weight: 10
url: /it/net/aspose.threed/
---
Lo spazio dei nomi di base di Aspose.3D

## Classi

| Classe | Descrizione |
| --- | --- |
| [A3DObject](./a3dobject) | La classe base di tutti gli oggetti Aspose.ThreeD, tutte le sottoclassi supporteranno le proprietà dinamiche. |
| [AssetInfo](./assetinfo) | Informazioni sull'asset. Le informazioni sull'asset possono essere allegate a a[`Scene`](../aspose.threed/scene) . Bambino[`Scene`](../aspose.threed/scene) può avere il suo[`AssetInfo`](../aspose.threed/assetinfo) per sovrascrivere la definizione del genitore. |
| [BonePose](./bonepose) | Il[`BonePose`](../aspose.threed/bonepose) contiene la matrice di trasformazione per un nodo osseo |
| [CustomObject](./customobject) | I metadati o gli oggetti personalizzati utilizzati nei file 3D sono gestiti da questa classe. Tutte le proprietà personalizzate vengono salvate come proprietà dinamiche. |
| [Entity](./entity) | La classe base di tutte le entità. Entity rappresenta un oggetto concreto che è attaccato sotto un nodo come[`Light`](../aspose.threed.entities/light)/[`Geometry`](../aspose.threed.entities/geometry) . |
| [ExportException](./exportexception) | Eccezioni quando Aspose.3D non è riuscito a esportare la scena in file |
| [FileFormat](./fileformat) | Definizione formato file |
| [FileFormatType](./fileformattype) | Tipo di formato file |
| [GlobalTransform](./globaltransform) | La trasformazione globale è simile a[`Transform`](../aspose.threed/transform) ma è immutabile mentre rappresenta la trasformazione valutata finale. Il sistema di coordinate di destra viene utilizzato durante la valutazione della trasformazione globale |
| [ImageRenderOptions](./imagerenderoptions) | Opzioni per[`Render`](../aspose.threed/scene/render) e[`Render`](../aspose.threed/scene/render) |
| [ImportException](./importexception) | Eccezione quando Aspose.3D non è riuscito ad aprire la sorgente specificata |
| [License](./license) | Fornisce i metodi per concedere in licenza il componente. |
| [Metered](./metered) | Fornisce i metodi per impostare la chiave misurata. |
| [Node](./node) | Rappresenta un elemento nel grafico della scena. Un grafico della scena è un albero di oggetti Node. I servizi di gestione dell'albero sono contenuti in questa classe. Si noti che l'SDK Aspose.3D non verifica la validità del grafico della scena costruito. È responsabilità del chiamante assicurarsi che non generi grafici ciclici in una gerarchia di nodi. Oltre alla gestione dell'albero, questa classe definisce tutte le proprietà necessarie per descrivere la posizione dell'oggetto nella scena. Queste informazioni includono le proprietà di traslazione, rotazione e ridimensionamento di base e le opzioni più avanzate per i perni, i limiti e gli attributi dei giunti IK come la rigidità e lo smorzamento. Quando viene creato per la prima volta, l'oggetto Nodo è "vuoto" (cioè: è un oggetto senza alcuna rappresentazione grafica che contiene solo le informazioni sulla posizione). In questo stato, può essere utilizzato per rappresentare i genitori nella struttura ad albero dei nodi, ma non molto di più. L'uso normale di questo tipo di oggetti è quello di aggiungere loro un'entità che specializzerà il nodo (vedi "Entità"). L'entità è un oggetto in sé ed è collegata al Nodo. Ciò significa anche che la stessa entità può essere condivisa tra più nodi. Camera, Light, Mesh, ecc... sono tutte entità e derivano tutte dalla classe base Entity. |
| [NodeVisitor](./nodevisitor) | Un callback per viaggiare attraverso l'intera gerarchia dei nodi. |
| [Pose](./pose) | La posa viene utilizzata per memorizzare la matrice di trasformazione quando la geometria viene modificata. La posa è un insieme di[`BonePose`](../aspose.threed/bonepose) , a testa[`BonePose`](../aspose.threed/bonepose) salva le informazioni sulla trasformazione concreta del nodo osseo. |
| [Property](./property) | Classe per contenere le proprietà definite dall'utente. |
| [PropertyCollection](./propertycollection) | La raccolta di proprietà |
| [Scene](./scene) | Una scena è un oggetto di livello superiore che contiene i nodi, le geometrie, i materiali, le trame, l'animazione, le pose, le scene secondarie e così via. La scena può avere scene secondarie, funge da supporto per più documenti in file come collada/blender /fbx È possibile accedere alla gerarchia dei nodi[`RootNode`](../aspose.threed/scene/rootnode)[`Library`](../aspose.threed/scene/library) viene utilizzato per mantenere un riferimento di oggetti non collegati durante la serializzazione (come metadati o oggetti personalizzati) in modo che possa essere utilizzato come libreria. |
| [SceneObject](./sceneobject) | La classe radice degli oggetti che verranno archiviati all'interno di una scena. |
| [Transform](./transform) | Una trasformazione contiene informazioni che consentono l'accesso alla matrice di conversione/scala/rotazione o trasformazione dell'oggetto al costo minimo Viene utilizzata dalla trasformazione locale. |
| [TrialException](./trialexception) | Viene generato in Scene.Open/Scene.Save quando non vengono applicate licenze. Puoi disattivare questa eccezione impostando SuppressTrialException su true. |
## Interfacce

| Interfaccia | Descrizione |
| --- | --- |
| [INamedObject](./inamedobject) | Oggetto che ha un nome |
## Enumerazione

| Enumerazione | Descrizione |
| --- | --- |
| [Axis](./axis) | L'asse delle coordinate. |
| [CoordinatedSystem](./coordinatedsystem) | Il sistema di coordinate per mancini o destri. |
| [FileContentType](./filecontenttype) | Tipo di contenuto file |
| [PoseType](./posetype) | Tipo di posa. |
| [PropertyFlags](./propertyflags) | Flag di proprietà |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
