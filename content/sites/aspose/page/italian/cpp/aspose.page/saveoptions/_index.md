---
title: "Aspose::Page::SaveOptions classe"
linktitle: "SaveOptions"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::SaveOptions classe. Questa classe contiene le opzioni necessarie per gestire il processo di conversione in C++."
type: docs
weight: 1500
url: /it/cpp/aspose.page/saveoptions/
---
## SaveOptions class


Questa classe contiene le opzioni necessarie per gestire il processo di conversione.

```cpp
class SaveOptions : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Specifica cartelle aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. Le cartelle predefinite sono le cartelle standard dei font dove il sistema operativo trova i font per esigenze interne. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | Specifica se salvare i font non TrueType in TTF. Riduce significativamente il volume del documento risultante nella conversione da PS a PDF e aumenta la velocità di conversione dei file PS con una grande quantità di testo in font non TrueType verso qualsiasi formato di output. Tuttavia c'è un piccolo spostamento verticale del testo durante la conversione di un file PostScript in immagine. |
| virtual [get_Debug](./get_debug/)() | Specifica se le informazioni di debug devono essere stampate sullo stream di output standard o meno. |
| virtual [get_Exceptions](./get_exceptions/)() | Restituisce un elenco di errori di conversione soppressi se [SuppressErrors](../) è vero. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | La categoria Quality specifica il livello di compressione per un'immagine. I valori disponibili vanno da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell'immagine. Un valore 0 produce l'immagine di qualità più bassa, mentre 100 produce la più alta. |
| [get_Size](./get_size/)() const | Ottiene/imposta la dimensione dell'immagine. |
| virtual [get_SupressErrors](./get_supresserrors/)() | Specifica se gli errori devono essere soppressi o meno. Se vero, gli errori soppressi vengono aggiunti all'elenco [Exceptions](../). Se falso, il primo errore terminerà il programma. |
| [SaveOptions](./saveoptions/)() | Inizializza una nuova istanza della classe [SaveOptions](./) con i valori predefiniti per i flag [SuppressErrors](../) (true) e [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(bool) | Inizializza una nuova istanza della classe [SaveOptions](./) con il valore predefinito per il flag [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | Inizializza una nuova istanza di [SaveOptions](./) con la dimensione della pagina specificata. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | Inizializza una nuova istanza della classe [SaveOptions](./) con il valore predefinito per il flag [Debug](../) (false) e con la dimensione della pagina specificata. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Specifica cartelle aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. Le cartelle predefinite sono le cartelle standard dei font dove il sistema operativo trova i font per esigenze interne. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | Specifica se salvare i font non TrueType in TTF. Riduce significativamente il volume del documento risultante nella conversione da PS a PDF e aumenta la velocità di conversione dei file PS con una grande quantità di testo in font non TrueType verso qualsiasi formato di output. Tuttavia c'è un piccolo spostamento verticale del testo durante la conversione di un file PostScript in immagine. |
| virtual [set_Debug](./set_debug/)(bool) | Specifica se le informazioni di debug devono essere stampate sullo stream di output standard o meno. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | La categoria Quality specifica il livello di compressione per un'immagine. I valori disponibili vanno da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell'immagine. Un valore 0 produce l'immagine di qualità più bassa, mentre 100 produce la più alta. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | Ottiene/imposta la dimensione dell'immagine. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | Specifica se gli errori devono essere soppressi o meno. Se vero, gli errori soppressi vengono aggiunti all'elenco [Exceptions](../). Se falso, il primo errore terminerà il programma. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
