---
title: Enum MetafileType
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Imaging.MetafileType 열거형. 메타파일 유형을 지정합니다.
type: docs
weight: 830
url: /ko/net/system.drawing.imaging/metafiletype/
---
## MetafileType enumeration

메타파일 유형을 지정합니다.

```csharp
public enum MetafileType
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Invalid | `0` | GDI+에서 인식되지 않는 메타파일 형식을 지정합니다. |
| Wmf | `1` | WMF(Windows 메타파일) 파일을 지정합니다. 이러한 파일에는 GDI 레코드만 포함됩니다. |
| WmfPlaceable | `2` | 앞에 배치 가능한 메타파일 헤더가 있는 WMF(Windows 메타파일) 파일을 지정합니다. |
| Emf | `3` | 확장 메타파일(EMF) 파일을 지정합니다. 이러한 파일에는 GDI 레코드만 포함됩니다. |
| EmfPlusOnly | `4` | EMF+ 파일을 지정합니다. 이러한 파일에는 GDI+ 레코드만 포함되며 GDI+를 사용하여 표시해야 합니다. GDI를 사용하여 레코드를 표시하면 예측할 수 없는 결과가 발생할 수 있습니다. |
| EmfPlusDual | `5` | EMF+ 이중 파일을 지정합니다. 이러한 파일에는 대체 GDI 레코드와 함께 GDI+ 레코드가 포함되어 있으며 GDI 또는 GDI+를 사용하여 표시할 수 있습니다. GDI를 사용하여 레코드를 표시하면 일부 품질 저하가 발생할 수 있습니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 집회 [Aspose.Drawing](../../)


