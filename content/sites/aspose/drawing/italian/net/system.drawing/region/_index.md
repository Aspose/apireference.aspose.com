---
title: Region
second_title: Aspose.Drawing per .NET API Reference
description: Descrive linterno di una forma grafica composta da rettangoli e percorsi. Questa classe non può essere ereditata.
type: docs
weight: 1060
url: /it/net/system.drawing/region/
---
## Region class

Descrive l'interno di una forma grafica composta da rettangoli e percorsi. Questa classe non può essere ereditata.

```csharp
public sealed class Region : IDisposable
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [Region](region#constructor)() | Inizializza una nuova istanza di[`Region`](../region) classe. |
| [Region](region#constructor_1)(GraphicsPath) | Inizializza una nuova istanza di[`Region`](../region) classe con il specificatoGraphicsPath . |
| [Region](region#constructor_3)(Rectangle) | Inizializza una nuova istanza di[`Region`](../region) classe da quella specificataRectangle struttura. |
| [Region](region#constructor_4)(RectangleF) | Inizializza una nuova istanza di[`Region`](../region) classe da quella specificataRectangleF struttura. |
| [Region](region#constructor_2)(RegionData) | Inizializza una nuova istanza di[`Region`](../region) classe dai dati specificati. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../system.drawing/region/clone)() | Crea una copia esatta di questoRegion . |
| [Complement](../../system.drawing/region/complement#complement)(GraphicsPath) | Aggiorna questoRegion per contenere la parte del specificatoGraphicsPath che non si interseca con questoRegion . |
| [Complement](../../system.drawing/region/complement#complement_1)(Rectangle) | Aggiorna questoRegion per contenere la parte del specificatoRectangle struttura che non si interseca con questoRegion . |
| [Complement](../../system.drawing/region/complement#complement_2)(RectangleF) | Aggiorna questoRegion per contenere la parte del specificatoRectangleF struttura che non si interseca con questoRegion . |
| [Complement](../../system.drawing/region/complement#complement_3)(Region) | Aggiorna questoRegion per contenere la parte del specificatoRegion che non si interseca con questoRegion . |
| [Dispose](../../system.drawing/region/dispose)() | Rilascia tutte le risorse utilizzate da questoRegion . |
| [Equals](../../system.drawing/region/equals#equals)(Region, Graphics) | Verifica se è specificatoRegion è identico a questoRegion sulla superficie di disegno specificata. |
| [Exclude](../../system.drawing/region/exclude#exclude)(GraphicsPath) | Aggiorna questoRegion per contenere solo la porzione del suo interno che non si interseca con il specificatoGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude#exclude_1)(Rectangle) | Aggiorna questoRegion per contenere solo la porzione del suo interno che non interseca con il specificatoRectangle struttura. |
| [Exclude](../../system.drawing/region/exclude#exclude_2)(RectangleF) | Aggiorna questoRegion per contenere solo la porzione del suo interno che non si interseca con il specificatoRectangleF struttura. |
| [Exclude](../../system.drawing/region/exclude#exclude_3)(Region) | Aggiorna questoRegion per contenere solo la porzione del suo interno che non interseca con il specificatoRegion . |
| [GetBounds](../../system.drawing/region/getbounds)(Graphics) | Ottiene aRectangleFstruttura che rappresenta un rettangolo che lo delimitaRegion sulla superficie di disegno di aGraphics oggetto. |
| [GetRegionData](../../system.drawing/region/getregiondata)() | Restituisce aRegionData che rappresenta le informazioni che lo descrivonoRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans)(Matrix) | Restituisce un array diRectangleF strutture che lo approssimanoRegion dopo l'applicazione della trasformazione di matrice specificata. |
| [Intersect](../../system.drawing/region/intersect#intersect)(GraphicsPath) | Aggiorna questoRegion all'intersezione di se stesso con il specificatoGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect#intersect_1)(Rectangle) | Aggiorna questoRegion all'intersezione di se stesso con il specificatoRectangle struttura. |
| [Intersect](../../system.drawing/region/intersect#intersect_2)(RectangleF) | Aggiorna questoRegion all'intersezione di se stesso con il specificatoRectangleF struttura. |
| [Intersect](../../system.drawing/region/intersect#intersect_3)(Region) | Aggiorna questoRegion all'intersezione di se stesso con il specificatoRegion . |
| [IsEmpty](../../system.drawing/region/isempty)(Graphics) | Verifica se questoRegion ha un interno vuoto sulla superficie di disegno specificata. |
| [IsInfinite](../../system.drawing/region/isinfinite)(Graphics) | Verifica se questoRegion ha un interno infinito sulla superficie di disegno specificata. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_7)(Point) | Verifica se è specificatoPoint la struttura è contenuta in questoRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_9)(PointF) | Verifica se è specificatoPointF la struttura è contenuta in questoRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_11)(Rectangle) | Verifica se qualsiasi parte dell'oggetto specificatoRectangle la struttura è contenuta all'interno di questo Region . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_13)(RectangleF) | Verifica se qualsiasi parte dell'oggetto specificatoRectangleF la struttura è contenuta all'interno di thisRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_3)(float, float) | Verifica se il punto specificato è contenuto all'interno di questoRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_8)(Point, Graphics) | Verifica se è specificatoPoint la struttura è contenuta in questoRegion quando disegnato utilizzando il specificatoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_10)(PointF, Graphics) | Verifica se è specificatoPointF la struttura è contenuta in questoRegion quando disegnato utilizzando il specificatoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_12)(Rectangle, Graphics) | Verifica se qualsiasi parte dell'oggetto specificatoRectangle la struttura è contenuta all'interno di thisRegion quando disegnato usando il specificatoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_14)(RectangleF, Graphics) | Verifica se qualsiasi parte dell'oggetto specificatoRectangleF la struttura è contenuta all'interno di thisRegion quando disegnato usando il specificatoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_6)(float, float, Graphics) | Verifica se il punto specificato è contenuto all'interno di questoRegion quando disegnato usando il specificatoGraphics. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_2)(int, int, Graphics) | Verifica se il punto specificato è contenuto all'interno di questoRegion oggetto quando disegnato utilizzando l'oggetto specificatoGraphics oggetto. |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_4)(float, float, float, float) | Verifica se una qualsiasi parte del rettangolo specificato è contenuta all'interno di questoRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible)(int, int, int, int) | Verifica se una qualsiasi parte del rettangolo specificato è contenuta all'interno di questoRegion . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_5)(float, float, float, float, Graphics) | Verifica se una qualsiasi parte del rettangolo specificato è contenuta all'interno di questoRegion quando disegnato utilizzando il specificatoGraphics . |
| [IsVisible](../../system.drawing/region/isvisible#isvisible_1)(int, int, int, int, Graphics) | Verifica se una qualsiasi parte del rettangolo specificato è contenuta all'interno di questoRegion quando disegnato utilizzando il specificatoGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty)() | Inizializza questoRegion a un interno vuoto. |
| [MakeInfinite](../../system.drawing/region/makeinfinite)() | Inizializza questoRegion oggetto di un interno infinito. |
| [Transform](../../system.drawing/region/transform)(Matrix) | Lo trasformaRegion dal specificatoMatrix . |
| [Translate](../../system.drawing/region/translate#translate_1)(float, float) | Sposta le coordinate di questoRegion per l'importo specificato. |
| [Translate](../../system.drawing/region/translate#translate)(int, int) | Sposta le coordinate di questoRegion per l'importo specificato. |
| [Union](../../system.drawing/region/union#union)(GraphicsPath) | Aggiorna questoRegion all'unione di sé e del specificatoGraphicsPath . |
| [Union](../../system.drawing/region/union#union_1)(Rectangle) | Aggiorna questoRegion all'unione di sé e del specificatoRectangle struttura. |
| [Union](../../system.drawing/region/union#union_2)(RectangleF) | Aggiorna questoRegion all'unione di sé e del specificatoRectangleF struttura. |
| [Union](../../system.drawing/region/union#union_3)(Region) | Aggiorna questoRegion all'unione di sé e del specificatoRegion . |
| [Xor](../../system.drawing/region/xor#xor)(GraphicsPath) | Aggiorna questoRegionall'unione meno l'intersezione di se stesso con il specificatoGraphicsPath . |
| [Xor](../../system.drawing/region/xor#xor_1)(Rectangle) | Aggiorna questoRegionall'unione meno l'intersezione di se stesso con il specificatoRectangle struttura. |
| [Xor](../../system.drawing/region/xor#xor_2)(RectangleF) | Aggiorna questoRegion all'unione meno l'intersezione di se stesso con il specificatoRectangleF struttura. |
| [Xor](../../system.drawing/region/xor#xor_3)(Region) | Aggiorna questoRegionall'unione meno l'intersezione di se stesso con il specificatoRegion . |

### Guarda anche

* spazio dei nomi [System.Drawing](../../system.drawing)
* assemblea [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
