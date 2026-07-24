---
title: "Kelas Aspose::Page::XPS::XpsMetadata::Feature"
linktitle: "Fitur"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature class. Kelas yang mengenkapsulasi fitur Print Schema umum. Kelas dasar untuk semua fitur yang didefinisikan oleh skema. Sebuah elemen Feature berisi daftar lengkap elemen Option dan Property yang sepenuhnya menggambarkan atribut perangkat, pengaturan format pekerjaan, atau karakteristik relevan lainnya. dalam C++."
type: docs
weight: 2900
url: /id/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


Kelas yang mengenkapsulasi fitur Print Schema umum. Kelas dasar untuk semua fitur yang didefinisikan oleh skema. Sebuah elemen **[Feature](./)** berisi daftar lengkap elemen [Option](../option/) dan [Property](../property/) yang sepenuhnya menggambarkan atribut perangkat, pengaturan format pekerjaan, atau karakteristik relevan lainnya. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Menambahkan daftar item ke akhir daftar item fitur ini. Setiap item harus berupa sebuah instance [Feature](./), [Option](../option/), atau [Property](../property/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Membuat sebuah instance fitur [PrintTicket](../printticket/) baru. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Membuat sebuah instance fitur [PrintTicket](../printticket/) baru. |
## Lihat Juga

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
