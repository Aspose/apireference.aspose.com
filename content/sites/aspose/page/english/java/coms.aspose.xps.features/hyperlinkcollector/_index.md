---
title: HyperlinkCollector
second_title: Aspose.Page for Java API Reference
description: The class provides collecting hyperlinked XPS elements from the current page of an XPS document.
type: docs
weight: 10
url: /java/coms.aspose.xps.features/hyperlinkcollector/
---
**Inheritance:**
java.lang.Object
```
public class HyperlinkCollector
```

The class provides collecting hyperlinked XPS elements from the current page of an XPS document.
## Methods

| Method | Description |
| --- | --- |
| [collectHyperlinks(XpsDocument document)](#collectHyperlinks-com.aspose.xps.XpsDocument-) | Collects XPS elements with hyperlinks of all types. |
| [<T>collectHyperlinks(XpsDocument document, Class<T> cls)](#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--) | Collects XPS elements with hyperlinks of a certain type. |
### collectHyperlinks(XpsDocument document) {#collectHyperlinks-com.aspose.xps.XpsDocument-}
```
public static Collection<XpsHyperlinkElement> collectHyperlinks(XpsDocument document)
```


Collects XPS elements with hyperlinks of all types.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | The XPS document. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - The collection containing hyperlinked XPS elements.
### <T>collectHyperlinks(XpsDocument document, Class<T> cls) {#-T-collectHyperlinks-com.aspose.xps.XpsDocument-java.lang.Class-T--}
```
public static Collection<XpsHyperlinkElement> <T>collectHyperlinks(XpsDocument document, Class<T> cls)
```


Collects XPS elements with hyperlinks of a certain type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| document | [XpsDocument](../../com.aspose.xps/xpsdocument) | The XPS document. |
| cls | java.lang.Class<T> | The class object corresponding to the hyperlink target type to filter out. |

**Returns:**
java.util.Collection<com.aspose.xps.XpsHyperlinkElement> - The collection containing hyperlinked XPS elements.
