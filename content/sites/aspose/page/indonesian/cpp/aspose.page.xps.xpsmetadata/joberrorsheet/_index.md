---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet kelas"
linktitle: "JobErrorSheet"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet kelas. Menjelaskan output lembar kesalahan. Seluruh pekerjaan akan memiliki satu lembar kesalahan. Lembar kesalahan harus dikeluarkan pada PageMediaSize default dan menggunakan PageMediaType default. Lembar kesalahan harus terisolasi dari sisa pekerjaan. Ini berarti bahwa opsi penyelesaian atau pemrosesan apa pun (seperti JobDuplex, JobStaple, atau JobBinding) tidak boleh menyertakan lembar kesalahan. Lembar kesalahan harus muncul sebagai lembar terakhir dari pekerjaan. dalam C++."
type: docs
weight: 5300
url: /id/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


Menjelaskan output lembar kesalahan. Seluruh pekerjaan akan memiliki satu lembar kesalahan. Lembar kesalahan harus dikeluarkan pada [PageMediaSize](../pagemediasize/) default dan menggunakan [PageMediaType](../pagemediatype/) default. Lembar kesalahan harus dipisahkan dari sisa pekerjaan. Ini berarti bahwa opsi penyelesaian atau pemrosesan apa pun (seperti **JobDuplex**, **JobStaple**, atau **JobBinding**) tidak boleh menyertakan lembar kesalahan. Lembar kesalahan harus muncul sebagai lembar terakhir dari pekerjaan. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
