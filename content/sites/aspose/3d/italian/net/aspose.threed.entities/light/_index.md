---
title: Light
second_title: Riferimento API Aspose.3D per .NET
description: La luce illumina la scena.
type: docs
weight: 400
url: /it/net/aspose.threed.entities/light/
---
## Light class

La luce illumina la scena.

La formula per calcolare l'attenuazione totale della luce è: `A = Attenuazione Costante + (Dist * Attenuazione Lineare) + ((Dist^2) * Attenuazione Quadratica)`

```csharp
public class Light : Frustum
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Light](light#constructor)() | Inizializza una nuova istanza di[`Light`](../light) classe. |
| [Light](light#constructor_1)(string) | Inizializza una nuova istanza di[`Light`](../light) classe. |
| [Light](light#constructor_2)(string, LightType) | Inizializza una nuova istanza di[`Light`](../light) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect) { get; set; } | Ottiene o imposta le proporzioni del frustum |
| [CastLight](../../aspose.threed.entities/light/castlight) { get; set; } | Ottiene o imposta se l'istanza di luce corrente può illuminare altri oggetti. |
| [CastShadows](../../aspose.threed.entities/light/castshadows) { get; set; } | Ottiene o imposta se la luce può proiettare ombre su altri oggetti. |
| [Color](../../aspose.threed.entities/light/color) { get; set; } | Ottiene o imposta il colore della luce |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation) { get; set; } | Ottiene o imposta l'attenuazione costante per calcolare l'attenuazione totale della luce |
| [Direction](../../aspose.threed.entities/frustum/direction) { get; set; } | Ottiene o imposta la direzione in cui sta guardando la telecamera. Le modifiche a questa proprietà influiranno anche sul[`LookAt`](../frustum/lookat) e[`Target`](../frustum/target) . |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ottiene o imposta se escludere questa entità durante l'esportazione. |
| [Falloff](../../aspose.threed.entities/light/falloff) { get; set; } | Ottiene o imposta l'angolo del cono di decadimento (in gradi). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane) { get; set; } | Ottiene o imposta la distanza del piano lontano del tronco. |
| [HotSpot](../../aspose.threed.entities/light/hotspot) { get; set; } | Ottiene o imposta l'angolo del cono del punto caldo (in gradi). |
| [Intensity](../../aspose.threed.entities/light/intensity) { get; set; } | Ottiene o imposta l'intensità della luce, il valore predefinito è 100 |
| [LightType](../../aspose.threed.entities/light/lighttype) { get; set; } | Ottiene o imposta il tipo di luce |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation) { get; set; } | Ottiene o imposta l'attenuazione lineare per calcolare l'attenuazione totale della luce |
| [LookAt](../../aspose.threed.entities/frustum/lookat) { get; set; } | Ottiene o imposta la posizione interessata che sta guardando la telecamera. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane) { get; set; } | Ottiene o imposta la distanza del piano vicino del tronco. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight) { get; set; } | Ottiene o imposta l'altezza quando frustum nella proiezione ortografica. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ottiene o imposta il primo nodo padre, se è impostato il primo nodo padre, questa entità verrà scollegata dagli altri nodi padre. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ottiene tutti i nodi principali, un'entità può essere collegata a più nodi principali per l'istanza geometrica |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation) { get; set; } | Ottiene o imposta l'attenuazione quadratica per calcolare l'attenuazione totale della luce |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode) { get; set; } | Ottiene o imposta la modalità di orientamento del tronco Questa proprietà funziona solo quando il[`Target`](../frustum/target) è null. Se il valore èFixedTarget , la direzione è sempre calcolata dalla struttura[`LookAt`](../frustum/lookat) Altrimenti il[`LookAt`](../frustum/lookat)è sempre calcolato dal[`Direction`](../frustum/direction) |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ottiene la scena a cui appartiene questo oggetto |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor) { get; set; } | Ottiene o imposta il colore dell'ombra. |
| [Target](../../aspose.threed.entities/frustum/target) { get; set; } | Ottiene o imposta il target che la telecamera sta guardando. Se l'utente supporta questa proprietà, dovrebbe essere prima di[`LookAt`](../frustum/lookat) proprietà. |
| [Up](../../aspose.threed.entities/frustum/up) { get; set; } | Ottiene o imposta la direzione verso l'alto della telecamera |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ottiene il riquadro di delimitazione dell'entità corrente nel suo sistema di coordinate dello spazio oggetti. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey)() | Ottiene la chiave del renderer di entità registrato nel renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |

### Guarda anche

* class [Frustum](../frustum)
* spazio dei nomi [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
