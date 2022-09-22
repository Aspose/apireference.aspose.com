---
title: HatchStyle
second_title: Aspose.Drawing per .NET API Reference
description: Specifica i diversi modelli disponibili perHatchBrush oggetti.
type: docs
weight: 300
url: /it/net/system.drawing.drawing2d/hatchstyle/
---
## HatchStyle enumeration

Specifica i diversi modelli disponibili perHatchBrush oggetti.

```csharp
public enum HatchStyle
```

### I valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| Horizontal | `0` | Un modello di linee orizzontali. |
| Vertical | `1` | Un modello di linee verticali. |
| ForwardDiagonal | `2` | Un motivo di linee su una diagonale da in alto a sinistra a in basso a destra. |
| BackwardDiagonal | `3` | Un motivo di linee su una diagonale da in alto a destra a in basso a sinistra. |
| Cross | `4` | Specifica le linee orizzontali e verticali che si incrociano. |
| DiagonalCross | `5` | Un motivo di linee diagonali incrociate. |
| Percent05 | `6` | Specifica un tratteggio del 5 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 5:100. |
| Percent10 | `7` | Specifica un tratteggio del 10 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 10:100. |
| Percent20 | `8` | Specifica un tratteggio del 20 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 20:100. |
| Percent25 | `9` | Specifica un tratteggio del 25 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 25:100. |
| Percent30 | `10` | Specifica un tratteggio del 30 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 30:100. |
| Percent40 | `11` | Specifica un tratteggio del 40 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 40:100. |
| Percent50 | `12` | Specifica un tratteggio del 50 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 50:100. |
| Percent60 | `13` | Specifica un tratteggio del 60 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 60:100. |
| Percent70 | `14` | Specifica un tratteggio del 70 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 70:100. |
| Percent75 | `15` | Specifica un tratteggio del 75 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 75:100. |
| Percent80 | `16` | Specifica un tratteggio dell'80 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 80:100. |
| Percent90 | `17` | Specifica un tratteggio del 90 percento. Il rapporto tra il colore di primo piano e il colore di sfondo è 90:100. |
| LightDownwardDiagonal | `18` | Specifica le linee diagonali che si inclinano a destra dai punti in alto ai punti in basso e sono distanziate del 50 percento più vicine tra loro rispetto aForwardDiagonal, ma non hanno l'antialias. |
| LightUpwardDiagonal | `19` | Specifica le linee diagonali che si inclinano a sinistra dai punti in alto ai punti in basso e sono distanziate del 50 percento più vicine tra loro rispetto aBackwardDiagonal, ma non hanno l'antialias. |
| DarkDownwardDiagonal | `20` | Specifica le linee diagonali che si inclinano a destra dai punti in alto ai punti in basso, sono distanziate del 50 percento più vicine tra loro e sono larghe il doppio diForwardDiagonal. Questo modello di tratteggio non è antialias. |
| DarkUpwardDiagonal | `21` | Specifica le linee diagonali che si inclinano a sinistra dai punti in alto ai punti in basso, sono distanziate del 50 percento più vicine tra loro rispetto aBackwardDiagonal, e sono due volte la sua larghezza, ma le linee non sono antialias. |
| WideDownwardDiagonal | `22` | Specifica le linee diagonali inclinate a destra dai punti superiori ai punti inferiori, con la stessa spaziatura dello stile di tratteggioForwardDiagonal, e sono il triplo della sua larghezza, ma non hanno l'antialias. |
| WideUpwardDiagonal | `23` | Specifica le linee diagonali che si inclinano a sinistra dai punti superiori ai punti inferiori, hanno la stessa spaziatura dello stile di tratteggioBackwardDiagonal, e sono il triplo della sua larghezza, ma non hanno l'antialias. |
| LightVertical | `24` | Specifica le linee verticali che sono distanziate del 50% più vicine tra loro diVertical. |
| LightHorizontal | `25` | Specifica le linee orizzontali che sono distanziate del 50% più vicine tra loro diHorizontal. |
| NarrowVertical | `26` | Specifica le linee verticali che sono distanziate del 75% più vicine tra loro rispetto allo stile di tratteggioVertical (o il 25 percento più vicini tra loro diLightVertical). |
| NarrowHorizontal | `27` | Specifica le linee orizzontali distanziate del 75% più vicine tra loro rispetto allo stile di tratteggioHorizontal (o il 25 percento più vicini tra loro diLightHorizontal). |
| DarkVertical | `28` | Specifica le linee verticali che sono distanziate del 50% più vicine tra loro diVertical e sono il doppio della sua larghezza. |
| DarkHorizontal | `29` | Specifica le linee orizzontali che sono distanziate del 50% più vicine tra loro diHorizontal e sono il doppio della larghezza diHorizontal. |
| DashedDownwardDiagonal | `30` | Specifica le linee diagonali tratteggiate, che si inclinano a destra dai punti superiori ai punti inferiori. |
| DashedUpwardDiagonal | `31` | Specifica le linee diagonali tratteggiate, che si inclinano a sinistra dai punti superiori ai punti inferiori. |
| DashedHorizontal | `32` | Specifica le linee orizzontali tratteggiate. |
| DashedVertical | `33` | Specifica le linee verticali tratteggiate. |
| SmallConfetti | `34` | Specifica un tratteggio che ha l'aspetto di coriandoli. |
| LargeConfetti | `35` | Specifica un tratteggio che ha l'aspetto di coriandoli ed è composto da pezzi più grandi diSmallConfetti. |
| ZigZag | `36` | Specifica le linee orizzontali composte da zigzag. |
| Wave | `37` | Specifica le linee orizzontali composte da tilde. |
| DiagonalBrick | `38` | Specifica un tratteggio che ha l'aspetto di mattoni a strati inclinati a sinistra dai punti superiori a quelli inferiori. |
| HorizontalBrick | `39` | Specifica un tratteggio che ha l'aspetto di mattoni a strati orizzontalmente. |
| Weave | `40` | Specifica un tratteggio che ha l'aspetto di un materiale intrecciato. |
| Plaid | `41` | Specifica un tratteggio che ha l'aspetto di un materiale a quadri. |
| Divot | `42` | Specifica un tratteggio che ha l'aspetto di divots. |
| DottedGrid | `43` | Specifica le linee orizzontali e verticali, ognuna delle quali è composta da punti, che si incrociano. |
| DottedDiamond | `44` | Specifica le linee diagonali avanti e indietro diagonali, ciascuna delle quali è composta da punti, che si incrociano. |
| Shingle | `45` | Specifica un tratteggio che ha l'aspetto di assicelle stratificate diagonalmente che si inclinano a destra dai punti superiori a quelli inferiori. |
| Trellis | `46` | Specifica un tratteggio che ha l'aspetto di un traliccio. |
| Sphere | `47` | Specifica un tratteggio che ha l'aspetto di sfere adiacenti l'una all'altra. |
| SmallGrid | `48` | Specifica le linee orizzontali e verticali che si incrociano e sono distanziate del 50% più vicine tra loro rispetto allo stile di tratteggioCross. |
| SmallCheckerBoard | `49` | Specifica un tratteggio che ha l'aspetto di una scacchiera. |
| LargeCheckerBoard | `50` | Specifica un tratteggio che ha l'aspetto di una scacchiera con quadrati di dimensioni doppieSmallCheckerBoard. |
| OutlinedDiamond | `51` | Specifica le linee diagonali avanti e indietro diagonali che si incrociano ma non hanno antialias. |
| SolidDiamond | `52` | Specifica un tratteggio che ha l'aspetto di una scacchiera posizionata in diagonale. |
| LargeGrid | `4` | Specifica lo stile di tratteggioCross. |
| Min | `0` | Specifica lo stile di tratteggioHorizontal. |
| Max | `4` | Specifica lo stile di tratteggioSolidDiamond. |

### Guarda anche

* spazio dei nomi [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
