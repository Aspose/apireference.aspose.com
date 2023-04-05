---
title: Class XpsVisualBrush
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsVisualBrush 수업. VisualBrush 속성 요소 기능을 캡슐화하는 클래스. 이 요소는 그림으로 영역을 채우는 데 사용됩니다.
type: docs
weight: 3420
url: /ko/net/aspose.page.xps.xpsmodel/xpsvisualbrush/
---
## XpsVisualBrush class

VisualBrush 속성 요소 기능을 캡슐화하는 클래스. 이 요소는 그림으로 영역을 채우는 데 사용됩니다.

```csharp
public sealed class XpsVisualBrush : XpsTilingBrush
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Opacity](../../aspose.page.xps.xpsmodel/xpsbrush/opacity/) { get; set; } | 브러시 채우기의 균일한 투명도를 정의하는 값을 반환/설정합니다. |
| [TileMode](../../aspose.page.xps.xpsmodel/xpstilingbrush/tilemode/) { get; set; } | 채워진 형상에서 타일링이 수행되는 방식을 지정하는 값을 반환/설정합니다. |
| [Transform](../../aspose.page.xps.xpsmodel/xpstransformablebrush/transform/) { get; set; } | 브러시의 좌표 공간에 적용된 매트릭스 변환을 반환/설정합니다. Transform 속성은 현재 유효 렌더 transform 와 연결되어 브러시에 로컬인 유효 렌더 변환을 생성합니다. brush 의 뷰포트는 로컬 유효 렌더링 변환을 사용하여 변환됩니다. |
| [Viewbox](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewbox/) { get; set; } | 뷰포트에 매핑될 브러시의 소스 콘텐츠 영역을 반환/설정합니다. |
| [Viewport](../../aspose.page.xps.xpsmodel/xpstilingbrush/viewport/) { get; set; } | 첫 번째 브러시 타일의 위치와 크기를 반환/설정합니다. 후속 타일은 타일 모드에서 지정한 대로 이 타일을 기준으로 position 됩니다. |
| [Visual](../../aspose.page.xps.xpsmodel/xpsvisualbrush/visual/) { get; } | 브러시의 소스 콘텐츠를 그리는 데 사용되는 경로, 글리프 또는 캔버스 요소를 반환/설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsvisualbrush/clone/)() | 이 시각적 브러시를 복제합니다. |
| [SetVisual](../../aspose.page.xps.xpsmodel/xpsvisualbrush/setvisual/)(XpsContentElement) | 세트*visual* 비주얼 브러시의 시각적 요소로. |

### 또한보십시오

* class [XpsTilingBrush](../xpstilingbrush/)
* 네임스페이스 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 집회 [Aspose.Page](../../)


