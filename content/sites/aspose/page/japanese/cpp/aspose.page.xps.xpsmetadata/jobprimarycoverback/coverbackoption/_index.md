---
title: "Aspose::Page::XPS::XpsMetadata::JobPrimaryCoverBack::CoverBackOption クラス"
linktitle: "CoverBackOption"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::JobPrimaryCoverBack::CoverBackOption クラス。C++ で JobPrimaryCoverBack 機能オプションを記述します。"
type: docs
weight: 200
url: /ja/cpp/aspose.page.xps.xpsmetadata/jobprimarycoverback/coverbackoption/
---
## CoverBackOption class


[JobPrimaryCoverBack](../) の機能オプションを記述します。

```cpp
class CoverBackOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## フィールド

| フィールド | 説明 |
| --- | --- |
| static [BlankCover](./blankcover/) | 空白のカバーシートを印刷するように指定します。 |
| static [NoCover](./nocover/) | カバーが出力されないように指定します。 |
| static [PrintBack](./printback/) | "CoverBackSource" で示されたカバーをカバーシートの裏面に印刷するように指定します。もし [JobPrimaryCoverBackSource](../../jobprimarycoverbacksource/)[ParameterInit](../../parameterinit/) 要素が指定されていない場合、この [Option](../../option/) は無視されるべきです。 |
| static [PrintBoth](./printboth/) | CoverBackSourceで示されたカバーは、カバーシートの両面に印刷される可能性があることを指定します。もし[JobPrimaryCoverBackSource](../../jobprimarycoverbacksource/)[ParameterInit](../../parameterinit/)要素が指定されていない場合、この[Option](../../option/)は無視されるべきです。 |
| static [PrintFront](./printfront/) | CoverBackSourceで示されたカバーは、カバーシートの表面に印刷されることを指定します。もし[JobPrimaryCoverBackSource](../../jobprimarycoverbacksource/)[ParameterInit](../../parameterinit/)要素が指定されていない場合、この[Option](../../option/)は無視されるべきです。 |
## 参照

* Class [Option](../../option/)
* Class [JobPrimaryCoverBack](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
