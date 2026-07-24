---
title: "Aspose::Page::XPS::XpsMetadata::Option class"
linktitle: "Option"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::Option class. Kelas yang mengimplementasikan PrintTicketOption umum. Kelas dasar untuk semua opsi yang didefinisikan dalam skema. Elemen Option berisi semua elemen Property dan ScoredProperty yang terkait dengan opsi ini. dalam C++."
type: docs
weight: 7600
url: /id/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


Kelas yang mengimplementasikan [PrintTicket](../printticket/) **[Option](./)**. Kelas dasar untuk semua opsi yang didefinisikan dalam skema. Elemen [Option](./) berisi semua elemen [Property](../property/) dan [ScoredProperty](../scoredproperty/) yang terkait dengan opsi ini. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Menambahkan daftar item ke akhir daftar item opsi ini. Setiap item harus berupa instance [ScoredProperty](../scoredproperty/) atau [Property](../property/). |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Membuat instance opsi [PrintTicket](../printticket/) baru. |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Membuat instance opsi [PrintTicket](../printticket/) baru. |
| [Option](./option/)(System::SharedPtr\<Option\>) | Membuat instance opsi klon. |
## Lihat Juga

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
