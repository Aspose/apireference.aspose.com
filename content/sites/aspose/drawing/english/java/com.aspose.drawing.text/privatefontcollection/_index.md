---
title: PrivateFontCollection
second_title: Aspose.Drawing for Java API Reference
description: Provides a collection of font families built from font files that are provided by the client application.
type: docs
weight: 13
url: /java/com.aspose.drawing.text/privatefontcollection/
---
**Inheritance:**
java.lang.Object, [com.aspose.drawing.FontCollection](../../com.aspose.drawing/fontcollection)
```
public final class PrivateFontCollection extends FontCollection
```

Provides a collection of font families built from font files that are provided by the client application.
## Constructors

| Constructor | Description |
| --- | --- |
| [PrivateFontCollection()](#PrivateFontCollection--) | Initializes a new instance of the [PrivateFontCollection](../../com.aspose.drawing.text/privatefontcollection) class. |
## Methods

| Method | Description |
| --- | --- |
| [addFontFile(String filename)](#addFontFile-java.lang.String-) | Adds a font from the specified file to this [PrivateFontCollection](../../com.aspose.drawing.text/privatefontcollection). |
| [addMemoryFont(byte[] memory, int length)](#addMemoryFont-byte---int-) | Adds a font contained in system memory to this [PrivateFontCollection](../../com.aspose.drawing.text/privatefontcollection). |
### PrivateFontCollection() {#PrivateFontCollection--}
```
public PrivateFontCollection()
```


Initializes a new instance of the [PrivateFontCollection](../../com.aspose.drawing.text/privatefontcollection) class.

### addFontFile(String filename) {#addFontFile-java.lang.String-}
```
public void addFontFile(String filename)
```


Adds a font from the specified file to this [PrivateFontCollection](../../com.aspose.drawing.text/privatefontcollection).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| filename | java.lang.String | A String that contains the file name of the font to add. |

### addMemoryFont(byte[] memory, int length) {#addMemoryFont-byte---int-}
```
public void addMemoryFont(byte[] memory, int length)
```


Adds a font contained in system memory to this [PrivateFontCollection](../../com.aspose.drawing.text/privatefontcollection).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| memory | byte[] | The memory address of the font to add. |
| length | int | The memory length of the font to add. |

