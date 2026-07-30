---
title: "System::ComponentModel::TypeConverter class"
linktitle: "TypeConverter"
second_title: "Aspose.Font für C++"
description: "System::ComponentModel::TypeConverter class. Klasse, die die Typkonvertierung im Komponentenmodell übernimmt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1400
url: /de/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


Klasse, die die Typkonvertierung im Komponentenmodell übernimmt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TypeConverter : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | Konvertiert Objekte. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Konvertiert Objekte. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Konvertiert Zeichenkette in Objekt. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | Konvertiert einen invariant-String in ein Objekt. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Konvertiert einen invariant-String in ein Objekt. |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | Konvertiert Zeichenkette in Objekt. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | Konvertiert Zeichenkette in Objekt. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | Konvertiert Zeichenkette in Objekt. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Konvertiert ein Objekt in einen spezifischen Typ. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Konvertiert ein Objekt in einen spezifischen Typ. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | Konvertiert ein Objekt in einen invariant-String. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Konvertiert ein Objekt in einen invariant-String. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | Konvertiert ein Objekt in einen String. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | Konvertiert ein Objekt in einen String. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | Konvertiert ein Objekt in einen String. |
| [TypeConverter](./typeconverter/)() | RTTI-Informationen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
