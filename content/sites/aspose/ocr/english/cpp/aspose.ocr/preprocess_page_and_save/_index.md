---
title: "preprocess_page_and_save function"
linktitle: "preprocess_page_and_save"
articleTitle: "preprocess_page_and_save"
second_title: "Aspose.                                   CR for C++"
description: "Use image preprocessing to improve the accuracy of OCR."
type: docs
weight: 250
url: /cpp/aspose.ocr/preprocess_page_and_save/
---

## preprocess_page_and_save function

Use image preprocessing to improve the accuracy of OCR. Create an array of filters that will be applied to the input image in the order you specify. example to create filters: filter_operation f[4]; f[0] = ( OCR_IMG_Resize(1000, 1000) ); f[1] = ( OCR_IMG_Scale (0.3)); f[2] = ( OCR_IMG_Invert() ); f[3] = ( OCR_IMG_Binarize() ); You don't need all of them. Set only what you need.

```cpp
void preprocess_page_and_save(const char *image_path, const char *save_image_path, filter_operation *filters, size_t filters_number)
```

**Returns:** void

