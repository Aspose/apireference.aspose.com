---
title: DefectType
second_title: Aspose.OCR for Java API Reference
description: The types of image defects
type: docs
weight: 22
url: /java/com.aspose.ocr.models/defecttype/
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
| [ALL](#ALL) | All supported image defects. |
| [BLUR](#BLUR) | The image is out of focus. |
| [GLARE](#GLARE) | Areas in an image caused by uneven lighting, such as spot lights or flash. |
| [LOW_CONTRAST](#LOW-CONTRAST) | Highlights and shadows typically appearing on curved pages. |
| [SALT_PEPPER_NOISE](#SALT-PEPPER-NOISE) | Random white and black pixels scattered across the area. |

### ALL {#ALL}
```
public static final DefectType ALL
```


All supported image defects.

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

### LOW_CONTRAST {#LOW-CONTRAST}
```
public static final DefectType LOW_CONTRAST
```


Highlights and shadows typically appearing on curved pages.

### SALT_PEPPER_NOISE {#SALT-PEPPER-NOISE}
```
public static final DefectType SALT_PEPPER_NOISE
```


Random white and black pixels scattered across the area. Often occurs in digital photographs.

