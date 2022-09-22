---
title: Rectangle
second_title: Aspose.Drawing per .NET API Reference
description: Memorizza un insieme di quattro numeri interi che rappresentano la posizione e la dimensione di un rettangolo.
type: docs
weight: 1040
url: /it/net/system.drawing/rectangle/
---
## Rectangle structure

Memorizza un insieme di quattro numeri interi che rappresentano la posizione e la dimensione di un rettangolo.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Rectangle](rectangle#constructor_1)(Point, Size) | Inizializza una nuova istanza di[`Rectangle`](../rectangle) struct con la posizione e la dimensione specificate. |
| [Rectangle](rectangle#constructor)(int, int, int, int) | Inizializza una nuova istanza della struttura Rectangle con la posizione e la dimensione specificate. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom) { get; } | Ottiene la coordinata y che è la somma dei valori delle proprietà Y e Altezza di questa struttura Rectangle. |
| [Height](../../system.drawing/rectangle/height) { get; set; } | Ottiene o imposta l'altezza di questa struttura Rectangle. |
| [IsEmpty](../../system.drawing/rectangle/isempty) { get; } | Ottiene un valore che indica se tutte le proprietà numeriche di questo[`Rectangle`](../rectangle) avere valori pari a zero. |
| [Left](../../system.drawing/rectangle/left) { get; } | Ottiene la coordinata x del bordo sinistro di questa struttura Rectangle. |
| [Location](../../system.drawing/rectangle/location) { get; set; } | Ottiene o imposta le coordinate dell'angolo superiore sinistro di questoRectangle struttura. |
| [Right](../../system.drawing/rectangle/right) { get; } | Ottiene la coordinata x che è la somma dei valori delle proprietà X e Width di questa struttura Rectangle. |
| [Size](../../system.drawing/rectangle/size) { get; set; } | Ottiene o imposta la dimensione di questoRectangle . |
| [Top](../../system.drawing/rectangle/top) { get; } | Ottiene la coordinata y del bordo superiore di questa struttura Rectangle. |
| [Width](../../system.drawing/rectangle/width) { get; set; } | Ottiene o imposta la larghezza di questa struttura Rectangle. |
| [X](../../system.drawing/rectangle/x) { get; set; } | Ottiene o imposta la coordinata x dell'angolo superiore sinistro di questa struttura Rectangle. |
| [Y](../../system.drawing/rectangle/y) { get; set; } | Ottiene o imposta la coordinata y dell'angolo superiore sinistro di questa struttura Rectangle. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling)(RectangleF) | Converte l'oggetto specificatoRectangleF struttura ad aRectangle struttura arrotondando ilRectangleF valori ai successivi valori interi superiori. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb)(int, int, int, int) | Crea aRectangle struttura con le posizioni perimetrali specificate. |
| static [Inflate](../../system.drawing/rectangle/inflate)(Rectangle, int, int) | Crea a[`Rectangle`](../rectangle) che viene gonfiato dell'importo specificato. |
| static [Intersect](../../system.drawing/rectangle/intersect)(Rectangle, Rectangle) | Restituisce un terzoRectangle struttura che rappresenta l'intersezione di altri dueRectangle strutture. Se non c'è incrocio, un vuotoRectangle viene restituito. |
| static [Round](../../system.drawing/rectangle/round)(RectangleF) | Converte l'oggetto specificatoRectangleF ad unRectangle arrotondando ilRectangleFvalori ai valori interi più vicini. |
| static [Truncate](../../system.drawing/rectangle/truncate)(RectangleF) | Converte l'oggetto specificatoRectangleF ad unRectangle troncando ilRectangleF valori. |
| static [Union](../../system.drawing/rectangle/union)(Rectangle, Rectangle) | Ottiene aRectangle struttura che contiene l'unione di dueRectangle strutture. |
| [Contains](../../system.drawing/rectangle/contains#contains_1)(Point) | Determina se il punto specificato è contenuto all'interno di questoRectangle struttura. |
| [Contains](../../system.drawing/rectangle/contains#contains_2)(Rectangle) | Determina se la regione rettangolare rappresentata da*rect* è interamente contenuto all'interno della regione rettangolare rappresentata da questo[`Rectangle`](../rectangle) . |
| [Contains](../../system.drawing/rectangle/contains#contains)(int, int) | Determina se il punto specificato è contenuto all'interno di questoRectangle struttura. |
| override [Equals](../../system.drawing/rectangle/equals#equals_1)(object) | Verifica se obj è aRectangle struttura con la stessa posizione e dimensione di questaRectangle struttura. |
| [Equals](../../system.drawing/rectangle/equals#equals)(Rectangle) | Verifica se altro[`Rectangle`](../rectangle) struttura ha la stessa posizione e dimensione di questo[`Rectangle`](../rectangle) struttura. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode)() | Restituisce il codice hash per questoRectangle struttura. Per informazioni sull'uso dei codici hash, vedere GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate#inflate_1)(Size) | Ingrandisce questoRectangle per l'importo specificato. |
| [Inflate](../../system.drawing/rectangle/inflate#inflate)(int, int) | Ingrandisce questoRectangle per l'importo specificato. |
| [Intersect](../../system.drawing/rectangle/intersect)(Rectangle) | Sostituisce questoRectanglecon l'intersezione di se stesso e il specificatoRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith)(Rectangle) | Determina se questo rettangolo si interseca con*rect* . |
| [Offset](../../system.drawing/rectangle/offset#offset_1)(Point) | Regola la posizione di questo rettangolo della quantità specificata. |
| [Offset](../../system.drawing/rectangle/offset#offset)(int, int) | Regola la posizione di questo rettangolo della quantità specificata. |
| override [ToString](../../system.drawing/rectangle/tostring)() | Converte gli attributi di questo[`Rectangle`](../rectangle) in una stringa leggibile dall'uomo. |
| [operator ==](../../system.drawing/rectangle/op_equality) | Verifica se dueRectangle le strutture hanno la stessa posizione e dimensione. |
| [operator !=](../../system.drawing/rectangle/op_inequality) | Verifica se dueRectangle le strutture differiscono per posizione o dimensioni. |

## Campi

| Nome | Descrizione |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty) | Rappresenta aRectangle struttura con le sue proprietà non inizializzate. |

### Guarda anche

* spazio dei nomi [System.Drawing](../../system.drawing)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
