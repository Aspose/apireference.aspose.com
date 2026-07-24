---
title: "System::Data::Common::DbDataReader クラス"
linktitle: "DbDataReader"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::Common::DbDataReader クラス。データベースからデータを受け取るための API。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。これにより実行時エラーやアサーション失敗が発生する可能性があります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 400
url: /ja/cpp/system.data.common/dbdatareader/
---
## DbDataReader class


データベースからデータを受け取るための API。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。これにより実行時エラーやアサーション失敗が発生する可能性があります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class DbDataReader : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Close](./close/)() | データ取得チャネルを閉じます。 |
| virtual [idx_get](./idx_get/)(String) | 名前付き項目を取得します。 |
| virtual [idx_get](./idx_get/)(int) | インデックスで項目を取得します。 |
| virtual [Read](./read/)() | データベースから次のレコードを読み取ります。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | RTTI 情報。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
