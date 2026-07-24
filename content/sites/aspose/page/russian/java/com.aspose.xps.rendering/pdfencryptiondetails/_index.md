---
title: "PdfEncryptionDetails"
second_title: "Справочник API Aspose.Page для Java"
description: "Содержит детали шифрования PDF."
type: docs
weight: 13
url: /ru/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

Содержит детали шифрования PDF.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Инициализирует новый экземпляр класса  PdfEncryptionDetailsCore . |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Возвращает режим шифрования. |
| [getOwnerPassword()](#getOwnerPassword--) | Возвращает пароль владельца. |
| [getPermissions()](#getPermissions--) | Возвращает разрешения. |
| [getUserPassword()](#getUserPassword--) | Возвращает пароль пользователя. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Устанавливает режим шифрования. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Устанавливает пароль владельца. |
| [setPermissions(int value)](#setPermissions-int-) | Устанавливает разрешения. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Устанавливает пароль пользователя. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


Инициализирует новый экземпляр класса  PdfEncryptionDetailsCore .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| userPassword | java.lang.String | Пароль пользователя. |
| ownerPassword | java.lang.String | Пароль владельца. |
| permissions | int | Разрешения. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Алгоритм шифрования. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
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


Возвращает режим шифрования.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Возвращает пароль владельца.

Открытие документа с правильным паролем владельца (при условии, что он отличается от пароля пользователя) предоставляет полный (владельческий) доступ к документу. Этот неограниченный доступ включает возможность изменять пароли документа и разрешения доступа.

**Returns:**
java.lang.String - Пароль владельца.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


Возвращает разрешения.

**Returns:**
int - Разрешения.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Возвращает пароль пользователя.

Открытие документа с правильным паролем пользователя (или открытие документа, который не имеет пароля пользователя) позволяет выполнять дополнительные операции в соответствии с разрешениями доступа пользователя, указанными в словаре шифрования документа\u2019s.

**Returns:**
java.lang.String - Пароль пользователя.
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


Устанавливает режим шифрования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Алгоритм шифрования. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Устанавливает пароль владельца.

Открытие документа с правильным паролем владельца (при условии, что он отличается от пароля пользователя) предоставляет полный (владельческий) доступ к документу. Этот неограниченный доступ включает возможность изменять пароли документа и разрешения доступа.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Пароль владельца. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


Устанавливает разрешения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Разрешения. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Устанавливает пароль пользователя.

Открытие документа с правильным паролем пользователя (или открытие документа, который не имеет пароля пользователя) позволяет выполнять дополнительные операции в соответствии с разрешениями доступа пользователя, указанными в словаре шифрования документа\u2019s.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.lang.String | Пароль пользователя. |

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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

