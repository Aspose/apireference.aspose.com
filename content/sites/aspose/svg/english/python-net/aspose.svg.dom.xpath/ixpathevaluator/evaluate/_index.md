---
title: evaluate method
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 40
url: /python-net/aspose.svg.dom.xpath/ixpathevaluator/evaluate/
is_root: false
---

## evaluate {#str-aspose.svg.dom.Node-aspose.svg.dom.xpath.IXPathNSResolver-aspose.svg.dom.xpath.XPathResultType-any}

Evaluates an XPath expression string and returns a result of the specified type if possible.


### Returns 


The result of the evaluation of the XPath expression. For XPath 1.0 results, this object 
will be of type [`IXPathResult`](/svg/python-net/aspose.svg.dom.xpath/ixpathresult).


```python
def evaluate(self, expression, context_node, resolver, type, result):
    ...
```


| Parameter | Type | Description |
| :- | :- | :- |
| expression | str | The XPath expression string to be parsed and evaluated. |
| context_node | [`Node`](/svg/python-net/aspose.svg.dom/node) | The `context` is context node for the evaluation of this <br/>XPath expression. If the [`IXPathEvaluator`](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator) was obtained by casting the <br/>[`Document`](/svg/python-net/aspose.svg.dom/document) then this must be owned by the same document and must be a <br/>[`Document`](/svg/python-net/aspose.svg.dom/document), [`Element`](/svg/python-net/aspose.svg.dom/element), [`Attr`](/svg/python-net/aspose.svg.dom/attr), [`Text`](/svg/python-net/aspose.svg.dom/text), <br/>[`CDATASection`](/svg/python-net/aspose.svg.dom/cdatasection), [`Comment`](/svg/python-net/aspose.svg.dom/comment), [`ProcessingInstruction`](/svg/python-net/aspose.svg.dom/processinginstruction), <br/>or XPathNamespace node. If the context node is a [`Text`](/svg/python-net/aspose.svg.dom/text) or a <br/>[`CDATASection`](/svg/python-net/aspose.svg.dom/cdatasection), then the context is interpreted as the whole logical text node <br/>as seen by XPath, unless the node is empty in which case it may not serve as the XPath context. |
| resolver | [`IXPathNSResolver`](/svg/python-net/aspose.svg.dom.xpath/ixpathnsresolver) | The `resolver` permits translation of all prefixes, including <br/>the `xml` namespace prefix, within the XPath expression into appropriate namespace URIs. <br/>If this is specified as `null`, any namespace prefix within the expression will result <br/>in [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) being thrown with the code `NAMESPACE_ERR`. |
| type | [`XPathResultType`](/svg/python-net/aspose.svg.dom.xpath/xpathresulttype) | If a specific `type` is specified, then the result will be returned as <br/>the corresponding type. For XPath 1.0 results, this must be one of the values of the <br/>[`XPathResultType`](/svg/python-net/aspose.svg.dom.xpath/xpathresulttype) enum. |
| result | any | The `result` specifies a specific result object which may be reused <br/>and returned by this method. If this is specified as `null` or the implementation does not <br/>reuse the specified result, a new result object will be constructed and returned. For XPath 1.0 <br/>results, this object will be of type [`IXPathResult`](/svg/python-net/aspose.svg.dom.xpath/ixpathresult). |
### Exceptions
| Exception | Description |
| :- | :- |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | INVALID_EXPRESSION_ERR: Raised if the expression is not legal according <br/>to the rules of the [`IXPathEvaluator`](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator). |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | TYPE_ERR: Raised if the result cannot be converted to return the <br/>specified type. |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | NAMESPACE_ERR: Raised if the expression contains namespace prefixes <br/>which cannot be resolved by the specified [`IXPathNSResolver`](/svg/python-net/aspose.svg.dom.xpath/ixpathnsresolver). |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | WRONG_DOCUMENT_ERR: The Node is from a document that is not supported <br/>by this [`IXPathEvaluator`](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator). |
| [`DOMException`](/svg/python-net/aspose.svg.dom/domexception) | NOT_SUPPORTED_ERR: The Node is not a type permitted as an XPath context <br/>node or the request type is not permitted by this [`IXPathEvaluator`](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator). |





### See Also
* module [`aspose.svg.dom.xpath`](../../)
* class [`Attr`](/svg/python-net/aspose.svg.dom/attr)
* class [`CDATASection`](/svg/python-net/aspose.svg.dom/cdatasection)
* class [`Comment`](/svg/python-net/aspose.svg.dom/comment)
* class [`DOMException`](/svg/python-net/aspose.svg.dom/domexception)
* class [`Document`](/svg/python-net/aspose.svg.dom/document)
* class [`Element`](/svg/python-net/aspose.svg.dom/element)
* class [`IXPathEvaluator`](/svg/python-net/aspose.svg.dom.xpath/ixpathevaluator)
* class [`IXPathNSResolver`](/svg/python-net/aspose.svg.dom.xpath/ixpathnsresolver)
* class [`IXPathResult`](/svg/python-net/aspose.svg.dom.xpath/ixpathresult)
* class [`ProcessingInstruction`](/svg/python-net/aspose.svg.dom/processinginstruction)
* class [`Text`](/svg/python-net/aspose.svg.dom/text)
* class [`XPathResultType`](/svg/python-net/aspose.svg.dom.xpath/xpathresulttype)
