---
title: VectorLayer.UseAttributesIndex
second_title: .NET API 참조를 위한 Aspose.GIS
description: VectorLayer 방법. 다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높이기 위해 속성 색인을 로드합니다.WhereGreater. 인덱스가 없으면 먼저 생성합니다. 사용forceRebuild 인덱스 재생성 강제로.
type: docs
weight: 180
url: /ko/net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높이기 위해 속성 색인을 로드합니다.[`WhereGreater`](../../featuressequence/wheregreater/). 인덱스가 없으면 먼저 생성합니다. 사용*forceRebuild* 인덱스 재생성 강제로.

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| indexPath | String | 색인 파일의 경로입니다. |
| attributeName | String | 인덱스를 구축할 속성의 이름입니다. |
| forceRebuild | Boolean | 인덱스가 이미 존재하더라도 다시 생성할지 여부입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 해당 이름을 가진 속성이 레이어에 존재하지 않습니다. |
| IOException | I/O 오류가 발생했습니다. |
| InvalidOperationException | 이 레이어에 대해 이미 로드된 지정된 속성에 대한 인덱스입니다. |
| [GisException](../../gisexception/) | 파일이 존재하며 Aspose.GIS에서 생성한 속성 인덱스 파일이 아닙니다. |

### 또한보십시오

* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

다음과 같은 필터 방법에서 속성 값으로 필터링 속도를 높이기 위해 속성 색인을 로드합니다.[`WhereGreater`](../../featuressequence/wheregreater/). 인덱스가 없으면 먼저 생성합니다. 사용*forceRebuild* 인덱스 재생성 강제로.

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| indexPath | AbstractPath | 색인 파일의 경로입니다. |
| attributeName | String | 인덱스를 구축할 속성의 이름입니다. |
| forceRebuild | Boolean | 인덱스가 이미 존재하더라도 다시 생성할지 여부입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null`. |
| ArgumentException | 해당 이름을 가진 속성이 레이어에 존재하지 않습니다. |
| IOException | I/O 오류가 발생했습니다. |
| InvalidOperationException | 이 레이어에 대해 이미 로드된 지정된 속성에 대한 인덱스입니다. |
| [GisException](../../gisexception/) | 파일이 존재하며 Aspose.GIS에서 생성한 속성 인덱스 파일이 아닙니다. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)


