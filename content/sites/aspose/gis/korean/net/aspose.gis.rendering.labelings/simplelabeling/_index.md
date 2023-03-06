---
title: Class SimpleLabeling
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling 수업. 간단한 레이블 지정은 모든 기능에 레이블을 지정합니다.
type: docs
weight: 1700
url: /ko/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

간단한 레이블 지정은 모든 기능에 레이블을 지정합니다.

```csharp
public class SimpleLabeling : Labeling
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | 의 새 인스턴스를 초기화합니다.`SimpleLabeling` 클래스. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | 의 새 인스턴스를 초기화합니다.`SimpleLabeling` 클래스. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | 의 새 인스턴스를 초기화합니다.`SimpleLabeling` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | 기능을 처리하기 전에 이 레이블 지정을 구성하는 데 사용되는 콜백입니다. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | 텍스트의 색상을 결정합니다. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | 텍스트를 렌더링하는 데 사용할 글꼴 모음입니다. 기본값은 시스템 종속 값입니다. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | 텍스트 크기. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | 텍스트에 적용할 스타일. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | 피쳐 지오메트리를 레이블 지정을 위해 수정된 것으로 대체하는 방법을 제공합니다. 이 콜백은 다음에 처음으로 호출됩니다.[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . 기본값은`null` (피쳐 지오메트리를 있는 그대로 사용). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | 텍스트 주변의 후광(획) 색상입니다. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | 텍스트 주위의 후광(획) 크기입니다. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | 레이블 소스로 사용할 속성 이름입니다. 무시되는 경우[`LabelExpression`](./labelexpression/) 설정되었습니다. [`LabelAttribute`](./labelattribute/) 또는[`LabelExpression`](./labelexpression/) 렌더링하기 전에 설정해야 합니다. InvalidOperationException 그렇지 않으면 던져집니다. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | 레이블 텍스트를 사용자 정의하고 형식을 지정하는 방법을 제공합니다. 설정된 경우 재정의[`LabelAttribute`](./labelattribute/) . 둘 중 하나[`LabelAttribute`](./labelattribute/) 또는[`LabelExpression`](./labelexpression/) 렌더링하기 전에 설정해야 합니다. InvalidOperationException 그렇지 않으면 던져집니다. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | 멀티파트 기하학에 대한 렌더링 동작을 지정합니다. 기본값은All . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | 라벨 배치는 기능의 도형에 상대적으로 라벨을 배치하는 방법을 지정합니다. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | 다른 레이블과 중복되는 경우 이 레이블의 우선 순위를 나타냅니다. 우선 순위가 낮은 레이블은 렌더링되지 않습니다. 기본값은 1000입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | 이 인스턴스를 복제합니다. |

### 또한보십시오

* class [Labeling](../labeling/)
* 네임스페이스 [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* 집회 [Aspose.GIS](../../)


