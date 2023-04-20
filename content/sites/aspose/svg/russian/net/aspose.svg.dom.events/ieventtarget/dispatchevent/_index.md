---
title: IEventTarget.DispatchEvent
second_title: Справочник по Aspose.SVG для .NET API
description: IEventTarget метод. Этот метод позволяет отправлять события в модель событий реализации.
type: docs
weight: 20
url: /ru/net/aspose.svg.dom.events/ieventtarget/dispatchevent/
---
## IEventTarget.DispatchEvent method

Этот метод позволяет отправлять события в модель событий реализации.

```csharp
public bool DispatchEvent(Event @event)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| event | Event | Задает тип события, поведение и контекстную информацию, которые будут использоваться при обработке события. |

### Возвращаемое значение

Возвращаемое значение[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) указывает, был ли какой-либо из слушателей, обработавших событие, вызванное[`PreventDefault`](../../event/preventdefault/) . Если[`PreventDefault`](../../event/preventdefault/) было вызвано, значение ложно, иначе значение истинно.

### Исключения

| исключение | условие |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) |  |

### Примечания

События, отправленные таким образом, будут иметь такое же поведение при захвате и воспроизведении, что и события, отправленные непосредственно реализацией. Целью события является[`EventTarget`](../../../aspose.svg.dom/eventtarget/) на которой[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) называется .

### Смотрите также

* class [Event](../../event/)
* interface [IEventTarget](../)
* пространство имен [Aspose.Svg.Dom.Events](../../ieventtarget/)
* сборка [Aspose.SVG](../../../)


