---
title: AddEventListener
second_title: Справочник по Aspose.SVG для .NET API
description: Этот метод позволяет регистрировать прослушиватели событий на цели события.
type: docs
weight: 10
url: /ru/net/aspose.svg.dom/eventtarget/addeventlistener/
---
## AddEventListener(string, DOMEventHandler, bool) {#addeventlistener}

Этот метод позволяет регистрировать прослушиватели событий на цели события.

```csharp
public void AddEventListener(string type, DOMEventHandler handler, bool useCapture)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| type | String | Тип события, на которое регистрируется пользователь |
| handler | DOMEventHandler | Принимает[`DOMEventHandler`](../../../aspose.svg.dom.events/domeventhandler)для вызова при возникновении события. |
| useCapture | Boolean | Если true, useCapture указывает, что пользователь желает инициировать захват. После инициации захвата все события указанного типа будут отправлены на зарегистрированный [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) до того, как будут отправляются на любые цели событий под ними в дереве. События, всплывающие вверх по дереву, не будут запускать[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener), предназначенный для использования захвата. |

### Примечания

Если[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener)добавляется к[`EventTarget`](../../eventtarget)во время обработки события не будет запущен текущими действиями, но может быть запущен на более позднем этапе потока событий, например, на этапе всплытия.

Если на одном и том же[`EventTarget`](../../eventtarget)с одним и тем же параметрам повторяющиеся экземпляры отбрасываются. Они не приводят к двойному вызову[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener)и, поскольку они отбрасываются, их не нужно удалять с помощью [`RemoveEventListener`](../removeeventlistener) метод.

### Смотрите также

* delegate [DOMEventHandler](../../../aspose.svg.dom.events/domeventhandler)
* class [EventTarget](../../eventtarget)
* пространство имен [Aspose.Svg.Dom](../../eventtarget)
* сборка [Aspose.SVG](../../../)

---

## AddEventListener(string, IEventListener) {#addeventlistener_1}

Этот метод позволяет регистрировать прослушиватели событий на цели события.

```csharp
public void AddEventListener(string type, IEventListener listener)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| type | String | Тип события, для которого регистрируется пользователь |
| listener | IEventListener | Принимает интерфейс, реализованный пользователем, который содержит методы, которые будут вызываться при возникновении события. |

### Примечания

Если[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener)добавляется к[`EventTarget`](../../eventtarget)во время обработки события не будет запущен текущими действиями, но может быть запущен на более позднем этапе потока событий, например, в фазе всплытия.

Если на одном и том же[`EventTarget`](../../eventtarget)с одним и тем же параметрам повторяющиеся экземпляры отбрасываются. Они не приводят к двойному вызову[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener)и, поскольку они отбрасываются, их не нужно удалять с помощью [`RemoveEventListener`](../removeeventlistener) метод.

### Смотрите также

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener)
* class [EventTarget](../../eventtarget)
* пространство имен [Aspose.Svg.Dom](../../eventtarget)
* сборка [Aspose.SVG](../../../)

---

## AddEventListener(string, IEventListener, bool) {#addeventlistener_2}

Этот метод позволяет регистрировать прослушиватели событий на цели события.

```csharp
public void AddEventListener(string type, IEventListener listener, bool useCapture)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| type | String | Тип события, для которого регистрируется пользователь |
| listener | IEventListener | Принимает интерфейс, реализованный пользователем, который содержит методы, которые будут вызываться при возникновении события. |
| useCapture | Boolean | Если true, useCapture указывает, что пользователь желает инициировать захват. После инициации захвата все события указанного типа будут отправлены на зарегистрированный [`IEventListener`](../../../aspose.svg.dom.events/ieventlistener) до того, как будут отправляются на любые цели событий под ними в дереве. События, всплывающие вверх по дереву, не будут запускать[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener), предназначенный для использования захвата. |

### Примечания

Если[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener)добавляется к[`EventTarget`](../../eventtarget)во время обработки события не будет запущен текущими действиями, но может быть запущен на более позднем этапе потока событий, например, в фазе всплытия.

Если на одном и том же[`EventTarget`](../../eventtarget)с одним и тем же параметрам повторяющиеся экземпляры отбрасываются. Они не приводят к двойному вызову[`IEventListener`](../../../aspose.svg.dom.events/ieventlistener)и, поскольку они отбрасываются, их не нужно удалять с помощью [`RemoveEventListener`](../removeeventlistener) метод.

### Смотрите также

* interface [IEventListener](../../../aspose.svg.dom.events/ieventlistener)
* class [EventTarget](../../eventtarget)
* пространство имен [Aspose.Svg.Dom](../../eventtarget)
* сборка [Aspose.SVG](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
