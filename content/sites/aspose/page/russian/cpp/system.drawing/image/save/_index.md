---
title: "System::Drawing::Image::Save метод"
linktitle: "Save"
second_title: "Aspose.Page для C++"
description: "System::Drawing::Image::Save метод. Сохраняет изображение, представляемое текущим объектом, в указанный поток, используя указанный кодировщик и параметры кодировщика в C++."
type: docs
weight: 2200
url: /ru/cpp/system.drawing/image/save/
---
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


Сохраняет изображение, представленное текущим объектом, в указанный поток, используя указанный кодировщик и параметры кодировщика.

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<System::IO::Stream\>\& | Поток, в который сохраняется изображение |
| кодировщик | const Imaging::ImageCodecInfoPtr\& | Кодировщик, который будет использоваться |
| encoder_params | const Imaging::EncoderParametersPtr\& | Параметры кодировщика для использования |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) method


Сохраняет изображение, представленное текущим объектом, в указанный поток в указанном формате.

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageFormatPtr &format)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| поток | const SharedPtr\<System::IO::Stream\>\& | Поток, в который сохраняется изображение |
| формат | const Imaging::ImageFormatPtr\& | Формат, в котором сохранять изображение |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const String\&) method


Сохраняет изображение, представленное текущим объектом, в указанный файл в формате PNG.

```cpp
void System::Drawing::Image::Save(const String &filename)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| filename | const String\& | Имя файла, в который сохранять изображение |

## См. также

* Class [String](../../../system/string/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


Сохраняет изображение, представленное текущим объектом, в указанный файл, используя указанный кодировщик и параметры кодировщика.

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| filename | const String\& | Имя файла, в который сохранять изображение |
| кодировщик | const Imaging::ImageCodecInfoPtr\& | Кодировщик, который будет использоваться |
| encoder_params | const Imaging::EncoderParametersPtr\& | Параметры кодировщика для использования |

## См. также

* Class [String](../../../system/string/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageFormatPtr\&) method


Сохраняет изображение, представленное текущим объектом, в указанный файл в указанном формате.

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageFormatPtr &format)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| filename | const String\& | Имя файла, в который сохранять изображение |
| формат | const Imaging::ImageFormatPtr\& | Формат, в котором сохранять изображение |

## См. также

* Class [String](../../../system/string/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
