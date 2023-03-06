---
title: Map.Add
second_title: .NET API 참조를 위한 Aspose.GIS
description: Map 방법. 생성VectorMapLayer 기본 심볼라이저로 지도에 추가합니다. 레이어는 추가 순서로 렌더링됩니다.
type: docs
weight: 110
url: /ko/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

생성[`VectorMapLayer`](../../vectormaplayer/) 기본 심볼라이저로 지도에 추가합니다. 레이어는 추가 순서로 렌더링됩니다.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| layer | VectorLayer | 표현할 벡터 레이어[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` 벡터 레이어를 열린 상태로 두려면[`Map`](../) 개체가 삭제되었습니다. `false` 레이어를 폐기합니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 레이어는`null`. |

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../map/)
* 집회 [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

생성 및 추가[`VectorMapLayer`](../../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| layer | VectorLayer | 표현할 벡터 레이어[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | 렌더링에 사용할 심볼라이저입니다. 만약에`null`, 기본 심볼라이저가 사용됩니다. |
| keepOpen | Boolean | `true` 벡터 레이어를 열린 상태로 두려면[`Map`](../) 개체가 삭제되었습니다. `false` 레이어를 폐기합니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 레이어는`null`. |

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../map/)
* 집회 [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

생성 및 추가[`VectorMapLayer`](../../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| layer | VectorLayer | 표현할 벡터 레이어[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | 렌더링에 사용할 심볼라이저입니다. 만약에`null`, 기본 심볼라이저가 사용됩니다. |
| labeling | Labeling | 레이어의 피처에 레이블을 지정하는 데 사용할 레이블 지정. 만약에`null` , 기본[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) 사용됩니다. |
| keepOpen | Boolean | `true` 이후에 레이어를 열어 두려면[`Map`](../) 객체가 폐기되었습니다. 그렇지 않으면,`false` . |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 레이어는`null`. |

### 또한보십시오

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../map/)
* 집회 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

생성 및 추가[`VectorMapLayer`](../../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 다음으로 나타낼 기능 시퀀스[`VectorMapLayer`](../../vectormaplayer/). |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 기능 순서는`null`. |

### 또한보십시오

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../map/)
* 집회 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

생성 및 추가[`VectorMapLayer`](../../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 다음으로 나타낼 기능 시퀀스[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | 렌더링에 사용할 심볼라이저입니다. 만약에`null`, 기본 심볼라이저가 사용됩니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 기능 순서는`null`. |

### 또한보십시오

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../map/)
* 집회 [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

생성 및 추가[`VectorMapLayer`](../../vectormaplayer/) 지도로. 레이어는 추가 순서로 렌더링됩니다.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | 다음으로 나타낼 기능 시퀀스[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | 렌더링에 사용할 심볼라이저입니다. |
| labeling | Labeling | 레이어의 피처에 레이블을 지정하는 데 사용할 레이블 지정. 만약에`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) 사용됩니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 기능 순서는`null`. |

### 또한보십시오

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../map/)
* 집회 [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

맵에 레이어를 추가합니다. 레이어는 추가 순서로 렌더링됩니다.

```csharp
public void Add(MapLayer mapLayer)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| mapLayer | MapLayer | 추가할 레이어입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |

### 또한보십시오

* class [MapLayer](../../maplayer/)
* class [Map](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../map/)
* 집회 [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

생성[`RasterMapLayer`](../../rastermaplayer/) 기본 colorizer로 지도에 추가합니다.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| layer | RasterLayer | 표현할 벡터 레이어[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | 렌더링에 사용할 colorizer입니다. 만약에`null`, 기본 colorizer가 사용됩니다. |
| keepOpen | Boolean | `true` 래스터 레이어를 열린 상태로 두려면[`Map`](../) 개체가 삭제되었습니다. `false` 레이어를 폐기합니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 레이어는`null`. |

### 또한보십시오

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* 네임스페이스 [Aspose.Gis.Rendering](../../map/)
* 집회 [Aspose.GIS](../../../)


