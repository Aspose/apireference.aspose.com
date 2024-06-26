---
title: Font.Font
second_title: Aspose.Imaging for .NET API Reference
description: Font constructor. Initializes a new Font that uses the specified existing Font and FontStyle enumeration
type: docs
weight: 10
url: /net/aspose.imaging/font/font/
---
## Font(Font, FontStyle) {#constructor}

Initializes a new [`Font`](../) that uses the specified existing [`Font`](../) and [`FontStyle`](../../fontstyle/) enumeration.

```csharp
public Font(Font prototype, FontStyle newStyle)
```

| Parameter | Type | Description |
| --- | --- | --- |
| prototype | Font | The existing [`Font`](../) from which to create the new [`Font`](../). |
| newStyle | FontStyle | The [`FontStyle`](../../fontstyle/) to apply to the new [`Font`](../). Multiple values of the [`FontStyle`](../../fontstyle/) enumeration can be combined with the OR operator. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *prototype* is null. |

### See Also

* enum [FontStyle](../../fontstyle/)
* class [Font](../)
* namespace [Aspose.Imaging](../../font/)
* assembly [Aspose.Imaging](../../../)

---

## Font(string, float) {#constructor_1}

Initializes a new [`Font`](../) using a specified size. The character set is set to Default, the graphics unit to Point, the font style to Regular.

```csharp
public Font(string fontName, float emSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fontName | String | A string representation of the [`Font`](../) name. |
| emSize | Single | The em-size, in points, of the new font. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | *emSize* is less than or equal to 0, evaluates to infinity or is not a valid number. |
| ArgumentNullException | *fontName* is null. |

### See Also

* class [Font](../)
* namespace [Aspose.Imaging](../../font/)
* assembly [Aspose.Imaging](../../../)

---

## Font(string, float, FontStyle) {#constructor_2}

Initializes a new [`Font`](../) using a specified size and style. The character set is set to Default, the graphics unit to Point.

```csharp
public Font(string fontName, float emSize, FontStyle style)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fontName | String | A string representation of the [`Font`](../) name. |
| emSize | Single | The em-size, in points, of the new font. |
| style | FontStyle | The [`FontStyle`](../../fontstyle/) of the new font. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | *emSize* is less than or equal to 0, evaluates to infinity or is not a valid number. |
| ArgumentNullException | *fontName* is null. |

### See Also

* enum [FontStyle](../../fontstyle/)
* class [Font](../)
* namespace [Aspose.Imaging](../../font/)
* assembly [Aspose.Imaging](../../../)

---

## Font(string, float, GraphicsUnit) {#constructor_5}

Initializes a new [`Font`](../) using a specified size and unit. The character set is set to Default, the style is set to Regular.

```csharp
public Font(string fontName, float emSize, GraphicsUnit unit)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fontName | String | A string representation of the [`Font`](../) name. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| unit | GraphicsUnit | The [`GraphicsUnit`](../../graphicsunit/) of the new font. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | *emSize* is less than or equal to 0, evaluates to infinity or is not a valid number. |
| ArgumentNullException | *fontName* is null. |

### See Also

* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Imaging](../../font/)
* assembly [Aspose.Imaging](../../../)

---

## Font(string, float, FontStyle, GraphicsUnit, CharacterSet) {#constructor_4}

Initializes a new [`Font`](../) using a specified size, style, unit, and character set.

```csharp
public Font(string fontName, float emSize, FontStyle style, GraphicsUnit unit, 
    CharacterSet characterSet)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fontName | String | A string representation of the [`Font`](../) name. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| style | FontStyle | The [`FontStyle`](../../fontstyle/) of the new font. |
| unit | GraphicsUnit | The [`GraphicsUnit`](../../graphicsunit/) of the new font. |
| characterSet | CharacterSet | A character set to use for this font. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | *emSize* is less than or equal to 0, evaluates to infinity or is not a valid number. |
| ArgumentNullException | *fontName* is null. |

### See Also

* enum [FontStyle](../../fontstyle/)
* enum [GraphicsUnit](../../graphicsunit/)
* enum [CharacterSet](../../characterset/)
* class [Font](../)
* namespace [Aspose.Imaging](../../font/)
* assembly [Aspose.Imaging](../../../)

---

## Font(string, float, FontStyle, GraphicsUnit) {#constructor_3}

Initializes a new [`Font`](../) using a specified size, style, and unit.

```csharp
public Font(string fontName, float emSize, FontStyle style, GraphicsUnit unit)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fontName | String | A string representation of the [`Font`](../) name. |
| emSize | Single | The em-size of the new font in the units specified by the *unit* parameter. |
| style | FontStyle | The [`FontStyle`](../../fontstyle/) of the new font. |
| unit | GraphicsUnit | The [`GraphicsUnit`](../../graphicsunit/) of the new font. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentOutOfRangeException | *emSize* is less than or equal to 0, evaluates to infinity or is not a valid number. |
| ArgumentNullException | *fontName* is null. |

### See Also

* enum [FontStyle](../../fontstyle/)
* enum [GraphicsUnit](../../graphicsunit/)
* class [Font](../)
* namespace [Aspose.Imaging](../../font/)
* assembly [Aspose.Imaging](../../../)


