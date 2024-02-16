---
title: MathRenderer
second_title: Aspose.TeX for Java API Reference
description: Implements rendering of math formula.
type: docs
weight: 17
url: /java/com.aspose.tex/mathrenderer/
---
**Inheritance:**
java.lang.Object
```
public abstract class MathRenderer
```

Implements rendering of math formula.
## Constructors

| Constructor | Description |
| --- | --- |
| [MathRenderer()](#MathRenderer--) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [render(String formula, OutputStream stream, MathRendererOptions mathRendererOptions)](#render-java.lang.String-java.io.OutputStream-com.aspose.tex.MathRendererOptions-) | Renders a math formula. |
### MathRenderer() {#MathRenderer--}
```
public MathRenderer()
```


Creates a new instance.

### render(String formula, OutputStream stream, MathRendererOptions mathRendererOptions) {#render-java.lang.String-java.io.OutputStream-com.aspose.tex.MathRendererOptions-}
```
public Size2D render(String formula, OutputStream stream, MathRendererOptions mathRendererOptions)
```


Renders a math formula.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| formula | java.lang.String | The formula LaTeX program. |
| stream | java.io.OutputStream | The stream to write the output to. |
| mathRendererOptions | [MathRendererOptions](../../com.aspose.tex/mathrendereroptions) | The rendering options. |

**Returns:**
[Size2D](../../com.aspose.tex/size2d) - The output image size.
