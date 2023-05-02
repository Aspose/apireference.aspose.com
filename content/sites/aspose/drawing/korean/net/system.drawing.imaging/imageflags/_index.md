---
title: Enum ImageFlags
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Imaging.ImageFlags 열거형. 에 포함된 픽셀 데이터의 속성을 지정합니다.Image 물체. Flags 속성은 이 열거형의 멤버를 반환합니다. 이 열거형에는 멤버 값의 비트 조합을 허용하는 FlagsAttribute 특성이 있습니다.
type: docs
weight: 760
url: /ko/net/system.drawing.imaging/imageflags/
---
## ImageFlags enumeration

에 포함된 픽셀 데이터의 속성을 지정합니다.[`Image`](../../system.drawing/image/) 물체. Flags 속성은 이 열거형의 멤버를 반환합니다. 이 열거형에는 멤버 값의 비트 조합을 허용하는 FlagsAttribute 특성이 있습니다.

```csharp
[Flags]
public enum ImageFlags
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | `0` | 형식 정보가 없습니다 |
| Scalable | `1` | 픽셀 데이터는 확장 가능합니다. |
| HasAlpha | `2` | 픽셀 데이터는 알파 정보를 포함합니다. |
| HasTranslucent | `4` | 픽셀 데이터에 0(투명) 및 255(불투명) 이외의 알파 값이 있음을 지정합니다 |
| PartiallyScalable | `8` | 픽셀 데이터는 부분적으로 확장 가능하지만 몇 가지 제한 사항이 있습니다. |
| ColorSpaceRgb | `10` | 픽셀 데이터는 RGB 색 공간을 사용합니다. |
| ColorSpaceCmyk | `20` | 픽셀 데이터는 CMYK 색상 공간을 사용합니다. |
| ColorSpaceGray | `40` | 픽셀 데이터는 회색조입니다. |
| ColorSpaceYcbcr | `80` | 이미지가 YCBCR 색 공간을 사용하여 저장되도록 지정합니다. |
| ColorSpaceYcck | `100` | 이미지가 YCCK 색상 공간을 사용하여 저장되도록 지정합니다. |
| HasRealDpi | `1000` | 이미지에 DPI 정보가 저장되도록 지정합니다. |
| HasRealPixelSize | `2000` | 픽셀 크기가 이미지에 저장되도록 지정합니다. |
| ReadOnly | `10000` | 픽셀 데이터는 읽기 전용입니다. |
| Caching | `20000` | 더 빠른 액세스를 위해 픽셀 데이터를 캐시할 수 있습니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 집회 [Aspose.Drawing](../../)


