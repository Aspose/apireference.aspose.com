---
title: SVGBuilderExtensions.AddForeignObject
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a foreignObject element configuration to the builder
type: docs
weight: 310
url: /net/aspose.svg.builder/svgbuilderextensions/addforeignobject/
---
## SVGBuilderExtensions.AddForeignObject&lt;TBuilder&gt; method

Adds a 'foreignObject' element configuration to the builder.

```csharp
public static TBuilder AddForeignObject<TBuilder>(this TBuilder builder, 
    Action<SVGForeignObjectElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'foreignObject' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGForeignObjectElementBuilder](../../svgforeignobjectelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
