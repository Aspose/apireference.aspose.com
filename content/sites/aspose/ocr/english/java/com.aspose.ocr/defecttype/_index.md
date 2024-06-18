---
title: DefectType
second_title: Aspose.OCR for Java API Reference
description: The types of image defects.
type: docs
weight: 36
url: /java/com.aspose.ocr/defecttype/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum DefectType extends Enum<DefectType>
```

The types of image defects.
## Fields

| Field | Description |
| --- | --- |
| [SALT_PEPPER_NOISE](#SALT-PEPPER-NOISE) | Random white and black pixels scattered across the area. |
| [LOW_CONTRAST](#LOW-CONTRAST) | Highlights and shadows typically appearing on curved pages. |
| [BLUR](#BLUR) | The image is out of focus. |
| [GLARE](#GLARE) | Areas in an image caused by uneven lighting, such as spot lights or flash. |
| [ALL](#ALL) | All supported image defects. |
## Methods

| Method | Description |
| --- | --- |
| [values()](#values--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
### SALT_PEPPER_NOISE {#SALT-PEPPER-NOISE}
```
public static final DefectType SALT_PEPPER_NOISE
```


Random white and black pixels scattered across the area. Often occurs in digital photographs.

### LOW_CONTRAST {#LOW-CONTRAST}
```
public static final DefectType LOW_CONTRAST
```


Highlights and shadows typically appearing on curved pages.

### BLUR {#BLUR}
```
public static final DefectType BLUR
```


The image is out of focus. This detection algorithm can only identify the entire image as blurry. Specific areas cannot be detected.

### GLARE {#GLARE}
```
public static final DefectType GLARE
```


Areas in an image caused by uneven lighting, such as spot lights or flash.

### ALL {#ALL}
```
public static final DefectType ALL
```


All supported image defects.

### values() {#values--}
```
public static DefectType[] values()
```




**Returns:**
com.aspose.ocr.DefectType[]
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static DefectType valueOf(String name)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String |  |

**Returns:**
[DefectType](../../com.aspose.ocr/defecttype)
