---
title: Interface ICurve
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Geometries.ICurve interfaccia. AICurve è una sequenza di punti.
type: docs
weight: 980
url: /it/net/aspose.gis.geometries/icurve/
---
## ICurve interface

A`ICurve` è una sequenza di punti.

```csharp
public interface ICurve : IGeometry
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [EndPoint](../../aspose.gis.geometries/icurve/endpoint/) { get; } | Restituisce una copia del punto finale della curva. |
| [IsClosed](../../aspose.gis.geometries/icurve/isclosed/) { get; } | Ottiene un valore che indica se una curva è chiusa. Una curva è chiusa se il suo punto iniziale è uguale al suo punto finale. |
| [StartPoint](../../aspose.gis.geometries/icurve/startpoint/) { get; } | Restituisce una copia del punto iniziale della curva. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [ToEditable](../../aspose.gis.geometries/icurve/toeditable/)() | Ottiene una copia modificabile di questa geometria. |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry)() | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'impostazione predefinita`tolleranza` . |
| [ToLinearGeometry](../../aspose.gis.geometries/icurve/tolineargeometry/#tolineargeometry_1)(double) | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'oggetto specificato`tolleranza` . |

### Guarda anche

* interface [IGeometry](../igeometry/)
* spazio dei nomi [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assemblea [Aspose.GIS](../../)


