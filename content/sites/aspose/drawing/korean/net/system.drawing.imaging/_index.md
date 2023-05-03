---
title: System.Drawing.Imaging
second_title: .NET API 참조용 Aspose.Drawing
description: Imaging 네임스페이스는 고급 GDI 이미징 기능을 제공합니다. 기본 그래픽 기능은Drawing 네임스페이스.
type: docs
weight: 40
url: /ko/net/system.drawing.imaging/
---
Imaging 네임스페이스는 고급 GDI+ 이미징 기능을 제공합니다. 기본 그래픽 기능은Drawing 네임스페이스.

## 클래스

| 수업 | 설명 |
| --- | --- |
| [BitmapData](./bitmapdata/) | 비트맵 이미지의 특성을 지정합니다. 그만큼BitmapData 클래스는 the 에서 사용됩니다.LockBits 그리고UnlockBits 메서드의Bitmap 수업. 상속되지 않습니다. |
| [ColorMap](./colormap/) | 색상 변환을 위한 맵을 정의합니다. 여러 가지 방법ImageAttributes class adjust 이미지 색상 배열인 색상 재매핑 테이블을 사용하여ColorMap 구조. 상속 불가능. |
| [ColorMatrix](./colormatrix/) | RGBA 공간의 좌표를 포함하는 5 x 5 행렬을 정의합니다. ImageAttributes 색상 매트릭스를 사용하여 이미지 색상을 조정하는 클래스입니다. 이 클래스는 상속할 수 없습니다. |
| [ColorPalette](./colorpalette/) | 색상 팔레트를 구성하는 색상 배열을 정의합니다. 색상은 32비트 ARGB 색상입니다. 상속불가. |
| [Encoder](./encoder/) | 안Encoder 객체는 이미지 인코더 매개변수의 범주를 식별하는 GUID(Globally Unique Identifier)를 캡슐화합니다. |
| [EncoderParameter](./encoderparameter/) | 이미지 인코더에 값 또는 값 배열을 전달하는 데 사용됩니다. |
| [EncoderParameters](./encoderparameters/) | 배열을 캡슐화합니다.EncoderParameter 객체. |
| [FrameDimension](./framedimension/) | 이미지의 프레임 크기를 가져오는 속성을 제공합니다. 상속불가. |
| [ImageAttributes](./imageattributes/) | 렌더링 중에 비트맵 및 메타파일 색상이 조작되는 방법에 대한 정보를 포함합니다. |
| [ImageCodecInfo](./imagecodecinfo/) | ImageCodecInfo 클래스는 설치된 이미지 인코더 및 디코더(코덱이라고 함)에 대한 모든 관련 정보를 검색하는 데 필요한 스토리지 멤버 및 메서드를 제공합니다. 상속불가. |
| [ImageFormat](./imageformat/) | 이미지의 파일 형식을 지정합니다. 상속불가. |
| [Metafile](./metafile/) | 그래픽 메타파일을 정의합니다. 메타파일에는 기록(구성) 및 재생(표시)할 수 있는 그래픽 작업 시퀀스를 설명하는 레코드가 포함됩니다. 이 클래스는 상속할 수 없습니다. |
| [MetafileHeader](./metafileheader/) | 연관된 속성을 포함합니다.Metafile . 상속불가. |
| [MetaHeader](./metaheader/) | Windows 형식(WMF) 메타파일에 대한 정보를 포함합니다. |
| [NamespaceDoc](./namespacedoc/) | Imaging 네임스페이스는 고급 GDI+ 이미징 기능을 제공합니다. 기본 그래픽 기능은Drawing 네임스페이스. |
| [PlayRecordCallback](./playrecordcallback/) | 이 대리자는 사용되지 않습니다. 메타파일의 레코드를 열거하는 예는 다음을 참조하십시오.[`EnumerateMetafile`](../system.drawing/graphics/enumeratemetafile/) . |
| [PropertyItem](./propertyitem/) | 이미지 파일에 포함될 메타데이터 속성을 캡슐화합니다. 상속불가. |
| [WmfPlaceableFileHeader](./wmfplaceablefileheader/) | 배치 가능한 메타파일을 정의합니다. 상속불가. |
## 열거

| 열거 | 설명 |
| --- | --- |
| [ColorAdjustType](./coloradjusttype/) | 색상 조정 정보를 사용하는 GDI+ 개체를 지정합니다. |
| [ColorChannelFlag](./colorchannelflag/) | CMYK(시안, 마젠타, 노랑, 검정) 색상 공간의 개별 채널을 지정합니다. 이 열거는[`SetOutputChannel`](../system.drawing.imaging/imageattributes/setoutputchannel/) 방법. |
| [ColorMatrixFlag](./colormatrixflag/) | 이미지의 색상 및 그레이스케일 조정 설정의 영향을 받는 이미지 및 색상 유형을 지정합니다.ImageAttributes . |
| [EmfPlusRecordType](./emfplusrecordtype/) | 그래픽 명령을 읽고 쓰기 위해 메타파일과 함께 사용할 수 있는 방법을 지정합니다. |
| [EmfType](./emftype/) | 확장 메타파일(EMF) 파일에 배치되는 레코드의 특성을 지정합니다. 이 열거는Metafile 클래스. |
| [EncoderValue](./encodervalue/) | 를 사용할 때 JPEG 또는 TIFF 이미지 인코더에 전달되는 매개 변수 값을 지정하는 데 사용됩니다.EncoderParameters) 또는EncoderParameters) 방법. |
| [ImageFlags](./imageflags/) | 에 포함된 픽셀 데이터의 속성을 지정합니다.[`Image`](../system.drawing/image/) 물체. Flags 속성은 이 열거형의 멤버를 반환합니다. 이 열거형에는 멤버 값의 비트 조합을 허용하는 FlagsAttribute 특성이 있습니다. |
| [ImageLockMode](./imagelockmode/) | 플래그 매개변수에 전달되는 플래그를 지정합니다.[`LockBits`](../system.drawing/bitmap/lockbits/) 방법. [`LockBits`](../system.drawing/bitmap/lockbits/) 메서드는 픽셀 데이터를 읽거나 쓸 수 있도록 image 의 일부를 잠급니다. |
| [MetafileFrameUnit](./metafileframeunit/) | 메타파일의 크기와 위치를 지정하는 데 사용되는 사각형의 측정 단위를 지정합니다. 이는 메타파일을 만드는 동안 지정됩니다.Metafile object. |
| [MetafileType](./metafiletype/) | 메타파일 유형을 지정합니다. |
| [PixelFormat](./pixelformat/) | 이미지의 각 픽셀에 대한 색상 데이터 형식을 지정합니다. |


