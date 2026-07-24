---
title: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet クラス"
linktitle: "JobAccountingSheet"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::JobAccountingSheet クラス。ジョブの会計シートの出力方法を記述します。会計シートはデフォルトの PageMediaSize で、デフォルトの PageMediaType を使用して出力する必要があります。会計シートはジョブの残りの部分から分離されるべきです。つまり、JobDuplex、JobStaple、JobBinding などの仕上げや処理オプションには会計シートを含めてはなりません。会計シートは実装者の裁量でジョブの最初または最後のページとして配置される場合があります。C++で。"
type: docs
weight: 4400
url: /ja/cpp/aspose.page.xps.xpsmetadata/jobaccountingsheet/
---
## JobAccountingSheet class


ジョブの出力対象となる会計シートを記述します。会計シートはデフォルトの[PageMediaSize](../pagemediasize/) とデフォルトの[PageMediaType](../pagemediatype/) を使用して出力する必要があります。会計シートはジョブの残りの部分から分離されている必要があります。これは、**JobDuplex**、**JobStaple**、または**JobBinding** などの仕上げや処理オプションに会計シートが含まれないことを意味します。会計シートは実装者の裁量でジョブの最初または最後のページとして配置される場合があります。[https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet).

```cpp
class JobAccountingSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                           public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [JobAccountingSheetOption](./jobaccountingsheetoption/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [JobAccountingSheet](./jobaccountingsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobAccountingSheet::JobAccountingSheetOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
