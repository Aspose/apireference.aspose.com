---
title: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId method"
linktitle: "UpdateNamesByNameId"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId method. Seleziona tutti i record relativi alla categoria di stringa logica, specificata dal parametro nameId, e aggiorna il campo name (dati della stringa) in questi record. I campi relativi alla piattaforma (platformID, Platform-specific encoding ID) e alla lingua (Language ID) non sono influenzati da questo metodo. Solo i dati della stringa name vengono sostituiti con un nuovo nome. Utilizzare questo metodo con cautela, poiché sostituirà i nomi originali per tutte le piattaforme e lingue correlate a nameId. Può generare conflitti nei casi in cui i nomi originali avevano valori diversi, poiché l'operazione di sostituzione cambia tutti questi valori con un unico nuovo valore. E questo nuovo valore può presentare l'incoerenza logica con alcune piattaforme e lingue. Questo metodo è utile nei casi in cui il nome originale ha una rappresentazione unica per tutte le piattaforme e lingue, ad esempio quando i dati della stringa name sono in lingua inglese in C++."
type: docs
weight: 1100
url: /it/cpp/aspose.font.ttftables/ttfnametable/updatenamesbynameid/
---
## TtfNameTable::UpdateNamesByNameId method


Seleziona tutti i record relativi alla categoria di stringa logica, specificata dal parametro nameId, e aggiorna il campo name (dati stringa) in questi record. I campi relativi alla piattaforma (platformID, ID di codifica specifica della piattaforma) e alla lingua (Language ID) non sono influenzati da questo metodo. Solo i dati stringa del nome vengono sostituiti con un nuovo nome. Usa questo metodo con cautela, poiché sostituirà i nomi originali per tutte le piattaforme e le lingue correlate a nameId. Può generare conflitti nei casi in cui i nomi originali avevano valori diversi, poiché l'operazione di sostituzione cambia tutti questi valori con un unico nuovo valore. E questo nuovo valore può presentare un'incoerenza logica con alcune piattaforme e lingue. Questo metodo è utile nei casi in cui il nome originale ha una rappresentazione unica per tutte le piattaforme e lingue, ad esempio quando i dati stringa del nome sono in lingua inglese.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::UpdateNamesByNameId(TtfNameTable::NameId nameId, System::String newName)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| nameId | TtfNameTable::NameId | Identificatore del nome, categoria di stringa logica, specificata dall'enumerazione [NameId](../nameid/) |
| newName | System::String | Nuovo nome o nuovi dati della stringa |

## Vedi anche

* Enum [NameId](../nameid/)
* Class [String](../../../system/string/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
