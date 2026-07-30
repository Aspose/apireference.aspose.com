---
title: "System::IConvertible classe"
linktitle: "IConvertible"
second_title: "Aspose.Font per C++"
description: "classe System::IConvertible. Definisce metodi che convertono il valore del tipo di riferimento o valore implementante in un tipo del runtime del linguaggio comune che ha un valore equivalente. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3400
url: /it/cpp/system/iconvertible/
---
## IConvertible class


Definisce metodi che convertono il valore del tipo di riferimento o valore implementante in un tipo del runtime del linguaggio comune che ha un valore equivalente. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class IConvertible : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | Restituisce il codice tipo per questa istanza. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un valore [Boolean](../boolean/) equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un equivalente uint32_teger a 8 bit usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un carattere Unicode equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un [System::DateTime](../datetime/) equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un numero [System::Decimal](../decimal/) equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un numero a virgola mobile a doppia precisione equivalente usando le informazioni di formattazione specifiche della cultura specificata.. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un intero con segno a 16 bit equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un intero con segno a 32 bit equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un intero con segno a 64 bit equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un intero con segno a 8 bit equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un numero a virgola mobile a precisione singola equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un [System::String](../string/) equivalente usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToString](./tostring/)() const | Analogo del metodo C# [Object.ToString()](../object/tostring/). Consente di convertire oggetti personalizzati in stringa. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un [System::Object](../object/) del System::Type specificato che ha un valore equivalente, usando le informazioni di formattazione specifiche della cultura specificata. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un uint32_teger a 16 bit equivalente, utilizzando le informazioni di formattazione specifiche della cultura. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un uint32_teger a 32 bit equivalente, utilizzando le informazioni di formattazione specifiche della cultura. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un uint32_teger a 64 bit equivalente, utilizzando le informazioni di formattazione specifiche della cultura. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
