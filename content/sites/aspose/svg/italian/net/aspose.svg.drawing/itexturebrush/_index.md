---
title: Interface ITextureBrush
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Drawing.ITextureBrush interfaccia. Definisce linterfaccia del pennello che utilizza unimmagine per riempire linterno di una forma.
type: docs
weight: 1490
url: /it/net/aspose.svg.drawing/itexturebrush/
---
## ITextureBrush interface

Definisce l'interfaccia del pennello che utilizza un'immagine per riempire l'interno di una forma.

```csharp
public interface ITextureBrush : ITransformableBrush
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [ColorMap](../../aspose.svg.drawing/itexturebrush/colormap/) { get; } | Il numero di elementi deve essere pari. Ogni elemento pari è vecchio colore. Ogni elemento dispari è un nuovo colore. |
| [Image](../../aspose.svg.drawing/itexturebrush/image/) { get; } | Ottiene o imposta l'immagine utilizzata dal pennello. |
| [ImageArea](../../aspose.svg.drawing/itexturebrush/imagearea/) { get; } | Specifica la parte dell'immagine utilizzata dal pennello. Se è uguale a RectangleF.Empty verrà utilizzata l'intera immagine. Le coordinate sono in pixel. |
| [Opacity](../../aspose.svg.drawing/itexturebrush/opacity/) { get; } | Ottieni il valore di opacità in una matrice di trasformazione del colore. |

### Guarda anche

* interface [ITransformableBrush](../itransformablebrush/)
* spazio dei nomi [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assemblea [Aspose.SVG](../../)


