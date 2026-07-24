---
title: "System::Text::DecoderExceptionFallback クラス"
linktitle: "DecoderExceptionFallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::DecoderExceptionFallback クラス。例外スローのフォールバック戦略を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.text/decoderexceptionfallback/
---
## DecoderExceptionFallback class


例外スローのフォールバック戦略を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class DecoderExceptionFallback : public System::Text::DecoderFallback
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | フォールバックバッファを作成します。 |
| [get_MaxCharCount](./get_maxcharcount/)() const override | インスタンスが返すことのできる最大文字数を取得します。 |
## 参照

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
