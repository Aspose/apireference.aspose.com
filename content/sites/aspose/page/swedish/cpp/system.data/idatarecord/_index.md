---
title: "System::Data::IDataRecord-klass"
linktitle: "IDataRecord"
second_title: "Aspose.Page för C++"
description: "System::Data::IDataRecord-klass. Gränssnitt för att registrera med kolumner. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd denna pekare för att skicka den till funktioner som argument i C++."
type: docs
weight: 1300
url: /sv/cpp/system.data/idatarecord/
---
## IDataRecord class


Gränssnitt för att registrera med kolumner. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/) funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/) pekare och använd denna pekare för att skicka den till funktioner som argument.

```cpp
class IDataRecord : public virtual System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | RTTI-information. |
| virtual [GetName](./getname/)(const int32_t) | Hämtar namn på fältet på angiven position. |
| virtual [idx_get](./idx_get/)(const int32_t) | Hämtar värdet på angivet index. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
