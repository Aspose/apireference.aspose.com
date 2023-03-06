---
title: Feature.SetValue
second_title: Справочник по Aspose.GIS for .NET API
description: Feature метод. Устанавливает новое значение атрибута.
type: docs
weight: 100
url: /ru/net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

Устанавливает новое значение атрибута.

```csharp
public void SetValue<T>(string attributeName, T value)
```

| Параметр | Описание |
| --- | --- |
| T | Тип значения. |
| attributeName | Имя атрибута. |
| value | Значение атрибута. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Имя атрибута`null`. |
| ArgumentException | Атрибут с таким именем не существует в этом слое. |
| InvalidOperationException | Атрибут не заблокирован. |
| InvalidCastException | Тип значения не реализуетсяIConvertible. |
| FormatException | Не удалось выполнить преобразование, поскольку значение имеет неверный формат. |
| OverflowException | Преобразование не выполнено из-за переполнения. |

### Примечания

Этот метод автоматически преобразует значение в тип атрибута.

### Смотрите также

* class [Feature](../)
* пространство имен [Aspose.Gis](../../feature/)
* сборка [Aspose.GIS](../../../)


