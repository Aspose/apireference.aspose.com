---
title: FeaturesSequence.SaveTo
second_title: .NET API 참조를 위한 Aspose.GIS
description: FeaturesSequence 방법. 피처 시퀀스를 레이어에 저장합니다.
type: docs
weight: 50
url: /ko/net/aspose.gis/featuressequence/saveto/
---
## SaveTo(string, FileDriver) {#saveto_2}

피처 시퀀스를 레이어에 저장합니다.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| destinationPath | String | 출력 레이어의 경로입니다. |
| destinationDriver | FileDriver | 출력 레이어의 형식 드라이버입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 모든 인수는`null`. |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 원본 공간 참조 시스템에서 대상 공간 참조 시스템으로 피처 형상을 변환하지 못했습니다. |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* 네임스페이스 [Aspose.Gis](../../featuressequence/)
* 집회 [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver) {#saveto}

피처 시퀀스를 레이어에 저장합니다.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| destinationPath | AbstractPath | 출력 레이어의 경로입니다. |
| destinationDriver | FileDriver | 출력 레이어의 형식 드라이버입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 원본 공간 참조 시스템에서 대상 공간 참조 시스템으로 피처 형상을 변환하지 못했습니다. |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [FeaturesSequence](../)
* 네임스페이스 [Aspose.Gis](../../featuressequence/)
* 집회 [Aspose.GIS](../../../)

---

## SaveTo(string, FileDriver, SavingOptions) {#saveto_3}

피처 시퀀스를 레이어에 저장합니다.

```csharp
public void SaveTo(string destinationPath, FileDriver destinationDriver, SavingOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| destinationPath | String | 출력 레이어의 경로입니다. |
| destinationDriver | FileDriver | 출력 레이어의 형식 드라이버입니다. |
| options | SavingOptions | 저장 절차에 대한 옵션입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 원본 공간 참조 시스템에서 대상 공간 참조 시스템으로 피처 형상을 변환하지 못했습니다. |
| NotSupportedException | 다음에 지정된 공간 참조 시스템*options* 에 의해 지원되지 않습니다*destinationDriver* . |

### 또한보십시오

* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* 네임스페이스 [Aspose.Gis](../../featuressequence/)
* 집회 [Aspose.GIS](../../../)

---

## SaveTo(AbstractPath, FileDriver, SavingOptions) {#saveto_1}

피처 시퀀스를 레이어에 저장합니다.

```csharp
public void SaveTo(AbstractPath destinationPath, FileDriver destinationDriver, 
    SavingOptions options)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| destinationPath | AbstractPath | 출력 레이어의 경로입니다. |
| destinationDriver | FileDriver | 출력 레이어의 형식 드라이버입니다. |
| options | SavingOptions | 저장 절차에 대한 옵션입니다. |

### 예외

| 예외 | 상태 |
| --- | --- |
| [GisException](../../gisexception/) | 파일에서 기능을 읽거나 쓰는 중 오류가 발생했습니다. |
| IOException | I/O 오류가 발생했습니다. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | 원본 공간 참조 시스템에서 대상 공간 참조 시스템으로 피처 형상을 변환하지 못했습니다. |
| NotSupportedException | 다음에 지정된 공간 참조 시스템*options* 에 의해 지원되지 않습니다*destinationDriver* . |

### 또한보십시오

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SavingOptions](../../savingoptions/)
* class [FeaturesSequence](../)
* 네임스페이스 [Aspose.Gis](../../featuressequence/)
* 집회 [Aspose.GIS](../../../)


