---
title: TtfNameTable
second_title: Aspose.Font per Riferimento API .NET
description: Rappresenta la tabella nome del file Font TTF.
type: docs
weight: 900
url: /it/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

Rappresenta la tabella "nome" del file Font TTF.

```csharp
public class TtfNameTable : TtfTableBase
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset) { get; } | Ottiene l'offset dall'inizio di sfnt. |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables) { get; } | Riferimento al repository di tabelle TTF. |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag) { get; } | Ottiene il tag tabella. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames)(MultiLanguageString, PlatformId, ushort, NameId) | Estrae tutte le stringhe multilingue da passate*mlNames* l'oggetto e crea la struttura NameRecord corrispondente per ogni stringa estratta utilizzando i parametri passati*platformId* ,*platformSpecificId* e*nameId* . Viene estratto il valore per il campo languageID da*mlNames* oggetto. Il nuovo record appena creato viene aggiunto alla tabella. Se viene trovato il record che coincide con quello appena creato dai campi platformID, platformSpecificID, nameID e langugeId , il nuovo record creato non verrà aggiunto e solo i dati della stringa verranno aggiornati per il record esistente. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname)(NameId, PlatformId, int, int, string) | Aggiunge la voce alla tabella. La categoria di dati stringa da aggiungere è specificata da*name* parametro. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords)(PlatformId, ushort) | Elimina tutti i record relativi alla piattaforma specificata |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_1)(PlatformId, ushort, NameId) | Elimina tutti i record relativi ai parametri passati |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_2)(PlatformId, ushort, NameId, ushort) | Elimina i record relativi ai parametri specificati |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid)(NameId) | Elimina tutti i record relativi al parametro nameId passato |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords)() | Restituisce tutto[`NameRecord`](../ttfnametable.namerecord) strutture dalla tabella |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid)(NameId) | Restituisce un nome per nomeId. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_1)(NameId, PlatformId) | Restituisce un nome tramite nameId utilizzando l'identificatore di piattaforma passato. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | Restituisce un nome come oggetto di tipo[`MultiLanguageString`](../../aspose.font/multilanguagestring) . Il metodo raccoglie tutte le strutture NameRecord che coincidono con i parametri passati nameId, platformId e platformSpecificId e quindi crea l'oggetto risultante in base a questo elenco di strutture. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid)(NameId) | Restituisce un nome per nomeId se trovato, null altrimenti |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid)(NameId) | Restituisce tutto[`NameRecord`](../ttfnametable.namerecord) strutture il cui campo NameId è uguale a da passare*nameId* valore. Se non vengono trovati record, verrà restituito un array vuoto. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename)(PlatformId, ushort, NameId, ushort, string) | Aggiorna il nome nei record relativi alla piattaforma specificata (combinazione di platformId e platformSpecificId), categoria (nameId) e lingua (languageId). |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid)(NameId, string) | Seleziona tutti i record relativi alla categoria della stringa logica, specificata dal parametro nameId e aggiorna il campo del nome (dati stringa) in questi record. I campi relativi alla piattaforma (platformID, Platform-specific encoding ID) e alla lingua (Language ID) non sono interessati da questo metodo. Solo i dati della stringa del nome vengono sostituiti con un nuovo nome. Utilizzare questo metodo con cautela, poiché sostituirà i nomi originali per tutte le piattaforme e le lingue, correlato a nameId. Può creare conflitti per i casi in cui i nomi originali avevano valori diversi, causando l'operazione di sostituzione che modifica tutti questi valori con uno nuovo singolo. E questo nuovo valore potrebbe avere un'incoerenza logica con alcune piattaforme e linguaggi. Questo metodo è utile nei casi in cui il nome originale ha una rappresentazione singola per tutte le piattaforme e tutte le lingue, ad esempio , quando i dati della stringa del nome sono in lingua inglese. |

## Altri membri

| Nome | Descrizione |
| --- | --- |
| enum [MacLanguageId](ttfnametable.maclanguageid) | Enumerazione dell'ID della lingua della piattaforma Macintosh. |
| enum [MacPlatformSpecificId](ttfnametable.macplatformspecificid) | Rappresenta l'enumerazione PlatformSpecificId della piattaforma Macintosh. |
| enum [MSLanguageId](ttfnametable.mslanguageid) | Enumerazione dell'ID lingua della piattaforma Microsoft. |
| enum [MSPlatformSpecificId](ttfnametable.msplatformspecificid) | Rappresenta l'enumerazione PlatformSpecificId della piattaforma Microsoft. |
| enum [NameId](ttfnametable.nameid) | Rappresenta NameId. |
| class [NameRecord](ttfnametable.namerecord) | Rappresenta la struttura NameRecord della tabella 'name' |
| enum [PlatformId](ttfnametable.platformid) | Rappresenta l'enumerazione PlatformId. |
| enum [UnicodePlatformSpecificId](ttfnametable.unicodeplatformspecificid) | Rappresenta l'enumerazione specifica della piattaforma unicode. |

### Guarda anche

* class [TtfTableBase](../ttftablebase)
* spazio dei nomi [Aspose.Font.TtfTables](../../aspose.font.ttftables)
* assemblea [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->
