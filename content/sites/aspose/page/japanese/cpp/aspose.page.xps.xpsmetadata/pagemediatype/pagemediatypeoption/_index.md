---
title: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption クラス"
linktitle: "PageMediaTypeOption"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageMediaType::PageMediaTypeOption クラス。C++ で PageMediaType の機能オプションを説明します。"
type: docs
weight: 700
url: /ja/cpp/aspose.page.xps.xpsmetadata/pagemediatype/pagemediatypeoption/
---
## PageMediaTypeOption class


[PageMediaType](../) の機能オプションを説明します。

```cpp
class PageMediaTypeOption : public Aspose::Page::XPS::XpsMetadata::Option,
                            public Aspose::Page::XPS::XpsMetadata::PageMediaType::IPageMediaTypeItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | オプションに [IPageMediaTypeOptionItem](../ipagemediatypeoptionitem/) インスタンスの配列を追加します。 |
| [Clone](./clone/)() | このオプションインスタンスをクローンします。クローン用コンストラクタへのショートカットです。 |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<PageMediaType::IPageMediaTypeOptionItem\>\>\&) | 新しいインスタンスを作成します。 |
| [PageMediaTypeOption](./pagemediatypeoption/)(System::SharedPtr\<PageMediaType::PageMediaTypeOption\>) | このオプションインスタンスをクローンします。 |
| [SetWeight](./setweight/)(int32_t) | **Weight** のスコア付きプロパティ値を設定します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Archival](./archival/) | アーカイブ品質のメディアを指定します。 |
| static [AutoSelect](./autoselect/) | Media が自動的に選択されることを指定します。 |
| static [BackPrintFilm](./backprintfilm/) | 特殊な裏面印刷フィルムメディアを指定します。 |
| static [Bond](./bond/) | 標準的なボンドメディアを指定します。 |
| static [CardStock](./cardstock/) | 標準的なカードストックメディアを指定します。 |
| static [Continous](./continous/) | 連続供給メディアを指定します。 |
| static [EnvelopePlain](./envelopeplain/) | 標準的な封筒メディアを指定します。 |
| static [EnvelopeWindow](./envelopewindow/) | 窓付き封筒メディアを指定します。 |
| static [Fabric](./fabric/) | 布製メディアを指定します。 |
| static [HighResolution](./highresolution/) | 特殊な高解像度メディアを指定します。 |
| static [Label](./label/) | ラベルメディアを指定します。 |
| static [MultiLayerForm](./multilayerform/) | 添付された多部構成フォームメディアを指定します。 |
| static [MultiPartForm](./multipartform/) | 別々の多部構成フォームメディアを指定します。 |
| static [None](./none/) | 不明または未掲載のメディアを指定します。 |
| static [Photographic](./photographic/) | 標準的な写真メディアを指定します。 |
| static [PhotographicFilm](./photographicfilm/) | フィルム写真メディアを指定します。 |
| static [PhotographicGlossy](./photographicglossy/) | 光沢写真メディアを指定します。 |
| static [PhotographicHighGloss](./photographichighgloss/) | 高光沢写真メディアを指定します。 |
| static [PhotographicMatte](./photographicmatte/) | マット写真メディアを指定します。 |
| static [PhotographicSatin](./photographicsatin/) | サテン写真メディアを指定します。 |
| static [PhotographicSemiGloss](./photographicsemigloss/) | セミ光沢写真メディアを指定します。 |
| static [Plain](./plain/) | 標準的な紙メディアを指定します。 |
| static [Screen](./screen/) | 連続形式で出力ディスプレイに出力することを指定します。 |
| static [ScreenPaged](./screenpaged/) | ページ形式で出力ディスプレイに出力することを指定します。 |
| static [Stationary](./stationary/) | 特殊な文房具メディアを指定します。 |
| static [TabStockFull](./tabstockfull/) | 事前にカットされていないタブストックメディア（シングルタブ）を指定します。 |
| static [TabStockPreCut](./tabstockprecut/) | 事前にカットされたタブストックメディア（複数タブ）を指定します。 |
| static [Transparency](./transparency/) | 透過メディアを指定します。 |
| static [TShirtTransfer](./tshirttransfer/) | 特殊なTシャツ転写メディアを指定します。 |
## 参照

* Class [Option](../../option/)
* Class [IPageMediaTypeItem](../ipagemediatypeitem/)
* Class [PageMediaType](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
