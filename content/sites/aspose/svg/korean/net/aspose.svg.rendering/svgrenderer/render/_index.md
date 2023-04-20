---
title: SvgRenderer.Render
second_title: .NET API 참조용 Aspose.SVG
description: SvgRenderer 방법. 다중 렌더링 방법을 정의합니다.SVGDocument 구체적으로IDevice .
type: docs
weight: 20
url: /ko/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

다중 렌더링 방법을 정의합니다.[`SVGDocument`](../../../aspose.svg/svgdocument/) 구체적으로[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | IDevice | 출력 장치. |
| timeout | TimeSpan | ㅏTimeSpan 대기 시간(밀리초) 또는TimeSpan 무기한 대기하는 -1밀리초를 나타냅니다. |
| documents | SVGDocument[] | 렌더링할 문서입니다. |

### 또한보십시오

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* 네임스페이스 [Aspose.Svg.Rendering](../../svgrenderer/)
* 집회 [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

다중 렌더링 방법을 정의합니다.[`SVGDocument`](../../../aspose.svg/svgdocument/) 특정으로[`IDevice`](../../idevice/) , 취소 토큰을 사용하여 작업 취소를 요청합니다.

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | IDevice | 출력 장치. |
| cancellationToken | CancellationToken | 작업이 완료되기를 기다리는 동안 관찰할 취소 토큰입니다. |
| documents | SVGDocument[] | 렌더링할 문서입니다. |

### 또한보십시오

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* 네임스페이스 [Aspose.Svg.Rendering](../../svgrenderer/)
* 집회 [Aspose.SVG](../../../)


