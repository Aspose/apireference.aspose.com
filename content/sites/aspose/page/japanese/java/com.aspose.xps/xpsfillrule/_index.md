---
title: "XpsFillRule"
second_title: "Aspose.Page for Java API リファレンス"
description: "PathGeometry 要素の FillRule プロパティの有効な値。"
type: docs
weight: 59
url: /ja/java/com.aspose.xps/xpsfillrule/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum XpsFillRule extends Enum<XpsFillRule>
```

PathGeometry 要素の FillRule プロパティの有効な値。
## フィールド

| フィールド | 説明 |
| --- | --- |
| [EvenOdd](#EvenOdd) | この規則は、点から任意の方向に無限遠まで光線を引き、その光線が与えられた形状のセグメントと交差する回数を数えることで、キャンバス上の点の \\u201cinsideness\\u201d を決定します。 |
| [NonZero](#NonZero) | この規則は、点から任意の方向に無限遠まで光線を引き、形状のセグメントが光線と交差する位置を調べることで、キャンバス上の点の \\u201cinsideness\\u201d を決定します。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### EvenOdd {#EvenOdd}
```
public static final XpsFillRule EvenOdd
```


この規則は、点から任意の方向に無限遠まで光線を引き、その光線が与えられた形状のセグメントと交差する回数を数えることで、キャンバス上の点の \\u201cinsideness\\u201d を決定します。回数が奇数の場合、点は内部にあり、偶数の場合、点は外部にあります。

### NonZero {#NonZero}
```
public static final XpsFillRule NonZero
```


この規則は、点から任意の方向に無限遠まで光線を引き、形状のセグメントが光線と交差する位置を調べることで、キャンバス上の点の \\u201cinsideness\\u201d を決定します。カウントを0から開始し、セグメントが左から右へ光線を横切るたびに1を加え、右から左へ横切るたびに1を減算します。交差回数を数えた後、結果が0であれば点はパスの外部にあり、そうでなければ内部にあります。

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
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
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static XpsFillRule valueOf(String name)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 名前 | java.lang.String |  |

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule)
### values() {#values--}
```
public static XpsFillRule[] values()
```




**Returns:**
com.aspose.xps.XpsFillRule[]
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

