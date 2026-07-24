---
title: "Aspose::Page::XPS::XpsMetadata::Feature class"
linktitle: "Özellik"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature sınıfı. Ortak bir Print Schema özelliğini kapsayan sınıf. Tüm şema tanımlı özellikler için temel sınıf. Bir Feature öğesi, bir cihaz özelliğini, iş biçimlendirme ayarını veya diğer ilgili karakteristikleri tam olarak tanımlayan Option ve Property öğelerinin tam listesini içerir.  C++'da."
type: docs
weight: 2900
url: /tr/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


Ortak bir Print Schema özelliğini kapsayan sınıf. Şema tanımlı tüm özellikler için temel sınıf. Bir **[Feature](./)** öğesi, bir cihaz özniteliğini, iş biçimlendirme ayarını veya diğer ilgili özelliği tam olarak tanımlayan [Option](../option/) ve [Property](../property/) öğelerinin tam listesini içerir. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Bu özelliğin öğe listesine bir öğe listesi ekler. Her biri bir [Feature](./), bir [Option](../option/) veya bir [Property](../property/) örneği olmalıdır. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Yeni bir [PrintTicket](../printticket/) özelliği örneği oluşturur. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Yeni bir [PrintTicket](../printticket/) özelliği örneği oluşturur. |
## Ayrıca Bakınız

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
