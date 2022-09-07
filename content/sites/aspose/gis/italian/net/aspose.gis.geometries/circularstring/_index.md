---
title: CircularString
second_title: Riferimento API Aspose.GIS per .NET
description: Una curva multivertice con interpolazione circolare tra i punti.
type: docs
weight: 780
url: /it/net/aspose.gis.geometries/circularstring/
---
## CircularString class

Una curva multi-vertice con interpolazione circolare tra i punti.

```csharp
public class CircularString : Curve, ICircularString
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [CircularString](circularstring#constructor)() | Inizializza una nuova istanza di[`CircularString`](../circularstring) classe. |
| [CircularString](circularstring#constructor_1)(ICircularString) | Inizializza una nuova istanza di[`CircularString`](../circularstring) classe. |
| [CircularString](circularstring#constructor_2)(IEnumerable&lt;IPoint&gt;) | Inizializza una nuova istanza di[`CircularString`](../circularstring) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension) { get; } | Ottiene il numero di dimensioni coordinate per questo[`Geometry`](../geometry) . |
| [Count](../../aspose.gis.geometries/circularstring/count) { get; } | Ottiene il numero di punti nel file[`CircularString`](../circularstring) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension) { get; } | Ottiene la dimensione topologica di questo[`Geometry`](../geometry) . |
| override [EndPoint](../../aspose.gis.geometries/circularstring/endpoint) { get; } | Restituisce una copia del punto finale della curva. |
| override [GeometryType](../../aspose.gis.geometries/circularstring/geometrytype) { get; } | Ottiene il tipo della geometria. |
| override [HasCurveGeometry](../../aspose.gis.geometries/circularstring/hascurvegeometry) { get; } | Ottiene un valore che indica se questa geometria è o contiene una geometria curva (non lineare). |
| [HasM](../../aspose.gis.geometries/circularstring/hasm) { get; set; } | Ottiene un valore che indica se questa istanza ha la coordinata M. |
| [HasZ](../../aspose.gis.geometries/circularstring/hasz) { get; set; } | Ottiene un valore che indica se questa istanza ha la coordinata Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed) { get; } | Ottiene un valore che indica se una curva è chiusa. Una curva è chiusa se il suo punto iniziale è uguale al suo punto finale. |
| override [IsEmpty](../../aspose.gis.geometries/circularstring/isempty) { get; } | Ottiene un valore che indica se questa istanza è vuota. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple) { get; } | Ottiene un valore che indica se questa istanza è semplice dal punto di vista SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid) { get; } | Ottiene un valore che indica se questa istanza è valida. |
| [Item](../../aspose.gis.geometries/circularstring/item) { get; set; } | Ottiene o imposta il[`IPoint`](../ipoint) all'indice specificato. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/circularstring/spatialreferencesystem) { get; set; } | Ottiene SpatialReferenceSystem di questa istanza. Questa proprietà può essere`null` , se SpatialReferenceSystem non è impostato. L'assegnazione di un nuovo SpatialReferenceSystem non eseguirà alcuna trasformazione delle coordinate, cambierà solo il riferimento. |
| override [StartPoint](../../aspose.gis.geometries/circularstring/startpoint) { get; } | Restituisce una copia del punto iniziale della curva. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint#addpoint)(IPoint) | Aggiunge un punto alla fine della stringa circolare. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint#addpoint_1)(double, double) | Aggiunge un punto alla fine della stringa circolare. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint#addpoint_2)(double, double, double) | Aggiunge un punto alla fine della stringa circolare. |
| [AddPoint](../../aspose.gis.geometries/circularstring/addpoint#addpoint_3)(double, double, double, double) | Aggiunge un punto alla fine della stringa circolare. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)() | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary)(WkbVariant) | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsText](../../aspose.gis.geometries/geometry/astext)() | Traduce questa geometria nella sua rappresentazione di testo noto. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant) | Traduce questa geometria nella sua rappresentazione di testo noto. |
| [AsText](../../aspose.gis.geometries/geometry/astext)(WktVariant, NumericFormat) | Traduce questa geometria nella sua rappresentazione di testo noto. |
| override [Clone](../../aspose.gis.geometries/circularstring/clone)() | Clona questa istanza. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby)(IGeometry) | Determina se questa geometria è coperta da una geometria specificata. |
| [Covers](../../aspose.gis.geometries/geometry/covers)(IGeometry) | Determina se questa geometria copre una geometria specificata. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses)(IGeometry) | Determina se questa geometria e una geometria specificata si incrociano. |
| [Difference](../../aspose.gis.geometries/geometry/difference)(IGeometry) | Sottrae una geometria specificata da questa geometria. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint)(IGeometry) | Determina se questa geometria è disgiunta da una geometria specificata. |
| [Equals](../../aspose.gis.geometries/circularstring/equals#equals)(ICircularString) | Indica se l'oggetto corrente è uguale a un altro oggetto dello stesso tipo. |
| override [Equals](../../aspose.gis.geometries/circularstring/equals#equals_1)(object) | Determina se l'oggetto specificato è uguale all'oggetto corrente. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea)() | Calcola l'area di questa geometria. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer)(double, int) | Calcola una regione buffer attorno a questa geometria. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid)() | Calcola il baricentro di questa geometria. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull)() | Calcola lo scafo convesso di questa geometria. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto)(IGeometry) | Calcola la distanza minima tra questa geometria e una geometria specificata. |
| [GetEnumerator](../../aspose.gis.geometries/circularstring/getenumerator)() | Restituisce un enumeratore che scorre la raccolta. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent)() | Calcola e restituisce un'estensione di delimitazione di questa geometria. |
| override [GetHashCode](../../aspose.gis.geometries/circularstring/gethashcode)() | Serve come funzione hash predefinita. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength)() | Calcola la lunghezza di questa geometria. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection)(IGeometry) | Crea un'intersezione tra questa geometria e una geometria specificata. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(Extent) | Determina se questa geometria interseca un'estensione specificata. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects)(IGeometry) | Determina se questa geometria e una geometria specificata si intersecano. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps)(IGeometry) | Determina se questa geometria si sovrappone a una geometria specificata. |
| [Relate](../../aspose.gis.geometries/geometry/relate)(IGeometry, string) | Determina se la matrice di intersezione DE-9IM di questa geometria e una geometria specificata corrisponde al modello fornito. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines)() | Ottiene i poligoni rappresentati come linee di questa geometria. |
| override [Reverse](../../aspose.gis.geometries/circularstring/reverse)() | Inverte l'ordine dei punti in questo[`CircularString`](../circularstring) . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm)(int) | Arrotonda la coordinata M a un numero specificato di cifre frazionarie. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy)(int) | Arrotonda le coordinate X e Y a un numero specificato di cifre frazionarie. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz)(int) | Arrotonda la coordinata Z a un numero specificato di cifre frazionarie. |
| override [SetEmpty](../../aspose.gis.geometries/circularstring/setempty)() | Fa questo[`Geometry`](../geometry) vuoto. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains)(IGeometry) | Determina se questa geometria contiene spazialmente una geometria specificata. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals)(IGeometry) | Determina se questa geometria è spazialmente uguale a una geometria specificata. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference)(IGeometry) | Crea una differenza simmetrica tra questa geometria e una geometria specificata. |
| [ToEditable](../../aspose.gis.geometries/circularstring/toeditable#toeditable)() | Ottiene una copia modificabile di questa geometria. (3 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable)() | Ottiene una copia modificabile di questa geometria. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)() | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'impostazione predefinita`tolleranza` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry)(double) | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'elemento specificato`tolleranza` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [Touches](../../aspose.gis.geometries/geometry/touches)(IGeometry) | Determina se questa geometria e una geometria specificata si toccano. |
| [Union](../../aspose.gis.geometries/geometry/union)(IGeometry) | Unisce questa geometria e una geometria specificata. |
| [Within](../../aspose.gis.geometries/geometry/within)(Extent) | Determina se questa geometria rientra in un'estensione specificata. |
| [Within](../../aspose.gis.geometries/geometry/within)(IGeometry) | Determina se questa geometria è all'interno di una geometria specificata. |
| [operator ==](../../aspose.gis.geometries/circularstring/op_equality) | Implementa l'operatore ==. |
| [operator !=](../../aspose.gis.geometries/circularstring/op_inequality) | Implementa l'operatore !=. |

### Osservazioni

Il`Stringa Circolare` è costituito da uno o più segmenti di arco circolare collegati da un capo all'altro. I primi tre punti definiscono il primo segmento. Il primo punto è il punto iniziale dell'arco. Il secondo punto è qualsiasi punto intermedio sull'arco diverso dal punto iniziale o finale. Il terzo punto è la fine dell'arco. Gli archi successivi sono definiti solo dai loro punti intermedi e finali, poiché il punto iniziale è implicitamente definito come punto finale del segmento precedente.

### Guarda anche

* class [Curve](../curve)
* interface [ICircularString](../icircularstring)
* spazio dei nomi [Aspose.Gis.Geometries](../../aspose.gis.geometries)
* assemblea [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
