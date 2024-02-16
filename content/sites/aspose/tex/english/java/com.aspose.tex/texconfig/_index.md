---
title: TeXConfig
second_title: Aspose.TeX for Java API Reference
description: Class providing available TeX configurations.
type: docs
weight: 37
url: /java/com.aspose.tex/texconfig/
---
**Inheritance:**
java.lang.Object
```
public class TeXConfig
```

Class providing available TeX configurations.
## Methods

| Method | Description |
| --- | --- |
| [objectIniTeX()](#objectIniTeX--) | Gets the configuration of Object TeX engine extension with no format preloaded, i.e. in INITEX mode. |
| [objectLaTeX()](#objectLaTeX--) | Gets the configuration of ObjectTeX engine extension with ObjectLaTeX format preloaded. |
| [objectTeX()](#objectTeX--) | Gets the configuration of Object TeX engine extension with default Object TeX format (which is essentially plain TeX) preloaded. |
| [objectTeX(FormatProvider formatProvider)](#objectTeX-com.aspose.tex.FormatProvider-) | Gets the configuration of Object TeX engine extension with provided format preloaded. |
### objectIniTeX() {#objectIniTeX--}
```
public static TeXConfig objectIniTeX()
```


Gets the configuration of Object TeX engine extension with no format preloaded, i.e. in INITEX mode. Supposed to be used for format preparation.

**Returns:**
[TeXConfig](../../com.aspose.tex/texconfig) - The configuration of Object TeX engine extension in INITEX mode.
### objectLaTeX() {#objectLaTeX--}
```
public static TeXConfig objectLaTeX()
```


Gets the configuration of ObjectTeX engine extension with ObjectLaTeX format preloaded.

**Returns:**
[TeXConfig](../../com.aspose.tex/texconfig) - The configuration of ObjectTeX engine extension with ObjectLaTeX format preloaded.
### objectTeX() {#objectTeX--}
```
public static TeXConfig objectTeX()
```


Gets the configuration of Object TeX engine extension with default Object TeX format (which is essentially plain TeX) preloaded.

**Returns:**
[TeXConfig](../../com.aspose.tex/texconfig) - "Object TeX engine extension with default Object TeX format preloaded" configuration.
### objectTeX(FormatProvider formatProvider) {#objectTeX-com.aspose.tex.FormatProvider-}
```
public static TeXConfig objectTeX(FormatProvider formatProvider)
```


Gets the configuration of Object TeX engine extension with provided format preloaded.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| formatProvider | [FormatProvider](../../com.aspose.tex/formatprovider) | The format provider. If left equal to null then default Object TeX format (which is essentially plain TeX) will be loaded. |

**Returns:**
[TeXConfig](../../com.aspose.tex/texconfig) - "Object TeX engine extension with provided format preloaded" configuration.
