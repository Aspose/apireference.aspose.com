---
title: "PdfEncryptionDetails"
second_title: "Aspose.Page voor Java API-referentie"
description: "Bevat details voor een pdf-encryptie."
type: docs
weight: 13
url: /nl/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Bevat details voor een pdf-encryptie.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Initialiseert een nieuw exemplaar van de  PdfEncryptionDetailsCore  klasse. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Retourneert de encryptiemodus. |
| [getOwnerPassword()](#getOwnerPassword--) | Retourneert het eigenaarwachtwoord. |
| [getPermissions()](#getPermissions--) | Retourneert de permissies. |
| [getUserPassword()](#getUserPassword--) | Retourneert het gebruikerswachtwoord. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Stelt de encryptiemodus in. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Stelt het eigenaarwachtwoord in. |
| [setPermissions(int value)](#setPermissions-int-) | Stelt de permissies in. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Stelt het gebruikerswachtwoord in. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Initialiseert een nieuw exemplaar van de  PdfEncryptionDetailsCore  klasse.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| userPassword | java.lang.String | Het gebruikerswachtwoord. |
| ownerPassword | java.lang.String | Het eigenaarwachtwoord. |
| permissions | int | De permissies. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Het encryptie-algoritme. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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


Retourneert de encryptiemodus.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Retourneert het eigenaarwachtwoord.

Het openen van het document met het juiste eigenaarwachtwoord (ervan uitgaande dat het niet hetzelfde is als het gebruikerswachtwoord) geeft volledige (eigenaar) toegang tot het document. Deze onbeperkte toegang omvat de mogelijkheid om de wachtwoorden van het document\\u2019s te wijzigen en de toegangspermissies.

**Returns:**
java.lang.String - Het eigenaarwachtwoord.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Retourneert de permissies.

**Returns:**
int - De machtigingen.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Retourneert het gebruikerswachtwoord.

Het openen van het document met het juiste gebruikerswachtwoord (of het openen van een document dat geen gebruikerswachtwoord heeft) maakt extra bewerkingen mogelijk die worden uitgevoerd volgens de toegangsrechten van de gebruiker die zijn gespecificeerd in het document\u2019s encryptiewoordenboek.

**Returns:**
java.lang.String - Het gebruikerswachtwoord.
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


Stelt de encryptiemodus in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Het encryptie-algoritme. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Stelt het eigenaarwachtwoord in.

Het openen van het document met het juiste eigenaarwachtwoord (ervan uitgaande dat het niet hetzelfde is als het gebruikerswachtwoord) geeft volledige (eigenaar) toegang tot het document. Deze onbeperkte toegang omvat de mogelijkheid om de wachtwoorden van het document\\u2019s te wijzigen en de toegangspermissies.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.lang.String | Het eigenaarwachtwoord. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Stelt de permissies in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | int | De permissies. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Stelt het gebruikerswachtwoord in.

Het openen van het document met het juiste gebruikerswachtwoord (of het openen van een document dat geen gebruikerswachtwoord heeft) maakt extra bewerkingen mogelijk die worden uitgevoerd volgens de toegangsrechten van de gebruiker die zijn gespecificeerd in het document\u2019s encryptiewoordenboek.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waarde | java.lang.String | Het gebruikerswachtwoord. |

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

