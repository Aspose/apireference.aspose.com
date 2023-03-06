---
title: FileDriver.EditLayer
second_title: .NET API 참조를 위한 Aspose.GIS
description: FileDriver 방법. 편집을 위해 레이어를 엽니다.
type: docs
weight: 70
url: /ko/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

편집을 위해 레이어를 엽니다.

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

편집을 위해 레이어를 엽니다.

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`VectorLayer`](../../vectorlayer/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽는 중 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 레이어를 편집할 수 없습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 비고

드라이버는 모든 기능이 포함된 내부 레이어를 생성합니다. 그러나 RAM 대신 디스크 공간을 사용할 수 있는 옵션이 있습니다. 보다 최적의 리소스 사용을 위한 드라이버가 있습니다(특정 드라이버 설명서 참조). 또한 드라이버가 레이어를 생성하고 열 수 있는 경우 레이어를 편집할 수 있습니다.

### 또한보십시오

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)


