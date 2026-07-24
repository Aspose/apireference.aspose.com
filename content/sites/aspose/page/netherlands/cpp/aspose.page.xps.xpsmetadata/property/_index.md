---
title: "Aspose::Page::XPS::XpsMetadata::Property class"
linktitle: "Eigenschap"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::Property class. De klasse die een algemene PrintTicketProperty implementeert. De basisklasse voor alle schema‑gedefinieerde eigenschappen. Een Property‑element declareert een apparaat, taakopmaak of andere relevante eigenschap waarvan de naam wordt opgegeven door het name‑attribuut. Een Value‑element wordt gebruikt om een waarde toe te wijzen aan de Property. Een Property kan complex zijn en mogelijk meerdere subeigenschappen bevatten. Subeigenschappen worden ook weergegeven door Property‑elementen.  in C++."
type: docs
weight: 14300
url: /nl/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


De klasse die een algemene [PrintTicket](../printticket/)**[Property](./)** implementeert. De basisklasse voor alle schema‑gedefinieerde eigenschappen. Een **[Property](./)**‑element declareert een apparaat, taakopmaak of andere relevante eigenschap waarvan de naam wordt opgegeven door het name‑attribuut. Een [Value](../value/)‑element wordt gebruikt om een waarde toe te wijzen aan de **[Property](./)**. Een **[Property](./)** kan complex zijn en mogelijk meerdere subeigenschappen bevatten. Subeigenschappen worden ook weergegeven door **[Property](./)**‑elementen. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Maakt een nieuw exemplaar aan. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Maakt een nieuw exemplaar aan. |
## Zie ook

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
