---
title: ICSSStyleRule Interface
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Css.ICSSStyleRule interface. The CSSStyleRule interface represents a single CSS style rule. The selectorText attribute on getting must return the result of serializing the associated group of selectors
type: docs
weight: 670
url: /net/aspose.html.dom.css/icssstylerule/
---
## ICSSStyleRule interface

The CSSStyleRule interface represents a single CSS style rule. The selectorText attribute, on getting, must return the result of serializing the associated group of selectors

```csharp
public interface ICSSStyleRule : ICSSRule
```

## Members
## Properties

| Name | Description |
| --- | --- |
| [SelectorText](../../aspose.html.dom.css/icssstylerule/selectortext/) { get; } | The textual representation of the selector for the rule set. The implementation may have stripped out insignificant whitespace while parsing the selector. |
| [Style](../../aspose.html.dom.css/icssstylerule/style/) { get; } | The read-only style property is the [`CSSStyleDeclaration`](../icssstyledeclaration/) interface for the declaration block of the `CSSStyleRule`. |

### See Also

* interface [ICSSRule](../icssrule/)
* namespace [Aspose.Html.Dom.Css](../../aspose.html.dom.css/)
* assembly [Aspose.HTML](../../)
