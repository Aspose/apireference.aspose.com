---
title: "System::WeakReference<> klasse"
linktitle: "WeakReference<>"
second_title: "Aspose.Page voor C++"
description: "System::WeakReference<> klasse. Vertegenwoordigt een zwakke referentie, die een object referereert terwijl dat object nog steeds kan worden verwijderd in C++."
type: docs
weight: 7800
url: /nl/cpp/system/weakreference__/
---
## WeakReference<> class


Stelt een zwakke referentie voor, die een object referereert terwijl dat object nog steeds kan worden verwijderd.

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | Geeft een indicatie of het object waarnaar wordt verwezen door het huidige [WeakReference](../weakreference/) object is verwijderd. |
| [get_Target](./get_target/)() const | Haalt het object (het doel) op waarnaar wordt verwezen door het huidige [WeakReference](../weakreference/) object. |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | Stelt het object (het doel) in waarnaar wordt verwezen door het huidige [WeakReference](../weakreference/) object. |
| [WeakReference](./weakreference/)() | Standaardconstructor. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Constructor van nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | Initialiseert een nieuw exemplaar van de [WeakReference](../weakreference/) klasse, die verwijst naar het opgegeven object. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | Initialiseert een nieuw exemplaar van de [WeakReference](../weakreference/) klasse, die verwijst naar het opgegeven object. |
## Zie ook

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
