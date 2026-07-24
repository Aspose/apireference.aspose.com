---
title: "Aspose::Page::Plugins::IOperationResult Klasse"
linktitle: "IOperationResult"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::Plugins::IOperationResult Klasse. Allgemeine Schnittstelle für Operationsergebnisse, die gemeinsame Methoden definiert, die ein konkretes Plugin-Operationsergebnis in C++ implementieren sollte."
type: docs
weight: 700
url: /de/cpp/aspose.page.plugins/ioperationresult/
---
## IOperationResult class


Allgemeine Schnittstelle für Operationsergebnisse, die gemeinsame Methoden definiert, die konkrete Plugin‑Operationsergebnisse implementieren sollten.

```cpp
class IOperationResult : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [get_Data](./get_data/)() | Liest Rohdaten. |
| virtual [get_IsByteArray](./get_isbytearray/)() | Gibt an, ob das Ergebnis ein Byte-Array ist. |
| virtual [get_IsFile](./get_isfile/)() | Gibt an, ob das Ergebnis ein Pfad zu einer Ausgabedatei ist. |
| virtual [get_IsStream](./get_isstream/)() | Gibt an, ob das Ergebnis ein Ausgabestream ist. |
| virtual [get_IsString](./get_isstring/)() | Gibt an, ob das Ergebnis ein Textstring ist. |
| virtual [ToFile](./tofile/)() | Versucht, das Ergebnis in die Datei zu konvertieren. |
| virtual [ToStream](./tostream/)() | Versucht, das Ergebnis in das Stream-Objekt zu konvertieren. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
