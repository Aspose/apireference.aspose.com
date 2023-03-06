---
title: Class Map
second_title: .NET API 참조를 위한 Aspose.GIS
description: Aspose.Gis.Rendering.Map 수업. 맵은 다음을 통해 서로 위에 렌더링할 수 있는 레이어 모음입니다.Renderer .
type: docs
weight: 1720
url: /ko/net/aspose.gis.rendering/map/
---
## Map class

맵은 다음을 통해 서로 위에 렌더링할 수 있는 레이어 모음입니다.[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | 의 새 인스턴스를 만듭니다.`지도` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | 지도의 배경색. 기본값은Transparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | 맵의 레이어 수를 가져옵니다. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | 렌더링할 지도의 경계를 지정합니다. 다음으로 설정한 경우`null` , 범위는 렌더링 중에 모든 레이어의 모든 형상을 포함하도록 계산됩니다. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | 지도의 시각적 높이입니다. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | 지정된 인덱스에서 레이어를 가져옵니다. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | 범위에 추가할 패딩을 지정합니다. |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | 이 맵을 렌더링하고 변환하는 데 사용할 해상도[`Measurement`](../measurement/) . 기본값은 96입니다. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) 지도의. |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | 지도의 시각적 너비입니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | 생성 및 추가[`VectorMapLayer`](../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | 맵에 레이어를 추가합니다. 레이어는 추가 순서로 렌더링됩니다. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | 생성 및 추가[`VectorMapLayer`](../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | 생성[`VectorMapLayer`](../vectormaplayer/) 기본 심볼라이저로 지도에 추가합니다. 레이어는 추가 순서로 렌더링됩니다. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | 생성 및 추가[`VectorMapLayer`](../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | 생성[`RasterMapLayer`](../rastermaplayer/) 기본 colorizer로 지도에 추가합니다. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | 생성 및 추가[`VectorMapLayer`](../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | 생성 및 추가[`VectorMapLayer`](../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | 리소스를 폐기합니다. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | 맵의 레이어를 반복하는 열거자를 반환합니다. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | 지도를 파일로 렌더링합니다. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | 지도를 파일로 렌더링합니다. |

### 또한보십시오

* class [MapLayer](../maplayer/)
* 네임스페이스 [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* 집회 [Aspose.GIS](../../)


