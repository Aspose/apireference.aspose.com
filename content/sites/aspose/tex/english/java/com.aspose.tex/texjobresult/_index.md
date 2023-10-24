---
title: TeXJobResult
second_title: Aspose.TeX for Java API Reference
description: Lists possible results of a TeX job.
type: docs
weight: 48
url: /java/com.aspose.tex/texjobresult/
---
**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum TeXJobResult extends Enum<TeXJobResult>
```

Lists possible results of a TeX job.
## Fields

| Field | Description |
| --- | --- |
| [Spotless](#Spotless) | No errors occurred and no diagnostic messages were issued. |
| [WarningIssued](#WarningIssued) | No errors occurred but some diagnostic messages were issued. |
| [ErrorMessageIssued](#ErrorMessageIssued) | One or more errors occurred. |
| [FatalErrorStop](#FatalErrorStop) | A fatal error occurred. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### Spotless {#Spotless}
```
public static final TeXJobResult Spotless
```


No errors occurred and no diagnostic messages were issued.

### WarningIssued {#WarningIssued}
```
public static final TeXJobResult WarningIssued
```


No errors occurred but some diagnostic messages were issued.

### ErrorMessageIssued {#ErrorMessageIssued}
```
public static final TeXJobResult ErrorMessageIssued
```


One or more errors occurred.

### FatalErrorStop {#FatalErrorStop}
```
public static final TeXJobResult FatalErrorStop
```


A fatal error occurred. Termination was premature.

### values() {#values--}
```
public static TeXJobResult[] values()
```




**Returns:**
com.aspose.tex.TeXJobResult[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static TeXJobResult valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[TeXJobResult](../../com.aspose.tex/texjobresult)
