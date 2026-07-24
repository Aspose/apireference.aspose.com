---
title: "Aspose::Page::XPS::XpsMetadata::ScoredProperty class"
linktitle: "ScoredProperty"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::ScoredProperty class. La clase que implementa una PrintTicketScoredProperty común. La clase base para todas las propiedades puntuadas definidas por el esquema. Un elemento ScoredProperty declara una propiedad que es intrínseca a una definición de Option. Tales propiedades deben compararse al evaluar qué tan de cerca una Option solicitada coincide con una Option admitida por el dispositivo.  en C++."
type: docs
weight: 14600
url: /es/cpp/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class


La clase que implementa una **[ScoredProperty](./)** común de [PrintTicket](../printticket/). La clase base para todas las propiedades puntuadas definidas por el esquema. Un elemento **[ScoredProperty](./)** declara una propiedad que es intrínseca a una definición de [Option](../option/). Tales propiedades deben compararse al evaluar qué tan de cerca una [Option](../option/) solicitada coincide con una [Option](../option/) admitida por el dispositivo. [https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty](https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty).

```cpp
class ScoredProperty : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                       public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                       public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<ParameterRef\>) | Crea una nueva instancia. |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IScoredPropertyItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
