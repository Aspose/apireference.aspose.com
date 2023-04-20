---
title: Class PdfDevice.PdfGraphicContext
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Rendering.Pdf.PdfDevicePdfGraphicContext classe. Contiene i parametri di controllo della grafica correnti per PdfDevice. Questi parametri definiscono il framework globale allinterno del quale vengono eseguiti gli operatori grafici.
type: docs
weight: 2960
url: /it/net/aspose.svg.rendering.pdf/pdfdevice.pdfgraphiccontext/
---
## PdfDevice.PdfGraphicContext class

Contiene i parametri di controllo della grafica correnti per PdfDevice. Questi parametri definiscono il framework globale all'interno del quale vengono eseguiti gli operatori grafici.

```csharp
public class PdfGraphicContext : GraphicContext
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PdfGraphicContext](pdfgraphiccontext/)() | Default_Costruttore |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| virtual [CharacterSpacing](../../aspose.svg.rendering/graphiccontext/characterspacing/) { get; set; } | Imposta o ottiene la spaziatura dei caratteri. |
| override [FillBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/fillbrush/) { get; set; } | Imposta o ottiene l'oggetto pennello utilizzato per riempire gli interni dei tracciati. |
| virtual [Font](../../aspose.svg.rendering/graphiccontext/font/) { get; set; } | Imposta o ottiene l'oggetto font true type utilizzato per il rendering del testo. |
| virtual [FontSize](../../aspose.svg.rendering/graphiccontext/fontsize/) { get; set; } | Imposta o ottiene la dimensione del carattere del testo. |
| virtual [FontStyle](../../aspose.svg.rendering/graphiccontext/fontstyle/) { get; set; } | Imposta o ottiene lo stile del carattere del testo. |
| override [LineCap](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linecap/) { get; set; } | Imposta o ottiene il codice che specifica la forma degli estremi per qualsiasi percorso aperto che viene tracciato. |
| virtual [LineDashOffset](../../aspose.svg.rendering/graphiccontext/linedashoffset/) { get; set; } | Imposta o ottiene l'offset di fase del modello di linea tratteggiata corrente. |
| virtual [LineDashPattern](../../aspose.svg.rendering/graphiccontext/linedashpattern/) { get; set; } | Imposta o ottiene la descrizione del modello di tratteggio da utilizzare quando vengono tracciati i percorsi. |
| virtual [LineDashStyle](../../aspose.svg.rendering/graphiccontext/linedashstyle/) { get; set; } | Gli insiemi ottengono lo stile delle linee tratteggiate di un percorso tracciato. |
| override [LineJoin](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linejoin/) { get; set; } | Imposta o ottiene il codice che specifica la forma dei giunti tra i segmenti collegati di un percorso tracciato. |
| override [LineWidth](../../aspose.svg.rendering.pdf/pdfgraphiccontext/linewidth/) { get; set; } | Imposta o ottiene lo spessore dei tracciati da tracciare. |
| override [MiterLimit](../../aspose.svg.rendering.pdf/pdfgraphiccontext/miterlimit/) { get; set; } | Imposta o ottiene la lunghezza massima delle giunzioni delle linee squadrate per i percorsi tracciati. Questo parametro limita la lunghezza delle "punte" prodotte quando i segmenti di linea si uniscono ad angoli acuti. |
| override [StrokeBrush](../../aspose.svg.rendering.pdf/pdfgraphiccontext/strokebrush/) { get; set; } | Imposta o ottiene l'oggetto pennello utilizzato per i tracciati tracciati. |
| virtual [TextInfo](../../aspose.svg.rendering/graphiccontext/textinfo/) { get; } | Ottiene a[`TextInfo`](../../aspose.svg.rendering/textinfo/) oggetto che contiene informazioni sul testo renderizzato. |
| override [TransformationMatrix](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transformationmatrix/) { get; set; } | Imposta o ottiene la matrice di trasformazione. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [Clone](../../aspose.svg.rendering.pdf/pdfgraphiccontext/clone/)() | Crea una nuova istanza di una classe con gli stessi valori di proprietà di un'istanza esistente. |
| override [Transform](../../aspose.svg.rendering.pdf/pdfgraphiccontext/transform/)(Matrix) | Modifica la matrice di trasformazione corrente moltiplicando la matrice specificata. |

### Guarda anche

* class [GraphicContext](../../aspose.svg.rendering/graphiccontext/)
* class [PdfDevice](../pdfdevice/)
* spazio dei nomi [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* assemblea [Aspose.SVG](../../)


