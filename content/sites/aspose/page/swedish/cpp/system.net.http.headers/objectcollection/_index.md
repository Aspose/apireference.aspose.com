---
title: "System::Net::Http::Headers::ObjectCollection class"
linktitle: "ObjectCollection"
second_title: "Aspose.Page för C++"
description: "System::Net::Http::Headers::ObjectCollection-klass. Representerar samlingen av objekten i C++."
type: docs
weight: 1600
url: /sv/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


Representerar samlingen av objekten.

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| Parameter | Beskrivning |
| --- | --- |
| T | Objekttypen. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Wrappa alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | RTTI-information. |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | Skapar en ny instans. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Ställ in n:te mallargumentet som en svag pekare (istället för delad). Tillåter att byta pekare i behållare till svagt läge. |

## Se även

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
