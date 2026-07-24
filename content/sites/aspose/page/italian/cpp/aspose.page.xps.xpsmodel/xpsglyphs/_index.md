---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs classe"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs classe. Classe che incapsula le caratteristiche dell'elemento Glyphs. Questo elemento rappresenta una sequenza di testo formattato uniformemente da un unico font. Fornisce le informazioni necessarie per un rendering accurato e supporta le funzionalità di ricerca e selezione nei visualizzatori in C++."
type: docs
weight: 1500
url: /it/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Classe che incapsula le funzionalità dell'elemento Glyphs. Questo elemento rappresenta una sequenza di testo formattato uniformemente da un unico font. Fornisce le informazioni necessarie per un rendering accurato e supporta le funzionalità di ricerca e selezione nei visualizzatori.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() | Clona questi glyphs. |
| [get_BidiLevel](./get_bidilevel/)() const | Restituisce/imposta il valore che specifica il livello di nidificazione bidirezionale dell'algoritmo Unicode. I valori pari implicano un layout da sinistra a destra, i valori dispari implicano un layout da destra a sinistra. Il layout da destra a sinistra posiziona l'origine della sequenza sul lato destro del primo glifo, con larghezze di avanzamento positive (che rappresentano avanzamenti verso sinistra) che posizionano i glifi successivi a sinistra del glifo precedente. |
| [get_Fill](./get_fill/)() | Restituisce/imposta il pennello usato per riempire la forma dei glifi renderizzati. |
| [get_Font](./get_font/)() | Restituisce la risorsa del font per il font **TrueType** usato per comporre il testo degli elementi. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | Restituisce/imposta la dimensione del font in unità della superficie di disegno, espressa come float nelle unità dello spazio di coordinate effettivo. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | Restituisce/imposta il valore che indica che un glifo è ruotato di lato, con l'origine definita come il centro superiore del glifo non ruotato. |
| [get_OriginX](./get_originx/)() const | Restituisce/imposta la coordinata x del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |
| [get_OriginY](./get_originy/)() const | Restituisce/imposta la coordinata y del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |
| [get_StyleSimulations](./get_stylesimulations/)() const | Restituisce/imposta il valore che specifica una simulazione di stile. |
| [get_UnicodeString](./get_unicodestring/)() const | Restituisce/imposta la stringa di testo resa dall'elemento Glyphs. Il testo è specificato come punti di codice Unicode. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Restituisce/imposta il valore che specifica il livello di nidificazione bidirezionale dell'algoritmo Unicode. I valori pari implicano un layout da sinistra a destra, i valori dispari implicano un layout da destra a sinistra. Il layout da destra a sinistra posiziona l'origine della sequenza sul lato destro del primo glifo, con larghezze di avanzamento positive (che rappresentano avanzamenti verso sinistra) che posizionano i glifi successivi a sinistra del glifo precedente. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Restituisce/imposta il pennello usato per riempire la forma dei glifi renderizzati. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | Restituisce/imposta la dimensione del font in unità della superficie di disegno, espressa come float nelle unità dello spazio di coordinate effettivo. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | Restituisce/imposta il valore che indica che un glifo è ruotato di lato, con l'origine definita come il centro superiore del glifo non ruotato. |
| [set_OriginX](./set_originx/)(float) | Restituisce/imposta la coordinata x del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |
| [set_OriginY](./set_originy/)(float) | Restituisce/imposta la coordinata y del primo glifo nella sequenza, in unità dello spazio di coordinate effettivo. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | Restituisce/imposta il valore che specifica una simulazione di stile. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Restituisce/imposta la stringa di testo resa dall'elemento Glyphs. Il testo è specificato come punti di codice Unicode. |
## Vedi anche

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
