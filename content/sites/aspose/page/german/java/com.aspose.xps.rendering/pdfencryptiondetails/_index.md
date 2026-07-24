---
title: "PdfEncryptionDetails"
second_title: "Aspose.Page for Java API-Referenz"
description: "Enthält Details für eine PDF-Verschlüsselung."
type: docs
weight: 13
url: /de/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Enthält Details für eine PDF-Verschlüsselung.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Initialisiert eine neue Instanz der Klasse  PdfEncryptionDetailsCore  . |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Gibt den Verschlüsselungsmodus zurück. |
| [getOwnerPassword()](#getOwnerPassword--) | Gibt das Besitzerpasswort zurück. |
| [getPermissions()](#getPermissions--) | Gibt die Berechtigungen zurück. |
| [getUserPassword()](#getUserPassword--) | Gibt das Benutzerpasswort zurück. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Setzt den Verschlüsselungsmodus. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Setzt das Besitzerpasswort. |
| [setPermissions(int value)](#setPermissions-int-) | Setzt die Berechtigungen. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Setzt das Benutzerpasswort. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Initialisiert eine neue Instanz der Klasse  PdfEncryptionDetailsCore  .

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| userPassword | java.lang.String | Das Benutzerpasswort. |
| ownerPassword | java.lang.String | Das Besitzerpasswort. |
| permissions | int | Die Berechtigungen. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Der Verschlüsselungsalgorithmus. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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


Gibt den Verschlüsselungsmodus zurück.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Gibt das Besitzerpasswort zurück.

Das Öffnen des Dokuments mit dem richtigen Besitzerpasswort (unter der Annahme, dass es nicht dasselbe wie das Benutzerpasswort ist) ermöglicht vollen (Besitzer‑)Zugriff auf das Dokument. Dieser uneingeschränkte Zugriff beinhaltet die Möglichkeit, die Passwörter und Zugriffsberechtigungen des document\\u2019s zu ändern.

**Returns:**
java.lang.String - Das Besitzerpasswort.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Gibt die Berechtigungen zurück.

**Returns:**
int - Die Berechtigungen.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Gibt das Benutzerpasswort zurück.

Das Öffnen des Dokuments mit dem korrekten Benutzerpasswort (oder das Öffnen eines Dokuments, das kein Benutzerpasswort hat) ermöglicht zusätzliche Vorgänge, die gemäß den im Verschlüsselungswörterbuch des Dokuments angegebenen Benutzerzugriffsberechtigungen ausgeführt werden können.

**Returns:**
java.lang.String - Das Benutzerpasswort.
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


Setzt den Verschlüsselungsmodus.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Der Verschlüsselungsalgorithmus. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Setzt das Besitzerpasswort.

Das Öffnen des Dokuments mit dem richtigen Besitzerpasswort (unter der Annahme, dass es nicht dasselbe wie das Benutzerpasswort ist) ermöglicht vollen (Besitzer‑)Zugriff auf das Dokument. Dieser uneingeschränkte Zugriff beinhaltet die Möglichkeit, die Passwörter und Zugriffsberechtigungen des document\\u2019s zu ändern.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Das Besitzerpasswort. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Setzt die Berechtigungen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Die Berechtigungen. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Setzt das Benutzerpasswort.

Das Öffnen des Dokuments mit dem korrekten Benutzerpasswort (oder das Öffnen eines Dokuments, das kein Benutzerpasswort hat) ermöglicht zusätzliche Vorgänge, die gemäß den im Verschlüsselungswörterbuch des Dokuments angegebenen Benutzerzugriffsberechtigungen ausgeführt werden können.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | java.lang.String | Das Benutzerpasswort. |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

