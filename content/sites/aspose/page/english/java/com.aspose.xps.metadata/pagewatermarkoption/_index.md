---
title: PageWatermark.PageWatermarkOption
second_title: Aspose.Page for Java API Reference
description: Describes the PageWatermark features options.
type: docs
weight: 12
url: /java/com.aspose.xps.metadata/pagewatermark.pagewatermarkoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem](../../com.aspose.xps.metadata/ipagewatermarkitem)
```
public static final class PageWatermark.PageWatermarkOption extends Option implements PageWatermark.IPageWatermarkItem
```

Describes the \`\`\` PageWatermark \`\`\` features options.
## Constructors

| Constructor | Description |
| --- | --- |
| [PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)](#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | Creates a new instance. |
| [PageWatermarkOption(PageWatermark.PageWatermarkOption option)](#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-) | Clones this option instance. |
## Fields

| Field | Description |
| --- | --- |
| [Text](#Text) | Specifies a text only watermark. |
## Methods

| Method | Description |
| --- | --- |
| [add(PageWatermark.IPageWatermarkOptionItem[] items)](#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-) | Adds an array of \`\`\` IPageWatermarkOptionItem \`\`\` instances to the option. |
| [clone()](#clone--) | Clones this option instance. |
### PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items) {#PageWatermarkOption-java.lang.String-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermarkOption(String optionName, PageWatermark.IPageWatermarkOptionItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| optionName | java.lang.String | An options name. |
| items | com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem[] | An arbitrary array of \`\`\` IPageWatermarkOptionItem \`\`\` instances. |

### PageWatermarkOption(PageWatermark.PageWatermarkOption option) {#PageWatermarkOption-com.aspose.xps.metadata.PageWatermark.PageWatermarkOption-}
```
public PageWatermarkOption(PageWatermark.PageWatermarkOption option)
```


Clones this option instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| option | [PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) | An instance to clone. |

### Text {#Text}
```
public static PageWatermark.PageWatermarkOption Text
```


Specifies a text only watermark.

### add(PageWatermark.IPageWatermarkOptionItem[] items) {#add-com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem...-}
```
public PageWatermark.PageWatermarkOption add(PageWatermark.IPageWatermarkOptionItem[] items)
```


Adds an array of \`\`\` IPageWatermarkOptionItem \`\`\` instances to the option.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.PageWatermark.IPageWatermarkOptionItem[] | An arbitrary array of \`\`\` IPageWatermarkOptionItem \`\`\` instances. |

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - This options instance.
### clone() {#clone--}
```
public PageWatermark.PageWatermarkOption clone()
```


Clones this option instance. The shortcut to the cloneing constructor.

**Returns:**
[PageWatermarkOption](../../com.aspose.xps.metadata/pagewatermarkoption) - The clone of this option instance.
