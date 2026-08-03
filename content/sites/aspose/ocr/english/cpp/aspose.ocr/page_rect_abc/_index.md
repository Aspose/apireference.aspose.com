---
title: "page_rect_abc function"
linktitle: "page_rect_abc"
articleTitle: "page_rect_abc"
second_title: "Aspose.                                   CR for C++"
description: "Optical character recognition image in the defined rectangle."
type: docs
weight: 210
url: /cpp/aspose.ocr/page_rect_abc/
---

## page_rect_abc function

Optical character recognition image in the defined rectangle. Allowed formats is PNG, JPG, BMP. Only allowed characters from the alphabet are recognized. Skew alignment does not occur. Buffer allocated by the caller. If the buffer is null, the function returns the required buffer size.

```cpp
size_t page_rect_abc(const char *image_path, wchar_t *buffer, size_t buffer_size, int x, int y, int w, int h, const wchar_t *const alphabet)
```

**Returns:** size_t

