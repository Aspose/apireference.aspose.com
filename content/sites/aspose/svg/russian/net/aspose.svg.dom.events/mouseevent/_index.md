---
title: MouseEvent
second_title: Справочник по Aspose.SVG для .NET API
description: Интерфейс MouseEvent предоставляет конкретную контекстную информацию связанную с событиями мыши.
type: docs
weight: 1000
url: /ru/net/aspose.svg.dom.events/mouseevent/
---
## MouseEvent class

Интерфейс MouseEvent предоставляет конкретную контекстную информацию, связанную с событиями мыши.

```csharp
public class MouseEvent : UIEvent
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [MouseEvent](mouseevent#constructor)(string) | Инициализирует новый экземпляр класса[`MouseEvent`](../mouseevent). |
| [MouseEvent](mouseevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | Инициализирует новый экземпляр класса[`MouseEvent`](../mouseevent). |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AltKey](../../aspose.svg.dom.events/mouseevent/altkey) { get; } | Обратитесь к атрибуту altKey. |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Используется, чтобы указать, является ли событие всплывающим событием. Если событие может всплыть, значение будет истинным, в противном случае значение будет ложным. |
| [Button](../../aspose.svg.dom.events/mouseevent/button) { get; } | Во время событий мыши, вызванных нажатием или отпусканием кнопки мыши, кнопка ДОЛЖНА использоваться для указания того, какая кнопка указателя изменила свое состояние. |
| [Buttons](../../aspose.svg.dom.events/mouseevent/buttons) { get; } | Во время любых событий мыши кнопки ДОЛЖНЫ использоваться для указания того, какая комбинация кнопок мыши нажата в данный момент, выраженная в виде битовой маски. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Используется для указания того, можно ли предотвратить событие по умолчанию. Если действие по умолчанию можно предотвратить, значение равно true, в противном случае — значение false. |
| [ClientX](../../aspose.svg.dom.events/mouseevent/clientx) { get; } | Горизонтальная координата, в которой произошло событие, относительно окна просмотра, связанного с событием. |
| [ClientY](../../aspose.svg.dom.events/mouseevent/clienty) { get; } | Вертикальная координата, в которой произошло событие, относительно окна просмотра, связанного с событием. |
| [CtrlKey](../../aspose.svg.dom.events/mouseevent/ctrlkey) { get; } | Обратитесь к атрибуту ctrlKey. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Используется для обозначения[`IEventTarget`](../ieventtarget), чей[`IEventListener`](../ieventlistener)в настоящее время обрабатываются. Это особенно полезно во время захвата и всплытия. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Возвращает true, если функция preventDefault() была вызвана, когда значение отменяемого атрибута равно true, и false в противном случае. |
| [Detail](../../aspose.svg.dom.events/uievent/detail) { get; } | Указывает некоторую подробную информацию о Событии, в зависимости от типа события. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Используется для указания того, какая фаза потока событий оценивается в данный момент. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | Атрибут isTrusted должен возвращать значение, которым он был инициализирован. При создании события атрибут должен быть инициализирован значением false. |
| [MetaKey](../../aspose.svg.dom.events/mouseevent/metakey) { get; } | Обратитесь к атрибуту metaKey. |
| [RelatedTarget](../../aspose.svg.dom.events/mouseevent/relatedtarget) { get; } | Используется для идентификации вторичной цели EventTarget, связанной с событием пользовательского интерфейса, в зависимости от типа события. |
| [ScreenX](../../aspose.svg.dom.events/mouseevent/screenx) { get; } | Горизонтальная координата, в которой произошло событие, относительно начала системы координат экрана. |
| [ScreenY](../../aspose.svg.dom.events/mouseevent/screeny) { get; } | Вертикальная координата, в которой произошло событие, относительно начала системы координат экрана. |
| [ShiftKey](../../aspose.svg.dom.events/mouseevent/shiftkey) { get; } | Обратитесь к атрибуту shiftKey. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Используется для указания[`IEventTarget`](../ieventtarget), на который изначально было отправлено событие. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Используется для указания времени (в миллисекундах относительно эпохи), в которое было создано событие. В связи с тем, что некоторые системы могут не предоставлять эту информацию, значение timeStamp может быть доступно не для всех событий. Если параметр недоступен, будет возвращено значение 0. Примерами времени эпохи являются время запуска системы или 0:0:0 UTC 1 января 1970 года. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Имя события (без учета регистра). Имя должно быть именем XML. |
| [View](../../aspose.svg.dom.events/uievent/view) { get; } | Атрибут представления идентифицирует окно, из которого было сгенерировано событие. Неинициализированное значение этого атрибута ДОЛЖНО быть нулевым. |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Этот метод используется для получения объекта ECMAScriptType. |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | Метод[`InitEvent`](../event/initevent)используется для инициализации значение объекта[`Event`](../event), созданного через интерфейс [`IDocumentEvent`](../idocumentevent). |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Если событие можно отменить, метод[`PreventDefault`](../event/preventdefault)используется для обозначения того, что событие должно быть отменено, означает, что никакие действия по умолчанию, обычно выполняемые реализацией в результате события, не будут выполняться. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Вызов этого метода не позволяет событию достичь каких-либо прослушивателей событий, зарегистрированных после текущего, а при отправке в дереве также предотвращает достижение события любыми другими объектами. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | Метод[`StopPropagation`](../event/stoppropagation)используется для предотвращения дальнейшего распространения события во время потока событий. |

### Смотрите также

* class [UIEvent](../uievent)
* пространство имен [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* сборка [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
