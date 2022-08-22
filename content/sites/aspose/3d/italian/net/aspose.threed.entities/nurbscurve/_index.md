---
title: NurbsCurve
second_title: Riferimento API Aspose.3D per .NET
description: curva NURBShttps//en.wikipedia.org/wiki/Nonuniform_rational_Bspline è una curva rappresentata da NURBSSpline di base razionale non uniforme Una curva NURBS è definita dalla suaOrder./nurbscurve/order  un insieme di pesiControlPoints./geometry/controlpoints e unKnotVectors./nurbscurve/knotvectors Il componente w nel punto di controllo viene utilizzato come peso del punto di controllo qualunque esso sia aTwoDimensional oThreeDimensional
type: docs
weight: 460
url: /it/net/aspose.threed.entities/nurbscurve/
---
## NurbsCurve class

[curva NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) è una curva rappresentata da NURBS(Spline di base razionale non uniforme), Una curva NURBS è definita dalla sua[`Order`](./order) , un insieme di pesi[`ControlPoints`](../geometry/controlpoints) e un[`KnotVectors`](./knotvectors) Il componente w nel punto di controllo viene utilizzato come peso del punto di controllo, qualunque esso sia aTwoDimensional oThreeDimensional

```csharp
public class NurbsCurve : Curve
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [NurbsCurve](nurbscurve#constructor)() | Inizializza una nuova istanza di[`NurbsCurve`](../nurbscurve) classe. |
| [NurbsCurve](nurbscurve#constructor_1)(string) | Inizializza una nuova istanza di[`NurbsCurve`](../nurbscurve) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Color](../../aspose.threed.entities/curve/color) { get; set; } | Ottiene o imposta il colore della linea, il valore predefinito è white(1, 1, 1) |
| [ControlPoints](../../aspose.threed.entities/nurbscurve/controlpoints) { get; } | Ottiene tutti i punti di controllo |
| [CurveType](../../aspose.threed.entities/nurbscurve/curvetype) { get; set; } | Ottiene o imposta il tipo della curva. |
| [Dimension](../../aspose.threed.entities/nurbscurve/dimension) { get; set; } | Ottiene o imposta la dimensione della curva. |
| [Excluded](../../aspose.threed/entity/excluded) { get; set; } | Ottiene o imposta se escludere questa entità durante l'esportazione. |
| [KnotVectors](../../aspose.threed.entities/nurbscurve/knotvectors) { get; } | Ottiene il vettore nodo, è una sequenza di valori di parametro che determina dove e come i punti di controllo influiscono sulla curva NURBS. |
| [Multiplicity](../../aspose.threed.entities/nurbscurve/multiplicity) { get; } | Ottiene la molteplicità. |
| virtual [Name](../../aspose.threed/a3dobject/name) { get; set; } | Ottiene o imposta il nome. |
| [Order](../../aspose.threed.entities/nurbscurve/order) { get; set; } | Ottiene o imposta l'ordine di una curva NURBS, definisce il numero di punti di controllo vicini che influenzano un dato punto sulla curva. |
| [ParentNode](../../aspose.threed/entity/parentnode) { get; set; } | Ottiene o imposta il primo nodo padre, se è impostato il primo nodo padre, questa entità verrà scollegata dagli altri nodi padre. |
| [ParentNodes](../../aspose.threed/entity/parentnodes) { get; } | Ottiene tutti i nodi principali, un'entità può essere collegata a più nodi principali per l'istanza geometrica |
| [Properties](../../aspose.threed/a3dobject/properties) { get; } | Ottiene la raccolta di tutte le proprietà. |
| [Rational](../../aspose.threed.entities/nurbscurve/rational) { get; set; } | Ottiene o imposta se è razionale, questo valore indica se questo[`NurbsCurve`](../nurbscurve) è spline razionale o spline non razionale. La spline B non razionale è un caso speciale di spline B razionali. |
| [Scene](../../aspose.threed/sceneobject/scene) { get; } | Ottiene la scena a cui appartiene questo oggetto |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Evaluate](../../aspose.threed.entities/nurbscurve/evaluate)(int) | Valuta la curva NURBS |
| [EvaluateAt](../../aspose.threed.entities/nurbscurve/evaluateat)(double) | Valuta il punto della curva nella posizione specificata |
| [FindProperty](../../aspose.threed/a3dobject/findproperty)(string) | Trova la proprietà. Può essere una proprietà dinamica (creata da CreateDynamicProperty/SetProperty) o una proprietà nativa (identificata dal nome) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox)() | Ottiene il riquadro di delimitazione dell'entità corrente nel suo sistema di coordinate dello spazio oggetti. |
| override [GetEntityRendererKey](../../aspose.threed.entities/curve/getentityrendererkey)() | Ottiene la chiave del renderer di entità registrato nel renderer |
| [GetProperty](../../aspose.threed/a3dobject/getproperty)(string) | Ottieni il valore della proprietà specificata |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(Property) | Rimuove una proprietà dinamica. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty)(string) | Rimuove la proprietà specificata identificata da nome |
| [SetProperty](../../aspose.threed/a3dobject/setproperty)(string, object) | Imposta il valore della proprietà specificata |

### Guarda anche

* class [Curve](../curve)
* spazio dei nomi [Aspose.ThreeD.Entities](../../aspose.threed.entities)
* assemblea [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
