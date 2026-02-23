---
title: Aspose::Page::Drawing::Color::FromArgb method
linktitle: FromArgb
second_title: Aspose.Page for C++
description: 'Aspose::Page::Drawing::Color::FromArgb method. Creates a T:Aspose::Page::Drawing::Color structure from the specified T:Aspose::Page::Drawing::Color structure, but with the new specified alpha value. Although this method allows a 32-bit value to be passed for the alpha value, the value is limited to 8 bits in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.drawing/color/fromargb/
---
## Color::FromArgb(int32_t, Aspose::Page::Drawing::Color) method


Creates a [T:Aspose::Page::Drawing::Color](../) structure from the specified [T:Aspose::Page::Drawing::Color](../) structure, but with the new specified alpha value. Although this method allows a 32-bit value to be passed for the alpha value, the value is limited to 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, Aspose::Page::Drawing::Color baseColor)
```


| Parameter | Type | Description |
| --- | --- | --- |
| alpha | int32_t | The alpha value for the new [T:Aspose::Page::Drawing::Color](../). Valid values are 0 through 255. |
| baseColor | Aspose::Page::Drawing::Color | The [T:Aspose::Page::Drawing::Color](../) from which to create the new [T:Aspose::Page::Drawing::Color](../). |

### ReturnValue

The [T:Aspose::Page::Drawing::Color](../) that this method creates.

## See Also

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t, int32_t) method


Creates a [T:Aspose::Page::Drawing::Color](../) structure from the four ARGB component (alpha, red, green, and blue) values. Although this method allows a 32-bit value to be passed for each component, the value of each component is limited to 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t alpha, int32_t red, int32_t green, int32_t blue)
```


| Parameter | Type | Description |
| --- | --- | --- |
| alpha | int32_t | The alpha component. Valid values are 0 through 255. |
| red | int32_t | The red component. Valid values are 0 through 255. |
| green | int32_t | The green component. Valid values are 0 through 255. |
| blue | int32_t | The blue component. Valid values are 0 through 255. |

### ReturnValue

The [T:Aspose::Page::Drawing::Color](../) that this method creates.

## See Also

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t) method


Creates a [T:Aspose::Page::Drawing::Color](../) structure from a 32-bit ARGB value.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t argb)
```


| Parameter | Type | Description |
| --- | --- | --- |
| argb | int32_t | A value specifying the 32-bit ARGB value. |

### ReturnValue

The [T:Aspose::Page::Drawing::Color](../) structure that this method creates.

## See Also

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Color::FromArgb(int32_t, int32_t, int32_t) method


Creates a [T:Aspose::Page::Drawing::Color](../) structure from the specified 8-bit color values (red, green, and blue). The alpha value is implicitly 255 (fully opaque). Although this method allows a 32-bit value to be passed for each color component, the value of each component is limited to 8 bits.

```cpp
static Aspose::Page::Drawing::Color Aspose::Page::Drawing::Color::FromArgb(int32_t red, int32_t green, int32_t blue)
```


| Parameter | Type | Description |
| --- | --- | --- |
| red | int32_t | The red component value for the new [T:Aspose::Page::Drawing::Color](../). Valid values are 0 through 255. |
| green | int32_t | The green component value for the new [T:Aspose::Page::Drawing::Color](../). Valid values are 0 through 255. |
| blue | int32_t | The blue component value for the new [T:Aspose::Page::Drawing::Color](../). Valid values are 0 through 255. |

### ReturnValue

The [T:Aspose::Page::Drawing::Color](../) that this method creates.

## See Also

* Class [Color](../)
* Class [Color](../)
* Namespace [Aspose::Page::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
