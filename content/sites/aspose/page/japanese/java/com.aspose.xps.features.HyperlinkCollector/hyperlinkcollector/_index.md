---
title: "HyperlinkCollector"
second_title: "Aspose.Page for Java API リファレンス"
description: "このクラスは、XPS ドキュメントの現在のページからハイパーリンク付き XPS 要素を収集します。"
type: docs
weight: 10
url: /ja/java/com.aspose.xps.features.hyperlinkcollector/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

このクラスは、XPS ドキュメントの現在のページからハイパーリンク付き XPS 要素を収集します。
## メソッド

| メソッド | 説明 |
| --- | --- |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | 特定のタイプのハイパーリンクを持つ XPS 要素を収集します。 |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | すべてのタイプのハイパーリンクを持つ XPS 要素を収集します。 |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### <T>collectHyperlinks(XpsDocument document, Class<T> cls) {#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--}
```
public static Collection<XpsHyperlinkElement> <T>collectHyperlinks(XpsDocument document, Class<T> cls)
```


特定のタイプのハイパーリンクを持つ XPS 要素を収集します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS ドキュメントです。 |
| cls | java.lang.Class<T> | 除外するハイパーリンク対象タイプに対応するクラスオブジェクトです。 |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - ハイパーリンクされた XPS 要素を含むコレクションです。
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


すべてのタイプのハイパーリンクを持つ XPS 要素を収集します。

**Parameters:**
| パラメータ | 型 | 説明 |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | XPS ドキュメントです。 |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - ハイパーリンクされた XPS 要素を含むコレクションです。
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

