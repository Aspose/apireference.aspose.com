---
title: SVGBuilderExtensions.AddScript
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a script element configuration to the builder
type: docs
weight: 460
url: /net/aspose.svg.builder/svgbuilderextensions/addscript/
---
## SVGBuilderExtensions.AddScript&lt;TBuilder&gt; method

Adds a 'script' element configuration to the builder.

```csharp
public static TBuilder AddScript<TBuilder>(this TBuilder builder, 
    Action<SVGScriptElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, IShapeContentElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'script' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGScriptElementBuilder](../../svgscriptelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [IShapeContentElementBuilder](../../ishapecontentelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
