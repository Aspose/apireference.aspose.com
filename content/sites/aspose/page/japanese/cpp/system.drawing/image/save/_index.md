---
title: "System::Drawing::Image::Save メソッド"
linktitle: "保存"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Image::Save メソッド。現在のオブジェクトが表す画像を、指定されたエンコーダーとエンコーダーパラメータを使用して、指定されたストリームに保存します（C++）。"
type: docs
weight: 2200
url: /ja/cpp/system.drawing/image/save/
---
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


現在のオブジェクトが表す画像を、指定されたエンコーダーとエンコーダーパラメータを使用して、指定されたストリームに保存します。

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<System::IO::Stream\>\& | 画像を保存するストリーム |
| エンコーダー | const Imaging::ImageCodecInfoPtr\& | 使用するエンコーダー |
| encoder_params | const Imaging::EncoderParametersPtr\& | 使用するエンコーダーのパラメータ |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const SharedPtr\<System::IO::Stream\>\&, const Imaging::ImageFormatPtr\&) method


現在のオブジェクトが表す画像を、指定された形式で指定されたストリームに保存します。

```cpp
void System::Drawing::Image::Save(const SharedPtr<System::IO::Stream> &stream, const Imaging::ImageFormatPtr &format)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ストリーム | const SharedPtr\<System::IO::Stream\>\& | 画像を保存するストリーム |
| フォーマット | const Imaging::ImageFormatPtr\& | 画像を保存する形式 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const String\&) method


現在のオブジェクトが表す画像を PNG 形式で指定されたファイルに保存します。

```cpp
void System::Drawing::Image::Save(const String &filename)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filename | const String\& | 画像を保存するファイル名 |

## 参照

* Class [String](../../../system/string/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageCodecInfoPtr\&, const Imaging::EncoderParametersPtr\&) method


現在のオブジェクトが表す画像を、指定されたエンコーダーとエンコーダーパラメータを使用して、指定されたファイルに保存します。

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageCodecInfoPtr &encoder, const Imaging::EncoderParametersPtr &encoder_params)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filename | const String\& | 画像を保存するファイル名 |
| エンコーダー | const Imaging::ImageCodecInfoPtr\& | 使用するエンコーダー |
| encoder_params | const Imaging::EncoderParametersPtr\& | 使用するエンコーダーのパラメータ |

## 参照

* Class [String](../../../system/string/)
* Typedef [ImageCodecInfoPtr](../../../system.drawing.imaging/imagecodecinfoptr/)
* Typedef [EncoderParametersPtr](../../../system.drawing.imaging/encoderparametersptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Image::Save(const String\&, const Imaging::ImageFormatPtr\&) method


現在のオブジェクトが表す画像を指定された形式で指定されたファイルに保存します。

```cpp
void System::Drawing::Image::Save(const String &filename, const Imaging::ImageFormatPtr &format)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| filename | const String\& | 画像を保存するファイル名 |
| フォーマット | const Imaging::ImageFormatPtr\& | 画像を保存する形式 |

## 参照

* Class [String](../../../system/string/)
* Typedef [ImageFormatPtr](../../../system.drawing.imaging/imageformatptr/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
