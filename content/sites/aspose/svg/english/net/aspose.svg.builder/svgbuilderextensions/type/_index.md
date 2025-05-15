---
title: SVGBuilderExtensions.Type
second_title: Aspose.SVG for .NET API Reference
description: SVGBuilderExtensions Type method. Sets the type attribute of a component transfer function element
type: docs
weight: 2270
url: /net/aspose.svg.builder/svgbuilderextensions/type/
---
## SVGBuilderExtensions.Type<TBuilder> method

Sets the 'type' attribute of a component transfer function element.

```csharp
public static TBuilder Type<TBuilder>(this TBuilder builder, ComponentTransferType type)
    where TBuilder : ISVGElementBuilder, ITransferFunctionAttributeSetter
```

| Parameter | Description |
| --- | --- |
| TBuilder | The type of the SVG element builder. |
| builder | The builder instance. |
| type | The type of the component transfer function (e.g., linear, gamma). |

### Return Value

The builder instance for chaining.

### See Also

* enum [ComponentTransferType](../../componenttransfertype/)
* interface [ISVGElementBuilder](../../isvgelementbuilder/)
* interface [ITransferFunctionAttributeSetter](../../itransferfunctionattributesetter/)
* class [SVGBuilderExtensions](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
