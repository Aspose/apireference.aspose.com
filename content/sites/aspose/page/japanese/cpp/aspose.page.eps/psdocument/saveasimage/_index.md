---
title: "Aspose::Page::EPS::PsDocument::SaveAsImage メソッド"
linktitle: "SaveAsImage"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::SaveAsImage メソッド。PS/EPS ファイルを画像ファイルに保存します。出力ディレクトリとファイル名は入力の PS ファイルと同じになります。ファイル拡張子は \\\"options\\\" パラメータで指定された画像形式に対応します。ドキュメントが FileStream 以外のストリームで初期化された場合、画像ファイルは C++ のデフォルトのファイル名テンプレートで現在のフォルダーに保存されます。"
type: docs
weight: 4300
url: /ja/cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>) method


PS/EPS ファイルを画像ファイルとして保存します。出力ディレクトリとファイル名は入力の PS ファイルと同じになります。ファイル拡張子は \"options\" パラメータの画像形式に対応します。ドキュメントが FileStream 以外のストリームで初期化された場合、画像ファイルはデフォルトのファイル名テンプレートで現在のフォルダーに保存されます。

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) method


PS/EPS ファイルを指定されたディレクトリに、指定されたファイル名で画像ファイルとして保存します。ファイル拡張子は \"options\" パラメータの画像形式に対応します。

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
