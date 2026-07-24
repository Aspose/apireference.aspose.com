---
title: "StringResult"
second_title: "Aspose.Page for Java API リファレンス"
description: "文字列の形式で操作結果を表します。"
type: docs
weight: 19
url: /ja/java/com.aspose.page.plugins/stringresult/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IOperationResult](../../com.aspose.page.plugins/ioperationresult)
```
public final class StringResult implements IOperationResult
```

文字列の形式で操作結果を表します。
## コンストラクタ

| コンストラクタ | 説明 |
| --- | --- |
| [StringResult(String result)](#StringResult-java.lang.String-) | 文字列で新しい StringResult インスタンスを初期化します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getData()](#getData--) | 生データを取得します。 |
| [getText()](#getText--) | 結果の文字列表現を返します。 |
| [hashCode()](#hashCode--) |  |
| [isByteArray()](#isByteArray--) | 結果がバイト配列かどうかを示します。 |
| [isFile()](#isFile--) | 結果が出力ファイルへのパスかどうかを示します。 |
| [isStream()](#isStream--) | 結果が出力ファイルへのパスかどうかを示します。 |
| [isString()](#isString--) | 結果が文字列かどうかを示します。 |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toFile()](#toFile--) | 結果をファイルに変換しようとします。 |
| [toStream()](#toStream--) | 結果をストリームオブジェクトに変換しようとします。 |
| [toString()](#toString--) | 結果を文字列に変換しようとします。 |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StringResult(String result) {#StringResult-java.lang.String-}
```
public StringResult(String result)
```


文字列で新しい StringResult インスタンスを初期化します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 結果 | java.lang.String | 結果を表す文字列 |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getData() {#getData--}
```
public final Object getData()
```


生データを取得します。

**Returns:**
java.lang.Object - 出力データを表すオブジェクト。
### getText() {#getText--}
```
public final String getText()
```


結果の文字列表現を返します。

**Returns:**
java.lang.String
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isByteArray() {#isByteArray--}
```
public final boolean isByteArray()
```


結果がバイト配列かどうかを示します。

**Returns:**
boolean - 結果がバイト配列の場合は true、そうでない場合は false。
### isFile() {#isFile--}
```
public final boolean isFile()
```


結果が出力ファイルへのパスかどうかを示します。

**Returns:**
boolean - 結果がファイルの場合は true、そうでない場合は false。
### isStream() {#isStream--}
```
public final boolean isStream()
```


結果が出力ファイルへのパスかどうかを示します。

**Returns:**
boolean - 結果がストリームオブジェクトの場合は true、そうでない場合は false。
### isString() {#isString--}
```
public final boolean isString()
```


結果が文字列かどうかを示します。

**Returns:**
boolean - 結果が文字列の場合は true、そうでない場合は false。
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toFile() {#toFile--}
```
public final String toFile()
```


結果をファイルに変換しようとします。

**Returns:**
java.lang.String - 結果がファイルの場合の出力ファイルへのパスを表す文字列、そうでない場合は null。
### toStream() {#toStream--}
```
public final OutputStream toStream()
```


結果をストリームオブジェクトに変換しようとします。

**Returns:**
java.io.OutputStream - 結果がストリームの場合の出力データを表すストリームオブジェクト、そうでない場合は null。
### toString() {#toString--}
```
public String toString()
```


結果を文字列に変換しようとします。

**Returns:**
java.lang.String - 結果が文字列の場合はテキスト内容を表す文字列です。それ以外の場合は base.ToString() を返します。
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

