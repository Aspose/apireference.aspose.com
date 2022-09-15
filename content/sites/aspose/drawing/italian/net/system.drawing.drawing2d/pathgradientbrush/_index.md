---
title: PathGradientBrush
second_title: Aspose.Drawing per .NET API Reference
description: Incapsula aBrush oggetto che riempie linterno di aGraphicsPath oggetto con una sfumatura. Questa classe non può essere ereditata.
type: docs
weight: 400
url: /it/net/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class

Incapsula aBrush oggetto che riempie l'interno di aGraphicsPath oggetto con una sfumatura. Questa classe non può essere ereditata.

```csharp
public sealed class PathGradientBrush : Brush
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PathGradientBrush](pathgradientbrush#constructor)(GraphicsPath) | Inizializza una nuova istanza di[`PathGradientBrush`](../pathgradientbrush) classe con il percorso specificato. |
| [PathGradientBrush](pathgradientbrush#constructor_1)(PointF[]) | Inizializza una nuova istanza di[`PathGradientBrush`](../pathgradientbrush) classe con i punti specificati. |
| [PathGradientBrush](pathgradientbrush#constructor_3)(Point[]) | Inizializza una nuova istanza di[`PathGradientBrush`](../pathgradientbrush) classe con i punti specificati. |
| [PathGradientBrush](pathgradientbrush#constructor_2)(PointF[], WrapMode) | Inizializza una nuova istanza di[`PathGradientBrush`](../pathgradientbrush) classe con i punti specificati e la modalità di avvolgimento. |
| [PathGradientBrush](pathgradientbrush#constructor_4)(Point[], WrapMode) | Inizializza una nuova istanza di[`PathGradientBrush`](../pathgradientbrush) classe con i punti specificati e la modalità di avvolgimento. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Blend](../../system.drawing.drawing2d/pathgradientbrush/blend) { get; set; } | Ottiene o imposta aBlend che specifica posizioni e fattori che definiscono un decadimento personalizzato per il gradiente. |
| [CenterColor](../../system.drawing.drawing2d/pathgradientbrush/centercolor) { get; set; } | Ottiene o imposta il colore al centro del gradiente del percorso. |
| [CenterPoint](../../system.drawing.drawing2d/pathgradientbrush/centerpoint) { get; set; } | Ottiene o imposta il punto centrale del gradiente del percorso. |
| [FocusScales](../../system.drawing.drawing2d/pathgradientbrush/focusscales) { get; set; } | Ottiene o imposta il punto focale per la diminuzione del gradiente. |
| [InterpolationColors](../../system.drawing.drawing2d/pathgradientbrush/interpolationcolors) { get; set; } | Ottiene o imposta aColorBlendche definisce un gradiente lineare multicolore. |
| [Rectangle](../../system.drawing.drawing2d/pathgradientbrush/rectangle) { get; } | Ottiene un rettangolo di delimitazione per questoPathGradientBrush . |
| [SurroundColors](../../system.drawing.drawing2d/pathgradientbrush/surroundcolors) { get; set; } | Ottiene o imposta una matrice di colori che corrispondono ai punti nel percorso questoPathGradientBrush riempie. |
| [Transform](../../system.drawing.drawing2d/pathgradientbrush/transform) { get; set; } | Ottiene o imposta una copia diMatrix che definisce una trasformazione geometrica locale per questoPathGradientBrush . |
| [WrapMode](../../system.drawing.drawing2d/pathgradientbrush/wrapmode) { get; set; } | Ottiene o imposta aWrapMode che indica la modalità di avvolgimento per questoPathGradientBrush . |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [Clone](../../system.drawing.drawing2d/pathgradientbrush/clone)() | Crea una copia esatta di questoPathGradientBrush . |
| [Dispose](../../system.drawing/brush/dispose)() | Rilascia tutte le risorse utilizzate da questo oggetto Brush. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform)(Matrix) | Aggiorna la matrice di trasformazione del pennello con il prodotto della matrice di trasformazione del pennello moltiplicato per un'altra matrice. |
| [MultiplyTransform](../../system.drawing.drawing2d/pathgradientbrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Aggiorna la matrice di trasformazione del pennello con il prodotto della matrice di trasformazione del pennello moltiplicato per un'altra matrice. |
| [ResetTransform](../../system.drawing.drawing2d/pathgradientbrush/resettransform)() | Reimposta ilTransform proprietà su identità. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform)(float) | Ruota la trasformazione geometrica locale della quantità specificata. Questo metodo antepone la rotazione alla trasformazione. |
| [RotateTransform](../../system.drawing.drawing2d/pathgradientbrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Ruota la trasformazione geometrica locale della quantità specificata nell'ordine specificato. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform)(float, float) | Ridimensiona la trasformazione geometrica locale degli importi specificati. Questo metodo antepone la matrice di ridimensionamento alla trasformazione. |
| [ScaleTransform](../../system.drawing.drawing2d/pathgradientbrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Ridimensiona la trasformazione geometrica locale degli importi specificati nell'ordine specificato. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape)(float) | Crea una sfumatura con un colore centrale e un decadimento lineare su un colore circostante. |
| [SetBlendTriangularShape](../../system.drawing.drawing2d/pathgradientbrush/setblendtriangularshape#setblendtriangularshape_1)(float, float) | Crea una sfumatura con un colore centrale e una diminuzione lineare per ogni colore circostante. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape)(float) | Crea un pennello sfumato che cambia colore partendo dal centro del percorso verso l'esterno fino al confine del percorso. La transizione da un colore all'altro si basa su una curva a campana. |
| [SetSigmaBellShape](../../system.drawing.drawing2d/pathgradientbrush/setsigmabellshape#setsigmabellshape_1)(float, float) | Crea un pennello sfumato che cambia colore partendo dal centro del percorso verso l'esterno fino al confine del percorso. La transizione da un colore all'altro si basa su una curva a campana. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform)(float, float) | Applica la traslazione specificata alla trasformazione geometrica locale. Questo metodo antepone la traslazione alla trasformazione. |
| [TranslateTransform](../../system.drawing.drawing2d/pathgradientbrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Applica la traslazione specificata alla trasformazione geometrica locale nell'ordine specificato. |

### Guarda anche

* class [Brush](../../system.drawing/brush)
* spazio dei nomi [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
