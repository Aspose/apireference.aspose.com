---
title: "Aspose::Page::XPS::XpsMetadata::Property class"
linktitle: "Eigenschaft"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::Property class. Die Klasse, die ein gemeinsames PrintTicketProperty implementiert. Die Basisklasse für alle schema‑definierten Eigenschaften. Ein Property‑Element deklariert ein Gerät, eine Job‑Formatierung oder eine andere relevante Eigenschaft, deren Name durch das Namensattribut angegeben wird. Ein Value‑Element wird verwendet, um der Property einen Wert zuzuweisen. Eine Property kann komplex sein und mehrere Untereigenschaften enthalten. Untereigenschaften werden ebenfalls durch Property‑Elemente dargestellt.  in C++."
type: docs
weight: 14300
url: /de/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


Die Klasse, die ein gemeinsames [PrintTicket](../printticket/)**[Property](./)** implementiert. Die Basisklasse für alle schema‑definierten Eigenschaften. Ein **[Property](./)**‑Element deklariert ein Gerät, eine Job‑Formatierung oder eine andere relevante Eigenschaft, deren Name durch das Namensattribut angegeben wird. Ein [Value](../value/)‑Element wird verwendet, um dem **[Property](./)** einen Wert zuzuweisen. Ein **[Property](./)** kann komplex sein und mehrere Untereigenschaften enthalten. Untereigenschaften werden ebenfalls durch **[Property](./)**‑Elemente dargestellt. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Erstellt eine neue Instanz. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
