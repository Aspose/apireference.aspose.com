---
title: MeasureString
second_title: Aspose.Drawing for .NET API 参考
description: 用指定的值绘制时测量指定的字符串Font.
type: docs
weight: 620
url: /zh/net/system.drawing/graphics/measurestring/
---
## MeasureString(string, Font) {#measurestring}

用指定的值绘制时测量指定的字符串Font.

```csharp
public SizeF MeasureString(string text, Font font)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| text | String | 要测量的字符串。 |
| font | Font | Font定义字符串的文本格式。 |

### 返回值

该方法返回一个SizeF表示大小的结构， 以指定的单位表示PageUnit属性，字符串指定 由*text*与绘制的参数*font*范围。

### 也可以看看

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF) {#measurestring_4}

用指定的值绘制时测量指定的字符串Font.

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| text | String | 要测量的字符串。 |
| font | Font | Font定义字符串的文本格式。 |
| layoutArea | SizeF | SizeF指定文本的最大布局区域的结构。 |

### 返回值

该方法返回一个SizeF表示大小的结构， 以指定的单位表示PageUnit属性，字符串指定 由*text*与绘制的参数*font*范围。

### 也可以看看

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int) {#measurestring_1}

用指定的值绘制时测量指定的字符串Font.

```csharp
public SizeF MeasureString(string text, Font font, int width)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| text | String | 要测量的字符串。 |
| font | Font | Font定义字符串的文本格式。 |
| width | Int32 | 字符串的最大宽度（以像素为单位）。 |

### 返回值

该方法返回一个SizeF表示大小的结构， 以指定的单位表示PageUnit属性，字符串指定 由*text*与绘制的参数*font*范围。

### 也可以看看

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, PointF, StringFormat) {#measurestring_3}

用指定的值绘制时测量指定的字符串Font并使用指定的 formatted StringFormat.

```csharp
public SizeF MeasureString(string text, Font font, PointF origin, StringFormat stringFormat)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| text | String | 要测量的字符串。 |
| font | Font | Font定义字符串的文本格式。 |
| origin | PointF | PointF表示字符串左上角的结构。 |
| stringFormat | StringFormat | StringFormat表示字符串的格式信息，例如行距。 |

### 返回值

该方法返回一个SizeF表示大小的结构， 以指定的单位表示PageUnit属性，字符串指定 由*text*与绘制的参数*font*参数 和*stringFormat*范围。

### 也可以看看

* struct [SizeF](../../sizef)
* class [Font](../../font)
* struct [PointF](../../pointf)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, int, StringFormat) {#measurestring_2}

用指定的值绘制时测量指定的字符串Font并使用指定的 formatted StringFormat.

```csharp
public SizeF MeasureString(string text, Font font, int width, StringFormat format)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| text | String | 要测量的字符串。 |
| font | Font | Font定义字符串的文本格式。 |
| width | Int32 | 字符串的最大宽度。 |
| format | StringFormat | StringFormat表示字符串的格式信息， ，例如行距。 |

### 返回值

该方法返回一个SizeF表示大小的结构， 以指定的单位表示PageUnit属性， 中指定的字符串*text*与绘制的参数*font*parameter 和*format*范围。

### 也可以看看

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat) {#measurestring_5}

用指定的值绘制时测量指定的字符串Font并使用指定的 formatted StringFormat.

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| text | String | 要测量的字符串。 |
| font | Font | Font定义字符串的文本格式。 |
| layoutArea | SizeF | SizeF指定文本的最大布局区域的结构。 |
| stringFormat | StringFormat | StringFormat表示字符串的格式信息， ，例如行距。 |

### 返回值

该方法返回一个SizeF表示大小的结构， 以指定的单位表示PageUnit属性， 中指定的字符串*text*与绘制的参数*font*parameter 和*stringFormat*范围。

### 也可以看看

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

---

## MeasureString(string, Font, SizeF, StringFormat, out int, out int) {#measurestring_6}

用指定的值绘制时测量指定的字符串Font并使用指定的 formatted StringFormat.

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat, 
    out int charactersFitted, out int linesFilled)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| text | String | 要测量的字符串。 |
| font | Font | Font定义字符串的文本格式。 |
| layoutArea | SizeF | SizeF指定文本的最大布局区域的结构。 |
| stringFormat | StringFormat | StringFormat表示字符串的格式信息， ，例如行距。 |
| charactersFitted | Int32& | 字符串中的字符数。 |
| linesFilled | Int32& | 字符串中的文本行数。 |

### 返回值

该方法返回一个SizeF表示大小的结构， 以指定的单位表示PageUnit属性， 中指定的字符串*text*与绘制的参数*font*parameter 和*stringFormat*范围。

### 也可以看看

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* 命名空间 [System.Drawing](../../graphics)
* 部件 [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
