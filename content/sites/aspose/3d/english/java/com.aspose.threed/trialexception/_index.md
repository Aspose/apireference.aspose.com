---
title: TrialException
second_title: Aspose.3D for Java API Reference
description: This is raised in Scene.Open/Scene.Save when no licenses are applied.
type: docs
weight: 175
url: /java/com.aspose.threed/trialexception/
---

**Inheritance:**
java.lang.Object, java.lang.Throwable, java.lang.Exception, java.lang.RuntimeException
```
public class TrialException extends RuntimeException
```

This is raised in Scene.Open/Scene.Save when no licenses are applied. You can turn off this exception by setting SuppressTrialException to true.
## Constructors

| Constructor | Description |
| --- | --- |
| [TrialException(String msg)](#TrialException-java.lang.String-) | Constructor of com.aspose.threed.TrialException |
## Methods

| Method | Description |
| --- | --- |
| [getSuppressTrialException()](#getSuppressTrialException--) | Sets this to true to suppress trial exception for unlicensed usage, but the restrictions will not be lifted. |
| [setSuppressTrialException(boolean value)](#setSuppressTrialException-boolean-) | Sets this to true to suppress trial exception for unlicensed usage, but the restrictions will not be lifted. |
### TrialException(String msg) {#TrialException-java.lang.String-}
```
public TrialException(String msg)
```


Constructor of com.aspose.threed.TrialException

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| msg | java.lang.String |  |

### getSuppressTrialException() {#getSuppressTrialException--}
```
public static boolean getSuppressTrialException()
```


Sets this to true to suppress trial exception for unlicensed usage, but the restrictions will not be lifted. In order to lift the restrictions, please use a proper license. And sets this to true also means you're aware of the unlicensed restrictions.

**Returns:**
boolean
### setSuppressTrialException(boolean value) {#setSuppressTrialException-boolean-}
```
public static void setSuppressTrialException(boolean value)
```


Sets this to true to suppress trial exception for unlicensed usage, but the restrictions will not be lifted. In order to lift the restrictions, please use a proper license. And sets this to true also means you're aware of the unlicensed restrictions.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

