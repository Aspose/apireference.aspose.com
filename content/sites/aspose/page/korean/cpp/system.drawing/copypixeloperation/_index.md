---
title: "System::Drawing::CopyPixelOperation 열거형"
linktitle: "CopyPixelOperation"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::CopyPixelOperation 열거형. 픽셀 복사 작업에서 소스 색상이 대상 색상과 어떻게 결합되어 최종 색상이 되는지를 C++에서 지정합니다."
type: docs
weight: 3000
url: /ko/cpp/system.drawing/copypixeloperation/
---
## CopyPixelOperation enum


픽셀 복사 작업에서 소스 색상이 대상 색상과 결합되어 최종 색상이 되는 방식을 지정합니다.

```cpp
enum class CopyPixelOperation
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| NoMirrorBitmap | n/a | 비트맵이 반사되지 않습니다. |
| Blackness | 66 | 대상 영역은 물리적 팔레트에서 인덱스 0인 색상을 사용하여 채워집니다. |
| NotSourceErase | 1114278 | 소스와 대상 색상이 OR 연산된 후, 결과 색상이 반전됩니다. |
| NotSourceCopy | 3342344 | 소스 영역이 반전된 후 대상에 복사됩니다. |
| SourceErase | 4457256 | 대상 영역의 반전된 색상이 원본 영역의 색상과 AND 연산됩니다. |
| DestinationInvert | 5570569 | 대상 영역이 반전됩니다. |
| PatInvert | 5898313 | 대상 장치 컨텍스트에서 현재 선택된 브러시의 색상이 대상의 색상과 XOR 연산됩니다. |
| SourceInvert | 6684742 | 원본 및 대상 영역의 색상이 XOR 연산됩니다. |
| SourceAnd | 8913094 | 원본 및 대상 영역의 색상이 AND 연산됩니다. |
| MergePaint | 12255782 | 반전된 원본 영역의 색상이 대상 영역의 색상과 OR 연산됩니다. |
| MergeCopy | 12583114 | 원본 영역의 색상이 대상 장치 컨텍스트에서 선택된 브러시의 색상과 AND 연산됩니다. |
| SourceCopy | 13369376 | 원본 영역이 직접 대상 영역에 복사됩니다. |
| SourcePaint | 15597702 | 소스와 대상 영역의 색상이 OR 연산됩니다. |
| PatCopy | 15728673 | 대상 디바이스 컨텍스트에서 현재 선택된 브러시가 대상 비트맵으로 복사됩니다. |
| PatPaint | 16452105 | 대상 디바이스 컨텍스트에서 현재 선택된 브러시의 색상이 반전된 소스 영역의 색상과 OR 연산됩니다. 이 연산의 결과가 대상 영역의 색상과 다시 OR 연산됩니다. |
| Whiteness | 16711778 | 대상 영역은 물리 팔레트에서 인덱스 1인 색상을 사용하여 채워집니다. |
| CaptureBlt | 1073741824 | [Windows](../../system.windows/)가 애플리케이션 창 위에 레이어링되어 결과 이미지에 포함됩니다. |

## 또 보기

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
