---
title: "System::Security::Cryptography::AsnEncodedData classe"
linktitle: "AsnEncodedData"
second_title: "Aspose.Font pour C++"
description: "classe System::Security::Cryptography::AsnEncodedData. Données encodées ASN.1. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 100
url: /fr/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


Données encodées ASN.1. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class AsnEncodedData : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | Informations RTTI. |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | Constructeur. |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | Constructeur. |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | Constructeur. |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | Copie les données d'un autre objet. |
| virtual [Format](./format/)(bool) const | Formate les données sous une forme lisible par l'homme. |
| [get_Oid](./get_oid/)() const | Obtient l'identifiant d'objet des données encodées. |
| [get_RawData](./get_rawdata/)() const | Obtient les données encodées brutes. |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | Définit l'identifiant d'objet des données encodées. |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | Définit les données encodées brutes. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
