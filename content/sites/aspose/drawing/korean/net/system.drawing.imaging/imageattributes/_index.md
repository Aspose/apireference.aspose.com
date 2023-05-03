---
title: Class ImageAttributes
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Imaging.ImageAttributes 수업. 렌더링 중에 비트맵 및 메타파일 색상이 조작되는 방법에 대한 정보를 포함합니다.
type: docs
weight: 740
url: /ko/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

렌더링 중에 비트맵 및 메타파일 색상이 조작되는 방법에 대한 정보를 포함합니다.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [ImageAttributes](imageattributes/)() | 의 새 인스턴스를 초기화합니다.`ImageAttributes` 클래스. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable/)() | 이 브러시 색상 재매핑 테이블을 지웁니다.ImageAttributes object. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey)() | 기본 범주에 대한 색상 키(투명도 범위)를 지웁니다. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey/#clearcolorkey_1)(ColorAdjustType) | 지정된 범주에 대한 색상 키(투명도 범위)를 지웁니다. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix)() | 기본 범주에 대한 색상 조정 매트릭스를 지웁니다. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix/#clearcolormatrix_1)(ColorAdjustType) | 지정된 범주에 대한 색상 조정 매트릭스를 지웁니다. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma)() | 기본 범주에 대한 감마 보정을 비활성화합니다. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma/#cleargamma_1)(ColorAdjustType) | 지정된 범주에 대한 감마 보정을 비활성화합니다. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop)() | 기본 범주에 대한 NoOp 설정을 지웁니다. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop/#clearnoop_1)(ColorAdjustType) | 지정된 범주에 대한 NoOp 설정을 지웁니다. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel)() | 기본 범주에 대한 CMYK(시안-마젠타-노랑-검정) 출력 채널 설정을 지웁니다. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel/#clearoutputchannel_1)(ColorAdjustType) | 지정된 범주에 대한 (시안-마젠타-노랑-검정) 출력 채널 설정을 지웁니다. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile)() | 기본 범주에 대한 출력 채널 색상 프로필 설정을 지웁니다. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile/#clearoutputchannelcolorprofile_1)(ColorAdjustType) | 지정된 범주에 대한 출력 채널 색상 프로파일 설정을 지웁니다. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable)() | 기본 범주에 대한 색상 재매핑 테이블을 지웁니다. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable/#clearremaptable_1)(ColorAdjustType) | 지정된 범주에 대한 색상 재매핑 테이블을 지웁니다. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold)() | 기본 범주에 대한 임계값을 지웁니다. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold/#clearthreshold_1)(ColorAdjustType) | 지정된 범주에 대한 임계값을 지웁니다. |
| [Clone](../../system.drawing.imaging/imageattributes/clone/)() | 이것의 정확한 복사본을 만듭니다.ImageAttributes object. |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose/)() | 이에서 사용하는 모든 리소스를 해제합니다.ImageAttributes object. |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette/)(ColorPalette, ColorAdjustType) | 지정된 범주의 조정 설정에 따라 팔레트의 색상을 조정합니다. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable/)(ColorMap[]) | 브러시 범주에 대한 색상 재매핑 테이블을 설정합니다. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey)(Color, Color) | 기본 범주에 대한 색상 키를 설정합니다. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey/#setcolorkey_1)(Color, Color, ColorAdjustType) | 지정된 범주에 대한 색상 키(투명도 범위)를 설정합니다. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices)(ColorMatrix, ColorMatrix) | 기본 범주에 대한 색상 조정 매트릭스 및 그레이스케일 조정 매트릭스를 설정합니다. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | 기본 범주에 대한 색상 조정 매트릭스 및 그레이스케일 조정 매트릭스를 설정합니다. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices/#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | 지정된 범주에 대한 색상 조정 매트릭스 및 그레이스케일 조정 매트릭스를 설정합니다. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix)(ColorMatrix) | 기본 범주에 대한 색상 조정 매트릭스를 설정합니다. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | 기본 범주에 대한 색상 조정 매트릭스를 설정합니다. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix/#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | 지정된 범주에 대한 색상 조정 매트릭스를 설정합니다. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma)(float) | 기본 범주에 대한 감마 값을 설정합니다. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma/#setgamma_1)(float, ColorAdjustType) | 지정된 범주에 대한 감마 값을 설정합니다. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop)() | 기본 범주에 대한 색상 조정을 끕니다. [`ClearNoOp`](./clearnoop/) call 이전에 있었던 색상 조정 설정을 복원하는 방법 [`SetNoOp`](./setnoop/) 방법. |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop/#setnoop_1)(ColorAdjustType) | 지정된 범주에 대한 색상 조정을 끕니다. 당신은 전화 할 수 있습니다[`ClearNoOp`](./clearnoop/) 메서드는 call 이전에 있었던 색상 조정 설정을[`SetNoOp`](./setnoop/) 방법. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel)(ColorChannelFlag) | 기본 범주에 대한 CMYK(시안-마젠타-노랑-검정) 출력 채널을 설정합니다. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel/#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | 지정된 범주에 대한 CMYK(시안-마젠타-노랑-검정) 출력 채널을 설정합니다. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile)(string) | 기본 범주에 대한 출력 채널 색상 프로필 파일을 설정합니다. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile/#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | 지정된 범주에 대한 출력 채널 색상 프로필 파일을 설정합니다. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable)(ColorMap[]) | 기본 범주에 대한 색상 재매핑 테이블을 설정합니다. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable/#setremaptable_1)(ColorMap[], ColorAdjustType) | 지정된 범주에 대한 색상 재매핑 테이블을 설정합니다. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold)(float) | 기본 범주에 대한 임계값(투명도 범위)을 설정합니다. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold/#setthreshold_1)(float, ColorAdjustType) | 지정된 범주에 대한 임계값(투명도 범위)을 설정합니다. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode)(WrapMode) | 모양 또는 모양 경계에서 텍스처를 바둑판식으로 배열하는 방법을 결정하는 데 사용되는 랩 모드를 설정합니다. 텍스처가 채우는 모양보다 작을 때 채우기 위해 모양을 가로질러 텍스처가 바둑판식으로 배열됩니다. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_1)(WrapMode, Color) | 모양 또는 모양 경계에서 텍스처를 바둑판식으로 배열하는 방법을 결정하는 데 사용되는 랩 모드 및 색상을 설정합니다. 텍스처가 채우는 모양보다 작을 때 채우기 위해 모양을 가로질러 텍스처가 바둑판식으로 배열됩니다. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode/#setwrapmode_2)(WrapMode, Color, bool) | 모양 또는 모양 경계에서 텍스처를 바둑판식으로 배열하는 방법을 결정하는 데 사용되는 랩 모드 및 색상을 설정합니다. 텍스처가 채우는 모양보다 작을 때 채우기 위해 모양을 가로질러 텍스처가 바둑판식으로 배열됩니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 집회 [Aspose.Drawing](../../)


