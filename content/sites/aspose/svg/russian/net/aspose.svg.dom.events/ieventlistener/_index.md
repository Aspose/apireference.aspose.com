---
title: Interface IEventListener
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Dom.Events.IEventListener интерфейс. IEventListenerинтерфейс является основным методом обработки событий. Пользователи реализуютIEventListener интерфейс и зарегистрировать своего слушателя наEventTarget используяAddEventListener method. Пользователи также должны удалить своиIEventListener от егоEventTarget после того как они завершили использование слушателя.
type: docs
weight: 950
url: /ru/net/aspose.svg.dom.events/ieventlistener/
---
## IEventListener interface

`IEventListener`интерфейс является основным методом обработки событий. Пользователи реализуют`IEventListener` интерфейс и зарегистрировать своего слушателя на[`EventTarget`](../../aspose.svg.dom/eventtarget/) используя[`AddEventListener`](../../aspose.svg.dom/eventtarget/addeventlistener/) method. Пользователи также должны удалить свои`IEventListener` от его[`EventTarget`](../../aspose.svg.dom/eventtarget/) после того, как они завершили использование слушателя.

```csharp
public interface IEventListener
```

## Методы

| Имя | Описание |
| --- | --- |
| [HandleEvent](../../aspose.svg.dom.events/ieventlistener/handleevent/)(Event) | Этот метод вызывается всякий раз, когда происходит событие того типа, для которого`IEventListener` интерфейс был зарегистрирован. |

### Примечания

Когда узел копируется с помощью метода cloneNode, прослушиватели событий, прикрепленные к исходному узлу, не присоединяются к скопированному узлу. Если пользователь хочет, чтобы те же прослушиватели событий были добавлены во вновь созданную копию, пользователь должен добавить их вручную.

### Смотрите также

* пространство имен [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* сборка [Aspose.SVG](../../)


