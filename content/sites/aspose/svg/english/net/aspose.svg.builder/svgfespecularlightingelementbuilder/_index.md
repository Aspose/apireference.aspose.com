---
title: SVGFESpecularLightingElementBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGFESpecularLightingElementBuilder class. Builder class for creating SVG feSpecularLighting elements which apply specular lighting effects to an image
type: docs
weight: 990
url: /net/aspose.svg.builder/svgfespecularlightingelementbuilder/
---
## SVGFESpecularLightingElementBuilder class

Builder class for creating SVG 'feSpecularLighting' elements, which apply specular lighting effects to an image.

```csharp
public class SVGFESpecularLightingElementBuilder : 
    SVGFEBaseLightingElementBuilder<SVGFESpecularLightingElement, SVGFESpecularLightingElementBuilder>
```

## Constructors

| Name | Description |
| --- | --- |
| [SVGFESpecularLightingElementBuilder](svgfespecularlightingelementbuilder/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddScript](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/addscript/)(Action&lt;SVGScriptElementBuilder&gt;) |  |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(string, string) |  |
| override [Build](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/build/)(Document) |  |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(SVGFESpecularLightingElement) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(Document) |  |
| [KernelUnitLength](../../aspose.svg.builder/svgfespecularlightingelementbuilder/kernelunitlength/)(double, double?) | Sets the 'kernelUnitLength' attribute, defining the convolution kernel unit length. |
| [SpecularConstant](../../aspose.svg.builder/svgfespecularlightingelementbuilder/specularconstant/)(double) | Sets the 'specularConstant' attribute, representing the specular reflection constant. |
| [SpecularExponent](../../aspose.svg.builder/svgfespecularlightingelementbuilder/specularexponent/)(double) | Sets the 'specularExponent' attribute, controlling the focus of the specular highlight. |
| [SurfaceScale](../../aspose.svg.builder/svgfespecularlightingelementbuilder/surfacescale/)(double) | Sets the 'surfaceScale' attribute of the feSpecularLighting element, defining the height of the surface for the lighting calculation. |
| [WithFeDistantLight](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/withfedistantlight/)(Action&lt;SVGFEDistantLightElementBuilder&gt;) |  |
| [WithFePointLight](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/withfepointlight/)(Action&lt;SVGFEPointLightElementBuilder&gt;) |  |
| [WithFeSpotLight](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/withfespotlight/)(Action&lt;SVGFESpotLightElementBuilder&gt;) |  |

### See Also

* class [SVGFEBaseLightingElementBuilder&lt;TElement,TBuilder&gt;](../svgfebaselightingelementbuilder-2/)
* class [SVGFESpecularLightingElement](../../aspose.svg.filters/svgfespecularlightingelement/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
