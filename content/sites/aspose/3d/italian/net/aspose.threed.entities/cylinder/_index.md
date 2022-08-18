---
title: Cylinder
second_title: Riferimento API Aspose.3D per .NET
description: Cilindro parametrizzato. Può essere utilizzato anche per rappresentare il cono quando uno di raggioTop/radiusBottom è zero.
type: docs
weight: 310
url: /it/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Cilindro parametrizzato. Può essere utilizzato anche per rappresentare il cono quando uno di raggioTop/radiusBottom è zero.

```csharp
public class Cylinder : Primitive
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Cylinder](cylinder#constructor)() | Inizializza una nuova istanza di[`Cylinder`](../cylinder) classe. |
| [Cylinder](cylinder#constructor_1)(double, double) | Inizializza una nuova istanza di[`Cylinder`](../cylinder) classe. |
| [Cylinder](cylinder#constructor_2)(double, double, double) | Inizializza una nuova istanza di[`Cylinder`](../cylinder) classe. |
| [Cylinder](cylinder#constructor_3)(double, double, double, int, int, bool) | Inizializza una nuova istanza di[`Cylinder`](../cylinder) classe. |
| [Cylinder](cylinder#constructor_4)(string, double, double, double, int, int, bool, double, double) | Inizializza una nuova istanza di[`Cylinder`](../cylinder) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows) { get; set; } | Ottiene o imposta se questa geometria può proiettare ombra |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ottiene o imposta se escludere questa entità durante l'esportazione. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder) { get; set; } | Ottiene o imposta se generare il cilindro a ventaglio quando ThetaLength è inferiore a 2*PI, altrimenti il modello non verrà tagliato. |
| [Height](../../aspose.threed.entities/cylinder/height) { get; set; } | Ottiene o imposta l'altezza del cilindro. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments) { get; set; } | Ottiene o imposta i segmenti di altezza. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom) { get; set; } | Ottiene o imposta l'offset di trasformazione dei vertici del lato inferiore. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop) { get; set; } | Ottiene o imposta l'offset di trasformazione dei vertici del lato superiore. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended) { get; set; } | Ottiene o imposta un valore che indica se questo[`Cylinder`](../cylinder) aperto terminato. Il valore predefinito è false. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ottiene o imposta il primo nodo padre, se è impostato il primo nodo padre, questa entità verrà scollegata dagli altri nodi padre. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ottiene tutti i nodi principali, un'entità può essere collegata a più nodi principali per l'istanza geometrica |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments) { get; set; } | Ottiene o imposta i segmenti radiali. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom) { get; set; } | Ottiene o imposta il raggio del tappo inferiore del cilindro. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop) { get; set; } | Ottiene o imposta il raggio del tappo superiore del cilindro. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows) { get; set; } | Ottiene o imposta se questa geometria può ricevere ombra. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ottiene la scena a cui appartiene questo oggetto |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom) { get; set; } | Ottiene o imposta la trasformazione di taglio del lato inferiore, vettore memorizza il valore di taglio (asse x, asse z) misurato in radianti, il valore predefinito è (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop) { get; set; } | Ottiene o imposta la trasformazione di taglio del lato superiore, vettore memorizza il valore di taglio (asse x, asse z) misurato in radianti, il valore predefinito è (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength) { get; set; } | Ottiene o imposta la lunghezza del theta. Il valore predefinito è 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart) { get; set; } | Ottiene o imposta l'inizio theta. Il valore predefinito è 0. |

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
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh)() | Converti l'oggetto corrente in mesh |

### Guarda anche

* class [Primitive](../primitive)
* spazio dei nomi [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
