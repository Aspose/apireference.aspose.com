---
title: Class Extent
second_title: Riferimento API Aspose.GIS per .NET
description: Aspose.Gis.Extent classe. Un riquadro di delimitazione spaziale bidimensionale.
type: docs
weight: 120
url: /it/net/aspose.gis/extent/
---
## Extent class

Un riquadro di delimitazione spaziale bidimensionale.

```csharp
public class Extent : IEquatable<Extent>
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Extent](extent/#constructor)() | Crea una nuova istanza. |
| [Extent](extent/#constructor_1)(SpatialReferenceSystem) | Crea una nuova istanza. |
| [Extent](extent/#constructor_2)(double, double, double, double, SpatialReferenceSystem) | Crea una nuova istanza. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Center](../../aspose.gis/extent/center/) { get; } | Centro dell'estensione. |
| [Height](../../aspose.gis/extent/height/) { get; } | Altezza dell'estensione. |
| [IsValid](../../aspose.gis/extent/isvalid/) { get; } | Determina se this`Extent` è valido. |
| [SpatialReferenceSystem](../../aspose.gis/extent/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) associato a questa estensione. Può essere`null` Se[`SpatialReferenceSystem`](./spatialreferencesystem/) è sconosciuto. Usa[`GetTransformed`](./gettransformed/) per trasformare l'estensione tra i diversi sistemi di riferimento spaziale. |
| [Width](../../aspose.gis/extent/width/) { get; } | Larghezza dell'estensione. |
| [XMax](../../aspose.gis/extent/xmax/) { get; set; } | Valore massimo della coordinata X. |
| [XMin](../../aspose.gis/extent/xmin/) { get; set; } | Valore minimo della coordinata X. |
| [YMax](../../aspose.gis/extent/ymax/) { get; set; } | Valore massimo della coordinata Y. |
| [YMin](../../aspose.gis/extent/ymin/) { get; set; } | Valore minimo della coordinata Y. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../aspose.gis/extent/clone/)() | Clona questa istanza. |
| [Contains](../../aspose.gis/extent/contains/#contains)(Extent) | Determina se questo extent contiene l'argomento. |
| [Contains](../../aspose.gis/extent/contains/#contains_1)(IGeometry) | Determina se questo extent contiene l'argomento. |
| [Contains](../../aspose.gis/extent/contains/#contains_2)(double, double) | Determina se questa estensione contiene una coordinata definita dagli argomenti. |
| [Equals](../../aspose.gis/extent/equals/#equals)(Extent) | Indica se l'oggetto corrente è uguale a un altro oggetto dello stesso tipo. |
| override [Equals](../../aspose.gis/extent/equals/#equals_1)(object) | Determina se l'oggetto specificato è uguale all'oggetto corrente. |
| override [GetHashCode](../../aspose.gis/extent/gethashcode/)() | Funge da funzione hash predefinita. |
| [GetTransformed](../../aspose.gis/extent/gettransformed/)(SpatialReferenceSystem) | Restituisce la nuova estensione specificata[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) che contiene questa estensione. |
| [Grow](../../aspose.gis/extent/grow/#grow)(Extent) | Aumenta questa estensione in modo da includere l'argomento. |
| [Grow](../../aspose.gis/extent/grow/#grow_1)(double, double) | Aumenta questa estensione in modo da includere il punto specificato. |
| [GrowX](../../aspose.gis/extent/growx/)(double) | Aumenta questa estensione lungo l'asse X in modo che includa il valore specificato. |
| [GrowY](../../aspose.gis/extent/growy/)(double) | Aumenta questa estensione lungo l'asse Y in modo che includa il valore specificato. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects)(Extent) | Determina se questa estensione si interseca con l'argomento. |
| [Intersects](../../aspose.gis/extent/intersects/#intersects_1)(IGeometry) | Determina se questa estensione si interseca con l'argomento. |
| [Normalize](../../aspose.gis/extent/normalize/)() | Scambi[`XMin`](./xmin/) con[`XMax`](./xmax/) Se[`Width`](./width/) è negativo e [`YMin`](./ymin/) con[`YMax`](./ymax/) Se[`Height`](./height/) è negativo. |
| [ToPolygon](../../aspose.gis/extent/topolygon/)() | Converte questa estensione in un poligono rettangolare che la rappresenta. |
| override [ToString](../../aspose.gis/extent/tostring/)() | Restituisce una stringa che rappresenta l'oggetto corrente. |
| [operator ==](../../aspose.gis/extent/op_equality/) | Implementa l'operatore '=='. |
| [operator !=](../../aspose.gis/extent/op_inequality/) | Implementa l'operatore '!='. |

### Guarda anche

* spazio dei nomi [Aspose.Gis](../../aspose.gis/)
* assemblea [Aspose.GIS](../../)


