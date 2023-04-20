---
title: Class EventTarget
second_title: Справочник по Aspose.SVG для .NET API
description: Aspose.Svg.Dom.EventTarget сорт. EventTarget интерфейс реализуется всеми узлами в реализации которая поддерживает модель событий DOM. Таким образом этот интерфейс можно получить используя методы приведения для конкретных привязок к экземпляру интерфейса узла. Интерфейс позволяет регистрировать и удалять прослушиватели событий на анEventTarget и отправка событий на этотIEventTarget .
type: docs
weight: 870
url: /ru/net/aspose.svg.dom/eventtarget/
---
## EventTarget class

`EventTarget` интерфейс реализуется всеми узлами в реализации, которая поддерживает модель событий DOM. Таким образом, этот интерфейс можно получить, используя методы приведения для конкретных привязок к экземпляру интерфейса узла. Интерфейс позволяет регистрировать и удалять прослушиватели событий на ан`EventTarget` и отправка событий на этот[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) .

```csharp
public class EventTarget : DOMObject, IDisposable, IEventTarget
```

## Методы

| Имя | Описание |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener)(string, DOMEventHandler, bool) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_2)(string, IEventListener, bool) | Этот метод позволяет регистрировать прослушиватели событий в цели события. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Этот метод позволяет отправлять события в модель событий реализации. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Выполняет определяемые приложением задачи, связанные с освобождением, высвобождением или сбросом неуправляемых ресурсов. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Этот метод используется для получения объекта ECMAScript.Type . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) удаляется из`EventTarget` пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener)(string, DOMEventHandler, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) удаляется из`EventTarget` пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_2)(string, IEventListener, bool) | Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) удаляется из`EventTarget` пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления. |

### Смотрите также

* class [DOMObject](../domobject/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* пространство имен [Aspose.Svg.Dom](../../aspose.svg.dom/)
* сборка [Aspose.SVG](../../)


