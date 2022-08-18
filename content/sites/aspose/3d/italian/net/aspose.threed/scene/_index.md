---
title: Scene
second_title: Riferimento API Aspose.3D per .NET
description: Una scena è un oggetto di livello superiore che contiene i nodi le geometrie i materiali le trame lanimazione le pose le scene secondarie e così via. La scena può avere scene secondarie funge da supporto per più documenti in file come collada/blender /fbx È possibile accedere alla gerarchia dei nodiRootNode./scene/rootnodeLibrary./scene/library viene utilizzato per mantenere un riferimento di oggetti non collegati durante la serializzazione come metadati o oggetti personalizzati in modo che possa essere utilizzato come libreria.
type: docs
weight: 2250
url: /it/net/aspose.threed/scene/
---
## Scene class

Una scena è un oggetto di livello superiore che contiene i nodi, le geometrie, i materiali, le trame, l'animazione, le pose, le scene secondarie e così via. La scena può avere scene secondarie, funge da supporto per più documenti in file come collada/blender /fbx È possibile accedere alla gerarchia dei nodi[`RootNode`](./rootnode)[`Library`](./library) viene utilizzato per mantenere un riferimento di oggetti non collegati durante la serializzazione (come metadati o oggetti personalizzati) in modo che possa essere utilizzato come libreria.

```csharp
public class Scene : SceneObject
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Scene](scene#constructor)() | Inizializza una nuova istanza di[`Scene`](../scene) classe. |
| [Scene](scene#constructor_1)(Entity) | Inizializza una nuova istanza di[`Scene`](../scene) classe con un'entità collegata a un nuovo nodo. |
| [Scene](scene#constructor_2)(Scene, string) | Inizializza una nuova istanza di[`Scene`](../scene)classe come sottoscena. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips) { get; } | Ottiene tutto[`AnimationClip`](../../aspose.threed.animation/animationclip) definito nella scena. |
| [AssetInfo](../../aspose.threed/scene/assetinfo) { get; set; } | Ottiene o imposta le informazioni sulla risorsa di primo livello |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip) { get; set; } | Ottiene o imposta l'attivo[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [Library](../../aspose.threed/scene/library) { get; } | Gli oggetti che non sono utilizzati direttamente nella gerarchia delle scene possono essere definiti nella Libreria. Ciò è utile quando si utilizzano scene secondarie e si inseriscono componenti riutilizzabili nelle scene secondarie. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [Poses](../../aspose.threed/scene/poses) { get; } | Ottiene tutto[`Pose`](../pose) usato in questa scena. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [RootNode](../../aspose.threed/scene/rootnode) { get; } | Ottiene il nodo radice della scena. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ottiene la scena a cui appartiene questo oggetto |
| [SubScenes](../../aspose.threed/scene/subscenes) { get; } | Ottiene tutte le scene secondarie |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile)(string) | Apre la scena dal percorso specificato |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_3)(string, CancellationToken) | Apre la scena dal percorso specificato |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_1)(string, FileFormat, CancellationToken) | Apre la scena dal percorso specificato utilizzando il formato file specificato. |
| static [FromFile](../../aspose.threed/scene/fromfile#fromfile_2)(string, LoadOptions, CancellationToken) | Apre la scena dal percorso specificato utilizzando il formato file specificato. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_2)(Stream, CancellationToken) | Apre la scena dal flusso specificato |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream)(Stream, FileFormat, CancellationToken) | Apre la scena da un determinato flusso utilizzando il formato file specificato. |
| static [FromStream](../../aspose.threed/scene/fromstream#fromstream_1)(Stream, LoadOptions, CancellationToken) | Apre la scena da un determinato flusso utilizzando la configurazione IO specificata |
| [Clear](../../aspose.threed/scene/clear)() | Cancella il contenuto della scena e ripristina le impostazioni predefinite. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip)(string) | Una funzione abbreviata per creare e registrare il file[`AnimationClip`](../../aspose.threed.animation/animationclip) Il primo[`AnimationClip`](../../aspose.threed.animation/animationclip) sarà assegnato al[`CurrentAnimationClip`](./currentanimationclip) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip)(string) | Ottiene un nome[`AnimationClip`](../../aspose.threed.animation/animationclip) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [Open](../../aspose.threed/scene/open#open)(Stream) | Apre la scena dal flusso specificato |
| [Open](../../aspose.threed/scene/open#open_4)(string) | Apre la scena dal percorso specificato |
| [Open](../../aspose.threed/scene/open#open_3)(Stream, CancellationToken) | Apre la scena dal flusso specificato |
| [Open](../../aspose.threed/scene/open#open_8)(string, CancellationToken) | Apre la scena dal percorso specificato |
| [Open](../../aspose.threed/scene/open#open_6)(string, LoadOptions) | Apre la scena dal percorso specificato utilizzando il formato file specificato. |
| [Open](../../aspose.threed/scene/open#open_1)(Stream, FileFormat, CancellationToken) | Apre la scena da un determinato flusso utilizzando il formato file specificato. |
| [Open](../../aspose.threed/scene/open#open_2)(Stream, LoadOptions, CancellationToken) | Apre la scena da un determinato flusso utilizzando la configurazione IO specificata |
| [Open](../../aspose.threed/scene/open#open_5)(string, FileFormat, CancellationToken) | Apre la scena dal percorso specificato utilizzando il formato file specificato. |
| [Open](../../aspose.threed/scene/open#open_7)(string, LoadOptions, CancellationToken) | Apre la scena dal percorso specificato utilizzando il formato file specificato. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [Render](../../aspose.threed/scene/render#render)(Camera, Bitmap) | Rendering della scena in bitmap dalla prospettiva della telecamera data. |
| [Render](../../aspose.threed/scene/render#render_2)(Camera, string) | Rendering della scena in un file esterno dalla prospettiva della telecamera data. La dimensione di output predefinita è 1024x768 e il formato di output è png |
| [Render](../../aspose.threed/scene/render#render_1)(Camera, Bitmap, ImageRenderOptions) | Rendering della scena in bitmap dalla prospettiva della telecamera data. |
| [Render](../../aspose.threed/scene/render#render_3)(Camera, string, Size, ImageFormat) | Rendering della scena in un file esterno dalla prospettiva della telecamera data. |
| [Render](../../aspose.threed/scene/render#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Rendering della scena in un file esterno dalla prospettiva della telecamera data. |
| [Save](../../aspose.threed/scene/save#save_4)(string) | Salva la scena nel percorso specificato utilizzando il formato file specificato. |
| [Save](../../aspose.threed/scene/save#save)(Stream, FileFormat) | Salva la scena in streaming utilizzando il formato file specificato. |
| [Save](../../aspose.threed/scene/save#save_2)(Stream, SaveOptions) | Salva la scena in streaming utilizzando il formato file specificato. |
| [Save](../../aspose.threed/scene/save#save_5)(string, FileFormat) | Salva la scena nel percorso specificato utilizzando il formato file specificato. |
| [Save](../../aspose.threed/scene/save#save_7)(string, SaveOptions) | Salva la scena nel percorso specificato utilizzando il formato file specificato. |
| [Save](../../aspose.threed/scene/save#save_1)(Stream, FileFormat, CancellationToken) | Salva la scena in streaming utilizzando il formato file specificato. |
| [Save](../../aspose.threed/scene/save#save_3)(Stream, SaveOptions, CancellationToken) | Salva la scena in streaming utilizzando il formato file specificato. |
| [Save](../../aspose.threed/scene/save#save_6)(string, FileFormat, CancellationToken) | Salva la scena nel percorso specificato utilizzando il formato file specificato. |
| [Save](../../aspose.threed/scene/save#save_8)(string, SaveOptions, CancellationToken) | Salva la scena nel percorso specificato utilizzando il formato file specificato. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |

### Guarda anche

* class [SceneObject](../sceneobject)
* spazio dei nomi [Aspose.ThreeD](../../aspose.threed)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
