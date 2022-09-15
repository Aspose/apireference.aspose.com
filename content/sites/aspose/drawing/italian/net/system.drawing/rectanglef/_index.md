---
title: RectangleF
second_title: Aspose.Drawing per .NET API Reference
description: Memorizza un insieme di quattro numeri a virgola mobile che rappresentano la posizione e le dimensioni di un rettangolo. Per funzioni regione più avanzate utilizzare un oggetto Regione.
type: docs
weight: 1050
url: /it/net/system.drawing/rectanglef/
---
## RectangleF structure

Memorizza un insieme di quattro numeri a virgola mobile che rappresentano la posizione e le dimensioni di un rettangolo. Per funzioni regione più avanzate, utilizzare un oggetto Regione.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [RectangleF](rectanglef#constructor_1)(PointF, SizeF) | Inizializza una nuova istanza della struttura RectangleF con la posizione e la dimensione specificate. |
| [RectangleF](rectanglef#constructor)(float, float, float, float) | Inizializza una nuova istanza della struttura RectangleF con la posizione e la dimensione specificate. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom) { get; } | Ottiene la coordinata y che è la somma di Y e Altezza di questa struttura RectangleF. |
| [Height](../../system.drawing/rectanglef/height) { get; set; } | Ottiene o imposta l'altezza di questa struttura RectangleF. |
| [IsEmpty](../../system.drawing/rectanglef/isempty) { get; } | Ottiene un valore che indica se ilWidth oHeight proprietà di questoRectangleFha un valore pari a zero. |
| [Left](../../system.drawing/rectanglef/left) { get; } | Ottiene la coordinata x del bordo sinistro di questa struttura RectangleF. |
| [Location](../../system.drawing/rectanglef/location) { get; set; } | Ottiene o imposta le coordinate dell'angolo superiore sinistro di questoRectangleF struttura. |
| [Right](../../system.drawing/rectanglef/right) { get; } | Ottiene la coordinata x che è la somma di X e Larghezza di questa struttura RectangleF. |
| [Size](../../system.drawing/rectanglef/size) { get; set; } | Ottiene o imposta la dimensione di questoRectangleF . |
| [Top](../../system.drawing/rectanglef/top) { get; } | Ottiene la coordinata y del bordo superiore di questa struttura RectangleF. |
| [Width](../../system.drawing/rectanglef/width) { get; set; } | Ottiene o imposta la larghezza di questa struttura RectangleF. |
| [X](../../system.drawing/rectanglef/x) { get; set; } | Ottiene o imposta la coordinata x dell'angolo superiore sinistro di questa struttura RectangleF. |
| [Y](../../system.drawing/rectanglef/y) { get; set; } | Ottiene o imposta la coordinata x dell'angolo superiore sinistro di questa struttura RectangleF. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb)(float, float, float, float) | Crea una struttura RectangleF con l'angolo superiore sinistro e l'angolo inferiore destro nelle posizioni specificate. |
| static [Inflate](../../system.drawing/rectanglef/inflate)(RectangleF, float, float) | Crea e restituisce una copia gonfiata dell'oggetto specificatoRectangleF struttura. La copia viene gonfiata dell'importo specificato. Il rettangolo originale rimane invariato. |
| static [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF, RectangleF) | Restituisce aRectangleF struttura che rappresenta l'intersezione di due rettangoli. Se non c'è intersezione e vuotoRectangleF viene restituito. |
| static [Union](../../system.drawing/rectanglef/union)(RectangleF, RectangleF) | Crea il terzo rettangolo più piccolo possibile che può contenere entrambi i due rettangoli che formano un'unione. |
| [Contains](../../system.drawing/rectanglef/contains#contains_1)(PointF) | Determina se il punto specificato è contenuto all'interno di questoRectangleF struttura. |
| [Contains](../../system.drawing/rectanglef/contains#contains_2)(RectangleF) | Determina se la regione rettangolare rappresentata da*rect* è interamente contenuto in questoRectangleF struttura. |
| [Contains](../../system.drawing/rectanglef/contains#contains)(float, float) | Determina se il punto specificato è contenuto all'interno di questoRectangleF struttura. |
| override [Equals](../../system.drawing/rectanglef/equals#equals_1)(object) | Determina se è specificatoObject , è uguale a questa istanza. |
| [Equals](../../system.drawing/rectanglef/equals#equals)(RectangleF) | Verifica se altro[`RectangleF`](../rectanglef) struttura ha la stessa posizione e dimensione di questo[`RectangleF`](../rectanglef) struttura. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode)() | Restituisce un codice hash per questa istanza. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate_1)(SizeF) | Gonfia questoRectangleF per l'importo specificato. |
| [Inflate](../../system.drawing/rectanglef/inflate#inflate)(float, float) | Gonfia questoRectangleF struttura per l'importo specificato. |
| [Intersect](../../system.drawing/rectanglef/intersect)(RectangleF) | Sostituisce questoRectangleF struttura con l'intersezione di se stessa e il specificatoRectangleF struttura. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith)(RectangleF) | Determina se questo rettangolo si interseca con*rect* . |
| [Offset](../../system.drawing/rectanglef/offset#offset_1)(PointF) | Regola la posizione di questo rettangolo della quantità specificata. |
| [Offset](../../system.drawing/rectanglef/offset#offset)(float, float) | Regola la posizione di questo rettangolo della quantità specificata. |
| override [ToString](../../system.drawing/rectanglef/tostring)() | Converte gli attributi di questo[`Rectangle`](../rectangle) in una stringa leggibile dall'uomo. |
| [operator ==](../../system.drawing/rectanglef/op_equality) | Verifica se dueRectangleF le strutture hanno la stessa posizione e dimensione. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit) | Converte la struttura Rectangle specificata in una struttura RectangleF. |
| [operator !=](../../system.drawing/rectanglef/op_inequality) | Verifica se dueRectangleF le strutture differiscono per posizione o dimensioni. |

## Campi

| Nome | Descrizione |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty) | Rappresenta un'istanza diRectangleF classe con i suoi membri non inizializzati. |

### Guarda anche

* spazio dei nomi [System.Drawing](../../system.drawing)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
