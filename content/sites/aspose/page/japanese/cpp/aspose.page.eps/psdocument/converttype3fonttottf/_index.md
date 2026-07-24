---
title: "Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF method"
linktitle: "ConvertType3FontToTTF"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF メソッド。C++ で Type 3 フォントを TrueType ストリームに変換します。"
type: docs
weight: 800
url: /ja/cpp/aspose.page.eps/psdocument/converttype3fonttottf/
---
## PsDocument::ConvertType3FontToTTF(System::String, System::SharedPtr\<System::IO::Stream\>) method


Type 3 フォントを **TrueType** ストリームに変換します。

```cpp
void Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF(System::String type3FontFilePath, System::SharedPtr<System::IO::Stream> outputStream)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type3FontFilePath | System::String | Type 3 フォントファイルのパスです。 |
| outputStream | System::SharedPtr\<System::IO::Stream\> | 結果の **TrueType** フォントを保存する出力ストリームです。 |

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ConvertType3FontToTTF(System::String, System::String) method


Type 3 フォントを **TrueType** に変換します。変換された TTF フォントの名前は、入力の Type 3 フォントファイルと同じで、拡張子は \".ttf\" になります。TTF ファイルは割り当てられた出力ディレクトリに保存されます。

```cpp
void Aspose::Page::EPS::PsDocument::ConvertType3FontToTTF(System::String type3FontFilePath, System::String outputDir)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| type3FontFilePath | System::String | Type 3 フォントファイルのパスです。 |
| outputDir | System::String | 結果の **TrueType** フォントを保存する出力ディレクトリです。 |

## 参照

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
