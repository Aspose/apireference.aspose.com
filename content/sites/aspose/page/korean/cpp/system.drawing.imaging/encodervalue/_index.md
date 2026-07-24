---
title: "System::Drawing::Imaging::EncoderValue enum"
linktitle: "EncoderValue"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::EncoderValue enum. C++에서 JPEG 또는 TIFF 이미지 인코더에 전달되는 매개변수 값을 지정합니다."
type: docs
weight: 2100
url: /ko/cpp/system.drawing.imaging/encodervalue/
---
## EncoderValue enum


JPEG 또는 TIFF 이미지 인코더에 전달되는 매개변수 값을 지정합니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
enum class EncoderValue
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| ColorTypeCMYK | 0 | CMYK 색 공간입니다. |
| ColorTypeYCCK | 1 | YCCK 색 공간입니다. |
| CompressionLZW | 2 | LZW 압축 방법. |
| CompressionCCITT3 | 3 | TIFF 이미지에 대한 CCITT3 압축 방법을 지정합니다. |
| CompressionCCITT4 | 4 | TIFF 이미지에 대한 CCITT4 압축 방법을 지정합니다. |
| CompressionRle | 5 | TIFF 이미지에 대한 RLE 압축 방법을 지정합니다. |
| CompressionNone | 6 | TIFF 이미지에 압축을 적용하지 않음을 지정합니다. |
| ScanMethodInterlaced | 7 | 인터레이스 모드. |
| ScanMethodNonInterlaced | 8 | 비인터레이스 모드. |
| VersionGif87 | 9 | TIFF 이미지에 버전 87을 지정합니다. |
| VersionGif89 | 10 | GIF 이미지에 버전 89a를 지정합니다. |
| RenderProgressive | 11 | 프로그레시브 모드. |
| RenderNonProgressive | 12 | 비프로그레시브 모드. |
| TransformRotate90 | 13 | JPEG 이미지에 대해 손실 없는 90도 시계 방향 회전을 지정합니다. |
| TransformRotate180 | 14 | JPEG 이미지에 대한 무손실 180도 회전을 지정합니다. |
| TransformRotate270 | 15 | JPEG 이미지에 대한 무손실 270도 시계 방향 회전을 지정합니다. |
| TransformFlipHorizontal | 16 | JPEG 이미지에 대한 무손실 수평 플립을 지정합니다. |
| TransformFlipVertical | 17 | JPEG 이미지에 대한 무손실 수직 플립을 지정합니다. |
| MultiFrame | 18 | 멀티프레임 인코딩. |
| LastFrame | 19 | 멀티프레임 이미지의 마지막 프레임입니다. |
| Flush | 20 | 인코더 객체를 닫아야 합니다. |
| FrameDimensionTime | 21 | GIF 이미지에 대한 시간 프레임 차원을 지정합니다. |
| FrameDimensionResolution | 22 | 해상도 프레임 차원입니다. |
| FrameDimensionPage | 23 | TIFF 이미지에 대한 페이지 프레임 차원을 지정합니다. |

## 또 보기

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
