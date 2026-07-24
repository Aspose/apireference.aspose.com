---
title: "Aspose::Page::XPS::ApsLoadOptions クラス"
linktitle: "ApsLoadOptions"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::ApsLoadOptions クラス。C++ における APS ドキュメントの読み込みオプションです。"
type: docs
weight: 100
url: /ja/cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


APS ドキュメントの読み込みオプション。

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | オプションの新しいインスタンスを作成します。 |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | 0 から 255 の整数値で、この値未満のアルファ値を持つ画像のピクセルは完全に透明とみなされます。PostScript は透明性をサポートしていませんが、カラー画像の上に明示的なマスクを適用でき、一部のピクセルは完全に不透明に、他のピクセルは完全に透明に設定できます。透明しきい値は、元画像と PostScript の結果との最良の類似性を見つけるために使用されます。デフォルト値は 255 です。 |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | 0 から 255 の整数値で、この値未満のアルファ値を持つ画像のピクセルは完全に透明とみなされます。PostScript は透明性をサポートしていませんが、カラー画像の上に明示的なマスクを適用でき、一部のピクセルは完全に不透明に、他のピクセルは完全に透明に設定できます。透明しきい値は、元画像と PostScript の結果との最良の類似性を見つけるために使用されます。デフォルト値は 255 です。 |
## 参照

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
