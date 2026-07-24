---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class"
linktitle: "BeforeSavingEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs クラス。C++ におけるさまざまな保存前イベントの引数の基底クラスを定義します。"
type: docs
weight: 200
url: /ja/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


さまざまな保存前イベントの引数の基底クラスを定義します。

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| パラメーター | 説明 |
| --- | --- |
| T | 変更 API のタイプです。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | [XPS](../../aspose.page.xps/) パッケージ内のすべてのドキュメントにわたる現在の絶対ページ番号です。 |
| [get_DocumentNumber](./get_documentnumber/)() const | [XPS](../../aspose.page.xps/) パッケージ内の現在のドキュメント番号です。 |
| [get_ElementAPI](./get_elementapi/)() const | 保存されようとしている要素の変更 API を取得します。 |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | 現在の出力番号です。**PageNumbers** 保存オプションが指定されている場合、**AbsolutePageNumber** とは異なります。 |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | [XPS](../../aspose.page.xps/) パッケージ内の現在のドキュメントに対する現在のページ番号です。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |

## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
