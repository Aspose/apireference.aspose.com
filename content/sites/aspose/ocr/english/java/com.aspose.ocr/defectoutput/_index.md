---
title: DefectOutput
second_title: Aspose.OCR for Java API Reference
description: Areas containing defects identified in the image
type: docs
weight: 16
url: /java/com.aspose.ocr/defectoutput/
---

**Inheritance:**
java.lang.Object
```
public class DefectOutput
```

Areas containing defects identified in the image.
## Fields

| Field | Description |
| --- | --- |
| [Page](#Page) | Page number. |
| [Source](#Source) | The full path to the file or URL, if any. |
| [defectAreas](#defectAreas) | The list of image defects and areas where they were found. |


### Page {#Page}
```
public int Page
```


Page number.

### Source {#Source}
```
public String Source
```


The full path to the file or URL, if any. Empty for streams, byte arrays, and Base64 encoded files.

### defectAreas {#defectAreas}
```
public ArrayList<DefectAreas> defectAreas
```


The list of image defects and areas where they were found.
