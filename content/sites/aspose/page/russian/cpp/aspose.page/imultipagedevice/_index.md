---
title: "Aspose::Page::IMultiPageDevice класс"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::IMultiPageDevice класс. Этот интерфейс содержит методы для управления многостраничным устройством в C++."
type: docs
weight: 800
url: /ru/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


Этот интерфейс содержит методы для управления многостраничным устройством.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [ClosePage](./closepage/)() | Выполняет необходимую подготовку устройства после рендеринга страницы. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | Текущий номер страницы. |
| virtual [InitPageNumbers](./initpagenumbers/)() | Инициализирует количество страниц для вывода. |
| virtual [OpenPage](./openpage/)(System::String) | Выполняет необходимую подготовку устройства перед рендерингом страницы. |
| virtual [OpenPage](./openpage/)(float, float) | Выполняет необходимую подготовку устройства перед рендерингом каждой страницы. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | Обновляет параметры страницы из другого многостраничного устройства. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
