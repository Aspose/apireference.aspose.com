---
title: "System::Diagnostics::StackFrame klasse"
linktitle: "StackFrame"
second_title: "Aspose.Page voor C++"
description: "System::Diagnostics::StackFrame klasse. Haalt informatie op over één stackframe. Alleen MSVS. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 500
url: /nl/cpp/system.diagnostics/stackframe/
---
## StackFrame class


Haalt informatie op over één stackframe. Alleen MSVS. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class StackFrame : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | Haalt het colnum‑nummer op. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | Haalt het regelnummer op. |
| virtual [GetFileName](./getfilename/)() | Haalt de bestandsnaam op. |
| [GetMethod](./getmethod/)() | Haalt methodeninformatie op. |
| [operator=](./operator=/)(const StackFrame\&) const | Geen wijziging. |
| [StackFrame](./stackframe/)(int) | Maakt een stackframe aan op de huidige stackoffset. |
| [StackFrame](./stackframe/)(const StackFrame\&) | Geen kopiëren. |
| virtual [~StackFrame](./~stackframe/)() | Destructor. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)
