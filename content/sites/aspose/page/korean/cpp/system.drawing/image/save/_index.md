---
title: "System::Drawing::Image::Save 메서드"
linktitle: "Save"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Image::Save 메서드. 현재 객체가 나타내는 이미지를 지정된 스트림에 지정된 인코더와 인코더 매개변수를 사용하여 C++에서 저장합니다."
type: docs
weight: 2200
url: /ko/cpp/system.drawing/image/save/
---
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


현재 객체가 나타내는 이미지를 지정된 인코더와 인코더 매개변수를 사용하여 지정된 스트림에 저장합니다.

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<System::IO::Stream\>\& | 이미지를 저장할 스트림 |
| 인코더 | const Imaging::ImageCodecInfoPtr\& | 사용할 인코더 |
| encoder_params | const Imaging::EncoderParametersPtr\& | 사용할 인코더의 매개변수 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) method


현재 객체가 나타내는 이미지를 지정된 형식으로 지정된 스트림에 저장합니다.

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageFormatPtr &format)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 스트림 | const SharedPtr\<System::IO::Stream\>\& | 이미지를 저장할 스트림 |
| 형식 | const Imaging::ImageFormatPtr\& | 이미지를 저장할 형식 |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const String\&) method


현재 객체가 나타내는 이미지를 PNG 형식으로 지정된 파일에 저장합니다.

```cpp
void System::Drawing::Image::Save(const String &filename)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| filename | const String\& | 이미지를 저장할 파일의 이름 |

## 또 보기

* Class [String](../../../system/string/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


현재 객체가 나타내는 이미지를 지정된 인코더와 인코더 매개변수를 사용하여 지정된 파일에 저장합니다.

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| filename | const String\& | 이미지를 저장할 파일의 이름 |
| 인코더 | const Imaging::ImageCodecInfoPtr\& | 사용할 인코더 |
| encoder_params | const Imaging::EncoderParametersPtr\& | 사용할 인코더의 매개변수 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageFormatPtr\&) method


현재 객체가 나타내는 이미지를 지정된 형식으로 지정된 파일에 저장합니다.

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageFormatPtr &format)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| filename | const String\& | 이미지를 저장할 파일의 이름 |
| 형식 | const Imaging::ImageFormatPtr\& | 이미지를 저장할 형식 |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
