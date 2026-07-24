---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImage メソッド"
linktitle: "SaveAsImage"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImage メソッド。ドキュメントを画像ファイルとして保存します。出力ディレクトリとファイル名は入力 XPS ファイルと同じになります。ファイル拡張子は \"options\" パラメータで指定された画像形式に対応します。ドキュメントが FileStream 以外のストリームで初期化されている場合、画像ファイルは C++ でデフォルトのファイル名テンプレートを使用して現在のフォルダーに保存されます。"
type: docs
weight: 5500
url: /ja/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


ドキュメントを画像ファイルに保存します。出力ディレクトリとファイル名は入力の [XPS](../../) ファイルと同じになります。ファイル拡張子は "options" パラメーターの画像形式に対応します。ドキュメントが FileStream でないストリームで初期化された場合、画像ファイルはデフォルトのファイル名テンプレートで現在のフォルダーに保存されます。

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | ビットマップ画像形式でドキュメントを保存するためのオプションです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


ドキュメントを指定されたディレクトリに、指定されたファイル名で画像ファイルとして保存します。ファイル拡張子は \"options\" パラメータの画像形式に対応します。

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | ビットマップ画像形式でドキュメントを保存するためのオプションです。 |
| outDir | System::String | 画像ファイルが保存される出力ディレクトリです。 |
| fileNameTemplate | System::String | 画像のファイル名テンプレート（拡張子なし）。入力の [XPS](../../) ファイルが 1 ページの場合は正確にファイル名になります。それ以外の場合は "_[n]" となり、"n" は 0 から始まるページ番号です。このサフィックスが付加されます。ファイル拡張子は "option" パラメーターの画像形式に対応します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
