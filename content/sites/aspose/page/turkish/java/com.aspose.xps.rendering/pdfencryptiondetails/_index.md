---
title: "PdfEncryptionDetails"
second_title: "Java için Aspose.Page API Referansı"
description: "PDF şifrelemesi için ayrıntıları içerir."
type: docs
weight: 13
url: /tr/java/com.aspose.xps.rendering/pdfencryptiondetails/
---
**Inheritance:**
java.lang.Object
```
public class PdfEncryptionDetails
```

PDF şifrelemesi için ayrıntıları içerir.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)](#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | PdfEncryptionDetailsCore sınıfının yeni bir örneğini başlatır. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getEncryptionAlgorithm()](#getEncryptionAlgorithm--) | Şifreleme modunu döndürür. |
| [getOwnerPassword()](#getOwnerPassword--) | Sahip şifresini döndürür. |
| [getPermissions()](#getPermissions--) | İzinleri döndürür. |
| [getUserPassword()](#getUserPassword--) | Kullanıcı şifresini döndürür. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setEncryptionAlgorithm(PdfEncryptionAlgorithm value)](#setEncryptionAlgorithm-com.aspose.xps.rendering.PdfEncryptionAlgorithm-) | Şifreleme modunu ayarlar. |
| [setOwnerPassword(String value)](#setOwnerPassword-java.lang.String-) | Sahip şifresini ayarlar. |
| [setPermissions(int value)](#setPermissions-int-) | İzinleri ayarlar. |
| [setUserPassword(String value)](#setUserPassword-java.lang.String-) | Kullanıcı şifresini ayarlar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm) {#PdfEncryptionDetails-java.lang.String-java.lang.String-int-com.aspose.xps.rendering.PdfEncryptionAlgorithm-}
```
public PdfEncryptionDetails(String userPassword, String ownerPassword, int permissions, PdfEncryptionAlgorithm encryptionAlgorithm)
```


PdfEncryptionDetailsCore sınıfının yeni bir örneğini başlatır.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| userPassword | java.lang.String | Kullanıcı şifresi. |
| ownerPassword | java.lang.String | Sahip şifresi. |
| izinler | int | İzinler. |
| encryptionAlgorithm | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Şifreleme algoritması. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametre | Tür | Açıklama |
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


Şifreleme modunu döndürür.

**Returns:**
[PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) - The encryption algorithm.
### getOwnerPassword() {#getOwnerPassword--}
```
public String getOwnerPassword()
```


Sahip şifresini döndürür.

Belgeyi doğru sahip şifresiyle (kullanıcı şifresiyle aynı olmadığını varsayarak) açmak, belgeye tam (sahip) erişim sağlar. Bu sınırsız erişim, belgenin\u2019s şifrelerini ve erişim izinlerini değiştirme yeteneğini içerir.

**Returns:**
java.lang.String - Sahip şifresi.
### getPermissions() {#getPermissions--}
```
public int getPermissions()
```


İzinleri döndürür.

**Returns:**
int - İzinler.
### getUserPassword() {#getUserPassword--}
```
public String getUserPassword()
```


Kullanıcı şifresini döndürür.

Belgeyi doğru kullanıcı şifresiyle (veya kullanıcı şifresi olmayan bir belgeyi açarak) açmak, belgenin\u2019s şifreleme sözlüğünde belirtilen kullanıcı erişim izinlerine göre ek işlemlerin gerçekleştirilmesine izin verir.

**Returns:**
java.lang.String - Kullanıcı şifresi.
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


Şifreleme modunu ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| value | [PdfEncryptionAlgorithm](../../com.aspose.xps.rendering/pdfencryptionalgorithm) | Şifreleme algoritması. |

### setOwnerPassword(String value) {#setOwnerPassword-java.lang.String-}
```
public void setOwnerPassword(String value)
```


Sahip şifresini ayarlar.

Belgeyi doğru sahip şifresiyle (kullanıcı şifresiyle aynı olmadığını varsayarak) açmak, belgeye tam (sahip) erişim sağlar. Bu sınırsız erişim, belgenin\u2019s şifrelerini ve erişim izinlerini değiştirme yeteneğini içerir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.lang.String | Sahip şifresi. |

### setPermissions(int value) {#setPermissions-int-}
```
public void setPermissions(int value)
```


İzinleri ayarlar.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | int | İzinler. |

### setUserPassword(String value) {#setUserPassword-java.lang.String-}
```
public void setUserPassword(String value)
```


Kullanıcı şifresini ayarlar.

Belgeyi doğru kullanıcı şifresiyle (veya kullanıcı şifresi olmayan bir belgeyi açarak) açmak, belgenin\u2019s şifreleme sözlüğünde belirtilen kullanıcı erişim izinlerine göre ek işlemlerin gerçekleştirilmesine izin verir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| değer | java.lang.String | Kullanıcı şifresi. |

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
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

