---
title: "Aspose::Page::Plugins::PsConverterOptions класс"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::Plugins::PsConverterOptions класс. Представляет параметры плагина PsConverter в C++."
type: docs
weight: 1200
url: /ru/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Представляет параметры для плагина [PsConverter](../psconverter/).

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Методы

| Метод | Описание |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Добавляет новый источник данных в коллекцию данных плагина [PsConverter](../psconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Добавляет новый источник данных в коллекцию данных плагина [PsConverterOptions](./). |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Указывает дополнительные папки, где конвертер должен искать шрифты для входного документа. Папка по умолчанию — стандартная папка шрифтов, где ОС ищет шрифты для внутренних нужд. |
| [get_DataCollection](./get_datacollection/)() override | Возвращает коллекцию данных плагина [PsConverterOptions](./). |
| virtual [get_Debug](./get_debug/)() | Указывает, должна ли отладочная информация выводиться в стандартный поток вывода или нет. |
| virtual [get_Exceptions](./get_exceptions/)() | Возвращает список подавленных ошибок конвертации, если [SuppressErrors](../) равно true. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Категория Quality указывает уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, соответственно, ниже качество изображения. Значение 0 дает изображение наихудшего качества, а 100 — наилучшего. |
| virtual [get_OperationName](./get_operationname/)() | Возвращает имя операции. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Получает коллекцию добавленных целей для сохранения результатов операции. |
| [get_SupressErrors](./get_supresserrors/)() const | Указывает, должны ли ошибки подавляться или нет. Если true, подавленные ошибки добавляются в список [Exceptions](../). Если false, первая ошибка завершит программу. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Указывает дополнительные папки, где конвертер должен искать шрифты для входного документа. Папка по умолчанию — стандартная папка шрифтов, где ОС ищет шрифты для внутренних нужд. |
| virtual [set_Debug](./set_debug/)(bool) | Указывает, должна ли отладочная информация выводиться в стандартный поток вывода или нет. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Возвращает список подавленных ошибок конвертации, если [SuppressErrors](../) равно true. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Категория Quality указывает уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, соответственно, ниже качество изображения. Значение 0 дает изображение наихудшего качества, а 100 — наилучшего. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Указывает, должны ли ошибки подавляться или нет. Если true, подавленные ошибки добавляются в список [Exceptions](../). Если false, первая ошибка завершит программу. |
## См. также

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
