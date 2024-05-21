---
title: ICSSCharsetRule class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.svg.dom.css/icsscharsetrule/
is_root: false
---

## ICSSCharsetRule class

The CSSCharsetRule interface represents a @charset rule in a CSS style sheet. 
The value of the encoding attribute does not affect the encoding of text data in the DOM objects; this encoding is always UTF-16. After a stylesheet is loaded, the value of the encoding attribute is the value found in the @charset rule. If there was no @charset in the original document, then no CSSCharsetRule is created. 
The value of the encoding attribute may also be used as a hint for the encoding used on serialization of the style sheet.



The ICSSCharsetRule type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [encoding](/svg/python-net/aspose.svg.dom.css/icsscharsetrule/encoding) | The encoding information used in this @charset rule. |
| [type](/svg/python-net/aspose.svg.dom.css/icsscharsetrule/type) | The type of the rule, as defined above. The expectation is that binding-specific casting methods can be used to cast down from an instance of the CSSRule interface to the specific derived interface implied by the type. |
| [css_text](/svg/python-net/aspose.svg.dom.css/icsscharsetrule/css_text) | The parsable textual representation of the rule. This reflects the current state of the rule and not its initial value. |
| [parent_style_sheet](/svg/python-net/aspose.svg.dom.css/icsscharsetrule/parent_style_sheet) | The style sheet that contains this rule. |
| [parent_rule](/svg/python-net/aspose.svg.dom.css/icsscharsetrule/parent_rule) | If this rule is contained inside another rule (e.g. a style rule inside an @media block), this is the containing rule. If this rule is not nested inside any other rules, this returns null. |



### See Also
* module [`aspose.svg.dom.css`](..)
* class [`ICSSRule`](/svg/python-net/aspose.svg.dom.css/icssrule)
