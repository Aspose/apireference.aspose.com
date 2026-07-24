---
title: "Aspose::Page::Plugins::XpsConverterOptions class"
linktitle: "XpsConverterOptions"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::Plugins::XpsConverterOptions クラス。C++ の XpsConverter プラグイン用オプションを表します。"
type: docs
weight: 2000
url: /ja/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


[XpsConverter](../xpsconverter/) プラグイン用オプションを表します。

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | [XpsConverter](../xpsconverter/) プラグインのデータコレクションに新しいデータソースを追加します。 |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | [XpsConverterOptions](./) プラグインのデータコレクションに新しいデータソースを追加します。 |
| [get_DataCollection](./get_datacollection/)() override | [XpsConverterOptions](./) プラグインのデータコレクションを返します。 |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Quality カテゴリは画像の圧縮レベルを指定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。 |
| virtual [get_OperationName](./get_operationname/)() | 操作名を返します。 |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | 保存操作結果のために追加されたターゲットのコレクションを取得します。 |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Quality カテゴリは画像の圧縮レベルを指定します。利用可能な値は 0 から 100 です。指定した数値が小さいほど圧縮率が高くなり、画像の品質は低くなります。0 の場合は最低品質の画像になり、100 の場合は最高品質になります。 |
## 参照

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
