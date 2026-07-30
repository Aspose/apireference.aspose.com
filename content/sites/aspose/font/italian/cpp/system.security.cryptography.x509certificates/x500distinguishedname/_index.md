---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName classe"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName classe. Rappresenta il nome distinto del certificato X509. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o utilizzando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


Rappresenta il nome distinto del certificato X509. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o utilizzando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | Decodifica il nome usando i parametri specificati dalle flag. |
| [Format](./format/)(bool) const override | Formatta il nome per la stampa. |
| [get_Name](./get_name/)() const | Ottiene il nome distinto del certificato. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | Informazioni RTTI. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | Costruttore. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | Costruttore. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | Costruttore di copia. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | Costruttore. |
## Vedi anche

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
