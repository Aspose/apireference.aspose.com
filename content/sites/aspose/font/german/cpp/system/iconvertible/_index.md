---
title: "System::IConvertible Klasse"
linktitle: "IConvertible"
second_title: "Aspose.Font für C++"
description: "System::IConvertible Klasse. Definiert Methoden, die den Wert des implementierenden Referenz- oder Werttyps in einen Common Language Runtime-Typ konvertieren, der einen äquivalenten Wert hat. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3400
url: /de/cpp/system/iconvertible/
---
## IConvertible class


Definiert Methoden, die den Wert des implementierenden Referenz- oder Werttyps in einen Common Language Runtime-Typ konvertieren, der einen äquivalenten Wert hat. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class IConvertible : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | Gibt den Typcode für diese Instanz zurück. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in einen äquivalenten [Boolean](../boolean/)-Wert unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in einen äquivalenten 8‑Bit‑uint32_teger unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes Unicode‑Zeichen unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes [System::DateTime](../datetime/) unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in eine äquivalente [System::Decimal](../decimal/) Zahl unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in eine äquivalente double‑Präzisions‑Gleitkommazahl unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen.. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes 16‑Bit‑vorzeichenbehaftetes Integer unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes 32‑Bit‑vorzeichenbehaftetes Integer unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes 64‑Bit‑vorzeichenbehaftetes Integer unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes 8‑Bit‑vorzeichenbehaftetes Integer unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in eine äquivalente Gleitkommazahl mit einfacher Genauigkeit unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes [System::String](../string/) unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToString](./tostring/)() const | Analog zur C#-Methode [Object.ToString()](../object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein [System::Object](../object/) des angegebenen System::Type, das einen äquivalenten Wert hat, unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes 16‑Bit‑uint32_teger unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes 32‑Bit‑uint32_teger unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | Konvertiert den Wert dieser Instanz in ein äquivalentes 64‑Bit‑uint32_teger unter Verwendung der angegebenen kulturspezifischen Formatierungsinformationen. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
