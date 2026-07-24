---
title: "Aspose::Page::XPS::XpsMetadata::Property kelas"
linktitle: "Properti"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsMetadata::Property kelas. Kelas yang mengimplementasikan PrintTicketProperty umum. Kelas dasar untuk semua properti yang didefinisikan dalam skema. Elemen Property mendeklarasikan perangkat, format pekerjaan, atau properti relevan lainnya yang namanya diberikan oleh atribut name. Elemen Value digunakan untuk menetapkan nilai ke Property. Sebuah Property dapat bersifat kompleks, mungkin berisi beberapa subproperti. Subproperti juga direpresentasikan oleh elemen Property. dalam C++."
type: docs
weight: 14300
url: /id/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


Kelas yang mengimplementasikan **[Property](./)** umum dari [PrintTicket](../printticket/). Kelas dasar untuk semua properti yang didefinisikan dalam skema. Sebuah elemen **[Property](./)** mendeklarasikan perangkat, format pekerjaan, atau properti relevan lainnya yang namanya diberikan oleh atribut name. Sebuah elemen [Value](../value/) digunakan untuk menetapkan nilai ke **[Property](./)**. Sebuah **[Property](./)** dapat bersifat kompleks, mungkin berisi beberapa subproperti. Subproperti juga direpresentasikan oleh elemen **[Property](./)**. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Membuat instance baru. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Membuat instance baru. |
## Lihat Juga

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
