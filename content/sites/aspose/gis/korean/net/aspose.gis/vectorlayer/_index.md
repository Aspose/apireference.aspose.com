---
title: Class VectorLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.VectorLayer 수업. 벡터 레이어를 나타냅니다. 벡터 레이어는 파일에 저장된 지리적 특징의 모음입니다.
type: docs
weight: 2320
url: /ko/net/aspose.gis/vectorlayer/
---
## VectorLayer class

벡터 레이어를 나타냅니다. 벡터 레이어는 파일에 저장된 지리적 특징의 모음입니다.

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## 속성

| 이름 | 설명 |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | 이 기능에 대한 사용자 정의 속성 모음을 가져옵니다.`VectorLayer` . |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | 이 레이어의 피처 수를 가져옵니다. |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | 가져오기[`Driver`](./driver/) 이 레이어를 인스턴스화했습니다. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | 레이어의 도형 유형을 가져옵니다. |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | 가져오기[`Feature`](../feature/) 지정된 index. 에서 |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | 이 기능 시퀀스의 공간 참조 시스템을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | 레이어를 생성하고 새 기능을 추가하기 위해 엽니다. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | 레이어를 생성하고 새 기능을 추가하기 위해 엽니다. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | 레이어를 생성하고 새 기능을 추가하기 위해 엽니다. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | 레이어를 생성하고 추가하기 위해 엽니다. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | 레이어를 생성하고 새 기능을 추가하기 위해 엽니다. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | 레이어를 생성하고 추가하기 위해 엽니다. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | 레이어를 생성하고 추가하기 위해 엽니다. |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | 레이어를 생성하고 추가하기 위해 엽니다. |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | 읽기 위해 레이어를 엽니다. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | 읽기 위해 레이어를 엽니다. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | 읽기 위해 레이어를 엽니다. |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | 읽기 위해 레이어를 엽니다. |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | 레이어에서 지원하는 경우 새 기능을 레이어에 추가합니다.`VectorLayer` 에스[`Driver`](./driver/) . |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | 레이어에서 지원하는 경우 지정된 스타일의 새 기능을 레이어에 추가합니다.`VectorLayer` 에스[`Driver`](./driver/) . |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | InMemory 형식으로 레이어 복제를 생성합니다. |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | 이 레이어의 속성 모음과 일치하는 속성을 가진 새 피처를 생성합니다(레이어에 추가하지는 않음). 피처에 대한 설정 데이터가 완료되면 다음을 사용합니다.[`Add`](./add/) 레이어에 기능을 추가하려면. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | 다른 속성을 복사합니다.`VectorLayer` 이것으로. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | 다른 속성을 복사합니다.`VectorLayer` 이것으로. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | 에서 사용하는 리소스를 해제합니다.`VectorLayer` . |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | 지정된 개체가 현재 개체와 같은지 여부를 결정합니다. |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | 컬렉션을 반복하는 열거자를 반환합니다. |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | 이 계층의 공간 범위를 가져옵니다. |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | 레이어를 현재 레이어에 결합합니다. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | 제공된 점에 가장 가까운 기능을 가져옵니다. |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | 제공된 좌표에 가장 가까운 기능을 가져옵니다. |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | 제거[`Feature`](../feature/) 지정된 index. 에서 |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | 교체[`Feature`](../feature/) 지정된 index. 에서 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | 피처 시퀀스를 레이어에 저장합니다. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | 피처 시퀀스를 레이어에 저장합니다. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | 피처 시퀀스를 레이어에 저장합니다. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | 피처 시퀀스를 레이어에 저장합니다. |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | 지오메트리 유형별로 기능을 분할합니다. |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | 다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높이기 위해 속성 색인을 로드합니다.[`WhereGreater`](../featuressequence/wheregreater/). 인덱스가 없으면 먼저 생성합니다. 사용*forceRebuild* 인덱스 재생성 강제로. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | 다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높이기 위해 속성 색인을 로드합니다.[`WhereGreater`](../featuressequence/wheregreater/). 인덱스가 없으면 먼저 생성합니다. 사용*forceRebuild* 인덱스 재생성 강제로. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | 공간 인덱스를 로드하여 다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높입니다.[`WhereIntersects`](../featuressequence/whereintersects/) 및[`NearestTo`](./nearestto/). 인덱스가 없으면 먼저 생성합니다. 사용*forceRebuild* 인덱스 재생성 강제로. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | 공간 인덱스를 로드하여 다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높입니다.[`WhereIntersects`](../featuressequence/whereintersects/) 및[`NearestTo`](./nearestto/). 인덱스가 없으면 먼저 생성합니다. 사용*forceRebuild* 인덱스 재생성 강제로. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | 제공된 값과 동일한 속성 값을 가진 기능을 선택합니다. |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | 제공된 값보다 큰 속성 값을 가진 기능을 선택합니다. |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | 속성 값이 제공된 값보다 크거나 같은 기능을 선택합니다. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | 범위를 기준으로 기능을 필터링합니다. |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | 다른 피처 시퀀스에 있는 모든 도형의 합집합을 기반으로 피처를 필터링합니다. |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | 제공된 지오메트리를 기반으로 피쳐를 필터링합니다. |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | 속성 값이 제공된 값과 같지 않은 기능을 선택합니다. |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | 속성이 null이 아닌 기능을 선택합니다. |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | 속성이 null인 피처를 선택합니다. |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | 속성이 설정된 피처를 선택합니다. |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | 제공된 값보다 작은 속성 값을 가진 피처를 선택합니다. |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | 속성 값이 제공된 값보다 작거나 같은 기능을 선택합니다. |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | 지정된 속성이 설정되지 않은 기능을 선택합니다. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | 레이어를 다른 형식으로 변환합니다. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | 레이어를 다른 형식으로 변환합니다. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | 레이어를 다른 형식으로 변환합니다. |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | 레이어를 다른 형식으로 변환합니다. |

### 또한보십시오

* class [FeaturesSequence](../featuressequence/)
* 네임스페이스 [Aspose.Gis](../../aspose.gis/)
* 집회 [Aspose.GIS](../../)


