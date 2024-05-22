---
title: IXPathEvaluator class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.svg.dom.xpath/ixpathevaluator/
is_root: false
---

## IXPathEvaluator class

The evaluation of XPath expressions is provided by [`IXPathEvaluator`](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator).



The IXPathEvaluator type exposes the following members:

### Methods
| Method | Description |
| :- | :- |
| [create_expression](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator/create_expression/#str-aspose.svg.dom.xpath.IXPathNSResolver) | Creates a parsed XPath expression with resolved namespaces. This is useful <br/>when an expression will be reused in an application since it makes it possible <br/>to compile the expression string into a more efficient internal form and <br/>preresolve all namespace prefixes which occur within the expression. |
| [create_ns_resolver](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator/create_ns_resolver/#aspose.svg.dom.Node) | Adapts any DOM node to resolve namespaces so that an XPath expression can be easily evaluated<br/>relative to the context of the node where it appeared within the document. This adapter works<br/>like the DOM Level 3 method `lookupNamespaceURI` on nodes in resolving the namespaceURI<br/>from a given prefix using the current information available in the node's hierarchy at the time<br/>lookupNamespaceURI is called, also correctly resolving the implicit xml prefix. |
| [evaluate](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator/evaluate/#str-aspose.svg.dom.Node-aspose.svg.dom.xpath.IXPathNSResolver-aspose.svg.dom.xpath.XPathResultType-any) | Evaluates an XPath expression string and returns a result of the specified type if possible. |



### See Also
* module [`aspose.svg.dom.xpath`](..)
* class [`IXPathEvaluator`](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator)
