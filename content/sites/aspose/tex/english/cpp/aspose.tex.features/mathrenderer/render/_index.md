---
title: Aspose::TeX::Features::MathRenderer::Render method
linktitle: Render
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Features::MathRenderer::Render method. Renders a math formula in C++.'
type: docs
weight: 200
url: /cpp/aspose.tex.features/mathrenderer/render/
---
## MathRenderer::Render method


Renders a math formula.

```cpp
System::Drawing::SizeF Aspose::TeX::Features::MathRenderer::Render(System::String formula, System::SharedPtr<System::IO::Stream> stream, System::SharedPtr<MathRendererOptions> mathRendererOptions)
```


| Parameter | Type | Description |
| --- | --- | --- |
| formula | System::String | The formula LaTeX program. |
| stream | System::SharedPtr\<System::IO::Stream\> | The stream to write the output to. |
| mathRendererOptions | System::SharedPtr\<MathRendererOptions\> | The rendering options. |

### ReturnValue

The output image size.

## See Also

* Class [SizeF](../../../system.drawing/sizef/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [MathRendererOptions](../../mathrendereroptions/)
* Class [MathRenderer](../)
* Namespace [Aspose::TeX::Features](../../)
* Library [Aspose.TeX for C++](../../../)
