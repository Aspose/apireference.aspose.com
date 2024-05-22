---
title: evaluate method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 220
url: /python-net/aspose.svg.dom/document/evaluate/
is_root: false
---

## evaluate {#str-aspose.svg.dom.Node-aspose.svg.dom.xpath.IXPathNSResolver-aspose.svg.dom.xpath.XPathResultType-any}

Evaluates an XPath expression string and returns a result of the specified type if possible.


### Returns 


The result of the evaluation of the XPath expression.


```python
def evaluate(self, expression, context_node, resolver, type, result):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| expression | str | The XPath expression string to be parsed and evaluated. |
| context_node | [`Node`](/svg/python-net/aspose.svg.dom/node) | The context is context node for the evaluation of this XPath expression. |
| resolver | aspose.svg.dom.xpath.IXPathNSResolver | The resolver permits translation of all prefixes, including the xml<br/>namespace prefix, within the XPath expression into appropriate namespace URIs. |
| type | aspose.svg.dom.xpath.XPathResultType | If a specific type is specified, then the result will be returned as the corresponding type. |
| result | any | The result specifies a specific result object which may be reused and returned by this method. |



### See Also
* module [`aspose.svg.dom`](../../)
* class [`Document`](/svg/python-net/aspose.svg.dom/document)
* class [`IXPathResult`](/svg/python-net/aspose.svg.dom.xpath/ixpathresult)
