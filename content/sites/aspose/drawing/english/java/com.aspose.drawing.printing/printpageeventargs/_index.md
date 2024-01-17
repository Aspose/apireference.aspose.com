---
title: PrintPageEventArgs
second_title: Aspose.Drawing for Java API Reference
description: Provides data for the EPrintDocument.PrintPage event.
type: docs
weight: 13
url: /java/com.aspose.drawing.printing/printpageeventargs/
---
**Inheritance:**
java.lang.Object
```
public class PrintPageEventArgs
```

Provides data for the `E:PrintDocument.PrintPage` event.
## Constructors

| Constructor | Description |
| --- | --- |
| [PrintPageEventArgs()](#PrintPageEventArgs--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getGraphics()](#getGraphics--) | Gets the `Graphics`([.getGraphics](../../null/\#getGraphics)) used to paint the page. |
| [hasMorePages()](#hasMorePages--) | Gets a value indicating whether an additional page should be printed. |
| [setMorePages(boolean value)](#setMorePages-boolean-) | Sets a value indicating whether an additional page should be printed. |
| [getPageSettings()](#getPageSettings--) | Gets the page settings for the current page. |
### PrintPageEventArgs() {#PrintPageEventArgs--}
```
public PrintPageEventArgs()
```


### getGraphics() {#getGraphics--}
```
public final Graphics getGraphics()
```


Gets the `Graphics`([.getGraphics](../../null/\#getGraphics)) used to paint the page.

**Returns:**
[Graphics](../../com.aspose.drawing/graphics) - The `Graphics`([.getGraphics](../../null/\#getGraphics)) used to paint the page.
### hasMorePages() {#hasMorePages--}
```
public final boolean hasMorePages()
```


Gets a value indicating whether an additional page should be printed.

**Returns:**
boolean - `true` if an additional page should be printed; otherwise, false. The default is `false`.
### setMorePages(boolean value) {#setMorePages-boolean-}
```
public final void setMorePages(boolean value)
```


Sets a value indicating whether an additional page should be printed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | a value indicating whether an additional page should be printed. |

### getPageSettings() {#getPageSettings--}
```
public final PageSettings getPageSettings()
```


Gets the page settings for the current page.

**Returns:**
[PageSettings](../../com.aspose.drawing.printing/pagesettings) - The page settings for the current page.
