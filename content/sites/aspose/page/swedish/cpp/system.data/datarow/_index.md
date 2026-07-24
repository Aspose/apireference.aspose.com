---
title: "System::Data::DataRow-klass"
linktitle: "DataRow"
second_title: "Aspose.Page för C++"
description: "System::Data::DataRow-klass. Rad i datamängden. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 500
url: /sv/cpp/system.data/datarow/
---
## DataRow class


Rad i datamängden. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class DataRow : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Table](./get_table/)() | Hämtar tabellraden som den tillhör. |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | Hämtar rader som anses vara barn genom specificerad relation. |
| [idx_get](./idx_get/)(const int32_t) | RTTI-information. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
