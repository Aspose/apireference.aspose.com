---
title: aspose.svg.dom.css
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.svg.dom.css/
is_root: false
---

The **Aspose.Svg.Dom.Css**  namespace is for all CSS related manipulations.
It concentrates around CSS property name - value pairs
specified by CSS official documents.

### Classes
| Class | Description |
| :- | :- |
| [`CSSPrimitiveValue`](/svg/python-net/aspose.svg.dom.css/cssprimitivevalue) | The CSSPrimitiveValue interface represents a single CSS value. This interface may be used to determine the value of a specific style property currently set in a block or to set a specific style property explicitly within the block. An instance of this interface might be obtained from the getPropertyCSSValue method of the CSSStyleDeclaration interface. A CSSPrimitiveValue object only occurs in a context of a CSS property. |
| [`CSSValue`](/svg/python-net/aspose.svg.dom.css/cssvalue) | Represents a simple or a complex value. A CSSValue object only occurs in a context of a CSS property. |
| [`CSSValueList`](/svg/python-net/aspose.svg.dom.css/cssvaluelist) | The CSSValueList interface provides the abstraction of an ordered collection of CSS values. |
| [`Counter`](/svg/python-net/aspose.svg.dom.css/counter) | The Counter interface is used to represent any counter or counters function value. This interface reflects the values in the underlying style property. |
| [`ICSS2Properties`](/svg/python-net/aspose.svg.dom.css/icss2properties) | Provides interface for CSS2 properties set values manipulation in the context of certain HTML element |
| [`ICSSCharsetRule`](/svg/python-net/aspose.svg.dom.css/icsscharsetrule) | The CSSCharsetRule interface represents a @charset rule in a CSS style sheet. <br/>The value of the encoding attribute does not affect the encoding of text data in the DOM objects; this encoding is always UTF-16. After a stylesheet is loaded, the value of the encoding attribute is the value found in the @charset rule. If there was no @charset in the original document, then no CSSCharsetRule is created. <br/>The value of the encoding attribute may also be used as a hint for the encoding used on serialization of the style sheet. |
| [`ICSSCounterStyleRule`](/svg/python-net/aspose.svg.dom.css/icsscounterstylerule) | The @counter-style rule allows authors to define a custom counter style. |
| [`ICSSFontFaceRule`](/svg/python-net/aspose.svg.dom.css/icssfontfacerule) | The CSSFontFaceRule interface represents a @font-face rule in a CSS style sheet. The @font-face rule is used to hold a set of font descriptions. |
| [`ICSSImportRule`](/svg/python-net/aspose.svg.dom.css/icssimportrule) | The CSSImportRule interface represents a @import rule within a CSS style sheet. The @import rule is used to import style rules from other style sheets. |
| [`ICSSKeyframeRule`](/svg/python-net/aspose.svg.dom.css/icsskeyframerule) | The CSSKeyframeRule interface represents the style rule for a single key. |
| [`ICSSKeyframesRule`](/svg/python-net/aspose.svg.dom.css/icsskeyframesrule) | The CSSKeyframesRule interface represents a complete set of keyframes for a single animation |
| [`ICSSMarginRule`](/svg/python-net/aspose.svg.dom.css/icssmarginrule) | The CSSMarginRule interface represents a margin at-rule. |
| [`ICSSMediaRule`](/svg/python-net/aspose.svg.dom.css/icssmediarule) | The CSSMediaRule interface represents a @media rule in a CSS style sheet. A @media rule can be used to delimit style rules for specific media types. |
| [`ICSSPageRule`](/svg/python-net/aspose.svg.dom.css/icsspagerule) | The CSSPageRule interface represents a @page rule within a CSS style sheet. The @page rule is used to specify the dimensions, orientation, margins, etc. of a page box for paged media. |
| [`ICSSRule`](/svg/python-net/aspose.svg.dom.css/icssrule) | The CSSRule interface is the abstract base interface for any type of CSS statement. This includes both rule sets and at-rules. An implementation is expected to preserve all rules specified in a CSS style sheet, even if the rule is not recognized by the parser. Unrecognized rules are represented using the [`ICSSUnknownRule`](/svg/python-net/aspose.svg.dom.css/icssunknownrule) interface. |
| [`ICSSRuleList`](/svg/python-net/aspose.svg.dom.css/icssrulelist) | The CSSRuleList interface provides the abstraction of an ordered collection of CSS rules. |
| [`ICSSStyleDeclaration`](/svg/python-net/aspose.svg.dom.css/icssstyledeclaration) | The CSSStyleDeclaration interface represents a single CSS declaration block. This interface may be used to determine the style properties currently set in a block or to set style properties explicitly within the block. |
| [`ICSSStyleRule`](/svg/python-net/aspose.svg.dom.css/icssstylerule) | The CSSStyleRule interface represents a single rule set in a CSS style sheet. |
| [`ICSSStyleSheet`](/svg/python-net/aspose.svg.dom.css/icssstylesheet) | The CSSStyleSheet interface is a concrete interface used to represent a CSS style sheet i.e., a style sheet whose content type is "text/css". |
| [`ICSSUnknownRule`](/svg/python-net/aspose.svg.dom.css/icssunknownrule) | The CSSUnknownRule interface represents an at-rule not supported by this user agent. |
| [`ICSSValueList`](/svg/python-net/aspose.svg.dom.css/icssvaluelist) | The interface provides the abstraction of an ordered collection of CSS values. |
| [`IDocumentCSS`](/svg/python-net/aspose.svg.dom.css/idocumentcss) | This interface represents a document with a CSS view. |
| [`IDocumentStyle`](/svg/python-net/aspose.svg.dom.css/idocumentstyle) | The DocumentStyle interface provides a mechanism by which the style sheets embedded in a document can be retrieved. The expectation is that an instance of the DocumentStyle interface can be obtained by using binding-specific casting methods on an instance of the Document interface. |
| [`IElementCSSInlineStyle`](/svg/python-net/aspose.svg.dom.css/ielementcssinlinestyle) | Inline style information attached to elements is exposed through the style attribute. This represents the contents of the STYLE attribute for HTML elements (or elements in other schemas or DTDs which use the STYLE attribute in the same way). |
| [`ILinkStyle`](/svg/python-net/aspose.svg.dom.css/ilinkstyle) | The LinkStyle interface provides a mechanism by which a style sheet can be retrieved from the node responsible for linking it into a document. An instance of the LinkStyle interface can be obtained using binding-specific casting methods on an instance of a linking node (HTMLLinkElement, HTMLStyleElement or ProcessingInstruction in DOM Level 2). |
| [`IMediaList`](/svg/python-net/aspose.svg.dom.css/imedialist) | The MediaList interface provides the abstraction of an ordered collection of media, without defining or constraining how this collection is implemented. An empty list is the same as a list that contains the medium "all". |
| [`IStyleSheet`](/svg/python-net/aspose.svg.dom.css/istylesheet) | The StyleSheet interface is the abstract base interface for any type of style sheet. It represents a single style sheet associated with a structured document. |
| [`IStyleSheetList`](/svg/python-net/aspose.svg.dom.css/istylesheetlist) | The StyleSheetList interface provides the abstraction of an ordered collection of style sheets. |
| [`IViewCSS`](/svg/python-net/aspose.svg.dom.css/iviewcss) | This interface represents a CSS view. |
| [`RGBColor`](/svg/python-net/aspose.svg.dom.css/rgbcolor) | The RGBColor interface is used to represent any RGB color value. This interface reflects the values in the underlying style property. Hence, modifications made to the CSSPrimitiveValue objects modify the style property. |
| [`Rect`](/svg/python-net/aspose.svg.dom.css/rect) | The Rect interface is used to represent any rect value. This interface reflects the values in the underlying style property. Hence, modifications made to the CSSPrimitiveValue objects modify the style property. |


### Enumerations
| Enumeration | Description |
| :- | :- |
| [`CSSEngineMode`](/svg/python-net/aspose.svg.dom.css/cssenginemode) | Specifies CSSEngine mode |


