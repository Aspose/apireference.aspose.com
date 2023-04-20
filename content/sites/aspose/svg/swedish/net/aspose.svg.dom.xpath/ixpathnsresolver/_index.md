---
title: Interface IXPathNSResolver
second_title: Aspose.SVG för .NET API Referens
description: Aspose.Svg.Dom.XPath.IXPathNSResolver gränssnitt. DenXPathNSResolver gränssnittstillståndprefix strängar i uttrycket som ska bindas korrekt tillnamnutrymmeURI strängar. IXPathEvaluator kan konstruera en implementering av IXPathNSResolver från en nod eller så kan gränssnittet implementeras av vilken applikation som helst.
type: docs
weight: 1330
url: /sv/net/aspose.svg.dom.xpath/ixpathnsresolver/
---
## IXPathNSResolver interface

Den`XPathNSResolver` gränssnittstillstånd`prefix` strängar i uttrycket som ska bindas korrekt till`namnutrymmeURI` strängar. [`IXPathEvaluator`](../ixpathevaluator/) kan konstruera en implementering av `IXPathNSResolver` från en nod, eller så kan gränssnittet implementeras av vilken applikation som helst.

```csharp
public interface IXPathNSResolver
```

## Metoder

| namn | Beskrivning |
| --- | --- |
| [LookupNamespaceURI](../../aspose.svg.dom.xpath/ixpathnsresolver/lookupnamespaceuri/)(string) | Slå upp namnutrymmes-URI som är kopplat till det givna namnområdesprefixet. XPath-utvärderaren får aldrig kalla detta med en`null` eller tomt argument, eftersom resultatet av att göra detta är odefinierat. |

### Se även

* namnutrymme [Aspose.Svg.Dom.XPath](../../aspose.svg.dom.xpath/)
* hopsättning [Aspose.SVG](../../)


