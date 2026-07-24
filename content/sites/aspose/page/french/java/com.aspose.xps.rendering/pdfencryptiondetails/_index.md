---
title: "PdfEncryptionDetails"
second_title: "Référence API Aspose.Page pour Java"
description: "Contient les détails d'un chiffrement pdf."
type: docs
weight: 13
url: /fr/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Contient les détails d'un chiffrement pdf.
## Constructeurs

| Constructeur | Description |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Initialise une nouvelle instance de la classe  PdfEncryptionDetailsCore . |
## Méthodes

| Méthode | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Renvoie le mode de chiffrement. |
| [getOwnerPassword()](#getOwnerPassword--) | Renvoie le mot de passe du propriétaire. |
| [getPermissions()](#getPermissions--) | Renvoie les autorisations. |
| [getUserPassword()](#getUserPassword--) | Renvoie le mot de passe de l'utilisateur. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Définit le mode de chiffrement. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Définit le mot de passe du propriétaire. |
| [setPermissions(int value)](#setPermissions-int-) | Définit les autorisations. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Définit le mot de passe de l'utilisateur. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Initialise une nouvelle instance de la classe  PdfEncryptionDetailsCore .

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| userPassword | java.lang.String | Le mot de passe de l'utilisateur. |
| ownerPassword | java.lang.String | Le mot de passe du propriétaire. |
| permissions | int | Les autorisations. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | L'algorithme de chiffrement. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Paramètre | Type | Description |
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


Renvoie le mode de chiffrement.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Renvoie le mot de passe du propriétaire.

Ouvrir le document avec le mot de passe du propriétaire correct (en supposant qu'il ne soit pas identique au mot de passe de l'utilisateur) permet un accès complet (propriétaire) au document. Cet accès illimité inclut la possibilité de modifier les mots de passe du document et les autorisations d'accès.

**Returns:**
java.lang.String - Le mot de passe du propriétaire.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Renvoie les autorisations.

**Returns:**
int - Les autorisations.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Renvoie le mot de passe de l'utilisateur.

L'ouverture du document avec le mot de passe utilisateur correct (ou l'ouverture d'un document qui n'a pas de mot de passe utilisateur) permet d'exécuter des opérations supplémentaires conformément aux autorisations d'accès utilisateur spécifiées dans le dictionnaire de chiffrement du document.

**Returns:**
java.lang.String - Le mot de passe utilisateur.
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


Définit le mode de chiffrement.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | L'algorithme de chiffrement. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Définit le mot de passe du propriétaire.

Ouvrir le document avec le mot de passe du propriétaire correct (en supposant qu'il ne soit pas identique au mot de passe de l'utilisateur) permet un accès complet (propriétaire) au document. Cet accès illimité inclut la possibilité de modifier les mots de passe du document et les autorisations d'accès.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.lang.String | Le mot de passe du propriétaire. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Définit les autorisations.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | int | Les autorisations. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Définit le mot de passe de l'utilisateur.

L'ouverture du document avec le mot de passe utilisateur correct (ou l'ouverture d'un document qui n'a pas de mot de passe utilisateur) permet d'exécuter des opérations supplémentaires conformément aux autorisations d'accès utilisateur spécifiées dans le dictionnaire de chiffrement du document.

**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | java.lang.String | Le mot de passe de l'utilisateur. |

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
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Paramètre | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

