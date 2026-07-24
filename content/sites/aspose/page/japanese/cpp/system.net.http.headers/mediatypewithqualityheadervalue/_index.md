---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue クラス"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue クラス。''Content-Type'' ヘッダーの値に追加の品質係数を持つ MIME タイプを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用して作成したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 1300
url: /ja/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


'Content-Type' ヘッダーの値に追加の品質係数を持つ MIME タイプを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用して作成したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI 情報。 |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | 新しいインスタンスを構築します。 |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | 新しいインスタンスを構築します。 |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | 新しいインスタンスを構築します。 |
| static [Parse](./parse/)(String) | 渡された文字列を [MediaTypeWithQualityHeaderValue](./) クラスのインスタンスに変換します。 |
| [set_Quality](./set_quality/)(Nullable\<double\>) | 品質の値を設定します。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | 渡された文字列を [MediaTypeWithQualityHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
