---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method"
linktitle: "ClipAndNewPath"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath メソッド。現在のグラフィック状態にクリップを追加し、続いて \"newpath\" 演算子を書き込みます。このクリッピングパスと、後続のパス（たとえば \"charpath\" 演算子で輪郭化されたグリフ）との合流を回避するために必要です。C++ で実装されています。"
type: docs
weight: 300
url: /ja/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


現在のグラフィックス状態にクリップを追加し、続いて \"newpath\" 演算子を書き込みます。この操作は、クリッピングパスとその後のパス（例: \"charpath\" 演算子で輪郭化されたグリフ）との合流を回避するために必要です。

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | クリッピングパスです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
