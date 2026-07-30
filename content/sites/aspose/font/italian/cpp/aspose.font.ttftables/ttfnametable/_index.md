---
title: "Aspose::Font::TtfTables::TtfNameTable classe"
linktitle: "TtfNameTable"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::TtfTables::TtfNameTable classe. Rappresenta la tabella \"name\" del file Font TTF in C++."
type: docs
weight: 1300
url: /it/cpp/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class


Rappresenta la tabella "name" del file TTF [Font](../../aspose.font/font/)

```cpp
class TtfNameTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [NameRecord](./namerecord/)
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [MacLanguageId](./maclanguageid/) | Enumerazione degli ID lingua della piattaforma Macintosh. |
| [MacPlatformSpecificId](./macplatformspecificid/) | Rappresenta l'enumerazione PlatformSpecificId della piattaforma Macintosh. |
| [MSLanguageId](./mslanguageid/) | Enumerazione degli ID lingua della piattaforma Microsoft. |
| [MSPlatformSpecificId](./msplatformspecificid/) | Rappresenta l'enumerazione PlatformSpecificId della piattaforma Microsoft. |
| [NameId](./nameid/) | Rappresenta [NameId](./nameid/). |
| [PlatformId](./platformid/) | Rappresenta l'enumerazione [PlatformId](./platformid/). |
| [UnicodePlatformSpecificId](./unicodeplatformspecificid/) | Rappresenta l'enumerazione unicode specifica della piattaforma. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddMultiLanguageNames](./addmultilanguagenames/)(System::SharedPtr\<MultiLanguageString\>, TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Estrae tutte le stringhe multilingue dall'oggetto *mlNames* passato e crea la struttura [NameRecord](./namerecord/) corrispondente per ogni stringa estratta utilizzando i parametri passati *platformId*, *platformSpecificId* e *nameId*. Il valore per il campo languageID è estratto dall'oggetto *mlNames*. Il nuovo record appena creato viene aggiunto alla tabella. Se viene trovato un record che coincide con quello appena creato per i campi platformID, platformSpecificID, nameID e languageId, il nuovo record non verrà aggiunto e solo i dati della stringa verranno aggiornati per il record esistente. |
| [AddName](./addname/)(TtfNameTable::NameId, TtfNameTable::PlatformId, int32_t, int32_t, System::String) | Aggiunge una voce alla tabella. La categoria dei dati stringa da aggiungere è specificata dal parametro *name*. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Elimina tutti i record relativi ai parametri passati. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t) | Elimina tutti i record relativi alla piattaforma specificata. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t) | Elimina i record relativi ai parametri specificati. |
| [DeleteRecordsByNameId](./deleterecordsbynameid/)(TtfNameTable::NameId) | Elimina tutti i record relativi al parametro nameId passato. |
| static [get_Tag](./get_tag/)() | Ottiene il tag della tabella. |
| [GetAllNameRecords](./getallnamerecords/)() | Restituisce tutte le strutture [NameRecord](./namerecord/) dalla tabella. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId) | Restituisce un nome per nameId. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId) | Restituisce un nome per nameId utilizzando l'identificatore di piattaforma passato. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) | Restituisce un nome come oggetto di tipo [MultiLanguageString](../../aspose.font/multilanguagestring/). Il metodo raccoglie tutte le strutture [NameRecord](./namerecord/) che coincidono con i parametri passati nameId, platformId e platformSpecificId e quindi costruisce l'oggetto risultante basandosi su questa lista di strutture. |
| [GetNameById](./getnamebyid/)(TtfNameTable::NameId) | Restituisce un nome per nameId se trovato, altrimenti null. |
| [GetNameRecordsByNameId](./getnamerecordsbynameid/)(TtfNameTable::NameId) | Restituisce tutte le strutture [NameRecord](./namerecord/) il cui campo [NameId](./nameid/) è uguale al valore *nameId* passato. Se non vengono trovati record, verrà restituito un array vuoto. |
| [UpdateName](./updatename/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t, System::String) | Aggiorna il nome nei record relativi alla piattaforma specificata (combinazione di platformId e platformSpecificId), categoria (nameId) e lingua (languageId). |
| [UpdateNamesByNameId](./updatenamesbynameid/)(TtfNameTable::NameId, System::String) | Seleziona tutti i record relativi alla categoria di stringa logica, specificata dal parametro nameId, e aggiorna il campo name (dati stringa) in questi record. I campi relativi alla piattaforma (platformID, ID di codifica specifica della piattaforma) e alla lingua (Language ID) non sono influenzati da questo metodo. Solo i dati stringa del nome vengono sostituiti con un nuovo nome. Usa questo metodo con cautela, poiché sostituirà i nomi originali per tutte le piattaforme e le lingue correlate a nameId. Può generare conflitti nei casi in cui i nomi originali avevano valori diversi, poiché l'operazione di sostituzione cambia tutti questi valori con un unico nuovo valore. E questo nuovo valore può presentare un'incoerenza logica con alcune piattaforme e lingue. Questo metodo è utile nei casi in cui il nome originale ha una rappresentazione unica per tutte le piattaforme e lingue, ad esempio quando i dati stringa del nome sono in lingua inglese. |
## Vedi anche

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)
