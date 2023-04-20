---
title: Class RendererTDocument
second_title: .NET API 참조용 Aspose.SVG
description: Aspose.Svg.Rendering.Renderer1TDocument 수업. 모든 렌더러에 대한 추상 클래스를 나타냅니다.
type: docs
weight: 3000
url: /ko/net/aspose.svg.rendering/renderer-1/
---
## Renderer&lt;TDocument&gt; class

모든 렌더러에 대한 추상 클래스를 나타냅니다.

```csharp
public abstract class Renderer<TDocument> : Renderer
```

| 모수 | 설명 |
| --- | --- |
| TDocument | 문서의 유형입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Dispose](../../aspose.svg.rendering/renderer/dispose/)() | 관리되지 않는 리소스와 선택적으로 관리되는 리소스를 해제합니다. |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_3)(IDevice, TDocument) | 렌더링 방법 정의!:TDocument 지정된[`IDevice`](../idevice/) . |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_6)(IDevice, params TDocument[]) | 다중 렌더링 방법을 정의합니다.!:TDocument 구체적으로[`IDevice`](../idevice/) . |
| abstract [Render](../../aspose.svg.rendering/renderer-1/render/#render_1)(IDevice, CancellationToken, params TDocument[]) | 다중 렌더링 방법을 정의합니다.!:TDocument 특정으로[`IDevice`](../idevice/) , 취소 토큰을 사용하여 작업 취소를 요청합니다. |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render)(IDevice, int, params TDocument[]) | 다중 렌더링 방법을 정의합니다.!:TDocument 구체적으로[`IDevice`](../idevice/) . |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_4)(IDevice, TDocument, int) | 렌더링 방법 정의!:TDocument 지정된[`IDevice`](../idevice/) . |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_5)(IDevice, TDocument, TimeSpan) | 렌더링 방법 정의!:TDocument 지정된[`IDevice`](../idevice/) . |
| abstract [Render](../../aspose.svg.rendering/renderer-1/render/#render_2)(IDevice, TimeSpan, params TDocument[]) | 다중 렌더링 방법을 정의합니다.!:TDocument 구체적으로[`IDevice`](../idevice/) . |

### 또한보십시오

* class [Renderer](../renderer/)
* 네임스페이스 [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* 집회 [Aspose.SVG](../../)


