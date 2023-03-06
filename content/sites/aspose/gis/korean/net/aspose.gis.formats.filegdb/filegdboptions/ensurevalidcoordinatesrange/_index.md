---
title: FileGdbOptions.EnsureValidCoordinatesRange
second_title: .NET API 참조를 위한 Aspose.GIS
description: FileGdbOptions 재산. 좌표가 유효한 범위에 있어야 하는지 여부.
type: docs
weight: 30
url: /ko/net/aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/
---
## FileGdbOptions.EnsureValidCoordinatesRange property

좌표가 유효한 범위에 있어야 하는지 여부.

```csharp
public bool EnsureValidCoordinatesRange { get; set; }
```

### 비고

이것은 생성 옵션이며 읽기에 영향을 미치지 않습니다. 다음으로 설정하면`true` 유효한 범위를 벗어난 values 로 좌표를 쓰려고 하면 예외가 발생합니다. 로 설정한 경우`false` 이러한 좌표는 자동으로 기록됩니다. 유효한 범위는 다음에 의해 정의됩니다.[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) . 인용하다[`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) 좌표 정밀도 그리드에서 유효한 범위를 결정하는 방법에 대한 설명서. 기본값은 다음과 같습니다.`false` .

### 또한보십시오

* class [FileGdbOptions](../)
* 네임스페이스 [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* 집회 [Aspose.GIS](../../../)


