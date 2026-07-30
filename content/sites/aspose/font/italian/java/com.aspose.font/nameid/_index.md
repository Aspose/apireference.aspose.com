---
title: "NameId"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta l'enumerazione NameId."
type: docs
weight: 67
url: /it/java/com.aspose.font/nameid/
---
**Inheritance:**
java.lang.Object
```
public final class NameId
```

Rappresenta l'enumerazione NameId.
## Campi

| Campo | Descrizione |
| --- | --- |
| [CompatibleFull](#CompatibleFull) | 18 Compatibile Full (solo Macintosh); su Macintosh, il nome del menu è costruito utilizzando la risorsa Font. |
| [CopyrightNotice](#CopyrightNotice) | 0 Avviso di copyright. |
| [DarkBackground](#DarkBackground) | Questo ID, se usato nell'Array di Etichette della Palette della tabella CPAL\\u2019s, specifica che la palette di colori corrispondente nella tabella CPAL è appropriata per l'uso con il font quando lo si visualizza su uno sfondo scuro come il nero. |
| [Description](#Description) | 10 Descrizione; descrizione del carattere tipografico. |
| [DesignerName](#DesignerName) | 9 Designer; nome del designer del carattere. |
| [FontFamily](#FontFamily) | 1 Famiglia di caratteri. |
| [FontSubfamily](#FontSubfamily) | 2 Sottofamiglia di caratteri. |
| [FullName](#FullName) | 4 Nome completo del carattere. |
| [LicenseDescription](#LicenseDescription) | 13 Descrizione della licenza; descrizione di come il carattere può essere utilizzato legalmente, o diversi scenari di esempio per l'uso con licenza. |
| [LicenseInfoUrl](#LicenseInfoUrl) | 14 URL delle informazioni sulla licenza, dove è possibile trovare ulteriori informazioni sulla licenza. |
| [LightBackground](#LightBackground) | Questo ID, se usato nell'array Palette Labels della tabella CPAL\\u2019s, specifica che la palette di colori corrispondente nella tabella CPAL è appropriata per l'uso con il carattere quando viene visualizzato su uno sfondo chiaro come il bianco. |
| [ManufacturerName](#ManufacturerName) | 8 Nome del produttore. |
| [PostScriptCID](#PostScriptCID) | La sua presenza in un carattere significa che il nameID 6 contiene un nome di carattere PostScript destinato ad essere usato con l'invocazione \\u201ccomposefont\\u201d per richiamare il carattere in un interprete PostScript. |
| [PostScriptName](#PostScriptName) | 6 Nome PostScript del carattere. |
| [PreferredFamily](#PreferredFamily) | 15 Riservato 16 Famiglia Preferita (solo Windows); In Windows, il nome della Famiglia è visualizzato nel menu Carattere; il nome della Sottofamiglia è presentato come nome dello Stile. |
| [PreferredSubfamily](#PreferredSubfamily) | 17 Sottofamiglia Preferita (solo Windows); In Windows, il nome della Famiglia è visualizzato nel menu Carattere; il nome della Sottofamiglia è presentato come nome dello Stile. |
| [SampleText](#SampleText) | 19 Testo di esempio. |
| [TrademarkNotice](#TrademarkNotice) | 7 Avviso di marchio. |
| [UniqueFontId](#UniqueFontId) | 3 Specifica Apple: identificazione unica della sottofamiglia. 3 Specifica MS: identificatore unico del carattere. |
| [UrlDesigner](#UrlDesigner) | 12 URL del designer del carattere (con protocollo, ad es., http://, ftp://) |
| [UrlVendor](#UrlVendor) | 11 URL del fornitore del carattere (con protocollo, ad es., http://, ftp://). |
| [VariationsPostScriptNamePrefix](#VariationsPostScriptNamePrefix) | Se presente in un carattere variabile, può essere usato come prefisso di famiglia nell'algoritmo di Generazione del Nome PostScript per i Font a Variazione. |
| [Version](#Version) | 5 Versione della tabella dei nomi. |
| [WwsFamilyName](#WwsFamilyName) | Usato per fornire un nome di famiglia conforme a WWS nel caso in cui le voci per gli ID 16 e 17 non siano conformi al modello WWS. |
| [WwsSubfamilyName](#WwsSubfamilyName) | Usato in combinazione con l'ID 21, questo ID fornisce un nome di sottofamiglia conforme a WWS (che riflette solo gli attributi di peso, larghezza e inclinazione) nel caso in cui le voci per gli ID 16 e 17 non siano conformi al modello WWS. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromId(int id)](#fromId-int-) | Crea un ID nome a partire da un valore intero. |
| [getClass()](#getClass--) |  |
| [getId()](#getId--) | Ottieni il valore intero. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### CompatibleFull {#CompatibleFull}
```
public static final NameId CompatibleFull
```


18 Compatibile Completo (solo Macintosh); Su Macintosh, il nome del menu è costruito usando la risorsa Font. Questo di solito corrisponde al Nome Completo. Se vuoi che il nome del carattere appaia diversamente dal Nome Completo, puoi inserire il Nome Compatibile Completo nell'ID 18. Questo nome non è usato dal Mac OS stesso, ma può essere usato dagli sviluppatori di applicazioni (ad es., Adobe).

### CopyrightNotice {#CopyrightNotice}
```
public static final NameId CopyrightNotice
```


0 Avviso di copyright.

### DarkBackground {#DarkBackground}
```
public static final NameId DarkBackground
```


Questo ID, se usato nell'Array di Etichette della Palette della tabella CPAL\\u2019s, specifica che la palette di colori corrispondente nella tabella CPAL è appropriata per l'uso con il font quando lo si visualizza su uno sfondo scuro come il nero.

### Description {#Description}
```
public static final NameId Description
```


10 Descrizione; descrizione del carattere. Può contenere informazioni di revisione, raccomandazioni d'uso, storia, funzionalità, ecc.

### DesignerName {#DesignerName}
```
public static final NameId DesignerName
```


9 Designer; nome del designer del carattere.

### FontFamily {#FontFamily}
```
public static final NameId FontFamily
```


1 Famiglia di caratteri. Questa stringa è il nome della famiglia di caratteri che l'utente vede sulle piattaforme Macintosh.

### FontSubfamily {#FontSubfamily}
```
public static final NameId FontSubfamily
```


2 Sottoclasse del Font. Questa stringa è la famiglia del Font che l'utente vede sulle piattaforme Macintosh.

### FullName {#FullName}
```
public static final NameId FullName
```


4 Nome completo del carattere.

### LicenseDescription {#LicenseDescription}
```
public static final NameId LicenseDescription
```


13 Descrizione della licenza; descrizione di come il Font può essere utilizzato legalmente, o diversi scenari di esempio per l'uso con licenza. Questo campo dovrebbe essere scritto in linguaggio semplice, non in gergo legale.

### LicenseInfoUrl {#LicenseInfoUrl}
```
public static final NameId LicenseInfoUrl
```


14 URL delle informazioni sulla licenza, dove è possibile trovare ulteriori informazioni sulla licenza.

### LightBackground {#LightBackground}
```
public static final NameId LightBackground
```


Questo ID, se usato nell'array Palette Labels della tabella CPAL\\u2019s, specifica che la palette di colori corrispondente nella tabella CPAL è appropriata per l'uso con il carattere quando viene visualizzato su uno sfondo chiaro come il bianco.

### ManufacturerName {#ManufacturerName}
```
public static final NameId ManufacturerName
```


8 Nome del produttore.

### PostScriptCID {#PostScriptCID}
```
public static final NameId PostScriptCID
```


La sua presenza in un carattere significa che il nameID 6 contiene un nome di carattere PostScript destinato ad essere usato con l'invocazione \\u201ccomposefont\\u201d per richiamare il carattere in un interprete PostScript.

### PostScriptName {#PostScriptName}
```
public static final NameId PostScriptName
```


6 Nome PostScript del Font. Nota: un Font può avere un solo nome PostScript e quel nome deve essere ASCII.

### PreferredFamily {#PreferredFamily}
```
public static final NameId PreferredFamily
```


15 Riservato 16 Famiglia Preferita (solo Windows); in Windows, il nome della Famiglia viene visualizzato nel menu Font; il nome della Sottoclasse viene presentato come nome dello Stile. Per ragioni storiche, le famiglie di Font hanno contenuto un massimo di quattro stili, ma i designer di font possono raggruppare più di quattro font in un'unica famiglia. Gli ID di Famiglia Preferita e Sottoclasse Preferita consentono ai designer di font di includere i raggruppamenti di famiglia/sottoclasse preferiti. Questi ID sono presenti solo se sono diversi dagli ID 1 e 2.

### PreferredSubfamily {#PreferredSubfamily}
```
public static final NameId PreferredSubfamily
```


17 Sottoclasse Preferita (solo Windows); in Windows, il nome della Famiglia viene visualizzato nel menu Font; il nome della Sottoclasse viene presentato come nome dello Stile. Per ragioni storiche, le famiglie di Font hanno contenuto un massimo di quattro stili, ma i designer di font possono raggruppare più di quattro font in un'unica famiglia. Gli ID di Famiglia Preferita e Sottoclasse Preferita consentono ai designer di font di includere i raggruppamenti di famiglia/sottoclasse preferiti. Questi ID sono presenti solo se sono diversi dagli ID 1 e 2.

### SampleText {#SampleText}
```
public static final NameId SampleText
```


19 Testo di esempio. Può essere il nome del Font, o qualsiasi altro testo che il designer ritiene il migliore per mostrare l'aspetto del font.

### TrademarkNotice {#TrademarkNotice}
```
public static final NameId TrademarkNotice
```


7 Avviso di marchio.

### UniqueFontId {#UniqueFontId}
```
public static final NameId UniqueFontId
```


3 Specifica Apple: identificazione unica della sottofamiglia. 3 Specifica MS: identificatore unico del carattere.

### UrlDesigner {#UrlDesigner}
```
public static final NameId UrlDesigner
```


12 URL del designer del carattere (con protocollo, ad es., http://, ftp://)

### UrlVendor {#UrlVendor}
```
public static final NameId UrlVendor
```


11 URL del fornitore del Font (con protocollo, ad es., http://, ftp://). Se un numero di serie univoco è incorporato nell'URL, può essere usato per registrare il Font.

### VariationsPostScriptNamePrefix {#VariationsPostScriptNamePrefix}
```
public static final NameId VariationsPostScriptNamePrefix
```


Se presente in un carattere variabile, può essere usato come prefisso di famiglia nell'algoritmo di Generazione del Nome PostScript per i Font a Variazione.

### Version {#Version}
```
public static final NameId Version
```


5 Versione della tabella dei nomi.

### WwsFamilyName {#WwsFamilyName}
```
public static final NameId WwsFamilyName
```


Usato per fornire un nome di famiglia conforme a WWS nel caso in cui le voci per gli ID 16 e 17 non siano conformi al modello WWS.

### WwsSubfamilyName {#WwsSubfamilyName}
```
public static final NameId WwsSubfamilyName
```


Usato in combinazione con l'ID 21, questo ID fornisce un nome di sottofamiglia conforme a WWS (che riflette solo gli attributi di peso, larghezza e inclinazione) nel caso in cui le voci per gli ID 16 e 17 non siano conformi al modello WWS.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fromId(int id) {#fromId-int-}
```
public static NameId fromId(int id)
```


Crea un ID nome a partire da un valore intero.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| id | int | Un valore intero. |

**Returns:**
[NameId](../../com.aspose.font/nameid) - The name id.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getId() {#getId--}
```
public int getId()
```


Ottieni il valore intero.

**Returns:**
int - Il valore intero.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

