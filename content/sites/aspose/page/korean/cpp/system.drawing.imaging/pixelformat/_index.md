---
title: "System::Drawing::Imaging::PixelFormat enum"
linktitle: "PixelFormat"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::PixelFormat 열거형. C++에서 픽셀의 색상 데이터 형식을 지정합니다."
type: docs
weight: 2600
url: /ko/cpp/system.drawing.imaging/pixelformat/
---
## PixelFormat enum


픽셀의 색상 데이터 형식을 지정합니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
enum class PixelFormat
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| Indexed | 65536 | 픽셀 데이터에 색상 인덱스 값이 포함되어 있음을 지정합니다. 이는 시스템 색상표의 색상에 대한 인덱스임을 의미합니다. |
| Gdi | 131072 | 픽셀 데이터에 GDI 색상이 포함되어 있음을 지정합니다. |
| Alpha | 262144 | 픽셀 데이터에 사전 곱셈되지 않은 알파 값이 포함되어 있음을 지정합니다. |
| PAlpha | 524288 | 픽셀 데이터에 사전 곱셈된 알파 값이 포함되어 있음을 지정합니다. |
| 확장 | 1048576 | 예약됨. |
| 표준 | 2097152 | 픽셀 형식이 32비트(픽셀당)이며, 24비트 색 깊이와 8비트 알파 채널을 지정합니다. |
| 정의되지 않음 | 0 | 픽셀 형식이 정의되지 않았음을 지정합니다. |
| 무시 | 0 | 픽셀 형식이 지정되지 않았습니다. |
| Format1bppIndexed | n/a | 픽셀 형식이 픽셀당 1비트 인덱스 색상임을 지정합니다. |
| Format4bppIndexed | n/a | 픽셀 형식이 픽셀당 4비트 인덱스 색상임을 지정합니다. |
| Format8bppIndexed | n/a | 픽셀 형식이 픽셀당 8비트 인덱스 색상임을 지정합니다. |
| Format16bppGrayScale | n/a | 픽셀 형식이 픽셀당 16비트임을 지정합니다. 색 정보는 65536단계의 회색을 지정합니다. |
| Format16bppRgb555 | n/a | 픽셀 형식이 픽셀당 16비트이며, 빨강, 초록, 파랑 각 구성 요소에 5비트를 사용하고 나머지 비트는 사용되지 않음을 지정합니다. |
| Format16bppRgb565 | n/a | 픽셀 형식이 픽셀당 16비트이며, 빨강에 5비트, 초록에 6비트, 파랑에 5비트를 사용함을 지정합니다. |
| Format16bppArgb1555 | n/a | 픽셀 형식이 픽셀당 16비트이며, 빨강, 초록, 파랑 각 구성 요소에 5비트와 알파에 1비트를 사용함을 지정합니다. |
| Format24bppRgb | n/a | 픽셀 형식이 픽셀당 24비트이며, 빨강, 초록, 파랑 각 구성 요소에 8비트를 사용함을 지정합니다. |
| Format32bppRgb | n/a | 픽셀 형식이 픽셀당 32비트이며, 빨강, 초록, 파랑 각 구성 요소에 8비트가 할당되고 나머지 8비트는 사용되지 않음을 지정합니다. |
| Format32bppArgb | n/a | 픽셀 형식이 픽셀당 32비트이며, 빨강, 초록, 파랑 각 구성 요소에 8비트와 알파에 8비트가 할당됨을 지정합니다. |
| Format32bppPArgb | n/a | 픽셀 형식이 픽셀당 32비트이며, 빨강, 초록, 파랑 각 구성 요소에 8비트와 알파에 8비트가 할당됨을 지정합니다. 빨강, 초록, 파랑 구성 요소는 알파 값에 따라 pre‑multiplied됩니다. |
| Format48bppRgb | n/a | 픽셀 형식이 픽셀당 48비트이며, 빨강, 초록, 파랑 각 구성 요소에 16비트가 할당됨을 지정합니다. |
| Format64bppArgb | n/a | 픽셀 형식이 픽셀당 64비트이며, 빨강, 초록, 파랑 각 구성 요소에 16비트와 알파에 16비트가 할당됨을 지정합니다. |
| Format64bppPArgb | n/a | 픽셀 형식이 픽셀당 64비트이며, 빨강, 초록, 파랑 각 구성 요소에 16비트와 알파에 16비트가 할당됨을 지정합니다. 빨강, 초록, 파랑 구성 요소는 알파 값에 따라 pre‑multiplied됩니다. |
| Format32bppCMYK | n/a | 픽셀 형식이 픽셀당 32비트이며, 시안, 마젠타, 옐로우, 키(검정) 각 구성 요소에 8비트가 할당됨을 지정합니다. |
| Max | 16 | 이 열거형의 최대값입니다. |

## 또 보기

* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
