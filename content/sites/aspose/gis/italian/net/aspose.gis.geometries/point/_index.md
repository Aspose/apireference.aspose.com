---
title: Point
second_title: Riferimento API Aspose.GIS per .NET
description: APoint./point rappresenta una singola posizione nello spazio delle coordinate.
type: docs
weight: 1090
url: /it/net/aspose.gis.geometries/point/
---
## Point class

A[`Point`](../point) rappresenta una singola posizione nello spazio delle coordinate.

```csharp
public class Point : Geometry, IPoint
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Point](point#constructor)() | Inizializza una nuova istanza di[`Point`](../point) classe. |
| [Point](point#constructor_1)(IPoint) | Inizializza una nuova istanza di[`Point`](../point) classe. |
| [Point](point#constructor_2)(double, double) | Inizializza una nuova istanza di[`Point`](../point) classe. |
| [Point](point#constructor_3)(double, double, double) | Inizializza una nuova istanza di[`Point`](../point) classe. |
| [Point](point#constructor_4)(double, double, double, double) | Inizializza una nuova istanza di[`Point`](../point) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Ottiene il numero di dimensioni coordinate per questo[`Geometry`](../geometry) . |
| override [Dimension](../../aspose.gis.geometries/point/dimension) { get; } | Ottiene la dimensione topologica di questo[`Geometry`](../geometry) . |
| override [GeometryType](../../aspose.gis.geometries/point/geometrytype) { get; } | Ottiene il tipo della geometria. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry) { get; } | Ottiene un valore che indica se questa geometria è o contiene una geometria curva (non lineare). |
| override [HasM](../../aspose.gis.geometries/point/hasm) { get; set; } | Ottiene un valore che indica se questa istanza ha una coordinata M. |
| override [HasZ](../../aspose.gis.geometries/point/hasz) { get; set; } | Ottiene un valore che indica se questa istanza ha la coordinata Z. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty) { get; } | Ottiene un valore che indica se questa istanza è vuota. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Ottiene un valore che indica se questa istanza è semplice dal punto di vista SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Ottiene un valore che indica se questa istanza è valida. |
| [M](../../aspose.gis.geometries/point/m) { get; set; } | Ottiene o imposta un valore per la coordinata m. |
| override [SpatialReferenceSystem](../../aspose.gis.geometries/point/spatialreferencesystem) { get; set; } | Ottiene SpatialReferenceSystem di questa istanza. Questa proprietà può essere`null` , SpatialReferenceSystem è sconosciuto. L'assegnazione di un nuovo SpatialReferenceSystem non eseguirà alcuna trasformazione delle coordinate, cambierà solo il riferimento. |
| [X](../../aspose.gis.geometries/point/x) { get; set; } | Ottiene o imposta un valore per la coordinata x. |
| [Y](../../aspose.gis.geometries/point/y) { get; set; } | Ottiene o imposta un valore per la coordinata y. |
| [Z](../../aspose.gis.geometries/point/z) { get; set; } | Ottiene o imposta un valore per la coordinata z. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Traduce questa geometria nella sua rappresentazione di testo noto. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Traduce questa geometria nella sua rappresentazione di testo noto. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Traduce questa geometria nella sua rappresentazione di testo noto. |
| override [Clone](../../aspose.gis.geometries/point/clone)() | Clona questa istanza. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Determina se questa geometria è coperta da una geometria specificata. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Determina se questa geometria copre una geometria specificata. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Determina se questa geometria e una geometria specificata si incrociano. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Sottrae una geometria specificata da questa geometria. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Determina se questa geometria è disgiunta da una geometria specificata. |
| [Equals](../../aspose.gis.geometries/point/equals#equals)(IPoint) | Indica se l'oggetto corrente è uguale a un altro oggetto dello stesso tipo. |
| override [Equals](../../aspose.gis.geometries/point/equals#equals_1)(object) | Determina se l'oggetto specificato è uguale all'oggetto corrente. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Calcola l'area di questa geometria. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Calcola una regione buffer attorno a questa geometria. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Calcola il baricentro di questa geometria. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Calcola lo scafo convesso di questa geometria. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Calcola la distanza minima tra questa geometria e una geometria specificata. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Calcola e restituisce un'estensione di delimitazione di questa geometria. |
| override [GetHashCode](../../aspose.gis.geometries/point/gethashcode)() | Serve come funzione hash predefinita. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Calcola la lunghezza di questa geometria. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Crea un'intersezione tra questa geometria e una geometria specificata. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Determina se questa geometria interseca un'estensione specificata. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Determina se questa geometria e una geometria specificata si intersecano. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Determina se questa geometria si sovrappone a una geometria specificata. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Determina se la matrice di intersezione DE-9IM di questa geometria e una geometria specificata corrisponde al modello fornito. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Ottiene i poligoni rappresentati come linee di questa geometria. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Arrotonda la coordinata M a un numero specificato di cifre frazionarie. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Arrotonda le coordinate X e Y a un numero specificato di cifre frazionarie. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Arrotonda la coordinata Z a un numero specificato di cifre frazionarie. |
| override [SetEmpty](../../aspose.gis.geometries/point/setempty)() | Fa questo[`Geometry`](../geometry) vuoto. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Determina se questa geometria contiene spazialmente una geometria specificata. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Determina se questa geometria è spazialmente uguale a una geometria specificata. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Crea una differenza simmetrica tra questa geometria e una geometria specificata. |
| [ToEditable](../../aspose.gis.geometries/point/toeditable#toeditable_1)() | Ottiene una copia modificabile di questa geometria. (2 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Ottiene una copia modificabile di questa geometria. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry)() | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'impostazione predefinita`tolleranza` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry)(double) | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'elemento specificato`tolleranza` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Determina se questa geometria e una geometria specificata si toccano. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Unisce questa geometria e una geometria specificata. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Determina se questa geometria rientra in un'estensione specificata. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Determina se questa geometria è all'interno di una geometria specificata. |
| [operator ==](../../aspose.gis.geometries/point/op_equality) | Implementa l'operatore ==. |
| [operator !=](../../aspose.gis.geometries/point/op_inequality) | Implementa l'operatore !=. |

### Guarda anche

* class [Geometry](../geometry)
* interface [IPoint](../ipoint)
* spazio dei nomi [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
