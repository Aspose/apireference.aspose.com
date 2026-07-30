---
title: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum"
linktitle: "CffUpdateStringIndexStrategy"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum. Specifica come aggiungere stringhe allo storage CFF String INDEX. Quando proviamo ad aggiungere una stringa nel CFF String INDEX, può verificarsi la situazione che questa stringa sia già presente nello String INDEX. Utilizzando l'opzione SearchForDuplicates possiamo forzare la ricerca nello String INDEX per rilevare se questa stringa è già presente o meno. Questo approccio salva spazio nella struttura String INDEX, ma richiede più tempo per aggiungere la stringa in C++."
type: docs
weight: 1000
url: /it/cpp/aspose.font.cffdataproviders/cffupdatestringindexstrategy/
---
## CffUpdateStringIndexStrategy enum


Specifica come aggiungere stringhe allo storage CFF String INDEX. Quando proviamo ad aggiungere una stringa nel CFF String INDEX, può verificarsi la situazione che questa stringa sia già presente nello String INDEX. Utilizzando l'opzione [SearchForDuplicates](./) possiamo forzare la ricerca nello String INDEX per rilevare se questa stringa è già presente o meno. Questo approccio salva spazio nella struttura String INDEX, ma richiede più tempo per aggiungere la stringa.

```cpp
enum class CffUpdateStringIndexStrategy
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| SearchForDuplicates | 0 | Specifica che la ricerca della stringa da aggiungere deve essere eseguita nella struttura String INDEX per evitare l'aggiunta di duplicati. |
| AddStringAsIs | 1 | Specifica che non devono essere eseguiti controlli per duplicati durante l'aggiunta di una stringa. Questo approccio è più veloce, ma può comportare un utilizzo inefficiente della memoria per String INDEX. |

## Vedi anche

* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
