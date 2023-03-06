---
title: AbstractPath.Combine
second_title: Справочник по Aspose.GIS for .NET API
description: AbstractPath метод. Объединяет этоAbstractPath с указанными компонентами пути.
type: docs
weight: 50
url: /ru/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Объединяет это[`AbstractPath`](../) с указанными компонентами пути.

```csharp
public virtual AbstractPath Combine(string location)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| location | String | Компонент пути для добавления к этому[`AbstractPath`](../). |

### Возвращаемое значение

Новый[`AbstractPath`](../) указывая на[`Location`](../location/) это комбинация местоположений этого[`AbstractPath`](../)и аргумент.

### Примечания

Обычно этот метод не должен переопределяться наследником. Реализация по умолчанию объединяет это[`Location`](../location/) с аргументом и вызывает[`WithLocation`](../withlocation/) с объединенной строкой в качестве аргумента. Результат комбинации определяется следующим образом:  Если аргумент начинается с[`Separator`](../separator/), результат комбинации равен аргументу; В противном случае, если[`Location`](../location/) заканчивается с[`Separator`](../separator/) , результат комбинации равен` +`; В противном случае результат равен` + +`

### Смотрите также

* class [AbstractPath](../)
* пространство имен [Aspose.Gis](../../abstractpath/)
* сборка [Aspose.GIS](../../../)


