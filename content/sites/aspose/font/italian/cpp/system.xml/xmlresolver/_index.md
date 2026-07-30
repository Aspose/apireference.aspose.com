---
title: "System::Xml::XmlResolver classe"
linktitle: "XmlResolver"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlResolver classe. Risolve risorse XML esterne identificate da un Uniform Resource Identifier (URI) in C++."
type: docs
weight: 3500
url: /it/cpp/system.xml/xmlresolver/
---
## XmlResolver class


Risolvi le risorse XML esterne nominate da un Uniform Resource Identifier (URI).

```cpp
class XmlResolver : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetEntity](./getentity/)(SharedPtr\<Uri\>, String, const TypeInfo\&) | Quando sovrascritto in una classe derivata, mappa un URI a un oggetto che contiene la risorsa effettiva. |
| virtual [ResolveUri](./resolveuri/)(SharedPtr\<Uri\>, String) | Quando sovrascritto in una classe derivata, risolve l'URI assoluto a partire dall'URI base e da quelli relativi. |
| virtual [set_Credentials](./set_credentials/)(SharedPtr\<Net::ICredentials\>) | Quando sovrascritto in una classe derivata, imposta le credenziali utilizzate per autenticare le richieste web. |
| virtual [SupportsType](./supportstype/)(SharedPtr\<Uri\>, const TypeInfo\&) | Consente al resolver di restituire tipi diversi da Stream. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
