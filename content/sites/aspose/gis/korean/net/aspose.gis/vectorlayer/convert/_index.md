---
title: VectorLayer.Convert
second_title: .NET API 참조를 위한 Aspose.GIS
description: VectorLayer 방법. 레이어를 다른 형식으로 변환합니다.
type: docs
weight: 200
url: /ko/net/aspose.gis/vectorlayer/convert/
---
## Convert(string, FileDriver, string, FileDriver) {#convert_2}

레이어를 다른 형식으로 변환합니다.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| sourcePath | String | 변환될 레이어의 경로입니다. |
| sourceDriver | FileDriver | 소스 레이어의 형식 드라이버입니다. |
| destinationPath | String | 변환 결과로 생성될 레이어의 경로입니다. |
| destinationDriver | FileDriver | 대상 레이어의 형식 드라이버입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로 중 하나는`null`. |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver) {#convert}

레이어를 다른 형식으로 변환합니다.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| sourcePath | AbstractPath | 변환될 레이어의 경로입니다. |
| sourceDriver | FileDriver | 소스 레이어의 형식 드라이버입니다. |
| destinationPath | AbstractPath | 변환 결과로 생성될 레이어의 경로입니다. |
| destinationDriver | FileDriver | 대상 레이어의 형식 드라이버입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로 중 하나는`null`. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Convert(string, FileDriver, string, FileDriver, ConversionOptions) {#convert_3}

레이어를 다른 형식으로 변환합니다.

```csharp
public static void Convert(string sourcePath, FileDriver sourceDriver, string destinationPath, 
    FileDriver destinationDriver, ConversionOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| sourcePath | String | 변환될 레이어의 경로입니다. |
| sourceDriver | FileDriver | 소스 레이어의 형식 드라이버입니다. |
| destinationPath | String | 변환 결과로 생성될 레이어의 경로입니다. |
| destinationDriver | FileDriver | 대상 레이어의 형식 드라이버입니다. |
| options | ConversionOptions | 변환 절차에 대한 옵션입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로 중 하나는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 다음에 지정된 공간 참조 시스템*options* 에 의해 지원되지 않습니다*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 원본 공간 참조 시스템에서 대상 공간 참조 시스템으로 피처 형상을 변환하지 못했습니다. |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)

---

## Convert(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) {#convert_1}

레이어를 다른 형식으로 변환합니다.

```csharp
public static void Convert(AbstractPath sourcePath, FileDriver sourceDriver, 
    AbstractPath destinationPath, FileDriver destinationDriver, ConversionOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| sourcePath | AbstractPath | 변환될 레이어의 경로입니다. |
| sourceDriver | FileDriver | 소스 레이어의 형식 드라이버입니다. |
| destinationPath | AbstractPath | 변환 결과로 생성될 레이어의 경로입니다. |
| destinationDriver | FileDriver | 대상 레이어의 형식 드라이버입니다. |
| options | ConversionOptions | 변환 절차에 대한 옵션입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 경로 중 하나는`null`. |
| ArgumentException | 옵션 개체에 이 드라이버에 대한 잘못된 유형이 있습니다. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| NotSupportedException | 다음에 지정된 공간 참조 시스템*options* 에 의해 지원되지 않습니다*destinationDriver* . |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 원본 공간 참조 시스템에서 대상 공간 참조 시스템으로 피처 형상을 변환하지 못했습니다. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [ConversionOptions](../../conversionoptions/)
* class [VectorLayer](../)
* 네임스페이스 [Aspose.Gis](../../vectorlayer/)
* 집회 [Aspose.GIS](../../../)


