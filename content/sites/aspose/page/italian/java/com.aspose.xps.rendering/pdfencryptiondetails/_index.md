---
title: "PdfEncryptionDetails"
second_title: "Aspose.Page per Java API Reference"
description: "Contiene i dettagli per una crittografia pdf."
type: docs
weight: 13
url: /it/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Contiene i dettagli per una crittografia pdf.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Inizializza una nuova istanza della classe  PdfEncryptionDetailsCore  . |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Restituisce la modalità di crittografia. |
| [getOwnerPassword()](#getOwnerPassword--) | Restituisce la password del proprietario. |
| [getPermissions()](#getPermissions--) | Restituisce le autorizzazioni. |
| [getUserPassword()](#getUserPassword--) | Restituisce la password dell'utente. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Imposta la modalità di crittografia. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Imposta la password del proprietario. |
| [setPermissions(int value)](#setPermissions-int-) | Imposta le autorizzazioni. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Imposta la password dell'utente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Inizializza una nuova istanza della classe  PdfEncryptionDetailsCore  .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| userPassword | java.lang.String | La password dell'utente. |
| ownerPassword | java.lang.String | La password del proprietario. |
| permissions | int | Le autorizzazioni. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | L'algoritmo di crittografia. |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getEncryptionAlgorithm() {#getEncryptionAlgorithm--}
```
public PdfEncryptionAlgorithm getEncryptionAlgorithm()
```


Restituisce la modalità di crittografia.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Restituisce la password del proprietario.

Aprire il documento con la password del proprietario corretta (supponendo che non sia la stessa della password dell'utente) consente l'accesso completo (proprietario) al documento. Questo accesso illimitato include la possibilità di modificare le password del documento\u2019s e le autorizzazioni di accesso.

**Returns:**
java.lang.String - La password del proprietario.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Restituisce le autorizzazioni.

**Returns:**
int - Le autorizzazioni.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Restituisce la password dell'utente.

Aprire il documento con la password utente corretta (o aprire un documento che non ha una password utente) consente di eseguire operazioni aggiuntive secondo le autorizzazioni di accesso utente specificate nel dizionario di crittografia del documento.

**Returns:**
java.lang.String - La password utente.
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




### setEncryptionAlgorithm(PdfEncryptionAlgorithm value) {#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public void setEncryptionAlgorithm(PdfEncryptionAlgorithm value)
```


Imposta la modalità di crittografia.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | L'algoritmo di crittografia. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Imposta la password del proprietario.

Aprire il documento con la password del proprietario corretta (supponendo che non sia la stessa della password dell'utente) consente l'accesso completo (proprietario) al documento. Questo accesso illimitato include la possibilità di modificare le password del documento\u2019s e le autorizzazioni di accesso.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.lang.String | La password del proprietario. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Imposta le autorizzazioni.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Le autorizzazioni. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Imposta la password dell'utente.

Aprire il documento con la password utente corretta (o aprire un documento che non ha una password utente) consente di eseguire operazioni aggiuntive secondo le autorizzazioni di accesso utente specificate nel dizionario di crittografia del documento.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.lang.String | La password dell'utente. |

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

