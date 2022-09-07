---
title: Duplex.DuplexOption
second_title: Aspose.Page for Java API Reference
description: Describes the JobDuplexAllDocumentsContiguously and DocumentDuplex features options.
type: docs
weight: 11
url: /java/com.aspose.xps.metadata/duplex.duplexoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Duplex.DuplexOption extends Option
```

Describes the \`\`\` JobDuplexAllDocumentsContiguously \`\`\` and \`\`\` DocumentDuplex \`\`\` features options.
## Fields

| Field | Description |
| --- | --- |
| [OneSided](#OneSided) | Specifies one sided printing. |
## Methods

| Method | Description |
| --- | --- |
| [twoSidedShortEdge(Duplex.DuplexMode duplexMode)](#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | Specifies two sided printing such that the page is flipped parallel to the \`\`\` MediaSizeWidth \`\`\` direction. |
| [twoSidedLongEdge(Duplex.DuplexMode duplexMode)](#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-) | Specifies two sided printing such that the page is flipped parallel to the \`\`\` MediaSizeHeight \`\`\` direction. |
### OneSided {#OneSided}
```
public static Duplex.DuplexOption OneSided
```


Specifies one sided printing.

### twoSidedShortEdge(Duplex.DuplexMode duplexMode) {#twoSidedShortEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static Duplex.DuplexOption twoSidedShortEdge(Duplex.DuplexMode duplexMode)
```


Specifies two sided printing such that the page is flipped parallel to the \`\`\` MediaSizeWidth \`\`\` direction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | The \`\`\` DuplexMode \`\`\` |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The

```java
Duplex
```

option.
### twoSidedLongEdge(Duplex.DuplexMode duplexMode) {#twoSidedLongEdge-com.aspose.xps.metadata.Duplex.DuplexMode-}
```
public static Duplex.DuplexOption twoSidedLongEdge(Duplex.DuplexMode duplexMode)
```


Specifies two sided printing such that the page is flipped parallel to the \`\`\` MediaSizeHeight \`\`\` direction.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| duplexMode | [DuplexMode](../../com.aspose.xps.metadata/duplexmode) | The \`\`\` DuplexMode \`\`\` |

**Returns:**
[DuplexOption](../../com.aspose.xps.metadata/duplexoption) - The \`\`\` Duplex \`\`\` option.
