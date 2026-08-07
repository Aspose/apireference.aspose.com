---
title: "LoadOptions"
linktitle: "LoadOptions"
second_title: "Aspose.CAD for Java"
description: "Represents the loading options."
type: docs
weight: 10
url: /java/com.aspose.cad/loadoptions/
---

Represents the loading options.

## Constructors

| Constructor | Description |
| --- | --- |
| [LoadOptions()](#LoadOptions) |  |

## Methods

| Method | Description |
| --- | --- |
| [getCustomFontFolderOptions()](#getCustomFontFolderOptions) | Options to control behaviour of custom font folder. |
| [setCustomFontFolderOptions(int value)](#setCustomFontFolderOptions-int) | Options to control behaviour of custom font folder. |
| [getCustomFontFolders()](#getCustomFontFolders) | Sets the custom font folders. Pass null to reset to default folders. |
| [setCustomFontFolders(String[] value)](#setCustomFontFolders-java.lang.String:A) | Sets the custom font folders. Pass null to reset to default folders. |
| [getSpecifiedEncoding()](#getSpecifiedEncoding) | Gets or sets the specified encoding. |
| [setSpecifiedEncoding(int value)](#setSpecifiedEncoding-int) | Gets or sets the specified encoding. |
| [getSpecifiedMifEncoding()](#getSpecifiedMifEncoding) | Gets or sets encoding for MIF characters |
| [setSpecifiedMifEncoding(int value)](#setSpecifiedMifEncoding-int) | Gets or sets encoding for MIF characters |
| [getDataBackgroundColor()](#getDataBackgroundColor) | Gets or sets the Image background Color . |
| [setDataBackgroundColor(com.aspose.cad.Color value)](#setDataBackgroundColor-com.aspose.cad.Color) | Gets or sets the Image background Color . |
| [getUnloadOnDispose()](#getUnloadOnDispose) | Whether to unload all data and free memory when Dispose is called |
| [setUnloadOnDispose(boolean value)](#setUnloadOnDispose-boolean) | Whether to unload all data and free memory when Dispose is called |
| [getRecoverMalformedCifMif()](#getRecoverMalformedCifMif) | Whether to recover non-escaped CIF (U+XXXX) and MIF (M+nXXXX) character notations |
| [setRecoverMalformedCifMif(boolean value)](#setRecoverMalformedCifMif-boolean) | Whether to recover non-escaped CIF (U+XXXX) and MIF (M+nXXXX) character notations |
| [getIgnoreErrors()](#getIgnoreErrors) | Whether to ignore load errors. |
| [setIgnoreErrors(boolean value)](#setIgnoreErrors-boolean) | Whether to ignore load errors. |
| [getErrors()](#getErrors) | Gets the list of loading errors. |
| [getInterruptionToken()](#getInterruptionToken) | Token that can be used to interrupt export operation |
| [setInterruptionToken(InterruptionToken value)](#setInterruptionToken-com.aspose.cad.InterruptionToken) | Token that can be used to interrupt export operation |

### LoadOptions() {#LoadOptions}
```java
public LoadOptions()
```

### getCustomFontFolderOptions() {#getCustomFontFolderOptions}
```java
public final int getCustomFontFolderOptions()
```

Options to control behaviour of custom font folder.

**Returns:** int

### setCustomFontFolderOptions(int value) {#setCustomFontFolderOptions-int}
```java
public final void setCustomFontFolderOptions(int value)
```

Options to control behaviour of custom font folder.

### getCustomFontFolders() {#getCustomFontFolders}
```java
public final String[] getCustomFontFolders()
```

Sets the custom font folders. Pass null to reset to default folders.

**Returns:** String[]

### setCustomFontFolders(String[] value) {#setCustomFontFolders-java.lang.String:A}
```java
public final void setCustomFontFolders(String[] value)
```

Sets the custom font folders. Pass null to reset to default folders.

### getSpecifiedEncoding() {#getSpecifiedEncoding}
```java
public int getSpecifiedEncoding()
```

Gets or sets the specified encoding.

**Returns:** int - The specified encoding.

### setSpecifiedEncoding(int value) {#setSpecifiedEncoding-int}
```java
public void setSpecifiedEncoding(int value)
```

Gets or sets the specified encoding.

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The specified encoding. |

### getSpecifiedMifEncoding() {#getSpecifiedMifEncoding}
```java
public final int getSpecifiedMifEncoding()
```

Gets or sets encoding for MIF characters

**Returns:** int - Specified MIF character encoding

### setSpecifiedMifEncoding(int value) {#setSpecifiedMifEncoding-int}
```java
public final void setSpecifiedMifEncoding(int value)
```

Gets or sets encoding for MIF characters

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | int | Specified MIF character encoding |

### getDataBackgroundColor() {#getDataBackgroundColor}
```java
public com.aspose.cad.Color getDataBackgroundColor()
```

Gets or sets the Image background Color .

**Returns:** com.aspose.cad.Color - The background color. Typically the background color is set whenever pixel value cannot be recovered due to data corruption.

### setDataBackgroundColor(com.aspose.cad.Color value) {#setDataBackgroundColor-com.aspose.cad.Color}
```java
public void setDataBackgroundColor(com.aspose.cad.Color value)
```

Gets or sets the Image background Color .

**Parameters:**

| Parameter | Type | Description |
| --- | --- | --- |
| value | com.aspose.cad.Color | The background color. Typically the background color is set whenever pixel value cannot be recovered due to data corruption. |

### getUnloadOnDispose() {#getUnloadOnDispose}
```java
public final boolean getUnloadOnDispose()
```

Whether to unload all data and free memory when Dispose is called

**Returns:** boolean

### setUnloadOnDispose(boolean value) {#setUnloadOnDispose-boolean}
```java
public final void setUnloadOnDispose(boolean value)
```

Whether to unload all data and free memory when Dispose is called

### getRecoverMalformedCifMif() {#getRecoverMalformedCifMif}
```java
public final boolean getRecoverMalformedCifMif()
```

Whether to recover non-escaped CIF (U+XXXX) and MIF (M+nXXXX) character notations

**Returns:** boolean

### setRecoverMalformedCifMif(boolean value) {#setRecoverMalformedCifMif-boolean}
```java
public final void setRecoverMalformedCifMif(boolean value)
```

Whether to recover non-escaped CIF (U+XXXX) and MIF (M+nXXXX) character notations

### getIgnoreErrors() {#getIgnoreErrors}
```java
public final boolean getIgnoreErrors()
```

Whether to ignore load errors.

**Returns:** boolean

### setIgnoreErrors(boolean value) {#setIgnoreErrors-boolean}
```java
public final void setIgnoreErrors(boolean value)
```

Whether to ignore load errors.

### getErrors() {#getErrors}
```java
public final List<RenderResult> getErrors()
```

Gets the list of loading errors.

**Returns:** List<RenderResult>

### getInterruptionToken() {#getInterruptionToken}
```java
public final InterruptionToken getInterruptionToken()
```

Token that can be used to interrupt export operation

**Returns:** InterruptionToken

### setInterruptionToken(InterruptionToken value) {#setInterruptionToken-com.aspose.cad.InterruptionToken}
```java
public final void setInterruptionToken(InterruptionToken value)
```

Token that can be used to interrupt export operation

