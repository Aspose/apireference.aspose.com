---
title: "Aspose::Page::UserProperties класс"
linktitle: "UserProperties"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::UserProperties класс. Специальный класс свойств, позволяющий задавать и получать типизированные свойства. Он также позволяет привязывать два объекта свойств по умолчанию для поиска, если данный объект свойств не содержит искомое свойство в C++."
type: docs
weight: 1600
url: /ru/cpp/aspose.page/userproperties/
---
## UserProperties class


Специальный класс свойств, позволяющий задавать и возвращать типизированные свойства. Он также позволяет подключать два объекта свойств по умолчанию, которые будут искаться, если данный объект свойств не содержит требуемого свойства.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Получает значение строкового свойства. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Получает значение строкового свойства. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Получает значение цветового свойства. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Получает значение цветового свойства. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Получает значение свойства типа double. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Получает значение свойства типа double. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Получает значение свойства типа float. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Получает значение свойства типа float. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Получает значение целочисленного свойства. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Получает значение целочисленного свойства. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Получает значение свойства отступов. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Получает значение свойства отступов. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Получает значение свойства матрицы. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Получает значение свойства матрицы. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Получает значение свойства прямоугольника. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Получает значение свойства прямоугольника. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Получает значение свойства размера. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Получает значение свойства размера. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Получает значение свойства массива строк. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Получает значение свойства массива строк. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [IsProperty](./isproperty/)(System::String) | Получает значение логического свойства. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Получает значение логического свойства. Если запрашиваемое свойство отсутствует, возвращает указанное значение по умолчанию. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Возвращает имена свойств. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Копирует свойства, включая их значения по умолчанию, в этот [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Устанавливает значение строкового свойства. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Устанавливает значение свойства массивом строк. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Устанавливает значение свойства массивом строк в указанной таблице свойств. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Устанавливает значение свойства цвета. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Устанавливает значение свойства цвета в указанной таблице свойств. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Устанавливает значение свойства прямоугольника. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Устанавливает значение свойства прямоугольника в указанной таблице свойств. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Устанавливает значение свойства отступов. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Устанавливает значение свойства отступов в указанной таблице свойств. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Устанавливает значение свойства размера. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Устанавливает значение свойства размера в указанной таблице свойств. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Устанавливает значение свойства целого числа. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Устанавливает значение свойства целого числа в указанной таблице свойств. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Устанавливает значение свойства типа double. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Устанавливает значение свойства типа double в указанной таблице свойств. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Устанавливает значение свойства типа float. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Устанавливает значение свойства типа float в указанной таблице свойств. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Устанавливает значение свойства типа boolean. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Устанавливает значение свойства типа boolean в указанной таблице свойств. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Устанавливает значение свойства матрицы. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Устанавливает значение свойства матрицы в указанной таблице свойств. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Устанавливает n‑й аргумент шаблона как слабый указатель (вместо shared). Позволяет переключать указатели в контейнерах в режим weak. |
| [UserProperties](./userproperties/)() | Инициализирует пустой экземпляр класса [UserProperties](./). |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Инициализирует экземпляр класса [UserProperties](./) со значениями по умолчанию. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Создаёт [UserProperties](./) с таблицами defaults и altDefaults, которые ищутся в указанном порядке. |
## См. также

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
