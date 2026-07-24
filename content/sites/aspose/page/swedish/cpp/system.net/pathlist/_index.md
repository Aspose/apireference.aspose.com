---
title: "System::Net::PathList klass"
linktitle: "PathList"
second_title: "Aspose.Page för C++"
description: "System::Net::PathList klass. Representerar listan av CookieCollection-klassens instanser. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 3000
url: /sv/cpp/system.net/pathlist/
---
## PathList class


Representerar listan av [CookieCollection](../cookiecollection/) klassens instanser. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class PathList : public System::Object
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| static [Create](./create/)() | Skapar en ny instans. |
| [get_Count](./get_count/)() const | Returnerar antalet objekt. |
| [get_SyncRoot](./get_syncroot/)() const | Returnerar objektet genom vilket samlingen synkroniseras. |
| [GetCookiesCount](./getcookiescount/)() | Returnerar antalet kakor för alla samlingsobjekt. |
| [GetEnumerator](./getenumerator/)() | Returnerar enumeratorn för den aktuella samlingen. |
| [idx_get](./idx_get/)(String) | Hämtar kakssamlingen enligt angiven sökväg. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Ställer in kakssamlingen enligt angiven sökväg. |
## Se även

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
