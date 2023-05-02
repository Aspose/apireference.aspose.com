---
title: Class Image
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Image 수업. 비트맵 및 메타파일 하위 클래스에 대한 기능을 제공하는 추상 기본 클래스입니다.
type: docs
weight: 580
url: /ko/net/system.drawing/image/
---
## Image class

비트맵 및 메타파일 하위 클래스에 대한 기능을 제공하는 추상 기본 클래스입니다.

```csharp
public abstract class Image : IDisposable
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Image](image/)() | 의 새 인스턴스를 초기화합니다.`Image` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | 다음의 비트 조합을 나타내는 정수를 가져옵니다.[`ImageFlags`](../../system.drawing.imaging/imageflags/) 이 이미지에 대해. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist/) { get; } | 이 내의 프레임 크기를 나타내는 GUID 배열을 가져옵니다.Image . |
| abstract [Height](../../system.drawing/image/height/) { get; } | 높이를 픽셀 단위로 가져옵니다.Image . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | 수평 해상도(인치당 픽셀 수)를 가져옵니다.Image . |
| abstract [Palette](../../system.drawing/image/palette/) { get; set; } | 이것에 사용되는 색상표를 가져오거나 설정합니다.Image . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | 이 이미지의 너비와 높이를 가져옵니다. |
| abstract [PixelFormat](../../system.drawing/image/pixelformat/) { get; } | 이것에 대한 픽셀 형식을 가져옵니다.Image . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist/) { get; } | 여기에 저장된 속성 항목의 ID를 가져옵니다.Image . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems/) { get; } | 여기에 저장된 모든 속성 항목(메타데이터 조각)을 가져옵니다.Image . |
| abstract [RawFormat](../../system.drawing/image/rawformat/) { get; } | 이 파일 형식을 가져옵니다.Image . |
| [Size](../../system.drawing/image/size/) { get; } | 이 이미지의 너비와 높이를 픽셀 단위로 가져옵니다. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | 이미지에 대한 추가 데이터를 제공하는 개체를 가져오거나 설정합니다. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | 수직 해상도(인치당 픽셀 수)를 가져옵니다.Image . |
| abstract [Width](../../system.drawing/image/width/) { get; } | 이 너비를 픽셀 단위로 가져옵니다.Image . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile/)(string) | 생성Image 지정된 파일에서. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream)(Stream) | 생성Image지정된 데이터 스트림에서. |
| static [FromStream](../../system.drawing/image/fromstream/#fromstream_1)(Stream, bool) | 생성Image 지정된 데이터 스트림에서 선택적으로 해당 스트림의 embedded 색상 관리 정보를 사용합니다. |
| [Clone](../../system.drawing/image/clone/)() | 이것의 정확한 복사본을 만듭니다.Image . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | 이 이미지에서 사용하는 모든 리소스를 해제합니다. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | 지정된 단위로 이미지의 범위를 가져옵니다. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | 지정된 차원의 프레임 수를 반환합니다. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem/)(int) | 이 항목에서 지정된 속성 항목을 가져옵니다.Image . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | 이에 대한 썸네일을 반환합니다.Image . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem/)(int) | 이 항목에서 지정된 속성 항목을 제거합니다.Image . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip/)(RotateFlipType) | 이 방법은 회전, 뒤집기 또는 회전 및 뒤집기Image . |
| [Save](../../system.drawing/image/save/#save_2)(string) | 저장Image지정된 파일 또는 stream. |
| [Save](../../system.drawing/image/save/#save_1)(Stream, ImageFormat) | 이 이미지를 지정된 형식으로 지정된 스트림에 저장합니다. |
| [Save](../../system.drawing/image/save/#save_4)(string, ImageFormat) | 저장Image 지정된 형식의 지정된 파일로. |
| [Save](../../system.drawing/image/save/#save)(Stream, ImageCodecInfo, EncoderParameters) | 지정된 인코더 및 이미지 인코더 매개변수를 사용하여 이 이미지를 지정된 스트림에 저장합니다. |
| [Save](../../system.drawing/image/save/#save_3)(string, ImageCodecInfo, EncoderParameters) | 저장Image 지정된 인코더 및 이미지 인코더 매개변수를 사용하여 지정된 파일에. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd_1)(EncoderParameters) | Image.Save(...) 메서드 중 하나에 대한 이전 호출에서 지정된 파일 또는 스트림에 프레임을 추가합니다. 이 메서드를 사용하여 다중 프레임 이미지에서 다른 다중 프레임 이미지로 선택한 프레임을 저장합니다. |
| [SaveAdd](../../system.drawing/image/saveadd/#saveadd)(Image, EncoderParameters) | Image.Save(...) 메서드 중 하나에 대한 이전 호출에서 지정된 파일 또는 스트림에 프레임을 추가합니다. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | 치수 및 인덱스로 지정된 프레임을 선택합니다. |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem/)(PropertyItem) | 여기에 속성 항목(메타데이터 조각)을 저장합니다.Image . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap/)(IntPtr) | 생성Bitmap 핸들에서 GDI 비트맵으로. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize/)(PixelFormat) | 지정된 픽셀 형식의 색상 심도를 픽셀당 비트 수로 반환합니다. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat/)(PixelFormat) | 이 픽셀 형식이Image 알파 정보를 포함합니다. |

## 다른 멤버들

| 이름 | 설명 |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort/) | 언제 결정하기 위한 콜백 메서드를 제공합니다.[`GetThumbnailImage`](./getthumbnailimage/) 메서드는 조기에 실행을 취소해야 합니다. |

### 또한보십시오

* 네임스페이스 [System.Drawing](../../system.drawing/)
* 집회 [Aspose.Drawing](../../)


