---
title: "Classe System::Security::Cryptography::Pkcs::SignedCms"
linktitle: "SignedCms"
second_title: "Aspose.Font per C++"
description: "Classe System::Security::Cryptography::Pkcs::SignedCms. Firma il contenuto secondo lo standard CMS/PKCS #7. Non implementato. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


Firma il contenuto secondo lo standard CMS/PKCS #7. Non implementato. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SignedCms : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | Crea una firma. |
| [Encode](./encode/)() | Codifica un messaggio CMS/PKCS #7. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | Costruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Font for C++](../../)
