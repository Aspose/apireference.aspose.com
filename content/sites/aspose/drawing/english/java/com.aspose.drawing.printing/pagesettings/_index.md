---
title: PageSettings
second_title: Aspose.Drawing for Java API Reference
description: Specifies settings that apply to a single printed page.
type: docs
weight: 10
url: /java/com.aspose.drawing.printing/pagesettings/
---
**Inheritance:**
java.lang.Object
```
public class PageSettings
```

Specifies settings that apply to a single, printed page.
## Constructors

| Constructor | Description |
| --- | --- |
| [PageSettings()](#PageSettings--) |  |
## Methods

| Method | Description |
| --- | --- |
| [getBounds()](#getBounds--) | Gets the size of the page, taking into account the page orientation specified by the [PageSettings](../../com.aspose.drawing.printing/pagesettings) property . |
| [getHardMarginX()](#getHardMarginX--) | Gets the x-coordinate, in hundredths of an inch, of the hard margin at the left of the page. |
| [getHardMarginY()](#getHardMarginY--) | Gets the y-coordinate, in hundredths of an inch, of the hard margin at the top of the page. |
| [getPrinterResolution()](#getPrinterResolution--) | Gets the printer resolution for the page. |
### PageSettings() {#PageSettings--}
```
public PageSettings()
```


### getBounds() {#getBounds--}
```
public final Rectangle getBounds()
```


Gets the size of the page, taking into account the page orientation specified by the [PageSettings](../../com.aspose.drawing.printing/pagesettings) property .

**Returns:**
[Rectangle](../../com.aspose.drawing/rectangle) - A [Rectangle](../../com.aspose.drawing/rectangle) that represents the length and width, in hundredths of an inch, of the page.
### getHardMarginX() {#getHardMarginX--}
```
public final float getHardMarginX()
```


Gets the x-coordinate, in hundredths of an inch, of the hard margin at the left of the page.

**Returns:**
float - The x-coordinate, in hundredths of an inch, of the left-hand hard margin.
### getHardMarginY() {#getHardMarginY--}
```
public final float getHardMarginY()
```


Gets the y-coordinate, in hundredths of an inch, of the hard margin at the top of the page.

**Returns:**
float - The y-coordinate, in hundredths of an inch, of the hard margin at the top of the page.
### getPrinterResolution() {#getPrinterResolution--}
```
public final PrinterResolution getPrinterResolution()
```


Gets the printer resolution for the page.

**Returns:**
[PrinterResolution](../../com.aspose.drawing.printing/printerresolution) - A `PrinterResolution`([.getPrinterResolution](../../null/\#getPrinterResolution)) that specifies the printer resolution for the page. The default is the printer's default resolution.
