---
title: IDrawingFactory.CreateTextureBrush
second_title: Aspose.SVG for .NET API Reference
description: IDrawingFactory method. Creates a texture brush with the specified parameters
type: docs
weight: 90
url: /net/aspose.svg.drawing/idrawingfactory/createtexturebrush/
---
## CreateTextureBrush(byte[], SpreadMode, float, IMatrix) {#createtexturebrush}

Creates a texture brush with the specified parameters.

```csharp
public ITextureBrush CreateTextureBrush(byte[] imageBytes, SpreadMode spreadMode, float opacity, 
    IMatrix transformationMatrix)
```

| Parameter | Type | Description |
| --- | --- | --- |
| imageBytes | Byte[] | The byte array containing the image data. |
| spreadMode | SpreadMode | The spread mode for the brush. See [`SpreadMode`](../../spreadmode/). |
| opacity | Single | The opacity of the brush. |
| transformationMatrix | IMatrix | The transformation matrix for the brush. |

### Return Value

The created [`ITextureBrush`](../../itexturebrush/).

### See Also

* interface [ITextureBrush](../../itexturebrush/)
* enum [SpreadMode](../../spreadmode/)
* interface [IMatrix](../../imatrix/)
* interface [IDrawingFactory](../)
* namespace [Aspose.Svg.Drawing](../../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../../)

---

## CreateTextureBrush(PointF, IMatrix, IInterpolationColor[], RectangleF, float, RectangleF) {#createtexturebrush_1}

Creates a texture brush with the specified parameters for an elliptical shape.

```csharp
public ITextureBrush CreateTextureBrush(PointF centerPoint, IMatrix transformation, 
    IInterpolationColor[] interpolationColors, RectangleF bounds, float opacity, 
    RectangleF elipseRect)
```

| Parameter | Type | Description |
| --- | --- | --- |
| centerPoint | PointF | The center point of the ellipse. |
| transformation | IMatrix | The transformation matrix for the brush. See [`IMatrix`](../../imatrix/). |
| interpolationColors | IInterpolationColor[] | The interpolation colors for the brush. See [`IInterpolationColor`](../../iinterpolationcolor/). |
| bounds | RectangleF | The bounds of the brush. |
| opacity | Single | The opacity of the brush. |
| elipseRect | RectangleF | The rectangle defining the elliptical shape. |

### Return Value

The created [`ITextureBrush`](../../itexturebrush/).

### See Also

* interface [ITextureBrush](../../itexturebrush/)
* interface [IMatrix](../../imatrix/)
* interface [IInterpolationColor](../../iinterpolationcolor/)
* interface [IDrawingFactory](../)
* namespace [Aspose.Svg.Drawing](../../../aspose.svg.drawing/)
* assembly [Aspose.SVG](../../../)
