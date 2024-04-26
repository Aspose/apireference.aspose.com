---
title: Font.Font
second_title: Aspose.Page for .NET API Reference
description: Font constructor. Initializes a new Font that uses the specified existing Font and FontStyle enumeration
type: docs
weight: 10
url: /net/aspose.page.drawing/font/font/
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

### See Also

* enum [FontStyle](../../fontstyle/)
* class [Font](../)
* namespace [Aspose.Page.Drawing](../../font/)
* assembly [Aspose.Page](../../../)

---

## Font(string, float, FontStyle) {#constructor_2}

Initializes a new [`Font`](../) using a specified size and style.

```csharp
public Font(string familyName, float emSize, FontStyle style)
```

| Parameter | Type | Description |
| --- | --- | --- |
| familyName | String | A string representation of the FontFamily for the new [`Font`](../). |
| emSize | Single | The em-size, in points, of the new font. |
| style | FontStyle | The [`FontStyle`](../../fontstyle/) of the new font. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | *emSize* is less than or equal to 0, evaluates to infinity, or is not a valid number. |

### See Also

* enum [FontStyle](../../fontstyle/)
* class [Font](../)
* namespace [Aspose.Page.Drawing](../../font/)
* assembly [Aspose.Page](../../../)

---

## Font(string, float) {#constructor_1}

Initializes a new [`Font`](../) using a specified size.

```csharp
public Font(string familyName, float emSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| familyName | String | A string representation of the FontFamily for the new [`Font`](../). |
| emSize | Single | The em-size, in points, of the new font. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | *emSize* is less than or equal to 0, evaluates to infinity or is not a valid number. |

### See Also

* class [Font](../)
* namespace [Aspose.Page.Drawing](../../font/)
* assembly [Aspose.Page](../../../)


