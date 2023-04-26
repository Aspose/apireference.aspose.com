---
title: Class XpsGlyphs
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsGlyphs 수업. Glyphs 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 단일 글꼴에서 균일한 형식의 텍스트 실행을 나타냅니다. 정확한 렌더링에 필요한 정보를 제공하고 소비자 보기에서 search 및 선택 기능을 지원합니다.
type: docs
weight: 3100
url: /ko/net/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class

Glyphs 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 단일 글꼴에서 균일한 형식의 텍스트 실행을 나타냅니다. 정확한 렌더링에 필요한 정보를 제공하고 소비자 보기에서 search 및 선택 기능을 지원합니다.

```csharp
public sealed class XpsGlyphs : XpsContentElement
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [BidiLevel](../../aspose.page.xps.xpsmodel/xpsglyphs/bidilevel/) { get; set; } | 유니코드 알고리즘 양방향 내포 수준을 지정하는 값을 반환/설정합니다. 짝수 값은 왼쪽에서 오른쪽 레이아웃을 의미하고, 홀수 값은 오른쪽에서 왼쪽 레이아웃을 의미합니다. 오른쪽에서 왼쪽 레이아웃은 실행 원점을 오른쪽에 배치합니다. 첫 번째 글리프, 의 양수 전진 너비(왼쪽으로 전진을 나타냄)가 이전 글리프의 왼쪽에 후속 글리프를 배치합니다. |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | 요소의 렌더링된 영역을 제한하는 경로 지오메트리 인스턴스를 반환/설정합니다. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | 자식 요소의 수를 반환합니다. |
| [Fill](../../aspose.page.xps.xpsmodel/xpsglyphs/fill/) { get; set; } | 렌더링된 글리프의 모양을 채우는 데 사용되는 브러시를 반환/설정합니다. |
| [Font](../../aspose.page.xps.xpsmodel/xpsglyphs/font/) { get; } | 요소 텍스트를 조판하는 데 사용되는 트루타입 글꼴에 대한 글꼴 리소스를 반환합니다. |
| [FontRenderingEmSize](../../aspose.page.xps.xpsmodel/xpsglyphs/fontrenderingemsize/) { get; set; } | 유효 좌표 공간 단위의 float 로 표시되는 도면 표면 단위의 글꼴 크기를 반환/설정합니다. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | 하이퍼링크 대상 개체를 반환/설정합니다. |
| [IsSideways](../../aspose.page.xps.xpsmodel/xpsglyphs/issideways/) { get; set; } | 는 회전하지 않은 글리프의 상단 중심을 원점으로 하여 글리프가 측면으로 회전했음을 나타내는 값을 반환/설정합니다. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | 인덱스로 요소의 자식에 대한 액세스를 제공합니다.*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | 요소의 균일한 투명도를 정의하는 값을 반환/설정합니다. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | 불투명도 속성인 와 동일한 방식으로 요소에 적용되지만 요소의 다른 영역에 대해 다른 알파 값을 허용하는 알파 값 의 마스크를 지정하는 브러시를 반환/설정합니다. |
| [OriginX](../../aspose.page.xps.xpsmodel/xpsglyphs/originx/) { get; set; } | 유효 좌표 공간의 단위로 런 의 첫 번째 글리프의 x 좌표를 반환/설정합니다. |
| [OriginY](../../aspose.page.xps.xpsmodel/xpsglyphs/originy/) { get; set; } | 실행에서 첫 번째 글리프의 y 좌표인 를 유효 좌표 공간 단위로 반환/설정합니다. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | 요소의 모든 속성과 모든 하위 요소(있는 경우)에 대해 새 좌표 프레임 을 설정하는 아핀 변환 매트릭스를 반환/설정합니다. |
| [StyleSimulations](../../aspose.page.xps.xpsmodel/xpsglyphs/stylesimulations/) { get; set; } | 스타일 시뮬레이션을 지정하는 값을 반환/설정합니다. |
| [UnicodeString](../../aspose.page.xps.xpsmodel/xpsglyphs/unicodestring/) { get; set; } | Glyphs 요소에 의해 렌더링된 텍스트 문자열을 반환/설정합니다. 텍스트는 유니코드 코드 포인트로 지정됩니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsglyphs/clone/)() | 이 글리프를 복제합니다. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | 의 구현IEnumerable 인터페이스. |

### 또한보십시오

* class [XpsContentElement](../xpscontentelement/)
* 네임스페이스 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 집회 [Aspose.Page](../../)


