---
title: Document.GetElementById
second_title: Aspose.SVG for .NET API Reference
description: Document GetElementById method. This method returns an Element object representing the element whose id property matches the specified string. Since element IDs are required to be unique if specified theyre a useful way to get access to a specific element quickly
type: docs
weight: 960
url: /net/aspose.svg.dom/document/getelementbyid/
---
## Document.GetElementById method

This method returns an [`Element`](../../element/) object representing the element whose id property matches the specified string. Since element IDs are required to be unique if specified, they're a useful way to get access to a specific element quickly.

If you need to get access to an element which doesn't have an ID, you can use [`QuerySelector`](../queryselector/) to find the element using any selector.

```csharp
public Element GetElementById(string elementId)
```

| Parameter | Type | Description |
| --- | --- | --- |
| elementId | String | The ID of the element to locate. The ID is case-sensitive string which is unique within the document; only one element may have any given ID. |

### Return Value

An [`Element`](../../element/) object describing the DOM element object matching the specified ID, or null if no matching element was found in the document.

## Remarks

Refer to official [spec](https://dom.spec.whatwg.org/#dom-nonelementparentnode-getelementbyid).

### See Also

* class [Element](../../element/)
* class [Document](../)
* namespace [Aspose.Svg.Dom](../../../aspose.svg.dom/)
* assembly [Aspose.SVG](../../../)
