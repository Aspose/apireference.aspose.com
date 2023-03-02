---
title: FileGdbCoordinatePrecisionGrid.CreateFromRectangle
second_title: .NET API 참조를 위한 Aspose.GIS
description: FileGdbCoordinatePrecisionGrid 방법. 새로 만들기FileGdbCoordinatePrecisionGrid 사각형 내의 모든 값을 표현할 수 있습니다.
type: docs
weight: 20
url: /ko/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/
---
## FileGdbCoordinatePrecisionGrid.CreateFromRectangle method

새로 만들기`FileGdbCoordinatePrecisionGrid` 사각형 내의 모든 값을 표현할 수 있습니다.

```csharp
public static FileGdbCoordinatePrecisionGrid CreateFromRectangle(IPoint p1, IPoint p2)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| p1 | IPoint | 직사각형의 한 모서리. |
| p2 | IPoint | 직사각형의 반대쪽 모서리. 다음과 같은 치수여야 합니다.*p1*. |

### 반환 값

`FileGdbCoordinatePrecisionGrid`직사각형 내의 모든 값을 표현할 수 있습니다. 직사각형 외부의 값은 표현할 수 없으므로 FileGDB layer 에 기록될 모든 좌표는 직사각형 내부에 있어야 합니다.

### 예외

| 예외 | 상태 |
| --- | --- |
| ArgumentNullException | 인수는`null` . |
| ArgumentException | *p1* 그리고*p2* 유효한 비어 있지 않은 직사각형을 형성하지 마십시오: *p1* 또는*p2* 비었다. HasZ'의 플래그*p1* 의 'HasZ' 플래그와 같지 않습니다.*p2* 의 HasM' 플래그*p1* 의 'HasM' 플래그와 같지 않습니다.*p2* 의 X'좌표*p1* 의 'X'좌표와 같습니다.*p2* 의 Y' 좌표*p1* 의 'Y'좌표와 같습니다.*p2* Z'의 좌표*p1* 의 'Z'좌표와 같습니다.*p2* M'의 좌표*p1* 의 'M'좌표와 같습니다.*p2* 모든 좌표는NaN 또는 무한대. |

### 또한보십시오

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [FileGdbCoordinatePrecisionGrid](../)
* 네임스페이스 [Aspose.Gis.Formats.FileGdb](../../filegdbcoordinateprecisiongrid/)
* 집회 [Aspose.GIS](../../../)


