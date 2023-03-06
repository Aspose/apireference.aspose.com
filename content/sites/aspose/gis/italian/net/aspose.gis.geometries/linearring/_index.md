---
title: Class LinearRing
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Geometries.LinearRing classe. ALinearRing è unLineString che è sia chiuso che semplice.
type: docs
weight: 1130
url: /it/net/aspose.gis.geometries/linearring/
---
## LinearRing class

A`LinearRing` è un[`LineString`](../linestring/) che è sia chiuso che semplice.

```csharp
public class LinearRing : LineString, ILinearRing
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [LinearRing](linearring/#constructor)() | Inizializza una nuova istanza di`LinearRing` classe. |
| [LinearRing](linearring/#constructor_2)(IEnumerable&lt;IPoint&gt;) | Inizializza una nuova istanza di`LinearRing` classe. |
| [LinearRing](linearring/#constructor_1)(ILineString) | Inizializza una nuova istanza di`LinearRing` classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Ottiene il numero di dimensioni delle coordinate per questo[`Geometry`](../geometry/) . |
| [Count](../../aspose.gis.geometries/linestring/count/) { get; } | Ottiene il numero di punti in[`LineString`](../linestring/) . |
| [Dimension](../../aspose.gis.geometries/curve/dimension/) { get; } | Ottiene la dimensione topologica di this[`Geometry`](../geometry/) . |
| override [EndPoint](../../aspose.gis.geometries/linestring/endpoint/) { get; } | Restituisce una copia del punto finale della curva. |
| override [GeometryType](../../aspose.gis.geometries/linearring/geometrytype/) { get; } | Ottiene il tipo di geometria. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Ottiene un valore che indica se questa geometria è o contiene geometria curva (non lineare). |
| [HasM](../../aspose.gis.geometries/linestring/hasm/) { get; set; } | Ottiene un valore che indica se questa istanza ha coordinate M. |
| [HasZ](../../aspose.gis.geometries/linestring/hasz/) { get; set; } | Ottiene un valore che indica se questa istanza ha la coordinata Z. |
| [IsClosed](../../aspose.gis.geometries/curve/isclosed/) { get; } | Ottiene un valore che indica se una curva è chiusa. Una curva è chiusa se il suo punto iniziale è uguale al suo punto finale. |
| override [IsEmpty](../../aspose.gis.geometries/linestring/isempty/) { get; } | Ottiene un valore che indica se questa istanza è vuota. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Ottiene un valore che indica se questa istanza è semplice dal punto di vista SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Ottiene un valore che indica se questa istanza è valida. |
| [Item](../../aspose.gis.geometries/linestring/item/) { get; set; } | Ottiene o imposta il[`IPoint`](../ipoint/) all'indice specificato. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/linestring/spatialreferencesystem/) { get; set; } | Ottiene SpatialReferenceSystem di questa istanza. Questa proprietà può essere`null` , se SpatialReferenceSystem non è impostato. L'assegnazione di un nuovo SpatialReferenceSystem non eseguirà alcuna trasformazione delle coordinate, cambierà solo il riferimento. |
| override [StartPoint](../../aspose.gis.geometries/linestring/startpoint/) { get; } | Restituisce una copia del punto iniziale della curva. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(IPoint) | Aggiunge un punto alla fine della riga. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double) | Aggiunge un punto alla fine della riga. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double, double) | Aggiunge un punto alla fine della riga. |
| [AddPoint](../../aspose.gis.geometries/linestring/addpoint/)(double, double, double, double) | Aggiunge un punto alla fine della riga. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)() | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/)(WkbVariant) | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)() | Traduce questa geometria nella sua rappresentazione Well-Known Text. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant) | Traduce questa geometria nella sua rappresentazione Well-Known Text. |
| [AsText](../../aspose.gis.geometries/geometry/astext/)(WktVariant, NumericFormat) | Traduce questa geometria nella sua rappresentazione Well-Known Text. |
| override [Clone](../../aspose.gis.geometries/linearring/clone/)() | Clona questa istanza. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Determina se questa geometria è coperta da una geometria specificata. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Determina se questa geometria copre una geometria specificata. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Determina se questa geometria e una geometria specificata si incrociano. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Sottrae una geometria specificata da questa geometria. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Determina se questa geometria è disgiunta da una geometria specificata. |
| [Equals](../../aspose.gis.geometries/linestring/equals/)(ILineString) | Indica se l'oggetto corrente è uguale a un altro oggetto dello stesso tipo. |
| override [Equals](../../aspose.gis.geometries/linestring/equals/)(object) | Determina se l'oggetto specificato è uguale all'oggetto corrente. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Calcola l'area di questa geometria. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Calcola una regione buffer attorno a questa geometria. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Calcola il baricentro di questa geometria. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Calcola lo scafo convesso di questa geometria. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Calcola la distanza minima tra questa geometria e una geometria specificata. |
| [GetEnumerator](../../aspose.gis.geometries/linestring/getenumerator/)() | Restituisce un enumeratore che scorre la raccolta. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Calcola e restituisce un'estensione di delimitazione di questa geometria. |
| override [GetHashCode](../../aspose.gis.geometries/linestring/gethashcode/)() | Funge da funzione hash predefinita. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Calcola la lunghezza di questa geometria. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Crea un'intersezione tra questa geometria e una geometria specificata. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(Extent) | Determina se questa geometria interseca un'estensione specificata. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/)(IGeometry) | Determina se questa geometria e una geometria specificata si intersecano. |
| [IsClockwise](../../aspose.gis.geometries/linearring/isclockwise/)() | Determina se l'anello ha un avvolgimento in senso orario. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Determina se questa geometria si sovrappone a una geometria specificata. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Determina se la matrice di intersezione DE-9IM di questa geometria e una geometria specificata corrispondono al modello fornito. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Ottiene i poligoni rappresentati come linee di questa geometria. |
| override [Reverse](../../aspose.gis.geometries/linestring/reverse/)() | Inverte l'ordine dei punti in questo[`LineString`](../linestring/) . |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Arrotonda la coordinata M a un numero specificato di cifre frazionarie. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Arrotonda le coordinate X e Y a un numero specificato di cifre frazionarie. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Arrotonda la coordinata Z a un numero specificato di cifre frazionarie. |
| override [SetEmpty](../../aspose.gis.geometries/linestring/setempty/)() | Fa questo[`Geometry`](../geometry/) vuoto. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Determina se questa geometria contiene spazialmente una geometria specificata. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Determina se questa geometria è spazialmente uguale a una geometria specificata. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Crea una differenza simmetrica tra questa geometria e una geometria specificata. |
| [ToEditable](../../aspose.gis.geometries/linearring/toeditable/#toeditable_2)() | Ottiene una copia modificabile di questa geometria. (4 methods) |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/)() | Ottiene una copia modificabile di questa geometria. |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)() | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'impostazione predefinita`tolleranza` . (2 methods) |
| [ToLinearGeometry](../../aspose.gis.geometries/curve/tolineargeometry/)(double) | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'oggetto specificato`tolleranza` . (2 methods) |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Determina se questa geometria e una geometria specificata si toccano. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Unisce questa geometria e una geometria specificata. |
| [Within](../../aspose.gis.geometries/geometry/within/)(Extent) | Determina se questa geometria si trova all'interno di un'estensione specificata. |
| [Within](../../aspose.gis.geometries/geometry/within/)(IGeometry) | Determina se questa geometria si trova all'interno di una geometria specificata. |

### Guarda anche

* class [LineString](../linestring/)
* interface [ILinearRing](../ilinearring/)
* spazio dei nomi [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assemblea [Aspose.GIS](../../)


