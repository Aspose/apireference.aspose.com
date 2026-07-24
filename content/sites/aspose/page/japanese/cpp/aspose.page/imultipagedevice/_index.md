---
title: "Aspose::Page::IMultiPageDevice クラス"
linktitle: "IMultiPageDevice"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::IMultiPageDevice クラス。 このインターフェイスは C++ でマルチページデバイスを操作するためのメソッドを含みます。"
type: docs
weight: 800
url: /ja/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


このインターフェイスはマルチページデバイスを操作するためのメソッドを含みます。

```cpp
class IMultiPageDevice : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [ClosePage](./closepage/)() | ページがレンダリングされた後、デバイスの必要な準備を行います。 |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | 現在のページ番号。 |
| virtual [InitPageNumbers](./initpagenumbers/)() | 出力するページ数を初期化します。 |
| virtual [OpenPage](./openpage/)(System::String) | ページのレンダリング前にデバイスの必要な準備を行います。 |
| virtual [OpenPage](./openpage/)(float, float) | 各ページのレンダリング前にデバイスの必要な準備を行います。 |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | 他のマルチページデバイスからページパラメータを更新します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
