---
title: "System::Net::Http::Headers::ObjectCollection クラス"
linktitle: "ObjectCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::ObjectCollection クラス。C++ におけるオブジェクトのコレクションを表します。"
type: docs
weight: 1600
url: /ja/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


オブジェクトのコレクションを表します。

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | オブジェクトの型です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | RTTI 情報。 |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | 新しいインスタンスを構築します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |

## 参照

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
