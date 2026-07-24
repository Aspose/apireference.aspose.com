---
title: "Aspose::Page::XPS::XpsMetadata::ScoredProperty class"
linktitle: "ScoredProperty"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::XpsMetadata::ScoredProperty sınıfı. Ortak bir PrintTicketScoredProperty'i uygulayan sınıf. Tüm şema tanımlı skorlu özellikler için temel sınıf. Bir ScoredProperty öğesi, bir Option tanımına özgü bir özelliği bildirir. Bu tür özellikler, istenen Option'ın cihaz tarafından desteklenen Option ile ne kadar yakın eşleştiğini değerlendirirken karşılaştırılmalıdır.  C++'da."
type: docs
weight: 14600
url: /tr/cpp/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class


Ortak bir [PrintTicket](../printticket/)**[ScoredProperty](./)** uygulayan sınıf. Tüm şema tanımlı skorlu özellikler için temel sınıf. Bir **[ScoredProperty](./)** öğesi, bir [Option](../option/) tanımına özgü bir özelliği bildirir. Bu tür özellikler, istenen [Option](../option/) ile cihaz tarafından desteklenen [Option](../option/) arasındaki uyumu değerlendirirken karşılaştırılmalıdır. [https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty](https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty).

```cpp
class ScoredProperty : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                       public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                       public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<ParameterRef\>) | Yeni bir örnek oluşturur. |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IScoredPropertyItem\>\>\&) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
