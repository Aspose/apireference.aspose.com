---
title: VectorLayer.Create
second_title: .NET API 참조를 위한 Aspose.GIS
description: VectorLayer 방법. 레이어를 생성하고 새 기능을 추가하기 위해 엽니다.
type: docs
weight: 10
url: /ko/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

레이어를 생성하고 새 기능을 추가하기 위해 엽니다.

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| driver | FileDriver | 사용할 드라이버입니다. |

### 반환 값

쓰기 전용 레이어.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

레이어를 생성하고 새 기능을 추가하기 위해 엽니다.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| driver | FileDriver | 사용할 드라이버입니다. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

쓰기 전용 레이어.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

레이어를 생성하고 새 기능을 추가하기 위해 엽니다.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| driver | FileDriver | 사용할 드라이버입니다. |

### 반환 값

쓰기 전용 레이어.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

레이어를 생성하고 새 기능을 추가하기 위해 엽니다.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| driver | FileDriver | 사용할 드라이버입니다. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

쓰기 전용 레이어.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 기능을 파일에 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| driver | FileDriver | 사용할 드라이버입니다. |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

인스턴스[`VectorLayer`](../).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버에서 공간 참조 시스템을 지원하지 않습니다. 사용[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) 공간 참조 시스템이 지원되는지 확인하기 위해. |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| driver | FileDriver | 사용할 드라이버입니다. |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

인스턴스[`VectorLayer`](../).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버에서 공간 참조 시스템을 지원하지 않습니다. 사용[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) 공간 참조 시스템이 지원되는지 확인하기 위해. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 파일 경로. |
| driver | FileDriver | 사용할 드라이버입니다. |
| options | DriverOptions | 드라이버별 옵션. |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

인스턴스[`VectorLayer`](../).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버에서 공간 참조 시스템을 지원하지 않습니다. 사용[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) 공간 참조 시스템이 지원되는지 확인하기 위해. |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

레이어를 생성하고 추가하기 위해 엽니다.

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 파일 경로. |
| driver | FileDriver | 사용할 드라이버입니다. |
| options | DriverOptions | 드라이버별 옵션. |
| spatialReferenceSystem | SpatialReferenceSystem | 공간 참조 시스템. |

### 반환 값

인스턴스[`VectorLayer`](../).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버에서 공간 참조 시스템을 지원하지 않습니다. 사용[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/) 공간 참조 시스템이 지원되는지 확인하기 위해. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)


