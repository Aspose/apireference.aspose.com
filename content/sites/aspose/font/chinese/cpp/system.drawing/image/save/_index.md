---
title: "System::Drawing::Image::Save 方法"
linktitle: "保存"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Image::Save 方法。 在 C++ 中使用指定的编码器和编码器参数，将当前对象表示的图像保存到指定的流中。"
type: docs
weight: 2200
url: /zh/cpp/system.drawing/image/save/
---
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


将当前对象表示的图像保存到指定的流中，使用指定的编码器和编码器参数。

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<System::IO::Stream\>\& | 用于保存图像的流 |
| 编码器 | const Imaging::ImageCodecInfoPtr\& | 要使用的编码器 |
| encoder_params | const Imaging::EncoderParametersPtr\& | 要使用的编码器参数 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) method


将当前对象所表示的图像以指定格式保存到指定流中。

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageFormatPtr &format)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<System::IO::Stream\>\& | 用于保存图像的流 |
| 格式 | const Imaging::ImageFormatPtr\& | 用于保存图像的格式 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Image::Save(const String\&) method


将当前对象所表示的图像以 PNG 格式保存到指定文件。

```cpp
void System::Drawing::Image::Save(const String &filename)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filename | const String\& | 用于保存图像的文件名 |

## 另见

* Class [String](../../../system/string/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


使用指定的编码器和编码器参数，将当前对象所表示的图像保存到指定文件。

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filename | const String\& | 用于保存图像的文件名 |
| 编码器 | const Imaging::ImageCodecInfoPtr\& | 要使用的编码器 |
| encoder_params | const Imaging::EncoderParametersPtr\& | 要使用的编码器参数 |

## 另见

* Class [String](../../../system/string/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageFormatPtr\&) method


将当前对象所表示的图像以指定格式保存到指定文件。

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageFormatPtr &format)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| filename | const String\& | 用于保存图像的文件名 |
| 格式 | const Imaging::ImageFormatPtr\& | 用于保存图像的格式 |

## 另见

* Class [String](../../../system/string/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
