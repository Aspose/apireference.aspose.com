---
title: "System::Security::Cryptography::Pkcs::CmsSigner classe"
linktitle: "CmsSigner"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::Pkcs::CmsSigner classe. Fornisce un'API per firmare oggetti usando CMS. Non firma gli oggetti da solo, usa la classe SignedCMS per farlo. Non implementato. Gli oggetti di questa classe devono essere allocati solo tramite la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


Fornisce un'API per firmare oggetti usando CMS. Non firma gli oggetti da solo, usa la classe SignedCMS per farlo. Non implementato. Gli oggetti di questa classe devono essere allocati solo tramite la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class CmsSigner : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | Inizializza il firmatario con il certificato X509. |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | Ottiene l'algoritmo di hash usato con la firma. |
| [get_IncludeOption](./get_includeoption/)() const | Verifica quali certificati della catena saranno inclusi nella firma. |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | Imposta l'algoritmo di hash usato con la firma. |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | Specifica quali certificati della catena saranno inclusi nella firma. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Font for C++](../../)
