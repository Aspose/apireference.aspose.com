---
title: "Metered"
second_title: "Java için Aspose.Page API Referansı"
description: "Sayaçlı anahtarı ayarlamak için yöntemler sağlar."
type: docs
weight: 15
url: /tr/java/com.aspose.page/metered/
---
**Inheritance:**
java.lang.Object
```
public final class Metered
```

Sayaçlı anahtarı ayarlamak için yöntemler sağlar.

--------------------

Bu örnekte, ölçülen public ve private anahtarları ayarlamaya çalışılacaktır.

```
The component jar file:
  
 	Metered matered = new Metered();
 	matered.setMeteredKey("PublicKey", "PrivateKey");
```
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [Metered()](#Metered--) | Bu sınıfın yeni bir örneğini başlatır. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [clearMeteredLicense()](#clearMeteredLicense--) | Ölçülen lisansı temizler |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [flush()](#flush--) | Sunucudaki sayaç verilerini temizler. |
| [getClass()](#getClass--) |  |
| [getConsumptionCredit()](#getConsumptionCredit--) | Tüketim kredisini alır |
| [getConsumptionQuantity()](#getConsumptionQuantity--) | Tüketim dosya boyutunu alır |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMeteredKey(String publicKey, String privateKey)](#setMeteredKey-java.lang.String-java.lang.String-) | Ölçülen genel ve özel anahtarı ayarlar |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Metered() {#Metered--}
```
public Metered()
```


Bu sınıfın yeni bir örneğini başlatır.

### clearMeteredLicense() {#clearMeteredLicense--}
```
public static void clearMeteredLicense()
```


Ölçülen lisansı temizler

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
### flush() {#flush--}
```
public static void flush()
```


Sunucudaki sayım verilerini temizler. Yalnızca hata ayıklama amaçları için kullanılır.

### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getConsumptionCredit() {#getConsumptionCredit--}
```
public static double getConsumptionCredit()
```


Tüketim kredisini alır

**Returns:**
double - tüketim miktarı
### getConsumptionQuantity() {#getConsumptionQuantity--}
```
public static double getConsumptionQuantity()
```


Tüketim dosya boyutunu alır

**Returns:**
double - tüketim miktarı
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




### setMeteredKey(String publicKey, String privateKey) {#setMeteredKey-java.lang.String-java.lang.String-}
```
public void setMeteredKey(String publicKey, String privateKey)
```


Ölçülen genel ve özel anahtarı ayarlar

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| publicKey | java.lang.String | genel anahtar |
| privateKey | java.lang.String | özel anahtar |

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

