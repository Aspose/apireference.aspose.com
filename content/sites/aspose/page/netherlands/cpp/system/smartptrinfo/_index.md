---
title: "System::SmartPtrInfo klasse"
linktitle: "SmartPtrInfo"
second_title: "Aspose.Page voor C++"
description: "System::SmartPtrInfo klasse. Serviceklasse om de inhoud van SmartPtr te testen en te wijzigen zonder het uiteindelijke type te kennen. Wordt gebruikt voor garbage collection en detectie van lusreferenties, enz. Beschouw het als een ''pointer naar pointer''. We kunnen de basistype van SmartPtr niet gebruiken omdat die er niet is; in plaats daarvan gebruiken we deze ''info''-klasse in C++."
type: docs
weight: 5600
url: /nl/cpp/system/smartptrinfo/
---
## SmartPtrInfo class


Serviceklasse om de inhoud van [SmartPtr](../smartptr/)'s te testen en te wijzigen zonder het uiteindelijke type te kennen. Wordt gebruikt voor garbage collection en detectie van lusreferenties, enz. Beschouw het als een 'pointer naar pointer'. We kunnen de basistype van [SmartPtr](../smartptr/)'s niet gebruiken omdat die er niet is; in plaats daarvan gebruiken we deze 'info'-klasse.

```cpp
class SmartPtrInfo
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [getInternalPtr](./getinternalptr/)() const | Haalt het ruwe object op waar de verwijzende pointer naar wijst. |
| [getObject](./getobject/)() const | Haalt het object op waar de verwijzende pointer naar wijst. |
| [getOwned](./getowned/)() const | Haalt de door het object beheerde pointer op. |
| [operator bool](./operatorbool/)() const | Controleert of het info-object naar een niet-nul pointer wijst. |
| [operator!](./operator!/)() const | Controleert of het info-object niet naar een niet-nul pointer wijst. |
| [operator->](./operator-_/)() const | Staat toe methoden van [Object](../object/) aan te roepen die worden aangewezen door de verwijzende pointer. |
| [operator<](./operator_/)(const SmartPtrInfo\&) const | Voert een minder-dan vergelijking uit op de waarden van pointers die door twee info-objecten worden verwezen. |
| [SmartPtrInfo](./smartptrinfo/)() | Maakt een leeg [SmartPtrInfo](./)-object. |
| explicit [SmartPtrInfo](./smartptrinfo/)(const SmartPtr\<T\>\&) | Maakt een [SmartPtrInfo](./)-object aan met informatie over een specifieke smart pointer. |
## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
