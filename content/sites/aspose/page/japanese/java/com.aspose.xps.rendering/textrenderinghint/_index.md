---
title: "TextRenderingHint"
second_title: "Aspose.Page for Java API リファレンス"
description: "テキスト描画の品質を指定します。"
type: docs
weight: 25
url: /ja/java/com.aspose.xps.rendering/textrenderinghint/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TextRenderingHint extends Enum<TextRenderingHint>
```

テキスト描画の品質を指定します。
## フィールド

| フィールド | 説明 |
| --- | --- |
| [AntiAlias](#AntiAlias) | 各文字はヒントなしでアンチエイリアスされたグリフビットマップを使用して描画されます。 |
| [AntiAliasGridFit](#AntiAliasGridFit) | 各文字はヒントありでアンチエイリアスされたグリフビットマップを使用して描画されます。 |
| [ClearTypeGridFit](#ClearTypeGridFit) | 各文字はヒントありでグリフのClearTypeビットマップを使用して描画されます。 |
| [SingleBitPerPixel](#SingleBitPerPixel) | 各文字はグリフビットマップを使用して描画されます。 |
| [SingleBitPerPixelGridFit](#SingleBitPerPixelGridFit) | 各文字はグリフビットマップを使用して描画されます。 |
| [SystemDefault](#SystemDefault) | 各文字はシステム既定のレンダリングヒントで、グリフビットマップを使用して描画されます。 |
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
### AntiAlias {#AntiAlias}
```
public static final TextRenderingHint AntiAlias
```


各文字はヒントなしでアンチエイリアスされたグリフビットマップを使用して描画されます。アンチエイリアスにより品質が向上します。ヒントがオフになっているため、ステム幅の違いが目立つことがあります。

### AntiAliasGridFit {#AntiAliasGridFit}
```
public static final TextRenderingHint AntiAliasGridFit
```


各文字はヒントありでアンチエイリアスされたグリフビットマップを使用して描画されます。アンチエイリアスにより品質が大幅に向上しますが、パフォーマンスコストが高くなります。

### ClearTypeGridFit {#ClearTypeGridFit}
```
public static final TextRenderingHint ClearTypeGridFit
```


各文字はヒントありでグリフのClearTypeビットマップを使用して描画されます。最高品質の設定です。ClearTypeフォント機能を活用するために使用されます。

### SingleBitPerPixel {#SingleBitPerPixel}
```
public static final TextRenderingHint SingleBitPerPixel
```


各文字はグリフビットマップを使用して描画されます。ヒントは使用されません。

### SingleBitPerPixelGridFit {#SingleBitPerPixelGridFit}
```
public static final TextRenderingHint SingleBitPerPixelGridFit
```


各文字はグリフビットマップを使用して描画されます。ヒントはステムや曲線上の文字外観を改善するために使用されます。

### SystemDefault {#SystemDefault}
```
public static final TextRenderingHint SystemDefault
```


各文字はシステム既定のレンダリングヒントで、グリフビットマップを使用して描画されます。テキストは、ユーザーがシステムで選択したフォントスムージング設定に従って描画されます。

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
public static TextRenderingHint valueOf(String name)
```




**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| 名前 | java.lang.String |  |

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint)
### values() {#values--}
```
public static TextRenderingHint[] values()
```




**Returns:**
com.aspose.xps.rendering.TextRenderingHint[]
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

