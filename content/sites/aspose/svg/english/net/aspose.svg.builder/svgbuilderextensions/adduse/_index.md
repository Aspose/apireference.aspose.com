---
title: SVGBuilderExtensions.AddUse
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a use element configuration to the builder
type: docs
weight: 550
url: /net/aspose.svg.builder/svgbuilderextensions/adduse/
---
## SVGBuilderExtensions.AddUse&lt;TBuilder&gt; method

Adds a 'use' element configuration to the builder.

```csharp
public static TBuilder AddUse<TBuilder>(this TBuilder builder, 
    Action<SVGUseElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IStructuralElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'use' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGUseElementBuilder](../../svguseelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IStructuralElementBuilder](../../istructuralelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
