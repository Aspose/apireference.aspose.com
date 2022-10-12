---
title: IDevice
second_title: Riferimento API Aspose.SVG per .NET
description: Definisce metodi e proprietà che supportano il rendering personalizzato degli elementi grafici come percorsi testo e immagini.
type: docs
weight: 2770
url: /it/net/aspose.svg.rendering/idevice/
---
## IDevice interface

Definisce metodi e proprietà che supportano il rendering personalizzato degli elementi grafici come percorsi, testo e immagini.

```csharp
public interface IDevice : IDisposable
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/idevice/graphiccontext) { get; } | Ottiene il contesto grafico. |
| [Options](../../aspose.svg.rendering/idevice/options) { get; } | Ottiene le opzioni di rendering. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddRect](../../aspose.svg.rendering/idevice/addrect)(RectangleF) | Aggiunge un rettangolo al percorso corrente come sottopercorso completo. |
| [BeginDocument](../../aspose.svg.rendering/idevice/begindocument)(Document) | Inizia il rendering del documento. |
| [BeginElement](../../aspose.svg.rendering/idevice/beginelement)(Element, RectangleF) | Inizia il rendering dell'elemento. |
| [BeginPage](../../aspose.svg.rendering/idevice/beginpage)(SizeF) | Inizia il rendering della nuova pagina. |
| [Clip](../../aspose.svg.rendering/idevice/clip)(FillMode) | Modifica il tracciato di ritaglio corrente intersecandolo con il tracciato corrente, utilizzando la regola FillMode per determinare la regione da riempire. Questo metodo termina il percorso corrente. |
| [ClosePath](../../aspose.svg.rendering/idevice/closepath)() | Chiude il sottotracciato corrente aggiungendo un segmento di linea retta dal punto corrente al punto iniziale del sottotracciato. Se il sottopercorso corrente è già chiuso, "ClosePath" non esegue alcuna operazione. Questo operatore termina il sottopercorso corrente. Aggiungendo un altro segmento al percorso corrente inizia un nuovo sottopercorso, anche se il nuovo segmento inizia all'endpoint raggiunto dal metodo "ClosePath". |
| [CubicBezierTo](../../aspose.svg.rendering/idevice/cubicbezierto)(PointF, PointF, PointF) | Aggiunge una curva di Bézier cubica al percorso corrente. La curva si estende dal punto corrente al punto pt3, utilizzando pt1 e pt2 come punti di controllo Bézier. Il nuovo punto corrente è pt3. |
| [DrawImage](../../aspose.svg.rendering/idevice/drawimage)(byte[], ImageType, RectangleF) | Disegna l'immagine specificata. |
| [EndDocument](../../aspose.svg.rendering/idevice/enddocument)() | Termina il rendering del documento. |
| [EndElement](../../aspose.svg.rendering/idevice/endelement)(Element) | Termina il rendering dell'elemento. |
| [EndPage](../../aspose.svg.rendering/idevice/endpage)() | Termina il rendering della pagina corrente. |
| [Fill](../../aspose.svg.rendering/idevice/fill)(FillMode) | Riempie l'intera regione racchiusa dal percorso corrente. Se il percorso è costituito da più sottopercorsi disconnessi, riempie l'interno di tutti i sottopercorsi, considerati insieme. Questo metodo termina il percorso corrente. |
| [FillText](../../aspose.svg.rendering/idevice/filltext)(string, PointF) | Riempie la stringa di testo specificata nella posizione specificata. |
| [Flush](../../aspose.svg.rendering/idevice/flush)() | Scarica tutti i dati nel flusso di output. |
| [LineTo](../../aspose.svg.rendering/idevice/lineto)(PointF) | Aggiunge un segmento di linea retta dal punto corrente al punto (pt). Il nuovo punto corrente è pt. |
| [MoveTo](../../aspose.svg.rendering/idevice/moveto)(PointF) | Inizia un nuovo sottopercorso spostando il punto corrente sulle coordinate del parametro pt, omettendo qualsiasi segmento di linea di collegamento. Se anche il metodo di costruzione del percorso precedente nel percorso corrente era "MoveTo", il nuovo "MoveTo" lo sovrascrive; nessuna traccia della precedente operazione "MoveTo" rimane nel percorso. |
| [RestoreGraphicContext](../../aspose.svg.rendering/idevice/restoregraphiccontext)() | Ripristina l'intero contesto grafico al valore precedente espellendolo dallo stack. |
| [SaveGraphicContext](../../aspose.svg.rendering/idevice/savegraphiccontext)() | Inserisce una copia dell'intero contesto grafico nello stack. |
| [Stroke](../../aspose.svg.rendering/idevice/stroke)() | Traccia una linea lungo il percorso corrente. La linea tratteggiata segue ogni segmento diritto o curvo nel percorso, centrato sul segmento con i lati paralleli ad esso. Ciascuno dei sottopercorsi del percorso viene trattato separatamente. Questo metodo termina il percorso corrente. |
| [StrokeAndFill](../../aspose.svg.rendering/idevice/strokeandfill)(FillMode) | Traccia e riempie il percorso corrente. Questo metodo termina il percorso corrente. |
| [StrokeText](../../aspose.svg.rendering/idevice/stroketext)(string, PointF) | Accarezza la stringa di testo specificata nella posizione specificata. |

### Guarda anche

* spazio dei nomi [Aspose.Svg.Rendering](../../aspose.svg.rendering)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
