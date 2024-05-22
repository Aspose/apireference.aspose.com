---
title: ICSSMediaRule class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.svg.dom.css/icssmediarule/
is_root: false
---

## ICSSMediaRule class

The CSSMediaRule interface represents a @media rule in a CSS style sheet. A @media rule can be used to delimit style rules for specific media types.



The ICSSMediaRule type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [media](/svg/python-net/aspose.svg.dom.css/icssmediarule/media) | A list of media types for this rule. |
| [css_rules](/svg/python-net/aspose.svg.dom.css/icssmediarule/css_rules) | A list of all CSS rules contained within the media block. |
| [type](/svg/python-net/aspose.svg.dom.css/icssmediarule/type) | The type of the rule, as defined above. The expectation is that binding-specific casting methods can be used to cast down from an instance of the CSSRule interface to the specific derived interface implied by the type. |
| [css_text](/svg/python-net/aspose.svg.dom.css/icssmediarule/css_text) | The parsable textual representation of the rule. This reflects the current state of the rule and not its initial value. |
| [parent_style_sheet](/svg/python-net/aspose.svg.dom.css/icssmediarule/parent_style_sheet) | The style sheet that contains this rule. |
| [parent_rule](/svg/python-net/aspose.svg.dom.css/icssmediarule/parent_rule) | If this rule is contained inside another rule (e.g. a style rule inside an @media block), this is the containing rule. If this rule is not nested inside any other rules, this returns null. |


### Methods
| Method | Description |
| :- | :- |
| [insert_rule](/svg/python-net/aspose.svg.dom.css/icssmediarule/insert_rule/#str-int) | Used to insert a new rule into the media block. |
| [delete_rule](/svg/python-net/aspose.svg.dom.css/icssmediarule/delete_rule/#int) | Used to delete a rule from the media block. |



### See Also
* module [`aspose.svg.dom.css`](..)
* class [`ICSSRule`](/svg/python-net/aspose.svg.dom.css/icssrule)
