---
title: "ExternalFontCache"
second_title: "Aspose.Page용 Java API 참조"
description: "이 클래스를 사용하여 Device가 허용하는 형태로 폰트 캡슐화를 얻을 수 있습니다."
type: docs
weight: 13
url: /ko/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

이 클래스를 사용하여 Device가 허용하는 형태로 폰트 캡슐화를 얻을 수 있습니다.
## 생성자

| 생성자 | 설명 |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## 필드

| 필드 | 설명 |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | 기본 글꼴 크기. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | 기본 글꼴 스타일. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | DrFont을 글꼴 패밀리 이름, 기본 크기 (1) 및 기본 스타일 (PLAIN)으로 가져옵니다. |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | DrFont을 글꼴 패밀리 이름, 기본 크기 (1) 및 스타일로 가져옵니다. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | DrFont을 글꼴 패밀리 이름, 크기 및 스타일로 가져옵니다. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | DrFont을 글꼴 패밀리 이름, 크기, 스타일 및 대문자 형태로 가져옵니다. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | DrFont을 글꼴 패밀리 이름, 크기, 스타일 및 대체 글꼴 패밀리 이름으로 가져옵니다. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | DrFont을 글꼴 패밀리 이름, 크기, 스타일, 대문자 형태 및 대체 글꼴 패밀리 이름으로 가져옵니다. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | TTFont을 글꼴 패밀리 이름, 스타일 및 대체 글꼴 패밀리 이름으로 가져옵니다. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | 추가 폰트 폴더를 지정합니다. |
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


기본 글꼴 크기.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


기본 글꼴 스타일.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


DrFont을 글꼴 패밀리 이름, 기본 크기 (1) 및 기본 스타일 (PLAIN)으로 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| familyName | java.lang.String | 글꼴 패밀리 이름. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


DrFont을 글꼴 패밀리 이름, 기본 크기 (1) 및 스타일로 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| familyName | java.lang.String | 글꼴 패밀리 이름. |
| 스타일 | int | 글꼴 스타일. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


DrFont을 글꼴 패밀리 이름, 크기 및 스타일로 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| familyName | java.lang.String | 글꼴 패밀리 이름. |
| sizePoints | float | 포인트 단위의 글꼴 크기(1포인트는 인치의 1/72입니다). |
| 스타일 | int | 글꼴 스타일. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


DrFont을 글꼴 패밀리 이름, 크기, 스타일 및 대문자 형태로 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| familyName | java.lang.String | 글꼴 패밀리 이름. |
| sizePoints | float | 포인트 단위의 글꼴 크기(1포인트는 인치의 1/72입니다). |
| 스타일 | int | 글꼴 스타일. |
| fontCapitals | int | 글꼴 대문자. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


DrFont을 글꼴 패밀리 이름, 크기, 스타일 및 대체 글꼴 패밀리 이름으로 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| familyName | java.lang.String | 글꼴 패밀리 이름. |
| sizePoints | float | 포인트 단위의 글꼴 크기(1포인트는 인치의 1/72입니다). |
| 스타일 | int | 글꼴 스타일. |
| altFamilyName | java.lang.String | 대체 글꼴 패밀리 이름. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


DrFont을 글꼴 패밀리 이름, 크기, 스타일, 대문자 형태 및 대체 글꼴 패밀리 이름으로 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| familyName | java.lang.String | 글꼴 패밀리 이름. |
| sizePoints | float | 포인트 단위의 글꼴 크기(1포인트는 인치의 1/72입니다). |
| 스타일 | int | 글꼴 스타일. |
| altFamilyName | java.lang.String | 대체 글꼴 패밀리 이름. |
| fontCapitals | int | 글꼴 대문자. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


TTFont을 글꼴 패밀리 이름, 스타일 및 대체 글꼴 패밀리 이름으로 가져옵니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| familyName | java.lang.String | 글꼴 패밀리 이름. |
| 스타일 | int | 글꼴 스타일. |
| altFamilyName | java.lang.String | 대체 글꼴 패밀리 이름. |

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


추가 글꼴 폴더를 지정합니다. 운영 체제에서 사용하는 글꼴 폴더는 기본적으로 ExternalFont 캐시에서 사용됩니다. 이를 정의할 필요가 없습니다,

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | 추가 글꼴 폴더의 배열입니다. |

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
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

