---
title: "Aspose::Page::Font::DrFont класс"
linktitle: "DrFont"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::Font::DrFont класс. Используйте этот класс вместо GDI+ Font в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.page.font/drfont/
---
## DrFont class


Используйте этот класс вместо GDI+ [Font](../).

```cpp
class DrFont : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Определяет, равен ли указанный [System::Object](../../system/object/) этому экземпляру. |
| [get_AscentLis](./get_ascentlis/)() | Подъём ячейки этого шрифта (lis). Это вертикальное расстояние от верхней границы ячейки до базовой линии. |
| [get_AscentPoints](./get_ascentpoints/)() | Возвращает подъем ячейки в пунктах. |
| [get_CellHeightLis](./get_cellheightlis/)() | Возвращает высоту ячейки этого шрифта (lis). Это сокращение для [AscentLis](../) + [DescentLis](../). |
| [get_CellHeightPoints](./get_cellheightpoints/)() | Сокращение для [AscentPoints](../) + [DescentPoints](../). |
| [get_DescentLis](./get_descentlis/)() | Спуск ячейки этого шрифта (lis). Это вертикальное расстояние от нижней части ячейки до базовой линии ячейки. |
| [get_DescentPoints](./get_descentpoints/)() | Возвращает спуск ячейки в пунктах. |
| [get_FamilyName](./get_familyname/)() | Получает имя этого шрифта. |
| [get_IsBold](./get_isbold/)() | Получает значение, указывающее, является ли этот экземпляр полужирным. |
| [get_IsItalic](./get_isitalic/)() | Получает значение, указывающее, является ли этот экземпляр курсивом. |
| [get_LeadingLis](./get_leadinglis/)() | Возвращает межстрочный интервал этого шрифта (lis). Это сокращение для [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LeadingPoints](./get_leadingpoints/)() | Возвращает межстрочный интервал этого шрифта (lis). Это сокращение для [LineSpacingLis](../) - [CellHeightLis](../). |
| [get_LineSpacingLis](./get_linespacinglis/)() | Возвращает межсимвольный интервал этого шрифта (lis). Это вертикальное расстояние между базовыми линиями двух глифов. |
| [get_LineSpacingPoints](./get_linespacingpoints/)() | Возвращает межсимвольный интервал этого шрифта (пункты). Это вертикальное расстояние между базовыми линиями двух глифов. |
| [get_SizePoints](./get_sizepoints/)() | Получает размер этого шрифта (пункты). |
| [get_SmallCapsScaleFactor](./get_smallcapsscalefactor/)() | Получает заглавные буквы шрифта. |
| [get_Style](./get_style/)() | Получает TrueType шрифт. |
| [get_StyleEx](./get_styleex/)() | Это свойство содержит дополнительную информацию о стиле шрифта. |
| [GetCharWidthLis](./getcharwidthlis/)(char16_t) | Получает ширину символа lis. |
| [GetCharWidthPoints](./getcharwidthpoints/)(char16_t) | Возвращает ширину символа (пункты). |
| [GetHashCode](./gethashcode/)() const override | Возвращает хеш-код для этого экземпляра. |
| [GetTextSizePoints](./gettextsizepoints/)(System::String) | Возвращает измерительный текстовый блок текста в пунктах. |
| [GetTextWidthLis](./gettextwidthlis/)(System::String) | Получает ширину текста lis. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String) | Получает ширину текста в пунктах. |
| [GetTextWidthPoints](./gettextwidthpoints/)(System::String, int32_t, int32_t) | Получает ширину текста в пунктах. |
| static [IsPoorlyRenderedByGdiPlus](./ispoorlyrenderedbygdiplus/)(System::String) | Возвращает True для шрифта "Microsoft Sans Serif". Этот шрифт плохо отображается в GDI+. Смотрите Test286 и Gemini-6959. |
| [Replace](./replace/)(System::SharedPtr\<DrFont\>) | Заменить содержимое шрифта. |
| [set_SizePoints](./set_sizepoints/)(float) | Получает размер этого шрифта (пункты). |
| [set_StyleEx](./set_styleex/)(int16_t) | Это свойство содержит дополнительную информацию о стиле шрифта. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Font](../)
* Library [Aspose.Page for C++](../../)
