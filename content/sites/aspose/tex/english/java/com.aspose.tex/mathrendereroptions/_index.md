---
title: MathRendererOptions
second_title: Aspose.TeX for Java API Reference
description: Math formula common rendering options.
type: docs
weight: 16
url: /java/com.aspose.tex/mathrendereroptions/
---
**Inheritance:**
java.lang.Object
```
public abstract class MathRendererOptions
```

Math formula common rendering options.
## Constructors

| Constructor | Description |
| --- | --- |
| [MathRendererOptions()](#MathRendererOptions--) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [getPreamble()](#getPreamble--) | Gets LaTeX document preamble. |
| [setPreamble(String value)](#setPreamble-java.lang.String-) | Sets LaTeX document preamble. |
| [getScale()](#getScale--) | Gets the scale. 1000 means 100%, 1200 means 120%, etc. |
| [setScale(int value)](#setScale-int-) | Sets the scale. 1000 means 100%, 1200 means 120%, etc. |
| [getTextColor()](#getTextColor--) | Gets the formula text color. |
| [setTextColor(Color value)](#setTextColor-java.awt.Color-) | Sets the formula text color. |
| [getBackgroundColor()](#getBackgroundColor--) | Gets the background color. |
| [setBackgroundColor(Color value)](#setBackgroundColor-java.awt.Color-) | Sets the background color. |
| [getLogStream()](#getLogStream--) | Gets the stream to write log output to. |
| [setLogStream(OutputStream value)](#setLogStream-java.io.OutputStream-) | Sets the stream to write log output to. |
| [showTerminal()](#showTerminal--) | Gets the flag that controls terminal output. |
| [showTerminal(boolean value)](#showTerminal-boolean-) | Sets the flag that controls terminal output. |
| [getErrorReport()](#getErrorReport--) | Gets the error report. |
### MathRendererOptions() {#MathRendererOptions--}
```
public MathRendererOptions()
```


Creates a new instance.

### getPreamble() {#getPreamble--}
```
public String getPreamble()
```


Gets LaTeX document preamble.

**Returns:**
java.lang.String - LaTeX document preamble.
### setPreamble(String value) {#setPreamble-java.lang.String-}
```
public void setPreamble(String value)
```


Sets LaTeX document preamble.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | The LaTeX document preamble. |

### getScale() {#getScale--}
```
public int getScale()
```


Gets the scale. 1000 means 100%, 1200 means 120%, etc.

**Returns:**
int - The scale. 1000 means 100%, 1200 means 120%, etc.
### setScale(int value) {#setScale-int-}
```
public void setScale(int value)
```


Sets the scale. 1000 means 100%, 1200 means 120%, etc.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | The scale. 1000 means 100%, 1200 means 120%, etc. |

### getTextColor() {#getTextColor--}
```
public Color getTextColor()
```


Gets the formula text color.

**Returns:**
java.awt.Color - The formula text color.
### setTextColor(Color value) {#setTextColor-java.awt.Color-}
```
public void setTextColor(Color value)
```


Sets the formula text color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Color | The formula text color. |

### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```


Gets the background color.

**Returns:**
java.awt.Color - The background color.
### setBackgroundColor(Color value) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color value)
```


Sets the background color.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Color | background color. |

### getLogStream() {#getLogStream--}
```
public OutputStream getLogStream()
```


Gets the stream to write log output to.

**Returns:**
java.io.OutputStream - The stream to write log output to.
### setLogStream(OutputStream value) {#setLogStream-java.io.OutputStream-}
```
public void setLogStream(OutputStream value)
```


Sets the stream to write log output to.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.io.OutputStream | The stream to write log output to. |

### showTerminal() {#showTerminal--}
```
public boolean showTerminal()
```


Gets the flag that controls terminal output. If `true` then terminal output is written to console.

**Returns:**
boolean - The flag that controls terminal output.
### showTerminal(boolean value) {#showTerminal-boolean-}
```
public void showTerminal(boolean value)
```


Sets the flag that controls terminal output. If `true` then terminal output is written to console.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The flag that controls terminal output. |

### getErrorReport() {#getErrorReport--}
```
public String getErrorReport()
```


Gets the error report.

**Returns:**
java.lang.String - The error report.
