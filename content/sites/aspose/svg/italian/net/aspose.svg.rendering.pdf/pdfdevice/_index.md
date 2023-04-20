---
title: Class PdfDevice
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Rendering.Pdf.PdfDevice classe. Rappresenta il rendering in un documento pdf.
type: docs
weight: 2950
url: /it/net/aspose.svg.rendering.pdf/pdfdevice/
---
## PdfDevice class

Rappresenta il rendering in un documento pdf.

```csharp
public class PdfDevice : Device<PdfGraphicContext, PdfRenderingOptions>
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [PdfDevice](pdfdevice/#constructor)(ICreateStreamProvider) | Inizializza una nuova istanza di`PdfDevice` classe. |
| [PdfDevice](pdfdevice/#constructor_4)(Stream) | Inizializza una nuova istanza di`PdfDevice` classe. |
| [PdfDevice](pdfdevice/#constructor_5)(string) | Inizializza una nuova istanza di`PdfDevice` classe. |
| [PdfDevice](pdfdevice/#constructor_1)(PdfRenderingOptions, ICreateStreamProvider) | Inizializza una nuova istanza di`PdfDevice` class in base alle opzioni di rendering e allo stream provider. |
| [PdfDevice](pdfdevice/#constructor_2)(PdfRenderingOptions, Stream) | Inizializza una nuova istanza di`PdfDevice` classe tramite opzioni di rendering e flusso di output. |
| [PdfDevice](pdfdevice/#constructor_3)(PdfRenderingOptions, string) | Inizializza una nuova istanza di`PdfDevice` class in base alle opzioni di rendering e al nome del file di output. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device-2/graphiccontext/) { get; } |  |
| [Options](../../aspose.svg.rendering/device-2/options/) { get; } |  |

## Metodi

| Nome | Descrizione |
| --- | --- |
| override [AddRect](../../aspose.svg.rendering.pdf/pdfdevice/addrect/)(RectangleF) | Aggiunge un rettangolo al percorso corrente come sottopercorso completo. |
| override [BeginDocument](../../aspose.svg.rendering.pdf/pdfdevice/begindocument/)(Document) | Inizia il rendering del documento. |
| override [BeginElement](../../aspose.svg.rendering.pdf/pdfdevice/beginelement/)(Element, RectangleF) | Inizia il rendering dell'elemento. |
| override [BeginPage](../../aspose.svg.rendering.pdf/pdfdevice/beginpage/)(SizeF) | Inizia il rendering della nuova pagina. |
| override [Clip](../../aspose.svg.rendering.pdf/pdfdevice/clip/)(FillMode) | Modifica il tracciato di ritaglio corrente intersecandolo con il tracciato corrente, utilizzando la regola FillMode per determinare l'area da riempire. Questo metodo termina il percorso corrente. |
| override [ClosePath](../../aspose.svg.rendering.pdf/pdfdevice/closepath/)() | Chiude il sottotracciato corrente aggiungendo un segmento di linea retta dal punto corrente al punto iniziale del sottotracciato. Se il sottopercorso corrente è già chiuso, "ClosePath" non fa nulla. Questo operatore termina il sottopercorso corrente. L'aggiunta di un altro segmento al percorso corrente inizia un nuovo sottopercorso, anche se il nuovo segmento inizia dall'endpoint raggiunto dal metodo "ClosePath". |
| override [CubicBezierTo](../../aspose.svg.rendering.pdf/pdfdevice/cubicbezierto/)(PointF, PointF, PointF) | Aggiunge una curva di Bézier cubica al percorso corrente. La curva si estende dal punto corrente al punto pt2, utilizzando pt1 e pt2 come punti di controllo Bézier. Il nuovo punto corrente è pt3. |
| [Dispose](../../aspose.svg.rendering/device-2/dispose/)() |  |
| override [DrawImage](../../aspose.svg.rendering.pdf/pdfdevice/drawimage/)(byte[], ImageType, RectangleF) | Disegna l'immagine specificata. |
| override [EndDocument](../../aspose.svg.rendering.pdf/pdfdevice/enddocument/)() | Termina il rendering del documento. |
| override [EndElement](../../aspose.svg.rendering.pdf/pdfdevice/endelement/)(Element) | Termina il rendering dell'elemento. |
| override [EndPage](../../aspose.svg.rendering.pdf/pdfdevice/endpage/)() | Termina il rendering della pagina corrente. |
| override [Fill](../../aspose.svg.rendering.pdf/pdfdevice/fill/)(FillMode) | Riempie l'intera regione racchiusa dal percorso corrente. Se il percorso è costituito da diversi sottopercorsi disconnessi, riempie l'interno di tutti i sottopercorsi, considerati insieme. Questo metodo termina il percorso corrente. |
| override [FillText](../../aspose.svg.rendering.pdf/pdfdevice/filltext/)(string, PointF) | Riempie la stringa di testo specificata nella posizione specificata. |
| override [Flush](../../aspose.svg.rendering.pdf/pdfdevice/flush/)() | Scarica tutti i dati nel flusso di output. |
| override [LineTo](../../aspose.svg.rendering.pdf/pdfdevice/lineto/)(PointF) | Aggiunge un segmento di linea retta dal punto corrente al punto (pt). Il nuovo punto corrente è pt. |
| override [MoveTo](../../aspose.svg.rendering.pdf/pdfdevice/moveto/)(PointF) | Inizia un nuovo sottotracciato spostando il punto corrente alle coordinate del parametro pt, omettendo qualsiasi segmento di linea di collegamento. Se anche il precedente metodo di costruzione del percorso nel percorso corrente era "MoveTo", il nuovo "MoveTo" lo sovrascrive; nessuna traccia della precedente operazione "Sposta su" rimane nel percorso. |
| override [RestoreGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/restoregraphiccontext/)() | Ripristina l'intero contesto grafico al suo valore precedente estraendolo dallo stack. |
| override [SaveGraphicContext](../../aspose.svg.rendering.pdf/pdfdevice/savegraphiccontext/)() | Inserisce una copia dell'intero contesto grafico nello stack. |
| override [Stroke](../../aspose.svg.rendering.pdf/pdfdevice/stroke/)() | Traccia una linea lungo il percorso corrente. La linea tracciata segue ogni segmento rettilineo o curvo nel percorso, centrato sul segmento con i lati paralleli ad esso. Ciascun sottopercorso del percorso viene trattato separatamente. Questo metodo termina il percorso corrente. |
| override [StrokeAndFill](../../aspose.svg.rendering.pdf/pdfdevice/strokeandfill/)(FillMode) | Traccia e riempie il percorso corrente. Questo metodo termina il percorso corrente. |
| override [StrokeText](../../aspose.svg.rendering.pdf/pdfdevice/stroketext/)(string, PointF) | Accarezza la stringa di testo specificata nella posizione specificata. |

## Altri membri

| Nome | Descrizione |
| --- | --- |
| class [PdfGraphicContext](pdfdevice.pdfgraphiccontext/) | Contiene i parametri di controllo della grafica correnti per PdfDevice. Questi parametri definiscono il framework globale all'interno del quale vengono eseguiti gli operatori grafici. |

### Guarda anche

* class [Device&lt;TGraphicContext,TRenderingOptions&gt;](../../aspose.svg.rendering/device-2/)
* class [PdfGraphicContext](../pdfdevice.pdfgraphiccontext/)
* class [PdfRenderingOptions](../pdfrenderingoptions/)
* spazio dei nomi [Aspose.Svg.Rendering.Pdf](../../aspose.svg.rendering.pdf/)
* assemblea [Aspose.SVG](../../)


