---
title: "Aspose::Page::Metered класс"
linktitle: "Счетный"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::Metered класс. Предоставляет методы для установки счетного ключа в C++."
type: docs
weight: 1400
url: /ru/cpp/aspose.page/metered/
---
## Metered class


Предоставляет методы для установки измеряемого ключа.

```cpp
class Metered : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| static [GetConsumptionCredit](./getconsumptioncredit/)() | Получает кредит потребления. |
| static [GetConsumptionQuantity](./getconsumptionquantity/)() | Получает размер файла потребления. |
| [Metered](./metered/)() | Инициализирует новый экземпляр этого класса. |
| [SetMeteredKey](./setmeteredkey/)(System::String, System::String) | Устанавливает публичный и приватный счетный ключ. Если вы приобретаете счетную лицензию, при запуске приложения этот API должен быть вызван, обычно этого достаточно. Однако если постоянно не удаётся загрузить данные о потреблении и прошло более 24 часов, лицензия будет переведена в статус оценки; чтобы избежать такой ситуации, следует регулярно проверять статус лицензии, и если он находится в статусе оценки, вызвать этот API снова. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
