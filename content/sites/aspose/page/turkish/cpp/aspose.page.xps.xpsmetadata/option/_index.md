---
title: "Aspose::Page::XPS::XpsMetadata::Option sınıfı"
linktitle: "Option"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::Option sınıfı. Ortak bir PrintTicketOption'ı uygulayan sınıf. Tüm şema tanımlı seçenekler için temel sınıf. Bir Option öğesi, bu seçenekle ilişkili tüm Property ve ScoredProperty öğelerini içerir. C++ içinde."
type: docs
weight: 7600
url: /tr/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


Ortak bir [PrintTicket](../printticket/)**[Option](./)** uygulayan sınıf. Tüm şema tanımlı seçenekler için temel sınıf. Bir [Option](./) öğesi, bu seçenekle ilişkili tüm [Property](../property/) ve [ScoredProperty](../scoredproperty/) öğelerini içerir. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Bu seçeneğin öğe listesine bir öğe listesi ekler. Her biri bir [ScoredProperty](../scoredproperty/) veya [Property](../property/) örneği olmalıdır. |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Yeni bir [PrintTicket](../printticket/) seçeneği örneği oluşturur. |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Yeni bir [PrintTicket](../printticket/) seçeneği örneği oluşturur. |
| [Option](./option/)(System::SharedPtr\<Option\>) | Bir kopya seçenek örneği oluşturur. |
## Ayrıca Bakınız

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
