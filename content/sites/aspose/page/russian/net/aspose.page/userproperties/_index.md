---
title: UserProperties
second_title: Справочник по Aspose.Page для .NET API
description: Специальный класс свойств который позволяет устанавливать типизированные свойства и возвращать . Это также позволяет искать соединение двух объектов свойства по умолчанию  если этот объект свойства не содержит свойство.
type: docs
weight: 260
url: /ru/net/aspose.page/userproperties/
---
## UserProperties class

Специальный класс свойств, который позволяет устанавливать типизированные свойства и возвращать . Это также позволяет искать соединение двух объектов свойства по умолчанию , если этот объект свойства не содержит свойство.

```csharp
public class UserProperties : Dictionary<string, object>
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [UserProperties](userproperties#constructor)() | Инициализирует пустой экземпляр класса UserProperties. |
| [UserProperties](userproperties#constructor_1)(Dictionary&lt;string, object&gt;) | Инициализирует класс UserProperties со значениями по умолчанию. |
| [UserProperties](userproperties#constructor_2)(Dictionary&lt;string, object&gt;, Dictionary&lt;string, object&gt;) | Создает UserProperties с таблицей defaults и altDefaults, , которые ищутся в указанном порядке. |

## Характеристики

| Имя | Описание |
| --- | --- |
| virtual [Properties](../../aspose.page/userproperties/properties) { set; } | Копирует свойства, включая их значения по умолчанию, в этот UserProperties |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty#getproperty)(string) | Получает значение строкового свойства. |
| virtual [GetProperty](../../aspose.page/userproperties/getproperty#getproperty_1)(string, string) | Получает значение строкового свойства. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor#getpropertycolor)(string) | Получает значение свойства цвета. |
| virtual [GetPropertyColor](../../aspose.page/userproperties/getpropertycolor#getpropertycolor_1)(string, Color) | Получает значение свойства цвета. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble#getpropertydouble)(string) | Получает двойное значение свойства. |
| virtual [GetPropertyDouble](../../aspose.page/userproperties/getpropertydouble#getpropertydouble_1)(string, double) | Получает двойное значение свойства. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat#getpropertyfloat)(string) | Получает значение свойства с плавающей запятой. |
| virtual [GetPropertyFloat](../../aspose.page/userproperties/getpropertyfloat#getpropertyfloat_1)(string, float) | Получает значение свойства с плавающей запятой. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint#getpropertyint)(string) | Получает целочисленное значение свойства. |
| virtual [GetPropertyInt](../../aspose.page/userproperties/getpropertyint#getpropertyint_1)(string, int) | Получает целочисленное значение свойства. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins#getpropertymargins)(string) | Получает значение свойства полей. |
| virtual [GetPropertyMargins](../../aspose.page/userproperties/getpropertymargins#getpropertymargins_1)(string, Margins) | Получает значение свойства полей. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle#getpropertyrectangle)(string) | Получает значение свойства прямоугольника. |
| virtual [GetPropertyRectangle](../../aspose.page/userproperties/getpropertyrectangle#getpropertyrectangle_1)(string, RectangleF) | Получает значение свойства прямоугольника. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize#getpropertysize)(string) | Получает значение свойства размера. |
| virtual [GetPropertySize](../../aspose.page/userproperties/getpropertysize#getpropertysize_1)(string, Size) | Получает значение свойства размера. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray#getpropertystringarray)(string) | Получает значение свойства строкового массива. |
| virtual [GetPropertyStringArray](../../aspose.page/userproperties/getpropertystringarray#getpropertystringarray_1)(string, string[]) | Получает значение свойства строкового массива. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty#isproperty)(string) | Получает логическое значение свойства. |
| virtual [IsProperty](../../aspose.page/userproperties/isproperty#isproperty_1)(string, bool) | Получает логическое значение свойства. Если запрошенное свойство отсутствует, возвращает предоставленное значение по умолчанию. |
| virtual [PropertyNames](../../aspose.page/userproperties/propertynames)() | Возвращает имена свойств. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_1)(string, bool) | Устанавливает логическое значение свойства. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_5)(string, Color) | Устанавливает значение свойства цвета. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_2)(string, double) | Устанавливает двойное значение свойства. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_4)(string, float) | Устанавливает значение свойства float. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_3)(string, int) | Устанавливает целочисленное значение свойства. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty)(string, Margins) | Устанавливает значение свойства полей. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_6)(string, Rectangle) | Устанавливает значение свойства прямоугольника. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_7)(string, Size) | Устанавливает значение свойства размера. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_8)(string, string) | Задает значение строкового свойства. |
| virtual [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_9)(string, string[]) | Устанавливает значение свойства строкового массива. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_1)(Dictionary&lt;string, object&gt;, string, bool) | Устанавливает логическое значение свойства в указанной таблице свойств. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_5)(Dictionary&lt;string, object&gt;, string, Color) | Устанавливает значение свойства цвета в указанной таблице свойств. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_2)(Dictionary&lt;string, object&gt;, string, double) | Устанавливает двойное значение свойства в указанной таблице свойств. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_4)(Dictionary&lt;string, object&gt;, string, float) | Устанавливает значение свойства с плавающей запятой в указанной таблице свойств. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_3)(Dictionary&lt;string, object&gt;, string, int) | Устанавливает целочисленное значение свойства в указанной таблице свойств. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty)(Dictionary&lt;string, object&gt;, string, Margins) | Устанавливает значение свойства полей в указанной таблице свойств. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_6)(Dictionary&lt;string, object&gt;, string, Rectangle) | Устанавливает значение свойства прямоугольника в указанной таблице свойств. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_7)(Dictionary&lt;string, object&gt;, string, Size) | Задает значение свойства размера в указанной таблице свойств. |
| static [SetProperty](../../aspose.page/userproperties/setproperty#setproperty_8)(Dictionary&lt;string, object&gt;, string, string[]) | Задает значение свойства строкового массива в указанной таблице свойств. |

### Смотрите также

* пространство имен [Aspose.Page](../../aspose.page)
* сборка [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
