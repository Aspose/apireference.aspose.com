---
title: "System::Drawing::Image::FromStream 메서드"
linktitle: "FromStream"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Image::FromStream 메서드. 지정된 스트림에서 Image 객체를 생성합니다 (C++)."
type: docs
weight: 2900
url: /ko/cpp/system.drawing/image/fromstream/
---
## Image::FromStream method


지정된 스트림에서 [Image](../) 객체를 생성합니다.

```cpp
static SharedPtr<Image> System::Drawing::Image::FromStream(const SharedPtr<System::IO::Stream> &stream, bool use_embedded_color_management=false, bool validate_image_data=true)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<System::IO::Stream\>\& | 이미지 데이터를 포함하는 스트림 |
| use_embedded_color_management | bool | IGNORED |
| validate_image_data | bool | IGNORED |

### ReturnValue

생성된 [Image](../) 객체에 대한 공유 포인터.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../)
* Class [Stream](../../../system.io/stream/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
