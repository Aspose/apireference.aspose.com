---
title: Class Geometry
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Geometries.Geometry classe. La classe radice astratta della gerarchia delle geometrie.
type: docs
weight: 920
url: /it/net/aspose.gis.geometries/geometry/
---
## Geometry class

La classe radice astratta della gerarchia delle geometrie.

```csharp
public abstract class Geometry : IGeometry
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [CoordinateDimension](../../aspose.gis.geometries/geometry/coordinatedimension/) { get; } | Ottiene il numero di dimensioni delle coordinate per questo`Geometry` . |
| abstract [Dimension](../../aspose.gis.geometries/geometry/dimension/) { get; } | Ottiene la dimensione topologica di this`Geometry` . Se la dimensione è sconosciuta (ad es. per una GEOMETRYCOLLECTION vuota)Point viene restituito. |
| abstract [GeometryType](../../aspose.gis.geometries/geometry/geometrytype/) { get; } | Ottiene il tipo di geometria. |
| virtual [HasCurveGeometry](../../aspose.gis.geometries/geometry/hascurvegeometry/) { get; } | Ottiene un valore che indica se questa geometria è o contiene geometria curva (non lineare). |
| virtual [HasM](../../aspose.gis.geometries/geometry/hasm/) { get; set; } | Ottiene un valore che indica se questa istanza ha coordinate M. |
| virtual [HasZ](../../aspose.gis.geometries/geometry/hasz/) { get; set; } | Ottiene un valore che indica se questa istanza ha la coordinata Z. |
| virtual [IsEmpty](../../aspose.gis.geometries/geometry/isempty/) { get; } | Ottiene un valore che indica se questa istanza è vuota. |
| [IsSimple](../../aspose.gis.geometries/geometry/issimple/) { get; } | Ottiene un valore che indica se questa istanza è semplice dal punto di vista SFA. |
| [IsValid](../../aspose.gis.geometries/geometry/isvalid/) { get; } | Ottiene un valore che indica se questa istanza è valida. |
| abstract [SpatialReferenceSystem](../../aspose.gis.geometries/geometry/spatialreferencesystem/) { get; set; } | Ottiene SpatialReferenceSystem di questa istanza. Questa proprietà può essere`null` , è SpatialReferenceSystem sconosciuto. L'assegnazione di un nuovo SpatialReferenceSystem non eseguirà alcuna trasformazione delle coordinate, cambierà solo il riferimento. |
| static [Null](../../aspose.gis.geometries/geometry/null/) { get; } | Ottiene un'istanza di geometria nulla. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/#asbinary)() | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsBinary](../../aspose.gis.geometries/geometry/asbinary/#asbinary_1)(WkbVariant) | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/geometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext)() | Traduce questa geometria nella sua rappresentazione Well-Known Text. |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext_1)(WktVariant) | Traduce questa geometria nella sua rappresentazione Well-Known Text. |
| [AsText](../../aspose.gis.geometries/geometry/astext/#astext_2)(WktVariant, NumericFormat) | Traduce questa geometria nella sua rappresentazione Well-Known Text. |
| abstract [Clone](../../aspose.gis.geometries/geometry/clone/)() | Clona questa istanza. |
| [CoveredBy](../../aspose.gis.geometries/geometry/coveredby/)(IGeometry) | Determina se questa geometria è coperta da una geometria specificata. |
| [Covers](../../aspose.gis.geometries/geometry/covers/)(IGeometry) | Determina se questa geometria copre una geometria specificata. |
| [Crosses](../../aspose.gis.geometries/geometry/crosses/)(IGeometry) | Determina se questa geometria e una geometria specificata si incrociano. |
| [Difference](../../aspose.gis.geometries/geometry/difference/)(IGeometry) | Sottrae una geometria specificata da questa geometria. |
| [Disjoint](../../aspose.gis.geometries/geometry/disjoint/)(IGeometry) | Determina se questa geometria è disgiunta da una geometria specificata. |
| [GetArea](../../aspose.gis.geometries/geometry/getarea/)() | Calcola l'area di questa geometria. |
| [GetBuffer](../../aspose.gis.geometries/geometry/getbuffer/)(double, int) | Calcola una regione buffer attorno a questa geometria. |
| [GetCentroid](../../aspose.gis.geometries/geometry/getcentroid/)() | Calcola il baricentro di questa geometria. |
| [GetConvexHull](../../aspose.gis.geometries/geometry/getconvexhull/)() | Calcola lo scafo convesso di questa geometria. |
| [GetDistanceTo](../../aspose.gis.geometries/geometry/getdistanceto/)(IGeometry) | Calcola la distanza minima tra questa geometria e una geometria specificata. |
| [GetExtent](../../aspose.gis.geometries/geometry/getextent/)() | Calcola e restituisce un'estensione di delimitazione di questa geometria. |
| [GetLength](../../aspose.gis.geometries/geometry/getlength/)() | Calcola la lunghezza di questa geometria. |
| [Intersection](../../aspose.gis.geometries/geometry/intersection/)(IGeometry) | Crea un'intersezione tra questa geometria e una geometria specificata. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/#intersects)(Extent) | Determina se questa geometria interseca un'estensione specificata. |
| [Intersects](../../aspose.gis.geometries/geometry/intersects/#intersects_1)(IGeometry) | Determina se questa geometria e una geometria specificata si intersecano. |
| [Overlaps](../../aspose.gis.geometries/geometry/overlaps/)(IGeometry) | Determina se questa geometria si sovrappone a una geometria specificata. |
| [Relate](../../aspose.gis.geometries/geometry/relate/)(IGeometry, string) | Determina se la matrice di intersezione DE-9IM di questa geometria e una geometria specificata corrispondono al modello fornito. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/geometry/replacepolygonsbylines/)() | Ottiene i poligoni rappresentati come linee di questa geometria. |
| [RoundM](../../aspose.gis.geometries/geometry/roundm/)(int) | Arrotonda la coordinata M a un numero specificato di cifre frazionarie. |
| [RoundXY](../../aspose.gis.geometries/geometry/roundxy/)(int) | Arrotonda le coordinate X e Y a un numero specificato di cifre frazionarie. |
| [RoundZ](../../aspose.gis.geometries/geometry/roundz/)(int) | Arrotonda la coordinata Z a un numero specificato di cifre frazionarie. |
| virtual [SetEmpty](../../aspose.gis.geometries/geometry/setempty/)() | Fa questo`Geometry` vuoto. |
| [SpatiallyContains](../../aspose.gis.geometries/geometry/spatiallycontains/)(IGeometry) | Determina se questa geometria contiene spazialmente una geometria specificata. |
| [SpatiallyEquals](../../aspose.gis.geometries/geometry/spatiallyequals/)(IGeometry) | Determina se questa geometria è spazialmente uguale a una geometria specificata. |
| [SymDifference](../../aspose.gis.geometries/geometry/symdifference/)(IGeometry) | Crea una differenza simmetrica tra questa geometria e una geometria specificata. |
| [ToEditable](../../aspose.gis.geometries/geometry/toeditable/#toeditable)() | Ottiene una copia modificabile di questa geometria. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/geometry/toeditable/#toeditable_1)() | Ottiene una copia modificabile di questa geometria. |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/#tolineargeometry)() | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'impostazione predefinita`tolleranza` . |
| [ToLinearGeometry](../../aspose.gis.geometries/geometry/tolineargeometry/#tolineargeometry_1)(double) | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'oggetto specificato`tolleranza` . |
| override [ToString](../../aspose.gis.geometries/geometry/tostring/)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [Touches](../../aspose.gis.geometries/geometry/touches/)(IGeometry) | Determina se questa geometria e una geometria specificata si toccano. |
| [Union](../../aspose.gis.geometries/geometry/union/)(IGeometry) | Unisce questa geometria e una geometria specificata. |
| [Within](../../aspose.gis.geometries/geometry/within/#within)(Extent) | Determina se questa geometria si trova all'interno di un'estensione specificata. |
| [Within](../../aspose.gis.geometries/geometry/within/#within_1)(IGeometry) | Determina se questa geometria si trova all'interno di una geometria specificata. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary/#frombinary)(byte[]) | Crea una geometria dalla sua rappresentazione binaria ben nota. |
| static [FromBinary](../../aspose.gis.geometries/geometry/frombinary/#frombinary_1)(byte[], SpatialReferenceSystem) | Crea una geometria dalla sua rappresentazione binaria ben nota. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext/#fromtext)(string) | Crea una geometria dalla sua rappresentazione Well-Known Text. |
| static [FromText](../../aspose.gis.geometries/geometry/fromtext/#fromtext_1)(string, SpatialReferenceSystem) | Crea una geometria dalla sua rappresentazione Well-Known Text. |

### Guarda anche

* interface [IGeometry](../igeometry/)
* spazio dei nomi [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assemblea [Aspose.GIS](../../)


