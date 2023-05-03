---
title: Class ImageCodecInfo
second_title: .NET API 참조용 Aspose.Drawing
description: System.Drawing.Imaging.ImageCodecInfo 수업. ImageCodecInfo 클래스는 설치된 이미지 인코더 및 디코더코덱이라고 함에 대한 모든 관련 정보를 검색하는 데 필요한 스토리지 멤버 및 메서드를 제공합니다. 상속불가.
type: docs
weight: 750
url: /ko/net/system.drawing.imaging/imagecodecinfo/
---
## ImageCodecInfo class

ImageCodecInfo 클래스는 설치된 이미지 인코더 및 디코더(코덱이라고 함)에 대한 모든 관련 정보를 검색하는 데 필요한 스토리지 멤버 및 메서드를 제공합니다. 상속불가.

```csharp
public sealed class ImageCodecInfo
```

## 속성

| 이름 | 설명 |
| --- | --- |
| [Clsid](../../system.drawing.imaging/imagecodecinfo/clsid/) { get; set; } | 가져오거나 설정합니다.Guid 특정 코덱을 식별하는 GUID를 포함하는 구조입니다. |
| [CodecName](../../system.drawing.imaging/imagecodecinfo/codecname/) { get; set; } | 코덱 이름이 포함된 문자열을 가져오거나 설정합니다. |
| [FilenameExtension](../../system.drawing.imaging/imagecodecinfo/filenameextension/) { get; set; } | 코덱에서 사용되는 파일 이름 확장자를 포함하는 문자열을 가져오거나 설정합니다. 확장자는 세미콜론으로 구분됩니다. |
| [FormatDescription](../../system.drawing.imaging/imagecodecinfo/formatdescription/) { get; set; } | 코덱의 파일 형식을 설명하는 문자열을 가져오거나 설정합니다. |
| [FormatID](../../system.drawing.imaging/imagecodecinfo/formatid/) { get; set; } | 가져오거나 설정합니다.Guid 코덱의 형식을 식별하는 GUID를 포함하는 구조입니다. |
| [MimeType](../../system.drawing.imaging/imagecodecinfo/mimetype/) { get; set; } | 코덱의 MIME(Multipurpose Internet Mail Extensions) 유형을 포함하는 문자열을 가져오거나 설정합니다. |
| [SignatureMasks](../../system.drawing.imaging/imagecodecinfo/signaturemasks/) { get; set; } | 필터로 사용할 수 있는 2차원 바이트 배열을 가져오거나 설정합니다. |
| [SignaturePatterns](../../system.drawing.imaging/imagecodecinfo/signaturepatterns/) { get; set; } | 코덱의 서명을 나타내는 바이트의 2차원 배열을 가져오거나 설정합니다. |
| [Version](../../system.drawing.imaging/imagecodecinfo/version/) { get; set; } | 코덱의 버전 번호를 가져오거나 설정합니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| static [GetImageDecoders](../../system.drawing.imaging/imagecodecinfo/getimagedecoders/)() | 배열을 반환합니다.ImageCodecInfo GDI+. 에 내장된 이미지 디코더에 대한 정보를 포함하는 개체 |
| static [GetImageEncoders](../../system.drawing.imaging/imagecodecinfo/getimageencoders/)() | 배열을 반환합니다.ImageCodecInfoGDI+. 에 내장된 이미지 인코더에 대한 정보를 포함하는 개체 |

### 또한보십시오

* 네임스페이스 [System.Drawing.Imaging](../../system.drawing.imaging/)
* 집회 [Aspose.Drawing](../../)


