---
title: "System::Net::Http::Headers::ContentDispositionHeaderValue クラス"
linktitle: "ContentDispositionHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::ContentDispositionHeaderValue クラス。''Content-Disposition'' ヘッダーの値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用して作成したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 300
url: /ja/cpp/system.net.http.headers/contentdispositionheadervalue/
---
## ContentDispositionHeaderValue class


'Content-Disposition' ヘッダーの値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用して作成したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class ContentDispositionHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)() | 新しいインスタンスを構築します。 |
| [ContentDispositionHeaderValue](./contentdispositionheadervalue/)(String) | 新しいインスタンスを構築します。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_CreationDate](./get_creationdate/)() | ファイルの作成日を取得します。 |
| [get_DispositionType](./get_dispositiontype/)() | RTTI 情報。 |
| [get_FileName](./get_filename/)() | メッセージペイロードを保存するためのファイル名の構築方法を決定する値を取得します。エンティティがデタッチされ、別個のファイルに保存される場合に使用されます。 |
| [get_FileNameStar](./get_filenamestar/)() | メッセージペイロードを保存するためのファイル名の構築方法を決定する値を取得します。エンティティがデタッチされ、個別のファイルに保存される場合に使用されます。 |
| [get_ModificationDate](./get_modificationdate/)() | ファイルの最終更新日を取得します。 |
| [get_Name](./get_name/)() | コンテンツ本体の一部の名前を取得します。 |
| [get_Parameters](./get_parameters/)() | 'Content-Disposition' ヘッダーのパラメータコレクションを返します。 |
| [get_ReadDate](./get_readdate/)() | ファイルが最後に読み取られた日時を取得します。 |
| [get_Size](./get_size/)() | 概算のファイルサイズを取得します。 |
| static [GetDispositionTypeLength](./getdispositiontypelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 指定されたインデックスから渡された文字列を [ContentDispositionHeaderValue](./) クラスのインスタンスに変換します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [Parse](./parse/)(String) | 渡された文字列を [ContentDispositionHeaderValue](./) クラスのインスタンスに変換します。 |
| [set_CreationDate](./set_creationdate/)(Nullable\<DateTimeOffset\>) | ファイルの作成日を設定します。 |
| [set_DispositionType](./set_dispositiontype/)(String) | 配置タイプを設定します。 |
| [set_FileName](./set_filename/)(String) | メッセージペイロードを保存するためのファイル名の構築方法を決定する値を設定します。エンティティがデタッチされ、別個のファイルに保存される場合に使用されます。 |
| [set_FileNameStar](./set_filenamestar/)(String) | メッセージペイロードを保存するためのファイル名の構築方法を決定する値を設定します。エンティティがデタッチされ、個別のファイルに保存される場合に使用されます。 |
| [set_ModificationDate](./set_modificationdate/)(Nullable\<DateTimeOffset\>) | ファイルの最終更新日を設定します。 |
| [set_Name](./set_name/)(String) | コンテンツ本体の一部の名前を設定します。 |
| [set_ReadDate](./set_readdate/)(Nullable\<DateTimeOffset\>) | ファイルが最後に読み取られた日時を設定します。 |
| [set_Size](./set_size/)(Nullable\<int64_t\>) | 概算のファイルサイズを設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentDispositionHeaderValue\>\&) | 渡された文字列を [ContentDispositionHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
