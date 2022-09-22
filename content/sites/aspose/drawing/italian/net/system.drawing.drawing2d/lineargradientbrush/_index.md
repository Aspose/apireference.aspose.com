---
title: LinearGradientBrush
second_title: Aspose.Drawing per .NET API Reference
description: Incapsula aBrush con gradiente lineare. Questa classe non può essere ereditata.
type: docs
weight: 340
url: /it/net/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class

Incapsula aBrush con gradiente lineare. Questa classe non può essere ereditata.

```csharp
public sealed class LinearGradientBrush : Brush
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [LinearGradientBrush](lineargradientbrush#constructor)(Point, Point, Color, Color) | Inizializza una nuova istanza di[`LinearGradientBrush`](../lineargradientbrush) classe con i punti e i colori specificati. |
| [LinearGradientBrush](lineargradientbrush#constructor_1)(PointF, PointF, Color, Color) | Inizializza una nuova istanza di[`LinearGradientBrush`](../lineargradientbrush) classe con i punti e i colori specificati. |
| [LinearGradientBrush](lineargradientbrush#constructor_2)(Rectangle, Color, Color, float) | Inizializza una nuova istanza di[`LinearGradientBrush`](../lineargradientbrush)classe basata su un rettangolo, colori iniziali e finali e un angolo di orientamento. |
| [LinearGradientBrush](lineargradientbrush#constructor_4)(Rectangle, Color, Color, LinearGradientMode) | Inizializza una nuova istanza di[`LinearGradientBrush`](../lineargradientbrush) classe basata su un rettangolo, colori iniziali e finali e orientamento. |
| [LinearGradientBrush](lineargradientbrush#constructor_5)(RectangleF, Color, Color, float) | Inizializza una nuova istanza di[`LinearGradientBrush`](../lineargradientbrush)classe basata su un rettangolo, colori iniziali e finali e un angolo di orientamento. |
| [LinearGradientBrush](lineargradientbrush#constructor_7)(RectangleF, Color, Color, LinearGradientMode) | Inizializza una nuova istanza di[`LinearGradientBrush`](../lineargradientbrush) classe basata su un rettangolo, colori iniziali e finali e una modalità di orientamento. |
| [LinearGradientBrush](lineargradientbrush#constructor_3)(Rectangle, Color, Color, float, bool) | Inizializza una nuova istanza di[`LinearGradientBrush`](../lineargradientbrush)classe basata su un rettangolo, colori iniziali e finali e un angolo di orientamento. |
| [LinearGradientBrush](lineargradientbrush#constructor_6)(RectangleF, Color, Color, float, bool) | Inizializza una nuova istanza di[`LinearGradientBrush`](../lineargradientbrush)classe basata su un rettangolo, colori iniziali e finali e un angolo di orientamento. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/lineargradientbrush/blend) { get; set; } | Ottiene o imposta aBlend che specifica posizioni e fattori che definiscono un falloff personalizzato per il gradiente. |
| [GammaCorrection](../../system.drawing.drawing2d/lineargradientbrush/gammacorrection) { get; set; } | Ottiene o imposta un valore che indica se la correzione gamma è abilitata per questoLinearGradientBrush . |
| [InterpolationColors](../../system.drawing.drawing2d/lineargradientbrush/interpolationcolors) { get; set; } | Ottiene o imposta aColorBlendche definisce un gradiente lineare multicolore. |
| [LinearColors](../../system.drawing.drawing2d/lineargradientbrush/linearcolors) { get; set; } | Ottiene o imposta i colori iniziali e finali del gradiente. |
| [Rectangle](../../system.drawing.drawing2d/lineargradientbrush/rectangle) { get; } | Ottiene una regione rettangolare che definisce i punti di inizio e fine del gradiente. |
| [Transform](../../system.drawing.drawing2d/lineargradientbrush/transform) { get; set; } | Ottiene o imposta una copiaMatrix che definisce una trasformazione geometrica locale per questoLinearGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/lineargradientbrush/wrapmode) { get; set; } | Ottiene o imposta aWrapMode enumerazione che indica la modalità di avvolgimento per questoLinearGradientBrush . |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/lineargradientbrush/clone)() | Crea una copia esatta di questoLinearGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Rilascia tutte le risorse utilizzate da questo oggetto Brush. |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform)(Matrix) | Moltiplica ilMatrix che rappresenta la trasformata geometrica locale di questoLinearGradientBrush dal specificatoMatrix anteponendo a quello specificatoMatrix . |
| [MultiplyTransform](../../system.drawing.drawing2d/lineargradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Moltiplica ilMatrix che rappresenta la trasformata geometrica locale di questoLinearGradientBrush dal specificatoMatrix nell'ordine specificato. |
| [ResetTransform](../../system.drawing.drawing2d/lineargradientbrush/resettransform)() | Reimposta ilTransform proprietà su identità. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform)(float) | Ruota la trasformazione geometrica locale della quantità specificata. Questo metodo antepone la rotazione alla trasformazione. |
| [RotateTransform](../../system.drawing.drawing2d/lineargradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Ruota la trasformazione geometrica locale della quantità specificata nell'ordine specificato. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform)(float, float) | Ridimensiona la trasformazione geometrica locale degli importi specificati. Questo metodo antepone la matrice di ridimensionamento alla trasformazione. |
| [ScaleTransform](../../system.drawing.drawing2d/lineargradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Ridimensiona la trasformazione geometrica locale degli importi specificati nell'ordine specificato. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Crea un gradiente lineare con un colore centrale e un decadimento lineare su un unico colore su entrambe le estremità. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/lineargradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Crea un gradiente lineare con un colore centrale e un decadimento lineare su un unico colore su entrambe le estremità. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape)(float) | Crea un decadimento del gradiente basato su una curva a campana. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/lineargradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Crea un decadimento del gradiente basato su una curva a campana. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform)(float, float) | Trasla la trasformazione geometrica locale in base alle dimensioni specificate. Questo metodo antepone la traslazione alla trasformazione. |
| [TranslateTransform](../../system.drawing.drawing2d/lineargradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Converte la trasformazione geometrica locale in base alle dimensioni specificate nell'ordine specificato. |

### Guarda anche

* class [Brush](../../system.drawing/brush)
* spazio dei nomi [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
