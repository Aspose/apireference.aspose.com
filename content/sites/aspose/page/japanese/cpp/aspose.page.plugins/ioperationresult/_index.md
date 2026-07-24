---
title: "Aspose::Page::Plugins::IOperationResult クラス"
linktitle: "IOperationResult"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Plugins::IOperationResult クラス。具体的なプラグイン操作結果が C++ で実装すべき共通メソッドを定義する一般的な操作結果インターフェイスです。"
type: docs
weight: 700
url: /ja/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


具体的なプラグイン操作結果が実装すべき共通メソッドを定義する汎用操作結果インターフェイスです。

```cpp
class IOperationResult : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_Data](./get_data/)() | 生データを取得します。 |
| virtual [get_IsByteArray](./get_isbytearray/)() | 結果がバイト配列かどうかを示します。 |
| virtual [get_IsFile](./get_isfile/)() | 結果が出力ファイルへのパスかどうかを示します。 |
| virtual [get_IsStream](./get_isstream/)() | 結果が出力ストリームかどうかを示します。 |
| virtual [get_IsString](./get_isstring/)() | 結果がテキスト文字列かどうかを示します。 |
| virtual [ToFile](./tofile/)() | 結果をファイルに変換しようとします。 |
| virtual [ToStream](./tostream/)() | 結果をストリームオブジェクトに変換しようとします。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
