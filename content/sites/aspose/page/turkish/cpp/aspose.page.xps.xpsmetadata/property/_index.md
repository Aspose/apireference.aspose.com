---
title: "Aspose::Page::XPS::XpsMetadata::Property sınıfı"
linktitle: "Özellik"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::Property sınıfı. Ortak bir PrintTicketProperty'i uygulayan sınıf. Tüm şema tanımlı özellikler için temel sınıf. Bir Property öğesi, adı adı özniteliğiyle verilen bir cihaz, iş biçimlendirme veya diğer ilgili özelliği bildirir. Bir Value öğesi, Property'ye bir değer atamak için kullanılır. Bir Property karmaşık olabilir ve birden fazla alt özelliği içerebilir. Alt özellikler de Property öğeleriyle temsil edilir.  C++'ta."
type: docs
weight: 14300
url: /tr/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


Ortak bir [PrintTicket](../printticket/)**[Property](./)** uygulayan sınıf. Tüm şema tanımlı özellikler için temel sınıf. Bir **[Property](./)** öğesi, adı adı özniteliğiyle verilen bir cihaz, iş biçimlendirme veya diğer ilgili özelliği bildirir. Bir [Value](../value/) öğesi, **[Property](./)**'ye bir değer atamak için kullanılır. Bir **[Property](./)** karmaşık olabilir ve birden fazla alt özellik içerebilir. Alt özellikler de **[Property](./)** öğeleriyle temsil edilir. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Yeni bir örnek oluşturur. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
