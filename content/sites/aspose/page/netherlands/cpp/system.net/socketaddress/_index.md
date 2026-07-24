---
title: "System::Net::SocketAddress class"
linktitle: "SocketAddress"
second_title: "Aspose.Page voor C++"
description: "System::Net::SocketAddress klasse. Gebruikt om geserialiseerde informatie over de EndPoint‑klasse‑instanties op te slaan. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3300
url: /nl/cpp/system.net/socketaddress/
---
## SocketAddress class


Gebruikt om geserialiseerde informatie over de [EndPoint](../endpoint/) klasse‑instanties op te slaan. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SocketAddress : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Family](./get_family/)() | RTTI-informatie. |
| [get_Size](./get_size/)() | Retourneert de onderliggende buffergrootte. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| [idx_get](./idx_get/)(int32_t) | Haalt een waarde op uit de onderliggende buffer op de opgegeven index. |
| [idx_set](./idx_set/)(int32_t, uint8_t) | Stelt een waarde in van de onderliggende buffer op de opgegeven index. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | Construeert een nieuw exemplaar. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | Construeert een nieuw exemplaar. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
