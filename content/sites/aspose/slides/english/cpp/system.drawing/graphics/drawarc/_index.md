---
title: DrawArc()
second_title: Aspose.Slides for C++ API Reference
description: Draws the specified arc using the specified pen on the surface represented by the current object.
type: docs
weight: 248
url: /cpp/system.drawing/graphics/drawarc/
---
## Graphics::DrawArc(const SharedPtr\<Pen\>\&, int32_t, int32_t, int32_t, int32_t, int32_t, int32_t) method


Draws the specified arc using the specified pen on the surface represented by the current object.

```cpp
void System::Drawing::Graphics::DrawArc(const SharedPtr<Pen> &pen, int32_t x, int32_t y, int32_t width, int32_t height, int32_t startAngle, int32_t sweepAngle)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| pen | const [SharedPtr](../../../system/sharedptr/)\<[Pen](../../pen/)\>\& | A pen to use when drawing the arc |
| x | **int32_t** | The X coordinate of the upper left corner of the rectangle that defines the ellipse |
| y | **int32_t** | The Y coordinate of the upper left corner of the rectangle that defines the ellipse |
| width | **int32_t** | The width of the rectangle that defines the ellipse |
| height | **int32_t** | The height of the rectangle that defines the ellipse |
| startAngle | **int32_t** | Angle in degrees measured clockwise from the X axis to the starting point of the arc |
| sweepAngle | **int32_t** | Angle in degrees measured clockwise from the **startAngle** to ending point of the arc |

## Graphics::DrawArc(const SharedPtr\<Pen\>\&, float, float, float, float, float, float) method


Draws the specified arc using the specified pen on the surface represented by the current object.

```cpp
void System::Drawing::Graphics::DrawArc(const SharedPtr<Pen> &pen, float x, float y, float width, float height, float startAngle, float sweepAngle)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| pen | const [SharedPtr](../../../system/sharedptr/)\<[Pen](../../pen/)\>\& | A pen to use when drawing the arc |
| x | **float** | The X coordinate of the upper left corner of the rectangle that defines the ellipse |
| y | **float** | The Y coordinate of the upper left corner of the rectangle that defines the ellipse |
| width | **float** | The width of the rectangle that defines the ellipse |
| height | **float** | The height of the rectangle that defines the ellipse |
| startAngle | **float** | Angle in degrees measured clockwise from the X axis to the starting point of the arc |
| sweepAngle | **float** | Angle in degrees measured clockwise from the **startAngle** to ending point of the arc |

## Graphics::DrawArc(const SharedPtr\<Pen\>\&, Rectangle, float, float) method


Draws the specified arc using the specified pen on the surface represented by the current object.

```cpp
void System::Drawing::Graphics::DrawArc(const SharedPtr<Pen> &pen, Rectangle rect, float startAngle, float sweepAngle)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| pen | const [SharedPtr](../../../system/sharedptr/)\<[Pen](../../pen/)\>\& | A pen to use when drawing the arc |
| rect | [Rectangle](../../rectangle/) | The rectangle that defines the ellipse |
| startAngle | **float** | Angle in degrees measured clockwise from the X axis to the starting point of the arc |
| sweepAngle | **float** | Angle in degrees measured clockwise from the **startAngle** to ending point of the arc |

## Graphics::DrawArc(const SharedPtr\<Pen\>\&, RectangleF, float, float) method


Draws the specified arc using the specified pen on the surface represented by the current object.

```cpp
void System::Drawing::Graphics::DrawArc(const SharedPtr<Pen> &pen, RectangleF rect, float startAngle, float sweepAngle)
```


### Arguments

| Parameter | Type | Description |
| --- | --- | --- |
| pen | const [SharedPtr](../../../system/sharedptr/)\<[Pen](../../pen/)\>\& | A pen to use when drawing the arc |
| rect | [RectangleF](../../rectanglef/) | The rectangle that defines the ellipse |
| startAngle | **float** | Angle in degrees measured clockwise from the X axis to the starting point of the arc |
| sweepAngle | **float** | Angle in degrees measured clockwise from the **startAngle** to ending point of the arc |

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../pen/)
* Class [Graphics](../)
* Class [Rectangle](../../rectangle/)
* Class [RectangleF](../../rectanglef/)
* Namespace [System::Drawing](../../)
* Library [Aspose.Slides](../../../)