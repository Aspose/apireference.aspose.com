---
title: Feature.CopyValues
second_title: Справочник по Aspose.GIS for .NET API
description: Feature метод. Копирует значения атрибутов из другого объекта.
type: docs
weight: 20
url: /ru/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

Копирует значения атрибутов из другого объекта.

```csharp
public void CopyValues(Feature inputFeature)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| inputFeature | Feature | Функция, из которой копируются значения. |

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Аргумент`null`. |
| ArgumentException | Атрибут с таким именем не существует в этом слое. |
| InvalidOperationException | Атрибут не заблокирован. |
| InvalidOperationException | Входное значение равно null, и атрибут в этой функции не может быть нулевым. |
| [GisException](../../gisexception/) | Атрибут имеет одинаковое имя, но разные типы данных в функциях. |

### Примечания

Этот метод копирует только атрибуты с совпадающими именами.

### Смотрите также

* class [Feature](../)
* пространство имен [Aspose.Gis](../../feature/)
* сборка [Aspose.GIS](../../../)


