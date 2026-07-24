---
title: "PdfEncryptionDetails"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Contiene detalles de un cifrado PDF."
type: docs
weight: 13
url: /es/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Contiene detalles de un cifrado PDF.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Inicializa una nueva instancia de la clase  PdfEncryptionDetailsCore  . |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Devuelve el modo de cifrado. |
| [getOwnerPassword()](#getOwnerPassword--) | Devuelve la contraseña del propietario. |
| [getPermissions()](#getPermissions--) | Devuelve los permisos. |
| [getUserPassword()](#getUserPassword--) | Devuelve la contraseña del usuario. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Establece el modo de cifrado. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Establece la contraseña del propietario. |
| [setPermissions(int value)](#setPermissions-int-) | Establece los permisos. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Establece la contraseña del usuario. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Inicializa una nueva instancia de la clase  PdfEncryptionDetailsCore  .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| userPassword | java.lang.String | La contraseña del usuario. |
| ownerPassword | java.lang.String | La contraseña del propietario. |
| permissions | int | Los permisos. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | El algoritmo de cifrado. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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


Devuelve el modo de cifrado.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Devuelve la contraseña del propietario.

Abrir el documento con la contraseña del propietario correcta (asumiendo que no sea la misma que la contraseña del usuario) permite un acceso completo (de propietario) al documento. Este acceso ilimitado incluye la capacidad de cambiar las contraseñas del documento y los permisos de acceso.

**Returns:**
java.lang.String - La contraseña del propietario.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Devuelve los permisos.

**Returns:**
int - Los permisos.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Devuelve la contraseña del usuario.

Abrir el documento con la contraseña del usuario correcta (o abrir un documento que no tenga contraseña de usuario) permite que se realicen operaciones adicionales de acuerdo con los permisos de acceso de usuario especificados en el diccionario de cifrado del documento.

**Returns:**
java.lang.String - La contraseña del usuario.
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


Establece el modo de cifrado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | El algoritmo de cifrado. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Establece la contraseña del propietario.

Abrir el documento con la contraseña del propietario correcta (asumiendo que no sea la misma que la contraseña del usuario) permite un acceso completo (de propietario) al documento. Este acceso ilimitado incluye la capacidad de cambiar las contraseñas del documento y los permisos de acceso.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.lang.String | La contraseña del propietario. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Establece los permisos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | Los permisos. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Establece la contraseña del usuario.

Abrir el documento con la contraseña del usuario correcta (o abrir un documento que no tenga contraseña de usuario) permite que se realicen operaciones adicionales de acuerdo con los permisos de acceso de usuario especificados en el diccionario de cifrado del documento.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.lang.String | La contraseña del usuario. |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

