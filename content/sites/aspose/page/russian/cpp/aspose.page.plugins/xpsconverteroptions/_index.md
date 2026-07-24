---
title: "Aspose::Page::Plugins::XpsConverterOptions класс"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::Plugins::XpsConverterOptions класс. Представляет параметры для плагина XpsConverter в C++."
type: docs
weight: 2000
url: /ru/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Представляет параметры для плагина [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Методы

| Метод | Описание |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Добавляет новый источник данных в коллекцию данных плагина [XpsConverter](../xpsconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Добавляет новый источник данных в коллекцию данных плагина [XpsConverterOptions](./). |
| [get_DataCollection](./get_datacollection/)() override | Возвращает коллекцию данных плагина [XpsConverterOptions](./). |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Категория Quality указывает уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, соответственно, ниже качество изображения. Значение 0 дает изображение наихудшего качества, а 100 — наилучшего. |
| virtual [get_OperationName](./get_operationname/)() | Возвращает имя операции. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Получает коллекцию добавленных целей для сохранения результатов операции. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Категория Quality указывает уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, соответственно, ниже качество изображения. Значение 0 дает изображение наихудшего качества, а 100 — наилучшего. |
## См. также

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
