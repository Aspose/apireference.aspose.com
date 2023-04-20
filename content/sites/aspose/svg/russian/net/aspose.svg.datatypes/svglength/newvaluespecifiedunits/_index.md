---
title: SVGLength.NewValueSpecifiedUnits
second_title: Справочник по Aspose.SVG для .NET API
description: SVGLength метод. Сбросить значение как число с соответствующим unitType тем самым заменив значения для всех атрибутов объекта.
type: docs
weight: 60
url: /ru/net/aspose.svg.datatypes/svglength/newvaluespecifiedunits/
---
## SVGLength.NewValueSpecifiedUnits method

Сбросить значение как число с соответствующим unitType, тем самым заменив значения для всех атрибутов объекта.

```csharp
public void NewValueSpecifiedUnits(ushort unitType, float valueInSpecifiedUnits)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| unitType | UInt16 | Тип единицы измерения значения. |
| valueInSpecifiedUnits | Single | Новое значение.. |

### Исключения

| исключение | условие |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | код[`NOT_SUPPORTED_ERR`](../../../aspose.svg.dom/domexception/not_supported_err/) Возникает, если unitType имеет значение SVG_LENGTHTYPE_UNKNOWN или не является допустимой константой типа единицы измерения (одной из других констант SVG_LENGTHTYPE_*, определенных в этом интерфейсе). |
| [DOMException](../../../aspose.svg.dom/domexception/) | код[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/) Возникает, когда длина соответствует атрибуту только для чтения или когда сам объект доступен только для чтения. |

### Смотрите также

* class [SVGLength](../)
* пространство имен [Aspose.Svg.DataTypes](../../svglength/)
* сборка [Aspose.SVG](../../../)


