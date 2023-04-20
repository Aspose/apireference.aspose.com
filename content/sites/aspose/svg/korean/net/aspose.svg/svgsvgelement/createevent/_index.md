---
title: SVGSVGElement.CreateEvent
second_title: .NET API 참조용 Aspose.SVG
description: SVGSVGElement 방법. 생성Event 구현에서 지원하는 유형입니다.
type: docs
weight: 110
url: /ko/net/aspose.svg/svgsvgelement/createevent/
---
## SVGSVGElement.CreateEvent method

생성[`Event`](../../../aspose.svg.dom.events/event/) 구현에서 지원하는 유형입니다.

```csharp
public Event CreateEvent(string eventType)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| eventType | String | eventType 매개변수는 다음 유형을 지정합니다.[`Event`](../../../aspose.svg.dom.events/event/) 생성할 인터페이스.  만약[`Event`](../../../aspose.svg.dom.events/event/)지정된 인터페이스는 구현에서 지원됩니다. 이 메서드는 new 를 반환합니다.[`Event`](../../../aspose.svg.dom.events/event/) 요청된 인터페이스 유형의. [`Event`](../../../aspose.svg.dom.events/event/)를 통해 발송됩니다.[`DispatchEvent`](../../../aspose.svg.dom/eventtarget/dispatchevent/) method that [`InitEvent`](../../../aspose.svg.dom.events/event/initevent/) 메서드를 초기화하려면 생성 후 메서드를 호출해야 합니다.[`Event`](../../../aspose.svg.dom.events/event/) s 값. |

### 반환 값

새로 생성된[`Event`](../../../aspose.svg.dom.events/event/)

### 예외

| 예외 | 상태 |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | NOT_SUPPORTED_ERR: 구현이 다음 유형을 지원하지 않는 경우 발생합니다.[`Event`](../../../aspose.svg.dom.events/event/) 요청된 인터페이스 |

### 또한보십시오

* class [Event](../../../aspose.svg.dom.events/event/)
* class [SVGSVGElement](../)
* 네임스페이스 [Aspose.Svg](../../svgsvgelement/)
* 집회 [Aspose.SVG](../../../)


