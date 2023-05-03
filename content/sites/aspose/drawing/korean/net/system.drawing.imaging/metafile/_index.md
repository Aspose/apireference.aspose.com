---
title: Class Metafile
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Imaging.Metafile 수업. 그래픽 메타파일을 정의합니다. 메타파일에는 기록구성 및 재생표시할 수 있는 그래픽 작업 시퀀스를 설명하는 레코드가 포함됩니다. 이 클래스는 상속할 수 없습니다.
type: docs
weight: 800
url: /ko/net/system.drawing.imaging/metafile/
---
## Metafile class

그래픽 메타파일을 정의합니다. 메타파일에는 기록(구성) 및 재생(표시)할 수 있는 그래픽 작업 시퀀스를 설명하는 레코드가 포함됩니다. 이 클래스는 상속할 수 없습니다.

```csharp
public sealed class Metafile : Image
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Metafile](metafile/#constructor_2)(Stream) | 의 새 인스턴스를 초기화합니다.`Metafile` 지정된 데이터 스트림의 클래스. |
| [Metafile](metafile/#constructor_6)(string) | 의 새 인스턴스를 초기화합니다.`Metafile` 지정된 파일 이름의 클래스. |
| [Metafile](metafile/#constructor)(IntPtr, bool) | 의 새 인스턴스를 초기화합니다.`Metafile` 지정된 handle. 의 클래스 |
| [Metafile](metafile/#constructor_1)(IntPtr, EmfType) | 의 새 인스턴스를 초기화합니다.`Metafile` 장치 컨텍스트 에 대한 지정된 핸들의 클래스 및EmfType형식을 지정하는 열거형Metafile . |
| [Metafile](metafile/#constructor_3)(Stream, IntPtr) | 의 새 인스턴스를 초기화합니다.`Metafile` 지정된 데이터 스트림의 클래스 및 디바이스 컨텍스트에 대한 Windows 핸들. /&gt;. |
| [Metafile](metafile/#constructor_7)(string, IntPtr) | 의 새 인스턴스를 초기화합니다.`Metafile` 지정된 파일 이름의 클래스. |
| [Metafile](metafile/#constructor_4)(Stream, IntPtr, EmfType) | 의 새 인스턴스를 초기화합니다.`Metafile` 지정된 데이터 스트림의 클래스, 장치 컨텍스트에 대한 Windows 핸들 및EmfType enumeration 형식을 지정하는Metafile . |
| [Metafile](metafile/#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | 의 새 인스턴스를 초기화합니다.`Metafile` 지정된 데이터 스트림의 클래스, 장치 컨텍스트에 대한 Windows 핸들 및EmfType enumeration 형식을 지정하는Metafile . |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Flags](../../system.drawing/image/flags/) { get; } | 다음의 비트 조합을 나타내는 정수를 가져옵니다.[`ImageFlags`](../imageflags/) 이 이미지에 대해. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist/) { get; } | 이 내의 프레임 크기를 나타내는 GUID 배열을 가져옵니다.Image . |
| override [Height](../../system.drawing.imaging/metafile/height/) { get; } | 높이를 픽셀 단위로 가져옵니다.Metafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution/) { get; } | 수평 해상도(인치당 픽셀 수)를 가져옵니다.Image . |
| override [Palette](../../system.drawing.imaging/metafile/palette/) { get; set; } | 이것에 사용되는 색상표를 가져오거나 설정합니다.Image . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension/) { get; } | 이 이미지의 너비와 높이를 가져옵니다. |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat/) { get; } | 이것에 대한 픽셀 형식을 가져옵니다.Image . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist/) { get; } | 여기에 저장된 속성 항목의 ID를 가져옵니다.Image . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems/) { get; } | 여기에 저장된 모든 속성 항목(메타데이터 조각)을 가져옵니다.Image . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat/) { get; } | 이 파일 형식을 가져옵니다.Image . |
| [Size](../../system.drawing/image/size/) { get; } | 이 이미지의 너비와 높이를 픽셀 단위로 가져옵니다. |
| [Tag](../../system.drawing/image/tag/) { get; set; } | 이미지에 대한 추가 데이터를 제공하는 개체를 가져오거나 설정합니다. |
| [VerticalResolution](../../system.drawing/image/verticalresolution/) { get; } | 수직 해상도(인치당 픽셀 수)를 가져옵니다.Image . |
| override [Width](../../system.drawing.imaging/metafile/width/) { get; } | 이 너비를 픽셀 단위로 가져옵니다.Metafile . |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Clone](../../system.drawing/image/clone/)() | 이것의 정확한 복사본을 만듭니다.Image . |
| virtual [Dispose](../../system.drawing/image/dispose/)() | 이 이미지에서 사용하는 모든 리소스를 해제합니다. |
| [GetBounds](../../system.drawing/image/getbounds/)(ref GraphicsUnit) | 지정된 단위로 이미지의 범위를 가져옵니다. |
| [GetFrameCount](../../system.drawing/image/getframecount/)(FrameDimension) | 지정된 차원의 프레임 수를 반환합니다. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile/)() | Windows 핸들을 향상된Metafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/)() | 반환MetafileHeader 이와 관련된Metafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem/)(int) | 이 항목에서 지정된 속성 항목을 가져옵니다.Image . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage/)(int, int, GetThumbnailImageAbort, IntPtr) | 이에 대한 썸네일을 반환합니다.Image . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord/)(EmfPlusRecordType, int, int, byte[]) | 개별 메타파일 레코드를 재생합니다. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem/)(int) | 이 항목에서 지정된 속성 항목을 제거합니다.Image . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip/)(RotateFlipType) | 이 방법은 회전, 뒤집기 또는 회전 및 뒤집기Image . |
| [Save](../../system.drawing/image/save/)(string) | 저장Image지정된 파일 또는 stream. |
| [Save](../../system.drawing/image/save/)(Stream, ImageFormat) | 이 이미지를 지정된 형식으로 지정된 스트림에 저장합니다. |
| [Save](../../system.drawing/image/save/)(string, ImageFormat) | 저장Image 지정된 형식의 지정된 파일로. |
| [Save](../../system.drawing/image/save/)(Stream, ImageCodecInfo, EncoderParameters) | 지정된 인코더 및 이미지 인코더 매개변수를 사용하여 이 이미지를 지정된 스트림에 저장합니다. |
| [Save](../../system.drawing/image/save/)(string, ImageCodecInfo, EncoderParameters) | 저장Image 지정된 인코더 및 이미지 인코더 매개변수를 사용하여 지정된 파일에. |
| [SaveAdd](../../system.drawing/image/saveadd/)(EncoderParameters) | Image.Save(...) 메서드 중 하나에 대한 이전 호출에서 지정된 파일 또는 스트림에 프레임을 추가합니다. 이 메서드를 사용하여 다중 프레임 이미지에서 다른 다중 프레임 이미지로 선택한 프레임을 저장합니다. |
| [SaveAdd](../../system.drawing/image/saveadd/)(Image, EncoderParameters) | Image.Save(...) 메서드 중 하나에 대한 이전 호출에서 지정된 파일 또는 스트림에 프레임을 추가합니다. |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe/)(FrameDimension, int) | 치수 및 인덱스로 지정된 프레임을 선택합니다. |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem/)(PropertyItem) | 여기에 속성 항목(메타데이터 조각)을 저장합니다.Image . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader)(Stream) | 반환MetafileHeader 지정된Metafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader/#getmetafileheader_1)(string) | 반환MetafileHeader 지정된Metafile . |

### 또한보십시오

* class [Image](../../system.drawing/image/)
* 네임스페이스 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 집회 [Aspose.Drawing](../../)


