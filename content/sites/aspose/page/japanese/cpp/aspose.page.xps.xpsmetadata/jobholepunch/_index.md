---
title: "Aspose::Page::XPS::XpsMetadata::JobHolePunch クラス"
linktitle: "JobHolePunch"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::JobHolePunch クラス。出力の穴あけ特性を記述します。すべてのドキュメントが一緒に穴あけされます。JobHolePunch と DocumentHolePunch キーワードは相互に排他的です。PrintTicket または Print Capabilities ドキュメントで同時に指定してはいけません。（C++）。"
type: docs
weight: 5500
url: /ja/cpp/aspose.page.xps.xpsmetadata/jobholepunch/
---
## JobHolePunch class


出力の穴あけ特性を記述します。すべてのドキュメントが一緒に穴あけされます。[JobHolePunch](./) と [DocumentHolePunch](../documentholepunch/) キーワードは相互に排他的です。両方を同時に [PrintTicket](../printticket/) または Print Capabilities ドキュメントで指定すべきではありません。 [https://docs.microsoft.com/en-us/windows/win32/printdocs/jobholepunch](https://docs.microsoft.com/en-us/windows/win32/printdocs/jobholepunch)。

```cpp
class JobHolePunch : public Aspose::Page::XPS::XpsMetadata::HolePunch,
                     public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [JobHolePunch](./jobholepunch/)(const System::ArrayPtr\<System::SharedPtr\<HolePunch::HolePunchOption\>\>\&) | 新しいインスタンスを作成します。 |
## 参照

* Class [HolePunch](../holepunch/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
