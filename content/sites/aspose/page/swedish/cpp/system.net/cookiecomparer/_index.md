---
title: "System::Net::CookieComparer‑klass"
linktitle: "CookieComparer"
second_title: "Aspose.Page för C++"
description: "System::Net::CookieComparer‑klass. Används för att jämföra instanser av klassen Cookie. Objekt av denna klass bör endast allokeras med funktionen System::MakeObject(). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller assert‑fel. Omslut alltid denna klass i en System::SmartPtr‑pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 300
url: /sv/cpp/system.net/cookiecomparer/
---
## CookieComparer class


Används för att jämföra instanser av klassen [Cookie](../cookie/). Objekt av denna klass bör endast allokeras med funktionen [System::MakeObject()](../../system/makeobject/). Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller assert‑fel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)‑pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Jämför de angivna objekten. |
| static [get_Instance](./get_instance/)() | RTTI-information. |
## Se även

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
