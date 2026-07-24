---
title: "Aspose::Page::IMultiPageDevice klasse"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::IMultiPageDevice klasse. Deze interface bevat methoden voor het manipuleren van een apparaat met meerdere pagina's in C++."
type: docs
weight: 800
url: /nl/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


Deze interface bevat methoden voor het manipuleren van een multi-paged apparaat.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [ClosePage](./closepage/)() | Voert de noodzakelijke voorbereiding van het apparaat uit nadat de pagina is gerenderd. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | Huidig paginanummer. |
| virtual [InitPageNumbers](./initpagenumbers/)() | Initialiseert het aantal pagina's voor uitvoer. |
| virtual [OpenPage](./openpage/)(System::String) | Voert de noodzakelijke voorbereiding van het apparaat uit vóór het renderen van een pagina. |
| virtual [OpenPage](./openpage/)(float, float) | Voert de noodzakelijke voorbereiding van het apparaat uit vóór het renderen van elke pagina. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | Werk de pagina-parameters bij van een ander meer-pagina-apparaat. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
