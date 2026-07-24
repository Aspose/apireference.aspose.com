---
title: "перечисление Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression"
linktitle: "PdfImageCompression"
second_title: "Aspose.Page для C++"
description: "перечисление Aspose::Page::XPS::Presentation::Pdf::PdfImageCompression. Указывает тип сжатия, применяемого к изображениям в PDF-файле в C++."
type: docs
weight: 700
url: /ru/cpp/aspose.page.xps.presentation.pdf/pdfimagecompression/
---
## PdfImageCompression enum


Указывает тип сжатия, применяемый к изображениям в файле PDF.

```cpp
enum class PdfImageCompression
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Авто | 0 | Автоматически выбирает наиболее подходящее сжатие для каждого изображения. |
| None | 1 | Сохраняет необработанные байты изображения, что приводит к увеличению размеров PDF-файла. |
| Rle | 2 | Сжатие Run Length. |
| Flate | 3 | Сжатие Flate. |
| LzwBaselinePredictor | 4 | Выбор предиктора ограничен предиктором PNG Paeth для ускорения процесса. На практике работает удивительно хорошо. Лучше, чем [LzwOptimizedPredictor](./). |
| LzwOptimizedPredictor | 5 | Выбор предиктора более сложный и должен приводить к меньшим размерам изображений, но требует больше времени. |
| Jpeg | 6 | Сжатие JPEG. Не поддерживает прозрачность. |

## См. также

* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)
