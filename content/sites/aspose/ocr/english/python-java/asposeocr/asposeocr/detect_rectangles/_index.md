---
title: "AsposeOcr.detect_rectangles"
linktitle: "detect_rectangles"
articleTitle: "detect_rectangles"
second_title: "Aspose.OCR for Python via Java"
description: "Detects text areas on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64."
type: docs
weight: 10
url: /python-java/asposeocr/asposeocr/detect_rectangles/
---

## AsposeOcr.detect_rectangles

```python
detect_rectangles(self, OcrInput input, aspose.models.AreasType areasType, bool isDetectAreas) -> typing.List[RectangleOutput]
```


Detects text areas on images. Supports GIF, PNG, JPEG, WBMP, TIFF, JFIF, TIFF, PDF, binary array, folder, array, zip archive, URL, base64.


| Parameter | Type | Description |
| --- | --- | --- |
| `input` | `OcrInput` | :py:any:~aspose.models.OcrInput. instance. |
| `areasType` | `aspose.models.AreasType` | Determinates wich rectangles to return - line, paragraphs or words. |
| `isDetectAreas` | `bool` | Enable automatic text areas detection. |

**Return Type:** `typing.List[RectangleOutput]` — List of RectangleOutput with detected text areas or lines.

