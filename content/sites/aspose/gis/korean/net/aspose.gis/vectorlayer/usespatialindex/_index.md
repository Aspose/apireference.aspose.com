---
title: VectorLayer.UseSpatialIndex
second_title: .NET API 참조를 위한 Aspose.GIS
description: VectorLayer 방법. 공간 인덱스를 로드하여 다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높입니다.WhereIntersects 및NearestTo. 인덱스가 없으면 먼저 생성합니다. 사용forceRebuild 인덱스 재생성 강제로.
type: docs
weight: 190
url: /ko/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

공간 인덱스를 로드하여 다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높입니다.[`WhereIntersects`](../../featuressequence/whereintersects/) 및[`NearestTo`](../nearestto/). 인덱스가 없으면 먼저 생성합니다. 사용*forceRebuild* 인덱스 재생성 강제로.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| indexPath | String | 색인 파일의 경로입니다. |
| forceRebuild | Boolean | 인덱스가 이미 존재하더라도 다시 생성할지 여부입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| IOException | I/O 오류가 발생했습니다. |
| InvalidOperationException | 이 레이어에 대한 공간 색인이 이미 로드되었습니다. |
| [GisException](../../gisexception/) | 파일이 존재하며 Aspose.GIS에서 생성한 공간 인덱스 파일이 아닙니다. |

### 또한보십시오

* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

공간 인덱스를 로드하여 다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높입니다.[`WhereIntersects`](../../featuressequence/whereintersects/) 및[`NearestTo`](../nearestto/). 인덱스가 없으면 먼저 생성합니다. 사용*forceRebuild* 인덱스 재생성 강제로.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| indexPath | AbstractPath | 색인 파일의 경로입니다. |
| forceRebuild | Boolean | 인덱스가 이미 존재하더라도 다시 생성할지 여부입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| IOException | I/O 오류가 발생했습니다. |
| InvalidOperationException | 이 레이어에 대한 공간 색인이 이미 로드되었습니다. |
| [GisException](../../gisexception/) | 파일이 존재하며 Aspose.GIS에서 생성한 공간 인덱스 파일이 아닙니다. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)


