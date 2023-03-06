---
title: Class FeaturesSequence
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.FeaturesSequence 수업. FeaturesSequence 벡터 기능 집합을 나타냅니다.
type: docs
weight: 170
url: /ko/net/aspose.gis/featuressequence/
---
## FeaturesSequence class

`FeaturesSequence` 벡터 기능 집합을 나타냅니다.

```csharp
public abstract class FeaturesSequence : IEnumerable<Feature>
```

## 속성

| 이름 | 설명 |
| --- | --- |
| abstract [Attributes](../../aspose.gis/featuressequence/attributes/) { get; } | 이 기능에 대한 사용자 정의 속성 모음을 가져옵니다.[`VectorLayer`](../vectorlayer/) . |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | 이 기능 시퀀스의 공간 참조 시스템을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | 컬렉션을 반복하는 열거자를 반환합니다. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | 이 계층의 공간 범위를 가져옵니다. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto)(AbstractPath, FileDriver) | 피처 시퀀스를 레이어에 저장합니다. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_2)(string, FileDriver) | 피처 시퀀스를 레이어에 저장합니다. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_1)(AbstractPath, FileDriver, SavingOptions) | 피처 시퀀스를 레이어에 저장합니다. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/#saveto_3)(string, FileDriver, SavingOptions) | 피처 시퀀스를 레이어에 저장합니다. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | 지오메트리 유형별로 기능을 분할합니다. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | 제공된 값과 동일한 속성 값을 가진 기능을 선택합니다. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | 제공된 값보다 큰 속성 값을 가진 기능을 선택합니다. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | 속성 값이 제공된 값보다 크거나 같은 기능을 선택합니다. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects)(Extent) | 범위를 기준으로 기능을 필터링합니다. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_1)(FeaturesSequence) | 다른 피처 시퀀스에 있는 모든 도형의 합집합을 기반으로 피처를 필터링합니다. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/#whereintersects_2)(IGeometry) | 제공된 지오메트리를 기반으로 피쳐를 필터링합니다. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | 속성 값이 제공된 값과 같지 않은 기능을 선택합니다. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | 속성이 null이 아닌 기능을 선택합니다. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | 속성이 null인 피처를 선택합니다. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | 속성이 설정된 피처를 선택합니다. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | 제공된 값보다 작은 속성 값을 가진 피처를 선택합니다. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | 속성 값이 제공된 값보다 작거나 같은 기능을 선택합니다. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | 지정된 속성이 설정되지 않은 기능을 선택합니다. |

### 또한보십시오

* class [Feature](../feature/)
* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


