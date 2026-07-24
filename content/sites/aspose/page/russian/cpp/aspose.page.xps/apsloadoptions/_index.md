---
title: "Aspose::Page::XPS::ApsLoadOptions класс"
linktitle: "ApsLoadOptions"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::ApsLoadOptions класс. Параметры загрузки APS‑документов в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


Параметры загрузки документа APS.

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## Методы

| Метод | Описание |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | Создаёт новый экземпляр параметров. |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | Целочисленное значение от 0 до 255, ниже которого пиксель изображения, содержащий альфа‑значения, считается полностью прозрачным. PostScript не поддерживает прозрачность, но может применить явную маску над цветным изображением, где некоторые пиксели будут полностью непрозрачными, а некоторые — полностью прозрачными. Порог прозрачности используется для получения наилучшего соответствия оригиналу и результату PostScript. Значение по умолчанию — 255. |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | Целочисленное значение от 0 до 255, ниже которого пиксель изображения, содержащий альфа‑значения, считается полностью прозрачным. PostScript не поддерживает прозрачность, но может применить явную маску над цветным изображением, где некоторые пиксели будут полностью непрозрачными, а некоторые — полностью прозрачными. Порог прозрачности используется для получения наилучшего соответствия оригиналу и результату PostScript. Значение по умолчанию — 255. |
## См. также

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
