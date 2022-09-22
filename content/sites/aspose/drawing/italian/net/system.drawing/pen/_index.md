---
title: Pen
second_title: Aspose.Drawing per .NET API Reference
description: Definisce un oggetto utilizzato per disegnare linee e curve.
type: docs
weight: 910
url: /it/net/system.drawing/pen/
---
## Pen class

Definisce un oggetto utilizzato per disegnare linee e curve.

```csharp
public class Pen : IDisposable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Pen](pen#constructor)(Brush) | Inizializza una nuova istanza di[`Pen`](../pen) classe con il specificatoBrush . |
| [Pen](pen#constructor_2)(Color) | Inizializza una nuova istanza di[`Pen`](../pen) classe con il specificatoColor . |
| [Pen](pen#constructor_1)(Brush, float) | Inizializza una nuova istanza della classe Pen con il pennello e la larghezza specificati. |
| [Pen](pen#constructor_3)(Color, float) | Inizializza una nuova istanza della classe Pen con le proprietà Color e Width specificate. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment) { get; set; } | Ottiene o imposta l'allineamento per questoPen . |
| [Brush](../../system.drawing/pen/brush) { get; set; } | Ottiene o imposta il Brush che determina gli attributi di questoPen . |
| [Color](../../system.drawing/pen/color) { get; set; } | Ottiene o imposta il colore di questoPen . |
| [CompoundArray](../../system.drawing/pen/compoundarray) { get; set; } | Ottiene o imposta una matrice di valori che specifica una penna composta. Una penna composta disegna una linea composta composta da linee e spazi paralleli. |
| [CustomEndCap](../../system.drawing/pen/customendcap) { get; set; } | Ottiene o imposta un limite personalizzato da utilizzare alla fine delle linee tracciate con questoPen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap) { get; set; } | Ottiene o imposta un limite personalizzato da utilizzare all'inizio delle linee disegnate con questoPen . |
| [DashCap](../../system.drawing/pen/dashcap) { get; set; } | Ottiene o imposta lo stile del cappuccio utilizzato alla fine dei trattini che compongono le linee tratteggiate disegnate con this Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset) { get; set; } | Ottiene o imposta la distanza dall'inizio di una linea all'inizio di una sequenza di trattini. |
| [DashPattern](../../system.drawing/pen/dashpattern) { get; set; } | Ottiene o imposta una matrice di trattini e spazi personalizzati. |
| [DashStyle](../../system.drawing/pen/dashstyle) { get; set; } | Ottiene o imposta lo stile utilizzato per le linee tratteggiate disegnate con questoPen . |
| [EndCap](../../system.drawing/pen/endcap) { get; set; } | Ottiene o imposta lo stile del cappuccio utilizzato alla fine delle linee disegnate con questa penna. |
| [LineJoin](../../system.drawing/pen/linejoin) { get; set; } | Ottiene o imposta lo stile di unione per le estremità di due linee consecutive disegnate con questa penna. |
| [MiterLimit](../../system.drawing/pen/miterlimit) { get; set; } | Ottiene o imposta il limite dello spessore del giunto su un angolo smussato. |
| [PenType](../../system.drawing/pen/pentype) { get; } | Ottiene lo stile delle linee disegnate con questa penna. |
| [StartCap](../../system.drawing/pen/startcap) { get; set; } | Ottiene o imposta lo stile del cappuccio utilizzato all'inizio delle linee disegnate con questa penna. |
| [Transform](../../system.drawing/pen/transform) { get; set; } | Ottiene o imposta una copia della trasformazione geometrica per questoPen . |
| [Width](../../system.drawing/pen/width) { get; set; } | Ottiene o imposta la larghezza di questa penna, in unità dell'oggetto Graphics utilizzato per il disegno. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../system.drawing/pen/clone)() | Crea una copia esatta di questoPen . |
| [Dispose](../../system.drawing/pen/dispose)() | Rilascia tutte le risorse utilizzate da questa penna. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform)(Matrix) | Moltiplica la matrice di trasformazione per questoPen dal specificatoMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Moltiplica la matrice di trasformazione per questoPen dal specificatoMatrix nell'ordine specificato. |
| [ResetTransform](../../system.drawing/pen/resettransform)() | Reimposta la matrice di trasformazione geometrica per questoPen all'identità. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform)(float) | Ruota la trasformazione geometrica locale dell'angolo specificato. Questo metodo antepone la rotazione alla trasformazione. |
| [RotateTransform](../../system.drawing/pen/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Ruota la trasformazione geometrica locale dell'angolo specificato nell'ordine specificato. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform)(float, float) | Ridimensiona la trasformazione geometrica locale in base ai fattori specificati. Questo metodo antepone la matrice di ridimensionamento alla trasformazione. |
| [ScaleTransform](../../system.drawing/pen/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Ridimensiona la trasformazione geometrica locale in base ai fattori specificati nell'ordine specificato. |
| [SetLineCap](../../system.drawing/pen/setlinecap)(LineCap, LineCap, DashCap) | Imposta i valori che determinano lo stile del cappuccio utilizzato per terminare le linee tracciate da questo[`Pen`](../pen) . |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform)(float, float) | Converte la trasformazione geometrica locale in base alle dimensioni specificate. Questo metodo antepone la traduzione alla trasformazione. |
| [TranslateTransform](../../system.drawing/pen/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Converte la trasformazione geometrica locale in base alle dimensioni specificate nell'ordine specificato. |

### Guarda anche

* spazio dei nomi [System.Drawing](../../system.drawing)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
