---
title: "Aspose::Page::Plugins::XpsConverterOptions classe"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::Plugins::XpsConverterOptions classe. Rappresenta le opzioni per il plugin XpsConverter in C++."
type: docs
weight: 2000
url: /it/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Rappresenta le opzioni per il plugin [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Aggiunge una nuova origine dati alla raccolta dati del plugin [XpsConverter](../xpsconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Aggiunge una nuova origine dati alla raccolta dati del plugin [XpsConverterOptions](./). |
| [get_DataCollection](./get_datacollection/)() override | Restituisce la raccolta dati del plugin [XpsConverterOptions](./). |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | La categoria Quality specifica il livello di compressione per un'immagine. I valori disponibili vanno da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell'immagine. Un valore 0 produce l'immagine di qualità più bassa, mentre 100 produce la più alta. |
| virtual [get_OperationName](./get_operationname/)() | Restituisce il nome dell'operazione. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Ottiene la raccolta di destinazioni aggiunte per salvare i risultati dell'operazione. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | La categoria Quality specifica il livello di compressione per un'immagine. I valori disponibili vanno da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell'immagine. Un valore 0 produce l'immagine di qualità più bassa, mentre 100 produce la più alta. |
## Vedi anche

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
