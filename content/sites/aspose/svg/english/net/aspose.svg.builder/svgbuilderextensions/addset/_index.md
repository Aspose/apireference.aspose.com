---
title: SVGBuilderExtensions.AddSet
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a set element configuration to the builder
type: docs
weight: 470
url: /net/aspose.svg.builder/svgbuilderextensions/addset/
---
## SVGBuilderExtensions.AddSet&lt;TBuilder&gt; method

Adds a 'set' element configuration to the builder.

```csharp
public static TBuilder AddSet<TBuilder>(this TBuilder builder, 
    Action<SVGSetElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IBaseAnimationElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'set' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGSetElementBuilder](../../svgsetelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IBaseAnimationElementBuilder](../../ibaseanimationelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
