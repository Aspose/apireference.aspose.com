---
title: "Lisans"
second_title: "Java için Aspose.Page API Referansı"
description: "Bileşeni lisanslamak için yöntemler sağlar."
type: docs
weight: 14
url: /tr/java/com.aspose.page/license/
---
**Inheritance:**
java.lang.Object
```
public class License
```

Bileşeni lisanslamak için yöntemler sağlar.

Bu örnekte, bileşeni içeren klasörde, çağıran derlemeyi içeren klasörde, giriş derlemesinin klasöründe ve ardından çağıran derlemenin gömülü kaynaklarında MyLicense.lic adlı bir lisans dosyası bulunmaya çalışılacaktır.

License license = new License();
license.setLicense("MyLicense.lic");
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [License()](#License--) | Bu sınıfın yeni bir örneğini başlatır. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [isInternalFIPSSecurity()](#isInternalFIPSSecurity--) | Varsayılan olarak varsayılan jdk güvenliğini kullanıyoruz. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setInternalFIPSSecurity(boolean internalFIPSSecurity)](#setInternalFIPSSecurity-boolean-) | Varsayılan olarak varsayılan jre güvenliğini kullanıyoruz. |
| [setLicense(InputStream stream)](#setLicense-java.io.InputStream-) | Bileşeni lisanslar. |
| [setLicense(String licenseName)](#setLicense-java.lang.String-) | Bileşeni lisanslar. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### License() {#License--}
```
public License()
```


Bu sınıfın yeni bir örneğini başlatır.

Bu örnekte, bileşeni içeren klasörde, çağıran derlemeyi içeren klasörde, giriş derlemesinin klasöründe ve ardından çağıran derlemenin gömülü kaynaklarında MyLicense.lic adlı bir lisans dosyası bulunmaya çalışılacaktır.

License license = new License();
license.setLicense("MyLicense.lic");

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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isInternalFIPSSecurity() {#isInternalFIPSSecurity--}
```
public static boolean isInternalFIPSSecurity()
```


Varsayılan olarak varsayılan jdk güvenliğini kullanıyoruz. Varsayılan değer == false. Bazı durumlarda özelleştirilmiş java ortamı gerekli algoritmaları destekleyemeyebilir, bu yüzden dahili yerleşik FIPS güvenliğini kullanmayı önerebiliriz.

**Returns:**
boolean - boolean değeri
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setInternalFIPSSecurity(boolean internalFIPSSecurity) {#setInternalFIPSSecurity-boolean-}
```
public static void setInternalFIPSSecurity(boolean internalFIPSSecurity)
```


Varsayılan olarak varsayılan jre güvenliğini kullanıyoruz. Varsayılan değer == false. Bazı durumlarda özelleştirilmiş java ortamı gerekli algoritmaları destekleyemeyebilir, bu yüzden dahili yerleşik FIPS güvenliğini kullanmayı önerebiliriz.

Bir de dikkat: JVM SecureRandom algoritmasına göre bazı işletim sistemlerinde /dev/random, sonuç döndürülmeden önce ana makinede belirli bir miktarda \\u201cgürültü\\u201d üretilmesini bekler. Oracle\\u2019s JVM içinde rastgele sayı üretimi için kullanılan kütüphane, UNIX platformları için varsayılan olarak /dev/random'a dayanır. /dev/random daha güvenli olsa da, varsayılan JVM yapılandırması gecikmelere neden oluyorsa /dev/urandom kullanılması önerilir veya /dev/random için entropi üreten aygıtlar eklenmelidir.

Aşağıdaki java seçeneği gecikmeleri önlemeye yardımcı olabilir ve securerandom.source ayarını geçersiz kılabilir. -Djava.security.egd=file:/dev/./urandom

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| internalFIPSSecurity | boolean | boolean değer |

### setLicense(InputStream stream) {#setLicense-java.io.InputStream-}
```
public void setLicense(InputStream stream)
```


Bileşeni lisanslar.

Lisansı içeren bir akış.

Bu yöntemi bir akıştan lisans yüklemek için kullanın.

License license = new License();
license.setLicense(myStream);

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | java.io.InputStream | license Akışı |

### setLicense(String licenseName) {#setLicense-java.lang.String-}
```
public void setLicense(String licenseName)
```


Bileşeni lisanslar.

Lisansı aşağıdaki konumlarda bulmaya çalışır:

1. Açık yol.

2. Bileşen jar dosyasının klasörü.

Bu örnekte, bileşeni içeren klasörde, çağıran derlemeyi içeren klasörde, giriş derlemesinin klasöründe ve ardından çağıran derlemenin gömülü kaynaklarında MyLicense.lic adlı bir lisans dosyası bulunmaya çalışılacaktır.

License license = new License();
license.setLicense("MyLicense.lic");

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| licenseName | java.lang.String | Tam veya kısa bir dosya adı ya da gömülü kaynağın adı olabilir. Değerlendirme moduna geçmek için boş bir dize kullanın. |

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

