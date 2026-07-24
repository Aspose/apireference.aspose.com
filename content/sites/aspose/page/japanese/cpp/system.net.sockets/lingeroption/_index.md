---
title: "System::Net::Sockets::LingerOption クラス"
linktitle: "LingerOption"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::LingerOption クラス。ソケットが Close() または Close() メソッドの呼び出し後も接続されたままになるかどうかを指定します。また、データ送信が継続する場合にソケットが接続されたままでいる期間も指定します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にはそのポインタを使用してください。"
type: docs
weight: 200
url: /ja/cpp/system.net.sockets/lingeroption/
---
## LingerOption class


ソケットが Close() または Close() メソッドの呼び出し後も接続されたままになるかどうかを指定します。また、データ送信が継続する場合にソケットが接続されたままでいる期間も指定します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際にはそのポインタを使用してください。

```cpp
class LingerOption : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Enabled](./get_enabled/)() | RTTI 情報。 |
| [get_LingerTime](./get_lingertime/)() | 遅延タイムアウトを秒単位で取得します。 |
| [LingerOption](./lingeroption/)(bool, int32_t) | 新しいインスタンスを構築します。 |
| [set_Enabled](./set_enabled/)(bool) | ソケットが保留中のデータをすべて送信しようとしてクローズを遅延させるかどうかを示す値を設定します。 |
| [set_LingerTime](./set_lingertime/)(int32_t) | 遅延タイムアウトを秒単位で設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
