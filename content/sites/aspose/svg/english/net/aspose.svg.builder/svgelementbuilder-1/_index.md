---
title: SVGElementBuilderT Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.SVGElementBuilder1T class. Represents a base class for building SVG elements of type T
type: docs
weight: 1160
url: /net/aspose.svg.builder/svgelementbuilder-1/
---
## SVGElementBuilder&lt;T&gt; class

Represents a base class for building SVG elements of type *T*.

```csharp
public abstract class SVGElementBuilder<T> : ISVGElementBuilder
    where T : SVGElement
```

| Parameter | Description |
| --- | --- |
| T | The type of SVG element this builder is responsible for creating. |

## Properties

| Name | Description |
| --- | --- |
| [Configurations](../../aspose.svg.builder/svgelementbuilder-1/configurations/) { get; } | Gets the list of configurations to be applied to the SVG element. |

## Methods

| Name | Description |
| --- | --- |
| [Attribute](../../aspose.svg.builder/svgelementbuilder-1/attribute/)(*string, string*) | Adds an attribute configuration to the SVG element. |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/#build)(*[Document](../../aspose.svg.dom/document/)*) | Builds the SVG element and applies all configurations to it. |
| virtual [Build](../../aspose.svg.builder/svgelementbuilder-1/build/#build_1)(*T*) | Applies configurations to an existing SVG element. |
| [BuildElement](../../aspose.svg.builder/svgelementbuilder-1/buildelement/)(*[Document](../../aspose.svg.dom/document/)*) | Builds the SVG element as a generic SVGElement. |

### See Also

* interface [ISVGElementBuilder](../isvgelementbuilder/)
* class [SVGElement](../../aspose.svg/svgelement/)
* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
