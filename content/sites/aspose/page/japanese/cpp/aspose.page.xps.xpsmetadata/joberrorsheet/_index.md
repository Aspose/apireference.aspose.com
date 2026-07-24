---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet クラス"
linktitle: "JobErrorSheet"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet クラス。エラーシートの出力を記述します。ジョブ全体で単一のエラーシートが使用されます。エラーシートはデフォルトの PageMediaSize 上に、デフォルトの PageMediaType を使用して出力されるべきです。エラーシートはジョブの残りの部分から分離される必要があります。つまり、JobDuplex、JobStaple、または JobBinding などの仕上げや処理オプションにはエラーシートを含めてはいけません。エラーシートはジョブの最終シートとして出力されるべきです。（C++）。"
type: docs
weight: 5300
url: /ja/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


エラーシートの出力を記述します。ジョブ全体で単一のエラーシートが使用されます。エラーシートはデフォルトの [PageMediaSize](../pagemediasize/) 上に、デフォルトの [PageMediaType](../pagemediatype/) を使用して出力されるべきです。エラーシートはジョブの残りの部分から分離される必要があります。つまり、**JobDuplex**、**JobStaple**、または **JobBinding** などの仕上げや処理オプションにはエラーシートを含めてはいけません。エラーシートはジョブの最終シートとして出力されるべきです。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet)。

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
