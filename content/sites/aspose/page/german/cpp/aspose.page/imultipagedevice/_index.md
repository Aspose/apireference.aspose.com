---
title: "Klasse Aspose::Page::IMultiPageDevice"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::IMultiPageDevice Klasse. Dieses Interface enthält Methoden zur Manipulation von mehrseitigen Geräten in C++."
type: docs
weight: 800
url: /de/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


Dieses Interface enthält Methoden zur Manipulation eines mehrseitigen Geräts.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [ClosePage](./closepage/)() | Führt die notwendige Vorbereitung des Geräts durch, nachdem die Seite gerendert wurde. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | Aktuelle Seitenzahl. |
| virtual [InitPageNumbers](./initpagenumbers/)() | Initialisiert die Anzahl der auszugebenden Seiten. |
| virtual [OpenPage](./openpage/)(System::String) | Führt die notwendige Vorbereitung des Geräts vor der Seitenrenderung durch. |
| virtual [OpenPage](./openpage/)(float, float) | Führt die notwendige Vorbereitung des Geräts vor jeder Seitenrenderung durch. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | Aktualisiert Seitenparameter von einem anderen mehrseitigen Gerät. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
