---
title: FileDriver.OpenDataset
second_title: .NET API 참조를 위한 Aspose.GIS
description: FileDriver 방법. 데이터 세트를 엽니다.
type: docs
weight: 80
url: /ko/net/aspose.gis/filedriver/opendataset/
---
## OpenDataset(string) {#opendataset_2}

데이터 세트를 엽니다.

```csharp
public Dataset OpenDataset(string path)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 데이터세트의 경로입니다. |

### 반환 값

인스턴스[`Dataset`](../../dataset/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 데이터 세트를 열 수 없습니다(참조[`CanOpenDatasets`](../canopendatasets/)). |

### 또한보십시오

* class [Dataset](../../dataset/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath) {#opendataset}

데이터 세트를 엽니다.

```csharp
public Dataset OpenDataset(AbstractPath path)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 데이터세트의 경로입니다. |

### 반환 값

인스턴스[`Dataset`](../../dataset/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 데이터 세트를 열 수 없습니다(참조[`CanOpenDatasets`](../canopendatasets/)). |

### 또한보십시오

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## OpenDataset(string, DriverOptions) {#opendataset_3}

데이터 세트를 엽니다.

```csharp
public Dataset OpenDataset(string path, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 데이터세트의 경로입니다. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`Dataset`](../../dataset/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 데이터 세트를 열 수 없습니다(참조[`CanOpenDatasets`](../canopendatasets/)). |

### 또한보십시오

* class [Dataset](../../dataset/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)

---

## OpenDataset(AbstractPath, DriverOptions) {#opendataset_1}

데이터 세트를 엽니다.

```csharp
public virtual Dataset OpenDataset(AbstractPath path, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 데이터세트의 경로입니다. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`Dataset`](../../dataset/).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 드라이버는 데이터 세트를 열 수 없습니다(참조[`CanOpenDatasets`](../canopendatasets/)). |

### 또한보십시오

* class [Dataset](../../dataset/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 네임스페이스 [Aspose.Gis](../../filedriver/)
* 집회 [Aspose.GIS](../../../)


