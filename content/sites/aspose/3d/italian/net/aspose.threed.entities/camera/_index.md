---
title: Camera
second_title: Riferimento API Aspose.3D per .NET
description: La telecamera descrive il punto di vista dello spettatore che guarda la scena.
type: docs
weight: 250
url: /it/net/aspose.threed.entities/camera/
---
## Camera class

La telecamera descrive il punto di vista dello spettatore che guarda la scena.

```csharp
public class Camera : Frustum
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Camera](camera#constructor)() | Inizializza una nuova istanza di[`Camera`](../camera) classe. |
| [Camera](camera#constructor_1)(ProjectionType) | Inizializza una nuova istanza di[`Camera`](../camera) classe. |
| [Camera](camera#constructor_2)(string) | Inizializza una nuova istanza di[`Camera`](../camera) classe. |
| [Camera](camera#constructor_3)(string, ProjectionType) | Inizializza una nuova istanza di[`Camera`](../camera) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode) { get; set; } | Ottiene o imposta la modalità di apertura della fotocamera |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Ottiene o imposta le proporzioni del frustum |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio) { get; set; } | Ottiene o imposta le proporzioni del piano di visualizzazione. |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Ottiene o imposta la direzione in cui sta guardando la telecamera. Le modifiche a questa proprietà influiranno anche sul[`LookAt`](../frustum/lookat) e[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ottiene o imposta se escludere questa entità durante l'esportazione. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Ottiene o imposta la distanza del piano lontano del tronco. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview) { get; set; } | Ottiene o imposta il campo visivo della telecamera in gradi, questa proprietà viene utilizzata solo quando ApertureMode èHorizontal oVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx) { get; set; } | Ottiene o imposta il campo visivo orizzontale della telecamera in gradi, questa proprietà viene utilizzata solo quando ApertureMode èHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy) { get; set; } | Ottiene o imposta il campo visivo verticale della telecamera in gradi, questa proprietà viene utilizzata solo quando ApertureMode èHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height) { get; set; } | Ottiene o imposta l'altezza del piano della vista misurata in pollici |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Ottiene o imposta la posizione interessata che sta guardando la telecamera. |
| [Magnification](../../aspose.threed.entities/camera/magnification) { get; set; } | Ottiene o imposta l'ingrandimento utilizzato nella fotocamera ortografica |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Ottiene o imposta la distanza del piano vicino del tronco. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Ottiene o imposta l'altezza quando frustum nella proiezione ortografica. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ottiene o imposta il primo nodo padre, se è impostato il primo nodo padre, questa entità verrà scollegata dagli altri nodi padre. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ottiene tutti i nodi principali, un'entità può essere collegata a più nodi principali per l'istanza geometrica |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype) { get; set; } | Ottiene o imposta il tipo di proiezione della telecamera. Per impostazione predefinita viene utilizzata la proiezione prospettica. |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Ottiene o imposta la modalità di orientamento del tronco Questa proprietà funziona solo quando il[`Target`](../frustum/target) è null. Se il valore èFixedTarget , la direzione è sempre calcolata dalla struttura[`LookAt`](../frustum/lookat) Altrimenti il[`LookAt`](../frustum/lookat)è sempre calcolato dal[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ottiene la scena a cui appartiene questo oggetto |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Ottiene o imposta il target che la telecamera sta guardando. Se l'utente supporta questa proprietà, dovrebbe essere prima di[`LookAt`](../frustum/lookat) proprietà. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Ottiene o imposta la direzione verso l'alto della telecamera |
| [Width](../../aspose.threed.entities/camera/width) { get; set; } | Ottiene o imposta la larghezza del piano della vista misurata in pollici |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ottiene il riquadro di delimitazione dell'entità corrente nel suo sistema di coordinate dello spazio oggetti. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ottiene la chiave del renderer di entità registrato nel renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [MoveForward](../../aspose.threed.entities/camera/moveforward)(double) | Sposta la telecamera in avanti verso la sua direzione o destinazione. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |

### Guarda anche

* class [Frustum](../frustum)
* spazio dei nomi [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
