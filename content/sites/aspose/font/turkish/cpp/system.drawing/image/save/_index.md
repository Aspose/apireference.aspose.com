---
title: "System::Drawing::Image::Save yöntemi"
linktitle: "Save"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Image::Save yöntemi. Mevcut nesne tarafından temsil edilen görüntüyü, belirtilen kodlayıcı ve kodlayıcı parametrelerini kullanarak belirtilen akışa C++'da kaydeder."
type: docs
weight: 2200
url: /tr/cpp/system.drawing/image/save/
---
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


Mevcut nesne tarafından temsil edilen görüntüyü, belirtilen kodlayıcı ve kodlayıcı parametrelerini kullanarak belirtilen akışa kaydeder.

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<System::IO::Stream\>\& | Görüntünün kaydedileceği bir akış |
| kodlayıcı | const Imaging::ImageCodecInfoPtr\& | Kullanılacak kodlayıcı |
| encoder_params | const Imaging::EncoderParametersPtr\& | Kullanılan kodlayıcının parametreleri |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) method


Geçerli nesne tarafından temsil edilen görüntüyü belirtilen akışa belirtilen biçimde kaydeder.

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageFormatPtr &format)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| akış | const SharedPtr\<System::IO::Stream\>\& | Görüntünün kaydedileceği bir akış |
| biçim | const Imaging::ImageFormatPtr\& | Görüntünün kaydedileceği bir format |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Image::Save(const String\&) method


Geçerli nesne tarafından temsil edilen görüntüyü belirtilen dosyaya PNG biçiminde kaydeder.

```cpp
void System::Drawing::Image::Save(const String &filename)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| filename | const String\& | Görüntünün kaydedileceği dosyanın adı |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


Geçerli nesne tarafından temsil edilen görüntüyü belirtilen kodlayıcı ve kodlayıcı parametrelerini kullanarak belirtilen dosyaya kaydeder.

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| filename | const String\& | Görüntünün kaydedileceği dosyanın adı |
| kodlayıcı | const Imaging::ImageCodecInfoPtr\& | Kullanılacak kodlayıcı |
| encoder_params | const Imaging::EncoderParametersPtr\& | Kullanılacak kodlayıcının parametreleri |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageFormatPtr\&) method


Geçerli nesne tarafından temsil edilen görüntüyü belirtilen dosyaya belirtilen biçimde kaydeder.

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageFormatPtr &format)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| filename | const String\& | Görüntünün kaydedileceği dosyanın adı |
| biçim | const Imaging::ImageFormatPtr\& | Görüntünün kaydedileceği bir format |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
