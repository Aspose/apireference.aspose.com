---
title: Aspose::TeX::Features::FigureRenderer::Render method
linktitle: Render
second_title: Aspose.TeX for C++
description: 'Aspose::TeX::Features::FigureRenderer::Render method. Renders some LaTeX code in C++.'
type: docs
weight: 200
url: /cpp/aspose.tex.features/figurerenderer/render/
---
## FigureRenderer::Render method


Renders some LaTeX code.

```cpp
ASPOSE_TEX_SHARED_API System::Drawing::SizeF Aspose::TeX::Features::FigureRenderer::Render(System::String latexBody, System::SharedPtr<System::IO::Stream> stream, System::SharedPtr<FigureRendererOptions> figureRendererOptions)
```


| Parameter | Type | Description |
| --- | --- | --- |
| latexBody | System::String | The LaTeX file body. |
| stream | System::SharedPtr\<System::IO::Stream\> | The stream to write the output to. |
| figureRendererOptions | System::SharedPtr\<FigureRendererOptions\> | The rendering options. |

### ReturnValue

The output image size.

## See Also

* Class [FigureRendererOptions](../../figurerendereroptions/)
* Class [FigureRenderer](../)
* Namespace [Aspose::TeX::Features](../../)
* Library [Aspose.TeX for C++](../../../)
