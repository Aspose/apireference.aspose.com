---
title: WheelEvent
second_title: Aspose.SVG for .NET API 参考
description: WheelEvent 接口提供与车轮事件相关的特定上下文信息要创建 WheelEvent 接口的实例请使用 WheelEvent 构造函数传递可选的 WheelEventInit 字典
type: docs
weight: 1020
url: /zh/net/aspose.svg.dom.events/wheelevent/
---
## WheelEvent class

WheelEvent 接口提供与车轮事件相关的特定上下文信息。要创建 WheelEvent 接口的实例，请使用 WheelEvent 构造函数，传递可选的 WheelEventInit 字典。

```csharp
public class WheelEvent : MouseEvent
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [WheelEvent](wheelevent#constructor)(string) | 初始化[`WheelEvent`](../wheelevent)类的新实例。 |
| [WheelEvent](wheelevent#constructor_1)(string, IDictionary&lt;string, object&gt;) | 初始化[`WheelEvent`](../wheelevent)类的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [AltKey](../../aspose.svg.dom.events/mouseevent/altkey) { get; } | 请参阅 altKey 属性。 |
| [Bubbles](../../aspose.svg.dom.events/event/bubbles) { get; } | 用于指示事件是否为冒泡事件。如果事件可以冒泡，则值为 true，否则值为 false。 |
| [Button](../../aspose.svg.dom.events/mouseevent/button) { get; } | 在由按下或释放鼠标按钮引起的鼠标事件期间，必须使用按钮来指示哪个指针设备按钮更改了状态。 |
| [Buttons](../../aspose.svg.dom.events/mouseevent/buttons) { get; } | 在任何鼠标事件期间，必须使用按钮来指示当前正在按下哪个鼠标按钮组合，以位掩码表示。 |
| [Cancelable](../../aspose.svg.dom.events/event/cancelable) { get; } | 用于指示事件是否可以阻止其默认操作。如果可以阻止默认操作，则值为 true，否则值为 false。 |
| [ClientX](../../aspose.svg.dom.events/mouseevent/clientx) { get; } | 事件发生时相对于与事件关联的视口的水平坐标。 |
| [ClientY](../../aspose.svg.dom.events/mouseevent/clienty) { get; } | 事件发生时相对于与事件关联的视口的垂直坐标。 |
| [CtrlKey](../../aspose.svg.dom.events/mouseevent/ctrlkey) { get; } | 请参阅 ctrlKey 属性。 |
| [CurrentTarget](../../aspose.svg.dom.events/event/currenttarget) { get; } | 用于表示[`IEventTarget`](../ieventtarget)的[`IEventListener`](../ieventlistener)s 当前正在处理中。 这在捕获和冒泡时特别有用。 |
| [DefaultPrevented](../../aspose.svg.dom.events/event/defaultprevented) { get; } | 如果在可取消属性值为 true 时调用了 preventDefault()，则返回 true，否则返回 false。 |
| [DeltaMode](../../aspose.svg.dom.events/wheelevent/deltamode) { get; } | deltaMode 属性包含增量值测量单位的指示。默认值为 DOM_DELTA_PIXEL（像素）。 |
| [DeltaX](../../aspose.svg.dom.events/wheelevent/deltax) { get; } | 在滚轮事件的默认操作是滚动的用户代理中，该值必须是要滚动的沿 x 轴的测量值（以像素、行或页为单位）事件未被取消的情况。否则，这是轮设备绕 x 轴移动的特定于实现的测量（以像素、行或页为单位）。 |
| [DeltaY](../../aspose.svg.dom.events/wheelevent/deltay) { get; } | 在滚轮事件的默认操作是滚动的用户代理中，该值必须是要滚动的沿 y 轴的测量值（以像素、行或页为单位）事件未被取消的情况。否则，这是车轮设备绕 y 轴移动的特定于实现的测量（以像素、行或页为单位）。 |
| [DeltaZ](../../aspose.svg.dom.events/wheelevent/deltaz) { get; } | 在滚轮事件的默认操作是滚动的用户代理中，该值必须是要滚动的沿 z 轴的测量值（以像素、行或页为单位）事件未被取消的情况。否则，这是轮设备围绕 z 轴移动的特定于实现的测量（以像素、线或页为单位）。 |
| [Detail](../../aspose.svg.dom.events/uievent/detail) { get; } | 指定有关事件的一些详细信息，具体取决于事件的类型。 |
| [EventPhase](../../aspose.svg.dom.events/event/eventphase) { get; } | 用于指示当前正在评估事件流的哪个阶段。 |
| [IsTrusted](../../aspose.svg.dom.events/event/istrusted) { get; } | isTrusted 属性必须返回它被初始化的值。创建事件时，必须将属性初始化为 false。 |
| [MetaKey](../../aspose.svg.dom.events/mouseevent/metakey) { get; } | 请参阅 metaKey 属性。 |
| [RelatedTarget](../../aspose.svg.dom.events/mouseevent/relatedtarget) { get; } | 用于标识与 UI 事件相关的辅助 EventTarget，具体取决于事件类型。 |
| [ScreenX](../../aspose.svg.dom.events/mouseevent/screenx) { get; } | 事件发生时相对于屏幕坐标系原点的水平坐标。 |
| [ScreenY](../../aspose.svg.dom.events/mouseevent/screeny) { get; } | 事件发生时相对于屏幕坐标系原点的垂直坐标。 |
| [ShiftKey](../../aspose.svg.dom.events/mouseevent/shiftkey) { get; } | 请参阅 shiftKey 属性。 |
| [Target](../../aspose.svg.dom.events/event/target) { get; } | 用于指示最初将事件调度到的[`IEventTarget`](../ieventtarget)。 |
| [TimeStamp](../../aspose.svg.dom.events/event/timestamp) { get; } | 用于指定创建事件的时间（相对于纪元的毫秒数）。 由于某些系统可能不提供此信息，timeStamp 的值可能不适用于所有事件。 不可用时，将返回值 0。 纪元时间的示例是系统启动时间或 1970 年 1 月 1 日 0:0:0 UTC。 |
| [Type](../../aspose.svg.dom.events/event/type) { get; } | 事件的名称（不区分大小写）。该名称必须是 XML 名称。 |
| [View](../../aspose.svg.dom.events/uievent/view) { get; } | view 属性标识生成事件的窗口。 该属性的未初始化值必须为空。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype)() | 此方法用于检索 ECMAScript 对象Type。 |
| [InitEvent](../../aspose.svg.dom.events/event/initevent)(string, bool, bool) | [`InitEvent`](../event/initevent)方法用于初始化通过 [`IDocumentEvent`](../idocumentevent)接口创建的[`Event`](../event)的值。 |
| [PreventDefault](../../aspose.svg.dom.events/event/preventdefault)() | 如果一个事件是可取消的，[`PreventDefault`](../event/preventdefault)方法用于表示该事件将被取消， 表示实现通常作为事件结果而采取的任何默认操作都不会发生。 |
| [StopImmediatePropagation](../../aspose.svg.dom.events/event/stopimmediatepropagation)() | 调用此方法可防止事件到达在当前事件侦听器之后注册的任何事件侦听器，并且在树中分派时还可防止事件到达任何其他对象。 |
| [StopPropagation](../../aspose.svg.dom.events/event/stoppropagation)() | [`StopPropagation`](../event/stoppropagation)方法用于防止在事件流期间进一步传播事件。 |

## 字段

| 姓名 | 描述 |
| --- | --- |
| const [DOM_DELTA_LINE](../../aspose.svg.dom.events/wheelevent/dom_delta_line) | delta 的度量单位必须是单独的文本行。许多表单控件都是这种情况。 |
| const [DOM_DELTA_PAGE](../../aspose.svg.dom.events/wheelevent/dom_delta_page) | delta 的度量单位必须是页面，可以定义为单个屏幕或定义为分界的页面。 |
| const [DOM_DELTA_PIXEL](../../aspose.svg.dom.events/wheelevent/dom_delta_pixel) | delta 的测量单位必须是像素。这是大多数操作系统和实现配置中最典型的情况。 |

### 也可以看看

* class [MouseEvent](../mouseevent)
* 命名空间 [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events)
* 部件 [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
