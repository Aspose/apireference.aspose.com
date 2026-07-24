---
title: "System::Security::Cryptography::Pkcs::SignedCms classe"
linktitle: "SignedCms"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::Pkcs::SignedCms classe. Firma il contenuto secondo lo standard CMS/PKCS #7. Non implementato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


Firma il contenuto secondo lo standard CMS/PKCS #7. Non implementato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class SignedCms : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | Crea una firma. |
| [Encode](./encode/)() | Codifica il messaggio CMS/PKCS #7. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | Costruttore. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
