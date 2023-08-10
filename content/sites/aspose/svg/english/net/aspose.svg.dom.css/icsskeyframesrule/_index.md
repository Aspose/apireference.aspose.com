---
title: ICSSKeyframesRule Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.Css.ICSSKeyframesRule interface. The CSSKeyframesRule interface represents a complete set of keyframes for a single animation
type: docs
weight: 420
url: /net/aspose.svg.dom.css/icsskeyframesrule/
---
## ICSSKeyframesRule interface

The CSSKeyframesRule interface represents a complete set of keyframes for a single animation

```csharp
public interface ICSSKeyframesRule : ICSSRule
```

## Properties

| Name | Description |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icsskeyframesrule/cssrules/) { get; } | This attribute gives access to the keyframes in the list |
| [Name](../../aspose.svg.dom.css/icsskeyframesrule/name/) { get; } | This attribute is the name of the keyframes, used by the ‘animation-name’ property. |

## Methods

| Name | Description |
| --- | --- |
| [AppendRule](../../aspose.svg.dom.css/icsskeyframesrule/appendrule/)(string) | The appendRule method appends the passed CSSKeyframeRule into the list at the passed key |
| [DeleteRule](../../aspose.svg.dom.css/icsskeyframesrule/deleterule/)(string) | The deleteRule method deletes the CSSKeyframeRule with the passed key. If a rule with this key does not exist, the method does nothing |
| [FindRule](../../aspose.svg.dom.css/icsskeyframesrule/findrule/)(string) | The findRule method returns the rule with a key matching the passed key. If no such rule exists, a null value is returned |

### See Also

* interface [ICSSRule](../icssrule/)
* namespace [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* assembly [Aspose.SVG](../../)
