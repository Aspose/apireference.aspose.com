---
title: SVGZoomEvent
second_title: Справочник по Aspose.SVG для .NET API
description: Событие масштабирования происходит когда пользователь инициирует действие которое приводит к изменению масштаба текущего представления фрагмента документа SVG. Обработчики событий распознаются только для элементов svg.
type: docs
weight: 1610
url: /ru/net/aspose.svg.events/svgzoomevent/
---
## SVGZoomEvent class

Событие масштабирования происходит, когда пользователь инициирует действие, которое приводит к изменению масштаба текущего представления фрагмента документа SVG. Обработчики событий распознаются только для элементов svg.

```csharp
public class SVGZoomEvent : Event
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Используется, чтобы указать, является ли событие всплывающим событием. Если событие может всплыть, значение будет истинным, в противном случае значение будет ложным. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Используется для указания того, можно ли предотвратить событие по умолчанию. Если действие по умолчанию можно предотвратить, значение равно true, в противном случае — значение false. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Используется для обозначения[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget), чей[`IEventListener`](../../aspose.svg.dom.events/ieventlistener)в настоящее время обрабатываются. Это особенно полезно во время захвата и всплытия. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Возвращает true, если функция preventDefault() была вызвана, когда значение отменяемого атрибута равно true, и false в противном случае. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Используется для указания того, какая фаза потока событий оценивается в данный момент. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | Атрибут isTrusted должен возвращать значение, которым он был инициализирован. При создании события атрибут должен быть инициализирован значением false. |
| [NewScale](../../aspose.svg.events/svgzoomevent/newscale) { get; } | Масштабный коэффициент, который будет действовать после обработки операции масштабирования. |
| [NewTranslate](../../aspose.svg.events/svgzoomevent/newtranslate) { get; } | Значения перевода, которые будут на месте после обработки операции масштабирования. Объект SVGPoint доступен только для чтения. |
| [PreviousScale](../../aspose.svg.events/svgzoomevent/previousscale) { get; } | Масштабный коэффициент от предыдущих операций масштабирования, который был установлен до выполнения операции масштабирования. |
| [PreviousTranslate](../../aspose.svg.events/svgzoomevent/previoustranslate) { get; } | Значения перевода из предыдущих операций масштабирования, которые были на месте до выполнения операции масштабирования. Объект SVGPoint доступен только для чтения. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Используется для указания[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget), на который изначально было отправлено событие. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Используется для указания времени (в миллисекундах относительно эпохи), в которое было создано событие. В связи с тем, что некоторые системы могут не предоставлять эту информацию, значение timeStamp может быть доступно не для всех событий. Если параметр недоступен, будет возвращено значение 0. Примерами времени эпохи являются время запуска системы или 0:0:0 UTC 1 января 1970 года. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Имя события (без учета регистра). Имя должно быть именем XML. |
| [ZoomRectScreen](../../aspose.svg.events/svgzoomevent/zoomrectscreen) { get; } | Указанный прямоугольник масштабирования в единицах экрана. Объект SVGRect доступен только для чтения. |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Этот метод используется для получения объекта ECMAScriptType. |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | Метод[`InitEvent`](../../aspose.svg.dom.events/event/initevent)используется для инициализации значение объекта[`Event`](../../aspose.svg.dom.events/event), созданного через интерфейс [`IDocumentEvent`](../../aspose.svg.dom.events/idocumentevent). |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Если событие можно отменить, метод[`PreventDefault`](../../aspose.svg.dom.events/event/preventdefault)используется для обозначения того, что событие должно быть отменено, означает, что никакие действия по умолчанию, обычно выполняемые реализацией в результате события, не будут выполняться. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Вызов этого метода не позволяет событию достичь каких-либо прослушивателей событий, зарегистрированных после текущего, а при отправке в дереве также предотвращает достижение события любыми другими объектами. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | Метод[`StopPropagation`](../../aspose.svg.dom.events/event/stoppropagation)используется для предотвращения дальнейшего распространения события во время потока событий. |

### Смотрите также

* class [Event](../../aspose.svg.dom.events/event)
* пространство имен [Aspose.Svg.Events](../../aspose.svg.events)
* сборка [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
