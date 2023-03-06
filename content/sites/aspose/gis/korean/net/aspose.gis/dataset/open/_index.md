---
title: Dataset.Open
second_title: .NET API 참조를 위한 Aspose.GIS
description: Dataset 방법. 데이터 세트를 엽니다.
type: docs
weight: 20
url: /ko/net/aspose.gis/dataset/open/
---
## Open(string, FileDriver) {#open_3}

데이터 세트를 엽니다.

```csharp
public static Dataset Open(string path, FileDriver driver)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 데이터세트의 경로입니다. |
| driver | FileDriver | 사용할 드라이버입니다. |

### 반환 값

인스턴스[`Dataset`](../).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* 네임스페이스 [Aspose.Gis](../../dataset/)
* 집회 [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver) {#open}

데이터 세트를 엽니다.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 데이터세트의 경로입니다. |
| driver | FileDriver | 사용할 드라이버입니다. |

### 반환 값

인스턴스[`Dataset`](../).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [Dataset](../)
* 네임스페이스 [Aspose.Gis](../../dataset/)
* 집회 [Aspose.GIS](../../../)

---

## Open(string, FileDriver, DriverOptions) {#open_4}

데이터 세트를 엽니다.

```csharp
public static Dataset Open(string path, FileDriver driver, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | String | 데이터세트의 경로입니다. |
| driver | FileDriver | 사용할 드라이버입니다. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`Dataset`](../).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* 네임스페이스 [Aspose.Gis](../../dataset/)
* 집회 [Aspose.GIS](../../../)

---

## Open(AbstractPath, FileDriver, DriverOptions) {#open_1}

데이터 세트를 엽니다.

```csharp
public static Dataset Open(AbstractPath path, FileDriver driver, DriverOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| path | AbstractPath | 데이터세트의 경로입니다. |
| driver | FileDriver | 사용할 드라이버입니다. |
| options | DriverOptions | 드라이버별 옵션. |

### 반환 값

인스턴스[`Dataset`](../).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [Dataset](../)
* 네임스페이스 [Aspose.Gis](../../dataset/)
* 집회 [Aspose.GIS](../../../)

---

## Open(IDbConnection, DatabaseDriver) {#open_2}

데이터 세트를 엽니다.

```csharp
public static Dataset Open(IDbConnection connection, DatabaseDriver driver)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| connection | IDbConnection | 데이터베이스에 대한 연결을 열었습니다. |
| driver | DatabaseDriver | 사용할 드라이버입니다. |

### 반환 값

인스턴스[`Dataset`](../).

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| ArgumentNullException | 경로는`null`. |
| [GisException](../../gisexception/) | 데이터세트를 읽는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |

### 또한보십시오

* class [DatabaseDriver](../../databasedriver/)
* class [Dataset](../)
* 네임스페이스 [Aspose.Gis](../../dataset/)
* 집회 [Aspose.GIS](../../../)


