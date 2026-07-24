---
title: "Aspose::Page::Plugins::PsConverterOptions class"
linktitle: "PsConverterOptions"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Plugins::PsConverterOptions class. C++ における PsConverter プラグインのオプションを表します。"
type: docs
weight: 1200
url: /ja/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


[PsConverter](../psconverter/) プラグインのオプションを表します。

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | [PsConverter](../psconverter/) プラグインのデータコレクションに新しいデータソースを追加します。 |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | [PsConverterOptions](./) プラグインのデータコレクションに新しいデータソースを追加します。 |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | コンバータが入力ドキュメントのフォントを検索する追加フォルダーを指定します。デフォルトフォルダーは、OS が内部で使用するフォントを見つける標準フォントフォルダーです。 |
| [get_DataCollection](./get_datacollection/)() override | [PsConverterOptions](./) プラグインのデータコレクションを返します。 |
| virtual [get_Debug](./get_debug/)() | デバッグ情報を標準出力ストリームに出力するかどうかを指定します。 |
| virtual [get_Exceptions](./get_exceptions/)() | [SuppressErrors](../) が true の場合、抑制された変換エラーのリストを返します。 |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Quality カテゴリは画像の圧縮レベルを指定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。 |
| virtual [get_OperationName](./get_operationname/)() | 操作名を返します。 |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | 保存操作結果のために追加されたターゲットのコレクションを取得します。 |
| [get_SupressErrors](./get_supresserrors/)() const | エラーを抑制するかどうかを指定します。true の場合、抑制されたエラーは [Exceptions](../) リストに追加されます。false の場合、最初のエラーでプログラムが終了します。 |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | コンバータが入力ドキュメントのフォントを検索する追加フォルダーを指定します。デフォルトフォルダーは、OS が内部で使用するフォントを見つける標準フォントフォルダーです。 |
| virtual [set_Debug](./set_debug/)(bool) | デバッグ情報を標準出力ストリームに出力するかどうかを指定します。 |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | [SuppressErrors](../) が true の場合、抑制された変換エラーのリストを返します。 |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Quality カテゴリは画像の圧縮レベルを指定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。 |
| [set_SupressErrors](./set_supresserrors/)(bool) | エラーを抑制するかどうかを指定します。true の場合、抑制されたエラーは [Exceptions](../) リストに追加されます。false の場合、最初のエラーでプログラムが終了します。 |
## 参照

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
