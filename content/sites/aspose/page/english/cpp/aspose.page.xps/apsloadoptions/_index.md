---
title: Aspose::Page::XPS::ApsLoadOptions class
linktitle: ApsLoadOptions
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::ApsLoadOptions class. APS document loading options in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


APS document loading options.

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## Methods

| Method | Description |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | Creates new instance of options. |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | An integer value from 0 to 255 below which pixel of image that contains alpha values will be considered as fully transparent. PostScript doesn't support transparency, but can apply explicit mask above color image where some pixels will be fully opaque and some one's will be fully transparent. Transparency threshold is used for finding the best likeness of original and PostScript result. Default value is 255. |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | An integer value from 0 to 255 below which pixel of image that contains alpha values will be considered as fully transparent. PostScript doesn't support transparency, but can apply explicit mask above color image where some pixels will be fully opaque and some one's will be fully transparent. Transparency threshold is used for finding the best likeness of original and PostScript result. Default value is 255. |
## See Also

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
