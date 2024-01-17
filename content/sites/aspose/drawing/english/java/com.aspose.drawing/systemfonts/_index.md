---
title: SystemFonts
second_title: Aspose.Drawing for Java API Reference
description: Specifies the fonts used to display text in Windows display elements.
type: docs
weight: 50
url: /java/com.aspose.drawing/systemfonts/
---
**Inheritance:**
java.lang.Object
```
public final class SystemFonts
```

Specifies the fonts used to display text in Windows display elements.
## Methods

| Method | Description |
| --- | --- |
| [getCaptionFont()](#getCaptionFont--) | Gets a [Font](../../com.aspose.drawing/font) that is used to display text in the title bars of windows. |
| [getSmallCaptionFont()](#getSmallCaptionFont--) | Gets a [Font](../../com.aspose.drawing/font) that is used to display text in the title bars of small windows, such as tool windows. |
| [getMenuFont()](#getMenuFont--) | Gets a [Font](../../com.aspose.drawing/font) that is used for menus. |
| [getStatusFont()](#getStatusFont--) | Gets a [Font](../../com.aspose.drawing/font) that is used to display text in the status bar. |
| [getMessageBoxFont()](#getMessageBoxFont--) | Gets a [Font](../../com.aspose.drawing/font) that is used for message boxes. |
| [getIconTitleFont()](#getIconTitleFont--) | Gets a [Font](../../com.aspose.drawing/font) that is used for icon titles. |
| [getDefaultFont()](#getDefaultFont--) | Gets the default font that applications can use for dialog boxes and forms. |
| [getDefaultImageFont()](#getDefaultImageFont--) | Gets the default font that applications can use for dialog boxes and forms. |
| [getDialogFont()](#getDialogFont--) | Gets a font that applications can use for dialog boxes and forms. |
| [getFontByName(String systemFontName)](#getFontByName-java.lang.String-) | Returns a font object that corresponds to the specified system font name. |
### getCaptionFont() {#getCaptionFont--}
```
public static Font getCaptionFont()
```


Gets a [Font](../../com.aspose.drawing/font) that is used to display text in the title bars of windows.

**Returns:**
[Font](../../com.aspose.drawing/font) - a [Font](../../com.aspose.drawing/font) that is used to display text in the title bars of windows.
### getSmallCaptionFont() {#getSmallCaptionFont--}
```
public static Font getSmallCaptionFont()
```


Gets a [Font](../../com.aspose.drawing/font) that is used to display text in the title bars of small windows, such as tool windows.

**Returns:**
[Font](../../com.aspose.drawing/font) - a [Font](../../com.aspose.drawing/font) that is used to display text in the title bars of small windows, such as tool windows.
### getMenuFont() {#getMenuFont--}
```
public static Font getMenuFont()
```


Gets a [Font](../../com.aspose.drawing/font) that is used for menus.

**Returns:**
[Font](../../com.aspose.drawing/font) - a [Font](../../com.aspose.drawing/font) that is used for menus.
### getStatusFont() {#getStatusFont--}
```
public static Font getStatusFont()
```


Gets a [Font](../../com.aspose.drawing/font) that is used to display text in the status bar.

**Returns:**
[Font](../../com.aspose.drawing/font) - a [Font](../../com.aspose.drawing/font) that is used to display text in the status bar.
### getMessageBoxFont() {#getMessageBoxFont--}
```
public static Font getMessageBoxFont()
```


Gets a [Font](../../com.aspose.drawing/font) that is used for message boxes.

**Returns:**
[Font](../../com.aspose.drawing/font) - a [Font](../../com.aspose.drawing/font) that is used for message boxes.
### getIconTitleFont() {#getIconTitleFont--}
```
public static Font getIconTitleFont()
```


Gets a [Font](../../com.aspose.drawing/font) that is used for icon titles.

**Returns:**
[Font](../../com.aspose.drawing/font) - a [Font](../../com.aspose.drawing/font) that is used for icon titles.
### getDefaultFont() {#getDefaultFont--}
```
public static Font getDefaultFont()
```


Gets the default font that applications can use for dialog boxes and forms.

**Returns:**
[Font](../../com.aspose.drawing/font) - The default [Font](../../com.aspose.drawing/font) of the system. The value returned will vary depending on the user's operating system and the local culture setting of their system.
### getDefaultImageFont() {#getDefaultImageFont--}
```
public static Font getDefaultImageFont()
```


Gets the default font that applications can use for dialog boxes and forms.

**Returns:**
[Font](../../com.aspose.imaging/font) - The default [Font](../../com.aspose.drawing/font) of the system. The value returned will vary depending on the user's operating system and the local culture setting of their system.
### getDialogFont() {#getDialogFont--}
```
public static Font getDialogFont()
```


Gets a font that applications can use for dialog boxes and forms.

**Returns:**
[Font](../../com.aspose.drawing/font) - A [Font](../../com.aspose.drawing/font) that can be used for dialog boxes and forms, depending on the operating system and local culture setting of the system.
### getFontByName(String systemFontName) {#getFontByName-java.lang.String-}
```
public static Font getFontByName(String systemFontName)
```


Returns a font object that corresponds to the specified system font name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| systemFontName | java.lang.String | The name of the system font you need a font object for. |

**Returns:**
[Font](../../com.aspose.drawing/font) - A [Font](../../com.aspose.drawing/font) if the specified name matches a value in [SystemFonts](../../com.aspose.drawing/systemfonts); otherwise, null.
