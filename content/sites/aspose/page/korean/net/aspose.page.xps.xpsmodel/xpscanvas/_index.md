---
title: Class XpsCanvas
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsModel.XpsCanvas 수업. 캔버스 요소 기능을 캡슐화하는 클래스. 이 요소는 요소를 함께 그룹화합니다. 예를 들어 글리프 및 경로 요소 는 하나의 단위하이퍼링크 대상로 식별하기 위해 캔버스에 그룹화하거나 구성 속성 값을 각 자식 및 조상 요소에 적용합니다.
type: docs
weight: 2980
url: /ko/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

캔버스 요소 기능을 캡슐화하는 클래스. 이 요소는 요소를 함께 그룹화합니다. 예를 들어 글리프 및 경로 요소 는 하나의 단위(하이퍼링크 대상)로 식별하기 위해 캔버스에 그룹화하거나 구성 속성 값을 각 자식 및 조상 요소에 적용합니다.

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | 요소의 렌더링된 영역을 제한하는 경로 지오메트리 인스턴스를 반환/설정합니다. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | 자식 요소의 수를 반환합니다. |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | 캔버스 내 경로의 가장자리가 렌더링되는 방식을 제어하는 값을 반환/설정합니다. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | 하이퍼링크 대상 개체를 반환/설정합니다. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | 인덱스로 요소의 자식에 대한 액세스를 제공합니다.*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | 요소의 균일한 투명도를 정의하는 값을 반환/설정합니다. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | 불투명도 속성인 와 동일한 방식으로 요소에 적용되지만 요소의 다른 영역에 대해 다른 알파 값을 허용하는 알파 값 의 마스크를 지정하는 브러시를 반환/설정합니다. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | 요소의 모든 속성과 모든 하위 요소(있는 경우)에 대해 새 좌표 프레임 을 설정하는 아핀 변환 매트릭스를 반환/설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | 이 캔버스의 하위 목록에 요소를 추가합니다. |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | 이 캔버스의 하위 목록에 새 캔버스를 추가합니다. |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | 이 캔버스의 하위 목록에 새 글리프를 추가합니다. |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | 이 캔버스의 하위 목록에 새 경로를 추가합니다. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | 이 캔버스를 복제합니다. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | 의 구현IEnumerable 인터페이스. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | 이 캔버스의 하위 목록에 요소를 삽입합니다.*index* 위치. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | 이 캔버스의 하위 목록에 새 캔버스를 삽입합니다.*index* 위치. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | 이 캔버스의 하위 목록에 새 글리프를 삽입합니다.*index* 위치. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | 이 캔버스의 하위 목록에 새 경로를 삽입합니다.*index* 위치. |

### 또한보십시오

* class [XpsContentElement](../xpscontentelement/)
* 네임스페이스 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 집회 [Aspose.Page](../../)


