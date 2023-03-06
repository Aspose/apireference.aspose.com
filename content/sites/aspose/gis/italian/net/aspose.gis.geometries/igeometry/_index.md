---
title: Interface IGeometry
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Geometries.IGeometry interfaccia. La classe radice dellinterfaccia della gerarchia Geometries
type: docs
weight: 1000
url: /it/net/aspose.gis.geometries/igeometry/
---
## IGeometry interface

La classe radice dell'interfaccia della gerarchia Geometries

```csharp
public interface IGeometry
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Dimension](../../aspose.gis.geometries/igeometry/dimension/) { get; } | Ottiene la dimensione topologica di this`IGeometry` . Se la dimensione è sconosciuta (ad es. per una GEOMETRYCOLLECTION vuota)Point viene restituito. |
| [GeometryType](../../aspose.gis.geometries/igeometry/geometrytype/) { get; } | Ottiene il tipo di geometria. |
| [HasCurveGeometry](../../aspose.gis.geometries/igeometry/hascurvegeometry/) { get; } | Ottiene un valore che indica se questa geometria è o contiene geometria curva (non lineare). |
| [HasM](../../aspose.gis.geometries/igeometry/hasm/) { get; } | Ottiene un valore che indica se questa istanza ha coordinate M. |
| [HasZ](../../aspose.gis.geometries/igeometry/hasz/) { get; } | Ottiene un valore che indica se questa istanza ha la coordinata Z. |
| [IsEmpty](../../aspose.gis.geometries/igeometry/isempty/) { get; } | Ottiene un valore che indica se questa istanza è vuota (rappresenta il set di punti vuoto). |
| [IsSimple](../../aspose.gis.geometries/igeometry/issimple/) { get; } | Ottiene un valore che indica se questa istanza è semplice dal punto di vista SFA. |
| [IsValid](../../aspose.gis.geometries/igeometry/isvalid/) { get; } | Ottiene un valore che indica se questa istanza è valida. |
| [SpatialReferenceSystem](../../aspose.gis.geometries/igeometry/spatialreferencesystem/) { get; } | Ottiene SpatialReferenceSystem di questa istanza. Questa proprietà può essere`null` , se SpatialReferenceSystem è sconosciuto. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary)() | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsBinary](../../aspose.gis.geometries/igeometry/asbinary/#asbinary_1)(WkbVariant) | Traduce questa geometria nella sua rappresentazione binaria ben nota. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage)(Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_1)(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsImage](../../aspose.gis.geometries/igeometry/asimage/#asimage_2)(string, Measurement, Measurement, Renderer, VectorSymbolizer) | Esporta questa geometria in una rappresentazione dell'immagine. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext)() | Traduce questa geometria nella sua rappresentazione Well-Known Text. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_1)(WktVariant) | Traduce questa geometria nella sua rappresentazione Well-Known Text. |
| [AsText](../../aspose.gis.geometries/igeometry/astext/#astext_2)(WktVariant, NumericFormat) | Traduce questa geometria nella sua rappresentazione Well-Known Text. |
| [Clone](../../aspose.gis.geometries/igeometry/clone/)() | Clona questa istanza. |
| [CoveredBy](../../aspose.gis.geometries/igeometry/coveredby/)(IGeometry) | Determina se questa geometria è coperta da una geometria specificata. |
| [Covers](../../aspose.gis.geometries/igeometry/covers/)(IGeometry) | Determina se questa geometria copre una geometria specificata. |
| [Crosses](../../aspose.gis.geometries/igeometry/crosses/)(IGeometry) | Determina se questa geometria e una geometria specificata si incrociano. |
| [Difference](../../aspose.gis.geometries/igeometry/difference/)(IGeometry) | Sottrae una geometria specificata da questa geometria. |
| [Disjoint](../../aspose.gis.geometries/igeometry/disjoint/)(IGeometry) | Determina se questa geometria è disgiunta da una geometria specificata. |
| [GetArea](../../aspose.gis.geometries/igeometry/getarea/)() | Calcola l'area di questa geometria. |
| [GetBuffer](../../aspose.gis.geometries/igeometry/getbuffer/)(double, int) | Calcola una regione buffer attorno a questa geometria. |
| [GetCentroid](../../aspose.gis.geometries/igeometry/getcentroid/)() | Calcola il baricentro di questa geometria. |
| [GetConvexHull](../../aspose.gis.geometries/igeometry/getconvexhull/)() | Calcola lo scafo convesso di questa geometria. |
| [GetDistanceTo](../../aspose.gis.geometries/igeometry/getdistanceto/)(IGeometry) | Calcola la distanza minima tra questa geometria e una geometria specificata. |
| [GetExtent](../../aspose.gis.geometries/igeometry/getextent/)() | Calcola e restituisce un'estensione di delimitazione di questa geometria. |
| [GetLength](../../aspose.gis.geometries/igeometry/getlength/)() | Calcola la lunghezza di questa geometria. |
| [Intersection](../../aspose.gis.geometries/igeometry/intersection/)(IGeometry) | Crea un'intersezione tra questa geometria e una geometria specificata. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects)(Extent) | Determina se questa geometria interseca un'estensione specificata. |
| [Intersects](../../aspose.gis.geometries/igeometry/intersects/#intersects_1)(IGeometry) | Determina se questa geometria e una geometria specificata si intersecano. |
| [Overlaps](../../aspose.gis.geometries/igeometry/overlaps/)(IGeometry) | Determina se questa geometria si sovrappone a una geometria specificata. |
| [Relate](../../aspose.gis.geometries/igeometry/relate/)(IGeometry, string) | Determina se la matrice di intersezione DE-9IM di questa geometria e una geometria specificata corrispondono al modello fornito. |
| [ReplacePolygonsByLines](../../aspose.gis.geometries/igeometry/replacepolygonsbylines/)() | Ottiene i poligoni rappresentati come linee di questa geometria. |
| [SpatiallyContains](../../aspose.gis.geometries/igeometry/spatiallycontains/)(IGeometry) | Determina se questa geometria contiene spazialmente una geometria specificata. |
| [SpatiallyEquals](../../aspose.gis.geometries/igeometry/spatiallyequals/)(IGeometry) | Determina se questa geometria è spazialmente uguale a una geometria specificata. |
| [SymDifference](../../aspose.gis.geometries/igeometry/symdifference/)(IGeometry) | Crea una differenza simmetrica tra questa geometria e una geometria specificata. |
| [ToEditable](../../aspose.gis.geometries/igeometry/toeditable/#toeditable)() | Ottiene una copia modificabile di questa geometria. |
| [ToEditable&lt;T&gt;](../../aspose.gis.geometries/igeometry/toeditable/#toeditable_1)() | Ottiene una copia modificabile di questa geometria. |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry)() | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'impostazione predefinita`tolleranza` . |
| [ToLinearGeometry](../../aspose.gis.geometries/igeometry/tolineargeometry/#tolineargeometry_1)(double) | Ottiene una versione non curva approssimativa o equivalente di questa geometria utilizzando l'oggetto specificato`tolleranza` . |
| [Touches](../../aspose.gis.geometries/igeometry/touches/)(IGeometry) | Determina se questa geometria e una geometria specificata si toccano. |
| [Union](../../aspose.gis.geometries/igeometry/union/)(IGeometry) | Unisce questa geometria e una geometria specificata. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within)(Extent) | Determina se questa geometria si trova all'interno di un'estensione specificata. |
| [Within](../../aspose.gis.geometries/igeometry/within/#within_1)(IGeometry) | Determina se questa geometria si trova all'interno di una geometria specificata. |

### Guarda anche

* spazio dei nomi [Aspose.Gis.Geometries](../../aspose.gis.geometries/)
* assemblea [Aspose.GIS](../../)


