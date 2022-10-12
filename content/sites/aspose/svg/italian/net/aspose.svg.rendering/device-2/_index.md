---
title: DeviceTGraphicContextTRenderingOptions
second_title: Riferimento API Aspose.SVG per .NET
description: Rappresenta la classe base per limplementazione di particolari dispositivi di rendering.
type: docs
weight: 2700
url: /it/net/aspose.svg.rendering/device-2/
---
## Device&lt;TGraphicContext,TRenderingOptions&gt; class

Rappresenta la classe base per l'implementazione di particolari dispositivi di rendering.

```csharp
public abstract class Device<TGraphicContext, TRenderingOptions> : IDevice
    where TGraphicContext : GraphicContext, new()
    where TRenderingOptions : RenderingOptions
```

| Parametro | Descrizione |
| --- | --- |
| TGraphicContext | Contesto grafico che contiene i parametri di controllo della grafica correnti |
| TRenderingOptions | Opzioni di rendering |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [GraphicContext](../../aspose.svg.rendering/device`2/graphiccontext) { get; } | Ottiene il contesto grafico |
| [Options](../../aspose.svg.rendering/device`2/options) { get; } | Ottiene le opzioni di rendering. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| abstract [AddRect](../../aspose.svg.rendering/device`2/addrect)(RectangleF) | Aggiunge un rettangolo al percorso corrente come sottopercorso completo. |
| virtual [BeginDocument](../../aspose.svg.rendering/device`2/begindocument)(Document) | Inizia il rendering del documento. |
| abstract [BeginElement](../../aspose.svg.rendering/device`2/beginelement)(Element, RectangleF) | Inizia il rendering del nodo. |
| virtual [BeginPage](../../aspose.svg.rendering/device`2/beginpage)(SizeF) | Inizia il rendering della nuova pagina. |
| abstract [Clip](../../aspose.svg.rendering/device`2/clip)(FillMode) | Modifica il tracciato di ritaglio corrente intersecandolo con il tracciato corrente, utilizzando la regola FillMode per determinare la regione da riempire. Questo metodo termina il percorso corrente. |
| abstract [ClosePath](../../aspose.svg.rendering/device`2/closepath)() | Chiude il sottotracciato corrente aggiungendo un segmento di linea retta dal punto corrente al punto iniziale del sottotracciato. Se il sottopercorso corrente è già chiuso, "ClosePath" non esegue alcuna operazione. Questo operatore termina il sottopercorso corrente. Aggiungendo un altro segmento al percorso corrente inizia un nuovo sottopercorso, anche se il nuovo segmento inizia all'endpoint raggiunto dal metodo "ClosePath". |
| abstract [CubicBezierTo](../../aspose.svg.rendering/device`2/cubicbezierto)(PointF, PointF, PointF) | Aggiunge una curva di Bézier cubica al percorso corrente. La curva si estende dal punto corrente al punto pt2, utilizzando pt1 e pt2 come punti di controllo Bézier. Il nuovo punto corrente è pt3. |
| [Dispose](../../aspose.svg.rendering/device`2/dispose)() | Esegue attività definite dall'applicazione associate alla liberazione, al rilascio o al ripristino di risorse non gestite. |
| abstract [DrawImage](../../aspose.svg.rendering/device`2/drawimage)(byte[], ImageType, RectangleF) | Disegna l'immagine specificata. |
| virtual [EndDocument](../../aspose.svg.rendering/device`2/enddocument)() | Termina il rendering del documento. |
| abstract [EndElement](../../aspose.svg.rendering/device`2/endelement)(Element) | Termina il rendering del nodo. |
| virtual [EndPage](../../aspose.svg.rendering/device`2/endpage)() | Termina il rendering della pagina corrente. |
| abstract [Fill](../../aspose.svg.rendering/device`2/fill)(FillMode) | Riempie l'intera regione racchiusa dal percorso corrente. Se il percorso è costituito da più sottopercorsi disconnessi, riempie l'interno di tutti i sottopercorsi, considerati insieme. Questo metodo termina il percorso corrente. |
| abstract [FillText](../../aspose.svg.rendering/device`2/filltext)(string, PointF) | Riempie la stringa di testo specificata nella posizione specificata. |
| virtual [Flush](../../aspose.svg.rendering/device`2/flush)() | Scarica tutti i dati nel flusso di output. |
| abstract [LineTo](../../aspose.svg.rendering/device`2/lineto)(PointF) | Aggiunge un segmento di linea retta dal punto corrente al punto (pt). Il nuovo punto corrente è pt. |
| abstract [MoveTo](../../aspose.svg.rendering/device`2/moveto)(PointF) | Inizia un nuovo sottopercorso spostando il punto corrente sulle coordinate del parametro pt, omettendo qualsiasi segmento di linea di collegamento. Se anche il metodo di costruzione del percorso precedente nel percorso corrente era "MoveTo", il nuovo "MoveTo" lo sovrascrive; nessuna traccia della precedente operazione "MoveTo" rimane nel percorso. |
| virtual [RestoreGraphicContext](../../aspose.svg.rendering/device`2/restoregraphiccontext)() | Ripristina l'intero contesto grafico al valore precedente espellendolo dallo stack. |
| virtual [SaveGraphicContext](../../aspose.svg.rendering/device`2/savegraphiccontext)() | Inserisce una copia dell'intero contesto grafico nello stack. |
| abstract [Stroke](../../aspose.svg.rendering/device`2/stroke)() | Traccia una linea lungo il percorso corrente. La linea tratteggiata segue ogni segmento diritto o curvo nel percorso, centrato sul segmento con i lati paralleli ad esso. Ciascuno dei sottopercorsi del percorso viene trattato separatamente. Questo metodo termina il percorso corrente. |
| abstract [StrokeAndFill](../../aspose.svg.rendering/device`2/strokeandfill)(FillMode) | Traccia e riempie il percorso corrente. Questo metodo termina il percorso corrente. |
| abstract [StrokeText](../../aspose.svg.rendering/device`2/stroketext)(string, PointF) | Accarezza la stringa di testo specificata nella posizione specificata. |

## Altri membri

| Nome | Descrizione |
| --- | --- |
| class [DeviceConfiguration&lt;TGraphicContext,TRenderingOptions&gt;](device-2.deviceconfiguration-2) | Rappresenta l'oggetto di configurazione per i dispositivi. |
| enum [PageWritingStrategy&lt;TGraphicContext,TRenderingOptions&gt;](device-2.pagewritingstrategy-2) | Specifica i tipi di strategie per la scrittura di pagine in stream\stream di output. |

### Guarda anche

* interface [IDevice](../idevice)
* class [GraphicContext](../graphiccontext)
* class [RenderingOptions](../renderingoptions)
* spazio dei nomi [Aspose.Svg.Rendering](../../aspose.svg.rendering)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
