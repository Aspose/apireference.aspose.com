---
title: DocumentLoadErrorEvent
second_title: Справочник по Aspose.SVG для .NET API
description: DocumentLoadErrorEvent./documentloaderroreventвозникает когда запрошенный ресурс недоступен.
type: docs
weight: 910
url: /ru/net/aspose.svg.dom.events/documentloaderrorevent/
---
## DocumentLoadErrorEvent class

[`DocumentLoadErrorEvent`](../documentloaderrorevent)возникает, когда запрошенный ресурс недоступен.

```csharp
public class DocumentLoadErrorEvent : ErrorEvent
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Используется, чтобы указать, является ли событие всплывающим событием. Если событие может всплыть, значение будет истинным, в противном случае значение будет ложным. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Используется для указания того, можно ли предотвратить событие по умолчанию. Если действие по умолчанию можно предотвратить, значение равно true, в противном случае — значение false. |
| [ColNo](../../aspose.svg.dom.events/errorevent/colno) { get; } | Атрибут colno должен возвращать значение, которым он был инициализирован. При создании объекта этот атрибут должен быть инициализирован нулем. Он представляет собой номер столбца, в котором произошла ошибка в скрипте. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Используется для обозначения[`IEventTarget`](../ieventtarget), чей[`IEventListener`](../ieventlistener)в настоящее время обрабатываются. Это особенно полезно во время захвата и всплытия. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Возвращает true, если функция preventDefault() была вызвана, когда значение отменяемого атрибута равно true, и false в противном случае. |
| [Error](../../aspose.svg.dom.events/errorevent/error) { get; } | Атрибут ошибки должен возвращать значение, которым он был инициализирован. При создании объекта этот атрибут должен быть инициализирован нулем. Там, где это уместно, устанавливается объект, представляющий ошибку (например, объект исключения в случае неперехваченного исключения DOM). |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Используется для указания того, какая фаза потока событий оценивается в данный момент. |
| [FileName](../../aspose.svg.dom.events/errorevent/filename) { get; } | Атрибут имени файла должен возвращать значение, которым он был инициализирован. При создании объекта этот атрибут должен быть инициализирован пустой строкой. Он представляет собой абсолютный URL-адрес сценария, в котором изначально возникла ошибка. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | Атрибут isTrusted должен возвращать значение, которым он был инициализирован. При создании события атрибут должен быть инициализирован значением false. |
| [LineNo](../../aspose.svg.dom.events/errorevent/lineno) { get; } | Атрибут lineno должен возвращать значение, которым он был инициализирован. При создании объекта этот атрибут должен быть инициализирован нулем. Он представляет собой номер строки, в которой произошла ошибка в скрипте. |
| [Message](../../aspose.svg.dom.events/errorevent/message) { get; } | Атрибут сообщения должен возвращать значение, которым он был инициализирован. При создании объекта этот атрибут должен быть инициализирован пустой строкой. Он представляет собой сообщение об ошибке. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Используется для указания[`IEventTarget`](../ieventtarget), на который изначально было отправлено событие. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Используется для указания времени (в миллисекундах относительно эпохи), в которое было создано событие. В связи с тем, что некоторые системы могут не предоставлять эту информацию, значение timeStamp может быть доступно не для всех событий. Если параметр недоступен, будет возвращено значение 0. Примерами времени эпохи являются время запуска системы или 0:0:0 UTC 1 января 1970 года. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Имя события (без учета регистра). Имя должно быть именем XML. |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Этот метод используется для получения объекта ECMAScriptType. |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | Метод[`InitEvent`](../event/initevent)используется для инициализации значение объекта[`Event`](../event), созданного через интерфейс [`IDocumentEvent`](../idocumentevent). |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Если событие можно отменить, метод[`PreventDefault`](../event/preventdefault)используется для обозначения того, что событие должно быть отменено, означает, что никакие действия по умолчанию, обычно выполняемые реализацией в результате события, не будут выполняться. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Вызов этого метода не позволяет событию достичь каких-либо прослушивателей событий, зарегистрированных после текущего, а при отправке в дереве также предотвращает достижение события любыми другими объектами. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | Метод[`StopPropagation`](../event/stoppropagation)используется для предотвращения дальнейшего распространения события во время потока событий. |

### Смотрите также

* class [ErrorEvent](../errorevent)
* пространство имен [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* сборка [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
