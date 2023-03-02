---
title: Feature.GetValue
second_title: Справочник по Aspose.GIS for .NET API
description: Feature метод. Получает значение атрибута.
type: docs
weight: 30
url: /ru/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

Получает значение атрибута.

```csharp
public T GetValue<T>(string attributeName)
```

| Параметр | Описание |
| --- | --- |
| T | Желаемый тип значения. |
| attributeName | Имя атрибута. |

### Возвращаемое значение

Значение атрибута.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Имя атрибута`null`. |
| ArgumentException | Атрибут с таким именем не существует в этом слое. |
| InvalidOperationException | Атрибут не заблокирован. |
| InvalidOperationException | Значение этого атрибута не установлено для этой функции. |
| InvalidCastException | Запрошенный тип не реализуетсяIConvertible. |
| InvalidCastException | Значение атрибута`null`, но запрошенный тип является типом значения. |
| FormatException | Не удалось выполнить преобразование, поскольку значение имеет неверный формат. |
| OverflowException | Преобразование не выполнено из-за переполнения. |

### Примечания

Этот метод автоматически преобразует значение в тип, запрошенный в параметре универсального типа.  Если слой не требует, чтобы его объекты имели значения для всех атрибутов, определенных для слоя, этот метод может дать сбой сInvalidOperationException когда запрашивается отсутствующее значение. При работе с такими слоями рассмотрите возможность использования[`GetValueOrDefault`](../getvalueordefault/) .

### Смотрите также

* class [Feature](../)
* пространство имен [Aspose.Gis](../../feature/)
* сборка [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

Получает значение атрибута.

```csharp
public object GetValue(string attributeName)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| attributeName | String | Имя атрибута. |

### Возвращаемое значение

Значение атрибута.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Имя атрибута`null`. |
| ArgumentException | Атрибут с таким именем не существует в этом слое. |
| InvalidOperationException | Атрибут не заблокирован. |
| InvalidOperationException | Значение этого атрибута не установлено для этой функции. |

### Примечания

Если слой не требует, чтобы его объекты имели значения для всех атрибутов, определенных для слоя, этот метод может дать сбой сInvalidOperationException когда запрашивается отсутствующее значение. При работе с такими слоями рассмотрите возможность использования[`GetValueOrDefault`](../getvalueordefault/) .

### Смотрите также

* class [Feature](../)
* пространство имен [Aspose.Gis](../../feature/)
* сборка [Aspose.GIS](../../../)


