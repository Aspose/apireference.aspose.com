---
title: "Aspose::Page::EPS::PsDocument::ExtractText メソッド"
linktitle: "ExtractText"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::ExtractText メソッド。PS ファイルからテキストを抽出します。テキストは、Type 42（TrueType）フォントで書かれているか、またはベクターマップ内に Type 42 フォントを含む Type 0 フォントで書かれている場合にのみ抽出可能です（C++）。"
type: docs
weight: 2300
url: /ja/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


PS ファイルからテキストを抽出します。テキストは Type 42 (**TrueType**) フォント、またはベクターマップ内に Type 42 フォントを含む Type 0 フォントで記述されている場合にのみ抽出できます。

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| options | System::SharedPtr\<SaveOptions\> | 保存オプション。 |
| startPage | int32_t | テキスト抽出を開始するページです。このパラメータは複数ページのドキュメントで有用です。 |
| endPage | int32_t | テキスト抽出を終了するページです。このパラメータは複数ページのドキュメントで有用です。 |

### ReturnValue

抽出されたテキスト。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
