---
title: "System::Drawing::Text::FontCollection クラス"
linktitle: "FontCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Text::FontCollection クラス。インストール済みおよびプライベートフォントコレクションの基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.drawing.text/fontcollection/
---
## FontCollection class


インストール済みおよびプライベートフォントコレクションの基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class FontCollection : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dispose](./dispose/)() override | 現在のオブジェクトが取得したオペレーティングシステムのリソースを解放します。 |
| virtual [get_Families](./get_families/)() | 現在のオブジェクトが表すフォントコレクションに関連付けられた [FontFamily](../../system.drawing/fontfamily/) オブジェクトの配列を返します。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Drawing::Text](../)
* Library [Aspose.Page for C++](../../)
