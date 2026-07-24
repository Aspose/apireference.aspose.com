---
title: "Aspose::Page::Plugins::PsConverterOptions classe"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::Plugins::PsConverterOptions classe. Rappresenta le opzioni per il plugin PsConverter in C++."
type: docs
weight: 1200
url: /it/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Rappresenta le opzioni per il plugin [PsConverter](../psconverter/).

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Aggiunge una nuova origine dati alla raccolta dei dati del plugin [PsConverter](../psconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Aggiunge una nuova origine dati alla raccolta dei dati del plugin [PsConverterOptions](./). |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Specifica cartelle aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. Le cartelle predefinite sono le cartelle standard dei font dove il sistema operativo trova i font per esigenze interne. |
| [get_DataCollection](./get_datacollection/)() override | Restituisce la raccolta dei dati del plugin [PsConverterOptions](./). |
| virtual [get_Debug](./get_debug/)() | Specifica se le informazioni di debug devono essere stampate sullo stream di output standard o meno. |
| virtual [get_Exceptions](./get_exceptions/)() | Restituisce un elenco di errori di conversione soppressi se [SuppressErrors](../) è vero. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | La categoria Quality specifica il livello di compressione per un'immagine. I valori disponibili vanno da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell'immagine. Un valore 0 produce l'immagine di qualità più bassa, mentre 100 produce la più alta. |
| virtual [get_OperationName](./get_operationname/)() | Restituisce il nome dell'operazione. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Ottiene la raccolta di destinazioni aggiunte per salvare i risultati dell'operazione. |
| [get_SupressErrors](./get_supresserrors/)() const | Specifica se gli errori devono essere soppressi o meno. Se vero, gli errori soppressi vengono aggiunti all'elenco [Exceptions](../). Se falso, il primo errore terminerà il programma. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Specifica cartelle aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. Le cartelle predefinite sono le cartelle standard dei font dove il sistema operativo trova i font per esigenze interne. |
| virtual [set_Debug](./set_debug/)(bool) | Specifica se le informazioni di debug devono essere stampate sullo stream di output standard o meno. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Restituisce un elenco di errori di conversione soppressi se [SuppressErrors](../) è vero. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | La categoria Quality specifica il livello di compressione per un'immagine. I valori disponibili vanno da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell'immagine. Un valore 0 produce l'immagine di qualità più bassa, mentre 100 produce la più alta. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Specifica se gli errori devono essere soppressi o meno. Se vero, gli errori soppressi vengono aggiunti all'elenco [Exceptions](../). Se falso, il primo errore terminerà il programma. |
## Vedi anche

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
