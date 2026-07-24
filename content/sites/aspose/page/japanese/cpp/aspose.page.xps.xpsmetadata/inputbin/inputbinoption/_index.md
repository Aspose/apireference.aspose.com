---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption クラス。C++ で JobInputBin、DocumentInputBin、PageInputBin の機能オプションを説明します。"
type: docs
weight: 700
url: /ja/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


[JobInputBin](../../jobinputbin/)、[DocumentInputBin](../../documentinputbin/) および [PageInputBin](../../pageinputbin/) の機能オプションを説明します。

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | オプションに [IInputBinOptionItem](../iinputbinoptionitem/) インスタンスの配列を追加します。 |
| [Clone](./clone/)() | このオプションインスタンスをクローンします。 |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | 新しいインスタンスを作成します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [AutoSelect](./autoselect/) | デバイスは構成に基づいて最適なオプションを自動的に選択します。 |
| static [AutoSheetFeeder](./autosheetfeeder/) | インクジェットプリンター用のデバイス入力トレイです。 |
| static [Cassette](./cassette/) | 給紙トレイがカセットであることを指定します。 |
| static [Manual](./manual/) | デフォルトの手動給紙トレイを指定します。 |
| static [Tractor](./tractor/) | 給紙トレイがトラクタであることを指定します。 |
## 参照

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
