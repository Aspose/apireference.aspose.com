---
title: IXPathNSResolver Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.XPath.IXPathNSResolver interface. The XPathNSResolver interface permit prefix strings in the expression to be properly bound to namespaceURI strings. IXPathEvaluator can construct an implementation of IXPathNSResolver from a node or the interface may be implemented by any application
type: docs
weight: 3780
url: /net/aspose.svg.dom.xpath/ixpathnsresolver/
---
## IXPathNSResolver interface

The `XPathNSResolver` interface permit `prefix` strings in the expression to be properly bound to `namespaceURI` strings. [`IXPathEvaluator`](../ixpathevaluator/) can construct an implementation of `IXPathNSResolver` from a node, or the interface may be implemented by any application.

```csharp
public interface IXPathNSResolver
```

## Methods

| Name | Description |
| --- | --- |
| [LookupNamespaceURI](../../aspose.svg.dom.xpath/ixpathnsresolver/lookupnamespaceuri/)(string) | Look up the namespace URI associated to the given namespace prefix. The XPath evaluator must never call this with a `null` or empty argument, because the result of doing this is undefined. |

### See Also

* namespace [Aspose.Svg.Dom.XPath](../../aspose.svg.dom.xpath/)
* assembly [Aspose.SVG](../../)
