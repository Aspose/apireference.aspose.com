---
title: ICSSCharsetRule Interface
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Css.ICSSCharsetRule interface. The CSSCharsetRule interface represents a charset rule in a CSS style sheet. The value of the encoding attribute does not affect the encoding of text data in the DOM objects this encoding is always UTF-16. After a stylesheet is loaded the value of the encoding attribute is the value found in the charset rule. If there was no charset in the original document then no CSSCharsetRule is created. The value of the encoding attribute may also be used as a hint for the encoding used on serialization of the style sheet
type: docs
weight: 550
url: /net/aspose.html.dom.css/icsscharsetrule/
---
## ICSSCharsetRule interface

The CSSCharsetRule interface represents a @charset rule in a CSS style sheet. The value of the encoding attribute does not affect the encoding of text data in the DOM objects; this encoding is always UTF-16. After a stylesheet is loaded, the value of the encoding attribute is the value found in the @charset rule. If there was no @charset in the original document, then no CSSCharsetRule is created. The value of the encoding attribute may also be used as a hint for the encoding used on serialization of the style sheet.

```csharp
public interface ICSSCharsetRule : ICSSRule
```

## Properties

| Name | Description |
| --- | --- |
| [Encoding](../../aspose.html.dom.css/icsscharsetrule/encoding/) { get; set; } | The encoding information used in this @charset rule. |

### See Also

* interface [ICSSRule](../icssrule/)
* namespace [Aspose.Html.Dom.Css](../../aspose.html.dom.css/)
* assembly [Aspose.HTML](../../)
