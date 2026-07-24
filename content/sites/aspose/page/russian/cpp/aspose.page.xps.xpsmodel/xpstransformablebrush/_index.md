---
title: "Класс Aspose::Page::XPS::XpsModel::XpsTransformableBrush"
linktitle: "XpsTransformableBrush"
second_title: "Aspose.Page для C++"
description: "Класс Aspose::Page::XPS::XpsModel::XpsTransformableBrush. Класс, инкапсулирующий общие свойства элементов трансформируемых кистей (все, кроме SolidColorBrush) в C++."
type: docs
weight: 4300
url: /ru/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


Класс, инкапсулирующий общие свойства трансформируемых кистей (все, кроме SolidColorBrush).

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Transform](./get_transform/)() override | Возвращает/устанавливает матричное преобразование, применяемое к координатному пространству кисти. Свойство Transform конкатенируется с текущим эффективным преобразованием рендеринга, чтобы получить эффективное преобразование рендеринга, локальное для кисти. Область просмотра кисти преобразуется с использованием локального эффективного преобразования рендеринга. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Возвращает/устанавливает матричное преобразование, применяемое к координатному пространству кисти. Свойство Transform конкатенируется с текущим эффективным преобразованием рендеринга, чтобы получить эффективное преобразование рендеринга, локальное для кисти. Область просмотра кисти преобразуется с использованием локального эффективного преобразования рендеринга. |
## См. также

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
