---
title: "Aspose::Page::IMultiPageDevice klass"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::IMultiPageDevice klass. Detta gränssnitt innehåller metoder för att manipulera en flersidig enhet i C++."
type: docs
weight: 800
url: /sv/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


Detta gränssnitt innehåller metoder för att manipulera en flersidig enhet.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [ClosePage](./closepage/)() | Utför nödvändig förberedelse av enheten efter att sidan har renderats. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | Aktuellt sidnummer. |
| virtual [InitPageNumbers](./initpagenumbers/)() | Initierar antal sidor att skriva ut. |
| virtual [OpenPage](./openpage/)(System::String) | Utför nödvändig förberedelse av enheten innan sidrendering. |
| virtual [OpenPage](./openpage/)(float, float) | Utför nödvändig förberedelse av enheten innan varje sidrendering. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | Uppdaterar sidparametrar från en annan flersidig enhet. |
## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
