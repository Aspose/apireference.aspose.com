---
title: ICSSRule Interface
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.Css.ICSSRule interface. The CSSRule interface is the abstract base interface for any type of CSS statement. This includes both rule sets and at-rules. An implementation is expected to preserve all rules specified in a CSS style sheet even if the rule is not recognized by the parser. Unrecognized rules are represented using the ICSSUnknownRule interface
type: docs
weight: 640
url: /net/aspose.html.dom.css/icssrule/
---
## ICSSRule interface

The CSSRule interface is the abstract base interface for any type of CSS statement. This includes both rule sets and at-rules. An implementation is expected to preserve all rules specified in a CSS style sheet, even if the rule is not recognized by the parser. Unrecognized rules are represented using the ICSSUnknownRule interface.

```csharp
public interface ICSSRule
```

## Properties

| Name | Description |
| --- | --- |
| [CSSText](../../aspose.html.dom.css/icssrule/csstext/) { get; set; } | The parsable textual representation of the rule. This reflects the current state of the rule and not its initial value. |
| [ParentRule](../../aspose.html.dom.css/icssrule/parentrule/) { get; } | If this rule is contained inside another rule (e.g. a style rule inside an @media block), this is the containing rule. If this rule is not nested inside any other rules, this returns null. |
| [ParentStyleSheet](../../aspose.html.dom.css/icssrule/parentstylesheet/) { get; } | The style sheet that contains this rule. |
| [Type](../../aspose.html.dom.css/icssrule/type/) { get; } | The type of the rule, as defined above. The expectation is that binding-specific casting methods can be used to cast down from an instance of the CSSRule interface to the specific derived interface implied by the type. |

### See Also

* namespace [Aspose.Html.Dom.Css](../../aspose.html.dom.css/)
* assembly [Aspose.HTML](../../)
