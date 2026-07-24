---
title: "Clase Aspose::Page::XPS::XpsMetadata::Option"
linktitle: "Option"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::XPS::XpsMetadata::Option. La clase que implementa una PrintTicketOption común. La clase base para todas las opciones definidas por el esquema. Un elemento Option contiene todos los elementos Property y ScoredProperty asociados a esta opción. en C++."
type: docs
weight: 7600
url: /es/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


La clase que implementa una [PrintTicket](../printticket/) **[Option](./)** común. La clase base para todas las opciones definidas por el esquema. Un elemento [Option](./) contiene todos los elementos [Property](../property/) y [ScoredProperty](../scoredproperty/) asociados a esta opción. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Agrega una lista de elementos al final de la lista de ítems de esta opción. Cada uno debe ser una instancia de [ScoredProperty](../scoredproperty/) o [Property](../property/). |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Crea una nueva instancia de opción [PrintTicket](../printticket/). |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Crea una nueva instancia de opción [PrintTicket](../printticket/). |
| [Option](./option/)(System::SharedPtr\<Option\>) | Crea una instancia de opción clonada. |
## Ver también

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
