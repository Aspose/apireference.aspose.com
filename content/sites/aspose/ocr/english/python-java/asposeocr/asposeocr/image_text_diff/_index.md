---
title: "AsposeOcr.image_text_diff"
linktitle: "image_text_diff"
articleTitle: "image_text_diff"
second_title: "Aspose.OCR for Python via Java"
description: "Compare the texts on the two images and return a number representing how similar they are (0 to 1)."
type: docs
weight: 10
url: /python-java/asposeocr/asposeocr/image_text_diff/
---

## AsposeOcr.image_text_diff

```python
image_text_diff(self, str fullPath1, str fullPath2, RecognitionSettings settings, bool ignoreCase) -> float
```


Compare the texts on the two images and return a number representing how similar they are (0 to 1).


| Parameter | Type | Description |
| --- | --- | --- |
| `fullPath1` | `str` | Path to the first image. |
| `fullPath2` | `str` | Path to the second image. |
| `settings` | `RecognitionSettings` | Recognition settings. |
| `ignoreCase` | `bool` | True - means a case-insensitive search. |

**Return Type:** `float` — 0 means that the texts are completely different; 1 means the texts are identical.

