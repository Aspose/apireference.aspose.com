---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption класс. Описывает параметры функций JobInputBin, DocumentInputBin и PageInputBin в C++."
type: docs
weight: 700
url: /ru/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


Описывает параметры функций [JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) и [PageInputBin](../../pageinputbin/).

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Добавляет массив экземпляров [IInputBinOptionItem](../iinputbinoptionitem/) к параметру. |
| [Clone](./clone/)() | Клонирует этот экземпляр опции. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | Создаёт новый экземпляр. |
## Поля

| Поле | Описание |
| --- | --- |
| static [AutoSelect](./autoselect/) | Устройство автоматически выберет лучшую опцию на основе конфигурации. |
| static [AutoSheetFeeder](./autosheetfeeder/) | Лоток ввода устройства для струйных принтеров. |
| static [Cassette](./cassette/) | Указывает, что подающий лоток является кассетой. |
| static [Manual](./manual/) | Указывает стандартный ручной подающий лоток. |
| static [Tractor](./tractor/) | Указывает, что подающий лоток является тракторным. |
## См. также

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
