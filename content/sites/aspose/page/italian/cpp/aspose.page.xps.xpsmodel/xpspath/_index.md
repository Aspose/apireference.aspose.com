---
title: "Aspose::Page::XPS::XpsModel::XpsPath class"
linktitle: "XpsPath"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath class. Classe che incapsula le caratteristiche dell'elemento Path. Questo elemento è l'unico mezzo per aggiungere grafica vettoriale e immagini a una pagina fissa. Definisce una singola grafica vettoriale da renderizzare su una pagina in C++."
type: docs
weight: 3000
url: /it/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Classe che incapsula le funzionalità dell'elemento Path. Questo elemento è l'unico mezzo per aggiungere grafica vettoriale e immagini a una pagina fissa. Definisce una singola grafica vettoriale da rendere su una pagina.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Clona questo percorso. |
| [get_Data](./get_data/)() | Restituisce/imposta la geometria del percorso. |
| [get_Fill](./get_fill/)() | Restituisce/imposta il pennello usato per dipingere la geometria specificata dalla proprietà Data del percorso. |
| [get_Stroke](./get_stroke/)() | Restituisce/imposta il pennello usato per disegnare il tratto. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | Restituisce/imposta l'array che specifica la lunghezza dei tratti e degli spazi del contorno del tratto. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | Restituisce/imposta il valore che specifica come vengono disegnate le estremità di ciascun tratto. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | Restituisce/imposta il punto di inizio per ripetere il modello dell'array di tratti. Se questo valore è omesso, l'array di tratti si allinea con l'origine del tratto. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | Restituisce/imposta il valore che definisce la forma della fine dell'ultimo tratto in un tratto. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | Restituisce/imposta il valore che definisce la forma dell'inizio del primo tratto in un tratto. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | Restituisce/imposta il rapporto tra la lunghezza massima del giunto a spigolo e metà dello spessore del tratto. Questo valore è significativo solo se l'attributo **StrokeLineJoin** specifica **Miter**. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | Restituisce/imposta il valore che definisce la forma dell'inizio del primo tratto in un tratto. |
| [get_StrokeThickness](./get_strokethickness/)() const | Restituisce/imposta lo spessore di un tratto, in unità dello spazio di coordinate efficace (include la trasformazione di rendering del percorso). Il tratto è disegnato sopra il confine della geometria specificata dalla proprietà Data dell'elemento Path. Metà dello StrokeThickness si estende al di fuori della geometria specificata dalla proprietà Data e l'altra metà si estende all'interno della geometria. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | Restituisce/imposta la geometria del percorso. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Restituisce/imposta il pennello usato per dipingere la geometria specificata dalla proprietà Data del percorso. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | Restituisce/imposta il pennello usato per disegnare il tratto. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | Restituisce/imposta l'array che specifica la lunghezza dei tratti e degli spazi del contorno del tratto. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | Restituisce/imposta il valore che specifica come vengono disegnate le estremità di ciascun tratto. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | Restituisce/imposta il punto di inizio per ripetere il modello dell'array di tratti. Se questo valore è omesso, l'array di tratti si allinea con l'origine del tratto. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | Restituisce/imposta il valore che definisce la forma della fine dell'ultimo tratto in un tratto. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | Restituisce/imposta il valore che definisce la forma dell'inizio del primo tratto in un tratto. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | Restituisce/imposta il rapporto tra la lunghezza massima del giunto a spigolo e metà dello spessore del tratto. Questo valore è significativo solo se l'attributo **StrokeLineJoin** specifica **Miter**. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | Restituisce/imposta il valore che definisce la forma dell'inizio del primo tratto in un tratto. |
| [set_StrokeThickness](./set_strokethickness/)(float) | Restituisce/imposta lo spessore di un tratto, in unità dello spazio di coordinate efficace (include la trasformazione di rendering del percorso). Il tratto è disegnato sopra il confine della geometria specificata dalla proprietà Data dell'elemento Path. Metà dello StrokeThickness si estende al di fuori della geometria specificata dalla proprietà Data e l'altra metà si estende all'interno della geometria. |
## Vedi anche

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
