---
title: FileGdbOptions.XYTolerance
second_title: .NET API 참조를 위한 Aspose.GIS
description: FileGdbOptions 재산. X 및 Y 스냅 공차.
type: docs
weight: 70
url: /ko/net/aspose.gis.formats.filegdb/filegdboptions/xytolerance/
---
## FileGdbOptions.XYTolerance property

X 및 Y 스냅 공차.

```csharp
public double? XYTolerance { get; set; }
```

### 비고

이것은 생성 옵션이며 읽기에 영향을 미치지 않습니다. 이 매개변수는 고급 ArcGIS 기능에 사용되는 스냅 허용 오차를 제어합니다. Aspose.GIS 동작에는 영향을 미치지 않지만 ArcGIS에서 사용할 수 있습니다. 매개변수의 단위 는 공간 참조 시스템의 단위입니다. 로 설정된 경우`null` 기본값이 사용됩니다. 기본값은 공간 참조 system 에 따라 다르며 지리 시스템의 경우 0.000000008983153도 또는 투영된 시스템의 경우 0.001미터와 같습니다 (값은 공간 참조 시스템 단위로 변환됨). 공간 참조 시스템을 알 수 없는 경우 기본값은 0.001.

### 또한보십시오

* class [FileGdbOptions](../)
* 네임스페이스 [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* 집회 [Aspose.GIS](../../../)


