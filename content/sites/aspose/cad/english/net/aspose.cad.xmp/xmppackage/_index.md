---
title: Class XmpPackage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.Xmp.XmpPackage class. Represents base abstraction for XMP package
type: docs
weight: 37140
url: /net/aspose.cad.xmp/xmppackage/
---
## XmpPackage class

Represents base abstraction for XMP package.

```csharp
public class XmpPackage : IEnumerable<KeyValuePair<string, object>>, IXmlValue
```

## Properties

| Name | Description |
| --- | --- |
| virtual [Item](../../aspose.cad.xmp/xmppackage/item/) { get; set; } | Gets or sets the Object with the specified key. |
| virtual [Keys](../../aspose.cad.xmp/xmppackage/keys/) { get; } | Gets the keys in XMP package. |
| [NamespaceUri](../../aspose.cad.xmp/xmppackage/namespaceuri/) { get; } | Gets the namespace URI. |
| [Prefix](../../aspose.cad.xmp/xmppackage/prefix/) { get; } | Gets the prefix. |
| [XmlNamespace](../../aspose.cad.xmp/xmppackage/xmlnamespace/) { get; } | Gets the XML namespace. |

## Methods

| Name | Description |
| --- | --- |
| virtual [AddValue](../../aspose.cad.xmp/xmppackage/addvalue/)(string, string) | Adds the value. |
| virtual [Clear](../../aspose.cad.xmp/xmppackage/clear/)() | Clears this instance. |
| virtual [ContainsKey](../../aspose.cad.xmp/xmppackage/containskey/)(string) | Determines whether the specified key contains key. |
| [GetEnumerator](../../aspose.cad.xmp/xmppackage/getenumerator/)() | Returns an enumerator that iterates through the collection. |
| virtual [GetXmlValue](../../aspose.cad.xmp/xmppackage/getxmlvalue/)() | Converts XMP value to the XML representation. |
| virtual [Remove](../../aspose.cad.xmp/xmppackage/remove/)(string) | Remove the value with the specified key. |
| virtual [SetValue](../../aspose.cad.xmp/xmppackage/setvalue/)(string, IXmlValue) | Sets the value. |
| virtual [SetXmpTypeValue](../../aspose.cad.xmp/xmppackage/setxmptypevalue/)(string, XmpTypeBase) | Sets the XMP type value. |

### See Also

* interface [IXmlValue](../ixmlvalue/)
* namespace [Aspose.CAD.Xmp](../../aspose.cad.xmp/)
* assembly [Aspose.CAD](../../)


