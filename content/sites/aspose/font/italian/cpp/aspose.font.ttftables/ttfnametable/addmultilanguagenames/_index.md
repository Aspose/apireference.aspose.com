---
title: "Metodo Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames"
linktitle: "AddMultiLanguageNames"
second_title: "Aspose.Font per C++"
description: "Metodo Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames. Estrae tutte le stringhe multilingue dall'oggetto *mlNames* passato e crea la struttura NameRecord corrispondente per ogni stringa estratta utilizzando i parametri passati *platformId*, *platformSpecificId* e *nameId*. Il valore per il campo languageID è estratto dall'oggetto *mlNames*. Il nuovo record appena creato viene aggiunto alla tabella. Se viene trovato un record che coincide con quello appena creato per i campi platformID, platformSpecificID, nameID e langugeId, il nuovo record non verrà aggiunto e solo i dati della stringa verranno aggiornati per il record esistente in C++."
type: docs
weight: 200
url: /it/cpp/aspose.font.ttftables/ttfnametable/addmultilanguagenames/
---
## TtfNameTable::AddMultiLanguageNames method


Estrae tutte le stringhe multilingue dall'oggetto *mlNames* passato e crea la struttura [NameRecord](../namerecord/) corrispondente per ogni stringa estratta utilizzando i parametri passati *platformId*, *platformSpecificId* e *nameId*. Il valore per il campo languageID è estratto dall'oggetto *mlNames*. Il nuovo record appena creato viene aggiunto alla tabella. Se viene trovato un record che coincide con quello appena creato per i campi platformID, platformSpecificID, nameID e langugeId, il nuovo record non verrà aggiunto e solo i dati della stringa verranno aggiornati per il record esistente.

```cpp
void Aspose::Font::TtfTables::TtfNameTable::AddMultiLanguageNames(System::SharedPtr<MultiLanguageString> mlNames, TtfNameTable::PlatformId platformId, uint16_t platformSpecificId, TtfNameTable::NameId nameId)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| mlNames | System::SharedPtr\<MultiLanguageString\> | Stringa multilingue |
| platformId | TtfNameTable::PlatformId | Identificatore della piattaforma |
| platformSpecificId | uint16_t | Identificatore di codifica specifico della piattaforma |
| nameId | TtfNameTable::NameId | Identificatore del nome, categoria di stringa logica, specificata dall'enumerazione [NameId](../nameid/) |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MultiLanguageString](../../../aspose.font/multilanguagestring/)
* Enum [PlatformId](../platformid/)
* Enum [NameId](../nameid/)
* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
