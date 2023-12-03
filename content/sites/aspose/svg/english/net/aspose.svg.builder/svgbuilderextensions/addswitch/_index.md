---
title: SVGBuilderExtensions.AddSwitch
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions method. Adds a switch element configuration to the builder
type: docs
weight: 510
url: /net/aspose.svg.builder/svgbuilderextensions/addswitch/
---
## SVGBuilderExtensions.AddSwitch&lt;TBuilder&gt; method

Adds a 'switch' element configuration to the builder.

```csharp
public static TBuilder AddSwitch<TBuilder>(this TBuilder builder, 
    Action<SVGSwitchElementBuilder> configure)
    where TBuilder : ISVGElementBuilder, ICompositeElementBuilder
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| configure | The configuration action for the 'switch' element. |

### Return Value

The builder instance for chaining.

### See Also

* class [SVGSwitchElementBuilder](../../svgswitchelementbuilder/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ICompositeElementBuilder](../../icompositeelementbuilder/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
