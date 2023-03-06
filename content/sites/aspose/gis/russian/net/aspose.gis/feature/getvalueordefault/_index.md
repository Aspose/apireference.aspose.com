---
title: Feature.GetValueOrDefault
second_title: Справочник по Aspose.GIS for .NET API
description: Feature метод. Получает значение атрибута илиDefaultValue если значение не установлено илинулевой .
type: docs
weight: 40
url: /ru/net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

Получает значение атрибута или[`DefaultValue`](../../featureattribute/defaultvalue/) если значение не установлено или`нулевой` .

```csharp
public T GetValueOrDefault<T>(string attributeName)
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

Этот метод автоматически преобразует значение в тип, запрошенный в параметре универсального типа.

### Смотрите также

* class [Feature](../)
* пространство имен [Aspose.Gis](../../feature/)
* сборка [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

Получает значение атрибута или[`DefaultValue`](../../featureattribute/defaultvalue/) если значение не установлено или`нулевой` .

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| attributeName | String | Имя атрибута. |
| defaultValue | Object | Возвращаемое значение, если значение атрибута отсутствует. Значение по умолчанию`null` . |

### Возвращаемое значение

Значение атрибута.

### Исключения

| исключение | условие |
| --- | --- |
| ArgumentNullException | Имя атрибута`null`. |
| ArgumentException | Атрибут с таким именем не существует в этом слое. |
| InvalidOperationException | Атрибут не заблокирован. |
| InvalidOperationException | Значение этого атрибута не установлено для этой функции. |

### Смотрите также

* class [Feature](../)
* пространство имен [Aspose.Gis](../../feature/)
* сборка [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

Получает значение атрибута или[`DefaultValue`](../../featureattribute/defaultvalue/) если значение не установлено или`нулевой` .

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| Параметр | Описание |
| --- | --- |
| T | Желаемый тип значения. |
| attributeName | Имя атрибута. |
| defaultValue | Возвращаемое значение, если значение атрибута отсутствует. |

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

Этот метод автоматически преобразует значение в тип, запрошенный в параметре универсального типа.

### Смотрите также

* class [Feature](../)
* пространство имен [Aspose.Gis](../../feature/)
* сборка [Aspose.GIS](../../../)


