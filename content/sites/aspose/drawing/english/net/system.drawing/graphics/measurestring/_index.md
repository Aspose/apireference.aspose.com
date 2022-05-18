---
title: MeasureString
second_title: Aspose.Drawing for .NET API Reference
description: 
type: docs
weight: 620
url: /net/system.drawing/graphics/measurestring/
---
## Graphics.MeasureString method (1 of 7)

Measures the specified string when drawn with the specified Font.

```csharp
public SizeF MeasureString(string text, Font font)
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | String to measure. |
| font | Font | Font that defines the text format of the string. |

## Return Value

This method returns a SizeF structure that represents the size, in the units specified by the PageUnit property, of the string specified by the *text* parameter as drawn with the *font* parameter.

### See Also

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.MeasureString method (2 of 7)

Measures the specified string when drawn with the specified Font.

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea)
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | String to measure. |
| font | Font | Font that defines the text format of the string. |
| layoutArea | SizeF | SizeF structure that specifies the maximum layout area for the text. |

## Return Value

This method returns a SizeF structure that represents the size, in the units specified by the PageUnit property, of the string specified by the *text* parameter as drawn with the *font* parameter.

### See Also

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.MeasureString method (3 of 7)

Measures the specified string when drawn with the specified Font.

```csharp
public SizeF MeasureString(string text, Font font, int width)
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | String to measure. |
| font | Font | Font that defines the text format of the string. |
| width | Int32 | Maximum width of the string in pixels. |

## Return Value

This method returns a SizeF structure that represents the size, in the units specified by the PageUnit property, of the string specified by the *text* parameter as drawn with the *font* parameter.

### See Also

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.MeasureString method (4 of 7)

Measures the specified string when drawn with the specified Font and formatted with the specified StringFormat.

```csharp
public SizeF MeasureString(string text, Font font, PointF origin, StringFormat stringFormat)
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | String to measure. |
| font | Font | Font defines the text format of the string. |
| origin | PointF | PointF structure that represents the upper-left corner of the string. |
| stringFormat | StringFormat | StringFormat that represents formatting information, such as line spacing, for the string. |

## Return Value

This method returns a SizeF structure that represents the size, in the units specified by the PageUnit property, of the string specified by the *text* parameter as drawn with the *font* parameter and the *stringFormat* parameter.

### See Also

* struct [SizeF](../../sizef)
* class [Font](../../font)
* struct [PointF](../../pointf)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.MeasureString method (5 of 7)

Measures the specified string when drawn with the specified Font and formatted with the specified StringFormat.

```csharp
public SizeF MeasureString(string text, Font font, int width, StringFormat format)
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | String to measure. |
| font | Font | Font that defines the text format of the string. |
| width | Int32 | Maximum width of the string. |
| format | StringFormat | StringFormat that represents formatting information, such as line spacing, for the string. |

## Return Value

This method returns a SizeF structure that represents the size, in the units specified by the PageUnit property, of the string specified in the *text* parameter as drawn with the *font* parameter and the *format* parameter.

### See Also

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.MeasureString method (6 of 7)

Measures the specified string when drawn with the specified Font and formatted with the specified StringFormat.

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat)
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | String to measure. |
| font | Font | Font defines the text format of the string. |
| layoutArea | SizeF | SizeF structure that specifies the maximum layout area for the text. |
| stringFormat | StringFormat | StringFormat that represents formatting information, such as line spacing, for the string. |

## Return Value

This method returns a SizeF structure that represents the size, in the units specified by the PageUnit property, of the string specified in the *text* parameter as drawn with the *font* parameter and the *stringFormat* parameter.

### See Also

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

---

## Graphics.MeasureString method (7 of 7)

Measures the specified string when drawn with the specified Font and formatted with the specified StringFormat.

```csharp
public SizeF MeasureString(string text, Font font, SizeF layoutArea, StringFormat stringFormat, 
    out int charactersFitted, out int linesFilled)
```

| Parameter | Type | Description |
| --- | --- | --- |
| text | String | String to measure. |
| font | Font | Font defines the text format of the string. |
| layoutArea | SizeF | SizeF structure that specifies the maximum layout area for the text. |
| stringFormat | StringFormat | StringFormat that represents formatting information, such as line spacing, for the string. |
| charactersFitted | Int32& | Number of characters in the string. |
| linesFilled | Int32& | Number of text lines in the string. |

## Return Value

This method returns a SizeF structure that represents the size, in the units specified by the PageUnit property, of the string specified in the *text* parameter as drawn with the *font* parameter and the *stringFormat* parameter.

### See Also

* struct [SizeF](../../sizef)
* class [Font](../../font)
* class [StringFormat](../../stringformat)
* class [Graphics](../../graphics)
* namespace [System.Drawing](../../graphics)
* assembly [Aspose.Drawing](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
