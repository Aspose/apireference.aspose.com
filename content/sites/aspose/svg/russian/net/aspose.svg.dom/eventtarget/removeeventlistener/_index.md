---
title: EventTarget.RemoveEventListener
second_title: Справочник по Aspose.SVG для .NET API
description: EventTarget метод. Этот метод позволяет удалить прослушиватели событий из цели события. ЕслиIEventListener удаляется изEventTarget пока он обрабатывает событие он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления.
type: docs
weight: 40
url: /ru/net/aspose.svg.dom/eventtarget/removeeventlistener/
---
## RemoveEventListener(string, DOMEventHandler, bool) {#removeeventlistener}

Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) удаляется из[`EventTarget`](../) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления.

```csharp
public void RemoveEventListener(string type, DOMEventHandler handler, bool useCapture)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| type | String | Определяет тип события[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) удаляются. |
| handler | DOMEventHandler | [`DOMEventHandler`](../../../aspose.svg.dom.events/domeventhandler/) параметр указывает[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) быть удалены. |
| useCapture | Boolean | Указывает, был ли удаленный EventListener зарегистрирован как прослушиватель захвата или нет. Если прослушиватель был зарегистрирован дважды, один с захватом и один без, каждый из них должен быть удален отдельно. того же слушателя и наоборот. |

### Смотрите также

* delegate [DOMEventHandler](../../../aspose.svg.dom.events/domeventhandler/)
* class [EventTarget](../)
* пространство имен [Aspose.Svg.Dom](../../eventtarget/)
* сборка [Aspose.SVG](../../../)

---

## RemoveEventListener(string, IEventListener) {#removeeventlistener_1}

Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) удаляется из[`EventTarget`](../) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления.

```csharp
public void RemoveEventListener(string type, IEventListener listener)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| type | String | Определяет тип события[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) удаляются. |
| listener | IEventListener | [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) параметр указывает[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) быть удалены. |

### Смотрите также

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* пространство имен [Aspose.Svg.Dom](../../eventtarget/)
* сборка [Aspose.SVG](../../../)

---

## RemoveEventListener(string, IEventListener, bool) {#removeeventlistener_2}

Этот метод позволяет удалить прослушиватели событий из цели события. Если[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) удаляется из[`EventTarget`](../) пока он обрабатывает событие, он не будет запущен текущими действиями. Прослушиватели событий никогда не могут быть вызваны после удаления.

```csharp
public void RemoveEventListener(string type, IEventListener listener, bool useCapture)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| type | String | Определяет тип события[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) удаляются. |
| listener | IEventListener | [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) параметр указывает[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener/) быть удалены. |
| useCapture | Boolean | Указывает, был ли удаленный EventListener зарегистрирован как прослушиватель захвата или нет. Если прослушиватель был зарегистрирован дважды, один с захватом и один без, каждый из них должен быть удален отдельно. того же слушателя и наоборот. |

### Смотрите также

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener/)
* class [EventTarget](../)
* пространство имен [Aspose.Svg.Dom](../../eventtarget/)
* сборка [Aspose.SVG](../../../)


