---
title: "Aspose::Font::TtfTables::TtfNameTable::NameId enum"
linktitle: "NameId"
second_title: "Aspose.Font per C++"
description: "Enum Aspose::Font::TtfTables::TtfNameTable::NameId. Rappresenta NameId in C++."
type: docs
weight: 1600
url: /it/cpp/aspose.font.ttftables/ttfnametable/nameid/
---
## NameId enum


Rappresenta [NameId](./).

```cpp
enum class NameId : uint16_t
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| CopyrightNotice | 0 | 0 Avviso di copyright. |
| FontFamily | 1 | 1 [Font](../../../aspose.font/font/) Famiglia. Questa stringa è il nome della famiglia [Font](../../../aspose.font/font/) che l'utente vede sulle piattaforme Macintosh. |
| FontSubfamily | 2 | 2 [Font](../../../aspose.font/font/) Sottofamiglia. Questa stringa è la sottofamiglia [Font](../../../aspose.font/font/) che l'utente vede sulle piattaforme Macintosh. |
| UniqueFontId | 3 | 3 Identificazione unica della sottofamiglia (specifica Apple). 3 Identificatore unico [Font](../../../aspose.font/font/) (specifica MS). |
| FullName | 4 | 4 Nome completo del [Font](../../../aspose.font/font/). |
| Versione | 5 | 5 Versione della tabella dei nomi. |
| PostScriptName | 6 | 6 Nome PostScript del [Font](../../../aspose.font/font/). Nota: Un [Font](../../../aspose.font/font/) può avere un solo nome PostScript e tale nome deve essere ASCII. |
| TrademarkNotice | 7 | 7 Avviso di marchio. |
| ManufacturerName | 8 | 8 Nome del produttore. |
| DesignerName | 9 | 9 Designer; nome del designer del carattere tipografico. |
| Descrizione | 10 | 10 Description; descrizione del carattere tipografico. Può contenere informazioni di revisione, raccomandazioni d'uso, storia, caratteristiche, ecc. |
| UrlVendor | 11 | 11 URL del fornitore del [Font](../../../aspose.font/font/) (con protocollo, ad es., [http://](http://), [ftp://](ftp://)). Se un numero di serie unico è incorporato nell'URL, può essere usato per registrare il [Font](../../../aspose.font/font/). |
| UrlDesigner | 12 | 12 URL del designer del [Font](../../../aspose.font/font/) (con protocollo, ad es., [http://](http://), [ftp://](ftp://)) |
| LicenseDescription | 13 | 13 descrizione della [License](../../../aspose.font/license/); descrizione di come il [Font](../../../aspose.font/font/) può essere usato legalmente, o diversi scenari di esempio per l'uso con licenza. Questo campo dovrebbe essere scritto in linguaggio semplice, non in termini legali. |
| LicenseInfoUrl | 14 | 14 URL delle informazioni della [License](../../../aspose.font/license/), dove è possibile trovare ulteriori informazioni sulla licenza. |
| PreferredFamily | 16 | 15 Reserved 16 Preferred Family (Windows only); In Windows, il nome della Family è visualizzato nel menu del [Font](../../../aspose.font/font/) ; il nome della Subfamily è presentato come nome dello Style. Per ragioni storiche, le famiglie di [Font] hanno contenuto un massimo di quattro stili, ma i designer di [Font] possono raggruppare più di quattro caratteri in una singola famiglia. Gli ID Preferred Family e Preferred Subfamily consentono ai designer di [Font] di includere i raggruppamenti di famiglia/subfamily preferiti. Questi ID sono presenti solo se diversi dagli ID 1 e 2. |
| PreferredSubfamily | 17 | 17 Preferred Subfamily (Windows only); In Windows, il nome della Family è visualizzato nel menu del [Font](../../../aspose.font/font/) ; il nome della Subfamily è presentato come nome dello Style. Per ragioni storiche, le famiglie di [Font] hanno contenuto un massimo di quattro stili, ma i designer di [Font] possono raggruppare più di quattro caratteri in una singola famiglia. Gli ID Preferred Family e Preferred Subfamily consentono ai designer di [Font] di includere i raggruppamenti di famiglia/subfamily preferiti. Questi ID sono presenti solo se diversi dagli ID 1 e 2. |
| CompatibleFull | 18 | 18 Compatible Full (Macintosh only); Su Macintosh, il nome del menu è costruito usando la risorsa del [Font](../../../aspose.font/font/). Questo di solito corrisponde al Full Name. Se vuoi che il nome del [Font](../../../aspose.font/font/) appaia diverso dal Full Name, puoi inserire il Compatible Full Name nell'ID 18. Questo nome non è usato dal Mac OS stesso, ma può essere usato dagli sviluppatori di applicazioni (ad es., Adobe). |
| SampleText | 19 | 19 Testo di esempio. Questo può essere il nome del [Font](../../../aspose.font/font/), o qualsiasi altro testo che il designer ritiene sia il miglior esempio per mostrare come appare il [Font](../../../aspose.font/font/). |
| PostScriptCID | 20 | La sua presenza in un font indica che il nameID 6 contiene un nome di font PostScript destinato ad essere usato con l'invocazione “composefont” per attivare il font in un interprete PostScript. |
| WwsFamilyName | 21 | Usato per fornire un nome di famiglia conforme a WWS nel caso in cui le voci per gli ID 16 e 17 non siano conformi al modello WWS. |
| WwsSubfamilyName | 22 | Usato in combinazione con l'ID 21, questo ID fornisce un nome di sottoclasse conforme a WWS (che riflette solo gli attributi di peso, larghezza e inclinazione) nel caso in cui le voci per gli ID 16 e 17 non siano conformi al modello WWS. |
| LightBackground | 23 | Questo ID, se usato nell'array Palette Labels della tabella CPAL, specifica che la palette di colori corrispondente nella tabella CPAL è appropriata per l'uso con il font quando viene visualizzato su uno sfondo chiaro come il bianco. |
| DarkBackground | 24 | Questo ID, se usato nell'array Palette Labels della tabella CPAL, specifica che la palette di colori corrispondente nella tabella CPAL è appropriata per l'uso con il font quando viene visualizzato su uno sfondo scuro come il nero. |
| VariationsPostScriptNamePrefix | 25 | Se presente in un font variabile, può essere usato come prefisso di famiglia nella generazione del nome PostScript per l'algoritmo Variation Fonts. |

## Vedi anche

* Class [TtfNameTable](../)
* Namespace [Aspose::Font::TtfTables](../../)
* Library [Aspose.Font for C++](../../../)
