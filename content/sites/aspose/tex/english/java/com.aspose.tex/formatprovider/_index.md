---
title: FormatProvider
second_title: Aspose.TeX for Java API Reference
description: Class providing TeX format.
type: docs
weight: 10
url: /java/com.aspose.tex/formatprovider/
---
**Inheritance:**
java.lang.Object
```
public class FormatProvider
```

Class providing TeX format.
## Constructors

| Constructor | Description |
| --- | --- |
| [FormatProvider(IInputWorkingDirectory workingDirectory, String formatFileName)](#FormatProvider-com.aspose.tex.IInputWorkingDirectory-java.lang.String-) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [objectTeX()](#objectTeX--) | Default format provider for ObjectTeX engine extension. |
| [objectLaTeX()](#objectLaTeX--) | Object LaTeX format provider for ObjectTeX engine extension. |
| [close()](#close--) | Disposes the instance. |
### FormatProvider(IInputWorkingDirectory workingDirectory, String formatFileName) {#FormatProvider-com.aspose.tex.IInputWorkingDirectory-java.lang.String-}
```
public FormatProvider(IInputWorkingDirectory workingDirectory, String formatFileName)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| workingDirectory | [IInputWorkingDirectory](../../com.aspose.tex/iinputworkingdirectory) | The working directory. |
| formatFileName | java.lang.String | The source file name to start reading format from. |

### objectTeX() {#objectTeX--}
```
public static FormatProvider objectTeX()
```


Default format provider for ObjectTeX engine extension.

**Returns:**
[FormatProvider](../../com.aspose.tex/formatprovider) - Default format provider for ObjectTeX engine extension.
### objectLaTeX() {#objectLaTeX--}
```
public static FormatProvider objectLaTeX()
```


Object LaTeX format provider for ObjectTeX engine extension.

**Returns:**
[FormatProvider](../../com.aspose.tex/formatprovider) - Default format provider for ObjectTeX engine extension.
### close() {#close--}
```
public void close()
```


Disposes the instance.

