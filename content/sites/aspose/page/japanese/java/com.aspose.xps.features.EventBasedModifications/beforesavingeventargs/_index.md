---
title: "BeforeSavingEventArgs"
second_title: "Aspose.Page for Java API リファレンス"
description: "さまざまな保存前イベントの引数用基底クラスを定義します。"
type: docs
weight: 11
url: /ja/java/com.aspose.xps.features.eventbasedmodifications/beforesavingeventargs/
---
**Inheritance:**
java.lang.Object
```
public class BeforeSavingEventArgs<T>
```

さまざまな保存前イベントの引数用基底クラスを定義します。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAbsolutePageNumber()](#getAbsolutePageNumber--) | XPS パッケージ内のすべてのドキュメントにわたる現在の絶対ページ番号を返します。 |
| [getClass()](#getClass--) |  |
| [getDocumentNumber()](#getDocumentNumber--) | XPS パッケージ内の現在のドキュメント番号を返します。 |
| [getElementAPI()](#getElementAPI--) | 保存されようとしている要素の変更 API を返します。 |
| [getOutputPageNumber()](#getOutputPageNumber--) | 現在の出力番号を返します。 |
| [getRelativePageNumber()](#getRelativePageNumber--) | XPS パッケージ内の現在のドキュメントに対する現在のページ番号を返します。 |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getAbsolutePageNumber() {#getAbsolutePageNumber--}
```
public int getAbsolutePageNumber()
```


XPS パッケージ内のすべてのドキュメントにわたる現在の絶対ページ番号を返します。

**Returns:**
int - XPS パッケージ内のすべてのドキュメントにわたる現在の絶対ページ番号です。
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDocumentNumber() {#getDocumentNumber--}
```
public int getDocumentNumber()
```


XPS パッケージ内の現在のドキュメント番号を返します。

**Returns:**
int - XPS パッケージ内の現在のドキュメント番号です。
### getElementAPI() {#getElementAPI--}
```
public T getElementAPI()
```


保存されようとしている要素の変更 API を返します。

**Returns:**
T - 保存されようとしている要素の変更 API です。
### getOutputPageNumber() {#getOutputPageNumber--}
```
public int getOutputPageNumber()
```


現在の出力番号を返します。**AbsolutePageNumber** と **PageNumbers** の保存オプションが指定されている場合は異なります。

**Returns:**
int - 現在の出力番号です。
### getRelativePageNumber() {#getRelativePageNumber--}
```
public int getRelativePageNumber()
```


XPS パッケージ内の現在のドキュメントに対する現在のページ番号を返します。

**Returns:**
int - XPS パッケージ内の現在のドキュメントに対する現在のページ番号です。
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

