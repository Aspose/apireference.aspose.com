---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText メソッド"
linktitle: "set_PreserveText"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText メソッド。XPS では、フォントの文字コードに対応しない代替グリフ形への参照を含むテキスト要素が存在する場合があります。このフラグが true に設定されていると、該当する XPS 要素のテキストはグラフィックシェイプに変換されます。その結果、テキスト自体は上に透明に表示され、要素のテキストは選択可能なままになります。ただし、副作用として出力ファイルが元のファイルよりはるかに大きくなる可能性があります。フラグが false に設定されている場合、代替形として表示されるべき文字は別の文字に置き換えられ、代替グリフ形にマッピングされます。そのため、テキストは選択可能ですが、変更されて読めなくなる可能性があります。デフォルトは C++ で false です。"
type: docs
weight: 1700
url: /ja/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/set_preservetext/
---
## PdfSaveOptions::set_PreserveText method


[XPS](../../../aspose.page.xps/) では、フォントの文字コードに対応しない代替グリフ形への参照を含むテキスト要素が存在する場合があります。このフラグが true に設定されていると、該当する [XPS](../../../aspose.page.xps/) 要素のテキストはグラフィックシェイプに変換されます。その結果、テキスト自体は上に透明に表示され、要素のテキストは選択可能なままになります。ただし、副作用として出力ファイルが元のファイルよりはるかに大きくなる可能性があります。フラグが false に設定されている場合、代替形として表示されるべき文字は別の文字に置き換えられ、代替グリフ形にマッピングされます。そのため、テキストは選択可能ですが、変更されて読めなくなる可能性があります。デフォルトは false です。

```cpp
void Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions::set_PreserveText(bool value) override
```

## 参照

* Class [PdfSaveOptions](../)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../../)
* Library [Aspose.Page for C++](../../../)
