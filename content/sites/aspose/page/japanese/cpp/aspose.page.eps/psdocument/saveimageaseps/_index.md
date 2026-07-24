---
title: "Aspose::Page::EPS::PsDocument::SaveImageAsEps メソッド"
linktitle: "SaveImageAsEps"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::SaveImageAsEps メソッド。C++ で Bitmap オブジェクトを EPS 出力ストリームに保存します。"
type: docs
weight: 5800
url: /ja/cpp/aspose.page.eps/psdocument/saveimageaseps/
---
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


Bitmap オブジェクトを [EPS](../../) 出力ストリームに保存します。

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 画像 | System::SharedPtr\<System::Drawing::Bitmap\> | 画像。 |
| epsStream | System::SharedPtr\<System::IO::Stream\> | [EPS](../../) 出力ストリーム。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | 変換中にスローされたエラーの出力を指定するパラメータを含みます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


Bitmap オブジェクトを [EPS](../../) ファイルに保存します。

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 画像 | System::SharedPtr\<System::Drawing::Bitmap\> | 画像。 |
| epsFilePath | System::String | [EPS](../../) ファイルパス。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | 変換中にスローされたエラーの出力を指定するパラメータを含みます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [String](../../../system/string/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


入力ストリームから PNG/JPEG/TIFF/BMP/GIF/EMF 画像を [EPS](../../) 出力ストリームに保存します。

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::IO::Stream> imageStream, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| imageStream | System::SharedPtr\<System::IO::Stream\> | 画像入力ストリーム。 |
| epsStream | System::SharedPtr\<System::IO::Stream\> | [EPS](../../) 出力ストリーム。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | 変換中にスローされたエラーの出力を指定するパラメータを含みます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


ファイルから PNG/JPEG/TIFF/BMP/GIF/EMF 画像を [EPS](../../) ファイルに保存します。

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::String imageFilePath, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| imageFilePath | System::String | 画像ファイルのパス。 |
| epsFilePath | System::String | [EPS](../../) ファイルパス。 |
| options | System::SharedPtr\<Device::PsSaveOptions\> | 変換中にスローされたエラーの出力を指定するパラメータを含みます。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
