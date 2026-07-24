---
title: "System::Security::Cryptography::SymmetricAlgorithm クラス"
linktitle: "SymmetricAlgorithm"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::SymmetricAlgorithm クラス。暗号化と復号に同じキーを使用する対称アルゴリズムの基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 4900
url: /ja/cpp/system.security.cryptography/symmetricalgorithm/
---
## SymmetricAlgorithm class


暗号化と復号に同じキーを使用する対称アルゴリズムの基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこのタイプのインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class SymmetricAlgorithm : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)(const String\&) | アルゴリズムのインスタンスを作成します。 |
| virtual [CreateDecryptor](./createdecryptor/)() | アルゴリズムオブジェクトに関連付けられたパラメータで復号器を作成します。 |
| virtual [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 明示的なパラメータで復号器を作成します。 |
| virtual [CreateEncryptor](./createencryptor/)() | アルゴリズムオブジェクトに関連付けられたパラメータで暗号化器を作成します。 |
| virtual [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 明示的なパラメータで暗号化器を作成します。 |
| virtual [GenerateIV](./generateiv/)() | アルゴリズムの初期ベクトルをランダムに生成します。既存のものがある場合は上書きします（存在する場合）。 |
| virtual [GenerateKey](./generatekey/)() | アルゴリズムのキーをランダムに生成します。既存のものがある場合は上書きします（存在する場合）。 |
| virtual [get_BlockSize](./get_blocksize/)() | 暗号操作のブロックサイズを取得します。 |
| virtual [get_FeedbackSize](./get_feedbacksize/)() | 暗号操作のフィードバックサイズを取得します。 |
| virtual [get_IV](./get_iv/)() | 暗号操作の初期ベクトルを取得します。まだ作成されていない場合は新しく作成します。 |
| virtual [get_Key](./get_key/)() | 暗号操作のキーを取得します。まだ作成されていない場合は新しく作成します。 |
| virtual [get_KeySize](./get_keysize/)() | 暗号操作のキーサイズを取得します。 |
| virtual [get_Mode](./get_mode/)() | 暗号操作のモードを取得します。 |
| virtual [get_Padding](./get_padding/)() | 暗号操作のパディングを取得します。 |
| virtual [set_BlockSize](./set_blocksize/)(int) | 暗号操作のブロックサイズを設定します。 |
| virtual [set_FeedbackSize](./set_feedbacksize/)(int) | 暗号操作のフィードバックサイズを設定します。 |
| virtual [set_IV](./set_iv/)(System::ArrayPtr\<uint8_t\>) | 暗号操作の初期ベクトルを設定します。 |
| virtual [set_Key](./set_key/)(System::ArrayPtr\<uint8_t\>) | 暗号操作のキーを設定します。 |
| virtual [set_KeySize](./set_keysize/)(int) | 暗号操作のキーサイズを設定します。 |
| virtual [set_Mode](./set_mode/)(CipherMode) | 暗号操作のモードを設定します。 |
| virtual [set_Padding](./set_padding/)(PaddingMode) | 暗号操作のパディングを設定します。 |
| [ValidKeySize](./validkeysize/)(int) | キーサイズが有効かどうかをチェックします。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
