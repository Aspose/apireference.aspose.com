---
title: IStyleSheet.Href
second_title: Aspose.HTML for .NET API Reference
description: IStyleSheet Href property. The href property of the StyleSheet interface returns the location of the style sheet
type: docs
weight: 20
url: /net/aspose.html.dom.css/istylesheet/href/
---
## IStyleSheet.Href property

The href property of the [`StyleSheet`](../) interface returns the location of the style sheet.

```csharp
public string Href { get; }
```

### Property Value

uri is a string containing the stylesheet's URI.

## Remarks

If the style sheet is a linked style sheet, the value of its attribute is its location. For inline style sheets, the value of this attribute is NULL.

This property is read-only in Firefox, Opera, Google Chrome, and Safari, and it is read/write in Internet Explorer.

[CSSOM](https://drafts.csswg.org/cssom/) defines APIs (including generic parsing and serialization rules) for Media Queries, Selectors, and of course CSS itself.

Reference

[CSS Working Group](https://wiki.csswg.org/) - The CSS Working Group is the W3C working group chartered to develop Cascading Style Sheets (CSS).[CSS Object Model (CSSOM)](https://drafts.csswg.org/cssom/) - CSSOM defines APIs (including generic parsing and serialization rules) for Media Queries, Selectors, and of course CSS itself.[CSS Object Model (CSSOM) # dom-stylesheet-href](https://drafts.csswg.org/cssom/#dom-stylesheet-href) – The CSSOM definition.

### See Also

* interface [IStyleSheet](../)
* namespace [Aspose.Html.Dom.Css](../../../aspose.html.dom.css/)
* assembly [Aspose.HTML](../../../)
