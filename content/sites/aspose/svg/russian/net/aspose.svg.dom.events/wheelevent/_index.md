---
title: WheelEvent
second_title: Справочник по Aspose.SVG для .NET API
description: Интерфейс WheelEvent предоставляет конкретную контекстную информацию связанную с событиями колеса. Чтобы создать экземпляр интерфейса WheelEvent используйте конструктор WheelEvent передав необязательный словарь WheelEventInit.
type: docs
weight: 1010
url: /ru/net/aspose.svg.dom.events/wheelevent/
---
## WheelEvent class

Интерфейс WheelEvent предоставляет конкретную контекстную информацию, связанную с событиями колеса. Чтобы создать экземпляр интерфейса WheelEvent, используйте конструктор WheelEvent, передав необязательный словарь WheelEventInit.

```csharp
public class WheelEvent : MouseEvent
```

## Конструкторы

| Имя | Описание |
| --- | --- |
| [WheelEvent](wheelevent#constructor)(string) | Инициализирует новый экземпляр[`WheelEvent`](../wheelevent) класс. |
| [WheelEvent](wheelevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | Инициализирует новый экземпляр[`WheelEvent`](../wheelevent) класс. |

## Характеристики

| Имя | Описание |
| --- | --- |
| [AltKey](../../aspose.svg.dom.events/mouseevent/altkey) { get; } | Обратитесь к атрибуту altKey. |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | Используется для указания того, является ли событие всплывающим событием. Если событие может всплывать, значение равно true, иначе значение false. |
| [Button](../../aspose.svg.dom.events/mouseevent/button) { get; } | Во время событий мыши, вызванных нажатием или отпусканием кнопки мыши, кнопка ДОЛЖНА использоваться для указания того, какая кнопка указателя изменила свое состояние. |
| [Buttons](../../aspose.svg.dom.events/mouseevent/buttons) { get; } | Во время любых событий мыши кнопки ДОЛЖНЫ использоваться для указания того, какая комбинация кнопок мыши нажата в данный момент, выраженная в виде битовой маски. |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | Используется для указания того, можно ли предотвратить событие по умолчанию. Если действие по умолчанию можно предотвратить, значение равно true, в противном случае значение равно false. |
| [ClientX](../../aspose.svg.dom.events/mouseevent/clientx) { get; } | Горизонтальная координата, в которой произошло событие, относительно окна просмотра, связанного с событием. |
| [ClientY](../../aspose.svg.dom.events/mouseevent/clienty) { get; } | Вертикальная координата, в которой произошло событие, относительно окна просмотра, связанного с событием. |
| [CtrlKey](../../aspose.svg.dom.events/mouseevent/ctrlkey) { get; } | Обратитесь к атрибуту ctrlKey. |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | Используется для обозначения[`IEventTarget`](../ieventtarget) чья[`IEventListener`](../ieventlistener) в настоящее время обрабатываются. Это особенно полезно во время захвата и всплытия. |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | Возвращает значение true, если функция preventDefault() была вызвана, когда значение отменяемого атрибута равно true, и значение false в противном случае. |
| [DeltaMode](../../aspose.svg.dom.events/wheelevent/deltamode) { get; } | Атрибут deltaMode содержит указание на единицы измерения для дельта-значений. Значение по умолчанию — DOM_DELTA_PIXEL (в пикселях). |
| [DeltaX](../../aspose.svg.dom.events/wheelevent/deltax) { get; } | В пользовательских агентах, где действие по умолчанию для события колеса — прокрутка, значение ДОЛЖНО быть измерением по оси X (в пикселях, строках или страницах) для прокрутки в случае, если событие не отменено. В противном случае это зависящее от реализации измерение (в пикселях, строках или страницах) движения колесного устройства вокруг оси x. |
| [DeltaY](../../aspose.svg.dom.events/wheelevent/deltay) { get; } | В пользовательских агентах, где действие по умолчанию для события колеса — прокрутка, значение ДОЛЖНО быть измерением по оси Y (в пикселях, строках или страницах) для прокрутки в случае, если событие не отменено. В противном случае это специфичное для реализации измерение (в пикселях, строках или страницах) движения колесика вокруг оси Y. |
| [DeltaZ](../../aspose.svg.dom.events/wheelevent/deltaz) { get; } | В пользовательских агентах, где действие по умолчанию для события колеса — прокрутка, значение ДОЛЖНО быть измерением вдоль оси z (в пикселях, строках или страницах) для прокрутки в случае, если событие не отменено. В противном случае это зависящее от реализации измерение (в пикселях, строках или страницах) движения колесика вокруг оси Z. |
| [Detail](../../aspose.svg.dom.events/uievent/detail) { get; } | Указывает некоторую подробную информацию о событии в зависимости от типа события. |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | Используется для указания того, какая фаза потока событий оценивается в данный момент. |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | Атрибут isTrusted должен возвращать значение, которым он был инициализирован. При создании события атрибут должен быть инициализирован значением false. |
| [MetaKey](../../aspose.svg.dom.events/mouseevent/metakey) { get; } | Обратитесь к атрибуту metaKey. |
| [RelatedTarget](../../aspose.svg.dom.events/mouseevent/relatedtarget) { get; } | Используется для идентификации вторичной цели EventTarget, связанной с событием пользовательского интерфейса, в зависимости от типа события. |
| [ScreenX](../../aspose.svg.dom.events/mouseevent/screenx) { get; } | Горизонтальная координата, в которой произошло событие, относительно начала системы координат экрана. |
| [ScreenY](../../aspose.svg.dom.events/mouseevent/screeny) { get; } | Вертикальная координата, в которой произошло событие, относительно начала системы координат экрана. |
| [ShiftKey](../../aspose.svg.dom.events/mouseevent/shiftkey) { get; } | Обратитесь к атрибуту shiftKey. |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | Используется для обозначения[`IEventTarget`](../ieventtarget) которому изначально было отправлено событие. |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | Используется для указания времени (в миллисекундах относительно эпохи), в которое было создано событие. Из-за того, что некоторые системы могут не предоставлять эту информацию, значение timeStamp может быть недоступно для всех событий. Когда недоступно , будет возвращено значение 0. Примерами времени эпохи являются время запуска системы или 0:0:0 UTC 1 января 1970 года. |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | Имя события (без учета регистра). Имя должно быть именем XML. |
| [View](../../aspose.svg.dom.events/uievent/view) { get; } | Атрибут представления идентифицирует окно, из которого было сгенерировано событие. Неинициализированное значение этого атрибута ДОЛЖНО быть нулевым. |

## Методы

| Имя | Описание |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | Этот метод используется для получения объекта ECMAScript.Type . |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | [`InitEvent`](../event/initevent) метод используется для инициализации значения[`Event`](../event) создано через the [`IDocumentEvent`](../idocumentevent) интерфейс. |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | Если событие можно отменить,[`PreventDefault`](../event/preventdefault) метод используется для обозначения того, что событие должно быть отменено, означает, что любое действие по умолчанию, обычно выполняемое реализацией в результате события, не произойдет. |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | Вызов этого метода не позволяет событию достичь каких-либо прослушивателей событий, зарегистрированных после текущего, а при отправке в дерево также предотвращает достижение событием каких-либо других объектов. |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | [`StopPropagation`](../event/stoppropagation) используется метод предотвращения дальнейшего распространения события во время потока событий. |

## Поля

| Имя | Описание |
| --- | --- |
| const [DOM_DELTA_LINE](../../aspose.svg.dom.events/wheelevent/dom_delta_line) | Единицами измерения дельты ДОЛЖНЫ быть отдельные строки текста. Это относится ко многим элементам управления формы. |
| const [DOM_DELTA_PAGE](../../aspose.svg.dom.events/wheelevent/dom_delta_page) | Единицами измерения для дельты ДОЛЖНЫ быть страницы, определенные либо как один экран, либо как разграниченная страница. |
| const [DOM_DELTA_PIXEL](../../aspose.svg.dom.events/wheelevent/dom_delta_pixel) | Единицами измерения дельты ДОЛЖНЫ быть пиксели. Это наиболее типичный случай для большинства операционных систем и конфигураций реализации. |

### Смотрите также

* class [MouseEvent](../mouseevent)
* пространство имен [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* сборка [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
