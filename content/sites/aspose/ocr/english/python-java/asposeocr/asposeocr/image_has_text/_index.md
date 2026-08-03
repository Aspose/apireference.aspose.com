---
title: "AsposeOcr.image_has_text"
linktitle: "image_has_text"
articleTitle: "image_has_text"
second_title: "Aspose.OCR for Python via Java"
description: "Check if the image contains the provided text fragment."
type: docs
weight: 10
url: /python-java/asposeocr/asposeocr/image_has_text/
---

## AsposeOcr.image_has_text

```python
image_has_text(self, str fullPath, str text, RecognitionSettings settings, bool ignoreCase) -> bool
```


Check if the image contains the provided text fragment.


| Parameter | Type | Description |
| --- | --- | --- |
| `fullPath` | `str` | Path to the image. |
| `text` | `str` | Text fragment for searching on the image. |
| `settings` | `RecognitionSettings` | Recognition settings. |
| `ignoreCase` | `bool` | True - means a case-insensitive search. |

**Return Type:** `bool` — True if image contains text fragment. False - image doesn't contains text fragment.

