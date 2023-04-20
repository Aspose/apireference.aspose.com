---
title: Document.CreateEvent
second_title: Справочник по Aspose.SVG для .NET API
description: Document метод. СоздаетEvent типа поддерживаемого реализацией.
type: docs
weight: 880
url: /ru/net/aspose.svg.dom/document/createevent/
---
## Document.CreateEvent method

Создает[`Event`](../../../aspose.svg.dom.events/event/) типа, поддерживаемого реализацией.

```csharp
public Event CreateEvent(string eventType)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| eventType | String | Параметр eventType указывает тип[`Event`](../../../aspose.svg.dom.events/event/) интерфейс, который нужно создать.  Если[`Event`](../../../aspose.svg.dom.events/event/) указанный интерфейс поддерживается реализацией, этот метод будет возвращать новый[`Event`](../../../aspose.svg.dom.events/event/) запрошенного типа интерфейса. Если[`Event`](../../../aspose.svg.dom.events/event/)должен быть отправлен через[`DispatchEvent`](../../../aspose.svg.dom.events/ieventtarget/dispatchevent/) метод надлежащего[`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) Метод должен быть вызван после создания, чтобы инициализировать[`Event`](../../../aspose.svg.dom.events/event/) значения s. |

### Возвращаемое значение

Недавно созданный[`Event`](../../../aspose.svg.dom.events/event/)

### Исключения

| исключение | условие |
| --- | --- |
| [DOMException](../../domexception/) | NOT_SUPPORTED_ERR: Возникает, если реализация не поддерживает тип[`Event`](../../../aspose.svg.dom.events/event/) запрошенный интерфейс |

### Смотрите также

* class [Event](../../../aspose.svg.dom.events/event/)
* class [Document](../)
* пространство имен [Aspose.Svg.Dom](../../document/)
* сборка [Aspose.SVG](../../../)


