---
title: "System::Security::Cryptography::X509Certificates::X509ExtensionCollection classe"
linktitle: "X509ExtensionCollection"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::X509Certificates::X509ExtensionCollection classe. Collezione di oggetti di estensione. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1300
url: /it/cpp/system.security.cryptography.x509certificates/x509extensioncollection/
---
## X509ExtensionCollection class


Collezione di oggetti di estensione. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class X509ExtensionCollection : public System::Collections::Generic::List<SharedPtr<X509Extension>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [idx_get](./idx_get/)(const String\&) const | Accessor. Non implementato. |
| [idx_get](./idx_get/)(int) const override | Dati RTTI. |
| [X509ExtensionCollection](./x509extensioncollection/)() | Costruisce una collezione vuota. |
## Vedi anche

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
