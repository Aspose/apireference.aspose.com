---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class. Definiert die Basisklasse für Argumente verschiedener Vor‑Speicher‑Ereignisse in C++."
type: docs
weight: 200
url: /de/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Definiert die Basisklasse für Argumente verschiedener Vor-Speicher-Ereignisse.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Änderungs‑API. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | Die aktuelle absolute Seitennummer über alle Dokumente im [XPS](../../aspose.page.xps/) Paket. |
| [get_DocumentNumber](./get_documentnumber/)() const | Die aktuelle Dokumentennummer im [XPS](../../aspose.page.xps/) Paket. |
| [get_ElementAPI](./get_elementapi/)() const | Ruft die Änderungs‑API des Elements ab, das gespeichert werden soll. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | Die aktuelle Ausgabennummer. Sie unterscheidet sich von **AbsolutePageNumber**, wenn die Speicheroption **PageNumbers** angegeben ist. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | Die aktuelle Seitennummer relativ zum aktuellen Dokument im [XPS](../../aspose.page.xps/) Paket. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Vorlagenargument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den schwachen Modus. |

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
