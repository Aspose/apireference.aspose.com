---
title: Class Bitmap
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Bitmap 수업. 그래픽 이미지의 픽셀 데이터와 속성으로 구성된 비트맵을 캡슐화합니다. ABitmap 픽셀 데이터로 정의된 이미지 작업에 사용되는 개체입니다.
type: docs
weight: 40
url: /ko/net/system.drawing/bitmap/
---
## Bitmap class

그래픽 이미지의 픽셀 데이터와 속성으로 구성된 비트맵을 캡슐화합니다. A`Bitmap` 픽셀 데이터로 정의된 이미지 작업에 사용되는 개체입니다.

```csharp
public class Bitmap : Image
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Bitmap](bitmap/#constructor_3)(Image) | 의 새 인스턴스를 초기화합니다.`Bitmap` 지정된 기존 이미지의 클래스. |
| [Bitmap](bitmap/#constructor_6)(Stream) | 의 새 인스턴스를 초기화합니다.`Bitmap` 지정된 데이터 스트림의 클래스. |
| [Bitmap](bitmap/#constructor_8)(string) | 의 새 인스턴스를 초기화합니다.`Bitmap` 지정된 file. 의 클래스 |
| [Bitmap](bitmap/#constructor_5)(Image, Size) | 의 새 인스턴스를 초기화합니다.`Bitmap`지정된 크기로 조정된 지정된 기존 이미지의 클래스. |
| [Bitmap](bitmap/#constructor)(int, int) | 의 새 인스턴스를 초기화합니다.`Bitmap` 지정된 크기의 클래스. |
| [Bitmap](bitmap/#constructor_7)(Stream, bool) | 의 새 인스턴스를 초기화합니다.`Bitmap` 지정된 데이터 스트림의 클래스. |
| [Bitmap](bitmap/#constructor_9)(string, bool) | 의 새 인스턴스를 초기화합니다.`Bitmap` 지정된 file. 의 클래스 |
| [Bitmap](bitmap/#constructor_4)(Image, int, int) | 의 새 인스턴스를 초기화합니다.`Bitmap` 지정된 기존 이미지의 클래스, 지정된 크기로 조정됨. |
| [Bitmap](bitmap/#constructor_2)(int, int, PixelFormat) | 의 새 인스턴스를 초기화합니다.`Bitmap` 지정된 크기와 형식의 클래스. |
| [Bitmap](bitmap/#constructor_1)(int, int, int, PixelFormat, int[]) | 의 새 인스턴스를 초기화합니다.`Bitmap` 지정된 크기 및 픽셀 데이터가 있는 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | 다음의 비트 조합을 나타내는 정수를 가져옵니다.[`ImageFlags`](../../system.drawing.imaging/imageflags/) 이 이미지에 대해. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist/) { get; } | 이 내의 프레임 크기를 나타내는 GUID 배열을 가져옵니다.Image . |
| override [Height](../../system.drawing/bitmap/height/) { get; } | 이 비트맵의 높이(픽셀)를 가져옵니다. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | 수평 해상도(인치당 픽셀 수)를 가져옵니다.Image . |
| override [Palette](../../system.drawing/bitmap/palette/) { get; set; } | 이것에 사용되는 색상표를 가져오거나 설정합니다.Image . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | 이 이미지의 너비와 높이를 가져옵니다. |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat/) { get; } | 이것에 대한 픽셀 형식을 가져옵니다.Image . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist/) { get; } | 여기에 저장된 속성 항목의 ID를 가져옵니다.Image . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems/) { get; } | 여기에 저장된 모든 속성 항목(메타데이터 조각)을 가져옵니다.Image . |
| override [RawFormat](../../system.drawing/bitmap/rawformat/) { get; } | 이 파일 형식을 가져옵니다.Image . |
| [Size](../../system.drawing/image/size/) { get; } | 이 이미지의 너비와 높이를 픽셀 단위로 가져옵니다. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | 이미지에 대한 추가 데이터를 제공하는 개체를 가져오거나 설정합니다. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | 수직 해상도(인치당 픽셀 수)를 가져옵니다.Image . |
| override [Width](../../system.drawing/bitmap/width/) { get; } | 이 비트맵의 너비(픽셀)를 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | 이것의 정확한 복사본을 만듭니다.Image . |
| [Clone](../../system.drawing/bitmap/clone/#clone)(Rectangle, PixelFormat) | 이 섹션의 복사본을 만듭니다.Bitmap 에 의해 정의Rectangle structure 및 지정된PixelFormat 열거형. |
| [Clone](../../system.drawing/bitmap/clone/#clone_1)(RectangleF, PixelFormat) | 이 섹션의 복사본을 만듭니다.Bitmap 지정된PixelFormat 열거형. |
| virtual [Dispose](../../system.drawing/image/dispose/)() | 이 이미지에서 사용하는 모든 리소스를 해제합니다. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | 지정된 단위로 이미지의 범위를 가져옵니다. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | 지정된 차원의 프레임 수를 반환합니다. |
| [GetPixel](../../system.drawing/bitmap/getpixel/)(int, int) | 이에서 지정된 픽셀의 색상을 가져옵니다.Bitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem/)(int) | 이 항목에서 지정된 속성 항목을 가져옵니다.Image . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | 이에 대한 썸네일을 반환합니다.Image . |
| [LockBits](../../system.drawing/bitmap/lockbits/)(Rectangle, ImageLockMode, PixelFormat) | 잠금Bitmap 시스템 메모리에. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent)() | 지정된 색상을 투명하게 만듭니다.Bitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent/#maketransparent_1)(Color) | 지정된 색상을 투명하게 만듭니다.Bitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels/)(int[]) | 지정된 배열로 ARGB32 형식의 비트맵 픽셀을 읽습니다. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem/)(int) | 이 항목에서 지정된 속성 항목을 제거합니다.Image . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip/)(RotateFlipType) | 이 방법은 회전, 뒤집기 또는 회전 및 뒤집기Image . |
| [Save](../../system.drawing/image/save/)(string) | 저장Image지정된 파일 또는 stream. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | 이 이미지를 지정된 형식으로 지정된 스트림에 저장합니다. |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | 저장Image 지정된 형식의 지정된 파일로. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | 지정된 인코더 및 이미지 인코더 매개변수를 사용하여 이 이미지를 지정된 스트림에 저장합니다. |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | 저장Image 지정된 인코더 및 이미지 인코더 매개변수를 사용하여 지정된 파일에. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Image.Save(...) 메서드 중 하나에 대한 이전 호출에서 지정된 파일 또는 스트림에 프레임을 추가합니다. 이 메서드를 사용하여 다중 프레임 이미지에서 다른 다중 프레임 이미지로 선택한 프레임을 저장합니다. |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Image.Save(...) 메서드 중 하나에 대한 이전 호출에서 지정된 파일 또는 스트림에 프레임을 추가합니다. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | 치수 및 인덱스로 지정된 프레임을 선택합니다. |
| [SetPixel](../../system.drawing/bitmap/setpixel/)(int, int, Color) | 이에서 지정된 픽셀의 색상을 설정합니다.Bitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem/)(PropertyItem) | 여기에 속성 항목(메타데이터 조각)을 저장합니다.Image . |
| [SetResolution](../../system.drawing/bitmap/setresolution/)(float, float) | 이것에 대한 해상도를 설정합니다.Bitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits/)(BitmapData) | 이것을 잠금 해제합니다.Bitmap 시스템 메모리에서. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels/)(int[]) | 비트맵에 픽셀을 씁니다. |

### 또한보십시오

* class [Image](../image/)
* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


