---
title: "ExternalFontCache"
second_title: "Aspose.Page for Java API リファレンス"
description: "このクラスを使用して、Device が受け入れる形式でフォントのカプセル化を取得します。"
type: docs
weight: 13
url: /ja/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

このクラスを使用して、Device が受け入れる形式でフォントのカプセル化を取得します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## フィールド

| フィールド | 説明 |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | デフォルトのフォントサイズです。 |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | デフォルトのフォントスタイルです。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | フォントファミリ名、デフォルトサイズ (1) およびデフォルトスタイル (PLAIN) で DrFont を取得します。 |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | フォントファミリ名、デフォルトサイズ (1) とスタイルで DrFont を取得します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | フォントファミリ名、サイズ、スタイルで DrFont を取得します。 |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | フォントファミリ名、サイズ、スタイル、フォント大文字で DrFont を取得します。 |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | フォントファミリ名、サイズ、スタイル、代替フォントファミリ名で DrFont を取得します。 |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | フォントファミリ名、サイズ、スタイル、フォント大文字、代替フォントファミリ名で DrFont を取得します。 |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | フォントファミリ名、スタイル、代替フォントファミリ名で TTFont を取得します。 |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | 追加のフォントフォルダーを指定します。 |
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


デフォルトのフォントサイズです。

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


デフォルトのフォントスタイルです。

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


フォントファミリ名、デフォルトサイズ (1) およびデフォルトスタイル (PLAIN) で DrFont を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| familyName | java.lang.String | フォントファミリ名です。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


フォントファミリ名、デフォルトサイズ (1) とスタイルで DrFont を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| familyName | java.lang.String | フォントファミリ名です。 |
| スタイル | int | フォントスタイル。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


フォントファミリ名、サイズ、スタイルで DrFont を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| familyName | java.lang.String | フォントファミリ名です。 |
| sizePoints | float | ポイント単位のフォントサイズ（1ポイントはインチの1/72です）。 |
| スタイル | int | フォントスタイル。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


フォントファミリ名、サイズ、スタイル、フォント大文字で DrFont を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| familyName | java.lang.String | フォントファミリ名です。 |
| sizePoints | float | ポイント単位のフォントサイズ（1ポイントはインチの1/72です）。 |
| スタイル | int | フォントスタイル。 |
| fontCapitals | int | フォントの大文字。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


フォントファミリ名、サイズ、スタイル、代替フォントファミリ名で DrFont を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| familyName | java.lang.String | フォントファミリ名です。 |
| sizePoints | float | ポイント単位のフォントサイズ（1ポイントはインチの1/72です）。 |
| スタイル | int | フォントスタイル。 |
| altFamilyName | java.lang.String | 代替フォントファミリ名。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


フォントファミリ名、サイズ、スタイル、フォント大文字、代替フォントファミリ名で DrFont を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| familyName | java.lang.String | フォントファミリ名です。 |
| sizePoints | float | ポイント単位のフォントサイズ（1ポイントはインチの1/72です）。 |
| スタイル | int | フォントスタイル。 |
| altFamilyName | java.lang.String | 代替フォントファミリ名。 |
| fontCapitals | int | フォントの大文字。 |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont。
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


フォントファミリ名、スタイル、代替フォントファミリ名で TTFont を取得します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| familyName | java.lang.String | フォントファミリ名です。 |
| スタイル | int | フォントスタイル。 |
| altFamilyName | java.lang.String | 代替フォントファミリ名。 |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont。
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


追加のフォントフォルダーを指定します。OS が使用するフォントフォルダーはデフォルトで ExternalFont Cache に使用されます。これらを定義する必要はありません、

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | 追加のフォントフォルダーの配列です。 |

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
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

