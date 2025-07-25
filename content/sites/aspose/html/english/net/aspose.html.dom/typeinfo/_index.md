---
title: TypeInfo Class
second_title: Aspose.HTML for .NET API Reference
description: Aspose.Html.Dom.TypeInfo class. The TypeInfo represents a type referenced from Element or Attr nodes specified in the schemas associated with the document
type: docs
weight: 2700
url: /net/aspose.html.dom/typeinfo/
---
## TypeInfo class

The TypeInfo represents a type referenced from Element or Attr nodes, specified in the schemas associated with the document.

```csharp
public class TypeInfo : DOMObject
```

## Properties

| Name | Description |
| --- | --- |
| [TypeName](../../aspose.html.dom/typeinfo/typename/) { get; } | The name of a type declared for the associated element or attribute, or null if unknown. |
| [TypeNamespace](../../aspose.html.dom/typeinfo/typenamespace/) { get; } | Gets the type namespace.The namespace of the type declared for the associated element or attribute or null if the element does not have declaration or if no namespace information is available. |

## Methods

| Name | Description |
| --- | --- |
| virtual [GetPlatformType](../../aspose.html.dom/domobject/getplatformtype/)() | This method is used to retrieve the ECMAScript object Type. |
| [IsDerivedFrom](../../aspose.html.dom/typeinfo/isderivedfrom/)(*string, string, ulong*) | This method returns if there is a derivation between the reference type definition, i.e. the TypeInfo on which the method is being called, and the other type definition, i.e. the one passed as parameters. |

## Fields

| Name | Description |
| --- | --- |
| const [DERIVATION_EXTENSION](../../aspose.html.dom/typeinfo/derivation_extension/) | If the document's schema is an XML Schema [XML Schema Part 1], this constant represents the derivation by extension. |
| const [DERIVATION_LIST](../../aspose.html.dom/typeinfo/derivation_list/) | If the document's schema is an XML Schema [XML Schema Part 1], this constant represents the list. |
| const [DERIVATION_RESTRICTION](../../aspose.html.dom/typeinfo/derivation_restriction/) | If the document's schema is an XML Schema [XML Schema Part 1], this constant represents the derivation by restriction if complex types are involved, or a restriction if simple types are involved. |
| const [DERIVATION_UNION](../../aspose.html.dom/typeinfo/derivation_union/) | If the document's schema is an XML Schema [XML Schema Part 1], this constant represents the union if simple types are involved. |

### See Also

* class [DOMObject](../domobject/)
* namespace [Aspose.Html.Dom](../../aspose.html.dom/)
* assembly [Aspose.HTML](../../)
