---
title: HyperlinkCollector.CollectHyperlinks
second_title: Aspose.Page for .NET API Reference
description: HyperlinkCollector method. Collects XPS elements with hyperlinks of all types
type: docs
weight: 10
url: /net/aspose.page.xps.features/hyperlinkcollector/collecthyperlinks/
---
## CollectHyperlinks(XpsDocument) {#collecthyperlinks}

Collects XPS elements with hyperlinks of all types.

```csharp
public static ICollection<XpsHyperlinkElement> CollectHyperlinks(XpsDocument document)
```

| Parameter | Type | Description |
| --- | --- | --- |
| document | XpsDocument | The XPS document. |

### Return Value

The collection containing hyperlinked XPS elements.

### See Also

* class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* class [HyperlinkCollector](../)
* namespace [Aspose.Page.XPS.Features](../../hyperlinkcollector/)
* assembly [Aspose.Page](../../../)

---

## CollectHyperlinks&lt;T&gt;(XpsDocument) {#collecthyperlinks_1}

Collects XPS elements with hyperlinks of a certain type.

```csharp
public static ICollection<XpsHyperlinkElement> CollectHyperlinks<T>(XpsDocument document)
    where T : XpsHyperlinkTarget
```

| Parameter | Description |
| --- | --- |
| T | The type of the hyperlink target object. |
| document | The XPS document. |

### Return Value

The collection containing hyperlinked XPS elements.

### See Also

* class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* class [XpsHyperlinkTarget](../../../aspose.page.xps.xpsmodel/xpshyperlinktarget/)
* class [HyperlinkCollector](../)
* namespace [Aspose.Page.XPS.Features](../../hyperlinkcollector/)
* assembly [Aspose.Page](../../../)


