---
title: "namespace Aspose::Font::CffDataProviders"
linktitle: "Aspose::Font::CffDataProviders"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il namespace Aspose::Font::CffDataProviders in C++."
type: docs
weight: 300
url: /it/cpp/aspose.font.cffdataproviders/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [CffPrivateDictDataProvider](./cffprivatedictdataprovider/) |  |
| [CffTopDictDataProvider](./cfftopdictdataprovider/) |  |
| [ICffIndexDataProvider](./icffindexdataprovider/) | Interfaccia di base per accedere alle strutture INDEX dei font CFF. |
| [IStringIndexAdapter](./istringindexadapter/) |  |
| [NameIndexDataProvider](./nameindexdataprovider/) | Dichiara la funzionalità per accedere alla struttura CFF Name INDEX. |
| [PrivateDictDataProvider](./privatedictdataprovider/) | Dichiara la funzionalità per leggere/aggiornare la struttura CFF Private DICT. |
| [StringIndexDataProvider](./stringindexdataprovider/) | Dichiara la funzionalità per accedere alla struttura CFF String INDEX. |
| [TopDictDataProvider](./topdictdataprovider/) | Dichiara la funzionalità per leggere/aggiornare la struttura CFF Top DICT. |
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [CffIndexProviderType](./cffindexprovidertype/) | Specifica le strutture INDEX supportate dalla famiglia di interfacce del provider di indice. |
| [CffUpdateStringIndexStrategy](./cffupdatestringindexstrategy/) | Specifica come aggiungere stringhe all'archivio CFF String INDEX. Quando proviamo ad aggiungere una stringa al CFF String INDEX, può verificarsi la situazione in cui questa stringa è già presente nell'String INDEX. Utilizzando l'opzione [SearchForDuplicates](./cffupdatestringindexstrategy/) possiamo forzare la ricerca nell'String INDEX per rilevare se la stringa è già presente o meno. Questo approccio salva spazio nella struttura String INDEX, ma richiede più tempo per aggiungere la stringa. |
