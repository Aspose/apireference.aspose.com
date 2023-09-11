---
title: Font.Font
second_title: Aspose.Drawing for .NET API Reference
description: Font constructor. Initializes a new instance of the Font class uses the specified existing Font and FontStyle enumeration
type: docs
weight: 10
url: /net/aspose.drawing/font/font/
---
## Font(Font, FontStyle) {#constructor}

Initializes a new instance of the [`Font`](../) class uses the specified existing Font and FontStyle enumeration..

```csharp
public Font(Font prototype, FontStyle newStyle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| prototype | Font | The existing Font from which to create the new Font. |
| newStyle | FontStyle | The FontStyle to apply to the new Font. Multiple values of the FontStyle enumeration can be combined with the OR operator. |

### See Also

* enum [FontStyle](../../fontstyle/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(FontFamily, float) {#constructor_1}

Initializes a new instance of the [`Font`](../) class.

```csharp
public Font(FontFamily family, float emSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| family | FontFamily | The FontFamily of the new Font. |
| emSize | Single | The em-size, in points, of the new font. |

### See Also

* class [FontFamily](../../fontfamily/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(FontFamily, float, FontStyle) {#constructor_2}

Initializes a new instance of the [`Font`](../) class using a specified size and style..

```csharp
public Font(FontFamily family, float emSize, FontStyle style)
```

| Parameter | Type | Description |
| --- | --- | --- |
| family | FontFamily | The FontFamily of the new Font. |
| emSize | Single | The em-size, in points, of the new font. |
| style | FontStyle | The FontStyle of the new font. |

### See Also

* class [FontFamily](../../fontfamily/)
* enum [FontStyle](../../fontstyle/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(FontFamily, float, FontStyle, GraphicsUnit) {#constructor_3}

Initializes a new instance of the [`Font`](../) class using a specified size, style, and unit.

```csharp
public Font(FontFamily family, float emSize, FontStyle style, GraphicsUnit unit)
```

| Parameter | Type | Description |
| --- | --- | --- |
| family | FontFamily | The FontFamily of the new Font. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| style | FontStyle | The FontStyle of the new font. |
| unit | GraphicsUnit | The GraphicsUnit of the new font. |

### See Also

* class [FontFamily](../../fontfamily/)
* enum [FontStyle](../../fontstyle/)
* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(FontFamily, float, FontStyle, GraphicsUnit, byte) {#constructor_4}

Initializes a new instance of the [`Font`](../) class using a specified size, style, unit, and character set..

```csharp
public Font(FontFamily family, float emSize, FontStyle style, GraphicsUnit unit, byte gdiCharSet)
```

| Parameter | Type | Description |
| --- | --- | --- |
| family | FontFamily | The FontFamily of the new Font. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| style | FontStyle | The FontStyle of the new font. |
| unit | GraphicsUnit | The GraphicsUnit of the new font. |
| gdiCharSet | Byte | GDI character set to use for the new font. |

### See Also

* class [FontFamily](../../fontfamily/)
* enum [FontStyle](../../fontstyle/)
* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) {#constructor_5}

Initializes a new instance of the [`Font`](../) class using a specified size, style, unit, and character set..

```csharp
public Font(FontFamily family, float emSize, FontStyle style, GraphicsUnit unit, byte gdiCharSet, 
    bool gdiVerticalFont)
```

| Parameter | Type | Description |
| --- | --- | --- |
| family | FontFamily | The FontFamily of the new Font. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| style | FontStyle | The FontStyle of the new font. |
| unit | GraphicsUnit | The GraphicsUnit of the new font. |
| gdiCharSet | Byte | GDI character set to use for the new font. |
| gdiVerticalFont | Boolean | A Boolean value indicating whether the new font is derived from a GDI vertical font. |

### See Also

* class [FontFamily](../../fontfamily/)
* enum [FontStyle](../../fontstyle/)
* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(FontFamily, float, GraphicsUnit) {#constructor_6}

Initializes a new instance of the [`Font`](../) class using a specified size and unit. Sets the style to Regular.

```csharp
public Font(FontFamily family, float emSize, GraphicsUnit unit)
```

| Parameter | Type | Description |
| --- | --- | --- |
| family | FontFamily | The FontFamily of the new Font. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| unit | GraphicsUnit | The GraphicsUnit of the new font. |

### See Also

* class [FontFamily](../../fontfamily/)
* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(string, float) {#constructor_7}

Initializes a new instance of the [`Font`](../) class using a specified size.

```csharp
public Font(string familyName, float emSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| familyName | String | A string representation of the FontFamily for the new Font. |
| emSize | Single | The em-size, in points, of the new font. |

### See Also

* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(string, float, FontStyle) {#constructor_8}

Initializes a new instance of the [`Font`](../) class using a specified size and style.

```csharp
public Font(string familyName, float emSize, FontStyle style)
```

| Parameter | Type | Description |
| --- | --- | --- |
| familyName | String | A string representation of the FontFamily for the new Font. |
| emSize | Single | The em-size, in points, of the new font. |
| style | FontStyle | The FontStyle of the new font. |

### See Also

* enum [FontStyle](../../fontstyle/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(string, float, FontStyle, GraphicsUnit) {#constructor_9}

Initializes a new instance of the [`Font`](../) class using a specified size, style, and unit.

```csharp
public Font(string familyName, float emSize, FontStyle style, GraphicsUnit unit)
```

| Parameter | Type | Description |
| --- | --- | --- |
| familyName | String | A string representation of the FontFamily for the new Font. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| style | FontStyle | The FontStyle of the new font. |
| unit | GraphicsUnit | The GraphicsUnit of the new font. |

### See Also

* enum [FontStyle](../../fontstyle/)
* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(string, float, FontStyle, GraphicsUnit, byte) {#constructor_10}

Initializes a new instance of the [`Font`](../) class using a specified size, style, unit, and character set.

```csharp
public Font(string familyName, float emSize, FontStyle style, GraphicsUnit unit, byte gdiCharSet)
```

| Parameter | Type | Description |
| --- | --- | --- |
| familyName | String | A string representation of the FontFamily for the new Font. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| style | FontStyle | The FontStyle of the new font. |
| unit | GraphicsUnit | The GraphicsUnit of the new font. |
| gdiCharSet | Byte | A Byte that specifies a GDI character set to use for this font. |

### See Also

* enum [FontStyle](../../fontstyle/)
* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(string, float, FontStyle, GraphicsUnit, byte, bool) {#constructor_11}

Initializes a new instance of the [`Font`](../) class using the specified size, style, unit, and character set.

```csharp
public Font(string familyName, float emSize, FontStyle style, GraphicsUnit unit, byte gdiCharSet, 
    bool gdiVerticalFont)
```

| Parameter | Type | Description |
| --- | --- | --- |
| familyName | String | A string representation of the FontFamily for the new Font. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| style | FontStyle | The FontStyle of the new font. |
| unit | GraphicsUnit | The GraphicsUnit of the new font. |
| gdiCharSet | Byte | A Byte that specifies a GDI character set to use for this font. |
| gdiVerticalFont | Boolean | A Boolean value indicating whether the new Font is derived from a GDI vertical font. |

### See Also

* enum [FontStyle](../../fontstyle/)
* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)

---

## Font(string, float, GraphicsUnit) {#constructor_12}

Initializes a new instance of the [`Font`](../) class using a specified size and unit. The style is set to Regular.

```csharp
public Font(string familyName, float emSize, GraphicsUnit unit)
```

| Parameter | Type | Description |
| --- | --- | --- |
| familyName | String | A string representation of the FontFamily for the new Font. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| unit | GraphicsUnit | The GraphicsUnit of the new font. |

### See Also

* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Drawing](../../font/)
* assembly [Aspose.Drawing.Common](../../../)


