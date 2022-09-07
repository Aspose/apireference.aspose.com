---
title: XpsPath
second_title: Aspose.Page per riferimento all'API .NET
description: Caratteristiche dellelemento Path incapsulante della classe. Questo elemento è lunico mezzo per aggiungere grafica vettoriale e immagini a una pagina fissa. Definisce una singola grafica vettoriale da renderizzare su una pagina.
type: docs
weight: 3190
url: /it/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

Caratteristiche dell'elemento Path incapsulante della classe. Questo elemento è l'unico mezzo per aggiungere grafica vettoriale e immagini a una pagina fissa. Definisce una singola grafica vettoriale da renderizzare su una pagina.

```csharp
public sealed class XpsPath : XpsContentElement
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip) { get; set; } | Restituisce/imposta l'istanza della geometria del percorso che limita la regione di rendering dell'elemento. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count) { get; } | Restituisce il numero di elementi figlio. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data) { get; set; } | Restituisce/imposta la geometria del percorso. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill) { get; set; } | Restituisce/imposta il pennello utilizzato per dipingere la geometria specificata dalla proprietà Data del percorso. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget) { get; set; } | Restituisce/imposta l'oggetto di destinazione del collegamento ipertestuale. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item) { get; } | Fornisce l'accesso ai figli dell'elemento in base all'indice*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity) { get; set; } | Restituisce/imposta il valore che definisce la trasparenza uniforme dell'elemento. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask) { get; set; } | Restituisce/imposta il pennello specificando una maschera di valori alfa che viene applicata all'elemento allo stesso modo dell'attributo Opacità, ma consentendo valori alfa diversi per aree diverse dell'elemento. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform) { get; set; } | Restituisce/imposta la matrice di trasformazione affine stabilendo un nuovo frame di coordinate per tutti gli attributi dell'elemento e per tutti gli elementi figlio (se presenti). |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke) { get; set; } | Restituisce/imposta il pennello utilizzato per disegnare il tratto. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray) { get; set; } | Restituisce/imposta l'array specificando la lunghezza dei trattini e degli spazi vuoti del tratto del contorno. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap) { get; set; } | Restituisce/imposta il valore specificando come vengono tracciate le estremità di ogni trattino. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset) { get; set; } | Restituisce/imposta il punto iniziale per la ripetizione del modello di matrice di trattini. Se questo valore viene omesso, la matrice di trattini si allinea con l'origine del tratto. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap) { get; set; } | Restituisce/imposta il valore che definisce la forma della fine dell'ultimo trattino in un tratto. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin) { get; set; } | Restituisce/imposta il valore che definisce la forma dell'inizio del primo trattino in un tratto. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit) { get; set; } | Restituisce/imposta il rapporto tra la lunghezza massima della smussatura e metà dello spessore della corsa. Questo valore è significativo solo se il`StrokeLineUnisciti` l'attributo specifica`Mitra` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap) { get; set; } | Restituisce/imposta il valore che definisce la forma dell'inizio del primo trattino in un tratto. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness) { get; set; } | Restituisce/imposta lo spessore di un tratto, in unità di lo spazio delle coordinate effettivo (include la trasformazione di rendering del percorso). Il tratto viene disegnato sopra il confine della geometria specificata dalla proprietà Dati dell'elemento Percorso. Metà dello StrokeThickness si estende all'esterno della geometria specificata dalla proprietà Data e l'altra metà si estende all'interno della geometria. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone)() | Clona questo percorso. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator)() | Implementazione diIEnumerable interfaccia. |

### Guarda anche

* class [XpsContentElement](../xpscontentelement)
* spazio dei nomi [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel)
* assemblea [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
