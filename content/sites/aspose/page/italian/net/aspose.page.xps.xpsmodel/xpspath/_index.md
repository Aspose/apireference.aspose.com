---
title: Class XpsPath
second_title: Aspose.Page per riferimento all'API .NET
description: Aspose.Page.XPS.XpsModel.XpsPath classe. Classe che incapsula le caratteristiche dellelemento Path. Questo elemento è lunico mezzo per aggiungere grafica vettoriale e immagini a una pagina fissa. Definisce una singola grafica vettoriale da visualizzare su una pagina.
type: docs
weight: 3260
url: /it/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

Classe che incapsula le caratteristiche dell'elemento Path. Questo elemento è l'unico mezzo per aggiungere grafica vettoriale e immagini a una pagina fissa. Definisce una singola grafica vettoriale da visualizzare su una pagina.

```csharp
public sealed class XpsPath : XpsContentElement
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Restituisce/imposta l'istanza della geometria del percorso che limita la regione renderizzata dell'elemento. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Restituisce il numero di elementi figlio. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | Restituisce/imposta la geometria del percorso. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | Restituisce/imposta il pennello utilizzato per disegnare la geometria specificata dalla proprietà Data del percorso. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Restituisce/imposta l'oggetto di destinazione del collegamento ipertestuale. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Fornisce l'accesso ai figli dell'elemento per indice*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Restituisce/imposta il valore che definisce la trasparenza uniforme dell'elemento. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Restituisce/imposta il pennello specificando una maschera di valori alfa che viene applicata all'elemento nello stesso modo dell'attributo Opacity, ma consentendo valori alfa diversi per diverse aree dell'elemento. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Restituisce/imposta la matrice di trasformazione affine stabilendo un nuovo frame di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figli (se presenti). |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | Restituisce/imposta il pennello usato per disegnare il tratto. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | Restituisce/imposta la matrice specificando la lunghezza dei trattini e degli spazi del tratto del contorno. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | Restituisce/imposta il valore specificando come vengono disegnate le estremità di ogni trattino. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | Restituisce/imposta il punto iniziale per ripetere il motivo della matrice di trattini. Se questo valore viene omesso, la matrice di trattini si allinea con l'origine del tratto. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | Restituisce/imposta il valore che definisce la forma della fine dell'ultimo trattino in un tratto. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | Restituisce/imposta il valore che definisce la forma dell'inizio del primo trattino in un tratto. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | Restituisce/imposta il rapporto tra la lunghezza massima dell'angolo e la metà dello spessore del tratto. Questo valore è significativo solo se il`StrokeLineUnisciti` l'attributo specifica`Mitra` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | Restituisce/imposta il valore che definisce la forma dell'inizio del primo trattino in un tratto. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | Restituisce/imposta lo spessore di un tratto, in unità di lo spazio delle coordinate effettive (include la trasformazione di rendering del tracciato). Il tratto viene disegnato sopra il limite della geometria specificata dalla proprietà Data dell'elemento Path. Metà di StrokeThickness si estende all'esterno della geometria specificata dalla proprietà Data e l'altra metà si estende all'interno della geometria. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | Clona questo percorso. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Attuazione diIEnumerable interfaccia. |

### Guarda anche

* class [XpsContentElement](../xpscontentelement/)
* spazio dei nomi [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* assemblea [Aspose.Page](../../)


