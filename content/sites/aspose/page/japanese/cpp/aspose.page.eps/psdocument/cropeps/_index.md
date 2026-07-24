---
title: "Aspose::Page::EPS::PsDocument::CropEps メソッド"
linktitle: "CropEps"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::CropEps メソッド。指定された PsDocument を EPS ファイルとしてトリミングします。既存の %BoundingBox を更新した初期の EPS ファイルを保存するか、または C++ で新しいものが作成されます。"
type: docs
weight: 900
url: /ja/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


指定された [PsDocument](../) を [EPS](../../) ファイルとしてトリミングします。既存の %BoundingBox を更新した初期の [EPS](../../) ファイルを保存するか、または新しいものが作成されます。

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | 出力 [EPS](../../) ファイルのストリーム。 |
| cropBox | System::ArrayPtr\<float\> | クロップボックス (x0, y0, x, y)。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


指定された [PsDocument](../) を [EPS](../../) ファイルとしてトリミングします。既存の %BoundingBox を更新した初期の [EPS](../../) ファイルを保存するか、または新しいものが作成されます。

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| outEpsFilePath | System::String | 出力[EPS](../../)ファイルのパス。 |
| cropBox | System::ArrayPtr\<float\> | クロップボックス (x0, y0, x, y)。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
