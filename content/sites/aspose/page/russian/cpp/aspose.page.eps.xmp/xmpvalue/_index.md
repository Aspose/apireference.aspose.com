---
title: "Aspose::Page::EPS::XMP::XmpValue class"
linktitle: "XmpValue"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::EPS::XMP::XmpValue class. Представляет значение XMP в C++."
type: docs
weight: 300
url: /ru/cpp/aspose.page.eps.xmp/xmpvalue/
---
## XmpValue class


Представляет значение [XMP](../).

```cpp
class XmpValue : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_IsArray](./get_isarray/)() | Возвращает true, если [XmpValue](./) является массивом. |
| [get_IsDateTime](./get_isdatetime/)() const | Возвращает true, если значение является DateTime. |
| [get_IsDouble](./get_isdouble/)() const | Возвращает true, если значение является числом с плавающей точкой. |
| [get_IsField](./get_isfield/)() | Возвращает true, если [XmpValue](./) является полем. |
| [get_IsInteger](./get_isinteger/)() const | Возвращает true, если значение является целым числом. |
| [get_IsNamedValue](./get_isnamedvalue/)() const | Возвращает true, если [XmpValue](./) является именованным значением. |
| [get_IsNamedValues](./get_isnamedvalues/)() | Возвращает true, если [XmpValue](./) представляет именованные значения. |
| [get_IsRaw](./get_israw/)() | Значение не поддерживается/неизвестно, предоставлен необработанный XML-код. |
| [get_IsString](./get_isstring/)() | Возвращает true, если значение является строкой. |
| [get_IsStructure](./get_isstructure/)() | Возвращает true, если [XmpValue](./) представляет структуру. |
| static [to_KeyValuePair](./to_keyvaluepair/)(System::SharedPtr\<XmpValue\>) | Преобразует [XmpValue](./) в именованное значение. |
| static [to_KeyValuePairArray](./to_keyvaluepairarray/)(System::SharedPtr\<XmpValue\>) | Преобразует XmlValue в именованное значение коллекции. |
| static [to_String](./to_string/)(System::SharedPtr\<XmpValue\>) | Преобразует [XmpValue](./) в строку. |
| static [to_XmpValue](./to_xmpvalue/)(System::String) | Преобразует строку в [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(int32_t) | Преобразует целое число в [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(double) | Преобразует число двойной точности в [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::DateTime) | Преобразует дату и время в [XmpValue](./). |
| static [to_XmpValue](./to_xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | Преобразует массив в [XmpValue](./). |
| static [to_XmpValueArray](./to_xmpvaluearray/)(System::SharedPtr\<XmpValue\>) | Преобразует [XmpValue](./) в массив. |
| [ToArray](./toarray/)() | Возвращает массив. |
| [ToDateTime](./todatetime/)() | Преобразует в дату и время. |
| [ToDictionary](./todictionary/)() | Возвращает словарь, содержащий именованные значения. |
| [ToDouble](./todouble/)() | Преобразует в число двойной точности. |
| [ToField](./tofield/)() | Возвращает значение [XMP](../) как поле [XMP](../). |
| [ToInteger](./tointeger/)() | Преобразует в целое число. |
| [ToNamedValue](./tonamedvalue/)() | Возвращает значение [XMP](../) как именованное значение. |
| [ToNamedValues](./tonamedvalues/)() | Возвращает значение [XMP](../) как коллекцию именованных значений. |
| [ToRaw](./toraw/)() | Необработанный XML‑код для неизвестных/неподдерживаемых значений. |
| [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Возвращает строковое представление. |
| [ToString](./tostring/)() const override | Возвращает строковое представление [XmpValue](./). |
| [ToStringValue](./tostringvalue/)() | Преобразует в строку. |
| [ToStructure](./tostructure/)() | Возвращает значение [XMP](../) как структуру (набор полей). |
| [XmpValue](./xmpvalue/)(System::String) | Конструктор для строкового значения. |
| [XmpValue](./xmpvalue/)(int32_t) | Конструктор для целочисленного значения. |
| [XmpValue](./xmpvalue/)(double) | Конструктор для значения с плавающей точкой. |
| [XmpValue](./xmpvalue/)(System::DateTime) | Конструктор для значения даты и времени. |
| [XmpValue](./xmpvalue/)(System::ArrayPtr\<System::SharedPtr\<XmpValue\>\>) | Конструктор для массива. |
## См. также

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
