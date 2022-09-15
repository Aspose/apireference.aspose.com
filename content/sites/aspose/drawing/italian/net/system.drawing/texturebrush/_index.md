---
title: TextureBrush
second_title: Aspose.Drawing per .NET API Reference
description: Ogni proprietà della classe TextureBrush è un oggetto Brush che utilizza unimmagine per riempire linterno di una forma. Questa classe non può essere ereditata.
type: docs
weight: 1260
url: /it/net/system.drawing/texturebrush/
---
## TextureBrush class

Ogni proprietà della classe TextureBrush è un oggetto Brush che utilizza un'immagine per riempire l'interno di una forma. Questa classe non può essere ereditata.

```csharp
public sealed class TextureBrush : Brush
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [TextureBrush](texturebrush#constructor)(Image) | Inizializza una nuova istanza di[`TextureBrush`](../texturebrush) classe che utilizza l'immagine specificata. |
| [TextureBrush](texturebrush#constructor_3)(Image, RectangleF) | Inizializza una nuova istanza di[`TextureBrush`](../texturebrush) classe che utilizza l'immagine specificata e rettangolo di delimitazione. |
| [TextureBrush](texturebrush#constructor_1)(Image, WrapMode) | Inizializza una nuova istanza di[`TextureBrush`](../texturebrush) classe che utilizza l'immagine e la modalità di avvolgimento specificate. |
| [TextureBrush](texturebrush#constructor_4)(Image, RectangleF, ImageAttributes) | Inizializza una nuova istanza di[`TextureBrush`](../texturebrush) classe che utilizza l'immagine, il rettangolo di delimitazione e gli attributi dell'immagine specificati. |
| [TextureBrush](texturebrush#constructor_2)(Image, WrapMode, RectangleF) | Inizializza una nuova istanza di[`TextureBrush`](../texturebrush) classe che utilizza l'immagine, la modalità di avvolgimento e il rettangolo di delimitazione specificati. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Image](../../system.drawing/texturebrush/image) { get; } | Ottiene l'oggetto Image associato a questo oggetto TextureBrush. |
| [Transform](../../system.drawing/texturebrush/transform) { get; set; } | Ottiene o imposta una copia dell'oggetto Matrix che definisce una trasformazione geometrica locale per l'immagine associata a questo oggetto TextureBrush. |
| [WrapMode](../../system.drawing/texturebrush/wrapmode) { get; set; } | Ottiene o imposta un'enumerazione WrapMode che indica la modalità di avvolgimento per questo oggetto TextureBrush. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [Clone](../../system.drawing/texturebrush/clone)() | Crea una copia esatta di questoTextureBrush oggetto. |
| [Dispose](../../system.drawing/brush/dispose)() | Rilascia tutte le risorse utilizzate da questo oggetto Brush. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform#multiplytransform)(Matrix) | Moltiplica ilMatrix oggetto che rappresenta la trasformazione geometrica locale di questoTextureBrush oggetto dal specificatoMatrix oggetto anteponendo a quello specificatoMatrix oggetto. |
| [MultiplyTransform](../../system.drawing/texturebrush/multiplytransform#multiplytransform_1)(Matrix, MatrixOrder) | Moltiplica ilMatrix oggetto che rappresenta la trasformazione geometrica locale di questoTextureBrush oggetto dal specificatoMatrix oggetto nell'ordine specificato. |
| [ResetTransform](../../system.drawing/texturebrush/resettransform)() | Reimposta la proprietà Trasforma di questoTextureBrush oggetto di identità. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform#rotatetransform)(float) | Ruota la trasformazione geometrica locale di questoTextureBrush oggetto della quantità specificata. Questo metodo antepone la rotazione alla trasformazione. |
| [RotateTransform](../../system.drawing/texturebrush/rotatetransform#rotatetransform_1)(float, MatrixOrder) | Ruota la trasformazione geometrica locale di questoTextureBrush oggetto per l'importo specificato nell'ordine specificato. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform#scaletransform)(float, float) | Ridimensiona la trasformazione geometrica locale di questoTextureBrush oggetto degli importi specificati. Questo metodo antepone la matrice di ridimensionamento alla trasformazione. |
| [ScaleTransform](../../system.drawing/texturebrush/scaletransform#scaletransform_1)(float, float, MatrixOrder) | Ridimensiona la trasformazione geometrica locale di questoTextureBrush oggetto dagli importi specificati nell'ordine specificato. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform#translatetransform)(float, float) | Traduce la trasformazione geometrica locale di questoTextureBrushoggetto dalle dimensioni specificate. Questo metodo antepone la traduzione alla trasformazione. |
| [TranslateTransform](../../system.drawing/texturebrush/translatetransform#translatetransform_1)(float, float, MatrixOrder) | Traduce la trasformazione geometrica locale di questoTextureBrush oggetto dalle dimensioni specificate nell'ordine specificato. |

### Guarda anche

* class [Brush](../brush)
* spazio dei nomi [System.Drawing](../../system.drawing)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
