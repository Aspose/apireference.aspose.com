---
title: "ExternalFontCache"
second_title: "Java için Aspose.Page API Referansı"
description: "Bu sınıfı, Device tarafından kabul edilen bir biçimde font kapsülleme elde etmek için kullanın."
type: docs
weight: 13
url: /tr/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Bu sınıfı, Device tarafından kabul edilen bir biçimde font kapsülleme elde etmek için kullanın.
## Yapıcılar

| Yapıcı | Açıklama |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Varsayılan yazı tipi boyutu. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Varsayılan yazı tipi stili. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | DrFont'u yazı tipi ailesi adı, varsayılan boyut (1) ve varsayılan stil (PLAIN) ile getirir. |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | DrFont'u yazı tipi ailesi adı, varsayılan boyut (1) ve stil ile getirir. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | DrFont'u yazı tipi ailesi adı, boyut ve stil ile getirir. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | DrFont'u yazı tipi ailesi adı, boyut, stil ve yazı tipi büyük harfleri ile getirir. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | DrFont'u yazı tipi ailesi adı, boyut, stil ve alternatif yazı tipi ailesi adı ile getirir. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | DrFont'u yazı tipi ailesi adı, boyut, stil, yazı tipi büyük harfleri ve alternatif yazı tipi ailesi adı ile getirir. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | TTFont'u yazı tipi ailesi adı, stil ve alternatif yazı tipi ailesi adı ile getirir. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Ek yazı tipi klasörlerini belirtir. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final float DEFAULT_SIZE
```


Varsayılan yazı tipi boyutu.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Varsayılan yazı tipi stili.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


DrFont'u yazı tipi ailesi adı, varsayılan boyut (1) ve varsayılan stil (PLAIN) ile getirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| familyName | java.lang.String | Yazı tipi ailesi adı. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


DrFont'u yazı tipi ailesi adı, varsayılan boyut (1) ve stil ile getirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| familyName | java.lang.String | Yazı tipi ailesi adı. |
| stil | int | Yazı tipi stili. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
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
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


DrFont'u yazı tipi ailesi adı, boyut ve stil ile getirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| familyName | java.lang.String | Yazı tipi ailesi adı. |
| sizePoints | float | Yazı tipi boyutu puan cinsinden (bir puan, inçin 1/72'sidir). |
| stil | int | Yazı tipi stili. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


DrFont'u yazı tipi ailesi adı, boyut, stil ve yazı tipi büyük harfleri ile getirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| familyName | java.lang.String | Yazı tipi ailesi adı. |
| sizePoints | float | Yazı tipi boyutu puan cinsinden (bir puan, inçin 1/72'sidir). |
| stil | int | Yazı tipi stili. |
| fontCapitals | int | Yazı tipi büyük harfleri. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


DrFont'u yazı tipi ailesi adı, boyut, stil ve alternatif yazı tipi ailesi adı ile getirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| familyName | java.lang.String | Yazı tipi ailesi adı. |
| sizePoints | float | Yazı tipi boyutu puan cinsinden (bir puan, inçin 1/72'sidir). |
| stil | int | Yazı tipi stili. |
| altFamilyName | java.lang.String | Alternatif yazı tipi ailesi adı. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


DrFont'u yazı tipi ailesi adı, boyut, stil, yazı tipi büyük harfleri ve alternatif yazı tipi ailesi adı ile getirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| familyName | java.lang.String | Yazı tipi ailesi adı. |
| sizePoints | float | Yazı tipi boyutu puan cinsinden (bir puan, inçin 1/72'sidir). |
| stil | int | Yazı tipi stili. |
| altFamilyName | java.lang.String | Alternatif yazı tipi ailesi adı. |
| fontCapitals | int | Yazı tipi büyük harfleri. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


TTFont'u yazı tipi ailesi adı, stil ve alternatif yazı tipi ailesi adı ile getirir.

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| familyName | java.lang.String | Yazı tipi ailesi adı. |
| stil | int | Yazı tipi stili. |
| altFamilyName | java.lang.String | Alternatif yazı tipi ailesi adı. |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont.
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
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


Ek font klasörlerini belirtir. İşletim sistemi tarafından kullanılan font klasörleri varsayılan olarak ExternalFont Cache tarafından da kullanılır. Bunları tanımlamaya gerek yok,

**Parameters:**
| Parametre | Tür | Açıklama |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | Ek font klasörlerinin bir dizisi. |

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

