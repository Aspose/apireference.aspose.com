---
title: "System::Drawing::Imaging::Encoder class"
linktitle: "Encoder"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Imaging::Encoder クラス。画像エンコーダーパラメータのセットに関連付けられた GUID を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 500
url: /ja/cpp/system.drawing.imaging/encoder/
---
## Encoder class


画像エンコーダーパラメータのセットに関連付けられた GUID を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class Encoder : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Encoder](./encoder/)(const Guid\&) | 新しい [Encoder](./) クラスのインスタンスを構築します。 |
| [get_Guid](./get_guid/)() const | 現在のオブジェクトが表す画像エンコーダーパラメータのセットを指定する GUID を返します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [ChrominanceTable](./chrominancetable/) | 色度テーブルパラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
| static [ColorDepth](./colordepth/) | 色深度パラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
| static [Compression](./compression/) | 圧縮パラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
| static [LuminanceTable](./luminancetable/) | 輝度テーブルパラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
| static [Quality](./quality/) | 品質パラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
| static [RenderMethod](./rendermethod/) | レンダーメソッドパラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
| static [SaveFlag](./saveflag/) | 保存フラグパラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
| static [ScanMethod](./scanmethod/) | スキャンメソッドパラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
| static [Transformation](./transformation/) | 変換パラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
| static [Version](./version/) | バージョンパラメータカテゴリを表す [Encoder](./) クラスのインスタンスです。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
