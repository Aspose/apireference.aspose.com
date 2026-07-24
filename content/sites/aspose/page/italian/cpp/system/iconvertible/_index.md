---
title: "classe System::IConvertible"
linktitle: "IConvertible"
second_title: "Aspose.Page per C++"
description: "Classe System::IConvertible. Definisce metodi che convertono il valore del tipo di riferimento o valore implementato in un tipo di runtime del linguaggio comune che ha un valore equivalente. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 3400
url: /it/cpp/system/iconvertible/
---
## IConvertible class


Definisce metodi che convertono il valore del tipo di riferimento o valore implementato in un tipo di runtime del linguaggio comune che ha un valore equivalente. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class IConvertible : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | Restituisce il codice tipo per questa istanza. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un valore [Boolean](../boolean/) equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un intero uint32_teger a 8 bit equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un carattere Unicode equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un [System::DateTime](../datetime/) equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un numero [System::Decimal](../decimal/) equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un numero a virgola mobile a doppia precisione equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un intero con segno a 16 bit equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un intero con segno a 32 bit equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un intero con segno a 64 bit equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un intero con segno a 8 bit equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un numero a virgola mobile a precisione singola equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un [System::String](../string/) equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToString](./tostring/)() const | Analogo del metodo C# [Object.ToString()](../object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un [System::Object](../object/) del System::Type specificato che ha un valore equivalente, utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un uint32_teger a 16 bit equivalente utilizzando le informazioni di formattazione specifiche della cultura indicate. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un uint32_teger a 32 bit equivalente utilizzando le informazioni di formattazione specifiche della cultura. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | Converte il valore di questa istanza in un uint32_teger a 64 bit equivalente utilizzando le informazioni di formattazione specifiche della cultura. |
## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
