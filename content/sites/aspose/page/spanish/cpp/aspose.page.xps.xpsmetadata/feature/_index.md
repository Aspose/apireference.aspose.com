---
title: "Aspose::Page::XPS::XpsMetadata::Feature class"
linktitle: "Característica"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature class. La clase que encapsula una característica común del Print Schema. La clase base para todas las características definidas por el esquema. Un elemento Feature contiene una lista completa de los elementos Option y Property que describen completamente un atributo del dispositivo, una configuración de formato de trabajo u otra característica relevante.  en C++."
type: docs
weight: 2900
url: /es/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


La clase que encapsula una característica común de Print Schema. La clase base para todas las características definidas por el esquema. Un elemento **[Feature](./)** contiene una lista completa de los elementos [Option](../option/) y [Property](../property/) que describen completamente un atributo del dispositivo, una configuración de formato de trabajo o cualquier otra característica relevante. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Agrega una lista de elementos al final de la lista de ítems de esta característica. Cada uno debe ser un [Feature](./), una [Option](../option/) o una instancia de [Property](../property/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Crea una nueva instancia de característica [PrintTicket](../printticket/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Crea una nueva instancia de característica [PrintTicket](../printticket/). |
## Ver también

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
