---
title: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack::CoverBackOption クラス"
linktitle: "CoverBackOption"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::DocumentCoverBack::CoverBackOption クラス。C++ で DocumentCoverBack 機能オプションを説明します。"
type: docs
weight: 200
url: /ja/cpp/aspose.page.xps.xpsmetadata/documentcoverback/coverbackoption/
---
## CoverBackOption class


[DocumentCoverBack](../) 機能オプションを説明します。

```cpp
class CoverBackOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## フィールド

| フィールド | 説明 |
| --- | --- |
| static [BlankCover](./blankcover/) | 空白のカバーシートを印刷するように指定します。 |
| static [NoCover](./nocover/) | カバーが出力されないように指定します。 |
| static [PrintBack](./printback/) | "CoverBackSource" で示されたカバーをカバーシートの裏面に印刷すべきことを指定します。もし [DocumentCoverBackSource](../../documentcoverbacksource/)[ParameterInit](../../parameterinit/) 要素が指定されていない場合、この [Option](../../option/) は無視されるべきです。 |
| static [PrintBoth](./printboth/) | "CoverBackSource" で示されたカバーはカバーシートの両面のいずれかに印刷される可能性があることを指定します。もし [DocumentCoverBackSource](../../documentcoverbacksource/)[ParameterInit](../../parameterinit/) 要素が指定されていない場合、この [Option](../../option/) は無視されるべきです。 |
| static [PrintFront](./printfront/) | "CoverBackSource" で示されたカバーをカバーシートの表面に印刷すべきことを指定します。もし [DocumentCoverBackSource](../../documentcoverbacksource/)[ParameterInit](../../parameterinit/) 要素が指定されていない場合、この [Option](../../option/) は無視されるべきです。 |
## 参照

* Class [Option](../../option/)
* Class [DocumentCoverBack](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
