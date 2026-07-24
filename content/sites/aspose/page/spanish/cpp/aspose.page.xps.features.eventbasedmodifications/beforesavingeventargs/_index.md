---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs clase"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs clase. Define la clase base para los argumentos de varios eventos de guardado previo en C++."
type: docs
weight: 200
url: /es/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Define la clase base para los argumentos de varios eventos antes de guardar.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de API de modificación. |
## Métodos

| Método | Descripción |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | El número de página absoluto actual en todos los documentos dentro del paquete [XPS](../../aspose.page.xps/). |
| [get_DocumentNumber](./get_documentnumber/)() const | El número de documento actual dentro del paquete [XPS](../../aspose.page.xps/). |
| [get_ElementAPI](./get_elementapi/)() const | Obtiene la API de modificación del elemento que está a punto de guardarse. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | El número de salida actual. Difiere de **AbsolutePageNumber** si se especifica la opción de guardado **PageNumbers**. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | El número de página actual relativo al documento actual dentro del paquete [XPS](../../aspose.page.xps/). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Establece el n‑ésimo argumento de plantilla como un puntero débil (en lugar de compartido). Permite cambiar los punteros en contenedores al modo débil. |

## Ver también

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
