---
title: Class XpsPath
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsPath 수업. 경로 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 벡터 그래픽과 이미지를 고정 페이지에 추가하는 유일한 수단입니다. 페이지에서 렌더링할 단일 벡터 그래픽을 정의합니다.
type: docs
weight: 3260
url: /ko/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

경로 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 벡터 그래픽과 이미지를 고정 페이지에 추가하는 유일한 수단입니다. 페이지에서 렌더링할 단일 벡터 그래픽을 정의합니다.

```csharp
public sealed class XpsPath : XpsContentElement
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | 요소의 렌더링된 영역을 제한하는 경로 지오메트리 인스턴스를 반환/설정합니다. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | 자식 요소의 수를 반환합니다. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | 경로의 형상을 반환/설정합니다. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | 경로의 Data 속성에 지정된 지오메트리를 그리는 데 사용되는 브러시를 반환/설정합니다. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | 하이퍼링크 대상 개체를 반환/설정합니다. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | 인덱스로 요소의 자식에 대한 액세스를 제공합니다.*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | 요소의 균일한 투명도를 정의하는 값을 반환/설정합니다. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | 불투명도 속성인 와 동일한 방식으로 요소에 적용되지만 요소의 다른 영역에 대해 다른 알파 값을 허용하는 알파 값 의 마스크를 지정하는 브러시를 반환/설정합니다. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | 요소의 모든 속성과 모든 하위 요소(있는 경우)에 대해 새 좌표 프레임 을 설정하는 아핀 변환 매트릭스를 반환/설정합니다. |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | 스트로크를 그리는 데 사용되는 브러시를 반환/설정합니다. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | 대시의 길이와 아웃라인 획의 간격을 지정하는 배열을 반환/설정합니다. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | 각 대시의 끝을 그리는 방법을 지정하는 값을 반환/설정합니다. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | 대시 배열 패턴 반복 시작점을 반환/설정합니다. 이 값을 생략하면 대시 배열이 스트로크의 원점에 정렬됩니다. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | 스트로크에서 마지막 대시의 끝 모양을 정의하는 값을 반환/설정합니다. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환/설정합니다. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | 최대 마이터 길이와 스트로크 두께의 절반 사이의 비율을 반환/설정합니다. 이 값은`StrokeLineJoin` 속성 지정`연귀` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | 스트로크에서 첫 번째 대시의 시작 모양을 정의하는 값을 반환/설정합니다. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | 유효 좌표 공간(경로의 렌더링 변환 포함)의 단위로 스트로크의 두께를 반환/설정합니다. StrokeThickness의 절반은 Data 속성에서 지정한 지오메트리 외부로 확장 되고 나머지 절반은 지오메트리 내부로 확장됩니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | 이 경로를 복제합니다. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | 의 구현IEnumerable 인터페이스. |

### 또한보십시오

* class [XpsContentElement](../xpscontentelement/)
* 네임스페이스 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 집회 [Aspose.Page](../../)


