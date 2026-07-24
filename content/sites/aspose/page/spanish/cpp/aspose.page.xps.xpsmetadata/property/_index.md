---
title: "Clase Aspose::Page::XPS::XpsMetadata::Property"
linktitle: "Property"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::Property class. La clase que implementa una PrintTicketProperty común. La clase base para todas las propiedades definidas por el esquema. Un elemento Property declara un dispositivo, formato de trabajo u otra propiedad relevante cuyo nombre se indica en su atributo name. Un elemento Value se usa para asignar un valor al Property. Un Property puede ser complejo, posiblemente conteniendo múltiples subpropiedades. Las subpropiedades también se representan mediante elementos Property.  en C++."
type: docs
weight: 14300
url: /es/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


La clase que implementa una **[Property](./)** común de [PrintTicket](../printticket/). La clase base para todas las propiedades definidas por el esquema. Un elemento **[Property](./)** declara un dispositivo, formato de trabajo u otra propiedad relevante cuyo nombre se indica en su atributo name. Un elemento [Value](../value/) se usa para asignar un valor al **[Property](./)**. Un **[Property](./)** puede ser complejo, posiblemente conteniendo múltiples subpropiedades. Las subpropiedades también se representan mediante elementos **[Property](./)**. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Crea una nueva instancia. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Crea una nueva instancia. |
## Ver también

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
