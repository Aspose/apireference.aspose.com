---
title: "Enum TtfNameTableNameId"
second_title: "Riferimento API di Aspose.Font per .NET"
description: "Aspose.Font.TtfNameTableNameId enum. Specifica NameId"
type: docs
weight: 120
url: /it/nodejs-cpp/enumerations/ttfnametablenameid/
---
## TtfNameTableNameId enumeration

Specifica NameId.

```csharp
 enum TtfNameTableNameId
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
|  | CopyrightNotice | `0` | Avviso di copyright. |
|  | FontFamily | `1` | Famiglia Font. Questa stringa è il nome della famiglia del Font che l'utente vede sulle piattaforme Macintosh. |
|  | FontSubfamily | `2` | Sottofamiglia Font. Questa stringa è la famiglia del Font che l'utente vede sulle piattaforme Macintosh. |
|  | UniqueFontId | `3` | Identificazione unica della sottofamiglia (specifica Apple). 3 Identificatore unico del Font (specifica MS). |
|  | FullName | `4` | Nome completo del Font. |
|  | Version | `5` | Versione della tabella dei nomi. |
|  | PostScriptName | `6` | Nome PostScript del Font. Nota: un Font può avere un solo nome PostScript e tale nome deve essere ASCII. |
|  | TrademarkNotice | `7` | Avviso di marchio. |
|  | ManufacturerName | `8` | Nome del produttore. |
|  | DesignerName | `9` | Designer; nome del designer del carattere. |
|  | Description | `10` | Descrizione; descrizione del carattere. Può contenere informazioni di revisione, raccomandazioni d'uso, storia, funzionalità, ecc. |
|  | UrlVendor | `11` | URL del fornitore del Font (con protocollo, ad es., http://, ftp://). Se un numero di serie unico è incorporato nell'URL, può essere usato per registrare il Font. |
|  | UrlDesigner | `12` | URL del designer del Font (con protocollo, ad es., http://, ftp://) |
|  | LicenseDescription | `13` | Descrizione della licenza; descrizione di come il Font può essere usato legalmente, o diversi scenari di esempio per l'uso con licenza. Questo campo dovrebbe essere scritto in linguaggio semplice, non in gergo legale. |
|  | LicenseInfoUrl | `14` | URL delle informazioni sulla licenza, dove è possibile trovare ulteriori informazioni sulla licenza. |
|  | PreferredFamily | `16` | `15` Riservato `16` Famiglia Preferita (solo Windows); In Windows, il nome Famiglia è visualizzato nel menu Font; il nome Sottofamiglia è presentato come nome Stile. Per ragioni storiche, le famiglie di Font hanno contenuto un massimo di quattro stili, ma i designer di Font possono raggruppare più di quattro font in una singola famiglia. Gli ID di Famiglia Preferita e Sottofamiglia Preferita consentono ai designer di Font di includere i raggruppamenti di famiglia/sottofamiglia preferiti. Questi ID sono presenti solo se sono diversi dagli ID 1 e 2. |
|  | PreferredSubfamily | `17` | Sottofamiglia Preferita (solo Windows); In Windows, il nome Famiglia è visualizzato nel menu Font; il nome Sottofamiglia è presentato come nome Stile. Per ragioni storiche, le famiglie di Font hanno contenuto un massimo di quattro stili, ma i designer di Font possono raggruppare più di quattro font in una singola famiglia. Gli ID di Famiglia Preferita e Sottofamiglia Preferita consentono ai designer di Font di includere i raggruppamenti di famiglia/sottofamiglia preferiti. Questi ID sono presenti solo se sono diversi dagli ID 1 e 2. |
|  | CompatibleFull | `18` | Compatibile Completo (solo Macintosh); Su Macintosh, il nome del menu è costruito usando la risorsa Font. Questo di solito corrisponde al Nome Completo. Se desideri che il nome del Font appaia diversamente dal Nome Completo, puoi inserire il Nome Compatibile Completo nell'ID 18. Questo nome non è usato dal Mac OS stesso, ma può essere usato dagli sviluppatori di applicazioni (ad es., Adobe). |
|  | SampleText | `19` | Testo di esempio. Può essere il nome del Font, o qualsiasi altro testo che il designer ritiene sia il miglior esempio per mostrare l'aspetto del Font. |
|  | PostScriptCID | `20` | La sua presenza in un font indica che il nameID 6 contiene un nome font PostScript destinato ad essere usato con l'invocazione "composefont" per richiamare il font in un interprete PostScript. |
|  | WwsFamilyName | `21` | Usato per fornire un nome di famiglia conforme al modello WWS nel caso in cui le voci per gli ID 16 e 17 non siano conformi al modello WWS. |
|  | WwsSubfamilyName | `22` | Usato in combinazione con l'ID 21, questo ID fornisce un nome di sottofamiglia conforme al modello WWS (che riflette solo gli attributi di peso, larghezza e inclinazione) nel caso in cui le voci per gli ID 16 e 17 non siano conformi al modello WWS. |
|  | LightBackground | `23` | Questo ID, se usato nell'Array delle Etichette della Palette della tabella CPAL, specifica che la palette di colori corrispondente nella tabella CPAL è appropriata per l'uso con il font quando viene visualizzato su uno sfondo chiaro come il bianco. |
|  | DarkBackground | `24` | Questo ID, se usato nell'Array delle Etichette della Palette della tabella CPAL, specifica che la palette di colori corrispondente nella tabella CPAL è appropriata per l'uso con il font quando viene visualizzato su uno sfondo scuro come il nero. |
|  | VariationsPostScriptNamePrefix | `25` | Se presente in un font variabile, può essere usato come prefisso di famiglia nella generazione del nome PostScript per l'algoritmo dei Font a Variazione. |

