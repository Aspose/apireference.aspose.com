---
title: "PdfEncryptionDetails"
second_title: "Aspose.Page för Java API-referens"
description: "Innehåller detaljer för en PDF‑kryptering."
type: docs
weight: 13
url: /sv/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Innehåller detaljer för en PDF‑kryptering.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Initierar en ny instans av klassen  PdfEncryptionDetailsCore . |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Returnerar krypteringsläget. |
| [getOwnerPassword()](#getOwnerPassword--) | Returnerar ägarlösenordet. |
| [getPermissions()](#getPermissions--) | Returnerar behörigheterna. |
| [getUserPassword()](#getUserPassword--) | Returnerar användarlösenordet. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Ställer in krypteringsläget. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Ställer in ägarlösenordet. |
| [setPermissions(int value)](#setPermissions-int-) | Ställer in behörigheterna. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Ställer in användarlösenordet. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Initierar en ny instans av klassen  PdfEncryptionDetailsCore .

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| userPassword | java.lang.String | Användarlösenordet. |
| ownerPassword | java.lang.String | Ägarlösenordet. |
| permissions | int | Behörigheterna. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Krypteringsalgoritmen. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Returnerar krypteringsläget.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Returnerar ägarlösenordet.

Att öppna dokumentet med rätt ägarlösenord (förutsatt att det inte är samma som användarlösenordet) ger full (ägare) åtkomst till dokumentet. Denna obegränsade åtkomst inkluderar möjligheten att ändra dokument\u2019s lösenord och åtkomstbehörigheter.

**Returns:**
java.lang.String - Ägarlösenordet.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Returnerar behörigheterna.

**Returns:**
int - Behörigheterna.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Returnerar användarlösenordet.

Att öppna dokumentet med rätt användarlösenord (eller att öppna ett dokument som inte har ett användarlösenord) möjliggör ytterligare operationer som kan utföras enligt de användaråtkomstbehörigheter som anges i dokumentets krypteringsordbok.

**Returns:**
java.lang.String - Användarlösenordet.
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


Ställer in krypteringsläget.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Krypteringsalgoritmen. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Ställer in ägarlösenordet.

Att öppna dokumentet med rätt ägarlösenord (förutsatt att det inte är samma som användarlösenordet) ger full (ägare) åtkomst till dokumentet. Denna obegränsade åtkomst inkluderar möjligheten att ändra dokument\u2019s lösenord och åtkomstbehörigheter.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.lang.String | Ägarlösenordet. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Ställer in behörigheterna.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | int | Behörigheterna. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Ställer in användarlösenordet.

Att öppna dokumentet med rätt användarlösenord (eller att öppna ett dokument som inte har ett användarlösenord) möjliggör ytterligare operationer som kan utföras enligt de användaråtkomstbehörigheter som anges i dokumentets krypteringsordbok.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| value | java.lang.String | Användarlösenordet. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

