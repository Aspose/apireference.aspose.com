---
title: "Aspose::Page::EPS::PsDocument::ResizeEps method"
linktitle: "ResizeEps"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::ResizeEps メソッド。指定された PsDocument を EPS ファイルとしてサイズ変更します。このメソッドは EPS のサイズを取得した後にのみ使用されます。既存の %BoundingBox を更新した初期 EPS ファイルを保存するか、または新しいものが作成されます。ページ変換行列も C++ で設定されます。"
type: docs
weight: 4000
url: /ja/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


指定された[PsDocument](../)を[EPS](../../)ファイルとしてサイズ変更します。このメソッドは[EPS](../../)サイズを抽出した後にのみ使用されます。既存の%BoundingBoxを更新した初期の[EPS](../../)ファイルを保存するか、新しいファイルが作成されます。[Page](../../../aspose.page/)の変換行列も設定されます。

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | 出力 [EPS](../../) ファイルのストリーム。 |
| newSizeInUnits | System::Drawing::SizeF | 割り当てられた単位での[EPS](../../)画像の新しいサイズ。 |
| 単位 | 単位 | 新しいサイズの単位です。ポイント、インチ、ミリメートル、センチメートル、または初期サイズのパーセントを指定できます。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


指定された[PsDocument](../)を[EPS](../../)ファイルとしてサイズ変更します。このメソッドは[EPS](../../)サイズを抽出した後にのみ使用されます。初期の[EPS](../../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hThe output directory where image file will be saved.e を、更新された既存の%BoundingBoxと共に保存するか、新しいファイルが作成されます。[Page](../../../aspose.page/)の変換行列も設定されます。

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outEpsFilePath | System::String | 出力[EPS](../../)ファイルのパス。 |
| newSizeInUnits | System::Drawing::SizeF | 割り当てられた単位での[EPS](../../)画像の新しいサイズ。 |
| 単位 | 単位 | 新しいサイズの単位です。ポイント、インチ、ミリメートル、センチメートル、または初期サイズのパーセントを指定できます。 |

## 参照

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
