---
title: ICSSStyleSheet Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.Css.ICSSStyleSheet interface. The CSSStyleSheet interface is a concrete interface used to represent a CSS style sheet i.e. a style sheet whose content type is text/css
type: docs
weight: 4190
url: /net/aspose.svg.dom.css/icssstylesheet/
---
## ICSSStyleSheet interface

The CSSStyleSheet interface is a concrete interface used to represent a CSS style sheet i.e., a style sheet whose content type is "text/css".

```csharp
public interface ICSSStyleSheet : IStyleSheet
```

## Properties

| Name | Description |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icssstylesheet/cssrules/) { get; } | The list of all CSS rules contained within the style sheet. This includes both rule sets and at-rules. |
| [OwnerRule](../../aspose.svg.dom.css/icssstylesheet/ownerrule/) { get; } | If this style sheet comes from an @import rule, the ownerRule attribute will contain the CSSImportRule. In that case, the ownerNode attribute in the StyleSheet interface will be null. If the style sheet comes from an element or a processing instruction, the ownerRule attribute will be null and the ownerNode attribute will contain the Node. |

## Methods

| Name | Description |
| --- | --- |
| [DeleteRule](../../aspose.svg.dom.css/icssstylesheet/deleterule/)(int) | Used to delete a rule from the style sheet. |
| [InsertRule](../../aspose.svg.dom.css/icssstylesheet/insertrule/)(string, int) | Used to insert a new rule into the style sheet. The new rule now becomes part of the cascade. |

### See Also

* interface [IStyleSheet](../istylesheet/)
* namespace [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* assembly [Aspose.SVG](../../)
