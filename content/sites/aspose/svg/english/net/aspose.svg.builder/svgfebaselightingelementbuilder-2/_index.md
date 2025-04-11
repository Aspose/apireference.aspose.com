---
title: SVGFEBaseLightingElementBuilderTElementTBuilder Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGFEBaseLightingElementBuilder2TElementTBuilder class. Abstract base class for builders of SVG filter effect lighting elements
type: docs
weight: 1180
url: /net/aspose.svg.builder/svgfebaselightingelementbuilder-2/
---
## SVGFEBaseLightingElementBuilder&lt;TElement,TBuilder&gt; class

Abstract base class for builders of SVG filter effect lighting elements.

```csharp
public abstract class SVGFEBaseLightingElementBuilder<TElement, TBuilder> : 
    SVGElementBuilder<TElement>, ICoreAttributeSetter, IDescriptiveElementBuilder, 
    IFilterPrimitiveInAttributeSetter, IPresentationAttributeSetter
    where TElement : SVGElement
    where TBuilder : SVGFEBaseLightingElementBuilder
```

| Parameter | Description |
| --- | --- |
| TElement | The type of SVG element being built. |
| TBuilder | The type of the builder itself. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [AddScript](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/addscript/)(*Action&amp;lt;SVGScriptElementBuilder&amp;gt;*) | Adds a script configuration to the element. |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) |  |
| override [Build](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/build/#build)(*[Document](../../aspose.svg.dom/document/)*) | Builds the SVG element, applying the light source configuration if specified. |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/)(*TElement*) |  |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) |  |
| [WithFeDistantLight](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/withfedistantlight/)(*Action&amp;lt;SVGFEDistantLightElementBuilder&amp;gt;*) | Configures a distant light source for the filter effect. |
| [WithFePointLight](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/withfepointlight/)(*Action&amp;lt;SVGFEPointLightElementBuilder&amp;gt;*) | Configures a point light source for the filter effect. |
| [WithFeSpotLight](../../aspose.svg.builder/svgfebaselightingelementbuilder-2/withfespotlight/)(*Action&amp;lt;SVGFESpotLightElementBuilder&amp;gt;*) | Configures a spot light source for the filter effect. |

### See Also

* class [SVGElementBuilder&lt;T&gt;](../svgelementbuilder-1/)
* interface [ICoreAttributeSetter](../icoreattributesetter/)
* interface [IDescriptiveElementBuilder](../idescriptiveelementbuilder/)
* interface [IFilterPrimitiveInAttributeSetter](../ifilterprimitiveinattributesetter/)
* interface [IPresentationAttributeSetter](../ipresentationattributesetter/)
* class [SVGElement](../../aspose.svg/svgelement/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
