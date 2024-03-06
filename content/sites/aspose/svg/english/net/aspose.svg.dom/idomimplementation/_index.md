---
title: IDOMImplementation Interface
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Dom.IDOMImplementation interface. The DOMImplementation interface provides a number of methods for performing operations that are independent of any particular instance of the document object model
type: docs
weight: 3640
url: /net/aspose.svg.dom/idomimplementation/
---
## IDOMImplementation interface

The DOMImplementation interface provides a number of methods for performing operations that are independent of any particular instance of the document object model.

```csharp
public interface IDOMImplementation
```

## Methods

| Name | Description |
| --- | --- |
| [CreateDocument](../../aspose.svg.dom/idomimplementation/createdocument/)(string, string, DocumentType) | Creates a DOM Document object of the specified type with its document element. |
| [CreateDocumentType](../../aspose.svg.dom/idomimplementation/createdocumenttype/)(string, string, string) | Creates an empty DocumentType node. Entity declarations and notations are not made available. Entity reference expansions and default attribute additions do not occur. |
| [CreateHTMLDocument](../../aspose.svg.dom/idomimplementation/createhtmldocument/)(string) | Returns a document, with a basic tree already constructed including a title element, unless the title argument is omitted. |
| [HasFeature](../../aspose.svg.dom/idomimplementation/hasfeature/)() | Test if the DOM implementation implements a specific feature and version, as specified in DOM Features. |

### See Also

* namespace [Aspose.Svg.Dom](../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../)
