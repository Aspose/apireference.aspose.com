---
title: "AsposeOcr.compare_image_texts"
linktitle: "compare_image_texts"
articleTitle: "compare_image_texts"
second_title: "Aspose.OCR for Python via Java"
description: "Check if two images contain the same text."
type: docs
weight: 10
url: /python-java/asposeocr/asposeocr/compare_image_texts/
---

## AsposeOcr.compare_image_texts

```python
compare_image_texts(self, str fullPath1, str fullPath2, RecognitionSettings settings, bool ignoreCase) -> bool
```


Check if two images contain the same text.


| Parameter | Type | Description |
| --- | --- | --- |
| `fullPath1` | `str` | Path to the first image. |
| `fullPath2` | `str` | Path to the second image. |
| `settings` | `RecognitionSettings` | Recognition settings. |
| `ignoreCase` | `bool` | True - means a case-insensitive search. |

**Return Type:** `bool` — True if images have the same text (90% similarity).

